package com.lobstar.queryer;

// $ANTLR 3.5.1 C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g 2015-06-25 17:59:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class queryCmdParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public queryCmdParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public queryCmdParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return queryCmdParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g"; }


	public static class queryCmd_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "queryCmd"
	// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:8:1: queryCmd : ratom ;
	public final queryCmdParser.queryCmd_return queryCmd() throws RecognitionException {
		queryCmdParser.queryCmd_return retval = new queryCmdParser.queryCmd_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope ratom1 =null;


		try {
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:8:9: ( ratom )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:8:12: ratom
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_ratom_in_queryCmd52);
			ratom1=ratom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ratom1.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "queryCmd"


	public static class ratom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ratom"
	// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:10:1: ratom : '(' ! catom ( ( AND ^| OR ^) catom )* ')' !;
	public final queryCmdParser.ratom_return ratom() throws RecognitionException {
		queryCmdParser.ratom_return retval = new queryCmdParser.ratom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal2=null;
		Token AND4=null;
		Token OR5=null;
		Token char_literal7=null;
		ParserRuleReturnScope catom3 =null;
		ParserRuleReturnScope catom6 =null;

		CommonTree char_literal2_tree=null;
		CommonTree AND4_tree=null;
		CommonTree OR5_tree=null;
		CommonTree char_literal7_tree=null;

		try {
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:10:7: ( '(' ! catom ( ( AND ^| OR ^) catom )* ')' !)
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:10:9: '(' ! catom ( ( AND ^| OR ^) catom )* ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal2=(Token)match(input,14,FOLLOW_14_in_ratom61); if (state.failed) return retval;
			pushFollow(FOLLOW_catom_in_ratom64);
			catom3=catom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, catom3.getTree());

			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:10:20: ( ( AND ^| OR ^) catom )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==AND||LA2_0==OR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:10:21: ( AND ^| OR ^) catom
					{
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:10:21: ( AND ^| OR ^)
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==AND) ) {
						alt1=1;
					}
					else if ( (LA1_0==OR) ) {
						alt1=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:10:22: AND ^
							{
							AND4=(Token)match(input,AND,FOLLOW_AND_in_ratom68); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AND4_tree = (CommonTree)adaptor.create(AND4);
							root_0 = (CommonTree)adaptor.becomeRoot(AND4_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:10:27: OR ^
							{
							OR5=(Token)match(input,OR,FOLLOW_OR_in_ratom71); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							OR5_tree = (CommonTree)adaptor.create(OR5);
							root_0 = (CommonTree)adaptor.becomeRoot(OR5_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_catom_in_ratom75);
					catom6=catom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, catom6.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			char_literal7=(Token)match(input,15,FOLLOW_15_in_ratom79); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ratom"


	public static class catom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "catom"
	// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:12:1: catom : ( '(' ! atom ')' !| atom | ratom );
	public final queryCmdParser.catom_return catom() throws RecognitionException {
		queryCmdParser.catom_return retval = new queryCmdParser.catom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal8=null;
		Token char_literal10=null;
		ParserRuleReturnScope atom9 =null;
		ParserRuleReturnScope atom11 =null;
		ParserRuleReturnScope ratom12 =null;

		CommonTree char_literal8_tree=null;
		CommonTree char_literal10_tree=null;

		try {
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:12:7: ( '(' ! atom ')' !| atom | ratom )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==14) ) {
				switch ( input.LA(2) ) {
				case STR:
					{
					switch ( input.LA(3) ) {
					case EQU:
						{
						switch ( input.LA(4) ) {
						case STR:
							{
							int LA3_20 = input.LA(5);
							if ( (LA3_20==15) ) {
								int LA3_26 = input.LA(6);
								if ( (synpred3_queryCmd()) ) {
									alt3=1;
								}
								else if ( (true) ) {
									alt3=3;
								}

							}
							else if ( (LA3_20==AND||LA3_20==OR) ) {
								alt3=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 20, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 17:
							{
							int LA3_5 = input.LA(5);
							if ( (LA3_5==14) ) {
								int LA3_17 = input.LA(6);
								if ( (LA3_17==STR) ) {
									int LA3_23 = input.LA(7);
									if ( (LA3_23==15) ) {
										int LA3_27 = input.LA(8);
										if ( (LA3_27==15) ) {
											int LA3_30 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_27==AND||LA3_27==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 27, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 23, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 17, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 18:
							{
							int LA3_6 = input.LA(5);
							if ( (LA3_6==14) ) {
								int LA3_18 = input.LA(6);
								if ( (LA3_18==STR) ) {
									int LA3_24 = input.LA(7);
									if ( (LA3_24==15) ) {
										int LA3_28 = input.LA(8);
										if ( (LA3_28==15) ) {
											int LA3_31 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_28==AND||LA3_28==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 28, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 24, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 16:
							{
							int LA3_7 = input.LA(5);
							if ( (LA3_7==14) ) {
								int LA3_19 = input.LA(6);
								if ( (LA3_19==STR) ) {
									int LA3_25 = input.LA(7);
									if ( (LA3_25==15) ) {
										int LA3_29 = input.LA(8);
										if ( (LA3_29==15) ) {
											int LA3_32 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_29==AND||LA3_29==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 29, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 25, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 19, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case GT:
						{
						switch ( input.LA(4) ) {
						case STR:
							{
							int LA3_20 = input.LA(5);
							if ( (LA3_20==15) ) {
								int LA3_26 = input.LA(6);
								if ( (synpred3_queryCmd()) ) {
									alt3=1;
								}
								else if ( (true) ) {
									alt3=3;
								}

							}
							else if ( (LA3_20==AND||LA3_20==OR) ) {
								alt3=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 20, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 17:
							{
							int LA3_5 = input.LA(5);
							if ( (LA3_5==14) ) {
								int LA3_17 = input.LA(6);
								if ( (LA3_17==STR) ) {
									int LA3_23 = input.LA(7);
									if ( (LA3_23==15) ) {
										int LA3_27 = input.LA(8);
										if ( (LA3_27==15) ) {
											int LA3_30 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_27==AND||LA3_27==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 27, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 23, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 17, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 18:
							{
							int LA3_6 = input.LA(5);
							if ( (LA3_6==14) ) {
								int LA3_18 = input.LA(6);
								if ( (LA3_18==STR) ) {
									int LA3_24 = input.LA(7);
									if ( (LA3_24==15) ) {
										int LA3_28 = input.LA(8);
										if ( (LA3_28==15) ) {
											int LA3_31 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_28==AND||LA3_28==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 28, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 24, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 16:
							{
							int LA3_7 = input.LA(5);
							if ( (LA3_7==14) ) {
								int LA3_19 = input.LA(6);
								if ( (LA3_19==STR) ) {
									int LA3_25 = input.LA(7);
									if ( (LA3_25==15) ) {
										int LA3_29 = input.LA(8);
										if ( (LA3_29==15) ) {
											int LA3_32 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_29==AND||LA3_29==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 29, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 25, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 19, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case LT:
						{
						switch ( input.LA(4) ) {
						case STR:
							{
							int LA3_20 = input.LA(5);
							if ( (LA3_20==15) ) {
								int LA3_26 = input.LA(6);
								if ( (synpred3_queryCmd()) ) {
									alt3=1;
								}
								else if ( (true) ) {
									alt3=3;
								}

							}
							else if ( (LA3_20==AND||LA3_20==OR) ) {
								alt3=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 20, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 17:
							{
							int LA3_5 = input.LA(5);
							if ( (LA3_5==14) ) {
								int LA3_17 = input.LA(6);
								if ( (LA3_17==STR) ) {
									int LA3_23 = input.LA(7);
									if ( (LA3_23==15) ) {
										int LA3_27 = input.LA(8);
										if ( (LA3_27==15) ) {
											int LA3_30 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_27==AND||LA3_27==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 27, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 23, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 17, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 18:
							{
							int LA3_6 = input.LA(5);
							if ( (LA3_6==14) ) {
								int LA3_18 = input.LA(6);
								if ( (LA3_18==STR) ) {
									int LA3_24 = input.LA(7);
									if ( (LA3_24==15) ) {
										int LA3_28 = input.LA(8);
										if ( (LA3_28==15) ) {
											int LA3_31 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_28==AND||LA3_28==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 28, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 24, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 16:
							{
							int LA3_7 = input.LA(5);
							if ( (LA3_7==14) ) {
								int LA3_19 = input.LA(6);
								if ( (LA3_19==STR) ) {
									int LA3_25 = input.LA(7);
									if ( (LA3_25==15) ) {
										int LA3_29 = input.LA(8);
										if ( (LA3_29==15) ) {
											int LA3_32 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_29==AND||LA3_29==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 29, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 25, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 19, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case LTU:
						{
						switch ( input.LA(4) ) {
						case STR:
							{
							int LA3_20 = input.LA(5);
							if ( (LA3_20==15) ) {
								int LA3_26 = input.LA(6);
								if ( (synpred3_queryCmd()) ) {
									alt3=1;
								}
								else if ( (true) ) {
									alt3=3;
								}

							}
							else if ( (LA3_20==AND||LA3_20==OR) ) {
								alt3=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 20, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 17:
							{
							int LA3_5 = input.LA(5);
							if ( (LA3_5==14) ) {
								int LA3_17 = input.LA(6);
								if ( (LA3_17==STR) ) {
									int LA3_23 = input.LA(7);
									if ( (LA3_23==15) ) {
										int LA3_27 = input.LA(8);
										if ( (LA3_27==15) ) {
											int LA3_30 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_27==AND||LA3_27==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 27, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 23, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 17, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 18:
							{
							int LA3_6 = input.LA(5);
							if ( (LA3_6==14) ) {
								int LA3_18 = input.LA(6);
								if ( (LA3_18==STR) ) {
									int LA3_24 = input.LA(7);
									if ( (LA3_24==15) ) {
										int LA3_28 = input.LA(8);
										if ( (LA3_28==15) ) {
											int LA3_31 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_28==AND||LA3_28==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 28, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 24, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 16:
							{
							int LA3_7 = input.LA(5);
							if ( (LA3_7==14) ) {
								int LA3_19 = input.LA(6);
								if ( (LA3_19==STR) ) {
									int LA3_25 = input.LA(7);
									if ( (LA3_25==15) ) {
										int LA3_29 = input.LA(8);
										if ( (LA3_29==15) ) {
											int LA3_32 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_29==AND||LA3_29==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 29, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 25, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 19, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case GTU:
						{
						switch ( input.LA(4) ) {
						case STR:
							{
							int LA3_20 = input.LA(5);
							if ( (LA3_20==15) ) {
								int LA3_26 = input.LA(6);
								if ( (synpred3_queryCmd()) ) {
									alt3=1;
								}
								else if ( (true) ) {
									alt3=3;
								}

							}
							else if ( (LA3_20==AND||LA3_20==OR) ) {
								alt3=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 20, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 17:
							{
							int LA3_5 = input.LA(5);
							if ( (LA3_5==14) ) {
								int LA3_17 = input.LA(6);
								if ( (LA3_17==STR) ) {
									int LA3_23 = input.LA(7);
									if ( (LA3_23==15) ) {
										int LA3_27 = input.LA(8);
										if ( (LA3_27==15) ) {
											int LA3_30 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_27==AND||LA3_27==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 27, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 23, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 17, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 18:
							{
							int LA3_6 = input.LA(5);
							if ( (LA3_6==14) ) {
								int LA3_18 = input.LA(6);
								if ( (LA3_18==STR) ) {
									int LA3_24 = input.LA(7);
									if ( (LA3_24==15) ) {
										int LA3_28 = input.LA(8);
										if ( (LA3_28==15) ) {
											int LA3_31 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_28==AND||LA3_28==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 28, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 24, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 16:
							{
							int LA3_7 = input.LA(5);
							if ( (LA3_7==14) ) {
								int LA3_19 = input.LA(6);
								if ( (LA3_19==STR) ) {
									int LA3_25 = input.LA(7);
									if ( (LA3_25==15) ) {
										int LA3_29 = input.LA(8);
										if ( (LA3_29==15) ) {
											int LA3_32 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_29==AND||LA3_29==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 29, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 25, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 19, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 13, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case NU:
						{
						switch ( input.LA(4) ) {
						case STR:
							{
							int LA3_20 = input.LA(5);
							if ( (LA3_20==15) ) {
								int LA3_26 = input.LA(6);
								if ( (synpred3_queryCmd()) ) {
									alt3=1;
								}
								else if ( (true) ) {
									alt3=3;
								}

							}
							else if ( (LA3_20==AND||LA3_20==OR) ) {
								alt3=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 20, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 17:
							{
							int LA3_5 = input.LA(5);
							if ( (LA3_5==14) ) {
								int LA3_17 = input.LA(6);
								if ( (LA3_17==STR) ) {
									int LA3_23 = input.LA(7);
									if ( (LA3_23==15) ) {
										int LA3_27 = input.LA(8);
										if ( (LA3_27==15) ) {
											int LA3_30 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_27==AND||LA3_27==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 27, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 23, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 17, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 18:
							{
							int LA3_6 = input.LA(5);
							if ( (LA3_6==14) ) {
								int LA3_18 = input.LA(6);
								if ( (LA3_18==STR) ) {
									int LA3_24 = input.LA(7);
									if ( (LA3_24==15) ) {
										int LA3_28 = input.LA(8);
										if ( (LA3_28==15) ) {
											int LA3_31 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_28==AND||LA3_28==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 28, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 24, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 16:
							{
							int LA3_7 = input.LA(5);
							if ( (LA3_7==14) ) {
								int LA3_19 = input.LA(6);
								if ( (LA3_19==STR) ) {
									int LA3_25 = input.LA(7);
									if ( (LA3_25==15) ) {
										int LA3_29 = input.LA(8);
										if ( (LA3_29==15) ) {
											int LA3_32 = input.LA(9);
											if ( (synpred3_queryCmd()) ) {
												alt3=1;
											}
											else if ( (true) ) {
												alt3=3;
											}

										}
										else if ( (LA3_29==AND||LA3_29==OR) ) {
											alt3=3;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 29, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 25, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 19, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case 15:
						{
						int LA3_15 = input.LA(4);
						if ( (synpred3_queryCmd()) ) {
							alt3=1;
						}
						else if ( (true) ) {
							alt3=3;
						}

						}
						break;
					case AND:
					case OR:
						{
						alt3=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case 13:
					{
					int LA3_4 = input.LA(3);
					if ( (LA3_4==STR) ) {
						int LA3_16 = input.LA(4);
						if ( (LA3_16==15) ) {
							int LA3_22 = input.LA(5);
							if ( (synpred3_queryCmd()) ) {
								alt3=1;
							}
							else if ( (true) ) {
								alt3=3;
							}

						}
						else if ( (LA3_16==AND||LA3_16==OR) ) {
							alt3=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 16, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 17:
					{
					int LA3_5 = input.LA(3);
					if ( (LA3_5==14) ) {
						int LA3_17 = input.LA(4);
						if ( (LA3_17==STR) ) {
							int LA3_23 = input.LA(5);
							if ( (LA3_23==15) ) {
								int LA3_27 = input.LA(6);
								if ( (LA3_27==15) ) {
									int LA3_30 = input.LA(7);
									if ( (synpred3_queryCmd()) ) {
										alt3=1;
									}
									else if ( (true) ) {
										alt3=3;
									}

								}
								else if ( (LA3_27==AND||LA3_27==OR) ) {
									alt3=3;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 27, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 23, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 17, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 18:
					{
					int LA3_6 = input.LA(3);
					if ( (LA3_6==14) ) {
						int LA3_18 = input.LA(4);
						if ( (LA3_18==STR) ) {
							int LA3_24 = input.LA(5);
							if ( (LA3_24==15) ) {
								int LA3_28 = input.LA(6);
								if ( (LA3_28==15) ) {
									int LA3_31 = input.LA(7);
									if ( (synpred3_queryCmd()) ) {
										alt3=1;
									}
									else if ( (true) ) {
										alt3=3;
									}

								}
								else if ( (LA3_28==AND||LA3_28==OR) ) {
									alt3=3;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 28, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 24, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 18, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 16:
					{
					int LA3_7 = input.LA(3);
					if ( (LA3_7==14) ) {
						int LA3_19 = input.LA(4);
						if ( (LA3_19==STR) ) {
							int LA3_25 = input.LA(5);
							if ( (LA3_25==15) ) {
								int LA3_29 = input.LA(6);
								if ( (LA3_29==15) ) {
									int LA3_32 = input.LA(7);
									if ( (synpred3_queryCmd()) ) {
										alt3=1;
									}
									else if ( (true) ) {
										alt3=3;
									}

								}
								else if ( (LA3_29==AND||LA3_29==OR) ) {
									alt3=3;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 29, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 25, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 19, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 14:
					{
					alt3=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( ((LA3_0 >= STR && LA3_0 <= 13)||(LA3_0 >= 16 && LA3_0 <= 18)) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:12:9: '(' ! atom ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal8=(Token)match(input,14,FOLLOW_14_in_catom89); if (state.failed) return retval;
					pushFollow(FOLLOW_atom_in_catom92);
					atom9=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom9.getTree());

					char_literal10=(Token)match(input,15,FOLLOW_15_in_catom94); if (state.failed) return retval;
					}
					break;
				case 2 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:12:26: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_catom99);
					atom11=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom11.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:12:34: ratom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ratom_in_catom104);
					ratom12=ratom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ratom12.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catom"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:1: atom : ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) STR | STR | notCmd | timeCmd | timeCmd2 | regex );
	public final queryCmdParser.atom_return atom() throws RecognitionException {
		queryCmdParser.atom_return retval = new queryCmdParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STR13=null;
		Token EQU14=null;
		Token GT15=null;
		Token LT16=null;
		Token LTU17=null;
		Token GTU18=null;
		Token NU19=null;
		Token STR20=null;
		Token STR21=null;
		ParserRuleReturnScope notCmd22 =null;
		ParserRuleReturnScope timeCmd23 =null;
		ParserRuleReturnScope timeCmd224 =null;
		ParserRuleReturnScope regex25 =null;

		CommonTree STR13_tree=null;
		CommonTree EQU14_tree=null;
		CommonTree GT15_tree=null;
		CommonTree LT16_tree=null;
		CommonTree LTU17_tree=null;
		CommonTree GTU18_tree=null;
		CommonTree NU19_tree=null;
		CommonTree STR20_tree=null;
		CommonTree STR21_tree=null;

		try {
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:6: ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) STR | STR | notCmd | timeCmd | timeCmd2 | regex )
			int alt5=6;
			switch ( input.LA(1) ) {
			case STR:
				{
				switch ( input.LA(2) ) {
				case EQU:
					{
					switch ( input.LA(3) ) {
					case STR:
						{
						alt5=1;
						}
						break;
					case 17:
						{
						alt5=4;
						}
						break;
					case 18:
						{
						alt5=5;
						}
						break;
					case 16:
						{
						alt5=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case GT:
					{
					switch ( input.LA(3) ) {
					case STR:
						{
						alt5=1;
						}
						break;
					case 17:
						{
						alt5=4;
						}
						break;
					case 18:
						{
						alt5=5;
						}
						break;
					case 16:
						{
						alt5=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case LT:
					{
					switch ( input.LA(3) ) {
					case STR:
						{
						alt5=1;
						}
						break;
					case 17:
						{
						alt5=4;
						}
						break;
					case 18:
						{
						alt5=5;
						}
						break;
					case 16:
						{
						alt5=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case LTU:
					{
					switch ( input.LA(3) ) {
					case STR:
						{
						alt5=1;
						}
						break;
					case 17:
						{
						alt5=4;
						}
						break;
					case 18:
						{
						alt5=5;
						}
						break;
					case 16:
						{
						alt5=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case GTU:
					{
					switch ( input.LA(3) ) {
					case STR:
						{
						alt5=1;
						}
						break;
					case 17:
						{
						alt5=4;
						}
						break;
					case 18:
						{
						alt5=5;
						}
						break;
					case 16:
						{
						alt5=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case NU:
					{
					switch ( input.LA(3) ) {
					case STR:
						{
						alt5=1;
						}
						break;
					case 17:
						{
						alt5=4;
						}
						break;
					case 18:
						{
						alt5=5;
						}
						break;
					case 16:
						{
						alt5=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case EOF:
				case AND:
				case OR:
				case 15:
					{
					alt5=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 13:
				{
				alt5=3;
				}
				break;
			case 17:
				{
				alt5=4;
				}
				break;
			case 18:
				{
				alt5=5;
				}
				break;
			case 16:
				{
				alt5=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:8: STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) STR
					{
					root_0 = (CommonTree)adaptor.nil();


					STR13=(Token)match(input,STR,FOLLOW_STR_in_atom113); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STR13_tree = (CommonTree)adaptor.create(STR13);
					adaptor.addChild(root_0, STR13_tree);
					}

					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:12: ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^)
					int alt4=6;
					switch ( input.LA(1) ) {
					case EQU:
						{
						alt4=1;
						}
						break;
					case GT:
						{
						alt4=2;
						}
						break;
					case LT:
						{
						alt4=3;
						}
						break;
					case LTU:
						{
						alt4=4;
						}
						break;
					case GTU:
						{
						alt4=5;
						}
						break;
					case NU:
						{
						alt4=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:13: EQU ^
							{
							EQU14=(Token)match(input,EQU,FOLLOW_EQU_in_atom116); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQU14_tree = (CommonTree)adaptor.create(EQU14);
							root_0 = (CommonTree)adaptor.becomeRoot(EQU14_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:20: GT ^
							{
							GT15=(Token)match(input,GT,FOLLOW_GT_in_atom121); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GT15_tree = (CommonTree)adaptor.create(GT15);
							root_0 = (CommonTree)adaptor.becomeRoot(GT15_tree, root_0);
							}

							}
							break;
						case 3 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:26: LT ^
							{
							LT16=(Token)match(input,LT,FOLLOW_LT_in_atom126); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LT16_tree = (CommonTree)adaptor.create(LT16);
							root_0 = (CommonTree)adaptor.becomeRoot(LT16_tree, root_0);
							}

							}
							break;
						case 4 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:32: LTU ^
							{
							LTU17=(Token)match(input,LTU,FOLLOW_LTU_in_atom131); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LTU17_tree = (CommonTree)adaptor.create(LTU17);
							root_0 = (CommonTree)adaptor.becomeRoot(LTU17_tree, root_0);
							}

							}
							break;
						case 5 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:39: GTU ^
							{
							GTU18=(Token)match(input,GTU,FOLLOW_GTU_in_atom136); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GTU18_tree = (CommonTree)adaptor.create(GTU18);
							root_0 = (CommonTree)adaptor.becomeRoot(GTU18_tree, root_0);
							}

							}
							break;
						case 6 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:46: NU ^
							{
							NU19=(Token)match(input,NU,FOLLOW_NU_in_atom141); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NU19_tree = (CommonTree)adaptor.create(NU19);
							root_0 = (CommonTree)adaptor.becomeRoot(NU19_tree, root_0);
							}

							}
							break;

					}

					STR20=(Token)match(input,STR,FOLLOW_STR_in_atom145); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STR20_tree = (CommonTree)adaptor.create(STR20);
					adaptor.addChild(root_0, STR20_tree);
					}

					}
					break;
				case 2 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:57: STR
					{
					root_0 = (CommonTree)adaptor.nil();


					STR21=(Token)match(input,STR,FOLLOW_STR_in_atom149); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STR21_tree = (CommonTree)adaptor.create(STR21);
					adaptor.addChild(root_0, STR21_tree);
					}

					}
					break;
				case 3 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:63: notCmd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_notCmd_in_atom153);
					notCmd22=notCmd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, notCmd22.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:72: timeCmd
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_timeCmd_in_atom157);
					timeCmd23=timeCmd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timeCmd23.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:82: timeCmd2
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_timeCmd2_in_atom161);
					timeCmd224=timeCmd2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timeCmd224.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:14:93: regex
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_regex_in_atom165);
					regex25=regex();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, regex25.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class notCmd_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "notCmd"
	// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:16:1: notCmd : '!' ^ STR ;
	public final queryCmdParser.notCmd_return notCmd() throws RecognitionException {
		queryCmdParser.notCmd_return retval = new queryCmdParser.notCmd_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal26=null;
		Token STR27=null;

		CommonTree char_literal26_tree=null;
		CommonTree STR27_tree=null;

		try {
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:16:8: ( '!' ^ STR )
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:16:10: '!' ^ STR
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal26=(Token)match(input,13,FOLLOW_13_in_notCmd174); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal26_tree = (CommonTree)adaptor.create(char_literal26);
			root_0 = (CommonTree)adaptor.becomeRoot(char_literal26_tree, root_0);
			}

			STR27=(Token)match(input,STR,FOLLOW_STR_in_notCmd177); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STR27_tree = (CommonTree)adaptor.create(STR27);
			adaptor.addChild(root_0, STR27_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "notCmd"


	public static class timeCmd_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "timeCmd"
	// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:17:1: timeCmd : ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) )? '_time1' ^ '(' ! STR ')' !;
	public final queryCmdParser.timeCmd_return timeCmd() throws RecognitionException {
		queryCmdParser.timeCmd_return retval = new queryCmdParser.timeCmd_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STR28=null;
		Token EQU29=null;
		Token GT30=null;
		Token LT31=null;
		Token LTU32=null;
		Token GTU33=null;
		Token NU34=null;
		Token string_literal35=null;
		Token char_literal36=null;
		Token STR37=null;
		Token char_literal38=null;

		CommonTree STR28_tree=null;
		CommonTree EQU29_tree=null;
		CommonTree GT30_tree=null;
		CommonTree LT31_tree=null;
		CommonTree LTU32_tree=null;
		CommonTree GTU33_tree=null;
		CommonTree NU34_tree=null;
		CommonTree string_literal35_tree=null;
		CommonTree char_literal36_tree=null;
		CommonTree STR37_tree=null;
		CommonTree char_literal38_tree=null;

		try {
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:17:9: ( ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) )? '_time1' ^ '(' ! STR ')' !)
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:17:11: ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) )? '_time1' ^ '(' ! STR ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:17:11: ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==STR) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:17:12: STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^)
					{
					STR28=(Token)match(input,STR,FOLLOW_STR_in_timeCmd186); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STR28_tree = (CommonTree)adaptor.create(STR28);
					adaptor.addChild(root_0, STR28_tree);
					}

					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:17:16: ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^)
					int alt6=6;
					switch ( input.LA(1) ) {
					case EQU:
						{
						alt6=1;
						}
						break;
					case GT:
						{
						alt6=2;
						}
						break;
					case LT:
						{
						alt6=3;
						}
						break;
					case LTU:
						{
						alt6=4;
						}
						break;
					case GTU:
						{
						alt6=5;
						}
						break;
					case NU:
						{
						alt6=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:17:17: EQU ^
							{
							EQU29=(Token)match(input,EQU,FOLLOW_EQU_in_timeCmd189); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQU29_tree = (CommonTree)adaptor.create(EQU29);
							root_0 = (CommonTree)adaptor.becomeRoot(EQU29_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:17:24: GT ^
							{
							GT30=(Token)match(input,GT,FOLLOW_GT_in_timeCmd194); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GT30_tree = (CommonTree)adaptor.create(GT30);
							root_0 = (CommonTree)adaptor.becomeRoot(GT30_tree, root_0);
							}

							}
							break;
						case 3 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:17:30: LT ^
							{
							LT31=(Token)match(input,LT,FOLLOW_LT_in_timeCmd199); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LT31_tree = (CommonTree)adaptor.create(LT31);
							root_0 = (CommonTree)adaptor.becomeRoot(LT31_tree, root_0);
							}

							}
							break;
						case 4 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:17:36: LTU ^
							{
							LTU32=(Token)match(input,LTU,FOLLOW_LTU_in_timeCmd204); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LTU32_tree = (CommonTree)adaptor.create(LTU32);
							root_0 = (CommonTree)adaptor.becomeRoot(LTU32_tree, root_0);
							}

							}
							break;
						case 5 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:17:43: GTU ^
							{
							GTU33=(Token)match(input,GTU,FOLLOW_GTU_in_timeCmd209); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GTU33_tree = (CommonTree)adaptor.create(GTU33);
							root_0 = (CommonTree)adaptor.becomeRoot(GTU33_tree, root_0);
							}

							}
							break;
						case 6 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:17:50: NU ^
							{
							NU34=(Token)match(input,NU,FOLLOW_NU_in_timeCmd214); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NU34_tree = (CommonTree)adaptor.create(NU34);
							root_0 = (CommonTree)adaptor.becomeRoot(NU34_tree, root_0);
							}

							}
							break;

					}

					}
					break;

			}

			string_literal35=(Token)match(input,17,FOLLOW_17_in_timeCmd220); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal35_tree = (CommonTree)adaptor.create(string_literal35);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal35_tree, root_0);
			}

			char_literal36=(Token)match(input,14,FOLLOW_14_in_timeCmd223); if (state.failed) return retval;
			STR37=(Token)match(input,STR,FOLLOW_STR_in_timeCmd226); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STR37_tree = (CommonTree)adaptor.create(STR37);
			adaptor.addChild(root_0, STR37_tree);
			}

			char_literal38=(Token)match(input,15,FOLLOW_15_in_timeCmd228); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timeCmd"


	public static class timeCmd2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "timeCmd2"
	// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:18:1: timeCmd2 : ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) )? '_time2' ^ '(' ! STR ')' !;
	public final queryCmdParser.timeCmd2_return timeCmd2() throws RecognitionException {
		queryCmdParser.timeCmd2_return retval = new queryCmdParser.timeCmd2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STR39=null;
		Token EQU40=null;
		Token GT41=null;
		Token LT42=null;
		Token LTU43=null;
		Token GTU44=null;
		Token NU45=null;
		Token string_literal46=null;
		Token char_literal47=null;
		Token STR48=null;
		Token char_literal49=null;

		CommonTree STR39_tree=null;
		CommonTree EQU40_tree=null;
		CommonTree GT41_tree=null;
		CommonTree LT42_tree=null;
		CommonTree LTU43_tree=null;
		CommonTree GTU44_tree=null;
		CommonTree NU45_tree=null;
		CommonTree string_literal46_tree=null;
		CommonTree char_literal47_tree=null;
		CommonTree STR48_tree=null;
		CommonTree char_literal49_tree=null;

		try {
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:18:9: ( ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) )? '_time2' ^ '(' ! STR ')' !)
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:18:11: ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) )? '_time2' ^ '(' ! STR ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:18:11: ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==STR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:18:12: STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^)
					{
					STR39=(Token)match(input,STR,FOLLOW_STR_in_timeCmd2237); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STR39_tree = (CommonTree)adaptor.create(STR39);
					adaptor.addChild(root_0, STR39_tree);
					}

					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:18:16: ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^)
					int alt8=6;
					switch ( input.LA(1) ) {
					case EQU:
						{
						alt8=1;
						}
						break;
					case GT:
						{
						alt8=2;
						}
						break;
					case LT:
						{
						alt8=3;
						}
						break;
					case LTU:
						{
						alt8=4;
						}
						break;
					case GTU:
						{
						alt8=5;
						}
						break;
					case NU:
						{
						alt8=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:18:17: EQU ^
							{
							EQU40=(Token)match(input,EQU,FOLLOW_EQU_in_timeCmd2240); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQU40_tree = (CommonTree)adaptor.create(EQU40);
							root_0 = (CommonTree)adaptor.becomeRoot(EQU40_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:18:24: GT ^
							{
							GT41=(Token)match(input,GT,FOLLOW_GT_in_timeCmd2245); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GT41_tree = (CommonTree)adaptor.create(GT41);
							root_0 = (CommonTree)adaptor.becomeRoot(GT41_tree, root_0);
							}

							}
							break;
						case 3 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:18:30: LT ^
							{
							LT42=(Token)match(input,LT,FOLLOW_LT_in_timeCmd2250); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LT42_tree = (CommonTree)adaptor.create(LT42);
							root_0 = (CommonTree)adaptor.becomeRoot(LT42_tree, root_0);
							}

							}
							break;
						case 4 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:18:36: LTU ^
							{
							LTU43=(Token)match(input,LTU,FOLLOW_LTU_in_timeCmd2255); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LTU43_tree = (CommonTree)adaptor.create(LTU43);
							root_0 = (CommonTree)adaptor.becomeRoot(LTU43_tree, root_0);
							}

							}
							break;
						case 5 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:18:43: GTU ^
							{
							GTU44=(Token)match(input,GTU,FOLLOW_GTU_in_timeCmd2260); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GTU44_tree = (CommonTree)adaptor.create(GTU44);
							root_0 = (CommonTree)adaptor.becomeRoot(GTU44_tree, root_0);
							}

							}
							break;
						case 6 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:18:50: NU ^
							{
							NU45=(Token)match(input,NU,FOLLOW_NU_in_timeCmd2265); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NU45_tree = (CommonTree)adaptor.create(NU45);
							root_0 = (CommonTree)adaptor.becomeRoot(NU45_tree, root_0);
							}

							}
							break;

					}

					}
					break;

			}

			string_literal46=(Token)match(input,18,FOLLOW_18_in_timeCmd2271); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal46_tree = (CommonTree)adaptor.create(string_literal46);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal46_tree, root_0);
			}

			char_literal47=(Token)match(input,14,FOLLOW_14_in_timeCmd2274); if (state.failed) return retval;
			STR48=(Token)match(input,STR,FOLLOW_STR_in_timeCmd2277); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STR48_tree = (CommonTree)adaptor.create(STR48);
			adaptor.addChild(root_0, STR48_tree);
			}

			char_literal49=(Token)match(input,15,FOLLOW_15_in_timeCmd2279); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timeCmd2"


	public static class regex_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "regex"
	// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:19:1: regex : ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) )? '_regex' ^ '(' ! STR ')' !;
	public final queryCmdParser.regex_return regex() throws RecognitionException {
		queryCmdParser.regex_return retval = new queryCmdParser.regex_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STR50=null;
		Token EQU51=null;
		Token GT52=null;
		Token LT53=null;
		Token LTU54=null;
		Token GTU55=null;
		Token NU56=null;
		Token string_literal57=null;
		Token char_literal58=null;
		Token STR59=null;
		Token char_literal60=null;

		CommonTree STR50_tree=null;
		CommonTree EQU51_tree=null;
		CommonTree GT52_tree=null;
		CommonTree LT53_tree=null;
		CommonTree LTU54_tree=null;
		CommonTree GTU55_tree=null;
		CommonTree NU56_tree=null;
		CommonTree string_literal57_tree=null;
		CommonTree char_literal58_tree=null;
		CommonTree STR59_tree=null;
		CommonTree char_literal60_tree=null;

		try {
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:19:7: ( ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) )? '_regex' ^ '(' ! STR ')' !)
			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:19:9: ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) )? '_regex' ^ '(' ! STR ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:19:9: ( STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^) )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==STR) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:19:10: STR ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^)
					{
					STR50=(Token)match(input,STR,FOLLOW_STR_in_regex289); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STR50_tree = (CommonTree)adaptor.create(STR50);
					adaptor.addChild(root_0, STR50_tree);
					}

					// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:19:14: ( EQU ^| GT ^| LT ^| LTU ^| GTU ^| NU ^)
					int alt10=6;
					switch ( input.LA(1) ) {
					case EQU:
						{
						alt10=1;
						}
						break;
					case GT:
						{
						alt10=2;
						}
						break;
					case LT:
						{
						alt10=3;
						}
						break;
					case LTU:
						{
						alt10=4;
						}
						break;
					case GTU:
						{
						alt10=5;
						}
						break;
					case NU:
						{
						alt10=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:19:15: EQU ^
							{
							EQU51=(Token)match(input,EQU,FOLLOW_EQU_in_regex292); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQU51_tree = (CommonTree)adaptor.create(EQU51);
							root_0 = (CommonTree)adaptor.becomeRoot(EQU51_tree, root_0);
							}

							}
							break;
						case 2 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:19:22: GT ^
							{
							GT52=(Token)match(input,GT,FOLLOW_GT_in_regex297); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GT52_tree = (CommonTree)adaptor.create(GT52);
							root_0 = (CommonTree)adaptor.becomeRoot(GT52_tree, root_0);
							}

							}
							break;
						case 3 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:19:28: LT ^
							{
							LT53=(Token)match(input,LT,FOLLOW_LT_in_regex302); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LT53_tree = (CommonTree)adaptor.create(LT53);
							root_0 = (CommonTree)adaptor.becomeRoot(LT53_tree, root_0);
							}

							}
							break;
						case 4 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:19:34: LTU ^
							{
							LTU54=(Token)match(input,LTU,FOLLOW_LTU_in_regex307); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LTU54_tree = (CommonTree)adaptor.create(LTU54);
							root_0 = (CommonTree)adaptor.becomeRoot(LTU54_tree, root_0);
							}

							}
							break;
						case 5 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:19:41: GTU ^
							{
							GTU55=(Token)match(input,GTU,FOLLOW_GTU_in_regex312); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GTU55_tree = (CommonTree)adaptor.create(GTU55);
							root_0 = (CommonTree)adaptor.becomeRoot(GTU55_tree, root_0);
							}

							}
							break;
						case 6 :
							// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:19:48: NU ^
							{
							NU56=(Token)match(input,NU,FOLLOW_NU_in_regex317); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NU56_tree = (CommonTree)adaptor.create(NU56);
							root_0 = (CommonTree)adaptor.becomeRoot(NU56_tree, root_0);
							}

							}
							break;

					}

					}
					break;

			}

			string_literal57=(Token)match(input,16,FOLLOW_16_in_regex323); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal57_tree = (CommonTree)adaptor.create(string_literal57);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal57_tree, root_0);
			}

			char_literal58=(Token)match(input,14,FOLLOW_14_in_regex326); if (state.failed) return retval;
			STR59=(Token)match(input,STR,FOLLOW_STR_in_regex329); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STR59_tree = (CommonTree)adaptor.create(STR59);
			adaptor.addChild(root_0, STR59_tree);
			}

			char_literal60=(Token)match(input,15,FOLLOW_15_in_regex331); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "regex"

	// $ANTLR start synpred3_queryCmd
	public final void synpred3_queryCmd_fragment() throws RecognitionException {
		// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:12:9: ( '(' atom ')' )
		// C:\\Users\\lobster\\Desktop\\cmd\\queryCmd.g:12:9: '(' atom ')'
		{
		match(input,14,FOLLOW_14_in_synpred3_queryCmd89); if (state.failed) return;

		pushFollow(FOLLOW_atom_in_synpred3_queryCmd92);
		atom();
		state._fsp--;
		if (state.failed) return;

		match(input,15,FOLLOW_15_in_synpred3_queryCmd94); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_queryCmd

	// Delegated rules

	public final boolean synpred3_queryCmd() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_queryCmd_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_ratom_in_queryCmd52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_ratom61 = new BitSet(new long[]{0x0000000000077000L});
	public static final BitSet FOLLOW_catom_in_ratom64 = new BitSet(new long[]{0x0000000000008810L});
	public static final BitSet FOLLOW_AND_in_ratom68 = new BitSet(new long[]{0x0000000000077000L});
	public static final BitSet FOLLOW_OR_in_ratom71 = new BitSet(new long[]{0x0000000000077000L});
	public static final BitSet FOLLOW_catom_in_ratom75 = new BitSet(new long[]{0x0000000000008810L});
	public static final BitSet FOLLOW_15_in_ratom79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_catom89 = new BitSet(new long[]{0x0000000000073000L});
	public static final BitSet FOLLOW_atom_in_catom92 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_catom94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_catom99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ratom_in_catom104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_in_atom113 = new BitSet(new long[]{0x00000000000007E0L});
	public static final BitSet FOLLOW_EQU_in_atom116 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_GT_in_atom121 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LT_in_atom126 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_LTU_in_atom131 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_GTU_in_atom136 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NU_in_atom141 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_STR_in_atom145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_in_atom149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_notCmd_in_atom153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeCmd_in_atom157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeCmd2_in_atom161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_regex_in_atom165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_notCmd174 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_STR_in_notCmd177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_in_timeCmd186 = new BitSet(new long[]{0x00000000000007E0L});
	public static final BitSet FOLLOW_EQU_in_timeCmd189 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_GT_in_timeCmd194 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LT_in_timeCmd199 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LTU_in_timeCmd204 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_GTU_in_timeCmd209 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NU_in_timeCmd214 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_timeCmd220 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_timeCmd223 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_STR_in_timeCmd226 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_timeCmd228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_in_timeCmd2237 = new BitSet(new long[]{0x00000000000007E0L});
	public static final BitSet FOLLOW_EQU_in_timeCmd2240 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_GT_in_timeCmd2245 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LT_in_timeCmd2250 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LTU_in_timeCmd2255 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_GTU_in_timeCmd2260 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_NU_in_timeCmd2265 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_timeCmd2271 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_timeCmd2274 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_STR_in_timeCmd2277 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_timeCmd2279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_in_regex289 = new BitSet(new long[]{0x00000000000007E0L});
	public static final BitSet FOLLOW_EQU_in_regex292 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_GT_in_regex297 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_LT_in_regex302 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_LTU_in_regex307 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_GTU_in_regex312 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_NU_in_regex317 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_regex323 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_regex326 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_STR_in_regex329 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_regex331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_synpred3_queryCmd89 = new BitSet(new long[]{0x0000000000073000L});
	public static final BitSet FOLLOW_atom_in_synpred3_queryCmd92 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_synpred3_queryCmd94 = new BitSet(new long[]{0x0000000000000002L});
}

