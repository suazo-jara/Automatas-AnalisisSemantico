// Generated from ParserT.g4 by ANTLR 4.7.1
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
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(ParserTParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(ParserTParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(ParserTParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(ParserTParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(ParserTParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#orden}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrden(ParserTParser.OrdenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sentido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentido(ParserTParser.SentidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#distancia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistancia(ParserTParser.DistanciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura(ParserTParser.LecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(ParserTParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(ParserTParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(ParserTParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(ParserTParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(ParserTParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#hacermientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHacermientras(ParserTParser.HacermientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#senlogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenlogica(ParserTParser.SenlogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#afirmacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfirmacion(ParserTParser.AfirmacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mayor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayor(ParserTParser.MayorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#menor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(ParserTParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#igual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(ParserTParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#distinto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinto(ParserTParser.DistintoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(ParserTParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(ParserTParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(ParserTParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(ParserTParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ParserTParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(ParserTParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sqrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(ParserTParser.SqrtContext ctx);
}