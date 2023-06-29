// Generated from c:\Users\maste\Documents\GitHub\Automatas-AnalisisSemantico\ParserT.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGINGPS=1, END=2, BEGIN=3, INPUT=4, OUTPUT=5, ORDEN=6, DIRECCION=7, DISTANCIA=8, 
		SENTIDO=9, MEDIDA=10, IGUAL=11, ID_SUMA=12, ID_RESTA=13, ID_MULT=14, ID_DIV=15, 
		SUMA=16, RESTA=17, MULT=18, DIV=19, EXPONENCIAL=20, COSENO=21, RAIZC=22, 
		OR=23, AND=24, MAYOR=25, MENOR=26, EQUAL=27, NOTEQUAL=28, THAN=29, IF=30, 
		THEN=31, MIENTRAS=32, DO=33, HACERMIENTRAS=34, PUNTO=35, PARENTESIS_I=36, 
		PARENTESIS_D=37, VARNAME=38, INT=39, FLOAT=40, WS=41;
	public static final int
		RULE_program = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_declaracion = 3, 
		RULE_operacion = 4, RULE_operador = 5, RULE_orden = 6, RULE_sentido = 7, 
		RULE_distancia = 8, RULE_lectura = 9, RULE_impresion = 10, RULE_ciclo = 11, 
		RULE_funcion = 12, RULE_si = 13, RULE_mientras = 14, RULE_hacermientras = 15, 
		RULE_senlogica = 16, RULE_afirmacion = 17, RULE_mayor = 18, RULE_menor = 19, 
		RULE_igual = 20, RULE_distinto = 21, RULE_suma = 22, RULE_resta = 23, 
		RULE_multiplicacion = 24, RULE_division = 25, RULE_exp = 26, RULE_cos = 27, 
		RULE_sqrt = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instrucciones", "instruccion", "declaracion", "operacion", 
			"operador", "orden", "sentido", "distancia", "lectura", "impresion", 
			"ciclo", "funcion", "si", "mientras", "hacermientras", "senlogica", "afirmacion", 
			"mayor", "menor", "igual", "distinto", "suma", "resta", "multiplicacion", 
			"division", "exp", "cos", "sqrt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bienvenido al gps'", "'has llegado a tu destino'", "'desde tu ubicacion actual,'", 
			"'preferencias de ruta:'", "'indicaciones de ruta:'", null, null, null, 
			null, null, "'es'", "'tomar salida'", "'corte camino en'", "'realice un recorrido de'", 
			"'para llegar a'", "'con'", "'hacia'", "'veces alrededor de'", "'desvia en'", 
			"'acelera'", "'pasar cambio en'", "'derrapar a'", "'o'", "'y'", "'es distancia mayor'", 
			"'es distancia menor'", "'es distancia igual'", "'es distancia diferente'", 
			"'que'", "'si'", "'entonces'", "'mientras'", "'conduzca'", "'cuando'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGINGPS", "END", "BEGIN", "INPUT", "OUTPUT", "ORDEN", "DIRECCION", 
			"DISTANCIA", "SENTIDO", "MEDIDA", "IGUAL", "ID_SUMA", "ID_RESTA", "ID_MULT", 
			"ID_DIV", "SUMA", "RESTA", "MULT", "DIV", "EXPONENCIAL", "COSENO", "RAIZC", 
			"OR", "AND", "MAYOR", "MENOR", "EQUAL", "NOTEQUAL", "THAN", "IF", "THEN", 
			"MIENTRAS", "DO", "HACERMIENTRAS", "PUNTO", "PARENTESIS_I", "PARENTESIS_D", 
			"VARNAME", "INT", "FLOAT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGINGPS() { return getToken(ParserTParser.BEGINGPS, 0); }
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(BEGINGPS);
			setState(59);
			match(BEGIN);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << ORDEN) | (1L << IF) | (1L << MIENTRAS) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(60);
				instrucciones();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(68);
				instruccion();
				}
				break;
			case 2:
				{
				setState(69);
				instruccion();
				setState(70);
				operador();
				setState(71);
				instruccion();
				}
				break;
			case 3:
				{
				setState(73);
				ciclo();
				}
				break;
			case 4:
				{
				setState(74);
				operacion();
				}
				break;
			case 5:
				{
				setState(75);
				declaracion();
				}
				break;
			case 6:
				{
				setState(76);
				lectura();
				}
				break;
			case 7:
				{
				setState(77);
				impresion();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionContext extends ParserRuleContext {
		public OrdenContext orden() {
			return getRuleContext(OrdenContext.class,0);
		}
		public SentidoContext sentido() {
			return getRuleContext(SentidoContext.class,0);
		}
		public DistanciaContext distancia() {
			return getRuleContext(DistanciaContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			orden();
			setState(81);
			sentido();
			setState(82);
			distancia();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(VARNAME);
			setState(85);
			match(IGUAL);
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionContext extends ParserRuleContext {
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(88);
				suma();
				}
				break;
			case 2:
				{
				setState(89);
				resta();
				}
				break;
			case 3:
				{
				setState(90);
				multiplicacion();
				}
				break;
			case 4:
				{
				setState(91);
				division();
				}
				break;
			case 5:
				{
				setState(92);
				funcion();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ParserTParser.AND, 0); }
		public TerminalNode OR() { return getToken(ParserTParser.OR, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrdenContext extends ParserRuleContext {
		public TerminalNode ORDEN() { return getToken(ParserTParser.ORDEN, 0); }
		public OrdenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orden; }
	}

	public final OrdenContext orden() throws RecognitionException {
		OrdenContext _localctx = new OrdenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_orden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ORDEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentidoContext extends ParserRuleContext {
		public TerminalNode SENTIDO() { return getToken(ParserTParser.SENTIDO, 0); }
		public TerminalNode DIRECCION() { return getToken(ParserTParser.DIRECCION, 0); }
		public SentidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentido; }
	}

	public final SentidoContext sentido() throws RecognitionException {
		SentidoContext _localctx = new SentidoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==DIRECCION || _la==SENTIDO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistanciaContext extends ParserRuleContext {
		public TerminalNode DISTANCIA() { return getToken(ParserTParser.DISTANCIA, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public DistanciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distancia; }
	}

	public final DistanciaContext distancia() throws RecognitionException {
		DistanciaContext _localctx = new DistanciaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_distancia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(DISTANCIA);
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(103);
			match(MEDIDA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LecturaContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public TerminalNode INPUT() { return getToken(ParserTParser.INPUT, 0); }
		public TerminalNode PARENTESIS_I() { return getToken(ParserTParser.PARENTESIS_I, 0); }
		public TerminalNode PARENTESIS_D() { return getToken(ParserTParser.PARENTESIS_D, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lectura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(VARNAME);
			setState(106);
			match(IGUAL);
			setState(107);
			match(INPUT);
			setState(108);
			match(PARENTESIS_I);
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			match(PARENTESIS_D);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(ParserTParser.OUTPUT, 0); }
		public TerminalNode PARENTESIS_I() { return getToken(ParserTParser.PARENTESIS_I, 0); }
		public TerminalNode PARENTESIS_D() { return getToken(ParserTParser.PARENTESIS_D, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_impresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(OUTPUT);
			setState(113);
			match(PARENTESIS_I);
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
			match(PARENTESIS_D);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloContext extends ParserRuleContext {
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public HacermientrasContext hacermientras() {
			return getRuleContext(HacermientrasContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ciclo);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				si();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				mientras();
				}
				break;
			case ORDEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				hacermientras();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcion);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				cos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				sqrt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserTParser.IF, 0); }
		public SenlogicaContext senlogica() {
			return getRuleContext(SenlogicaContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ParserTParser.THEN, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(IF);
			setState(128);
			senlogica();
			setState(129);
			match(THEN);
			setState(130);
			instrucciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(ParserTParser.MIENTRAS, 0); }
		public SenlogicaContext senlogica() {
			return getRuleContext(SenlogicaContext.class,0);
		}
		public TerminalNode DO() { return getToken(ParserTParser.DO, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(MIENTRAS);
			setState(133);
			senlogica();
			setState(134);
			match(DO);
			setState(135);
			instrucciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HacermientrasContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode HACERMIENTRAS() { return getToken(ParserTParser.HACERMIENTRAS, 0); }
		public SenlogicaContext senlogica() {
			return getRuleContext(SenlogicaContext.class,0);
		}
		public HacermientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hacermientras; }
	}

	public final HacermientrasContext hacermientras() throws RecognitionException {
		HacermientrasContext _localctx = new HacermientrasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_hacermientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			instruccion();
			setState(138);
			match(HACERMIENTRAS);
			setState(139);
			senlogica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenlogicaContext extends ParserRuleContext {
		public List<AfirmacionContext> afirmacion() {
			return getRuleContexts(AfirmacionContext.class);
		}
		public AfirmacionContext afirmacion(int i) {
			return getRuleContext(AfirmacionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ParserTParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ParserTParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(ParserTParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ParserTParser.AND, i);
		}
		public SenlogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senlogica; }
	}

	public final SenlogicaContext senlogica() throws RecognitionException {
		SenlogicaContext _localctx = new SenlogicaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_senlogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			afirmacion();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				afirmacion();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AfirmacionContext extends ParserRuleContext {
		public MayorContext mayor() {
			return getRuleContext(MayorContext.class,0);
		}
		public MenorContext menor() {
			return getRuleContext(MenorContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public DistintoContext distinto() {
			return getRuleContext(DistintoContext.class,0);
		}
		public AfirmacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afirmacion; }
	}

	public final AfirmacionContext afirmacion() throws RecognitionException {
		AfirmacionContext _localctx = new AfirmacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_afirmacion);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				mayor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				menor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				igual();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				distinto();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MayorContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(ParserTParser.MAYOR, 0); }
		public TerminalNode THAN() { return getToken(ParserTParser.THAN, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserTParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserTParser.FLOAT, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public MayorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayor; }
	}

	public final MayorContext mayor() throws RecognitionException {
		MayorContext _localctx = new MayorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mayor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(156);
			match(MAYOR);
			setState(157);
			match(THAN);
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(MEDIDA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenorContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(ParserTParser.MENOR, 0); }
		public TerminalNode THAN() { return getToken(ParserTParser.THAN, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserTParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserTParser.FLOAT, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public MenorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor; }
	}

	public final MenorContext menor() throws RecognitionException {
		MenorContext _localctx = new MenorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_menor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(162);
			match(MENOR);
			setState(163);
			match(THAN);
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(165);
			match(MEDIDA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgualContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ParserTParser.EQUAL, 0); }
		public TerminalNode THAN() { return getToken(ParserTParser.THAN, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserTParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserTParser.FLOAT, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_igual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			match(EQUAL);
			setState(169);
			match(THAN);
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(171);
			match(MEDIDA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistintoContext extends ParserRuleContext {
		public TerminalNode NOTEQUAL() { return getToken(ParserTParser.NOTEQUAL, 0); }
		public TerminalNode THAN() { return getToken(ParserTParser.THAN, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserTParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserTParser.FLOAT, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public DistintoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinto; }
	}

	public final DistintoContext distinto() throws RecognitionException {
		DistintoContext _localctx = new DistintoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_distinto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(174);
			match(NOTEQUAL);
			setState(175);
			match(THAN);
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(177);
			match(MEDIDA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumaContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public TerminalNode ID_SUMA() { return getToken(ParserTParser.ID_SUMA, 0); }
		public TerminalNode SUMA() { return getToken(ParserTParser.SUMA, 0); }
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserTParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserTParser.FLOAT, i);
		}
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_suma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(VARNAME);
			setState(180);
			match(IGUAL);
			setState(181);
			match(ID_SUMA);
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(183);
			match(SUMA);
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestaContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public TerminalNode ID_RESTA() { return getToken(ParserTParser.ID_RESTA, 0); }
		public TerminalNode RESTA() { return getToken(ParserTParser.RESTA, 0); }
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserTParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserTParser.FLOAT, i);
		}
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_resta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(VARNAME);
			setState(187);
			match(IGUAL);
			setState(188);
			match(ID_RESTA);
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(190);
			match(RESTA);
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicacionContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public TerminalNode ID_MULT() { return getToken(ParserTParser.ID_MULT, 0); }
		public TerminalNode MULT() { return getToken(ParserTParser.MULT, 0); }
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserTParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserTParser.FLOAT, i);
		}
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multiplicacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(VARNAME);
			setState(194);
			match(IGUAL);
			setState(195);
			match(ID_MULT);
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(197);
			match(MULT);
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivisionContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public TerminalNode ID_DIV() { return getToken(ParserTParser.ID_DIV, 0); }
		public TerminalNode DIV() { return getToken(ParserTParser.DIV, 0); }
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserTParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserTParser.FLOAT, i);
		}
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(VARNAME);
			setState(201);
			match(IGUAL);
			setState(202);
			match(ID_DIV);
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(204);
			match(DIV);
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public TerminalNode EXPONENCIAL() { return getToken(ParserTParser.EXPONENCIAL, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(VARNAME);
			setState(208);
			match(IGUAL);
			setState(209);
			match(EXPONENCIAL);
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(211);
			match(MEDIDA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CosContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public TerminalNode COSENO() { return getToken(ParserTParser.COSENO, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(VARNAME);
			setState(214);
			match(IGUAL);
			setState(215);
			match(COSENO);
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(217);
			match(MEDIDA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqrtContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode IGUAL() { return getToken(ParserTParser.IGUAL, 0); }
		public TerminalNode RAIZC() { return getToken(ParserTParser.RAIZC, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public SqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt; }
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sqrt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(VARNAME);
			setState(220);
			match(IGUAL);
			setState(221);
			match(RAIZC);
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(223);
			match(MEDIDA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"Q\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6`\n\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r{\n\r\3\16\3\16\3\16\5\16\u0080\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\7\22\u0093\n\22\f\22\16\22\u0096\13\22\3\23\3\23\3"+
		"\23\3\23\5\23\u009c\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:\2\6\3\2)*\3\2\31\32\4\2\t\t\13\13\3\2(*"+
		"\2\u00d9\2<\3\2\2\2\4P\3\2\2\2\6R\3\2\2\2\bV\3\2\2\2\n_\3\2\2\2\fa\3\2"+
		"\2\2\16c\3\2\2\2\20e\3\2\2\2\22g\3\2\2\2\24k\3\2\2\2\26r\3\2\2\2\30z\3"+
		"\2\2\2\32\177\3\2\2\2\34\u0081\3\2\2\2\36\u0086\3\2\2\2 \u008b\3\2\2\2"+
		"\"\u008f\3\2\2\2$\u009b\3\2\2\2&\u009d\3\2\2\2(\u00a3\3\2\2\2*\u00a9\3"+
		"\2\2\2,\u00af\3\2\2\2.\u00b5\3\2\2\2\60\u00bc\3\2\2\2\62\u00c3\3\2\2\2"+
		"\64\u00ca\3\2\2\2\66\u00d1\3\2\2\28\u00d7\3\2\2\2:\u00dd\3\2\2\2<=\7\3"+
		"\2\2=A\7\5\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2"+
		"\2\2CA\3\2\2\2DE\7\4\2\2E\3\3\2\2\2FQ\5\6\4\2GH\5\6\4\2HI\5\f\7\2IJ\5"+
		"\6\4\2JQ\3\2\2\2KQ\5\30\r\2LQ\5\n\6\2MQ\5\b\5\2NQ\5\24\13\2OQ\5\26\f\2"+
		"PF\3\2\2\2PG\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2"+
		"Q\5\3\2\2\2RS\5\16\b\2ST\5\20\t\2TU\5\22\n\2U\7\3\2\2\2VW\7(\2\2WX\7\r"+
		"\2\2XY\t\2\2\2Y\t\3\2\2\2Z`\5.\30\2[`\5\60\31\2\\`\5\62\32\2]`\5\64\33"+
		"\2^`\5\32\16\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\13"+
		"\3\2\2\2ab\t\3\2\2b\r\3\2\2\2cd\7\b\2\2d\17\3\2\2\2ef\t\4\2\2f\21\3\2"+
		"\2\2gh\7\n\2\2hi\t\2\2\2ij\7\f\2\2j\23\3\2\2\2kl\7(\2\2lm\7\r\2\2mn\7"+
		"\6\2\2no\7&\2\2op\t\5\2\2pq\7\'\2\2q\25\3\2\2\2rs\7\7\2\2st\7&\2\2tu\t"+
		"\5\2\2uv\7\'\2\2v\27\3\2\2\2w{\5\34\17\2x{\5\36\20\2y{\5 \21\2zw\3\2\2"+
		"\2zx\3\2\2\2zy\3\2\2\2{\31\3\2\2\2|\u0080\5\66\34\2}\u0080\58\35\2~\u0080"+
		"\5:\36\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\33\3\2\2\2\u0081"+
		"\u0082\7 \2\2\u0082\u0083\5\"\22\2\u0083\u0084\7!\2\2\u0084\u0085\5\4"+
		"\3\2\u0085\35\3\2\2\2\u0086\u0087\7\"\2\2\u0087\u0088\5\"\22\2\u0088\u0089"+
		"\7#\2\2\u0089\u008a\5\4\3\2\u008a\37\3\2\2\2\u008b\u008c\5\6\4\2\u008c"+
		"\u008d\7$\2\2\u008d\u008e\5\"\22\2\u008e!\3\2\2\2\u008f\u0094\5$\23\2"+
		"\u0090\u0091\t\3\2\2\u0091\u0093\5$\23\2\u0092\u0090\3\2\2\2\u0093\u0096"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095#\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u009c\5&\24\2\u0098\u009c\5(\25\2\u0099\u009c\5*"+
		"\26\2\u009a\u009c\5,\27\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c%\3\2\2\2\u009d\u009e\t\5\2\2"+
		"\u009e\u009f\7\33\2\2\u009f\u00a0\7\37\2\2\u00a0\u00a1\t\5\2\2\u00a1\u00a2"+
		"\7\f\2\2\u00a2\'\3\2\2\2\u00a3\u00a4\t\5\2\2\u00a4\u00a5\7\34\2\2\u00a5"+
		"\u00a6\7\37\2\2\u00a6\u00a7\t\5\2\2\u00a7\u00a8\7\f\2\2\u00a8)\3\2\2\2"+
		"\u00a9\u00aa\t\5\2\2\u00aa\u00ab\7\35\2\2\u00ab\u00ac\7\37\2\2\u00ac\u00ad"+
		"\t\5\2\2\u00ad\u00ae\7\f\2\2\u00ae+\3\2\2\2\u00af\u00b0\t\5\2\2\u00b0"+
		"\u00b1\7\36\2\2\u00b1\u00b2\7\37\2\2\u00b2\u00b3\t\5\2\2\u00b3\u00b4\7"+
		"\f\2\2\u00b4-\3\2\2\2\u00b5\u00b6\7(\2\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8"+
		"\7\16\2\2\u00b8\u00b9\t\5\2\2\u00b9\u00ba\7\22\2\2\u00ba\u00bb\t\5\2\2"+
		"\u00bb/\3\2\2\2\u00bc\u00bd\7(\2\2\u00bd\u00be\7\r\2\2\u00be\u00bf\7\17"+
		"\2\2\u00bf\u00c0\t\5\2\2\u00c0\u00c1\7\23\2\2\u00c1\u00c2\t\5\2\2\u00c2"+
		"\61\3\2\2\2\u00c3\u00c4\7(\2\2\u00c4\u00c5\7\r\2\2\u00c5\u00c6\7\20\2"+
		"\2\u00c6\u00c7\t\5\2\2\u00c7\u00c8\7\24\2\2\u00c8\u00c9\t\5\2\2\u00c9"+
		"\63\3\2\2\2\u00ca\u00cb\7(\2\2\u00cb\u00cc\7\r\2\2\u00cc\u00cd\7\21\2"+
		"\2\u00cd\u00ce\t\5\2\2\u00ce\u00cf\7\25\2\2\u00cf\u00d0\t\5\2\2\u00d0"+
		"\65\3\2\2\2\u00d1\u00d2\7(\2\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4\7\26\2"+
		"\2\u00d4\u00d5\t\2\2\2\u00d5\u00d6\7\f\2\2\u00d6\67\3\2\2\2\u00d7\u00d8"+
		"\7(\2\2\u00d8\u00d9\7\r\2\2\u00d9\u00da\7\27\2\2\u00da\u00db\t\2\2\2\u00db"+
		"\u00dc\7\f\2\2\u00dc9\3\2\2\2\u00dd\u00de\7(\2\2\u00de\u00df\7\r\2\2\u00df"+
		"\u00e0\7\30\2\2\u00e0\u00e1\t\2\2\2\u00e1\u00e2\7\f\2\2\u00e2;\3\2\2\2"+
		"\tAP_z\177\u0094\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}