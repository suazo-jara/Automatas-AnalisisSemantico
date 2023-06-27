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

	public Integer visitSuma(ParserTParser.SumaContext ctx){
		return 0;
	}

	public Integer visitResta(ParserTParser.RestaContext ctx){
		return 0;
	}

	public Integer visitMultiplicacion(ParserTParser.MultiplicacionContext ctx){
		return 0;
	}

	public Integer visitDivision(ParserTParser.DivisionContext ctx){
		return 0;
	}

	public Integer visitExp(ParserTParser.ExpContext ctx){
		return 0;
	}

	public Integer visitCos(ParserTParser.CosContext ctx){
		return 0;
	}

	public Integer visitSqrt(ParserTParser.SqrtContext ctx){
		return 0;
	}
}
