package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(@NotNull ParserTParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(@NotNull ParserTParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#senlogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenlogica(@NotNull ParserTParser.SenlogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(@NotNull ParserTParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(@NotNull ParserTParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(@NotNull ParserTParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(@NotNull ParserTParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(@NotNull ParserTParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sqrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(@NotNull ParserTParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sentido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentido(@NotNull ParserTParser.SentidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(@NotNull ParserTParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#menor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(@NotNull ParserTParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#afirmacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfirmacion(@NotNull ParserTParser.AfirmacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(@NotNull ParserTParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#orden}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrden(@NotNull ParserTParser.OrdenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(@NotNull ParserTParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull ParserTParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura(@NotNull ParserTParser.LecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(@NotNull ParserTParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(@NotNull ParserTParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mayor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayor(@NotNull ParserTParser.MayorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#distinto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinto(@NotNull ParserTParser.DistintoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#hacermientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHacermientras(@NotNull ParserTParser.HacermientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#distancia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistancia(@NotNull ParserTParser.DistanciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#igual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(@NotNull ParserTParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(@NotNull ParserTParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(@NotNull ParserTParser.OperadorContext ctx);
}