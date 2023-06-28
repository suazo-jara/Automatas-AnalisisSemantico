// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BEGINGPS=18, END=19, BEGIN=20, INPUT=21, OUTPUT=22, ORDEN=23, DIRECCION=24, 
		DISTANCIA=25, SENTIDO=26, MEDIDA=27, PUNTO=28, EXPONENCIAL=29, COSENO=30, 
		RAIZC=31, OR=32, AND=33, MAYOR=34, MENOR=35, EQUAL=36, NOTEQUAL=37, VARNAME=38, 
		INT=39, FLOAT=40, WS=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"BEGINGPS", "END", "BEGIN", "INPUT", "OUTPUT", "ORDEN", "DIRECCION", "DISTANCIA", 
		"SENTIDO", "MEDIDA", "PUNTO", "EXPONENCIAL", "COSENO", "RAIZC", "OR", 
		"AND", "MAYOR", "MENOR", "EQUAL", "NOTEQUAL", "VARNAME", "INT", "FLOAT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'es'", "'('", "')'", "'si'", "'entonces'", "'mientras'", "'conduzca'", 
		"'cuando'", "'que'", "'tomar salida'", "'con'", "'corte camino en'", "'hacia'", 
		"'realice un recorrido de'", "'veces alrededor de'", "'para llegar a'", 
		"'desvia en'", "'bienvenido al gps.'", "'has llegado a tu destino.'", 
		"'desde tu ubicacion actual,'", "'preferencias de ruta:'", "'indicaciones de ruta:'", 
		null, null, null, null, null, "'.'", "'acelera'", "'pasar cambio en'", 
		"'derrapar a'", "'o'", "'y'", "'distancia mayor'", "'distancia menor'", 
		"'distancia igual'", "'distancia diferente'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BEGINGPS", "END", "BEGIN", "INPUT", 
		"OUTPUT", "ORDEN", "DIRECCION", "DISTANCIA", "SENTIDO", "MEDIDA", "PUNTO", 
		"EXPONENCIAL", "COSENO", "RAIZC", "OR", "AND", "MAYOR", "MENOR", "EQUAL", 
		"NOTEQUAL", "VARNAME", "INT", "FLOAT", "WS"
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


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0278\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u017d\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01a1\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01ac\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01c8\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u01e8\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\6\'\u0258\n\'\r\'\16\'"+
		"\u0259\3(\5(\u025d\n(\3(\6(\u0260\n(\r(\16(\u0261\3)\5)\u0265\n)\3)\6"+
		")\u0268\n)\r)\16)\u0269\3)\3)\6)\u026e\n)\r)\16)\u026f\3*\6*\u0273\n*"+
		"\r*\16*\u0274\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\5\4\2C\\c|\3\2\62"+
		";\5\2\13\f\17\17\"\"\2\u028a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5X\3\2\2\2\7Z\3\2\2\2\t\\\3\2\2"+
		"\2\13_\3\2\2\2\rh\3\2\2\2\17q\3\2\2\2\21z\3\2\2\2\23\u0081\3\2\2\2\25"+
		"\u0085\3\2\2\2\27\u0092\3\2\2\2\31\u0096\3\2\2\2\33\u00a6\3\2\2\2\35\u00ac"+
		"\3\2\2\2\37\u00c4\3\2\2\2!\u00d7\3\2\2\2#\u00e5\3\2\2\2%\u00ef\3\2\2\2"+
		"\'\u0102\3\2\2\2)\u011c\3\2\2\2+\u0137\3\2\2\2-\u014d\3\2\2\2/\u017c\3"+
		"\2\2\2\61\u01a0\3\2\2\2\63\u01ab\3\2\2\2\65\u01c7\3\2\2\2\67\u01e7\3\2"+
		"\2\29\u01e9\3\2\2\2;\u01eb\3\2\2\2=\u01f3\3\2\2\2?\u0203\3\2\2\2A\u020e"+
		"\3\2\2\2C\u0210\3\2\2\2E\u0212\3\2\2\2G\u0222\3\2\2\2I\u0232\3\2\2\2K"+
		"\u0242\3\2\2\2M\u0257\3\2\2\2O\u025c\3\2\2\2Q\u0264\3\2\2\2S\u0272\3\2"+
		"\2\2UV\7g\2\2VW\7u\2\2W\4\3\2\2\2XY\7*\2\2Y\6\3\2\2\2Z[\7+\2\2[\b\3\2"+
		"\2\2\\]\7u\2\2]^\7k\2\2^\n\3\2\2\2_`\7g\2\2`a\7p\2\2ab\7v\2\2bc\7q\2\2"+
		"cd\7p\2\2de\7e\2\2ef\7g\2\2fg\7u\2\2g\f\3\2\2\2hi\7o\2\2ij\7k\2\2jk\7"+
		"g\2\2kl\7p\2\2lm\7v\2\2mn\7t\2\2no\7c\2\2op\7u\2\2p\16\3\2\2\2qr\7e\2"+
		"\2rs\7q\2\2st\7p\2\2tu\7f\2\2uv\7w\2\2vw\7|\2\2wx\7e\2\2xy\7c\2\2y\20"+
		"\3\2\2\2z{\7e\2\2{|\7w\2\2|}\7c\2\2}~\7p\2\2~\177\7f\2\2\177\u0080\7q"+
		"\2\2\u0080\22\3\2\2\2\u0081\u0082\7s\2\2\u0082\u0083\7w\2\2\u0083\u0084"+
		"\7g\2\2\u0084\24\3\2\2\2\u0085\u0086\7v\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7o\2\2\u0088\u0089\7c\2\2\u0089\u008a\7t\2\2\u008a\u008b\7\"\2\2\u008b"+
		"\u008c\7u\2\2\u008c\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e\u008f\7k\2\2"+
		"\u008f\u0090\7f\2\2\u0090\u0091\7c\2\2\u0091\26\3\2\2\2\u0092\u0093\7"+
		"e\2\2\u0093\u0094\7q\2\2\u0094\u0095\7p\2\2\u0095\30\3\2\2\2\u0096\u0097"+
		"\7e\2\2\u0097\u0098\7q\2\2\u0098\u0099\7t\2\2\u0099\u009a\7v\2\2\u009a"+
		"\u009b\7g\2\2\u009b\u009c\7\"\2\2\u009c\u009d\7e\2\2\u009d\u009e\7c\2"+
		"\2\u009e\u009f\7o\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2"+
		"\7q\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5"+
		"\32\3\2\2\2\u00a6\u00a7\7j\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7e\2\2\u00a9"+
		"\u00aa\7k\2\2\u00aa\u00ab\7c\2\2\u00ab\34\3\2\2\2\u00ac\u00ad\7t\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7k\2\2"+
		"\u00b1\u00b2\7e\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b5"+
		"\7w\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8\7t\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7t\2\2"+
		"\u00bc\u00bd\7t\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0"+
		"\7q\2\2\u00c0\u00c1\7\"\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\36\3\2\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7e\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7\"\2\2\u00ca\u00cb\7c\2"+
		"\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf"+
		"\7f\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2\7q\2\2\u00d2"+
		"\u00d3\7t\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7g\2"+
		"\2\u00d6 \3\2\2\2\u00d7\u00d8\7r\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7"+
		"t\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7\"\2\2\u00dc\u00dd\7n\2\2\u00dd"+
		"\u00de\7n\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7i\2\2\u00e0\u00e1\7c\2\2"+
		"\u00e1\u00e2\7t\2\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\7c\2\2\u00e4\"\3\2"+
		"\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9"+
		"\7x\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7\"\2\2\u00ec"+
		"\u00ed\7g\2\2\u00ed\u00ee\7p\2\2\u00ee$\3\2\2\2\u00ef\u00f0\7d\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7x\2\2"+
		"\u00f4\u00f5\7g\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7f\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\7c\2\2\u00fb"+
		"\u00fc\7n\2\2\u00fc\u00fd\7\"\2\2\u00fd\u00fe\7i\2\2\u00fe\u00ff\7r\2"+
		"\2\u00ff\u0100\7u\2\2\u0100\u0101\7\60\2\2\u0101&\3\2\2\2\u0102\u0103"+
		"\7j\2\2\u0103\u0104\7c\2\2\u0104\u0105\7u\2\2\u0105\u0106\7\"\2\2\u0106"+
		"\u0107\7n\2\2\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2\u0109\u010a\7i\2\2"+
		"\u010a\u010b\7c\2\2\u010b\u010c\7f\2\2\u010c\u010d\7q\2\2\u010d\u010e"+
		"\7\"\2\2\u010e\u010f\7c\2\2\u010f\u0110\7\"\2\2\u0110\u0111\7v\2\2\u0111"+
		"\u0112\7w\2\2\u0112\u0113\7\"\2\2\u0113\u0114\7f\2\2\u0114\u0115\7g\2"+
		"\2\u0115\u0116\7u\2\2\u0116\u0117\7v\2\2\u0117\u0118\7k\2\2\u0118\u0119"+
		"\7p\2\2\u0119\u011a\7q\2\2\u011a\u011b\7\60\2\2\u011b(\3\2\2\2\u011c\u011d"+
		"\7f\2\2\u011d\u011e\7g\2\2\u011e\u011f\7u\2\2\u011f\u0120\7f\2\2\u0120"+
		"\u0121\7g\2\2\u0121\u0122\7\"\2\2\u0122\u0123\7v\2\2\u0123\u0124\7w\2"+
		"\2\u0124\u0125\7\"\2\2\u0125\u0126\7w\2\2\u0126\u0127\7d\2\2\u0127\u0128"+
		"\7k\2\2\u0128\u0129\7e\2\2\u0129\u012a\7c\2\2\u012a\u012b\7e\2\2\u012b"+
		"\u012c\7k\2\2\u012c\u012d\7q\2\2\u012d\u012e\7p\2\2\u012e\u012f\7\"\2"+
		"\2\u012f\u0130\7c\2\2\u0130\u0131\7e\2\2\u0131\u0132\7v\2\2\u0132\u0133"+
		"\7w\2\2\u0133\u0134\7c\2\2\u0134\u0135\7n\2\2\u0135\u0136\7.\2\2\u0136"+
		"*\3\2\2\2\u0137\u0138\7r\2\2\u0138\u0139\7t\2\2\u0139\u013a\7g\2\2\u013a"+
		"\u013b\7h\2\2\u013b\u013c\7g\2\2\u013c\u013d\7t\2\2\u013d\u013e\7g\2\2"+
		"\u013e\u013f\7p\2\2\u013f\u0140\7e\2\2\u0140\u0141\7k\2\2\u0141\u0142"+
		"\7c\2\2\u0142\u0143\7u\2\2\u0143\u0144\7\"\2\2\u0144\u0145\7f\2\2\u0145"+
		"\u0146\7g\2\2\u0146\u0147\7\"\2\2\u0147\u0148\7t\2\2\u0148\u0149\7w\2"+
		"\2\u0149\u014a\7v\2\2\u014a\u014b\7c\2\2\u014b\u014c\7<\2\2\u014c,\3\2"+
		"\2\2\u014d\u014e\7k\2\2\u014e\u014f\7p\2\2\u014f\u0150\7f\2\2\u0150\u0151"+
		"\7k\2\2\u0151\u0152\7e\2\2\u0152\u0153\7c\2\2\u0153\u0154\7e\2\2\u0154"+
		"\u0155\7k\2\2\u0155\u0156\7q\2\2\u0156\u0157\7p\2\2\u0157\u0158\7g\2\2"+
		"\u0158\u0159\7u\2\2\u0159\u015a\7\"\2\2\u015a\u015b\7f\2\2\u015b\u015c"+
		"\7g\2\2\u015c\u015d\7\"\2\2\u015d\u015e\7t\2\2\u015e\u015f\7w\2\2\u015f"+
		"\u0160\7v\2\2\u0160\u0161\7c\2\2\u0161\u0162\7<\2\2\u0162.\3\2\2\2\u0163"+
		"\u0164\7f\2\2\u0164\u0165\7k\2\2\u0165\u0166\7t\2\2\u0166\u0167\7k\2\2"+
		"\u0167\u0168\7i\2\2\u0168\u0169\7g\2\2\u0169\u016a\7v\2\2\u016a\u017d"+
		"\7g\2\2\u016b\u016c\7u\2\2\u016c\u016d\7k\2\2\u016d\u016e\7i\2\2\u016e"+
		"\u016f\7w\2\2\u016f\u017d\7g\2\2\u0170\u0171\7e\2\2\u0171\u0172\7q\2\2"+
		"\u0172\u0173\7p\2\2\u0173\u0174\7v\2\2\u0174\u0175\7k\2\2\u0175\u0176"+
		"\7p\2\2\u0176\u0177\7w\2\2\u0177\u017d\7c\2\2\u0178\u0179\7i\2\2\u0179"+
		"\u017a\7k\2\2\u017a\u017b\7t\2\2\u017b\u017d\7c\2\2\u017c\u0163\3\2\2"+
		"\2\u017c\u016b\3\2\2\2\u017c\u0170\3\2\2\2\u017c\u0178\3\2\2\2\u017d\60"+
		"\3\2\2\2\u017e\u017f\7c\2\2\u017f\u0180\7n\2\2\u0180\u0181\7\"\2\2\u0181"+
		"\u0182\7p\2\2\u0182\u0183\7q\2\2\u0183\u0184\7t\2\2\u0184\u0185\7v\2\2"+
		"\u0185\u01a1\7g\2\2\u0186\u0187\7c\2\2\u0187\u0188\7n\2\2\u0188\u0189"+
		"\7\"\2\2\u0189\u018a\7u\2\2\u018a\u018b\7w\2\2\u018b\u01a1\7t\2\2\u018c"+
		"\u018d\7c\2\2\u018d\u018e\7n\2\2\u018e\u018f\7\"\2\2\u018f\u0190\7g\2"+
		"\2\u0190\u0191\7u\2\2\u0191\u0192\7v\2\2\u0192\u01a1\7g\2\2\u0193\u0194"+
		"\7c\2\2\u0194\u0195\7n\2\2\u0195\u0196\7\"\2\2\u0196\u0197\7q\2\2\u0197"+
		"\u0198\7g\2\2\u0198\u0199\7u\2\2\u0199\u019a\7v\2\2\u019a\u01a1\7g\2\2"+
		"\u019b\u019c\7t\2\2\u019c\u019d\7g\2\2\u019d\u019e\7e\2\2\u019e\u019f"+
		"\7v\2\2\u019f\u01a1\7q\2\2\u01a0\u017e\3\2\2\2\u01a0\u0186\3\2\2\2\u01a0"+
		"\u018c\3\2\2\2\u01a0\u0193\3\2\2\2\u01a0\u019b\3\2\2\2\u01a1\62\3\2\2"+
		"\2\u01a2\u01a3\7f\2\2\u01a3\u01a4\7w\2\2\u01a4\u01a5\7t\2\2\u01a5\u01a6"+
		"\7c\2\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7v\2\2\u01a8\u01ac\7g\2\2\u01a9"+
		"\u01aa\7g\2\2\u01aa\u01ac\7p\2\2\u01ab\u01a2\3\2\2\2\u01ab\u01a9\3\2\2"+
		"\2\u01ac\64\3\2\2\2\u01ad\u01ae\7c\2\2\u01ae\u01af\7\"\2\2\u01af\u01b0"+
		"\7n\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7\"\2\2\u01b2\u01b3\7f\2\2\u01b3"+
		"\u01b4\7g\2\2\u01b4\u01b5\7t\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7\7e\2\2"+
		"\u01b7\u01b8\7j\2\2\u01b8\u01c8\7c\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb"+
		"\7\"\2\2\u01bb\u01bc\7n\2\2\u01bc\u01bd\7c\2\2\u01bd\u01be\7\"\2\2\u01be"+
		"\u01bf\7k\2\2\u01bf\u01c0\7|\2\2\u01c0\u01c1\7s\2\2\u01c1\u01c2\7w\2\2"+
		"\u01c2\u01c3\7k\2\2\u01c3\u01c4\7g\2\2\u01c4\u01c5\7t\2\2\u01c5\u01c6"+
		"\7f\2\2\u01c6\u01c8\7c\2\2\u01c7\u01ad\3\2\2\2\u01c7\u01b9\3\2\2\2\u01c8"+
		"\66\3\2\2\2\u01c9\u01ca\7m\2\2\u01ca\u01cb\7k\2\2\u01cb\u01cc\7n\2\2\u01cc"+
		"\u01cd\7q\2\2\u01cd\u01ce\7o\2\2\u01ce\u01cf\7g\2\2\u01cf\u01d0\7v\2\2"+
		"\u01d0\u01d1\7t\2\2\u01d1\u01d2\7q\2\2\u01d2\u01e8\7u\2\2\u01d3\u01d4"+
		"\7o\2\2\u01d4\u01d5\7g\2\2\u01d5\u01d6\7v\2\2\u01d6\u01d7\7t\2\2\u01d7"+
		"\u01d8\7q\2\2\u01d8\u01e8\7u\2\2\u01d9\u01da\7m\2\2\u01da\u01db\7k\2\2"+
		"\u01db\u01dc\7n\2\2\u01dc\u01dd\7q\2\2\u01dd\u01de\7o\2\2\u01de\u01df"+
		"\7g\2\2\u01df\u01e0\7v\2\2\u01e0\u01e1\7t\2\2\u01e1\u01e8\7q\2\2\u01e2"+
		"\u01e3\7o\2\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7v\2\2\u01e5\u01e6\7t\2\2"+
		"\u01e6\u01e8\7q\2\2\u01e7\u01c9\3\2\2\2\u01e7\u01d3\3\2\2\2\u01e7\u01d9"+
		"\3\2\2\2\u01e7\u01e2\3\2\2\2\u01e88\3\2\2\2\u01e9\u01ea\7\60\2\2\u01ea"+
		":\3\2\2\2\u01eb\u01ec\7c\2\2\u01ec\u01ed\7e\2\2\u01ed\u01ee\7g\2\2\u01ee"+
		"\u01ef\7n\2\2\u01ef\u01f0\7g\2\2\u01f0\u01f1\7t\2\2\u01f1\u01f2\7c\2\2"+
		"\u01f2<\3\2\2\2\u01f3\u01f4\7r\2\2\u01f4\u01f5\7c\2\2\u01f5\u01f6\7u\2"+
		"\2\u01f6\u01f7\7c\2\2\u01f7\u01f8\7t\2\2\u01f8\u01f9\7\"\2\2\u01f9\u01fa"+
		"\7e\2\2\u01fa\u01fb\7c\2\2\u01fb\u01fc\7o\2\2\u01fc\u01fd\7d\2\2\u01fd"+
		"\u01fe\7k\2\2\u01fe\u01ff\7q\2\2\u01ff\u0200\7\"\2\2\u0200\u0201\7g\2"+
		"\2\u0201\u0202\7p\2\2\u0202>\3\2\2\2\u0203\u0204\7f\2\2\u0204\u0205\7"+
		"g\2\2\u0205\u0206\7t\2\2\u0206\u0207\7t\2\2\u0207\u0208\7c\2\2\u0208\u0209"+
		"\7r\2\2\u0209\u020a\7c\2\2\u020a\u020b\7t\2\2\u020b\u020c\7\"\2\2\u020c"+
		"\u020d\7c\2\2\u020d@\3\2\2\2\u020e\u020f\7q\2\2\u020fB\3\2\2\2\u0210\u0211"+
		"\7{\2\2\u0211D\3\2\2\2\u0212\u0213\7f\2\2\u0213\u0214\7k\2\2\u0214\u0215"+
		"\7u\2\2\u0215\u0216\7v\2\2\u0216\u0217\7c\2\2\u0217\u0218\7p\2\2\u0218"+
		"\u0219\7e\2\2\u0219\u021a\7k\2\2\u021a\u021b\7c\2\2\u021b\u021c\7\"\2"+
		"\2\u021c\u021d\7o\2\2\u021d\u021e\7c\2\2\u021e\u021f\7{\2\2\u021f\u0220"+
		"\7q\2\2\u0220\u0221\7t\2\2\u0221F\3\2\2\2\u0222\u0223\7f\2\2\u0223\u0224"+
		"\7k\2\2\u0224\u0225\7u\2\2\u0225\u0226\7v\2\2\u0226\u0227\7c\2\2\u0227"+
		"\u0228\7p\2\2\u0228\u0229\7e\2\2\u0229\u022a\7k\2\2\u022a\u022b\7c\2\2"+
		"\u022b\u022c\7\"\2\2\u022c\u022d\7o\2\2\u022d\u022e\7g\2\2\u022e\u022f"+
		"\7p\2\2\u022f\u0230\7q\2\2\u0230\u0231\7t\2\2\u0231H\3\2\2\2\u0232\u0233"+
		"\7f\2\2\u0233\u0234\7k\2\2\u0234\u0235\7u\2\2\u0235\u0236\7v\2\2\u0236"+
		"\u0237\7c\2\2\u0237\u0238\7p\2\2\u0238\u0239\7e\2\2\u0239\u023a\7k\2\2"+
		"\u023a\u023b\7c\2\2\u023b\u023c\7\"\2\2\u023c\u023d\7k\2\2\u023d\u023e"+
		"\7i\2\2\u023e\u023f\7w\2\2\u023f\u0240\7c\2\2\u0240\u0241\7n\2\2\u0241"+
		"J\3\2\2\2\u0242\u0243\7f\2\2\u0243\u0244\7k\2\2\u0244\u0245\7u\2\2\u0245"+
		"\u0246\7v\2\2\u0246\u0247\7c\2\2\u0247\u0248\7p\2\2\u0248\u0249\7e\2\2"+
		"\u0249\u024a\7k\2\2\u024a\u024b\7c\2\2\u024b\u024c\7\"\2\2\u024c\u024d"+
		"\7f\2\2\u024d\u024e\7k\2\2\u024e\u024f\7h\2\2\u024f\u0250\7g\2\2\u0250"+
		"\u0251\7t\2\2\u0251\u0252\7g\2\2\u0252\u0253\7p\2\2\u0253\u0254\7v\2\2"+
		"\u0254\u0255\7g\2\2\u0255L\3\2\2\2\u0256\u0258\t\2\2\2\u0257\u0256\3\2"+
		"\2\2\u0258\u0259\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"N\3\2\2\2\u025b\u025d\7/\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025f\3\2\2\2\u025e\u0260\t\3\2\2\u025f\u025e\3\2\2\2\u0260\u0261\3\2"+
		"\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262P\3\2\2\2\u0263\u0265"+
		"\7/\2\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266"+
		"\u0268\t\3\2\2\u0267\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u0267\3\2"+
		"\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\7\60\2\2\u026c"+
		"\u026e\t\3\2\2\u026d\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u026d\3\2"+
		"\2\2\u026f\u0270\3\2\2\2\u0270R\3\2\2\2\u0271\u0273\t\4\2\2\u0272\u0271"+
		"\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u0277\b*\2\2\u0277T\3\2\2\2\17\2\u017c\u01a0\u01ab"+
		"\u01c7\u01e7\u0259\u025c\u0261\u0264\u0269\u026f\u0274\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}