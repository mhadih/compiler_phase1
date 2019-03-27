// Generated from /home/hadi/Desktop/compiler/compiler_phase1/PLC_Spring98_Toorla/grammar/Toorla.g4 by ANTLR 4.7.2

    import toorla.ast.expression.binaryExpression.*;
    import toorla.ast.expression.value.*;
    import toorla.ast.expression.*;
    import toorla.ast.statement.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToorlaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUMBER=7, WS=8;
	public static final int
		RULE_program = 0, RULE_additionExp = 1, RULE_temp_add = 2, RULE_multiplyExp = 3, 
		RULE_atomExp = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "additionExp", "temp_add", "multiplyExp", "atomExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Toorla.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int counter;
	    void print()
	    {
	        System.out.println( "hello" );
	    }

	public ToorlaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Expression expression;
		public AdditionExpContext expr;
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((ProgramContext)_localctx).expr = additionExp();

			        ((ProgramContext)_localctx).expression =  ((ProgramContext)_localctx).expr.expression;
			        System.out.println( counter );
			        print();
			    
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

	public static class AdditionExpContext extends ParserRuleContext {
		public Expression expression;
		public MultiplyExpContext first;
		public Temp_addContext finalExpr;
		public MultiplyExpContext multiplyExp() {
			return getRuleContext(MultiplyExpContext.class,0);
		}
		public Temp_addContext temp_add() {
			return getRuleContext(Temp_addContext.class,0);
		}
		public AdditionExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterAdditionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitAdditionExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitAdditionExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExpContext additionExp() throws RecognitionException {
		AdditionExpContext _localctx = new AdditionExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_additionExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			((AdditionExpContext)_localctx).first = multiplyExp();
			setState(14);
			((AdditionExpContext)_localctx).finalExpr = temp_add( ((AdditionExpContext)_localctx).first.expression );

			            ((AdditionExpContext)_localctx).expression =  ((AdditionExpContext)_localctx).finalExpr.expression;
			         
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

	public static class Temp_addContext extends ParserRuleContext {
		public Expression operand;
		public Expression expression;
		public BinaryExpression immediateExpression;
		public Token operator;
		public MultiplyExpContext second;
		public Temp_addContext finalExpr;
		public MultiplyExpContext multiplyExp() {
			return getRuleContext(MultiplyExpContext.class,0);
		}
		public Temp_addContext temp_add() {
			return getRuleContext(Temp_addContext.class,0);
		}
		public Temp_addContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Temp_addContext(ParserRuleContext parent, int invokingState, Expression operand) {
			super(parent, invokingState);
			this.operand = operand;
		}
		@Override public int getRuleIndex() { return RULE_temp_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterTemp_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitTemp_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitTemp_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temp_addContext temp_add(Expression operand) throws RecognitionException {
		Temp_addContext _localctx = new Temp_addContext(_ctx, getState(), operand);
		enterRule(_localctx, 4, RULE_temp_add);
		int _la;
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				((Temp_addContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((Temp_addContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(18);
				((Temp_addContext)_localctx).second = multiplyExp();

				           if( (((Temp_addContext)_localctx).operator!=null?((Temp_addContext)_localctx).operator.getText():null).equals( "+" ) )
				                ((Temp_addContext)_localctx).immediateExpression =  new Plus( _localctx.operand , ((Temp_addContext)_localctx).second.expression );
				           else if( (((Temp_addContext)_localctx).operator!=null?((Temp_addContext)_localctx).operator.getText():null).equals( "-" ) )
				                ((Temp_addContext)_localctx).immediateExpression =  new Minus( _localctx.operand , ((Temp_addContext)_localctx).second.expression );
				    
				setState(20);
				((Temp_addContext)_localctx).finalExpr = temp_add( _localctx.immediateExpression );

				        ((Temp_addContext)_localctx).expression =  ((Temp_addContext)_localctx).finalExpr.expression;
				    
				}
				break;
			case EOF:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{

				        ((Temp_addContext)_localctx).expression =  _localctx.operand;
				    
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

	public static class MultiplyExpContext extends ParserRuleContext {
		public Expression expression;
		public BinaryExpression immediate;
		public AtomExpContext first;
		public AtomExpContext second;
		public List<AtomExpContext> atomExp() {
			return getRuleContexts(AtomExpContext.class);
		}
		public AtomExpContext atomExp(int i) {
			return getRuleContext(AtomExpContext.class,i);
		}
		public MultiplyExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterMultiplyExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitMultiplyExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitMultiplyExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyExpContext multiplyExp() throws RecognitionException {
		MultiplyExpContext _localctx = new MultiplyExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multiplyExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((MultiplyExpContext)_localctx).first = atomExp();

			            ((MultiplyExpContext)_localctx).expression =  ((MultiplyExpContext)_localctx).first.expression;
			         
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(28);
					match(T__2);
					setState(29);
					((MultiplyExpContext)_localctx).second = atomExp();

					                ((MultiplyExpContext)_localctx).immediate =  new Times( _localctx.expression , ((MultiplyExpContext)_localctx).second.expression );
					                ((MultiplyExpContext)_localctx).expression =  _localctx.immediate;
					             
					}
					break;
				case T__3:
					{
					setState(32);
					match(T__3);
					setState(33);
					((MultiplyExpContext)_localctx).second = atomExp();

					                ((MultiplyExpContext)_localctx).immediate =  new Division( _localctx.expression , ((MultiplyExpContext)_localctx).second.expression );
					                ((MultiplyExpContext)_localctx).expression =  _localctx.immediate;
					             
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40);
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

	public static class AtomExpContext extends ParserRuleContext {
		public Expression expression;
		public Token value;
		public Token leftPara;
		public AdditionExpContext expr;
		public TerminalNode NUMBER() { return getToken(ToorlaParser.NUMBER, 0); }
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public AtomExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitAtomExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitAtomExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExpContext atomExp() throws RecognitionException {
		AtomExpContext _localctx = new AtomExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atomExp);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((AtomExpContext)_localctx).value = match(NUMBER);

				        ((AtomExpContext)_localctx).expression =  new IntValue( (((AtomExpContext)_localctx).value!=null?Integer.valueOf(((AtomExpContext)_localctx).value.getText()):0) );
				    
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((AtomExpContext)_localctx).leftPara = match(T__4);
				setState(44);
				((AtomExpContext)_localctx).expr = additionExp();
				setState(45);
				match(T__5);

				        ((AtomExpContext)_localctx).expression =  ((AtomExpContext)_localctx).expr.expression;
				    
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\33\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"\'\n\5\f\5\16\5*\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\63\n\6\3\6\2\2\7"+
		"\2\4\6\b\n\2\3\3\2\3\4\2\63\2\f\3\2\2\2\4\17\3\2\2\2\6\32\3\2\2\2\b\34"+
		"\3\2\2\2\n\62\3\2\2\2\f\r\5\4\3\2\r\16\b\2\1\2\16\3\3\2\2\2\17\20\5\b"+
		"\5\2\20\21\5\6\4\2\21\22\b\3\1\2\22\5\3\2\2\2\23\24\t\2\2\2\24\25\5\b"+
		"\5\2\25\26\b\4\1\2\26\27\5\6\4\2\27\30\b\4\1\2\30\33\3\2\2\2\31\33\b\4"+
		"\1\2\32\23\3\2\2\2\32\31\3\2\2\2\33\7\3\2\2\2\34\35\5\n\6\2\35(\b\5\1"+
		"\2\36\37\7\5\2\2\37 \5\n\6\2 !\b\5\1\2!\'\3\2\2\2\"#\7\6\2\2#$\5\n\6\2"+
		"$%\b\5\1\2%\'\3\2\2\2&\36\3\2\2\2&\"\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3"+
		"\2\2\2)\t\3\2\2\2*(\3\2\2\2+,\7\t\2\2,\63\b\6\1\2-.\7\7\2\2./\5\4\3\2"+
		"/\60\7\b\2\2\60\61\b\6\1\2\61\63\3\2\2\2\62+\3\2\2\2\62-\3\2\2\2\63\13"+
		"\3\2\2\2\6\32&(\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}