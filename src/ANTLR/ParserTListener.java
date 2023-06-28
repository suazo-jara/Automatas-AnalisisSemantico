package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserTParser}.
 */
public interface ParserTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserTParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(@NotNull ParserTParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(@NotNull ParserTParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(@NotNull ParserTParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(@NotNull ParserTParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#senlogica}.
	 * @param ctx the parse tree
	 */
	void enterSenlogica(@NotNull ParserTParser.SenlogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#senlogica}.
	 * @param ctx the parse tree
	 */
	void exitSenlogica(@NotNull ParserTParser.SenlogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 */
	void enterCos(@NotNull ParserTParser.CosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 */
	void exitCos(@NotNull ParserTParser.CosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(@NotNull ParserTParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(@NotNull ParserTParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(@NotNull ParserTParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(@NotNull ParserTParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(@NotNull ParserTParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(@NotNull ParserTParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(@NotNull ParserTParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(@NotNull ParserTParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void enterSqrt(@NotNull ParserTParser.SqrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void exitSqrt(@NotNull ParserTParser.SqrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#sentido}.
	 * @param ctx the parse tree
	 */
	void enterSentido(@NotNull ParserTParser.SentidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#sentido}.
	 * @param ctx the parse tree
	 */
	void exitSentido(@NotNull ParserTParser.SentidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(@NotNull ParserTParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(@NotNull ParserTParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#menor}.
	 * @param ctx the parse tree
	 */
	void enterMenor(@NotNull ParserTParser.MenorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#menor}.
	 * @param ctx the parse tree
	 */
	void exitMenor(@NotNull ParserTParser.MenorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#afirmacion}.
	 * @param ctx the parse tree
	 */
	void enterAfirmacion(@NotNull ParserTParser.AfirmacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#afirmacion}.
	 * @param ctx the parse tree
	 */
	void exitAfirmacion(@NotNull ParserTParser.AfirmacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(@NotNull ParserTParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(@NotNull ParserTParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#orden}.
	 * @param ctx the parse tree
	 */
	void enterOrden(@NotNull ParserTParser.OrdenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#orden}.
	 * @param ctx the parse tree
	 */
	void exitOrden(@NotNull ParserTParser.OrdenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(@NotNull ParserTParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(@NotNull ParserTParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull ParserTParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull ParserTParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 */
	void enterLectura(@NotNull ParserTParser.LecturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 */
	void exitLectura(@NotNull ParserTParser.LecturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacion(@NotNull ParserTParser.MultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacion(@NotNull ParserTParser.MultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(@NotNull ParserTParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(@NotNull ParserTParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mayor}.
	 * @param ctx the parse tree
	 */
	void enterMayor(@NotNull ParserTParser.MayorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mayor}.
	 * @param ctx the parse tree
	 */
	void exitMayor(@NotNull ParserTParser.MayorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#distinto}.
	 * @param ctx the parse tree
	 */
	void enterDistinto(@NotNull ParserTParser.DistintoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#distinto}.
	 * @param ctx the parse tree
	 */
	void exitDistinto(@NotNull ParserTParser.DistintoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#hacermientras}.
	 * @param ctx the parse tree
	 */
	void enterHacermientras(@NotNull ParserTParser.HacermientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#hacermientras}.
	 * @param ctx the parse tree
	 */
	void exitHacermientras(@NotNull ParserTParser.HacermientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#distancia}.
	 * @param ctx the parse tree
	 */
	void enterDistancia(@NotNull ParserTParser.DistanciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#distancia}.
	 * @param ctx the parse tree
	 */
	void exitDistancia(@NotNull ParserTParser.DistanciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#igual}.
	 * @param ctx the parse tree
	 */
	void enterIgual(@NotNull ParserTParser.IgualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#igual}.
	 * @param ctx the parse tree
	 */
	void exitIgual(@NotNull ParserTParser.IgualContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 */
	void enterResta(@NotNull ParserTParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 */
	void exitResta(@NotNull ParserTParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(@NotNull ParserTParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(@NotNull ParserTParser.OperadorContext ctx);
}