package MAIN;

import java.util.*;

import javax.print.event.PrintEvent;

import java.lang.Math;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import ANTLR.LexerT;
import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTParser;
import ANTLR.ParserTParser.OperacionContext;
import ANTLR.ParserTParser.FuncionContext;
import ANTLR.ParserTParser.InstruccionesContext;

public class MyVisitor extends ParserTBaseVisitor<Integer> {

	public String tokenName(Object nodo) {
		if (nodo instanceof TerminalNodeImpl) {
			TerminalNodeImpl nodoTerminal = ((TerminalNodeImpl) nodo);
			return LexerT.VOCABULARY.getSymbolicName(nodoTerminal.getSymbol().getType());
		}
		RuleContext nodoTerminal = (RuleContext) nodo;
		String nombre = nodoTerminal.getClass().getSimpleName();
		return nombre.substring(0, nombre.length() - 7);
	}

	Map<String, String> variables = new HashMap<String, String>();
	// Declaración
	@Override
	public Integer visitDeclaracion(ParserTParser.DeclaracionContext ctx) {
		System.out.println("\nDECLARACIÓN:");	
		// Obtenemos las variables
		String varname = ctx.getChild(0).getText();
		String value = ctx.getChild(2).getText();

		// Las ponemos en el diccionario
		variables.put(varname, value);
		System.out.println(varname + " es " + value);

		return visitChildren(ctx);
	}

	// Print
	@Override
	public Integer visitImpresion(ParserTParser.ImpresionContext ctx){
		System.out.println("\nIMPRESION:");
		// Obtenemos lo que se necesita del print
		String impresion = ctx.getChild(2).getText();

		// Comrpobamos el caso en el que sea un VARNAME, porque se debe comportar distinto.
		// Cuidado que para comparar Strings en Java es recomendable usar el metodo .equals()
		if (tokenName(ctx.getChild(2)).equals("VARNAME")) {
			impresion = variables.get(impresion);
		}
			System.out.println(impresion);
		return visitChildren(ctx);
	}

	// Input
		@Override
	public Integer visitLectura(ParserTParser.LecturaContext ctx) {
		System.out.println("\nLECTURA:");
		String variableObjetivo = ctx.getChild(0).getText();
		String lectura = ctx.getChild(4).getText();

		// Input debe guardar valores en variables
		if (tokenName(ctx.getChild(4)).equals("VARNAME")) {
			lectura = variables.get(lectura);
			System.out.println(lectura);
		}

		float variableConLectura = Float.parseFloat(lectura);

		variables.put(variableObjetivo, Float.toString(variableConLectura));
		System.out.println(lectura);
		
		return visitChildren(ctx);
	}

