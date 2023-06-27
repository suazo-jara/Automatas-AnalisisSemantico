package MAIN;

import java.util.*;

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

	// Print
	@Override
	public Integer visitImpresion(ParserTParser.ImpresionContext ctx){
		return 0;
	}

	// Input
	@Override
	public Integer visitLectura(ParserTParser.LecturaContext ctx){
		return 0;
	}

	// Operaciones matemáticas
	@Override
	public Integer visitSuma(ParserTParser.SumaContext ctx){
		return 0;
	}
	
	@Override
	public Integer visitResta(ParserTParser.RestaContext ctx){
		return 0;
	}

	@Override
	public Integer visitMultiplicacion(ParserTParser.MultiplicacionContext ctx){
		return 0;
	}

	@Override
	public Integer visitDivision(ParserTParser.DivisionContext ctx){
		return 0;
	}

	// Funciones matemáticas
	@Override
	public Integer visitExp(ParserTParser.ExpContext ctx){
		return 0;
	}

	@Override
	public Integer visitCos(ParserTParser.CosContext ctx){
		return 0;
	}

	@Override
	public Integer visitSqrt(ParserTParser.SqrtContext ctx){
		return 0;
	}

	// Todas las operaciones y funciones matemáticas
	@Override
	public Integer visitOperacion(ParserTParser.OperacionContext ctx){
		return 0;
	}

	// Sentencia lógica
	@Override
	public Integer visitSenlogica(ParserTParser.SenlogicaContext ctx){
		return 0;
	}

	// Afirmación lógica
	@Override
	public Integer visitAfirmacion(ParserTParser.AfirmacionContext ctx){
		return 0;
	}

	// Operaciones lógicas
	@Override
	public Integer visitMayor(ParserTParser.MayorContext ctx){
		return 0;
	}

	@Override
	public Integer visitMenor(ParserTParser.MenorContext ctx){
		return 0;
	}

	@Override
	public Integer visitIgual(ParserTParser.IgualContext ctx){
		return 0;
	}

	@Override
	public Integer visitDistinto(ParserTParser.DistintoContext ctx){
		return 0;
	}

	// Ciclos
	@Override
	public Integer visitCiclo(ParserTParser.CicloContext ctx){
		return 0;
	}

	@Override
	public Integer visitSi(ParserTParser.SiContext ctx){
		return 0;
	}

	@Override
	public Integer visitMientras(ParserTParser.MientrasContext ctx){
		return 0;
	}

	@Override
	public Integer visitHacermientras(ParserTParser.HacermientrasContext ctx){
		return 0;
	}

	// Otras definiciones
	@Override
	public Integer visitDistancia(ParserTParser.DistanciaContext ctx){
		return 0;
	}

	@Override
	public Integer visitSentido(ParserTParser.SentidoContext ctx){
		return 0;
	}

	@Override
	public Integer visitOrden(ParserTParser.OrdenContext ctx){
		return 0;
	}

	@Override
	public Integer visitOperador(ParserTParser.OperadorContext ctx){
		return 0;
	}
}
