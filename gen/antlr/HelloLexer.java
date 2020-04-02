// Generated from /home/polinb/IdeaProjects/Test/src/main/java/antlr/Hello.g4 by ANTLR 4.7.2
package antlr;

    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, IF=3, ELSE=4, WHILE=5, USING=6, NAMESPACE=7, STD=8, SEMICLONE=9, 
		LONG=10, LONGLONG=11, INT=12, BOOL=13, RETURN=14, EQ=15, DEQ=16, NOT_EQ=17, 
		LS=18, GT=19, LSEQ=20, GTEQ=21, CIN=22, COUT=23, DCOLON=24, DLEFT=25, 
		DRIGHT=26, ENDL=27, TRUE=28, FALSE=29, INTEGER=30, PLUS=31, MUL=32, INCLUDE=33, 
		INCLUDE_NAME=34, MAIN=35, LPF=36, RPF=37, VARIABLE_NAME=38, WS=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAR", "RPAR", "IF", "ELSE", "WHILE", "USING", "NAMESPACE", "STD", "SEMICLONE", 
			"LONG", "LONGLONG", "INT", "BOOL", "RETURN", "EQ", "DEQ", "NOT_EQ", "LS", 
			"GT", "LSEQ", "GTEQ", "CIN", "COUT", "DCOLON", "DLEFT", "DRIGHT", "ENDL", 
			"TRUE", "FALSE", "INTEGER", "PLUS", "MUL", "INCLUDE", "INCLUDE_NAME", 
			"MAIN", "LPF", "RPF", "VARIABLE_NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'if'", "'else'", "'while'", "'using'", "'namespace'", 
			"'std'", "';'", "'long'", "'long long'", "'int'", "'bool'", "'return'", 
			"'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'cin'", "'cout'", 
			"'::'", "'<<'", "'>>'", "'endl'", "'true'", "'false'", null, "'+'", "'*'", 
			"'#include'", null, "'int main()'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAR", "RPAR", "IF", "ELSE", "WHILE", "USING", "NAMESPACE", "STD", 
			"SEMICLONE", "LONG", "LONGLONG", "INT", "BOOL", "RETURN", "EQ", "DEQ", 
			"NOT_EQ", "LS", "GT", "LSEQ", "GTEQ", "CIN", "COUT", "DCOLON", "DLEFT", 
			"DRIGHT", "ENDL", "TRUE", "FALSE", "INTEGER", "PLUS", "MUL", "INCLUDE", 
			"INCLUDE_NAME", "MAIN", "LPF", "RPF", "VARIABLE_NAME", "WS"
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


	    private static Random random = new Random();

	    private static int getRandom() {
	        int x = random.nextInt();
	        return x > 0 ? x : -x;
	    }

	    private static String addNewVariable(ArrayList<String> addedVariables, ArrayList<String> variables, int index) {
	        StringBuilder sb = new StringBuilder();
	        int randOp = getRandom() % 3;
	        String type = getType(getRandom());
	        String name = getVariableName(index);
	        String rightPart = "";
	        switch (randOp) {
	            case 0: {
	                if (addedVariables.size() == 0) {
	                    rightPart = Integer.toString(getRandom() % 1000);
	                } else {
	                    rightPart = addedVariables.get(getRandom() % addedVariables.size());
	                }
	                break;
	            }
	            case 1: {
	                if (variables.size() == 0) {
	                    rightPart = Integer.toString(getRandom() % 1000);
	                } else {
	                    rightPart = variables.get(getRandom() % variables.size());
	                }
	                break;
	            }
	            case 2: {
	                rightPart = Integer.toString(getRandom() % 1000);
	            }
	        }
	        sb.append(type).append(" ").append(name).append(" = ").append(rightPart).append(";");
	        addedVariables.add(name);
	        return sb.toString();
	    }

	    private static String addActionWithVariable(ArrayList<String> addedVariables, ArrayList<String> variables) {
	        StringBuilder sb = new StringBuilder();
	        int randOp = getRandom() % 3;
	        String name = addedVariables.get(getRandom() % addedVariables.size());
	        String rightPart = "";
	        switch (randOp) {
	            case 0: {
	                rightPart = addedVariables.get(getRandom() % addedVariables.size());
	                break;
	            }
	            case 1: {
	                if (variables.size() == 0) {
	                    rightPart = Integer.toString(getRandom() % 1000);
	                } else {
	                    rightPart = addedVariables.get(getRandom() % addedVariables.size());
	                }
	                break;
	            }
	            case 2: {
	                rightPart = Integer.toString(getRandom() % 1000);
	            }
	        }
	        sb.append(name).append(" = ").append(rightPart).append(";");

	        return sb.toString();
	    }

	    private static String getVariableName(int index) {
	        int curNumber = index / 2;
	        StringBuilder name = new StringBuilder();
	        while (curNumber != 0) {
	            switch (curNumber % 4) {
	                case 0:
	                    name.insert(0, Integer.toString(0));
	                    break;
	                case 1:
	                    name.insert(0, 'O');
	                    break;
	                case 2:
	                    name.insert(0, Integer.toString(1));
	                    break;
	                case 3:
	                    name.insert(0, 'I');
	                    break;
	            }
	            curNumber /= 4;
	        }
	        if (index % 2 == 0) {
	            name.insert(0, 'O');
	        } else {
	            name.insert(0, 'I');
	        }
	        return name.toString();
	    }

	    private static String getType(int ind) {
	        ind %= 4;
	        switch (ind) {
	            case 0:
	                return "long";
	            case 1:
	                return "long long";
	            case 2:
	                return "int";
	            case 3:
	                return "bool";
	        }
	        return "";
	    }


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\5\37\u00ce"+
		"\n\37\3\37\3\37\7\37\u00d2\n\37\f\37\16\37\u00d5\13\37\3\37\5\37\u00d8"+
		"\n\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u00ea"+
		"\n#\f#\16#\u00ed\13#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\7\'\u0102\n\'\f\'\16\'\u0105\13\'\3(\6(\u0108\n(\r(\16(\u0109"+
		"\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\b\3\2\63;\3\2\62;\4\2C\\c|\7\2\60"+
		"\60C\\^^aac|\6\2\62;C\\aac|\4\2\13\f\"\"\2\u0112\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tX\3\2\2\2\13"+
		"]\3\2\2\2\rc\3\2\2\2\17i\3\2\2\2\21s\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27"+
		"~\3\2\2\2\31\u0088\3\2\2\2\33\u008c\3\2\2\2\35\u0091\3\2\2\2\37\u0098"+
		"\3\2\2\2!\u009a\3\2\2\2#\u009d\3\2\2\2%\u00a0\3\2\2\2\'\u00a2\3\2\2\2"+
		")\u00a4\3\2\2\2+\u00a7\3\2\2\2-\u00aa\3\2\2\2/\u00ae\3\2\2\2\61\u00b3"+
		"\3\2\2\2\63\u00b6\3\2\2\2\65\u00b9\3\2\2\2\67\u00bc\3\2\2\29\u00c1\3\2"+
		"\2\2;\u00c6\3\2\2\2=\u00d7\3\2\2\2?\u00d9\3\2\2\2A\u00db\3\2\2\2C\u00dd"+
		"\3\2\2\2E\u00e6\3\2\2\2G\u00f0\3\2\2\2I\u00fb\3\2\2\2K\u00fd\3\2\2\2M"+
		"\u00ff\3\2\2\2O\u0107\3\2\2\2QR\7*\2\2R\4\3\2\2\2ST\7+\2\2T\6\3\2\2\2"+
		"UV\7k\2\2VW\7h\2\2W\b\3\2\2\2XY\7g\2\2YZ\7n\2\2Z[\7u\2\2[\\\7g\2\2\\\n"+
		"\3\2\2\2]^\7y\2\2^_\7j\2\2_`\7k\2\2`a\7n\2\2ab\7g\2\2b\f\3\2\2\2cd\7w"+
		"\2\2de\7u\2\2ef\7k\2\2fg\7p\2\2gh\7i\2\2h\16\3\2\2\2ij\7p\2\2jk\7c\2\2"+
		"kl\7o\2\2lm\7g\2\2mn\7u\2\2no\7r\2\2op\7c\2\2pq\7e\2\2qr\7g\2\2r\20\3"+
		"\2\2\2st\7u\2\2tu\7v\2\2uv\7f\2\2v\22\3\2\2\2wx\7=\2\2x\24\3\2\2\2yz\7"+
		"n\2\2z{\7q\2\2{|\7p\2\2|}\7i\2\2}\26\3\2\2\2~\177\7n\2\2\177\u0080\7q"+
		"\2\2\u0080\u0081\7p\2\2\u0081\u0082\7i\2\2\u0082\u0083\7\"\2\2\u0083\u0084"+
		"\7n\2\2\u0084\u0085\7q\2\2\u0085\u0086\7p\2\2\u0086\u0087\7i\2\2\u0087"+
		"\30\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a\u008b\7v\2\2\u008b"+
		"\32\3\2\2\2\u008c\u008d\7d\2\2\u008d\u008e\7q\2\2\u008e\u008f\7q\2\2\u008f"+
		"\u0090\7n\2\2\u0090\34\3\2\2\2\u0091\u0092\7t\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u0095\7w\2\2\u0095\u0096\7t\2\2\u0096\u0097\7p\2\2"+
		"\u0097\36\3\2\2\2\u0098\u0099\7?\2\2\u0099 \3\2\2\2\u009a\u009b\7?\2\2"+
		"\u009b\u009c\7?\2\2\u009c\"\3\2\2\2\u009d\u009e\7#\2\2\u009e\u009f\7?"+
		"\2\2\u009f$\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7@\2"+
		"\2\u00a3(\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5\u00a6\7?\2\2\u00a6*\3\2\2\2"+
		"\u00a7\u00a8\7@\2\2\u00a8\u00a9\7?\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7e\2"+
		"\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad.\3\2\2\2\u00ae\u00af\7"+
		"e\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7v\2\2\u00b2\60"+
		"\3\2\2\2\u00b3\u00b4\7<\2\2\u00b4\u00b5\7<\2\2\u00b5\62\3\2\2\2\u00b6"+
		"\u00b7\7>\2\2\u00b7\u00b8\7>\2\2\u00b8\64\3\2\2\2\u00b9\u00ba\7@\2\2\u00ba"+
		"\u00bb\7@\2\2\u00bb\66\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7p\2\2\u00be"+
		"\u00bf\7f\2\2\u00bf\u00c0\7n\2\2\u00c08\3\2\2\2\u00c1\u00c2\7v\2\2\u00c2"+
		"\u00c3\7t\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7g\2\2\u00c5:\3\2\2\2\u00c6"+
		"\u00c7\7h\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7u\2\2"+
		"\u00ca\u00cb\7g\2\2\u00cb<\3\2\2\2\u00cc\u00ce\7/\2\2\u00cd\u00cc\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d3\t\2\2\2\u00d0"+
		"\u00d2\t\3\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d8\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d8\7\62\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8>\3\2\2\2"+
		"\u00d9\u00da\7-\2\2\u00da@\3\2\2\2\u00db\u00dc\7,\2\2\u00dcB\3\2\2\2\u00dd"+
		"\u00de\7%\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7e\2\2"+
		"\u00e1\u00e2\7n\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5"+
		"\7g\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7>\2\2\u00e7\u00eb\t\4\2\2\u00e8\u00ea"+
		"\t\5\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7@"+
		"\2\2\u00efF\3\2\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3"+
		"\7v\2\2\u00f3\u00f4\7\"\2\2\u00f4\u00f5\7o\2\2\u00f5\u00f6\7c\2\2\u00f6"+
		"\u00f7\7k\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7*\2\2\u00f9\u00fa\7+\2\2"+
		"\u00faH\3\2\2\2\u00fb\u00fc\7}\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\7\177\2"+
		"\2\u00feL\3\2\2\2\u00ff\u0103\t\4\2\2\u0100\u0102\t\6\2\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"N\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\t\7\2\2\u0107\u0106\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010c\b(\2\2\u010cP\3\2\2\2\t\2\u00cd\u00d3\u00d7\u00eb"+
		"\u0103\u0109\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}