	// Operaciones matemáticas
	@Override
	public Integer visitSuma(ParserTParser.SumaContext ctx){
		System.out.println("\nSUMA:");
		// Obtenemos las variables
		String variableObjetivo = ctx.getChild(0).getText();
		String sumaIzquierda = ctx.getChild(3).getText();
		String sumaDerecha = ctx.getChild(5).getText();

		// Cuidado que para comparar Strings en Java es recomendable usar el metodo .equals()
		if (tokenName(ctx.getChild(3)).equals("VARNAME")) {
			sumaIzquierda = variables.get(sumaIzquierda);
			//System.out.println(sumaIzquierda);
		}
		// Cuidado que para comparar Strings en Java es recomendable usar el metodo .equals()
		if (tokenName(ctx.getChild(5)).equals("VARNAME")) {
			sumaDerecha = variables.get(sumaDerecha);
			//System.out.println(sumaDerecha);
		}

		float suma = Float.parseFloat(sumaIzquierda) + Float.parseFloat(sumaDerecha);

		variables.put(variableObjetivo, Float.toString(suma));

		System.out.println(variableObjetivo + " = " + sumaIzquierda + " + " + sumaDerecha + " = " + suma);
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitResta(ParserTParser.RestaContext ctx){
		System.out.println("\nRESTA:");
		// Obtenemos las variables
		String variableObjetivo = ctx.getChild(0).getText();
		String restaIzquierda = ctx.getChild(3).getText();
		String restaDerecha = ctx.getChild(5).getText();

		
		if (tokenName(ctx.getChild(3)).equals("VARNAME")) {
			restaIzquierda = variables.get(restaIzquierda);
			//System.out.println(restaIzquierda);
		}
		
		if (tokenName(ctx.getChild(5)).equals("VARNAME")) {
			restaDerecha = variables.get(restaDerecha);
			//System.out.println(restaDerecha);
		}

		float resta = Float.parseFloat(restaIzquierda) - Float.parseFloat(restaDerecha);

		variables.put(variableObjetivo, Float.toString(resta));

		System.out.println(restaIzquierda + " - " + restaDerecha + " = " + resta);
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMultiplicacion(ParserTParser.MultiplicacionContext ctx){
		System.out.println("\nMULTIPLICACIÓN:");
		// Obtenemos las variables
		String variableObjetivo = ctx.getChild(0).getText();
		String factorIzquierda = ctx.getChild(3).getText();
		String factorDerecha = ctx.getChild(5).getText();

		if (tokenName(ctx.getChild(3)).equals("VARNAME")) {
			factorIzquierda = variables.get(factorIzquierda);
			//System.out.println(factorIzquierda);
		}

		if (tokenName(ctx.getChild(5)).equals("VARNAME")) {
			factorDerecha = variables.get(factorDerecha);
			//System.out.println(factorDerecha);
		}

		float producto = Float.parseFloat(factorIzquierda) * Float.parseFloat(factorDerecha);

		variables.put(variableObjetivo, Float.toString(producto));

		System.out.println(factorIzquierda + " * " + factorDerecha + " = " + producto);
		return visitChildren(ctx);
	}

	@Override
	public Integer visitDivision(ParserTParser.DivisionContext ctx){
		System.out.println("\nDIVISIÓN:");
		// Obtenemos las variables
		String variableObjetivo = ctx.getChild(0).getText();
		String dividendo = ctx.getChild(3).getText();
		String divisor = ctx.getChild(5).getText();

		if (tokenName(ctx.getChild(3)).equals("VARNAME")) {
			dividendo = variables.get(dividendo);
			//System.out.println(dividendo);
		}
		
		if (tokenName(ctx.getChild(5)).equals("VARNAME")) {
			divisor = variables.get(divisor);
			//System.out.println(divisor);
		}

		float cociente = Float.parseFloat(dividendo) * Float.parseFloat(divisor);

		variables.put(variableObjetivo, Float.toString(cociente));

		System.out.println(dividendo + " / " + divisor + " = " + cociente);
		return visitChildren(ctx);
	}


	// Funciones matemáticas
	@Override
	public Integer visitExp(ParserTParser.ExpContext ctx){
		System.out.println("\nEXPONENCIAL:");
		// Obtenemos las variables
		String variableObjetivo = ctx.getChild(0).getText();
		String potencia = ctx.getChild(3).getText();

		if (tokenName(ctx.getChild(3)).equals("VARNAME")) {
			potencia = variables.get(potencia);
			//System.out.println(potencia);
		}

		double resultado = Math.exp(Float.parseFloat(potencia));

		variables.put(variableObjetivo, Double.toString(resultado));

		System.out.println("exp" + "(" + potencia + ") = " + resultado);
		return visitChildren(ctx);
	}

	@Override
	public Integer visitCos(ParserTParser.CosContext ctx){
		System.out.println("\nCOSENO:");
		String variableObjetivo = ctx.getChild(0).getText();
		String angulo = ctx.getChild(3).getText();

		if (tokenName(ctx.getChild(3)).equals("VARNAME")) {
			angulo = variables.get(angulo);
			//System.out.println(angulo);
		}

		double resultado = Math.cos(Float.parseFloat(angulo));

		variables.put(variableObjetivo, Double.toString(resultado));

		System.out.println("cos" + "(" + angulo + ") = " + resultado);
		return visitChildren(ctx);
	}

	@Override
	public Integer visitSqrt(ParserTParser.SqrtContext ctx){
		System.out.println("\nSQRT:");
		String variableObjetivo = ctx.getChild(0).getText();
		String base = ctx.getChild(3).getText();

		if (tokenName(ctx.getChild(3)).equals("VARNAME")) {
			base = variables.get(base);
			//System.out.println(base);
		}

		double resultado = Math.sqrt(Float.parseFloat(base));

		variables.put(variableObjetivo, Double.toString(resultado));

		System.out.println("sqrt" + "(" + base + ") = " + resultado);
		return visitChildren(ctx);
	}

	// Todas las operaciones y funciones matemáticas
	@Override
	public Integer visitOperacion(ParserTParser.OperacionContext ctx){
		// NO MODIFICAR
		return visitChildren(ctx);
	}

// 	// Sentencia lógica
// 	@Override
// 	public Integer visitSenlogica(ParserTParser.SenlogicaContext ctx){
// 		return 0;
// 	}

	// Afirmación lógica
	@Override
	public Integer visitAfirmacion(ParserTParser.AfirmacionContext ctx){
		// NO MODIFICAR
		return visitChildren(ctx);
	}

	// Operaciones lógicas
	@Override
	public Integer visitMayor(ParserTParser.MayorContext ctx) {
		System.out.println("\nMAYOR:");
		String value1 = ctx.getChild(0).getText();
		String value2 = ctx.getChild(3).getText();

		System.out.println(tokenName(ctx.getChild(0)) + " y " + tokenName(ctx.getChild(3)));

		if (tokenName(ctx.getChild(0)).equals("VARNAME")) {
			value1 = variables.get(value1);
		}

		if (tokenName(ctx.getChild(3)).equals("VARNAME")) {
			value2 = variables.get(value2);
		}

		System.out.println(value1 + " > " + value2);
		if ((Float.parseFloat(value1)) > Float.parseFloat(value2)) {
			System.out.println("La condición es verdadera");
		} else {
			System.out.println("La condición es falsa");
		}
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMenor(ParserTParser.MenorContext ctx) {
		System.out.println("\nMENOR:");
		String value1 = ctx.getChild(0).getText();
		String value2 = ctx.getChild(3).getText();

		System.out.println(tokenName(ctx.getChild(0)) + " y " + tokenName(ctx.getChild(3)));

		if (tokenName(ctx.getChild(0)).equals("VARNAME")) {
			value1 = variables.get(value1);
		}

		if (tokenName(ctx.getChild(3)).equals("VARNAME")) {
			value2 = variables.get(value2);
		}

		System.out.println(value1 + " < " + value2);
		if ((Float.parseFloat(value1)) < Float.parseFloat(value2)) {
			System.out.println("La condición es verdadera");
		} else {
			System.out.println("La condición es falsa");
		}
		return visitChildren(ctx);
	}

	@Override
	public Integer visitIgual(ParserTParser.IgualContext ctx) {
		System.out.println("\nIGUAL:");
		String value1 = ctx.getChild(0).getText();
		String value2 = ctx.getChild(3).getText();

		System.out.println(tokenName(ctx.getChild(0)) + " y " + tokenName(ctx.getChild(3)));

		if (tokenName(ctx.getChild(0)).equals("VARNAME")) {
			value1 = variables.get(value1);
		}

		if (tokenName(ctx.getChild(3)).equals("VARNAME")) {
			value2 = variables.get(value2);
		}

		System.out.println(value1 + " == " + value2);
		if ((Float.parseFloat(value1)) == Float.parseFloat(value2)) {
			System.out.println("La condición es verdadera");
		} else {
			System.out.println("La condición es falsa");
		}
		return visitChildren(ctx);
	}

	@Override
	public Integer visitDistinto(ParserTParser.DistintoContext ctx) {
		System.out.println("\nDISTINTO:");
		String value1 = ctx.getChild(0).getText();
		String value2 = ctx.getChild(3).getText();

		System.out.println(tokenName(ctx.getChild(0)) + " y " + tokenName(ctx.getChild(3)));

		if (tokenName(ctx.getChild(0)).equals("VARNAME")) {
			value1 = variables.get(value1);
		}

		if (tokenName(ctx.getChild(3)).equals("VARNAME")) {
			value2 = variables.get(value2);
		}

		System.out.println(value1 + " != " + value2);
		if ((Float.parseFloat(value1)) != Float.parseFloat(value2)) {
			System.out.println("La condición es verdadera");
		} else {
			System.out.println("La condición es falsa");
		}
		return visitChildren(ctx);
	}

	public Integer visitSenlogica(ParserTParser.SenlogicaContext ctx){
		System.out.println("\nSENTENCIA LÓGICA:");
		String afirmSentencia;
		//System.out.println(ctx.getChild(0).getChild(0).getChild(1).getText());
		//System.out.println("Sentencia : " + ctx.getChild(0).getText() + " < " + ctx.getChild(2).getText());
		System.out.println("Cantidad de afirmaciones en la sentencia: " + (ctx.getChildCount()/3 + 1));
		for (int i = 0, j = 1; i < ctx.getChildCount(); i += 2, j++){
			afirmSentencia = ctx.getChild(i).getChild(0).getChild(0).getText() + " " + ctx.getChild(i).getChild(0).getChild(1).getText() + " " + ctx.getChild(i).getChild(0).getChild(2).getText() + " " + ctx.getChild(i).getChild(0).getChild(3).getText() + " " + ctx.getChild(i).getChild(0).getChild(4).getText(); 
			System.out.println(j + "a " + tokenName(ctx.getChild(i)) + ": " + afirmSentencia);
		}
		return visitChildren(ctx);
	}

	// Ciclos
	@Override
	public Integer visitCiclo(ParserTParser.CicloContext ctx){
		// NO MODIFICAR
		return visitChildren(ctx);
	}

	@Override
	public Integer visitSi(ParserTParser.SiContext ctx){
		System.out.println("\nCICLO SI:");
		// Guardamos la afirmación para poder hacerle los cambios de ser necesarios
		// (aquí no lo fue, es un "True" o "False")
		String var1 = ctx.getChild(1).getChild(0).getChild(0).getChild(0).getText();
		String var2 = ctx.getChild(1).getChild(0).getChild(0).getChild(3).getText();
		boolean afirm = true;

		System.out.println(var1 + " " + ctx.getChild(1).getChild(0).getChild(0).getChild(1).getText() + " que " + var2); 

		if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(0)).equals("VARNAME")) {
			var1 = variables.get(var1);
		}
		if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(3)).equals("VARNAME")) {
			var2 = variables.get(var2);
		}

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)));
		if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)).equals("MAYOR")){
			afirm = Float.parseFloat(var1) > Float.parseFloat(var2);
		}
		if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)).equals("MENOR")){
			afirm = Float.parseFloat(var1) < Float.parseFloat(var2);
		}
		if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)).equals("EQUAL")){
			afirm = Float.parseFloat(var1) == Float.parseFloat(var2);
		}
		if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)).equals("NOTEQUAL")){
			afirm = Float.parseFloat(var1) != Float.parseFloat(var2);
		}

		List<Object> lista = new ArrayList<>();
		for (int i = 0; i < ctx.getChildCount(); i++) {
			// Cuidado que para comparar Strings en Java es recomendable usar el metodo .equals()
			if (tokenName(ctx.getChild(i)).equals("Instrucciones")){
				lista.add(ctx.getChild(i));
				//System.out.println("INSTRUCCIÓN DENTRO DE IF N." + i + " " + ctx.getChild(i).getText());
			}
		}

		if (afirm) {
			System.out.println(afirm);

			for (Object statement : lista) {
				visitInstrucciones((InstruccionesContext) statement);
			}
		}
		return 0;
	}

	@Override
	public Integer visitMientras(ParserTParser.MientrasContext ctx) {
		System.out.println("\nCICLO MIENTRAS:");

		String var1 = ctx.getChild(1).getChild(0).getChild(0).getChild(0).getText();
		String var2 = ctx.getChild(1).getChild(0).getChild(0).getChild(3).getText();
		boolean afirm = true;

		System.out.println(var1 + " " + ctx.getChild(1).getChild(0).getChild(0).getChild(1).getText() + " que " + var2);

		if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(0)).equals("VARNAME")) {
			var1 = variables.get(var1);
		}
		if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(3)).equals("VARNAME")) {
			var2 = variables.get(var2);
		}

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)));

		if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)).equals("MAYOR")) {
			afirm = Float.parseFloat(var1) > Float.parseFloat(var2);
		}
		if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)).equals("MENOR")) {
			afirm = Float.parseFloat(var1) < Float.parseFloat(var2);
		}
		if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)).equals("EQUAL")) {
			afirm = Float.parseFloat(var1) == Float.parseFloat(var2);
		}
		if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)).equals("NOTEQUAL")) {
			afirm = Float.parseFloat(var1) != Float.parseFloat(var2);
		}

		while (afirm) {
			List<Object> lista = new ArrayList<>();
			for (int i = 0; i < ctx.getChildCount(); i++) {
				if (tokenName(ctx.getChild(i)).equals("Instrucciones")) {
					lista.add(ctx.getChild(i));
				}
			}

			for (Object statement : lista) {
				visitInstrucciones((InstruccionesContext) statement);
			}

			// Reevaluar la condición para determinar si se debe continuar con el bucle
			var1 = ctx.getChild(1).getChild(0).getChild(0).getChild(0).getText();
			var2 = ctx.getChild(1).getChild(0).getChild(0).getChild(3).getText();

			if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(0)).equals("VARNAME")) {
				var1 = variables.get(var1);
			}
			if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(3)).equals("VARNAME")) {
				var2 = variables.get(var2);
			}

			if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)).equals("MAYOR")) {
				afirm = Float.parseFloat(var1) > Float.parseFloat(var2);
			}
			if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)).equals("MENOR")) {
			afirm = Float.parseFloat(var1) < Float.parseFloat(var2);
			}
			if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)).equals("EQUAL")) {
				afirm = Float.parseFloat(var1) == Float.parseFloat(var2);
			}
			if (tokenName(ctx.getChild(1).getChild(0).getChild(0).getChild(1)).equals("NOTEQUAL")) {
				afirm = Float.parseFloat(var1) != Float.parseFloat(var2);
			}
		}
		System.out.println("FIN DEL CICLO MIENTRAS");

		return 0;
	}

	@Override
	public Integer visitHacermientras(ParserTParser.HacermientrasContext ctx){
		return visitChildren(ctx);
	}
}

// 	// Otras definiciones
// 	@Override
// 	public Integer visitDistancia(ParserTParser.DistanciaContext ctx){
// 		return 0;
// 	}

// 	@Override
// 	public Integer visitSentido(ParserTParser.SentidoContext ctx){
// 		return 0;
// 	}

// 	@Override
// 	public Integer visitOrden(ParserTParser.OrdenContext ctx){
// 		return 0;
// 	}

// 	@Override
// 	public Integer visitOperador(ParserTParser.OperadorContext ctx){
// 		return 0;
// 	}
// }
