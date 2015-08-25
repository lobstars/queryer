package com.lobstar.queryer;

// $ANTLR 3.5.1 C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g 2015-04-22 15:32:56

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

@SuppressWarnings("all")
public class cmdParser extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "EQU", "GT", "GTU", "LT", 
		"LTU", "NU", "OR", "STR", "'!'", "'('", "')'", "'_regex'", "'_time1'", 
		"'_time2'"
	};
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public cmdParser(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public cmdParser(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return cmdParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g"; }



	// $ANTLR start "query"
	// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:7:1: query returns [QueryBuilder queryBuilder] : (a= atom ) ;
	public final QueryBuilder query() throws RecognitionException {
		QueryBuilder queryBuilder = null;


		QueryBuilder a =null;

		try {
			// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:7:44: ( (a= atom ) )
			// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:7:46: (a= atom )
			{
			// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:7:46: (a= atom )
			// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:7:47: a= atom
			{
			pushFollow(FOLLOW_atom_in_query39);
			a=atom();
			state._fsp--;

			}

			queryBuilder = a;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return queryBuilder;
	}
	// $ANTLR end "query"



	// $ANTLR start "atom"
	// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:9:1: atom returns [QueryBuilder ret] : ( ^( AND a= atom b= atom ) | ^( OR a= atom b= atom ) | ^( EQU c= STR d= STR ) | ^( GT c= STR d= STR ) | ^( LT c= STR d= STR ) | ^( LTU c= STR d= STR ) | ^( GTU c= STR d= STR ) | ^( NU c= STR d= STR ) | STR );
	public final QueryBuilder atom() throws RecognitionException {
		QueryBuilder ret = null;


		CommonTree c=null;
		CommonTree d=null;
		CommonTree STR1=null;
		QueryBuilder a =null;
		QueryBuilder b =null;

		try {
			// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:10:2: ( ^( AND a= atom b= atom ) | ^( OR a= atom b= atom ) | ^( EQU c= STR d= STR ) | ^( GT c= STR d= STR ) | ^( LT c= STR d= STR ) | ^( LTU c= STR d= STR ) | ^( GTU c= STR d= STR ) | ^( NU c= STR d= STR ) | STR )
			int alt1=9;
			switch ( input.LA(1) ) {
			case AND:
				{
				alt1=1;
				}
				break;
			case OR:
				{
				alt1=2;
				}
				break;
			case EQU:
				{
				alt1=3;
				}
				break;
			case GT:
				{
				alt1=4;
				}
				break;
			case LT:
				{
				alt1=5;
				}
				break;
			case LTU:
				{
				alt1=6;
				}
				break;
			case GTU:
				{
				alt1=7;
				}
				break;
			case NU:
				{
				alt1=8;
				}
				break;
			case STR:
				{
				alt1=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:11:2: ^( AND a= atom b= atom )
					{
					match(input,AND,FOLLOW_AND_in_atom58); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atom_in_atom62);
					a=atom();
					state._fsp--;

					pushFollow(FOLLOW_atom_in_atom66);
					b=atom();
					state._fsp--;

					match(input, Token.UP, null); 

					ret = QueryBuilders.boolQuery().must(a).must(b);
					}
					break;
				case 2 :
					// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:12:4: ^( OR a= atom b= atom )
					{
					match(input,OR,FOLLOW_OR_in_atom75); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atom_in_atom79);
					a=atom();
					state._fsp--;

					pushFollow(FOLLOW_atom_in_atom83);
					b=atom();
					state._fsp--;

					match(input, Token.UP, null); 

					ret = QueryBuilders.boolQuery().should(a).should(b);
					}
					break;
				case 3 :
					// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:13:4: ^( EQU c= STR d= STR )
					{
					match(input,EQU,FOLLOW_EQU_in_atom92); 
					match(input, Token.DOWN, null); 
					c=(CommonTree)match(input,STR,FOLLOW_STR_in_atom96); 
					d=(CommonTree)match(input,STR,FOLLOW_STR_in_atom100); 
					match(input, Token.UP, null); 

					String val = d.getText();

	                if (val.startsWith("\"") && val.endsWith("\"")) {
	                    ret = QueryBuilders.queryString(val).field(c.getText());
	                } else {
	                    ret = QueryBuilders.termQuery(c.getText(), d.getText());
	                }
					}
					break;
				case 4 :
					// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:14:4: ^( GT c= STR d= STR )
					{
					match(input,GT,FOLLOW_GT_in_atom110); 
					match(input, Token.DOWN, null); 
					c=(CommonTree)match(input,STR,FOLLOW_STR_in_atom114); 
					d=(CommonTree)match(input,STR,FOLLOW_STR_in_atom118); 
					match(input, Token.UP, null); 

					ret = QueryBuilders.rangeQuery(c.getText()).gt(d.getText());
					}
					break;
				case 5 :
					// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:15:4: ^( LT c= STR d= STR )
					{
					match(input,LT,FOLLOW_LT_in_atom127); 
					match(input, Token.DOWN, null); 
					c=(CommonTree)match(input,STR,FOLLOW_STR_in_atom131); 
					d=(CommonTree)match(input,STR,FOLLOW_STR_in_atom135); 
					match(input, Token.UP, null); 

					ret = QueryBuilders.rangeQuery(c.getText()).lt(d.getText());
					}
					break;
				case 6 :
					// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:16:4: ^( LTU c= STR d= STR )
					{
					match(input,LTU,FOLLOW_LTU_in_atom144); 
					match(input, Token.DOWN, null); 
					c=(CommonTree)match(input,STR,FOLLOW_STR_in_atom148); 
					d=(CommonTree)match(input,STR,FOLLOW_STR_in_atom152); 
					match(input, Token.UP, null); 

					ret = QueryBuilders.rangeQuery(c.getText()).lte(d.getText());
					}
					break;
				case 7 :
					// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:17:4: ^( GTU c= STR d= STR )
					{
					match(input,GTU,FOLLOW_GTU_in_atom161); 
					match(input, Token.DOWN, null); 
					c=(CommonTree)match(input,STR,FOLLOW_STR_in_atom165); 
					d=(CommonTree)match(input,STR,FOLLOW_STR_in_atom169); 
					match(input, Token.UP, null); 

					ret = QueryBuilders.rangeQuery(c.getText()).gte(d.getText());
					}
					break;
				case 8 :
					// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:18:4: ^( NU c= STR d= STR )
					{
					match(input,NU,FOLLOW_NU_in_atom178); 
					match(input, Token.DOWN, null); 
					c=(CommonTree)match(input,STR,FOLLOW_STR_in_atom182); 
					d=(CommonTree)match(input,STR,FOLLOW_STR_in_atom186); 
					match(input, Token.UP, null); 
					String val = d.getText();
					if (val.startsWith("\"") && val.endsWith("\"")) {
	                    val = val.substring(1, val.length()-1);
	                    ret = QueryBuilders.boolQuery().mustNot(QueryBuilders.queryString(val).field(c.getText()));
	                }
					else {
						ret = QueryBuilders.boolQuery().mustNot(QueryBuilders.termQuery(c.getText(),val));						
					}
					}
					break;
				case 9 :
					// C:\\Users\\lobster\\Desktop\\cmd\\cmdParser.g:19:4: STR
					{
					STR1=(CommonTree)match(input,STR,FOLLOW_STR_in_atom194); 
					String val = STR1.getText();

	                if (val.startsWith("\"") && val.endsWith("\"")) {
	                    val = val.substring(1, val.length()-1);
	                }
	                ret = QueryBuilders.queryString(val).field("_all");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_atom_in_query39 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_atom58 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atom_in_atom62 = new BitSet(new long[]{0x0000000000001FF0L});
	public static final BitSet FOLLOW_atom_in_atom66 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_atom75 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atom_in_atom79 = new BitSet(new long[]{0x0000000000001FF0L});
	public static final BitSet FOLLOW_atom_in_atom83 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQU_in_atom92 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STR_in_atom96 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_STR_in_atom100 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_atom110 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STR_in_atom114 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_STR_in_atom118 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_atom127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STR_in_atom131 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_STR_in_atom135 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTU_in_atom144 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STR_in_atom148 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_STR_in_atom152 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTU_in_atom161 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STR_in_atom165 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_STR_in_atom169 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NU_in_atom178 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STR_in_atom182 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_STR_in_atom186 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STR_in_atom194 = new BitSet(new long[]{0x0000000000000002L});
}
