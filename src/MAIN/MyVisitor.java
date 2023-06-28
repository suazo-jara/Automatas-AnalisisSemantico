package MAIN;

import java.util.*;
import java.lang.Math;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import ANTLR.LexerT;
import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTParser;
import ANTLR.ParserTParser.OperacionContext;
import ANTLR.ParserTParser.FuncionContext;

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
		// Obtenemos las variables
		String varname = ctx.getChild(0).getText();
		String value = ctx.getChild(2).getText();

		// Las ponemos en el diccionario
		variables.put(varname, value);
		System.out.println(varname + " es " + value);

		return visitChildren(ctx);
	}

	// // Print
	// @Override
	// public Integer visitImpresion(ParserTParser.ImpresionContext ctx){
	// 	return 0;
	// }

	// // Input
	// @Override
	// public Integer visitLectura(ParserTParser.LecturaContext ctx){
	// 	return 0;
	// }

	// Operaciones matemáticas
	@Override
	public Integer visitSuma(ParserTParser.SumaContext ctx){
		// Obtenemos las variables
		String variableObjetivo = ctx.getChild(0).getText();
		String sumaIzquierda = ctx.getChild(3).getText();
		String sumaDerecha = ctx.getChild(5).getText();

		// // Si el sumando izquierdo es una variable, se obtiene su valor en el mapa variables
		// if (tokenName(ctx.getChild(3)).equals("VARNAME")) {
		// 	sumaIzquierda = variables.get(sumaIzquierda);
		// 	System.out.println(sumaIzquierda);
		// }
		// // Si el sumando derecho es una variable, se obtiene su valor en el mapa variables
		// if (tokenName(ctx.getChild(5)).equals("VARNAME")) {
		// 	sumaDerecha = variables.get(sumaDerecha);
		// 	System.out.println(sumaDerecha);
		// }

		float suma = Float.parseFloat(sumaIzquierda) + Float.parseFloat(sumaDerecha);

		variables.put(variableObjetivo, Float.toString(suma));

		System.out.println(sumaIzquierda + " + " + sumaDerecha + " = " + suma);
		return visitChildren(ctx);
	}
	
	@Override
	public Integer visitResta(ParserTParser.RestaContext ctx){
		// Obtenemos las variables
		String variableObjetivo = ctx.getChild(0).getText();
		String restaIzquierda = ctx.getChild(3).getText();
		String restaDerecha = ctx.getChild(5).getText();

		float resta = Float.parseFloat(restaIzquierda) - Float.parseFloat(restaDerecha);

		variables.put(variableObjetivo, Float.toString(resta));

		System.out.println(restaIzquierda + " - " + restaDerecha + " = " + resta);
		return visitChildren(ctx);
	}

	@Override
	public Integer visitMultiplicacion(ParserTParser.MultiplicacionContext ctx){
		// Obtenemos las variables
		String variableObjetivo = ctx.getChild(0).getText();
		String factorIzquierda = ctx.getChild(3).getText();
		String factorDerecha = ctx.getChild(5).getText();

		float producto = Float.parseFloat(factorIzquierda) * Float.parseFloat(factorDerecha);

		variables.put(variableObjetivo, Float.toString(producto));

		System.out.println(factorIzquierda + " * " + factorDerecha + " = " + producto);
		return visitChildren(ctx);
	}

	@Override
	public Integer visitDivision(ParserTParser.DivisionContext ctx){
		// Obtenemos las variables
		String variableObjetivo = ctx.getChild(0).getText();
		String dividendo = ctx.getChild(3).getText();
		String divisor = ctx.getChild(5).getText();

		float cociente = Float.parseFloat(dividendo) * Float.parseFloat(divisor);

		variables.put(variableObjetivo, Float.toString(cociente));

		System.out.println(dividendo + " / " + divisor + " = " + cociente);
		return visitChildren(ctx);
	}


	// Funciones matemáticas
	@Override
	public Integer visitExp(ParserTParser.ExpContext ctx){
		// Obtenemos las variables
		//String variableObjetivo = ctx.getChild(0).getText();
		String potencia = ctx.getChild(1).getText();

		double resultado = Math.exp(Float.parseFloat(potencia));

		//variables.put(variableObjetivo, Double.toString(resultado));

		System.out.println("exp" + "(" + potencia + ") = " + resultado);
		return visitChildren(ctx);
	}

	@Override
	public Integer visitCos(ParserTParser.CosContext ctx){
		//String variableObjetivo = ctx.getChild(0).getText();
		String angulo = ctx.getChild(1).getText();

		double resultado = Math.cos(Float.parseFloat(angulo));

		//variables.put(variableObjetivo, Double.toString(resultado));

		System.out.println("cos" + "(" + angulo + ") = " + resultado);
		return visitChildren(ctx);
	}

	@Override
	public Integer visitSqrt(ParserTParser.SqrtContext ctx){
		//String variableObjetivo = ctx.getChild(0).getText();
		String base = ctx.getChild(1).getText();

		double resultado = Math.sqrt(Float.parseFloat(base));

		//variables.put(variableObjetivo, Double.toString(resultado));

		System.out.println("sqrt" + "(" + base + ") = " + resultado);
		return visitChildren(ctx);
	}

	// Todas las operaciones y funciones matemáticas
	@Override
	public Integer visitOperacion(ParserTParser.OperacionContext ctx){
		// NO MODIFICAR
		return visitChildren(ctx);
	}
}

// 	// Sentencia lógica
// 	@Override
// 	public Integer visitSenlogica(ParserTParser.SenlogicaContext ctx){
// 		return 0;
// 	}

// 	// Afirmación lógica
// 	@Override
// 	public Integer visitAfirmacion(ParserTParser.AfirmacionContext ctx){
// 		return 0;
// 	}

// 	// Operaciones lógicas
// 	@Override
// 	public Integer visitMayor(ParserTParser.MayorContext ctx){
// 		return 0;
// 	}

// 	@Override
// 	public Integer visitMenor(ParserTParser.MenorContext ctx){
// 		return 0;
// 	}

// 	@Override
// 	public Integer visitIgual(ParserTParser.IgualContext ctx){
// 		return 0;
// 	}

// 	@Override
// 	public Integer visitDistinto(ParserTParser.DistintoContext ctx){
// 		return 0;
// 	}

// 	// Ciclos
// 	@Override
// 	public Integer visitCiclo(ParserTParser.CicloContext ctx){
// 		return 0;
// 	}

// 	@Override
// 	public Integer visitSi(ParserTParser.SiContext ctx){
// 		return 0;
// 	}

// 	@Override
// 	public Integer visitMientras(ParserTParser.MientrasContext ctx){
// 		return 0;
// 	}

// 	@Override
// 	public Integer visitHacermientras(ParserTParser.HacermientrasContext ctx){
// 		return 0;
// 	}

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
