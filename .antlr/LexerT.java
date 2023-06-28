// Generated from e:\\OneDrive - mail.pucv.cl\\7mo semestre\\ICI4242-1 (autómatas)\\proyecto\\entrega final\\Automatas-AnalisisSemantico\\LexerT.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BEGINGPS", "END", "BEGIN", "INPUT", "OUTPUT", "ORDEN", "DIRECCION", 
			"DISTANCIA", "SENTIDO", "MEDIDA", "IGUAL", "ID_SUMA", "ID_RESTA", "ID_MULT", 
			"ID_DIV", "SUMA", "RESTA", "MULT", "DIV", "EXPONENCIAL", "COSENO", "RAIZC", 
			"OR", "AND", "MAYOR", "MENOR", "EQUAL", "NOTEQUAL", "THAN", "IF", "THEN", 
			"MIENTRAS", "DO", "HACERMIENTRAS", "PUNTO", "PARENTESIS_I", "PARENTESIS_D", 
			"VARNAME", "INT", "FLOAT", "WS"
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


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0282\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e1\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0105\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0110\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u012c\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u014c\n\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\6\'\u0262\n\'\r\'\16\'\u0263\3(\5(\u0267"+
		"\n(\3(\6(\u026a\n(\r(\16(\u026b\3)\5)\u026f\n)\3)\6)\u0272\n)\r)\16)\u0273"+
		"\3)\3)\6)\u0278\n)\r)\16)\u0279\3*\6*\u027d\n*\r*\16*\u027e\3*\3*\2\2"+
		"+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2"+
		"\u0294\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\3U\3\2\2\2\5g\3\2\2\2\7\u0080\3\2\2\2\t\u009b\3\2\2\2\13\u00b1"+
		"\3\2\2\2\r\u00e0\3\2\2\2\17\u0104\3\2\2\2\21\u010f\3\2\2\2\23\u012b\3"+
		"\2\2\2\25\u014b\3\2\2\2\27\u014d\3\2\2\2\31\u0150\3\2\2\2\33\u015d\3\2"+
		"\2\2\35\u016d\3\2\2\2\37\u0185\3\2\2\2!\u0193\3\2\2\2#\u0197\3\2\2\2%"+
		"\u019d\3\2\2\2\'\u01b0\3\2\2\2)\u01ba\3\2\2\2+\u01c2\3\2\2\2-\u01d2\3"+
		"\2\2\2/\u01dd\3\2\2\2\61\u01df\3\2\2\2\63\u01e1\3\2\2\2\65\u01f4\3\2\2"+
		"\2\67\u0207\3\2\2\29\u021a\3\2\2\2;\u0231\3\2\2\2=\u0235\3\2\2\2?\u0238"+
		"\3\2\2\2A\u0241\3\2\2\2C\u024a\3\2\2\2E\u0253\3\2\2\2G\u025a\3\2\2\2I"+
		"\u025c\3\2\2\2K\u025e\3\2\2\2M\u0261\3\2\2\2O\u0266\3\2\2\2Q\u026e\3\2"+
		"\2\2S\u027c\3\2\2\2UV\7d\2\2VW\7k\2\2WX\7g\2\2XY\7p\2\2YZ\7x\2\2Z[\7g"+
		"\2\2[\\\7p\2\2\\]\7k\2\2]^\7f\2\2^_\7q\2\2_`\7\"\2\2`a\7c\2\2ab\7n\2\2"+
		"bc\7\"\2\2cd\7i\2\2de\7r\2\2ef\7u\2\2f\4\3\2\2\2gh\7j\2\2hi\7c\2\2ij\7"+
		"u\2\2jk\7\"\2\2kl\7n\2\2lm\7n\2\2mn\7g\2\2no\7i\2\2op\7c\2\2pq\7f\2\2"+
		"qr\7q\2\2rs\7\"\2\2st\7c\2\2tu\7\"\2\2uv\7v\2\2vw\7w\2\2wx\7\"\2\2xy\7"+
		"f\2\2yz\7g\2\2z{\7u\2\2{|\7v\2\2|}\7k\2\2}~\7p\2\2~\177\7q\2\2\177\6\3"+
		"\2\2\2\u0080\u0081\7f\2\2\u0081\u0082\7g\2\2\u0082\u0083\7u\2\2\u0083"+
		"\u0084\7f\2\2\u0084\u0085\7g\2\2\u0085\u0086\7\"\2\2\u0086\u0087\7v\2"+
		"\2\u0087\u0088\7w\2\2\u0088\u0089\7\"\2\2\u0089\u008a\7w\2\2\u008a\u008b"+
		"\7d\2\2\u008b\u008c\7k\2\2\u008c\u008d\7e\2\2\u008d\u008e\7c\2\2\u008e"+
		"\u008f\7e\2\2\u008f\u0090\7k\2\2\u0090\u0091\7q\2\2\u0091\u0092\7p\2\2"+
		"\u0092\u0093\7\"\2\2\u0093\u0094\7c\2\2\u0094\u0095\7e\2\2\u0095\u0096"+
		"\7v\2\2\u0096\u0097\7w\2\2\u0097\u0098\7c\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7.\2\2\u009a\b\3\2\2\2\u009b\u009c\7r\2\2\u009c\u009d\7t\2\2\u009d"+
		"\u009e\7g\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7t\2\2"+
		"\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5"+
		"\7k\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7\"\2\2\u00a8"+
		"\u00a9\7f\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7t\2"+
		"\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7c\2\2\u00af\u00b0"+
		"\7<\2\2\u00b0\n\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4"+
		"\7f\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7e\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7p\2\2"+
		"\u00bb\u00bc\7g\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7\"\2\2\u00be\u00bf"+
		"\7f\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7\"\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7w\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7<\2\2"+
		"\u00c6\f\3\2\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7t"+
		"\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7i\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7v\2\2\u00ce\u00e1\7g\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7k\2\2\u00d1"+
		"\u00d2\7i\2\2\u00d2\u00d3\7w\2\2\u00d3\u00e1\7g\2\2\u00d4\u00d5\7e\2\2"+
		"\u00d5\u00d6\7q\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7w\2\2\u00db\u00e1\7c\2\2\u00dc"+
		"\u00dd\7i\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7t\2\2\u00df\u00e1\7c\2\2"+
		"\u00e0\u00c7\3\2\2\2\u00e0\u00cf\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e0\u00dc"+
		"\3\2\2\2\u00e1\16\3\2\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7n\2\2\u00e4"+
		"\u00e5\7\"\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7t\2"+
		"\2\u00e8\u00e9\7v\2\2\u00e9\u0105\7g\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec"+
		"\7n\2\2\u00ec\u00ed\7\"\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7w\2\2\u00ef"+
		"\u0105\7t\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7\"\2"+
		"\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7v\2\2\u00f6\u0105"+
		"\7g\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7\"\2\2\u00fa"+
		"\u00fb\7q\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7v\2\2"+
		"\u00fe\u0105\7g\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7g\2\2\u0101\u0102"+
		"\7e\2\2\u0102\u0103\7v\2\2\u0103\u0105\7q\2\2\u0104\u00e2\3\2\2\2\u0104"+
		"\u00ea\3\2\2\2\u0104\u00f0\3\2\2\2\u0104\u00f7\3\2\2\2\u0104\u00ff\3\2"+
		"\2\2\u0105\20\3\2\2\2\u0106\u0107\7f\2\2\u0107\u0108\7w\2\2\u0108\u0109"+
		"\7t\2\2\u0109\u010a\7c\2\2\u010a\u010b\7p\2\2\u010b\u010c\7v\2\2\u010c"+
		"\u0110\7g\2\2\u010d\u010e\7g\2\2\u010e\u0110\7p\2\2\u010f\u0106\3\2\2"+
		"\2\u010f\u010d\3\2\2\2\u0110\22\3\2\2\2\u0111\u0112\7c\2\2\u0112\u0113"+
		"\7\"\2\2\u0113\u0114\7n\2\2\u0114\u0115\7c\2\2\u0115\u0116\7\"\2\2\u0116"+
		"\u0117\7f\2\2\u0117\u0118\7g\2\2\u0118\u0119\7t\2\2\u0119\u011a\7g\2\2"+
		"\u011a\u011b\7e\2\2\u011b\u011c\7j\2\2\u011c\u012c\7c\2\2\u011d\u011e"+
		"\7c\2\2\u011e\u011f\7\"\2\2\u011f\u0120\7n\2\2\u0120\u0121\7c\2\2\u0121"+
		"\u0122\7\"\2\2\u0122\u0123\7k\2\2\u0123\u0124\7|\2\2\u0124\u0125\7s\2"+
		"\2\u0125\u0126\7w\2\2\u0126\u0127\7k\2\2\u0127\u0128\7g\2\2\u0128\u0129"+
		"\7t\2\2\u0129\u012a\7f\2\2\u012a\u012c\7c\2\2\u012b\u0111\3\2\2\2\u012b"+
		"\u011d\3\2\2\2\u012c\24\3\2\2\2\u012d\u012e\7m\2\2\u012e\u012f\7k\2\2"+
		"\u012f\u0130\7n\2\2\u0130\u0131\7q\2\2\u0131\u0132\7o\2\2\u0132\u0133"+
		"\7g\2\2\u0133\u0134\7v\2\2\u0134\u0135\7t\2\2\u0135\u0136\7q\2\2\u0136"+
		"\u014c\7u\2\2\u0137\u0138\7o\2\2\u0138\u0139\7g\2\2\u0139\u013a\7v\2\2"+
		"\u013a\u013b\7t\2\2\u013b\u013c\7q\2\2\u013c\u014c\7u\2\2\u013d\u013e"+
		"\7m\2\2\u013e\u013f\7k\2\2\u013f\u0140\7n\2\2\u0140\u0141\7q\2\2\u0141"+
		"\u0142\7o\2\2\u0142\u0143\7g\2\2\u0143\u0144\7v\2\2\u0144\u0145\7t\2\2"+
		"\u0145\u014c\7q\2\2\u0146\u0147\7o\2\2\u0147\u0148\7g\2\2\u0148\u0149"+
		"\7v\2\2\u0149\u014a\7t\2\2\u014a\u014c\7q\2\2\u014b\u012d\3\2\2\2\u014b"+
		"\u0137\3\2\2\2\u014b\u013d\3\2\2\2\u014b\u0146\3\2\2\2\u014c\26\3\2\2"+
		"\2\u014d\u014e\7g\2\2\u014e\u014f\7u\2\2\u014f\30\3\2\2\2\u0150\u0151"+
		"\7v\2\2\u0151\u0152\7q\2\2\u0152\u0153\7o\2\2\u0153\u0154\7c\2\2\u0154"+
		"\u0155\7t\2\2\u0155\u0156\7\"\2\2\u0156\u0157\7u\2\2\u0157\u0158\7c\2"+
		"\2\u0158\u0159\7n\2\2\u0159\u015a\7k\2\2\u015a\u015b\7f\2\2\u015b\u015c"+
		"\7c\2\2\u015c\32\3\2\2\2\u015d\u015e\7e\2\2\u015e\u015f\7q\2\2\u015f\u0160"+
		"\7t\2\2\u0160\u0161\7v\2\2\u0161\u0162\7g\2\2\u0162\u0163\7\"\2\2\u0163"+
		"\u0164\7e\2\2\u0164\u0165\7c\2\2\u0165\u0166\7o\2\2\u0166\u0167\7k\2\2"+
		"\u0167\u0168\7p\2\2\u0168\u0169\7q\2\2\u0169\u016a\7\"\2\2\u016a\u016b"+
		"\7g\2\2\u016b\u016c\7p\2\2\u016c\34\3\2\2\2\u016d\u016e\7t\2\2\u016e\u016f"+
		"\7g\2\2\u016f\u0170\7c\2\2\u0170\u0171\7n\2\2\u0171\u0172\7k\2\2\u0172"+
		"\u0173\7e\2\2\u0173\u0174\7g\2\2\u0174\u0175\7\"\2\2\u0175\u0176\7w\2"+
		"\2\u0176\u0177\7p\2\2\u0177\u0178\7\"\2\2\u0178\u0179\7t\2\2\u0179\u017a"+
		"\7g\2\2\u017a\u017b\7e\2\2\u017b\u017c\7q\2\2\u017c\u017d\7t\2\2\u017d"+
		"\u017e\7t\2\2\u017e\u017f\7k\2\2\u017f\u0180\7f\2\2\u0180\u0181\7q\2\2"+
		"\u0181\u0182\7\"\2\2\u0182\u0183\7f\2\2\u0183\u0184\7g\2\2\u0184\36\3"+
		"\2\2\2\u0185\u0186\7r\2\2\u0186\u0187\7c\2\2\u0187\u0188\7t\2\2\u0188"+
		"\u0189\7c\2\2\u0189\u018a\7\"\2\2\u018a\u018b\7n\2\2\u018b\u018c\7n\2"+
		"\2\u018c\u018d\7g\2\2\u018d\u018e\7i\2\2\u018e\u018f\7c\2\2\u018f\u0190"+
		"\7t\2\2\u0190\u0191\7\"\2\2\u0191\u0192\7c\2\2\u0192 \3\2\2\2\u0193\u0194"+
		"\7e\2\2\u0194\u0195\7q\2\2\u0195\u0196\7p\2\2\u0196\"\3\2\2\2\u0197\u0198"+
		"\7j\2\2\u0198\u0199\7c\2\2\u0199\u019a\7e\2\2\u019a\u019b\7k\2\2\u019b"+
		"\u019c\7c\2\2\u019c$\3\2\2\2\u019d\u019e\7x\2\2\u019e\u019f\7g\2\2\u019f"+
		"\u01a0\7e\2\2\u01a0\u01a1\7g\2\2\u01a1\u01a2\7u\2\2\u01a2\u01a3\7\"\2"+
		"\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7n\2\2\u01a5\u01a6\7t\2\2\u01a6\u01a7"+
		"\7g\2\2\u01a7\u01a8\7f\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7f\2\2\u01aa"+
		"\u01ab\7q\2\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7\"\2\2\u01ad\u01ae\7f\2"+
		"\2\u01ae\u01af\7g\2\2\u01af&\3\2\2\2\u01b0\u01b1\7f\2\2\u01b1\u01b2\7"+
		"g\2\2\u01b2\u01b3\7u\2\2\u01b3\u01b4\7x\2\2\u01b4\u01b5\7k\2\2\u01b5\u01b6"+
		"\7c\2\2\u01b6\u01b7\7\"\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7p\2\2\u01b9"+
		"(\3\2\2\2\u01ba\u01bb\7c\2\2\u01bb\u01bc\7e\2\2\u01bc\u01bd\7g\2\2\u01bd"+
		"\u01be\7n\2\2\u01be\u01bf\7g\2\2\u01bf\u01c0\7t\2\2\u01c0\u01c1\7c\2\2"+
		"\u01c1*\3\2\2\2\u01c2\u01c3\7r\2\2\u01c3\u01c4\7c\2\2\u01c4\u01c5\7u\2"+
		"\2\u01c5\u01c6\7c\2\2\u01c6\u01c7\7t\2\2\u01c7\u01c8\7\"\2\2\u01c8\u01c9"+
		"\7e\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7o\2\2\u01cb\u01cc\7d\2\2\u01cc"+
		"\u01cd\7k\2\2\u01cd\u01ce\7q\2\2\u01ce\u01cf\7\"\2\2\u01cf\u01d0\7g\2"+
		"\2\u01d0\u01d1\7p\2\2\u01d1,\3\2\2\2\u01d2\u01d3\7f\2\2\u01d3\u01d4\7"+
		"g\2\2\u01d4\u01d5\7t\2\2\u01d5\u01d6\7t\2\2\u01d6\u01d7\7c\2\2\u01d7\u01d8"+
		"\7r\2\2\u01d8\u01d9\7c\2\2\u01d9\u01da\7t\2\2\u01da\u01db\7\"\2\2\u01db"+
		"\u01dc\7c\2\2\u01dc.\3\2\2\2\u01dd\u01de\7q\2\2\u01de\60\3\2\2\2\u01df"+
		"\u01e0\7{\2\2\u01e0\62\3\2\2\2\u01e1\u01e2\7g\2\2\u01e2\u01e3\7u\2\2\u01e3"+
		"\u01e4\7\"\2\2\u01e4\u01e5\7f\2\2\u01e5\u01e6\7k\2\2\u01e6\u01e7\7u\2"+
		"\2\u01e7\u01e8\7v\2\2\u01e8\u01e9\7c\2\2\u01e9\u01ea\7p\2\2\u01ea\u01eb"+
		"\7e\2\2\u01eb\u01ec\7k\2\2\u01ec\u01ed\7c\2\2\u01ed\u01ee\7\"\2\2\u01ee"+
		"\u01ef\7o\2\2\u01ef\u01f0\7c\2\2\u01f0\u01f1\7{\2\2\u01f1\u01f2\7q\2\2"+
		"\u01f2\u01f3\7t\2\2\u01f3\64\3\2\2\2\u01f4\u01f5\7g\2\2\u01f5\u01f6\7"+
		"u\2\2\u01f6\u01f7\7\"\2\2\u01f7\u01f8\7f\2\2\u01f8\u01f9\7k\2\2\u01f9"+
		"\u01fa\7u\2\2\u01fa\u01fb\7v\2\2\u01fb\u01fc\7c\2\2\u01fc\u01fd\7p\2\2"+
		"\u01fd\u01fe\7e\2\2\u01fe\u01ff\7k\2\2\u01ff\u0200\7c\2\2\u0200\u0201"+
		"\7\"\2\2\u0201\u0202\7o\2\2\u0202\u0203\7g\2\2\u0203\u0204\7p\2\2\u0204"+
		"\u0205\7q\2\2\u0205\u0206\7t\2\2\u0206\66\3\2\2\2\u0207\u0208\7g\2\2\u0208"+
		"\u0209\7u\2\2\u0209\u020a\7\"\2\2\u020a\u020b\7f\2\2\u020b\u020c\7k\2"+
		"\2\u020c\u020d\7u\2\2\u020d\u020e\7v\2\2\u020e\u020f\7c\2\2\u020f\u0210"+
		"\7p\2\2\u0210\u0211\7e\2\2\u0211\u0212\7k\2\2\u0212\u0213\7c\2\2\u0213"+
		"\u0214\7\"\2\2\u0214\u0215\7k\2\2\u0215\u0216\7i\2\2\u0216\u0217\7w\2"+
		"\2\u0217\u0218\7c\2\2\u0218\u0219\7n\2\2\u02198\3\2\2\2\u021a\u021b\7"+
		"g\2\2\u021b\u021c\7u\2\2\u021c\u021d\7\"\2\2\u021d\u021e\7f\2\2\u021e"+
		"\u021f\7k\2\2\u021f\u0220\7u\2\2\u0220\u0221\7v\2\2\u0221\u0222\7c\2\2"+
		"\u0222\u0223\7p\2\2\u0223\u0224\7e\2\2\u0224\u0225\7k\2\2\u0225\u0226"+
		"\7c\2\2\u0226\u0227\7\"\2\2\u0227\u0228\7f\2\2\u0228\u0229\7k\2\2\u0229"+
		"\u022a\7h\2\2\u022a\u022b\7g\2\2\u022b\u022c\7t\2\2\u022c\u022d\7g\2\2"+
		"\u022d\u022e\7p\2\2\u022e\u022f\7v\2\2\u022f\u0230\7g\2\2\u0230:\3\2\2"+
		"\2\u0231\u0232\7s\2\2\u0232\u0233\7w\2\2\u0233\u0234\7g\2\2\u0234<\3\2"+
		"\2\2\u0235\u0236\7u\2\2\u0236\u0237\7k\2\2\u0237>\3\2\2\2\u0238\u0239"+
		"\7g\2\2\u0239\u023a\7p\2\2\u023a\u023b\7v\2\2\u023b\u023c\7q\2\2\u023c"+
		"\u023d\7p\2\2\u023d\u023e\7e\2\2\u023e\u023f\7g\2\2\u023f\u0240\7u\2\2"+
		"\u0240@\3\2\2\2\u0241\u0242\7o\2\2\u0242\u0243\7k\2\2\u0243\u0244\7g\2"+
		"\2\u0244\u0245\7p\2\2\u0245\u0246\7v\2\2\u0246\u0247\7t\2\2\u0247\u0248"+
		"\7c\2\2\u0248\u0249\7u\2\2\u0249B\3\2\2\2\u024a\u024b\7e\2\2\u024b\u024c"+
		"\7q\2\2\u024c\u024d\7p\2\2\u024d\u024e\7f\2\2\u024e\u024f\7w\2\2\u024f"+
		"\u0250\7|\2\2\u0250\u0251\7e\2\2\u0251\u0252\7c\2\2\u0252D\3\2\2\2\u0253"+
		"\u0254\7e\2\2\u0254\u0255\7w\2\2\u0255\u0256\7c\2\2\u0256\u0257\7p\2\2"+
		"\u0257\u0258\7f\2\2\u0258\u0259\7q\2\2\u0259F\3\2\2\2\u025a\u025b\7\60"+
		"\2\2\u025bH\3\2\2\2\u025c\u025d\7*\2\2\u025dJ\3\2\2\2\u025e\u025f\7+\2"+
		"\2\u025fL\3\2\2\2\u0260\u0262\t\2\2\2\u0261\u0260\3\2\2\2\u0262\u0263"+
		"\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264N\3\2\2\2\u0265"+
		"\u0267\7/\2\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2"+
		"\2\2\u0268\u026a\t\3\2\2\u0269\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026cP\3\2\2\2\u026d\u026f\7/\2\2\u026e"+
		"\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271\3\2\2\2\u0270\u0272\t\3"+
		"\2\2\u0271\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0271\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\7\60\2\2\u0276\u0278\t"+
		"\3\2\2\u0277\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u0277\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027aR\3\2\2\2\u027b\u027d\t\4\2\2\u027c\u027b\3\2\2\2"+
		"\u027d\u027e\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280"+
		"\3\2\2\2\u0280\u0281\b*\2\2\u0281T\3\2\2\2\17\2\u00e0\u0104\u010f\u012b"+
		"\u014b\u0263\u0266\u026b\u026e\u0273\u0279\u027e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}