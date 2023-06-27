package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, BEGINGPS=16, 
		END=17, BEGIN=18, INPUT=19, OUTPUT=20, ORDEN=21, DIRECCION=22, DISTANCIA=23, 
		SENTIDO=24, MEDIDA=25, PUNTO=26, EXPONENCIAL=27, COSENO=28, RAIZC=29, 
		OR=30, AND=31, MAYOR=32, MENOR=33, EQUAL=34, NOTEQUAL=35, VARNAME=36, 
		CADENA=37, INT=38, FLOAT=39, WS=40;
	public static final int
		RULE_program = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_declaracion = 3, 
		RULE_operacion = 4, RULE_operador = 5, RULE_orden = 6, RULE_sentido = 7, 
		RULE_distancia = 8, RULE_lectura = 9, RULE_impresion = 10, RULE_ciclo = 11, 
		RULE_funcion = 12, RULE_si = 13, RULE_mientras = 14, RULE_hacermientras = 15, 
		RULE_senlogica = 16, RULE_afirmacion = 17, RULE_mayor = 18, RULE_menor = 19, 
		RULE_igual = 20, RULE_distinto = 21, RULE_suma = 22, RULE_resta = 23, 
		RULE_multiplicacion = 24, RULE_division = 25, RULE_exp = 26, RULE_cos = 27, 
		RULE_sqrt = 28;
	public static final String[] ruleNames = {
		"program", "instrucciones", "instruccion", "declaracion", "operacion", 
		"operador", "orden", "sentido", "distancia", "lectura", "impresion", "ciclo", 
		"funcion", "si", "mientras", "hacermientras", "senlogica", "afirmacion", 
		"mayor", "menor", "igual", "distinto", "suma", "resta", "multiplicacion", 
		"division", "exp", "cos", "sqrt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'es'", "'hacia'", "'si'", "'entonces'", "'mientras'", "'conduzca'", 
		"'cuando'", "'que'", "'tomar salida'", "'con'", "'corte camino en'", "'realice un recorrido de'", 
		"'veces alrededor de'", "'para llegar a'", "'desvia en'", "'bienvenido al gps.'", 
		"'has llegado a tu destino.'", "'desde tu ubicacion actual,'", "'preferencias de ruta:'", 
		"'indicaciones de ruta:'", null, null, null, null, null, "'.'", "'acelera'", 
		"'pasar cambio en'", "'derrapar a'", "'o'", "'y'", "'distancia mayor'", 
		"'distancia menor'", "'distancia igual'", "'distancia diferente'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "BEGINGPS", "END", "BEGIN", "INPUT", "OUTPUT", 
		"ORDEN", "DIRECCION", "DISTANCIA", "SENTIDO", "MEDIDA", "PUNTO", "EXPONENCIAL", 
		"COSENO", "RAIZC", "OR", "AND", "MAYOR", "MENOR", "EQUAL", "NOTEQUAL", 
		"VARNAME", "CADENA", "INT", "FLOAT", "WS"
	};
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << ORDEN) | (1L << EXPONENCIAL) | (1L << COSENO) | (1L << RAIZC) | (1L << VARNAME))) != 0)) {
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
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		public List<TerminalNode> PUNTO() { return getTokens(ParserTParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(ParserTParser.PUNTO, i);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			orden();
			setState(79);
			sentido();
			setState(80);
			distancia();
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					match(PUNTO);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(VARNAME);
			setState(88);
			match(T__0);
			setState(89);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(91);
				suma();
				}
				break;
			case 2:
				{
				setState(92);
				resta();
				}
				break;
			case 3:
				{
				setState(93);
				multiplicacion();
				}
				break;
			case 4:
				{
				setState(94);
				division();
				}
				break;
			case 5:
				{
				setState(95);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOrden(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdenContext orden() throws RecognitionException {
		OrdenContext _localctx = new OrdenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_orden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSentido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentidoContext sentido() throws RecognitionException {
		SentidoContext _localctx = new SentidoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDistancia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistanciaContext distancia() throws RecognitionException {
		DistanciaContext _localctx = new DistanciaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_distancia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(DISTANCIA);
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
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
		public TerminalNode INPUT() { return getToken(ParserTParser.INPUT, 0); }
		public TerminalNode CADENA() { return getToken(ParserTParser.CADENA, 0); }
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLectura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(INPUT);
			setState(109);
			match(T__1);
			setState(110);
			match(CADENA);
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
		public TerminalNode CADENA() { return getToken(ParserTParser.CADENA, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(OUTPUT);
			setState(113);
			match(T__1);
			setState(114);
			match(CADENA);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ciclo);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				si();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				mientras();
				}
				break;
			case ORDEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcion);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPONENCIAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				exp();
				}
				break;
			case COSENO:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				cos();
				}
				break;
			case RAIZC:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				sqrt();
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

	public static class SiContext extends ParserRuleContext {
		public SenlogicaContext senlogica() {
			return getRuleContext(SenlogicaContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__2);
			setState(127);
			senlogica();
			setState(128);
			match(T__3);
			setState(129);
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
		public SenlogicaContext senlogica() {
			return getRuleContext(SenlogicaContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public List<TerminalNode> PUNTO() { return getTokens(ParserTParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(ParserTParser.PUNTO, i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mientras);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__4);
			setState(132);
			senlogica();
			setState(133);
			match(T__5);
			setState(134);
			instrucciones();
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					match(PUNTO);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class HacermientrasContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public SenlogicaContext senlogica() {
			return getRuleContext(SenlogicaContext.class,0);
		}
		public List<TerminalNode> PUNTO() { return getTokens(ParserTParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(ParserTParser.PUNTO, i);
		}
		public HacermientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hacermientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitHacermientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HacermientrasContext hacermientras() throws RecognitionException {
		HacermientrasContext _localctx = new HacermientrasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_hacermientras);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			instruccion();
			setState(142);
			match(T__6);
			setState(143);
			senlogica();
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					match(PUNTO);
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSenlogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenlogicaContext senlogica() throws RecognitionException {
		SenlogicaContext _localctx = new SenlogicaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_senlogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			afirmacion();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(151);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(152);
				afirmacion();
				}
				}
				setState(157);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitAfirmacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AfirmacionContext afirmacion() throws RecognitionException {
		AfirmacionContext _localctx = new AfirmacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_afirmacion);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAYOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				mayor();
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				menor();
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				igual();
				}
				break;
			case NOTEQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				distinto();
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

	public static class MayorContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(ParserTParser.MAYOR, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public MayorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMayor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MayorContext mayor() throws RecognitionException {
		MayorContext _localctx = new MayorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(MAYOR);
			setState(165);
			match(T__7);
			setState(166);
			match(INT);
			setState(167);
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
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public MenorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMenor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenorContext menor() throws RecognitionException {
		MenorContext _localctx = new MenorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(MENOR);
			setState(170);
			match(T__7);
			setState(171);
			match(INT);
			setState(172);
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
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(EQUAL);
			setState(175);
			match(T__7);
			setState(176);
			match(INT);
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

	public static class DistintoContext extends ParserRuleContext {
		public TerminalNode NOTEQUAL() { return getToken(ParserTParser.NOTEQUAL, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public DistintoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDistinto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistintoContext distinto() throws RecognitionException {
		DistintoContext _localctx = new DistintoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_distinto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(NOTEQUAL);
			setState(180);
			match(T__7);
			setState(181);
			match(INT);
			setState(182);
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
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_suma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(VARNAME);
			setState(185);
			match(T__0);
			setState(186);
			match(T__8);
			setState(187);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(188);
			match(T__9);
			setState(189);
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

	public static class RestaContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_resta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(VARNAME);
			setState(192);
			match(T__0);
			setState(193);
			match(T__10);
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(195);
			match(T__1);
			setState(196);
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

	public static class MultiplicacionContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multiplicacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(VARNAME);
			setState(199);
			match(T__0);
			setState(200);
			match(T__11);
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			match(T__12);
			setState(203);
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

	public static class DivisionContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(VARNAME);
			setState(206);
			match(T__0);
			setState(207);
			match(T__13);
			setState(208);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(209);
			match(T__14);
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
		public TerminalNode EXPONENCIAL() { return getToken(ParserTParser.EXPONENCIAL, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(EXPONENCIAL);
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(214);
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
		public TerminalNode COSENO() { return getToken(ParserTParser.COSENO, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(COSENO);
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(218);
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
		public TerminalNode RAIZC() { return getToken(ParserTParser.RAIZC, 0); }
		public TerminalNode MEDIDA() { return getToken(ParserTParser.MEDIDA, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public SqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSqrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sqrt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(RAIZC);
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4"+
		"\3\4\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\5\6c\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\rz\n\r\3\16\3\16\3\16\5\16\177\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u008b\n\20\f\20\16"+
		"\20\u008e\13\20\3\21\3\21\3\21\3\21\7\21\u0094\n\21\f\21\16\21\u0097\13"+
		"\21\3\22\3\22\3\22\7\22\u009c\n\22\f\22\16\22\u009f\13\22\3\23\3\23\3"+
		"\23\3\23\5\23\u00a5\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\3\2()\3\2 !\4\2"+
		"\30\30\32\32\2\u00d9\2<\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2\bY\3\2\2\2\nb\3"+
		"\2\2\2\fd\3\2\2\2\16f\3\2\2\2\20h\3\2\2\2\22j\3\2\2\2\24n\3\2\2\2\26r"+
		"\3\2\2\2\30y\3\2\2\2\32~\3\2\2\2\34\u0080\3\2\2\2\36\u0085\3\2\2\2 \u008f"+
		"\3\2\2\2\"\u0098\3\2\2\2$\u00a4\3\2\2\2&\u00a6\3\2\2\2(\u00ab\3\2\2\2"+
		"*\u00b0\3\2\2\2,\u00b5\3\2\2\2.\u00ba\3\2\2\2\60\u00c1\3\2\2\2\62\u00c8"+
		"\3\2\2\2\64\u00cf\3\2\2\2\66\u00d6\3\2\2\28\u00da\3\2\2\2:\u00de\3\2\2"+
		"\2<=\7\22\2\2=A\7\24\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2BD\3\2\2\2CA\3\2\2\2DE\7\23\2\2E\3\3\2\2\2FO\5\6\4\2GH\5\6\4\2HI\5"+
		"\f\7\2IJ\5\6\4\2JO\3\2\2\2KO\5\30\r\2LO\5\n\6\2MO\5\b\5\2NF\3\2\2\2NG"+
		"\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PQ\5\16\b\2QR\5\20\t"+
		"\2RV\5\22\n\2SU\7\34\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\7\3"+
		"\2\2\2XV\3\2\2\2YZ\7&\2\2Z[\7\3\2\2[\\\t\2\2\2\\\t\3\2\2\2]c\5.\30\2^"+
		"c\5\60\31\2_c\5\62\32\2`c\5\64\33\2ac\5\32\16\2b]\3\2\2\2b^\3\2\2\2b_"+
		"\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\13\3\2\2\2de\t\3\2\2e\r\3\2\2\2fg\7\27\2"+
		"\2g\17\3\2\2\2hi\t\4\2\2i\21\3\2\2\2jk\7\31\2\2kl\t\2\2\2lm\7\33\2\2m"+
		"\23\3\2\2\2no\7\25\2\2op\7\4\2\2pq\7\'\2\2q\25\3\2\2\2rs\7\26\2\2st\7"+
		"\4\2\2tu\7\'\2\2u\27\3\2\2\2vz\5\34\17\2wz\5\36\20\2xz\5 \21\2yv\3\2\2"+
		"\2yw\3\2\2\2yx\3\2\2\2z\31\3\2\2\2{\177\5\66\34\2|\177\58\35\2}\177\5"+
		":\36\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\33\3\2\2\2\u0080\u0081\7\5\2"+
		"\2\u0081\u0082\5\"\22\2\u0082\u0083\7\6\2\2\u0083\u0084\5\4\3\2\u0084"+
		"\35\3\2\2\2\u0085\u0086\7\7\2\2\u0086\u0087\5\"\22\2\u0087\u0088\7\b\2"+
		"\2\u0088\u008c\5\4\3\2\u0089\u008b\7\34\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\37\3\2\2"+
		"\2\u008e\u008c\3\2\2\2\u008f\u0090\5\6\4\2\u0090\u0091\7\t\2\2\u0091\u0095"+
		"\5\"\22\2\u0092\u0094\7\34\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096!\3\2\2\2\u0097\u0095\3"+
		"\2\2\2\u0098\u009d\5$\23\2\u0099\u009a\t\3\2\2\u009a\u009c\5$\23\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e#\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a5\5&\24\2\u00a1\u00a5"+
		"\5(\25\2\u00a2\u00a5\5*\26\2\u00a3\u00a5\5,\27\2\u00a4\u00a0\3\2\2\2\u00a4"+
		"\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5%\3\2\2\2"+
		"\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7\n\2\2\u00a8\u00a9\7(\2\2\u00a9\u00aa"+
		"\7\33\2\2\u00aa\'\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\u00ad\7\n\2\2\u00ad"+
		"\u00ae\7(\2\2\u00ae\u00af\7\33\2\2\u00af)\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1"+
		"\u00b2\7\n\2\2\u00b2\u00b3\7(\2\2\u00b3\u00b4\7\33\2\2\u00b4+\3\2\2\2"+
		"\u00b5\u00b6\7%\2\2\u00b6\u00b7\7\n\2\2\u00b7\u00b8\7(\2\2\u00b8\u00b9"+
		"\7\33\2\2\u00b9-\3\2\2\2\u00ba\u00bb\7&\2\2\u00bb\u00bc\7\3\2\2\u00bc"+
		"\u00bd\7\13\2\2\u00bd\u00be\t\2\2\2\u00be\u00bf\7\f\2\2\u00bf\u00c0\t"+
		"\2\2\2\u00c0/\3\2\2\2\u00c1\u00c2\7&\2\2\u00c2\u00c3\7\3\2\2\u00c3\u00c4"+
		"\7\r\2\2\u00c4\u00c5\t\2\2\2\u00c5\u00c6\7\4\2\2\u00c6\u00c7\t\2\2\2\u00c7"+
		"\61\3\2\2\2\u00c8\u00c9\7&\2\2\u00c9\u00ca\7\3\2\2\u00ca\u00cb\7\16\2"+
		"\2\u00cb\u00cc\t\2\2\2\u00cc\u00cd\7\17\2\2\u00cd\u00ce\t\2\2\2\u00ce"+
		"\63\3\2\2\2\u00cf\u00d0\7&\2\2\u00d0\u00d1\7\3\2\2\u00d1\u00d2\7\20\2"+
		"\2\u00d2\u00d3\t\2\2\2\u00d3\u00d4\7\21\2\2\u00d4\u00d5\t\2\2\2\u00d5"+
		"\65\3\2\2\2\u00d6\u00d7\7\35\2\2\u00d7\u00d8\t\2\2\2\u00d8\u00d9\7\33"+
		"\2\2\u00d9\67\3\2\2\2\u00da\u00db\7\36\2\2\u00db\u00dc\t\2\2\2\u00dc\u00dd"+
		"\7\33\2\2\u00dd9\3\2\2\2\u00de\u00df\7\37\2\2\u00df\u00e0\t\2\2\2\u00e0"+
		"\u00e1\7\33\2\2\u00e1;\3\2\2\2\fANVby~\u008c\u0095\u009d\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}