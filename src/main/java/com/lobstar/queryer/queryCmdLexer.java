package com.lobstar.queryer;

// $ANTLR 3.5.1 C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g 2015-04-22 15:31:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class queryCmdLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int AND=4;
	public static final int EQU=5;
	public static final int GT=6;
	public static final int GTU=7;
	public static final int LT=8;
	public static final int LTU=9;
	public static final int NU=10;
	public static final int OR=11;
	public static final int STR=12;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public queryCmdLexer() {} 
	public queryCmdLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public queryCmdLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g"; }

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:2:7: ( '!' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:2:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:3:7: ( '(' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:3:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:4:7: ( ')' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:4:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:5:7: ( '_regex' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:5:9: '_regex'
			{
			match("_regex"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:6:7: ( '_time1' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:6:9: '_time1'
			{
			match("_time1"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:7:7: ( '_time2' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:7:9: '_time2'
			{
			match("_time2"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:24:5: ( '&' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:24:7: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:25:4: ( '|' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:25:6: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "EQU"
	public final void mEQU() throws RecognitionException {
		try {
			int _type = EQU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:27:5: ( '=' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:27:7: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQU"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:28:4: ( '>' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:28:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:29:4: ( '<' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:29:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "GTU"
	public final void mGTU() throws RecognitionException {
		try {
			int _type = GTU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:30:5: ( '>=' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:30:7: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTU"

	// $ANTLR start "LTU"
	public final void mLTU() throws RecognitionException {
		try {
			int _type = LTU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:31:5: ( '<=' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:31:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTU"

	// $ANTLR start "NU"
	public final void mNU() throws RecognitionException {
		try {
			int _type = NU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:32:4: ( '!=' )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:32:6: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NU"

	// $ANTLR start "STR"
	public final void mSTR() throws RecognitionException {
		try {
			int _type = STR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:34:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '/' | '@' | '%' | '_' | '-' | '+' )+ | '\"' (~ '\"' )* '\"' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='%'||LA3_0=='+'||(LA3_0 >= '-' && LA3_0 <= '9')||(LA3_0 >= '@' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
				alt3=1;
			}
			else if ( (LA3_0=='\"') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:34:7: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '/' | '@' | '%' | '_' | '-' | '+' )+
					{
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:34:7: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '/' | '@' | '%' | '_' | '-' | '+' )+
					int cnt1=0;
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0=='%'||LA1_0=='+'||(LA1_0 >= '-' && LA1_0 <= '9')||(LA1_0 >= '@' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:
							{
							if ( input.LA(1)=='%'||input.LA(1)=='+'||(input.LA(1) >= '-' && input.LA(1) <= '9')||(input.LA(1) >= '@' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
						}
						cnt1++;
					}

					}
					break;
				case 2 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:34:67: '\"' (~ '\"' )* '\"'
					{
					match('\"'); 
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:34:71: (~ '\"' )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					match('\"'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | AND | OR | EQU | GT | LT | GTU | LTU | NU | STR )
		int alt4=15;
		switch ( input.LA(1) ) {
		case '!':
			{
			int LA4_1 = input.LA(2);
			if ( (LA4_1=='=') ) {
				alt4=14;
			}

			else {
				alt4=1;
			}

			}
			break;
		case '(':
			{
			alt4=2;
			}
			break;
		case ')':
			{
			alt4=3;
			}
			break;
		case '_':
			{
			switch ( input.LA(2) ) {
			case 'r':
				{
				int LA4_13 = input.LA(3);
				if ( (LA4_13=='e') ) {
					int LA4_19 = input.LA(4);
					if ( (LA4_19=='g') ) {
						int LA4_21 = input.LA(5);
						if ( (LA4_21=='e') ) {
							int LA4_23 = input.LA(6);
							if ( (LA4_23=='x') ) {
								int LA4_25 = input.LA(7);
								if ( (LA4_25=='%'||LA4_25=='+'||(LA4_25 >= '-' && LA4_25 <= '9')||(LA4_25 >= '@' && LA4_25 <= 'Z')||LA4_25=='_'||(LA4_25 >= 'a' && LA4_25 <= 'z')) ) {
									alt4=15;
								}

								else {
									alt4=4;
								}

							}

							else {
								alt4=15;
							}

						}

						else {
							alt4=15;
						}

					}

					else {
						alt4=15;
					}

				}

				else {
					alt4=15;
				}

				}
				break;
			case 't':
				{
				int LA4_14 = input.LA(3);
				if ( (LA4_14=='i') ) {
					int LA4_20 = input.LA(4);
					if ( (LA4_20=='m') ) {
						int LA4_22 = input.LA(5);
						if ( (LA4_22=='e') ) {
							switch ( input.LA(6) ) {
							case '1':
								{
								int LA4_26 = input.LA(7);
								if ( (LA4_26=='%'||LA4_26=='+'||(LA4_26 >= '-' && LA4_26 <= '9')||(LA4_26 >= '@' && LA4_26 <= 'Z')||LA4_26=='_'||(LA4_26 >= 'a' && LA4_26 <= 'z')) ) {
									alt4=15;
								}

								else {
									alt4=5;
								}

								}
								break;
							case '2':
								{
								int LA4_27 = input.LA(7);
								if ( (LA4_27=='%'||LA4_27=='+'||(LA4_27 >= '-' && LA4_27 <= '9')||(LA4_27 >= '@' && LA4_27 <= 'Z')||LA4_27=='_'||(LA4_27 >= 'a' && LA4_27 <= 'z')) ) {
									alt4=15;
								}

								else {
									alt4=6;
								}

								}
								break;
							default:
								alt4=15;
							}
						}

						else {
							alt4=15;
						}

					}

					else {
						alt4=15;
					}

				}

				else {
					alt4=15;
				}

				}
				break;
			default:
				alt4=15;
			}
			}
			break;
		case '&':
			{
			alt4=7;
			}
			break;
		case '|':
			{
			alt4=8;
			}
			break;
		case '=':
			{
			alt4=9;
			}
			break;
		case '>':
			{
			int LA4_8 = input.LA(2);
			if ( (LA4_8=='=') ) {
				alt4=12;
			}

			else {
				alt4=10;
			}

			}
			break;
		case '<':
			{
			int LA4_9 = input.LA(2);
			if ( (LA4_9=='=') ) {
				alt4=13;
			}

			else {
				alt4=11;
			}

			}
			break;
		case '\"':
		case '%':
		case '+':
		case '-':
		case '.':
		case '/':
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
		case '@':
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=15;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:10: T__13
				{
				mT__13(); 

				}
				break;
			case 2 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:16: T__14
				{
				mT__14(); 

				}
				break;
			case 3 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:22: T__15
				{
				mT__15(); 

				}
				break;
			case 4 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:28: T__16
				{
				mT__16(); 

				}
				break;
			case 5 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:34: T__17
				{
				mT__17(); 

				}
				break;
			case 6 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:40: T__18
				{
				mT__18(); 

				}
				break;
			case 7 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:46: AND
				{
				mAND(); 

				}
				break;
			case 8 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:50: OR
				{
				mOR(); 

				}
				break;
			case 9 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:53: EQU
				{
				mEQU(); 

				}
				break;
			case 10 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:57: GT
				{
				mGT(); 

				}
				break;
			case 11 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:60: LT
				{
				mLT(); 

				}
				break;
			case 12 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:63: GTU
				{
				mGTU(); 

				}
				break;
			case 13 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:67: LTU
				{
				mLTU(); 

				}
				break;
			case 14 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:71: NU
				{
				mNU(); 

				}
				break;
			case 15 :
				// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:1:74: STR
				{
				mSTR(); 

				}
				break;

		}
	}



}
