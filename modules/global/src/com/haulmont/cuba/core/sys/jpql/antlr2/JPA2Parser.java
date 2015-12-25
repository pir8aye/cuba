// $ANTLR 3.5.2 JPA2.g 2015-12-25 11:41:58

package com.haulmont.cuba.core.sys.jpql.antlr2;

import com.haulmont.cuba.core.sys.jpql.tree.QueryNode;
import com.haulmont.cuba.core.sys.jpql.tree.SelectedItemNode;
import com.haulmont.cuba.core.sys.jpql.tree.PathNode;
import com.haulmont.cuba.core.sys.jpql.tree.FromNode;
import com.haulmont.cuba.core.sys.jpql.tree.SelectionSourceNode;
import com.haulmont.cuba.core.sys.jpql.tree.IdentificationVariableNode;
import com.haulmont.cuba.core.sys.jpql.tree.JoinVariableNode;
import com.haulmont.cuba.core.sys.jpql.tree.CollectionMemberNode;
import com.haulmont.cuba.core.sys.jpql.tree.WhereNode;
import com.haulmont.cuba.core.sys.jpql.tree.SimpleConditionNode;
import com.haulmont.cuba.core.sys.jpql.tree.ParameterNode;
import com.haulmont.cuba.core.sys.jpql.tree.GroupByNode;
import com.haulmont.cuba.core.sys.jpql.tree.OrderByNode;
import com.haulmont.cuba.core.sys.jpql.tree.OrderByFieldNode;
import com.haulmont.cuba.core.sys.jpql.tree.AggregateExpressionNode;
import com.haulmont.cuba.core.sys.jpql.tree.SelectedItemsNode;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class JPA2Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASC", "AVG", "BY", "COMMENT", 
		"COUNT", "DESC", "DISTINCT", "ESCAPE_CHARACTER", "FETCH", "GROUP", "HAVING", 
		"IN", "INNER", "INT_NUMERAL", "JOIN", "LEFT", "LINE_COMMENT", "LOWER", 
		"LPAREN", "MAX", "MIN", "NAMED_PARAMETER", "NOT", "OR", "ORDER", "OUTER", 
		"RPAREN", "RUSSIAN_SYMBOLS", "STRING_LITERAL", "SUM", "TRIM_CHARACTER", 
		"T_AGGREGATE_EXPR", "T_COLLECTION_MEMBER", "T_CONDITION", "T_GROUP_BY", 
		"T_ID_VAR", "T_JOIN_VAR", "T_ORDER_BY", "T_ORDER_BY_FIELD", "T_PARAMETER", 
		"T_QUERY", "T_SELECTED_ENTITY", "T_SELECTED_FIELD", "T_SELECTED_ITEM", 
		"T_SELECTED_ITEMS", "T_SIMPLE_CONDITION", "T_SOURCE", "T_SOURCES", "WORD", 
		"WS", "'${'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0x'", "'<'", 
		"'<='", "'<>'", "'='", "'>'", "'>='", "'?'", "'@BETWEEN'", "'@DATEAFTER'", 
		"'@DATEBEFORE'", "'@DATEEQUALS'", "'@TODAY'", "'ABS('", "'ALL'", "'ANY'", 
		"'AS'", "'BETWEEN'", "'BOTH'", "'CASE'", "'COALESCE('", "'CONCAT('", "'CURRENT_DATE'", 
		"'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'DAY'", "'DELETE'", "'ELSE'", 
		"'EMPTY'", "'END'", "'ENTRY('", "'ESCAPE'", "'EXISTS'", "'FROM'", "'FUNCTION('", 
		"'HOUR'", "'INDEX('", "'IS'", "'KEY('", "'LEADING'", "'LENGTH('", "'LIKE'", 
		"'LOCATE('", "'MEMBER'", "'MINUTE'", "'MOD('", "'MONTH'", "'NEW'", "'NOW'", 
		"'NULL'", "'NULLIF('", "'OBJECT'", "'OF'", "'ON'", "'SECOND'", "'SELECT'", 
		"'SET'", "'SIZE('", "'SOME'", "'SQRT('", "'SUBSTRING('", "'THEN'", "'TRAILING'", 
		"'TREAT('", "'TRIM('", "'TYPE'", "'UPDATE'", "'UPPER('", "'VALUE('", "'WHEN'", 
		"'WHERE'", "'YEAR'", "'false'", "'true'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int T__125=125;
	public static final int T__126=126;
	public static final int T__127=127;
	public static final int T__128=128;
	public static final int T__129=129;
	public static final int T__130=130;
	public static final int T__131=131;
	public static final int T__132=132;
	public static final int T__133=133;
	public static final int T__134=134;
	public static final int T__135=135;
	public static final int T__136=136;
	public static final int AND=4;
	public static final int ASC=5;
	public static final int AVG=6;
	public static final int BY=7;
	public static final int COMMENT=8;
	public static final int COUNT=9;
	public static final int DESC=10;
	public static final int DISTINCT=11;
	public static final int ESCAPE_CHARACTER=12;
	public static final int FETCH=13;
	public static final int GROUP=14;
	public static final int HAVING=15;
	public static final int IN=16;
	public static final int INNER=17;
	public static final int INT_NUMERAL=18;
	public static final int JOIN=19;
	public static final int LEFT=20;
	public static final int LINE_COMMENT=21;
	public static final int LOWER=22;
	public static final int LPAREN=23;
	public static final int MAX=24;
	public static final int MIN=25;
	public static final int NAMED_PARAMETER=26;
	public static final int NOT=27;
	public static final int OR=28;
	public static final int ORDER=29;
	public static final int OUTER=30;
	public static final int RPAREN=31;
	public static final int RUSSIAN_SYMBOLS=32;
	public static final int STRING_LITERAL=33;
	public static final int SUM=34;
	public static final int TRIM_CHARACTER=35;
	public static final int T_AGGREGATE_EXPR=36;
	public static final int T_COLLECTION_MEMBER=37;
	public static final int T_CONDITION=38;
	public static final int T_GROUP_BY=39;
	public static final int T_ID_VAR=40;
	public static final int T_JOIN_VAR=41;
	public static final int T_ORDER_BY=42;
	public static final int T_ORDER_BY_FIELD=43;
	public static final int T_PARAMETER=44;
	public static final int T_QUERY=45;
	public static final int T_SELECTED_ENTITY=46;
	public static final int T_SELECTED_FIELD=47;
	public static final int T_SELECTED_ITEM=48;
	public static final int T_SELECTED_ITEMS=49;
	public static final int T_SIMPLE_CONDITION=50;
	public static final int T_SOURCE=51;
	public static final int T_SOURCES=52;
	public static final int WORD=53;
	public static final int WS=54;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JPA2Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JPA2Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return JPA2Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "JPA2.g"; }


	public static class ql_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ql_statement"
	// JPA2.g:98:1: ql_statement : select_statement ;
	public final JPA2Parser.ql_statement_return ql_statement() throws RecognitionException {
		JPA2Parser.ql_statement_return retval = new JPA2Parser.ql_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope select_statement1 =null;


		try {
			// JPA2.g:99:5: ( select_statement )
			// JPA2.g:99:7: select_statement
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_select_statement_in_ql_statement430);
			select_statement1=select_statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, select_statement1.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ql_statement"


	public static class select_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_statement"
	// JPA2.g:101:1: select_statement : sl= 'SELECT' select_clause from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? -> ^( T_QUERY[$sl] ( select_clause )? from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ) ;
	public final JPA2Parser.select_statement_return select_statement() throws RecognitionException {
		JPA2Parser.select_statement_return retval = new JPA2Parser.select_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token sl=null;
		ParserRuleReturnScope select_clause2 =null;
		ParserRuleReturnScope from_clause3 =null;
		ParserRuleReturnScope where_clause4 =null;
		ParserRuleReturnScope groupby_clause5 =null;
		ParserRuleReturnScope having_clause6 =null;
		ParserRuleReturnScope orderby_clause7 =null;

		Object sl_tree=null;
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
		RewriteRuleSubtreeStream stream_select_clause=new RewriteRuleSubtreeStream(adaptor,"rule select_clause");
		RewriteRuleSubtreeStream stream_from_clause=new RewriteRuleSubtreeStream(adaptor,"rule from_clause");
		RewriteRuleSubtreeStream stream_groupby_clause=new RewriteRuleSubtreeStream(adaptor,"rule groupby_clause");
		RewriteRuleSubtreeStream stream_having_clause=new RewriteRuleSubtreeStream(adaptor,"rule having_clause");
		RewriteRuleSubtreeStream stream_orderby_clause=new RewriteRuleSubtreeStream(adaptor,"rule orderby_clause");

		try {
			// JPA2.g:102:6: (sl= 'SELECT' select_clause from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? -> ^( T_QUERY[$sl] ( select_clause )? from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? ) )
			// JPA2.g:102:8: sl= 'SELECT' select_clause from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )?
			{
			sl=(Token)match(input,117,FOLLOW_117_in_select_statement445); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_117.add(sl);

			pushFollow(FOLLOW_select_clause_in_select_statement447);
			select_clause2=select_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_select_clause.add(select_clause2.getTree());
			pushFollow(FOLLOW_from_clause_in_select_statement449);
			from_clause3=from_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_from_clause.add(from_clause3.getTree());
			// JPA2.g:102:46: ( where_clause )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==132) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// JPA2.g:102:47: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_select_statement452);
					where_clause4=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_where_clause.add(where_clause4.getTree());
					}
					break;

			}

			// JPA2.g:102:62: ( groupby_clause )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==GROUP) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// JPA2.g:102:63: groupby_clause
					{
					pushFollow(FOLLOW_groupby_clause_in_select_statement457);
					groupby_clause5=groupby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupby_clause.add(groupby_clause5.getTree());
					}
					break;

			}

			// JPA2.g:102:80: ( having_clause )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==HAVING) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// JPA2.g:102:81: having_clause
					{
					pushFollow(FOLLOW_having_clause_in_select_statement462);
					having_clause6=having_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_having_clause.add(having_clause6.getTree());
					}
					break;

			}

			// JPA2.g:102:97: ( orderby_clause )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ORDER) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// JPA2.g:102:98: orderby_clause
					{
					pushFollow(FOLLOW_orderby_clause_in_select_statement467);
					orderby_clause7=orderby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderby_clause.add(orderby_clause7.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: from_clause, having_clause, select_clause, groupby_clause, orderby_clause, where_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 103:6: -> ^( T_QUERY[$sl] ( select_clause )? from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? )
			{
				// JPA2.g:103:9: ^( T_QUERY[$sl] ( select_clause )? from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ( orderby_clause )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new QueryNode(T_QUERY, sl), root_1);
				// JPA2.g:103:35: ( select_clause )?
				if ( stream_select_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_select_clause.nextTree());
				}
				stream_select_clause.reset();

				adaptor.addChild(root_1, stream_from_clause.nextTree());
				// JPA2.g:103:64: ( where_clause )?
				if ( stream_where_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_where_clause.nextTree());
				}
				stream_where_clause.reset();

				// JPA2.g:103:80: ( groupby_clause )?
				if ( stream_groupby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_groupby_clause.nextTree());
				}
				stream_groupby_clause.reset();

				// JPA2.g:103:98: ( having_clause )?
				if ( stream_having_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_having_clause.nextTree());
				}
				stream_having_clause.reset();

				// JPA2.g:103:115: ( orderby_clause )?
				if ( stream_orderby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_orderby_clause.nextTree());
				}
				stream_orderby_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "select_statement"


	public static class update_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "update_statement"
	// JPA2.g:105:1: update_statement : 'UPDATE' update_clause ( where_clause )? ;
	public final JPA2Parser.update_statement_return update_statement() throws RecognitionException {
		JPA2Parser.update_statement_return retval = new JPA2Parser.update_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal8=null;
		ParserRuleReturnScope update_clause9 =null;
		ParserRuleReturnScope where_clause10 =null;

		Object string_literal8_tree=null;

		try {
			// JPA2.g:106:5: ( 'UPDATE' update_clause ( where_clause )? )
			// JPA2.g:106:7: 'UPDATE' update_clause ( where_clause )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal8=(Token)match(input,128,FOLLOW_128_in_update_statement523); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal8_tree = (Object)adaptor.create(string_literal8);
			adaptor.addChild(root_0, string_literal8_tree);
			}

			pushFollow(FOLLOW_update_clause_in_update_statement525);
			update_clause9=update_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, update_clause9.getTree());

			// JPA2.g:106:30: ( where_clause )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==132) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// JPA2.g:106:31: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_update_statement528);
					where_clause10=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, where_clause10.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "update_statement"


	public static class delete_statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "delete_statement"
	// JPA2.g:107:1: delete_statement : 'DELETE' 'FROM' delete_clause ( where_clause )? ;
	public final JPA2Parser.delete_statement_return delete_statement() throws RecognitionException {
		JPA2Parser.delete_statement_return retval = new JPA2Parser.delete_statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal11=null;
		Token string_literal12=null;
		ParserRuleReturnScope delete_clause13 =null;
		ParserRuleReturnScope where_clause14 =null;

		Object string_literal11_tree=null;
		Object string_literal12_tree=null;

		try {
			// JPA2.g:108:5: ( 'DELETE' 'FROM' delete_clause ( where_clause )? )
			// JPA2.g:108:7: 'DELETE' 'FROM' delete_clause ( where_clause )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal11=(Token)match(input,88,FOLLOW_88_in_delete_statement541); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal11_tree = (Object)adaptor.create(string_literal11);
			adaptor.addChild(root_0, string_literal11_tree);
			}

			string_literal12=(Token)match(input,95,FOLLOW_95_in_delete_statement543); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal12_tree = (Object)adaptor.create(string_literal12);
			adaptor.addChild(root_0, string_literal12_tree);
			}

			pushFollow(FOLLOW_delete_clause_in_delete_statement545);
			delete_clause13=delete_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, delete_clause13.getTree());

			// JPA2.g:108:37: ( where_clause )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==132) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// JPA2.g:108:38: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_delete_statement548);
					where_clause14=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, where_clause14.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "delete_statement"


	public static class from_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "from_clause"
	// JPA2.g:110:1: from_clause : fr= 'FROM' identification_variable_declaration ( ',' identification_variable_declaration_or_collection_member_declaration )* -> ^( T_SOURCES[$fr] identification_variable_declaration ( identification_variable_declaration_or_collection_member_declaration )* ) ;
	public final JPA2Parser.from_clause_return from_clause() throws RecognitionException {
		JPA2Parser.from_clause_return retval = new JPA2Parser.from_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token fr=null;
		Token char_literal16=null;
		ParserRuleReturnScope identification_variable_declaration15 =null;
		ParserRuleReturnScope identification_variable_declaration_or_collection_member_declaration17 =null;

		Object fr_tree=null;
		Object char_literal16_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
		RewriteRuleSubtreeStream stream_identification_variable_declaration=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable_declaration");
		RewriteRuleSubtreeStream stream_identification_variable_declaration_or_collection_member_declaration=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable_declaration_or_collection_member_declaration");

		try {
			// JPA2.g:111:6: (fr= 'FROM' identification_variable_declaration ( ',' identification_variable_declaration_or_collection_member_declaration )* -> ^( T_SOURCES[$fr] identification_variable_declaration ( identification_variable_declaration_or_collection_member_declaration )* ) )
			// JPA2.g:111:8: fr= 'FROM' identification_variable_declaration ( ',' identification_variable_declaration_or_collection_member_declaration )*
			{
			fr=(Token)match(input,95,FOLLOW_95_in_from_clause565); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_95.add(fr);

			pushFollow(FOLLOW_identification_variable_declaration_in_from_clause567);
			identification_variable_declaration15=identification_variable_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identification_variable_declaration.add(identification_variable_declaration15.getTree());
			// JPA2.g:111:54: ( ',' identification_variable_declaration_or_collection_member_declaration )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==58) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// JPA2.g:111:55: ',' identification_variable_declaration_or_collection_member_declaration
					{
					char_literal16=(Token)match(input,58,FOLLOW_58_in_from_clause570); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal16);

					pushFollow(FOLLOW_identification_variable_declaration_or_collection_member_declaration_in_from_clause572);
					identification_variable_declaration_or_collection_member_declaration17=identification_variable_declaration_or_collection_member_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identification_variable_declaration_or_collection_member_declaration.add(identification_variable_declaration_or_collection_member_declaration17.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			// AST REWRITE
			// elements: identification_variable_declaration, identification_variable_declaration_or_collection_member_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 112:6: -> ^( T_SOURCES[$fr] identification_variable_declaration ( identification_variable_declaration_or_collection_member_declaration )* )
			{
				// JPA2.g:112:9: ^( T_SOURCES[$fr] identification_variable_declaration ( identification_variable_declaration_or_collection_member_declaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new FromNode(T_SOURCES, fr), root_1);
				adaptor.addChild(root_1, stream_identification_variable_declaration.nextTree());
				// JPA2.g:112:72: ( identification_variable_declaration_or_collection_member_declaration )*
				while ( stream_identification_variable_declaration_or_collection_member_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_identification_variable_declaration_or_collection_member_declaration.nextTree());
				}
				stream_identification_variable_declaration_or_collection_member_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "from_clause"


	public static class identification_variable_declaration_or_collection_member_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identification_variable_declaration_or_collection_member_declaration"
	// JPA2.g:113:1: identification_variable_declaration_or_collection_member_declaration : ( identification_variable_declaration | collection_member_declaration -> ^( T_SOURCE collection_member_declaration ) );
	public final JPA2Parser.identification_variable_declaration_or_collection_member_declaration_return identification_variable_declaration_or_collection_member_declaration() throws RecognitionException {
		JPA2Parser.identification_variable_declaration_or_collection_member_declaration_return retval = new JPA2Parser.identification_variable_declaration_or_collection_member_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identification_variable_declaration18 =null;
		ParserRuleReturnScope collection_member_declaration19 =null;

		RewriteRuleSubtreeStream stream_collection_member_declaration=new RewriteRuleSubtreeStream(adaptor,"rule collection_member_declaration");

		try {
			// JPA2.g:114:6: ( identification_variable_declaration | collection_member_declaration -> ^( T_SOURCE collection_member_declaration ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==WORD) ) {
				alt8=1;
			}
			else if ( (LA8_0==IN) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// JPA2.g:114:8: identification_variable_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_declaration_in_identification_variable_declaration_or_collection_member_declaration606);
					identification_variable_declaration18=identification_variable_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable_declaration18.getTree());

					}
					break;
				case 2 :
					// JPA2.g:115:8: collection_member_declaration
					{
					pushFollow(FOLLOW_collection_member_declaration_in_identification_variable_declaration_or_collection_member_declaration615);
					collection_member_declaration19=collection_member_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_collection_member_declaration.add(collection_member_declaration19.getTree());
					// AST REWRITE
					// elements: collection_member_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 115:38: -> ^( T_SOURCE collection_member_declaration )
					{
						// JPA2.g:115:41: ^( T_SOURCE collection_member_declaration )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new SelectionSourceNode(T_SOURCE), root_1);
						adaptor.addChild(root_1, stream_collection_member_declaration.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identification_variable_declaration_or_collection_member_declaration"


	public static class identification_variable_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identification_variable_declaration"
	// JPA2.g:117:1: identification_variable_declaration : range_variable_declaration ( joined_clause )* -> ^( T_SOURCE range_variable_declaration ( joined_clause )* ) ;
	public final JPA2Parser.identification_variable_declaration_return identification_variable_declaration() throws RecognitionException {
		JPA2Parser.identification_variable_declaration_return retval = new JPA2Parser.identification_variable_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope range_variable_declaration20 =null;
		ParserRuleReturnScope joined_clause21 =null;

		RewriteRuleSubtreeStream stream_range_variable_declaration=new RewriteRuleSubtreeStream(adaptor,"rule range_variable_declaration");
		RewriteRuleSubtreeStream stream_joined_clause=new RewriteRuleSubtreeStream(adaptor,"rule joined_clause");

		try {
			// JPA2.g:118:6: ( range_variable_declaration ( joined_clause )* -> ^( T_SOURCE range_variable_declaration ( joined_clause )* ) )
			// JPA2.g:118:8: range_variable_declaration ( joined_clause )*
			{
			pushFollow(FOLLOW_range_variable_declaration_in_identification_variable_declaration639);
			range_variable_declaration20=range_variable_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_range_variable_declaration.add(range_variable_declaration20.getTree());
			// JPA2.g:118:35: ( joined_clause )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==INNER||(LA9_0 >= JOIN && LA9_0 <= LEFT)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// JPA2.g:118:35: joined_clause
					{
					pushFollow(FOLLOW_joined_clause_in_identification_variable_declaration641);
					joined_clause21=joined_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_joined_clause.add(joined_clause21.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			// AST REWRITE
			// elements: joined_clause, range_variable_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 119:6: -> ^( T_SOURCE range_variable_declaration ( joined_clause )* )
			{
				// JPA2.g:119:9: ^( T_SOURCE range_variable_declaration ( joined_clause )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new SelectionSourceNode(T_SOURCE), root_1);
				adaptor.addChild(root_1, stream_range_variable_declaration.nextTree());
				// JPA2.g:119:68: ( joined_clause )*
				while ( stream_joined_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_joined_clause.nextTree());
				}
				stream_joined_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identification_variable_declaration"


	public static class joined_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "joined_clause"
	// JPA2.g:120:1: joined_clause : ( join | fetch_join );
	public final JPA2Parser.joined_clause_return joined_clause() throws RecognitionException {
		JPA2Parser.joined_clause_return retval = new JPA2Parser.joined_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope join22 =null;
		ParserRuleReturnScope fetch_join23 =null;


		try {
			// JPA2.g:120:15: ( join | fetch_join )
			int alt10=2;
			switch ( input.LA(1) ) {
			case LEFT:
				{
				int LA10_1 = input.LA(2);
				if ( (LA10_1==OUTER) ) {
					int LA10_4 = input.LA(3);
					if ( (LA10_4==JOIN) ) {
						int LA10_3 = input.LA(4);
						if ( (LA10_3==WORD||LA10_3==125) ) {
							alt10=1;
						}
						else if ( (LA10_3==FETCH) ) {
							alt10=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 10, 3, input);
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
								new NoViableAltException("", 10, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA10_1==JOIN) ) {
					int LA10_3 = input.LA(3);
					if ( (LA10_3==WORD||LA10_3==125) ) {
						alt10=1;
					}
					else if ( (LA10_3==FETCH) ) {
						alt10=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 3, input);
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
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INNER:
				{
				int LA10_2 = input.LA(2);
				if ( (LA10_2==JOIN) ) {
					int LA10_3 = input.LA(3);
					if ( (LA10_3==WORD||LA10_3==125) ) {
						alt10=1;
					}
					else if ( (LA10_3==FETCH) ) {
						alt10=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 3, input);
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
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case JOIN:
				{
				int LA10_3 = input.LA(2);
				if ( (LA10_3==WORD||LA10_3==125) ) {
					alt10=1;
				}
				else if ( (LA10_3==FETCH) ) {
					alt10=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

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
					// JPA2.g:120:17: join
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_join_in_joined_clause668);
					join22=join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, join22.getTree());

					}
					break;
				case 2 :
					// JPA2.g:120:24: fetch_join
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fetch_join_in_joined_clause672);
					fetch_join23=fetch_join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fetch_join23.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "joined_clause"


	public static class range_variable_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "range_variable_declaration"
	// JPA2.g:121:1: range_variable_declaration : entity_name ( 'AS' )? identification_variable -> ^( T_ID_VAR[$identification_variable.text] entity_name ) ;
	public final JPA2Parser.range_variable_declaration_return range_variable_declaration() throws RecognitionException {
		JPA2Parser.range_variable_declaration_return retval = new JPA2Parser.range_variable_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal25=null;
		ParserRuleReturnScope entity_name24 =null;
		ParserRuleReturnScope identification_variable26 =null;

		Object string_literal25_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_entity_name=new RewriteRuleSubtreeStream(adaptor,"rule entity_name");
		RewriteRuleSubtreeStream stream_identification_variable=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable");

		try {
			// JPA2.g:122:6: ( entity_name ( 'AS' )? identification_variable -> ^( T_ID_VAR[$identification_variable.text] entity_name ) )
			// JPA2.g:122:8: entity_name ( 'AS' )? identification_variable
			{
			pushFollow(FOLLOW_entity_name_in_range_variable_declaration684);
			entity_name24=entity_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_entity_name.add(entity_name24.getTree());
			// JPA2.g:122:20: ( 'AS' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==78) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// JPA2.g:122:21: 'AS'
					{
					string_literal25=(Token)match(input,78,FOLLOW_78_in_range_variable_declaration687); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(string_literal25);

					}
					break;

			}

			pushFollow(FOLLOW_identification_variable_in_range_variable_declaration691);
			identification_variable26=identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable26.getTree());
			// AST REWRITE
			// elements: entity_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 123:6: -> ^( T_ID_VAR[$identification_variable.text] entity_name )
			{
				// JPA2.g:123:9: ^( T_ID_VAR[$identification_variable.text] entity_name )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new IdentificationVariableNode(T_ID_VAR, (identification_variable26!=null?input.toString(identification_variable26.start,identification_variable26.stop):null)), root_1);
				adaptor.addChild(root_1, stream_entity_name.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range_variable_declaration"


	public static class join_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "join"
	// JPA2.g:124:1: join : join_spec join_association_path_expression ( 'AS' )? identification_variable ( 'ON' conditional_expression )? -> ^( T_JOIN_VAR[$join_spec.text, $identification_variable.text, $conditional_expression.text] join_association_path_expression ) ;
	public final JPA2Parser.join_return join() throws RecognitionException {
		JPA2Parser.join_return retval = new JPA2Parser.join_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal29=null;
		Token string_literal31=null;
		ParserRuleReturnScope join_spec27 =null;
		ParserRuleReturnScope join_association_path_expression28 =null;
		ParserRuleReturnScope identification_variable30 =null;
		ParserRuleReturnScope conditional_expression32 =null;

		Object string_literal29_tree=null;
		Object string_literal31_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleSubtreeStream stream_conditional_expression=new RewriteRuleSubtreeStream(adaptor,"rule conditional_expression");
		RewriteRuleSubtreeStream stream_join_association_path_expression=new RewriteRuleSubtreeStream(adaptor,"rule join_association_path_expression");
		RewriteRuleSubtreeStream stream_identification_variable=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable");
		RewriteRuleSubtreeStream stream_join_spec=new RewriteRuleSubtreeStream(adaptor,"rule join_spec");

		try {
			// JPA2.g:125:6: ( join_spec join_association_path_expression ( 'AS' )? identification_variable ( 'ON' conditional_expression )? -> ^( T_JOIN_VAR[$join_spec.text, $identification_variable.text, $conditional_expression.text] join_association_path_expression ) )
			// JPA2.g:125:8: join_spec join_association_path_expression ( 'AS' )? identification_variable ( 'ON' conditional_expression )?
			{
			pushFollow(FOLLOW_join_spec_in_join720);
			join_spec27=join_spec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_join_spec.add(join_spec27.getTree());
			pushFollow(FOLLOW_join_association_path_expression_in_join722);
			join_association_path_expression28=join_association_path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_join_association_path_expression.add(join_association_path_expression28.getTree());
			// JPA2.g:125:51: ( 'AS' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==78) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// JPA2.g:125:52: 'AS'
					{
					string_literal29=(Token)match(input,78,FOLLOW_78_in_join725); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(string_literal29);

					}
					break;

			}

			pushFollow(FOLLOW_identification_variable_in_join729);
			identification_variable30=identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable30.getTree());
			// JPA2.g:125:83: ( 'ON' conditional_expression )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==115) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// JPA2.g:125:84: 'ON' conditional_expression
					{
					string_literal31=(Token)match(input,115,FOLLOW_115_in_join732); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_115.add(string_literal31);

					pushFollow(FOLLOW_conditional_expression_in_join734);
					conditional_expression32=conditional_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_conditional_expression.add(conditional_expression32.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: join_association_path_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 126:6: -> ^( T_JOIN_VAR[$join_spec.text, $identification_variable.text, $conditional_expression.text] join_association_path_expression )
			{
				// JPA2.g:126:9: ^( T_JOIN_VAR[$join_spec.text, $identification_variable.text, $conditional_expression.text] join_association_path_expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new JoinVariableNode(T_JOIN_VAR, (join_spec27!=null?input.toString(join_spec27.start,join_spec27.stop):null), (identification_variable30!=null?input.toString(identification_variable30.start,identification_variable30.stop):null), (conditional_expression32!=null?input.toString(conditional_expression32.start,conditional_expression32.stop):null)), root_1);
				adaptor.addChild(root_1, stream_join_association_path_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "join"


	public static class fetch_join_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fetch_join"
	// JPA2.g:127:1: fetch_join : join_spec 'FETCH' join_association_path_expression ;
	public final JPA2Parser.fetch_join_return fetch_join() throws RecognitionException {
		JPA2Parser.fetch_join_return retval = new JPA2Parser.fetch_join_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal34=null;
		ParserRuleReturnScope join_spec33 =null;
		ParserRuleReturnScope join_association_path_expression35 =null;

		Object string_literal34_tree=null;

		try {
			// JPA2.g:128:6: ( join_spec 'FETCH' join_association_path_expression )
			// JPA2.g:128:8: join_spec 'FETCH' join_association_path_expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_join_spec_in_fetch_join765);
			join_spec33=join_spec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, join_spec33.getTree());

			string_literal34=(Token)match(input,FETCH,FOLLOW_FETCH_in_fetch_join767); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal34_tree = (Object)adaptor.create(string_literal34);
			adaptor.addChild(root_0, string_literal34_tree);
			}

			pushFollow(FOLLOW_join_association_path_expression_in_fetch_join769);
			join_association_path_expression35=join_association_path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, join_association_path_expression35.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fetch_join"


	public static class join_spec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "join_spec"
	// JPA2.g:129:1: join_spec : ( ( 'LEFT' ) ( 'OUTER' )? | 'INNER' )? 'JOIN' ;
	public final JPA2Parser.join_spec_return join_spec() throws RecognitionException {
		JPA2Parser.join_spec_return retval = new JPA2Parser.join_spec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal36=null;
		Token string_literal37=null;
		Token string_literal38=null;
		Token string_literal39=null;

		Object string_literal36_tree=null;
		Object string_literal37_tree=null;
		Object string_literal38_tree=null;
		Object string_literal39_tree=null;

		try {
			// JPA2.g:130:6: ( ( ( 'LEFT' ) ( 'OUTER' )? | 'INNER' )? 'JOIN' )
			// JPA2.g:130:8: ( ( 'LEFT' ) ( 'OUTER' )? | 'INNER' )? 'JOIN'
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:130:8: ( ( 'LEFT' ) ( 'OUTER' )? | 'INNER' )?
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==LEFT) ) {
				alt15=1;
			}
			else if ( (LA15_0==INNER) ) {
				alt15=2;
			}
			switch (alt15) {
				case 1 :
					// JPA2.g:130:9: ( 'LEFT' ) ( 'OUTER' )?
					{
					// JPA2.g:130:9: ( 'LEFT' )
					// JPA2.g:130:10: 'LEFT'
					{
					string_literal36=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_spec783); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal36_tree = (Object)adaptor.create(string_literal36);
					adaptor.addChild(root_0, string_literal36_tree);
					}

					}

					// JPA2.g:130:18: ( 'OUTER' )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==OUTER) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// JPA2.g:130:19: 'OUTER'
							{
							string_literal37=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_spec787); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal37_tree = (Object)adaptor.create(string_literal37);
							adaptor.addChild(root_0, string_literal37_tree);
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// JPA2.g:130:31: 'INNER'
					{
					string_literal38=(Token)match(input,INNER,FOLLOW_INNER_in_join_spec793); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal38_tree = (Object)adaptor.create(string_literal38);
					adaptor.addChild(root_0, string_literal38_tree);
					}

					}
					break;

			}

			string_literal39=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_spec798); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal39_tree = (Object)adaptor.create(string_literal39);
			adaptor.addChild(root_0, string_literal39_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "join_spec"


	public static class join_association_path_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "join_association_path_expression"
	// JPA2.g:133:1: join_association_path_expression : ( identification_variable '.' ( field '.' )* ( field )? -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* ) | 'TREAT(' identification_variable '.' ( field '.' )* ( field )? 'AS' subtype ')' -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* ) | entity_name );
	public final JPA2Parser.join_association_path_expression_return join_association_path_expression() throws RecognitionException {
		JPA2Parser.join_association_path_expression_return retval = new JPA2Parser.join_association_path_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal41=null;
		Token char_literal43=null;
		Token string_literal45=null;
		Token char_literal47=null;
		Token char_literal49=null;
		Token string_literal51=null;
		Token char_literal53=null;
		ParserRuleReturnScope identification_variable40 =null;
		ParserRuleReturnScope field42 =null;
		ParserRuleReturnScope field44 =null;
		ParserRuleReturnScope identification_variable46 =null;
		ParserRuleReturnScope field48 =null;
		ParserRuleReturnScope field50 =null;
		ParserRuleReturnScope subtype52 =null;
		ParserRuleReturnScope entity_name54 =null;

		Object char_literal41_tree=null;
		Object char_literal43_tree=null;
		Object string_literal45_tree=null;
		Object char_literal47_tree=null;
		Object char_literal49_tree=null;
		Object string_literal51_tree=null;
		Object char_literal53_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_subtype=new RewriteRuleSubtreeStream(adaptor,"rule subtype");
		RewriteRuleSubtreeStream stream_identification_variable=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable");

		try {
			// JPA2.g:134:6: ( identification_variable '.' ( field '.' )* ( field )? -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* ) | 'TREAT(' identification_variable '.' ( field '.' )* ( field )? 'AS' subtype ')' -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* ) | entity_name )
			int alt20=3;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==WORD) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==60) ) {
					alt20=1;
				}
				else if ( (LA20_1==EOF||(LA20_1 >= GROUP && LA20_1 <= HAVING)||LA20_1==INNER||(LA20_1 >= JOIN && LA20_1 <= LEFT)||LA20_1==ORDER||LA20_1==RPAREN||LA20_1==WORD||LA20_1==58||LA20_1==78||LA20_1==132) ) {
					alt20=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA20_0==125) ) {
				alt20=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// JPA2.g:134:8: identification_variable '.' ( field '.' )* ( field )?
					{
					pushFollow(FOLLOW_identification_variable_in_join_association_path_expression812);
					identification_variable40=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable40.getTree());
					char_literal41=(Token)match(input,60,FOLLOW_60_in_join_association_path_expression814); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_60.add(char_literal41);

					// JPA2.g:134:36: ( field '.' )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==WORD) ) {
							int LA16_1 = input.LA(2);
							if ( (LA16_1==60) ) {
								alt16=1;
							}

						}
						else if ( (LA16_0==GROUP) ) {
							int LA16_3 = input.LA(2);
							if ( (LA16_3==60) ) {
								alt16=1;
							}

						}

						switch (alt16) {
						case 1 :
							// JPA2.g:134:37: field '.'
							{
							pushFollow(FOLLOW_field_in_join_association_path_expression817);
							field42=field();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_field.add(field42.getTree());
							char_literal43=(Token)match(input,60,FOLLOW_60_in_join_association_path_expression818); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_60.add(char_literal43);

							}
							break;

						default :
							break loop16;
						}
					}

					// JPA2.g:134:48: ( field )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==WORD) ) {
						int LA17_1 = input.LA(2);
						if ( (synpred18_JPA2()) ) {
							alt17=1;
						}
					}
					else if ( (LA17_0==GROUP) ) {
						int LA17_3 = input.LA(2);
						if ( (LA17_3==EOF||(LA17_3 >= GROUP && LA17_3 <= HAVING)||LA17_3==INNER||(LA17_3 >= JOIN && LA17_3 <= LEFT)||LA17_3==ORDER||LA17_3==RPAREN||LA17_3==WORD||LA17_3==58||LA17_3==78||LA17_3==132) ) {
							alt17=1;
						}
					}
					switch (alt17) {
						case 1 :
							// JPA2.g:134:48: field
							{
							pushFollow(FOLLOW_field_in_join_association_path_expression822);
							field44=field();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_field.add(field44.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: field
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 135:10: -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* )
					{
						// JPA2.g:135:13: ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new PathNode(T_SELECTED_FIELD, (identification_variable40!=null?input.toString(identification_variable40.start,identification_variable40.stop):null)), root_1);
						// JPA2.g:135:73: ( field )*
						while ( stream_field.hasNext() ) {
							adaptor.addChild(root_1, stream_field.nextTree());
						}
						stream_field.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// JPA2.g:136:9: 'TREAT(' identification_variable '.' ( field '.' )* ( field )? 'AS' subtype ')'
					{
					string_literal45=(Token)match(input,125,FOLLOW_125_in_join_association_path_expression857); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_125.add(string_literal45);

					pushFollow(FOLLOW_identification_variable_in_join_association_path_expression859);
					identification_variable46=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable46.getTree());
					char_literal47=(Token)match(input,60,FOLLOW_60_in_join_association_path_expression861); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_60.add(char_literal47);

					// JPA2.g:136:46: ( field '.' )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==GROUP||LA18_0==WORD) ) {
							int LA18_1 = input.LA(2);
							if ( (LA18_1==60) ) {
								alt18=1;
							}

						}

						switch (alt18) {
						case 1 :
							// JPA2.g:136:47: field '.'
							{
							pushFollow(FOLLOW_field_in_join_association_path_expression864);
							field48=field();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_field.add(field48.getTree());
							char_literal49=(Token)match(input,60,FOLLOW_60_in_join_association_path_expression865); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_60.add(char_literal49);

							}
							break;

						default :
							break loop18;
						}
					}

					// JPA2.g:136:58: ( field )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==GROUP||LA19_0==WORD) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// JPA2.g:136:58: field
							{
							pushFollow(FOLLOW_field_in_join_association_path_expression869);
							field50=field();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_field.add(field50.getTree());
							}
							break;

					}

					string_literal51=(Token)match(input,78,FOLLOW_78_in_join_association_path_expression872); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(string_literal51);

					pushFollow(FOLLOW_subtype_in_join_association_path_expression874);
					subtype52=subtype();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_subtype.add(subtype52.getTree());
					char_literal53=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_association_path_expression876); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(char_literal53);

					// AST REWRITE
					// elements: field
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 137:10: -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* )
					{
						// JPA2.g:137:13: ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new PathNode(T_SELECTED_FIELD, (identification_variable46!=null?input.toString(identification_variable46.start,identification_variable46.stop):null)), root_1);
						// JPA2.g:137:73: ( field )*
						while ( stream_field.hasNext() ) {
							adaptor.addChild(root_1, stream_field.nextTree());
						}
						stream_field.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// JPA2.g:138:8: entity_name
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_entity_name_in_join_association_path_expression909);
					entity_name54=entity_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_name54.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "join_association_path_expression"


	public static class collection_member_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "collection_member_declaration"
	// JPA2.g:141:1: collection_member_declaration : 'IN' '(' path_expression ')' ( 'AS' )? identification_variable -> ^( T_COLLECTION_MEMBER[$identification_variable.text] path_expression ) ;
	public final JPA2Parser.collection_member_declaration_return collection_member_declaration() throws RecognitionException {
		JPA2Parser.collection_member_declaration_return retval = new JPA2Parser.collection_member_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal55=null;
		Token char_literal56=null;
		Token char_literal58=null;
		Token string_literal59=null;
		ParserRuleReturnScope path_expression57 =null;
		ParserRuleReturnScope identification_variable60 =null;

		Object string_literal55_tree=null;
		Object char_literal56_tree=null;
		Object char_literal58_tree=null;
		Object string_literal59_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_identification_variable=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable");
		RewriteRuleSubtreeStream stream_path_expression=new RewriteRuleSubtreeStream(adaptor,"rule path_expression");

		try {
			// JPA2.g:142:5: ( 'IN' '(' path_expression ')' ( 'AS' )? identification_variable -> ^( T_COLLECTION_MEMBER[$identification_variable.text] path_expression ) )
			// JPA2.g:142:7: 'IN' '(' path_expression ')' ( 'AS' )? identification_variable
			{
			string_literal55=(Token)match(input,IN,FOLLOW_IN_in_collection_member_declaration922); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IN.add(string_literal55);

			char_literal56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_collection_member_declaration923); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(char_literal56);

			pushFollow(FOLLOW_path_expression_in_collection_member_declaration925);
			path_expression57=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_path_expression.add(path_expression57.getTree());
			char_literal58=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_collection_member_declaration927); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(char_literal58);

			// JPA2.g:142:35: ( 'AS' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==78) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// JPA2.g:142:36: 'AS'
					{
					string_literal59=(Token)match(input,78,FOLLOW_78_in_collection_member_declaration930); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(string_literal59);

					}
					break;

			}

			pushFollow(FOLLOW_identification_variable_in_collection_member_declaration934);
			identification_variable60=identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable60.getTree());
			// AST REWRITE
			// elements: path_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 143:5: -> ^( T_COLLECTION_MEMBER[$identification_variable.text] path_expression )
			{
				// JPA2.g:143:8: ^( T_COLLECTION_MEMBER[$identification_variable.text] path_expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new CollectionMemberNode(T_COLLECTION_MEMBER, (identification_variable60!=null?input.toString(identification_variable60.start,identification_variable60.stop):null)), root_1);
				adaptor.addChild(root_1, stream_path_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "collection_member_declaration"


	public static class qualified_identification_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "qualified_identification_variable"
	// JPA2.g:145:1: qualified_identification_variable : ( map_field_identification_variable | 'ENTRY(' identification_variable ')' );
	public final JPA2Parser.qualified_identification_variable_return qualified_identification_variable() throws RecognitionException {
		JPA2Parser.qualified_identification_variable_return retval = new JPA2Parser.qualified_identification_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal62=null;
		Token char_literal64=null;
		ParserRuleReturnScope map_field_identification_variable61 =null;
		ParserRuleReturnScope identification_variable63 =null;

		Object string_literal62_tree=null;
		Object char_literal64_tree=null;

		try {
			// JPA2.g:146:5: ( map_field_identification_variable | 'ENTRY(' identification_variable ')' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==100||LA22_0==130) ) {
				alt22=1;
			}
			else if ( (LA22_0==92) ) {
				alt22=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// JPA2.g:146:7: map_field_identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_map_field_identification_variable_in_qualified_identification_variable963);
					map_field_identification_variable61=map_field_identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, map_field_identification_variable61.getTree());

					}
					break;
				case 2 :
					// JPA2.g:147:7: 'ENTRY(' identification_variable ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal62=(Token)match(input,92,FOLLOW_92_in_qualified_identification_variable971); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal62_tree = (Object)adaptor.create(string_literal62);
					adaptor.addChild(root_0, string_literal62_tree);
					}

					pushFollow(FOLLOW_identification_variable_in_qualified_identification_variable972);
					identification_variable63=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable63.getTree());

					char_literal64=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_qualified_identification_variable973); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal64_tree = (Object)adaptor.create(char_literal64);
					adaptor.addChild(root_0, char_literal64_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qualified_identification_variable"


	public static class map_field_identification_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "map_field_identification_variable"
	// JPA2.g:148:1: map_field_identification_variable : ( 'KEY(' identification_variable ')' | 'VALUE(' identification_variable ')' );
	public final JPA2Parser.map_field_identification_variable_return map_field_identification_variable() throws RecognitionException {
		JPA2Parser.map_field_identification_variable_return retval = new JPA2Parser.map_field_identification_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal65=null;
		Token char_literal67=null;
		Token string_literal68=null;
		Token char_literal70=null;
		ParserRuleReturnScope identification_variable66 =null;
		ParserRuleReturnScope identification_variable69 =null;

		Object string_literal65_tree=null;
		Object char_literal67_tree=null;
		Object string_literal68_tree=null;
		Object char_literal70_tree=null;

		try {
			// JPA2.g:148:35: ( 'KEY(' identification_variable ')' | 'VALUE(' identification_variable ')' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==100) ) {
				alt23=1;
			}
			else if ( (LA23_0==130) ) {
				alt23=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// JPA2.g:148:37: 'KEY(' identification_variable ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal65=(Token)match(input,100,FOLLOW_100_in_map_field_identification_variable980); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal65_tree = (Object)adaptor.create(string_literal65);
					adaptor.addChild(root_0, string_literal65_tree);
					}

					pushFollow(FOLLOW_identification_variable_in_map_field_identification_variable981);
					identification_variable66=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable66.getTree());

					char_literal67=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_map_field_identification_variable982); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal67_tree = (Object)adaptor.create(char_literal67);
					adaptor.addChild(root_0, char_literal67_tree);
					}

					}
					break;
				case 2 :
					// JPA2.g:148:72: 'VALUE(' identification_variable ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal68=(Token)match(input,130,FOLLOW_130_in_map_field_identification_variable986); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal68_tree = (Object)adaptor.create(string_literal68);
					adaptor.addChild(root_0, string_literal68_tree);
					}

					pushFollow(FOLLOW_identification_variable_in_map_field_identification_variable987);
					identification_variable69=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable69.getTree());

					char_literal70=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_map_field_identification_variable988); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal70_tree = (Object)adaptor.create(char_literal70);
					adaptor.addChild(root_0, char_literal70_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "map_field_identification_variable"


	public static class path_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "path_expression"
	// JPA2.g:151:1: path_expression : identification_variable '.' ( field '.' )* ( field )? -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* ) ;
	public final JPA2Parser.path_expression_return path_expression() throws RecognitionException {
		JPA2Parser.path_expression_return retval = new JPA2Parser.path_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal72=null;
		Token char_literal74=null;
		ParserRuleReturnScope identification_variable71 =null;
		ParserRuleReturnScope field73 =null;
		ParserRuleReturnScope field75 =null;

		Object char_literal72_tree=null;
		Object char_literal74_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_identification_variable=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable");

		try {
			// JPA2.g:152:5: ( identification_variable '.' ( field '.' )* ( field )? -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* ) )
			// JPA2.g:152:8: identification_variable '.' ( field '.' )* ( field )?
			{
			pushFollow(FOLLOW_identification_variable_in_path_expression1002);
			identification_variable71=identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable71.getTree());
			char_literal72=(Token)match(input,60,FOLLOW_60_in_path_expression1004); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_60.add(char_literal72);

			// JPA2.g:152:36: ( field '.' )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==WORD) ) {
					int LA24_1 = input.LA(2);
					if ( (LA24_1==60) ) {
						alt24=1;
					}

				}
				else if ( (LA24_0==GROUP) ) {
					int LA24_3 = input.LA(2);
					if ( (LA24_3==60) ) {
						alt24=1;
					}

				}

				switch (alt24) {
				case 1 :
					// JPA2.g:152:37: field '.'
					{
					pushFollow(FOLLOW_field_in_path_expression1007);
					field73=field();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_field.add(field73.getTree());
					char_literal74=(Token)match(input,60,FOLLOW_60_in_path_expression1008); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_60.add(char_literal74);

					}
					break;

				default :
					break loop24;
				}
			}

			// JPA2.g:152:48: ( field )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==WORD) ) {
				int LA25_1 = input.LA(2);
				if ( (synpred27_JPA2()) ) {
					alt25=1;
				}
			}
			else if ( (LA25_0==GROUP) ) {
				int LA25_3 = input.LA(2);
				if ( (LA25_3==EOF||(LA25_3 >= AND && LA25_3 <= ASC)||LA25_3==DESC||(LA25_3 >= GROUP && LA25_3 <= INNER)||(LA25_3 >= JOIN && LA25_3 <= LEFT)||(LA25_3 >= NOT && LA25_3 <= ORDER)||LA25_3==RPAREN||LA25_3==WORD||(LA25_3 >= 56 && LA25_3 <= 59)||LA25_3==61||(LA25_3 >= 63 && LA25_3 <= 68)||(LA25_3 >= 78 && LA25_3 <= 79)||LA25_3==89||LA25_3==91||LA25_3==95||LA25_3==99||LA25_3==103||LA25_3==105||LA25_3==123||(LA25_3 >= 131 && LA25_3 <= 132)) ) {
					alt25=1;
				}
			}
			switch (alt25) {
				case 1 :
					// JPA2.g:152:48: field
					{
					pushFollow(FOLLOW_field_in_path_expression1012);
					field75=field();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_field.add(field75.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: field
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 153:5: -> ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* )
			{
				// JPA2.g:153:8: ^( T_SELECTED_FIELD[$identification_variable.text] ( field )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new PathNode(T_SELECTED_FIELD, (identification_variable71!=null?input.toString(identification_variable71.start,identification_variable71.stop):null)), root_1);
				// JPA2.g:153:68: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "path_expression"


	public static class general_identification_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "general_identification_variable"
	// JPA2.g:158:1: general_identification_variable : ( identification_variable | map_field_identification_variable );
	public final JPA2Parser.general_identification_variable_return general_identification_variable() throws RecognitionException {
		JPA2Parser.general_identification_variable_return retval = new JPA2Parser.general_identification_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identification_variable76 =null;
		ParserRuleReturnScope map_field_identification_variable77 =null;


		try {
			// JPA2.g:159:5: ( identification_variable | map_field_identification_variable )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==WORD) ) {
				alt26=1;
			}
			else if ( (LA26_0==100||LA26_0==130) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// JPA2.g:159:7: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_general_identification_variable1051);
					identification_variable76=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable76.getTree());

					}
					break;
				case 2 :
					// JPA2.g:160:7: map_field_identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_map_field_identification_variable_in_general_identification_variable1059);
					map_field_identification_variable77=map_field_identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, map_field_identification_variable77.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "general_identification_variable"


	public static class update_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "update_clause"
	// JPA2.g:161:1: update_clause : entity_name ( ( 'AS' )? identification_variable )? 'SET' update_item ( ',' update_item )* ;
	public final JPA2Parser.update_clause_return update_clause() throws RecognitionException {
		JPA2Parser.update_clause_return retval = new JPA2Parser.update_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal79=null;
		Token string_literal81=null;
		Token char_literal83=null;
		ParserRuleReturnScope entity_name78 =null;
		ParserRuleReturnScope identification_variable80 =null;
		ParserRuleReturnScope update_item82 =null;
		ParserRuleReturnScope update_item84 =null;

		Object string_literal79_tree=null;
		Object string_literal81_tree=null;
		Object char_literal83_tree=null;

		try {
			// JPA2.g:162:5: ( entity_name ( ( 'AS' )? identification_variable )? 'SET' update_item ( ',' update_item )* )
			// JPA2.g:162:7: entity_name ( ( 'AS' )? identification_variable )? 'SET' update_item ( ',' update_item )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_entity_name_in_update_clause1070);
			entity_name78=entity_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_name78.getTree());

			// JPA2.g:162:19: ( ( 'AS' )? identification_variable )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==WORD||LA28_0==78) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// JPA2.g:162:20: ( 'AS' )? identification_variable
					{
					// JPA2.g:162:20: ( 'AS' )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==78) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// JPA2.g:162:21: 'AS'
							{
							string_literal79=(Token)match(input,78,FOLLOW_78_in_update_clause1074); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal79_tree = (Object)adaptor.create(string_literal79);
							adaptor.addChild(root_0, string_literal79_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_identification_variable_in_update_clause1078);
					identification_variable80=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable80.getTree());

					}
					break;

			}

			string_literal81=(Token)match(input,118,FOLLOW_118_in_update_clause1082); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal81_tree = (Object)adaptor.create(string_literal81);
			adaptor.addChild(root_0, string_literal81_tree);
			}

			pushFollow(FOLLOW_update_item_in_update_clause1084);
			update_item82=update_item();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, update_item82.getTree());

			// JPA2.g:162:72: ( ',' update_item )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==58) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// JPA2.g:162:73: ',' update_item
					{
					char_literal83=(Token)match(input,58,FOLLOW_58_in_update_clause1087); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal83_tree = (Object)adaptor.create(char_literal83);
					adaptor.addChild(root_0, char_literal83_tree);
					}

					pushFollow(FOLLOW_update_item_in_update_clause1089);
					update_item84=update_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, update_item84.getTree());

					}
					break;

				default :
					break loop29;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "update_clause"


	public static class update_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "update_item"
	// JPA2.g:163:1: update_item : ( identification_variable '.' ) ( single_valued_embeddable_object_field '.' )* single_valued_object_field '=' new_value ;
	public final JPA2Parser.update_item_return update_item() throws RecognitionException {
		JPA2Parser.update_item_return retval = new JPA2Parser.update_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal86=null;
		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope identification_variable85 =null;
		ParserRuleReturnScope single_valued_embeddable_object_field87 =null;
		ParserRuleReturnScope single_valued_object_field89 =null;
		ParserRuleReturnScope new_value91 =null;

		Object char_literal86_tree=null;
		Object char_literal88_tree=null;
		Object char_literal90_tree=null;

		try {
			// JPA2.g:164:5: ( ( identification_variable '.' ) ( single_valued_embeddable_object_field '.' )* single_valued_object_field '=' new_value )
			// JPA2.g:164:7: ( identification_variable '.' ) ( single_valued_embeddable_object_field '.' )* single_valued_object_field '=' new_value
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:164:7: ( identification_variable '.' )
			// JPA2.g:164:8: identification_variable '.'
			{
			pushFollow(FOLLOW_identification_variable_in_update_item1103);
			identification_variable85=identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable85.getTree());

			char_literal86=(Token)match(input,60,FOLLOW_60_in_update_item1104); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal86_tree = (Object)adaptor.create(char_literal86);
			adaptor.addChild(root_0, char_literal86_tree);
			}

			}

			// JPA2.g:164:35: ( single_valued_embeddable_object_field '.' )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==WORD) ) {
					int LA30_1 = input.LA(2);
					if ( (LA30_1==60) ) {
						alt30=1;
					}

				}

				switch (alt30) {
				case 1 :
					// JPA2.g:164:36: single_valued_embeddable_object_field '.'
					{
					pushFollow(FOLLOW_single_valued_embeddable_object_field_in_update_item1107);
					single_valued_embeddable_object_field87=single_valued_embeddable_object_field();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_valued_embeddable_object_field87.getTree());

					char_literal88=(Token)match(input,60,FOLLOW_60_in_update_item1108); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal88_tree = (Object)adaptor.create(char_literal88);
					adaptor.addChild(root_0, char_literal88_tree);
					}

					}
					break;

				default :
					break loop30;
				}
			}

			pushFollow(FOLLOW_single_valued_object_field_in_update_item1111);
			single_valued_object_field89=single_valued_object_field();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, single_valued_object_field89.getTree());

			char_literal90=(Token)match(input,66,FOLLOW_66_in_update_item1113); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal90_tree = (Object)adaptor.create(char_literal90);
			adaptor.addChild(root_0, char_literal90_tree);
			}

			pushFollow(FOLLOW_new_value_in_update_item1115);
			new_value91=new_value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, new_value91.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "update_item"


	public static class new_value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "new_value"
	// JPA2.g:165:1: new_value : ( scalar_expression | simple_entity_expression | 'NULL' );
	public final JPA2Parser.new_value_return new_value() throws RecognitionException {
		JPA2Parser.new_value_return retval = new JPA2Parser.new_value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal94=null;
		ParserRuleReturnScope scalar_expression92 =null;
		ParserRuleReturnScope simple_entity_expression93 =null;

		Object string_literal94_tree=null;

		try {
			// JPA2.g:166:5: ( scalar_expression | simple_entity_expression | 'NULL' )
			int alt31=3;
			switch ( input.LA(1) ) {
			case AVG:
			case COUNT:
			case INT_NUMERAL:
			case LOWER:
			case LPAREN:
			case MAX:
			case MIN:
			case STRING_LITERAL:
			case SUM:
			case 57:
			case 59:
			case 62:
			case 75:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 96:
			case 98:
			case 102:
			case 104:
			case 107:
			case 112:
			case 119:
			case 121:
			case 122:
			case 126:
			case 127:
			case 129:
			case 134:
			case 135:
				{
				alt31=1;
				}
				break;
			case WORD:
				{
				int LA31_2 = input.LA(2);
				if ( (synpred33_JPA2()) ) {
					alt31=1;
				}
				else if ( (synpred34_JPA2()) ) {
					alt31=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 69:
				{
				int LA31_3 = input.LA(2);
				if ( (LA31_3==62) ) {
					int LA31_8 = input.LA(3);
					if ( (LA31_8==INT_NUMERAL) ) {
						int LA31_9 = input.LA(4);
						if ( (synpred33_JPA2()) ) {
							alt31=1;
						}
						else if ( (synpred34_JPA2()) ) {
							alt31=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 9, input);
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
								new NoViableAltException("", 31, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA31_3==INT_NUMERAL) ) {
					int LA31_9 = input.LA(3);
					if ( (synpred33_JPA2()) ) {
						alt31=1;
					}
					else if ( (synpred34_JPA2()) ) {
						alt31=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 9, input);
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
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA31_4 = input.LA(2);
				if ( (synpred33_JPA2()) ) {
					alt31=1;
				}
				else if ( (synpred34_JPA2()) ) {
					alt31=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 55:
				{
				int LA31_5 = input.LA(2);
				if ( (LA31_5==WORD) ) {
					int LA31_10 = input.LA(3);
					if ( (LA31_10==136) ) {
						int LA31_11 = input.LA(4);
						if ( (synpred33_JPA2()) ) {
							alt31=1;
						}
						else if ( (synpred34_JPA2()) ) {
							alt31=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 11, input);
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
								new NoViableAltException("", 31, 10, input);
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
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 111:
				{
				alt31=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// JPA2.g:166:7: scalar_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_scalar_expression_in_new_value1126);
					scalar_expression92=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression92.getTree());

					}
					break;
				case 2 :
					// JPA2.g:167:7: simple_entity_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_entity_expression_in_new_value1134);
					simple_entity_expression93=simple_entity_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_entity_expression93.getTree());

					}
					break;
				case 3 :
					// JPA2.g:168:7: 'NULL'
					{
					root_0 = (Object)adaptor.nil();


					string_literal94=(Token)match(input,111,FOLLOW_111_in_new_value1142); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal94_tree = (Object)adaptor.create(string_literal94);
					adaptor.addChild(root_0, string_literal94_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "new_value"


	public static class delete_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "delete_clause"
	// JPA2.g:169:1: delete_clause : entity_name ( ( 'AS' )? identification_variable )? ;
	public final JPA2Parser.delete_clause_return delete_clause() throws RecognitionException {
		JPA2Parser.delete_clause_return retval = new JPA2Parser.delete_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal96=null;
		ParserRuleReturnScope entity_name95 =null;
		ParserRuleReturnScope identification_variable97 =null;

		Object string_literal96_tree=null;

		try {
			// JPA2.g:170:5: ( entity_name ( ( 'AS' )? identification_variable )? )
			// JPA2.g:170:7: entity_name ( ( 'AS' )? identification_variable )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_entity_name_in_delete_clause1153);
			entity_name95=entity_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_name95.getTree());

			// JPA2.g:170:19: ( ( 'AS' )? identification_variable )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==WORD||LA33_0==78) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// JPA2.g:170:20: ( 'AS' )? identification_variable
					{
					// JPA2.g:170:20: ( 'AS' )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==78) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// JPA2.g:170:21: 'AS'
							{
							string_literal96=(Token)match(input,78,FOLLOW_78_in_delete_clause1157); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal96_tree = (Object)adaptor.create(string_literal96);
							adaptor.addChild(root_0, string_literal96_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_identification_variable_in_delete_clause1161);
					identification_variable97=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable97.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "delete_clause"


	public static class select_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_clause"
	// JPA2.g:171:1: select_clause : ( 'DISTINCT' )? select_item ( ',' select_item )* -> ^( T_SELECTED_ITEMS[] ( 'DISTINCT' )? ( ^( T_SELECTED_ITEM[] select_item ) )* ) ;
	public final JPA2Parser.select_clause_return select_clause() throws RecognitionException {
		JPA2Parser.select_clause_return retval = new JPA2Parser.select_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal98=null;
		Token char_literal100=null;
		ParserRuleReturnScope select_item99 =null;
		ParserRuleReturnScope select_item101 =null;

		Object string_literal98_tree=null;
		Object char_literal100_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
		RewriteRuleSubtreeStream stream_select_item=new RewriteRuleSubtreeStream(adaptor,"rule select_item");

		try {
			// JPA2.g:172:5: ( ( 'DISTINCT' )? select_item ( ',' select_item )* -> ^( T_SELECTED_ITEMS[] ( 'DISTINCT' )? ( ^( T_SELECTED_ITEM[] select_item ) )* ) )
			// JPA2.g:172:7: ( 'DISTINCT' )? select_item ( ',' select_item )*
			{
			// JPA2.g:172:7: ( 'DISTINCT' )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==DISTINCT) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// JPA2.g:172:8: 'DISTINCT'
					{
					string_literal98=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_clause1175); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISTINCT.add(string_literal98);

					}
					break;

			}

			pushFollow(FOLLOW_select_item_in_select_clause1179);
			select_item99=select_item();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_select_item.add(select_item99.getTree());
			// JPA2.g:172:33: ( ',' select_item )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==58) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// JPA2.g:172:34: ',' select_item
					{
					char_literal100=(Token)match(input,58,FOLLOW_58_in_select_clause1182); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal100);

					pushFollow(FOLLOW_select_item_in_select_clause1184);
					select_item101=select_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_select_item.add(select_item101.getTree());
					}
					break;

				default :
					break loop35;
				}
			}

			// AST REWRITE
			// elements: select_item, DISTINCT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 173:5: -> ^( T_SELECTED_ITEMS[] ( 'DISTINCT' )? ( ^( T_SELECTED_ITEM[] select_item ) )* )
			{
				// JPA2.g:173:8: ^( T_SELECTED_ITEMS[] ( 'DISTINCT' )? ( ^( T_SELECTED_ITEM[] select_item ) )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new SelectedItemsNode(T_SELECTED_ITEMS), root_1);
				// JPA2.g:173:48: ( 'DISTINCT' )?
				if ( stream_DISTINCT.hasNext() ) {
					adaptor.addChild(root_1, stream_DISTINCT.nextNode());
				}
				stream_DISTINCT.reset();

				// JPA2.g:173:62: ( ^( T_SELECTED_ITEM[] select_item ) )*
				while ( stream_select_item.hasNext() ) {
					// JPA2.g:173:62: ^( T_SELECTED_ITEM[] select_item )
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot(new SelectedItemNode(T_SELECTED_ITEM), root_2);
					adaptor.addChild(root_2, stream_select_item.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_select_item.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "select_clause"


	public static class select_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_item"
	// JPA2.g:174:1: select_item : select_expression ( ( 'AS' )? result_variable )? ;
	public final JPA2Parser.select_item_return select_item() throws RecognitionException {
		JPA2Parser.select_item_return retval = new JPA2Parser.select_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal103=null;
		ParserRuleReturnScope select_expression102 =null;
		ParserRuleReturnScope result_variable104 =null;

		Object string_literal103_tree=null;

		try {
			// JPA2.g:175:5: ( select_expression ( ( 'AS' )? result_variable )? )
			// JPA2.g:175:7: select_expression ( ( 'AS' )? result_variable )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_select_expression_in_select_item1227);
			select_expression102=select_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, select_expression102.getTree());

			// JPA2.g:175:25: ( ( 'AS' )? result_variable )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==WORD||LA37_0==78) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// JPA2.g:175:26: ( 'AS' )? result_variable
					{
					// JPA2.g:175:26: ( 'AS' )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==78) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// JPA2.g:175:27: 'AS'
							{
							string_literal103=(Token)match(input,78,FOLLOW_78_in_select_item1231); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal103_tree = (Object)adaptor.create(string_literal103);
							adaptor.addChild(root_0, string_literal103_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_result_variable_in_select_item1235);
					result_variable104=result_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, result_variable104.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "select_item"


	public static class select_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_expression"
	// JPA2.g:176:1: select_expression : ( path_expression | identification_variable -> ^( T_SELECTED_ENTITY[$identification_variable.text] ) | scalar_expression | aggregate_expression | 'OBJECT' '(' identification_variable ')' | constructor_expression );
	public final JPA2Parser.select_expression_return select_expression() throws RecognitionException {
		JPA2Parser.select_expression_return retval = new JPA2Parser.select_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal109=null;
		Token char_literal110=null;
		Token char_literal112=null;
		ParserRuleReturnScope path_expression105 =null;
		ParserRuleReturnScope identification_variable106 =null;
		ParserRuleReturnScope scalar_expression107 =null;
		ParserRuleReturnScope aggregate_expression108 =null;
		ParserRuleReturnScope identification_variable111 =null;
		ParserRuleReturnScope constructor_expression113 =null;

		Object string_literal109_tree=null;
		Object char_literal110_tree=null;
		Object char_literal112_tree=null;
		RewriteRuleSubtreeStream stream_identification_variable=new RewriteRuleSubtreeStream(adaptor,"rule identification_variable");

		try {
			// JPA2.g:177:5: ( path_expression | identification_variable -> ^( T_SELECTED_ENTITY[$identification_variable.text] ) | scalar_expression | aggregate_expression | 'OBJECT' '(' identification_variable ')' | constructor_expression )
			int alt38=6;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA38_1 = input.LA(2);
				if ( (synpred41_JPA2()) ) {
					alt38=1;
				}
				else if ( (synpred42_JPA2()) ) {
					alt38=2;
				}
				else if ( (synpred43_JPA2()) ) {
					alt38=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT_NUMERAL:
			case LOWER:
			case LPAREN:
			case NAMED_PARAMETER:
			case STRING_LITERAL:
			case 55:
			case 57:
			case 59:
			case 62:
			case 69:
			case 75:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 98:
			case 102:
			case 104:
			case 107:
			case 112:
			case 119:
			case 121:
			case 122:
			case 126:
			case 127:
			case 129:
			case 134:
			case 135:
				{
				alt38=3;
				}
				break;
			case COUNT:
				{
				int LA38_16 = input.LA(2);
				if ( (synpred43_JPA2()) ) {
					alt38=3;
				}
				else if ( (synpred44_JPA2()) ) {
					alt38=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA38_17 = input.LA(2);
				if ( (synpred43_JPA2()) ) {
					alt38=3;
				}
				else if ( (synpred44_JPA2()) ) {
					alt38=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 96:
				{
				int LA38_18 = input.LA(2);
				if ( (synpred43_JPA2()) ) {
					alt38=3;
				}
				else if ( (synpred44_JPA2()) ) {
					alt38=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 113:
				{
				alt38=5;
				}
				break;
			case 109:
				{
				alt38=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// JPA2.g:177:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_select_expression1248);
					path_expression105=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression105.getTree());

					}
					break;
				case 2 :
					// JPA2.g:178:7: identification_variable
					{
					pushFollow(FOLLOW_identification_variable_in_select_expression1256);
					identification_variable106=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identification_variable.add(identification_variable106.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 178:31: -> ^( T_SELECTED_ENTITY[$identification_variable.text] )
					{
						// JPA2.g:178:34: ^( T_SELECTED_ENTITY[$identification_variable.text] )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new PathNode(T_SELECTED_ENTITY, (identification_variable106!=null?input.toString(identification_variable106.start,identification_variable106.stop):null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// JPA2.g:179:7: scalar_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_scalar_expression_in_select_expression1274);
					scalar_expression107=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression107.getTree());

					}
					break;
				case 4 :
					// JPA2.g:180:7: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_select_expression1282);
					aggregate_expression108=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression108.getTree());

					}
					break;
				case 5 :
					// JPA2.g:181:7: 'OBJECT' '(' identification_variable ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal109=(Token)match(input,113,FOLLOW_113_in_select_expression1290); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal109_tree = (Object)adaptor.create(string_literal109);
					adaptor.addChild(root_0, string_literal109_tree);
					}

					char_literal110=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_select_expression1292); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal110_tree = (Object)adaptor.create(char_literal110);
					adaptor.addChild(root_0, char_literal110_tree);
					}

					pushFollow(FOLLOW_identification_variable_in_select_expression1293);
					identification_variable111=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable111.getTree());

					char_literal112=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_select_expression1294); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal112_tree = (Object)adaptor.create(char_literal112);
					adaptor.addChild(root_0, char_literal112_tree);
					}

					}
					break;
				case 6 :
					// JPA2.g:182:7: constructor_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constructor_expression_in_select_expression1302);
					constructor_expression113=constructor_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constructor_expression113.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "select_expression"


	public static class constructor_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constructor_expression"
	// JPA2.g:183:1: constructor_expression : 'NEW' constructor_name '(' constructor_item ( ',' constructor_item )* ')' ;
	public final JPA2Parser.constructor_expression_return constructor_expression() throws RecognitionException {
		JPA2Parser.constructor_expression_return retval = new JPA2Parser.constructor_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal114=null;
		Token char_literal116=null;
		Token char_literal118=null;
		Token char_literal120=null;
		ParserRuleReturnScope constructor_name115 =null;
		ParserRuleReturnScope constructor_item117 =null;
		ParserRuleReturnScope constructor_item119 =null;

		Object string_literal114_tree=null;
		Object char_literal116_tree=null;
		Object char_literal118_tree=null;
		Object char_literal120_tree=null;

		try {
			// JPA2.g:184:5: ( 'NEW' constructor_name '(' constructor_item ( ',' constructor_item )* ')' )
			// JPA2.g:184:7: 'NEW' constructor_name '(' constructor_item ( ',' constructor_item )* ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal114=(Token)match(input,109,FOLLOW_109_in_constructor_expression1313); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal114_tree = (Object)adaptor.create(string_literal114);
			adaptor.addChild(root_0, string_literal114_tree);
			}

			pushFollow(FOLLOW_constructor_name_in_constructor_expression1315);
			constructor_name115=constructor_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constructor_name115.getTree());

			char_literal116=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_constructor_expression1317); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal116_tree = (Object)adaptor.create(char_literal116);
			adaptor.addChild(root_0, char_literal116_tree);
			}

			pushFollow(FOLLOW_constructor_item_in_constructor_expression1319);
			constructor_item117=constructor_item();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constructor_item117.getTree());

			// JPA2.g:184:51: ( ',' constructor_item )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==58) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// JPA2.g:184:52: ',' constructor_item
					{
					char_literal118=(Token)match(input,58,FOLLOW_58_in_constructor_expression1322); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal118_tree = (Object)adaptor.create(char_literal118);
					adaptor.addChild(root_0, char_literal118_tree);
					}

					pushFollow(FOLLOW_constructor_item_in_constructor_expression1324);
					constructor_item119=constructor_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constructor_item119.getTree());

					}
					break;

				default :
					break loop39;
				}
			}

			char_literal120=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_constructor_expression1328); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal120_tree = (Object)adaptor.create(char_literal120);
			adaptor.addChild(root_0, char_literal120_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructor_expression"


	public static class constructor_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constructor_item"
	// JPA2.g:185:1: constructor_item : ( path_expression | scalar_expression | aggregate_expression | identification_variable );
	public final JPA2Parser.constructor_item_return constructor_item() throws RecognitionException {
		JPA2Parser.constructor_item_return retval = new JPA2Parser.constructor_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression121 =null;
		ParserRuleReturnScope scalar_expression122 =null;
		ParserRuleReturnScope aggregate_expression123 =null;
		ParserRuleReturnScope identification_variable124 =null;


		try {
			// JPA2.g:186:5: ( path_expression | scalar_expression | aggregate_expression | identification_variable )
			int alt40=4;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA40_1 = input.LA(2);
				if ( (synpred47_JPA2()) ) {
					alt40=1;
				}
				else if ( (synpred48_JPA2()) ) {
					alt40=2;
				}
				else if ( (true) ) {
					alt40=4;
				}

				}
				break;
			case INT_NUMERAL:
			case LOWER:
			case LPAREN:
			case NAMED_PARAMETER:
			case STRING_LITERAL:
			case 55:
			case 57:
			case 59:
			case 62:
			case 69:
			case 75:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 98:
			case 102:
			case 104:
			case 107:
			case 112:
			case 119:
			case 121:
			case 122:
			case 126:
			case 127:
			case 129:
			case 134:
			case 135:
				{
				alt40=2;
				}
				break;
			case COUNT:
				{
				int LA40_16 = input.LA(2);
				if ( (synpred48_JPA2()) ) {
					alt40=2;
				}
				else if ( (synpred49_JPA2()) ) {
					alt40=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA40_17 = input.LA(2);
				if ( (synpred48_JPA2()) ) {
					alt40=2;
				}
				else if ( (synpred49_JPA2()) ) {
					alt40=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 96:
				{
				int LA40_18 = input.LA(2);
				if ( (synpred48_JPA2()) ) {
					alt40=2;
				}
				else if ( (synpred49_JPA2()) ) {
					alt40=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// JPA2.g:186:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_constructor_item1339);
					path_expression121=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression121.getTree());

					}
					break;
				case 2 :
					// JPA2.g:187:7: scalar_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_scalar_expression_in_constructor_item1347);
					scalar_expression122=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression122.getTree());

					}
					break;
				case 3 :
					// JPA2.g:188:7: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_constructor_item1355);
					aggregate_expression123=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression123.getTree());

					}
					break;
				case 4 :
					// JPA2.g:189:7: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_constructor_item1363);
					identification_variable124=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable124.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructor_item"


	public static class aggregate_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "aggregate_expression"
	// JPA2.g:190:1: aggregate_expression : ( aggregate_expression_function_name '(' ( DISTINCT )? path_expression ')' -> ^( T_AGGREGATE_EXPR[] aggregate_expression_function_name '(' ( 'DISTINCT' )? path_expression ')' ) | 'COUNT' '(' ( DISTINCT )? count_argument ')' -> ^( T_AGGREGATE_EXPR[] 'COUNT' '(' ( 'DISTINCT' )? count_argument ')' ) | function_invocation );
	public final JPA2Parser.aggregate_expression_return aggregate_expression() throws RecognitionException {
		JPA2Parser.aggregate_expression_return retval = new JPA2Parser.aggregate_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal126=null;
		Token DISTINCT127=null;
		Token char_literal129=null;
		Token string_literal130=null;
		Token char_literal131=null;
		Token DISTINCT132=null;
		Token char_literal134=null;
		ParserRuleReturnScope aggregate_expression_function_name125 =null;
		ParserRuleReturnScope path_expression128 =null;
		ParserRuleReturnScope count_argument133 =null;
		ParserRuleReturnScope function_invocation135 =null;

		Object char_literal126_tree=null;
		Object DISTINCT127_tree=null;
		Object char_literal129_tree=null;
		Object string_literal130_tree=null;
		Object char_literal131_tree=null;
		Object DISTINCT132_tree=null;
		Object char_literal134_tree=null;
		RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_count_argument=new RewriteRuleSubtreeStream(adaptor,"rule count_argument");
		RewriteRuleSubtreeStream stream_path_expression=new RewriteRuleSubtreeStream(adaptor,"rule path_expression");
		RewriteRuleSubtreeStream stream_aggregate_expression_function_name=new RewriteRuleSubtreeStream(adaptor,"rule aggregate_expression_function_name");

		try {
			// JPA2.g:191:5: ( aggregate_expression_function_name '(' ( DISTINCT )? path_expression ')' -> ^( T_AGGREGATE_EXPR[] aggregate_expression_function_name '(' ( 'DISTINCT' )? path_expression ')' ) | 'COUNT' '(' ( DISTINCT )? count_argument ')' -> ^( T_AGGREGATE_EXPR[] 'COUNT' '(' ( 'DISTINCT' )? count_argument ')' ) | function_invocation )
			int alt43=3;
			alt43 = dfa43.predict(input);
			switch (alt43) {
				case 1 :
					// JPA2.g:191:7: aggregate_expression_function_name '(' ( DISTINCT )? path_expression ')'
					{
					pushFollow(FOLLOW_aggregate_expression_function_name_in_aggregate_expression1374);
					aggregate_expression_function_name125=aggregate_expression_function_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aggregate_expression_function_name.add(aggregate_expression_function_name125.getTree());
					char_literal126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_aggregate_expression1376); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(char_literal126);

					// JPA2.g:191:45: ( DISTINCT )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==DISTINCT) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// JPA2.g:191:46: DISTINCT
							{
							DISTINCT127=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate_expression1378); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT127);

							}
							break;

					}

					pushFollow(FOLLOW_path_expression_in_aggregate_expression1382);
					path_expression128=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_path_expression.add(path_expression128.getTree());
					char_literal129=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_aggregate_expression1383); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(char_literal129);

					// AST REWRITE
					// elements: RPAREN, aggregate_expression_function_name, LPAREN, path_expression, DISTINCT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 192:5: -> ^( T_AGGREGATE_EXPR[] aggregate_expression_function_name '(' ( 'DISTINCT' )? path_expression ')' )
					{
						// JPA2.g:192:8: ^( T_AGGREGATE_EXPR[] aggregate_expression_function_name '(' ( 'DISTINCT' )? path_expression ')' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new AggregateExpressionNode(T_AGGREGATE_EXPR), root_1);
						adaptor.addChild(root_1, stream_aggregate_expression_function_name.nextTree());
						adaptor.addChild(root_1, stream_LPAREN.nextNode());
						// JPA2.g:192:93: ( 'DISTINCT' )?
						if ( stream_DISTINCT.hasNext() ) {
							adaptor.addChild(root_1, (Object)adaptor.create(DISTINCT, "DISTINCT"));
						}
						stream_DISTINCT.reset();

						adaptor.addChild(root_1, stream_path_expression.nextTree());
						adaptor.addChild(root_1, stream_RPAREN.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// JPA2.g:193:7: 'COUNT' '(' ( DISTINCT )? count_argument ')'
					{
					string_literal130=(Token)match(input,COUNT,FOLLOW_COUNT_in_aggregate_expression1417); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COUNT.add(string_literal130);

					char_literal131=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_aggregate_expression1419); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(char_literal131);

					// JPA2.g:193:18: ( DISTINCT )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==DISTINCT) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// JPA2.g:193:19: DISTINCT
							{
							DISTINCT132=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate_expression1421); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DISTINCT.add(DISTINCT132);

							}
							break;

					}

					pushFollow(FOLLOW_count_argument_in_aggregate_expression1425);
					count_argument133=count_argument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_count_argument.add(count_argument133.getTree());
					char_literal134=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_aggregate_expression1427); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(char_literal134);

					// AST REWRITE
					// elements: count_argument, DISTINCT, COUNT, RPAREN, LPAREN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 194:5: -> ^( T_AGGREGATE_EXPR[] 'COUNT' '(' ( 'DISTINCT' )? count_argument ')' )
					{
						// JPA2.g:194:8: ^( T_AGGREGATE_EXPR[] 'COUNT' '(' ( 'DISTINCT' )? count_argument ')' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new AggregateExpressionNode(T_AGGREGATE_EXPR), root_1);
						adaptor.addChild(root_1, stream_COUNT.nextNode());
						adaptor.addChild(root_1, stream_LPAREN.nextNode());
						// JPA2.g:194:66: ( 'DISTINCT' )?
						if ( stream_DISTINCT.hasNext() ) {
							adaptor.addChild(root_1, (Object)adaptor.create(DISTINCT, "DISTINCT"));
						}
						stream_DISTINCT.reset();

						adaptor.addChild(root_1, stream_count_argument.nextTree());
						adaptor.addChild(root_1, stream_RPAREN.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// JPA2.g:195:7: function_invocation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_invocation_in_aggregate_expression1462);
					function_invocation135=function_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_invocation135.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aggregate_expression"


	public static class aggregate_expression_function_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "aggregate_expression_function_name"
	// JPA2.g:196:1: aggregate_expression_function_name : ( 'AVG' | 'MAX' | 'MIN' | 'SUM' | 'COUNT' );
	public final JPA2Parser.aggregate_expression_function_name_return aggregate_expression_function_name() throws RecognitionException {
		JPA2Parser.aggregate_expression_function_name_return retval = new JPA2Parser.aggregate_expression_function_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set136=null;

		Object set136_tree=null;

		try {
			// JPA2.g:197:5: ( 'AVG' | 'MAX' | 'MIN' | 'SUM' | 'COUNT' )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set136=input.LT(1);
			if ( input.LA(1)==AVG||input.LA(1)==COUNT||(input.LA(1) >= MAX && input.LA(1) <= MIN)||input.LA(1)==SUM ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set136));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aggregate_expression_function_name"


	public static class count_argument_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "count_argument"
	// JPA2.g:198:1: count_argument : ( identification_variable | path_expression );
	public final JPA2Parser.count_argument_return count_argument() throws RecognitionException {
		JPA2Parser.count_argument_return retval = new JPA2Parser.count_argument_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identification_variable137 =null;
		ParserRuleReturnScope path_expression138 =null;


		try {
			// JPA2.g:199:5: ( identification_variable | path_expression )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==WORD) ) {
				int LA44_1 = input.LA(2);
				if ( (LA44_1==RPAREN) ) {
					alt44=1;
				}
				else if ( (LA44_1==60) ) {
					alt44=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// JPA2.g:199:7: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_count_argument1499);
					identification_variable137=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable137.getTree());

					}
					break;
				case 2 :
					// JPA2.g:199:33: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_count_argument1503);
					path_expression138=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression138.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "count_argument"


	public static class where_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "where_clause"
	// JPA2.g:200:1: where_clause : wh= 'WHERE' conditional_expression -> ^( T_CONDITION[$wh] conditional_expression ) ;
	public final JPA2Parser.where_clause_return where_clause() throws RecognitionException {
		JPA2Parser.where_clause_return retval = new JPA2Parser.where_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token wh=null;
		ParserRuleReturnScope conditional_expression139 =null;

		Object wh_tree=null;
		RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
		RewriteRuleSubtreeStream stream_conditional_expression=new RewriteRuleSubtreeStream(adaptor,"rule conditional_expression");

		try {
			// JPA2.g:201:5: (wh= 'WHERE' conditional_expression -> ^( T_CONDITION[$wh] conditional_expression ) )
			// JPA2.g:201:7: wh= 'WHERE' conditional_expression
			{
			wh=(Token)match(input,132,FOLLOW_132_in_where_clause1516); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_132.add(wh);

			pushFollow(FOLLOW_conditional_expression_in_where_clause1518);
			conditional_expression139=conditional_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_conditional_expression.add(conditional_expression139.getTree());
			// AST REWRITE
			// elements: conditional_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 201:40: -> ^( T_CONDITION[$wh] conditional_expression )
			{
				// JPA2.g:201:43: ^( T_CONDITION[$wh] conditional_expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new WhereNode(T_CONDITION, wh), root_1);
				adaptor.addChild(root_1, stream_conditional_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "where_clause"


	public static class groupby_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "groupby_clause"
	// JPA2.g:202:1: groupby_clause : 'GROUP' 'BY' groupby_item ( ',' groupby_item )* -> ^( T_GROUP_BY[] 'GROUP' 'BY' ( groupby_item )* ) ;
	public final JPA2Parser.groupby_clause_return groupby_clause() throws RecognitionException {
		JPA2Parser.groupby_clause_return retval = new JPA2Parser.groupby_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal140=null;
		Token string_literal141=null;
		Token char_literal143=null;
		ParserRuleReturnScope groupby_item142 =null;
		ParserRuleReturnScope groupby_item144 =null;

		Object string_literal140_tree=null;
		Object string_literal141_tree=null;
		Object char_literal143_tree=null;
		RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleSubtreeStream stream_groupby_item=new RewriteRuleSubtreeStream(adaptor,"rule groupby_item");

		try {
			// JPA2.g:203:5: ( 'GROUP' 'BY' groupby_item ( ',' groupby_item )* -> ^( T_GROUP_BY[] 'GROUP' 'BY' ( groupby_item )* ) )
			// JPA2.g:203:7: 'GROUP' 'BY' groupby_item ( ',' groupby_item )*
			{
			string_literal140=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupby_clause1540); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_GROUP.add(string_literal140);

			string_literal141=(Token)match(input,BY,FOLLOW_BY_in_groupby_clause1542); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(string_literal141);

			pushFollow(FOLLOW_groupby_item_in_groupby_clause1544);
			groupby_item142=groupby_item();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_groupby_item.add(groupby_item142.getTree());
			// JPA2.g:203:33: ( ',' groupby_item )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==58) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// JPA2.g:203:34: ',' groupby_item
					{
					char_literal143=(Token)match(input,58,FOLLOW_58_in_groupby_clause1547); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal143);

					pushFollow(FOLLOW_groupby_item_in_groupby_clause1549);
					groupby_item144=groupby_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupby_item.add(groupby_item144.getTree());
					}
					break;

				default :
					break loop45;
				}
			}

			// AST REWRITE
			// elements: BY, groupby_item, GROUP
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 204:5: -> ^( T_GROUP_BY[] 'GROUP' 'BY' ( groupby_item )* )
			{
				// JPA2.g:204:8: ^( T_GROUP_BY[] 'GROUP' 'BY' ( groupby_item )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new GroupByNode(T_GROUP_BY), root_1);
				adaptor.addChild(root_1, stream_GROUP.nextNode());
				adaptor.addChild(root_1, stream_BY.nextNode());
				// JPA2.g:204:49: ( groupby_item )*
				while ( stream_groupby_item.hasNext() ) {
					adaptor.addChild(root_1, stream_groupby_item.nextTree());
				}
				stream_groupby_item.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "groupby_clause"


	public static class groupby_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "groupby_item"
	// JPA2.g:205:1: groupby_item : ( path_expression | identification_variable );
	public final JPA2Parser.groupby_item_return groupby_item() throws RecognitionException {
		JPA2Parser.groupby_item_return retval = new JPA2Parser.groupby_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression145 =null;
		ParserRuleReturnScope identification_variable146 =null;


		try {
			// JPA2.g:206:5: ( path_expression | identification_variable )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==WORD) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==60) ) {
					alt46=1;
				}
				else if ( (LA46_1==EOF||LA46_1==HAVING||LA46_1==ORDER||LA46_1==RPAREN||LA46_1==58) ) {
					alt46=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// JPA2.g:206:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_groupby_item1583);
					path_expression145=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression145.getTree());

					}
					break;
				case 2 :
					// JPA2.g:206:25: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_groupby_item1587);
					identification_variable146=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable146.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "groupby_item"


	public static class having_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "having_clause"
	// JPA2.g:207:1: having_clause : 'HAVING' conditional_expression ;
	public final JPA2Parser.having_clause_return having_clause() throws RecognitionException {
		JPA2Parser.having_clause_return retval = new JPA2Parser.having_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal147=null;
		ParserRuleReturnScope conditional_expression148 =null;

		Object string_literal147_tree=null;

		try {
			// JPA2.g:208:5: ( 'HAVING' conditional_expression )
			// JPA2.g:208:7: 'HAVING' conditional_expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal147=(Token)match(input,HAVING,FOLLOW_HAVING_in_having_clause1598); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal147_tree = (Object)adaptor.create(string_literal147);
			adaptor.addChild(root_0, string_literal147_tree);
			}

			pushFollow(FOLLOW_conditional_expression_in_having_clause1600);
			conditional_expression148=conditional_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression148.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "having_clause"


	public static class orderby_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orderby_clause"
	// JPA2.g:209:1: orderby_clause : 'ORDER' 'BY' orderby_item ( ',' orderby_item )* -> ^( T_ORDER_BY[] 'ORDER' 'BY' ( orderby_item )* ) ;
	public final JPA2Parser.orderby_clause_return orderby_clause() throws RecognitionException {
		JPA2Parser.orderby_clause_return retval = new JPA2Parser.orderby_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal149=null;
		Token string_literal150=null;
		Token char_literal152=null;
		ParserRuleReturnScope orderby_item151 =null;
		ParserRuleReturnScope orderby_item153 =null;

		Object string_literal149_tree=null;
		Object string_literal150_tree=null;
		Object char_literal152_tree=null;
		RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleSubtreeStream stream_orderby_item=new RewriteRuleSubtreeStream(adaptor,"rule orderby_item");

		try {
			// JPA2.g:210:5: ( 'ORDER' 'BY' orderby_item ( ',' orderby_item )* -> ^( T_ORDER_BY[] 'ORDER' 'BY' ( orderby_item )* ) )
			// JPA2.g:210:7: 'ORDER' 'BY' orderby_item ( ',' orderby_item )*
			{
			string_literal149=(Token)match(input,ORDER,FOLLOW_ORDER_in_orderby_clause1611); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ORDER.add(string_literal149);

			string_literal150=(Token)match(input,BY,FOLLOW_BY_in_orderby_clause1613); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BY.add(string_literal150);

			pushFollow(FOLLOW_orderby_item_in_orderby_clause1615);
			orderby_item151=orderby_item();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_orderby_item.add(orderby_item151.getTree());
			// JPA2.g:210:33: ( ',' orderby_item )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==58) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// JPA2.g:210:34: ',' orderby_item
					{
					char_literal152=(Token)match(input,58,FOLLOW_58_in_orderby_clause1618); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal152);

					pushFollow(FOLLOW_orderby_item_in_orderby_clause1620);
					orderby_item153=orderby_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderby_item.add(orderby_item153.getTree());
					}
					break;

				default :
					break loop47;
				}
			}

			// AST REWRITE
			// elements: BY, orderby_item, ORDER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 211:5: -> ^( T_ORDER_BY[] 'ORDER' 'BY' ( orderby_item )* )
			{
				// JPA2.g:211:8: ^( T_ORDER_BY[] 'ORDER' 'BY' ( orderby_item )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new OrderByNode(T_ORDER_BY), root_1);
				adaptor.addChild(root_1, stream_ORDER.nextNode());
				adaptor.addChild(root_1, stream_BY.nextNode());
				// JPA2.g:211:49: ( orderby_item )*
				while ( stream_orderby_item.hasNext() ) {
					adaptor.addChild(root_1, stream_orderby_item.nextTree());
				}
				stream_orderby_item.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orderby_clause"


	public static class orderby_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orderby_item"
	// JPA2.g:212:1: orderby_item : ( orderby_variable ( 'ASC' )? -> ^( T_ORDER_BY_FIELD[] orderby_variable ( 'ASC' )? ) | orderby_variable 'DESC' -> ^( T_ORDER_BY_FIELD[] orderby_variable 'DESC' ) );
	public final JPA2Parser.orderby_item_return orderby_item() throws RecognitionException {
		JPA2Parser.orderby_item_return retval = new JPA2Parser.orderby_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal155=null;
		Token string_literal157=null;
		ParserRuleReturnScope orderby_variable154 =null;
		ParserRuleReturnScope orderby_variable156 =null;

		Object string_literal155_tree=null;
		Object string_literal157_tree=null;
		RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
		RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
		RewriteRuleSubtreeStream stream_orderby_variable=new RewriteRuleSubtreeStream(adaptor,"rule orderby_variable");

		try {
			// JPA2.g:213:5: ( orderby_variable ( 'ASC' )? -> ^( T_ORDER_BY_FIELD[] orderby_variable ( 'ASC' )? ) | orderby_variable 'DESC' -> ^( T_ORDER_BY_FIELD[] orderby_variable 'DESC' ) )
			int alt49=2;
			alt49 = dfa49.predict(input);
			switch (alt49) {
				case 1 :
					// JPA2.g:213:7: orderby_variable ( 'ASC' )?
					{
					pushFollow(FOLLOW_orderby_variable_in_orderby_item1654);
					orderby_variable154=orderby_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderby_variable.add(orderby_variable154.getTree());
					// JPA2.g:213:24: ( 'ASC' )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==ASC) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// JPA2.g:213:25: 'ASC'
							{
							string_literal155=(Token)match(input,ASC,FOLLOW_ASC_in_orderby_item1657); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ASC.add(string_literal155);

							}
							break;

					}

					// AST REWRITE
					// elements: orderby_variable, ASC
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 214:6: -> ^( T_ORDER_BY_FIELD[] orderby_variable ( 'ASC' )? )
					{
						// JPA2.g:214:9: ^( T_ORDER_BY_FIELD[] orderby_variable ( 'ASC' )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new OrderByFieldNode(T_ORDER_BY_FIELD), root_1);
						adaptor.addChild(root_1, stream_orderby_variable.nextTree());
						// JPA2.g:214:65: ( 'ASC' )?
						if ( stream_ASC.hasNext() ) {
							adaptor.addChild(root_1, stream_ASC.nextNode());
						}
						stream_ASC.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// JPA2.g:215:7: orderby_variable 'DESC'
					{
					pushFollow(FOLLOW_orderby_variable_in_orderby_item1689);
					orderby_variable156=orderby_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderby_variable.add(orderby_variable156.getTree());
					string_literal157=(Token)match(input,DESC,FOLLOW_DESC_in_orderby_item1692); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DESC.add(string_literal157);

					// AST REWRITE
					// elements: orderby_variable, DESC
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 216:5: -> ^( T_ORDER_BY_FIELD[] orderby_variable 'DESC' )
					{
						// JPA2.g:216:8: ^( T_ORDER_BY_FIELD[] orderby_variable 'DESC' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new OrderByFieldNode(T_ORDER_BY_FIELD), root_1);
						adaptor.addChild(root_1, stream_orderby_variable.nextTree());
						adaptor.addChild(root_1, stream_DESC.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orderby_item"


	public static class orderby_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orderby_variable"
	// JPA2.g:217:1: orderby_variable : ( path_expression | general_identification_variable | result_variable );
	public final JPA2Parser.orderby_variable_return orderby_variable() throws RecognitionException {
		JPA2Parser.orderby_variable_return retval = new JPA2Parser.orderby_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression158 =null;
		ParserRuleReturnScope general_identification_variable159 =null;
		ParserRuleReturnScope result_variable160 =null;


		try {
			// JPA2.g:218:5: ( path_expression | general_identification_variable | result_variable )
			int alt50=3;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==WORD) ) {
				int LA50_1 = input.LA(2);
				if ( (LA50_1==60) ) {
					alt50=1;
				}
				else if ( (synpred65_JPA2()) ) {
					alt50=2;
				}
				else if ( (true) ) {
					alt50=3;
				}

			}
			else if ( (LA50_0==100||LA50_0==130) ) {
				alt50=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// JPA2.g:218:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_orderby_variable1721);
					path_expression158=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression158.getTree());

					}
					break;
				case 2 :
					// JPA2.g:218:25: general_identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_general_identification_variable_in_orderby_variable1725);
					general_identification_variable159=general_identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, general_identification_variable159.getTree());

					}
					break;
				case 3 :
					// JPA2.g:218:59: result_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_result_variable_in_orderby_variable1729);
					result_variable160=result_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, result_variable160.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orderby_variable"


	public static class subquery_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subquery"
	// JPA2.g:220:1: subquery : lp= '(' 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? rp= ')' -> ^( T_QUERY[$lp,$rp] 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ) ;
	public final JPA2Parser.subquery_return subquery() throws RecognitionException {
		JPA2Parser.subquery_return retval = new JPA2Parser.subquery_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token lp=null;
		Token rp=null;
		Token string_literal161=null;
		ParserRuleReturnScope simple_select_clause162 =null;
		ParserRuleReturnScope subquery_from_clause163 =null;
		ParserRuleReturnScope where_clause164 =null;
		ParserRuleReturnScope groupby_clause165 =null;
		ParserRuleReturnScope having_clause166 =null;

		Object lp_tree=null;
		Object rp_tree=null;
		Object string_literal161_tree=null;
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
		RewriteRuleSubtreeStream stream_subquery_from_clause=new RewriteRuleSubtreeStream(adaptor,"rule subquery_from_clause");
		RewriteRuleSubtreeStream stream_simple_select_clause=new RewriteRuleSubtreeStream(adaptor,"rule simple_select_clause");
		RewriteRuleSubtreeStream stream_groupby_clause=new RewriteRuleSubtreeStream(adaptor,"rule groupby_clause");
		RewriteRuleSubtreeStream stream_having_clause=new RewriteRuleSubtreeStream(adaptor,"rule having_clause");

		try {
			// JPA2.g:221:5: (lp= '(' 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? rp= ')' -> ^( T_QUERY[$lp,$rp] 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? ) )
			// JPA2.g:221:7: lp= '(' 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? rp= ')'
			{
			lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subquery1743); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(lp);

			string_literal161=(Token)match(input,117,FOLLOW_117_in_subquery1745); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_117.add(string_literal161);

			pushFollow(FOLLOW_simple_select_clause_in_subquery1747);
			simple_select_clause162=simple_select_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_simple_select_clause.add(simple_select_clause162.getTree());
			pushFollow(FOLLOW_subquery_from_clause_in_subquery1749);
			subquery_from_clause163=subquery_from_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_subquery_from_clause.add(subquery_from_clause163.getTree());
			// JPA2.g:221:65: ( where_clause )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==132) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// JPA2.g:221:66: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_subquery1752);
					where_clause164=where_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_where_clause.add(where_clause164.getTree());
					}
					break;

			}

			// JPA2.g:221:81: ( groupby_clause )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==GROUP) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// JPA2.g:221:82: groupby_clause
					{
					pushFollow(FOLLOW_groupby_clause_in_subquery1757);
					groupby_clause165=groupby_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_groupby_clause.add(groupby_clause165.getTree());
					}
					break;

			}

			// JPA2.g:221:99: ( having_clause )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==HAVING) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// JPA2.g:221:100: having_clause
					{
					pushFollow(FOLLOW_having_clause_in_subquery1762);
					having_clause166=having_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_having_clause.add(having_clause166.getTree());
					}
					break;

			}

			rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subquery1768); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(rp);

			// AST REWRITE
			// elements: having_clause, simple_select_clause, 117, where_clause, groupby_clause, subquery_from_clause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 222:6: -> ^( T_QUERY[$lp,$rp] 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? )
			{
				// JPA2.g:222:9: ^( T_QUERY[$lp,$rp] 'SELECT' simple_select_clause subquery_from_clause ( where_clause )? ( groupby_clause )? ( having_clause )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new QueryNode(T_QUERY, lp, rp), root_1);
				adaptor.addChild(root_1, stream_117.nextNode());
				adaptor.addChild(root_1, stream_simple_select_clause.nextTree());
				adaptor.addChild(root_1, stream_subquery_from_clause.nextTree());
				// JPA2.g:222:90: ( where_clause )?
				if ( stream_where_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_where_clause.nextTree());
				}
				stream_where_clause.reset();

				// JPA2.g:222:106: ( groupby_clause )?
				if ( stream_groupby_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_groupby_clause.nextTree());
				}
				stream_groupby_clause.reset();

				// JPA2.g:222:124: ( having_clause )?
				if ( stream_having_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_having_clause.nextTree());
				}
				stream_having_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subquery"


	public static class subquery_from_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subquery_from_clause"
	// JPA2.g:223:1: subquery_from_clause : fr= 'FROM' subselect_identification_variable_declaration ( ',' subselect_identification_variable_declaration )* -> ^( T_SOURCES[$fr] ( ^( T_SOURCE subselect_identification_variable_declaration ) )* ) ;
	public final JPA2Parser.subquery_from_clause_return subquery_from_clause() throws RecognitionException {
		JPA2Parser.subquery_from_clause_return retval = new JPA2Parser.subquery_from_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token fr=null;
		Token char_literal168=null;
		ParserRuleReturnScope subselect_identification_variable_declaration167 =null;
		ParserRuleReturnScope subselect_identification_variable_declaration169 =null;

		Object fr_tree=null;
		Object char_literal168_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
		RewriteRuleSubtreeStream stream_subselect_identification_variable_declaration=new RewriteRuleSubtreeStream(adaptor,"rule subselect_identification_variable_declaration");

		try {
			// JPA2.g:224:5: (fr= 'FROM' subselect_identification_variable_declaration ( ',' subselect_identification_variable_declaration )* -> ^( T_SOURCES[$fr] ( ^( T_SOURCE subselect_identification_variable_declaration ) )* ) )
			// JPA2.g:224:7: fr= 'FROM' subselect_identification_variable_declaration ( ',' subselect_identification_variable_declaration )*
			{
			fr=(Token)match(input,95,FOLLOW_95_in_subquery_from_clause1818); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_95.add(fr);

			pushFollow(FOLLOW_subselect_identification_variable_declaration_in_subquery_from_clause1820);
			subselect_identification_variable_declaration167=subselect_identification_variable_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_subselect_identification_variable_declaration.add(subselect_identification_variable_declaration167.getTree());
			// JPA2.g:224:63: ( ',' subselect_identification_variable_declaration )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==58) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// JPA2.g:224:64: ',' subselect_identification_variable_declaration
					{
					char_literal168=(Token)match(input,58,FOLLOW_58_in_subquery_from_clause1823); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal168);

					pushFollow(FOLLOW_subselect_identification_variable_declaration_in_subquery_from_clause1825);
					subselect_identification_variable_declaration169=subselect_identification_variable_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_subselect_identification_variable_declaration.add(subselect_identification_variable_declaration169.getTree());
					}
					break;

				default :
					break loop54;
				}
			}

			// AST REWRITE
			// elements: subselect_identification_variable_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 225:5: -> ^( T_SOURCES[$fr] ( ^( T_SOURCE subselect_identification_variable_declaration ) )* )
			{
				// JPA2.g:225:8: ^( T_SOURCES[$fr] ( ^( T_SOURCE subselect_identification_variable_declaration ) )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new FromNode(T_SOURCES, fr), root_1);
				// JPA2.g:225:35: ( ^( T_SOURCE subselect_identification_variable_declaration ) )*
				while ( stream_subselect_identification_variable_declaration.hasNext() ) {
					// JPA2.g:225:35: ^( T_SOURCE subselect_identification_variable_declaration )
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot(new SelectionSourceNode(T_SOURCE), root_2);
					adaptor.addChild(root_2, stream_subselect_identification_variable_declaration.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_subselect_identification_variable_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subquery_from_clause"


	public static class subselect_identification_variable_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subselect_identification_variable_declaration"
	// JPA2.g:227:1: subselect_identification_variable_declaration : ( identification_variable_declaration | derived_path_expression 'AS' identification_variable ( join )* | derived_collection_member_declaration );
	public final JPA2Parser.subselect_identification_variable_declaration_return subselect_identification_variable_declaration() throws RecognitionException {
		JPA2Parser.subselect_identification_variable_declaration_return retval = new JPA2Parser.subselect_identification_variable_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal172=null;
		ParserRuleReturnScope identification_variable_declaration170 =null;
		ParserRuleReturnScope derived_path_expression171 =null;
		ParserRuleReturnScope identification_variable173 =null;
		ParserRuleReturnScope join174 =null;
		ParserRuleReturnScope derived_collection_member_declaration175 =null;

		Object string_literal172_tree=null;

		try {
			// JPA2.g:228:5: ( identification_variable_declaration | derived_path_expression 'AS' identification_variable ( join )* | derived_collection_member_declaration )
			int alt56=3;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA56_1 = input.LA(2);
				if ( (LA56_1==WORD||LA56_1==78) ) {
					alt56=1;
				}
				else if ( (LA56_1==60) ) {
					alt56=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 125:
				{
				alt56=2;
				}
				break;
			case IN:
				{
				alt56=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// JPA2.g:228:7: identification_variable_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_declaration_in_subselect_identification_variable_declaration1863);
					identification_variable_declaration170=identification_variable_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable_declaration170.getTree());

					}
					break;
				case 2 :
					// JPA2.g:229:7: derived_path_expression 'AS' identification_variable ( join )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_derived_path_expression_in_subselect_identification_variable_declaration1871);
					derived_path_expression171=derived_path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, derived_path_expression171.getTree());

					string_literal172=(Token)match(input,78,FOLLOW_78_in_subselect_identification_variable_declaration1873); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal172_tree = (Object)adaptor.create(string_literal172);
					adaptor.addChild(root_0, string_literal172_tree);
					}

					pushFollow(FOLLOW_identification_variable_in_subselect_identification_variable_declaration1875);
					identification_variable173=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable173.getTree());

					// JPA2.g:229:60: ( join )*
					loop55:
					while (true) {
						int alt55=2;
						int LA55_0 = input.LA(1);
						if ( (LA55_0==INNER||(LA55_0 >= JOIN && LA55_0 <= LEFT)) ) {
							alt55=1;
						}

						switch (alt55) {
						case 1 :
							// JPA2.g:229:61: join
							{
							pushFollow(FOLLOW_join_in_subselect_identification_variable_declaration1878);
							join174=join();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, join174.getTree());

							}
							break;

						default :
							break loop55;
						}
					}

					}
					break;
				case 3 :
					// JPA2.g:230:7: derived_collection_member_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_derived_collection_member_declaration_in_subselect_identification_variable_declaration1888);
					derived_collection_member_declaration175=derived_collection_member_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, derived_collection_member_declaration175.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subselect_identification_variable_declaration"


	public static class derived_path_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "derived_path_expression"
	// JPA2.g:231:1: derived_path_expression : ( general_derived_path '.' single_valued_object_field | general_derived_path '.' collection_valued_field );
	public final JPA2Parser.derived_path_expression_return derived_path_expression() throws RecognitionException {
		JPA2Parser.derived_path_expression_return retval = new JPA2Parser.derived_path_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal177=null;
		Token char_literal180=null;
		ParserRuleReturnScope general_derived_path176 =null;
		ParserRuleReturnScope single_valued_object_field178 =null;
		ParserRuleReturnScope general_derived_path179 =null;
		ParserRuleReturnScope collection_valued_field181 =null;

		Object char_literal177_tree=null;
		Object char_literal180_tree=null;

		try {
			// JPA2.g:232:5: ( general_derived_path '.' single_valued_object_field | general_derived_path '.' collection_valued_field )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==WORD) ) {
				int LA57_1 = input.LA(2);
				if ( (synpred73_JPA2()) ) {
					alt57=1;
				}
				else if ( (true) ) {
					alt57=2;
				}

			}
			else if ( (LA57_0==125) ) {
				int LA57_2 = input.LA(2);
				if ( (synpred73_JPA2()) ) {
					alt57=1;
				}
				else if ( (true) ) {
					alt57=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// JPA2.g:232:7: general_derived_path '.' single_valued_object_field
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_general_derived_path_in_derived_path_expression1899);
					general_derived_path176=general_derived_path();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, general_derived_path176.getTree());

					char_literal177=(Token)match(input,60,FOLLOW_60_in_derived_path_expression1900); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal177_tree = (Object)adaptor.create(char_literal177);
					adaptor.addChild(root_0, char_literal177_tree);
					}

					pushFollow(FOLLOW_single_valued_object_field_in_derived_path_expression1901);
					single_valued_object_field178=single_valued_object_field();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_valued_object_field178.getTree());

					}
					break;
				case 2 :
					// JPA2.g:233:7: general_derived_path '.' collection_valued_field
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_general_derived_path_in_derived_path_expression1909);
					general_derived_path179=general_derived_path();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, general_derived_path179.getTree());

					char_literal180=(Token)match(input,60,FOLLOW_60_in_derived_path_expression1910); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal180_tree = (Object)adaptor.create(char_literal180);
					adaptor.addChild(root_0, char_literal180_tree);
					}

					pushFollow(FOLLOW_collection_valued_field_in_derived_path_expression1911);
					collection_valued_field181=collection_valued_field();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, collection_valued_field181.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "derived_path_expression"


	public static class general_derived_path_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "general_derived_path"
	// JPA2.g:234:1: general_derived_path : ( simple_derived_path | treated_derived_path ( '.' single_valued_object_field )* );
	public final JPA2Parser.general_derived_path_return general_derived_path() throws RecognitionException {
		JPA2Parser.general_derived_path_return retval = new JPA2Parser.general_derived_path_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal184=null;
		ParserRuleReturnScope simple_derived_path182 =null;
		ParserRuleReturnScope treated_derived_path183 =null;
		ParserRuleReturnScope single_valued_object_field185 =null;

		Object char_literal184_tree=null;

		try {
			// JPA2.g:235:5: ( simple_derived_path | treated_derived_path ( '.' single_valued_object_field )* )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==WORD) ) {
				alt59=1;
			}
			else if ( (LA59_0==125) ) {
				alt59=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// JPA2.g:235:7: simple_derived_path
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_derived_path_in_general_derived_path1922);
					simple_derived_path182=simple_derived_path();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_derived_path182.getTree());

					}
					break;
				case 2 :
					// JPA2.g:236:7: treated_derived_path ( '.' single_valued_object_field )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_treated_derived_path_in_general_derived_path1930);
					treated_derived_path183=treated_derived_path();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, treated_derived_path183.getTree());

					// JPA2.g:236:27: ( '.' single_valued_object_field )*
					loop58:
					while (true) {
						int alt58=2;
						int LA58_0 = input.LA(1);
						if ( (LA58_0==60) ) {
							int LA58_1 = input.LA(2);
							if ( (LA58_1==WORD) ) {
								int LA58_3 = input.LA(3);
								if ( (LA58_3==78) ) {
									int LA58_4 = input.LA(4);
									if ( (LA58_4==WORD) ) {
										int LA58_6 = input.LA(5);
										if ( (LA58_6==RPAREN) ) {
											int LA58_7 = input.LA(6);
											if ( (LA58_7==78) ) {
												int LA58_8 = input.LA(7);
												if ( (LA58_8==WORD) ) {
													int LA58_9 = input.LA(8);
													if ( (LA58_9==RPAREN) ) {
														alt58=1;
													}

												}

											}
											else if ( (LA58_7==60) ) {
												alt58=1;
											}

										}

									}

								}
								else if ( (LA58_3==60) ) {
									alt58=1;
								}

							}

						}

						switch (alt58) {
						case 1 :
							// JPA2.g:236:28: '.' single_valued_object_field
							{
							char_literal184=(Token)match(input,60,FOLLOW_60_in_general_derived_path1932); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal184_tree = (Object)adaptor.create(char_literal184);
							adaptor.addChild(root_0, char_literal184_tree);
							}

							pushFollow(FOLLOW_single_valued_object_field_in_general_derived_path1933);
							single_valued_object_field185=single_valued_object_field();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, single_valued_object_field185.getTree());

							}
							break;

						default :
							break loop58;
						}
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "general_derived_path"


	public static class simple_derived_path_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_derived_path"
	// JPA2.g:238:1: simple_derived_path : superquery_identification_variable ;
	public final JPA2Parser.simple_derived_path_return simple_derived_path() throws RecognitionException {
		JPA2Parser.simple_derived_path_return retval = new JPA2Parser.simple_derived_path_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope superquery_identification_variable186 =null;


		try {
			// JPA2.g:239:5: ( superquery_identification_variable )
			// JPA2.g:239:7: superquery_identification_variable
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_superquery_identification_variable_in_simple_derived_path1951);
			superquery_identification_variable186=superquery_identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, superquery_identification_variable186.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_derived_path"


	public static class treated_derived_path_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "treated_derived_path"
	// JPA2.g:241:1: treated_derived_path : 'TREAT(' general_derived_path 'AS' subtype ')' ;
	public final JPA2Parser.treated_derived_path_return treated_derived_path() throws RecognitionException {
		JPA2Parser.treated_derived_path_return retval = new JPA2Parser.treated_derived_path_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal187=null;
		Token string_literal189=null;
		Token char_literal191=null;
		ParserRuleReturnScope general_derived_path188 =null;
		ParserRuleReturnScope subtype190 =null;

		Object string_literal187_tree=null;
		Object string_literal189_tree=null;
		Object char_literal191_tree=null;

		try {
			// JPA2.g:242:5: ( 'TREAT(' general_derived_path 'AS' subtype ')' )
			// JPA2.g:242:7: 'TREAT(' general_derived_path 'AS' subtype ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal187=(Token)match(input,125,FOLLOW_125_in_treated_derived_path1968); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal187_tree = (Object)adaptor.create(string_literal187);
			adaptor.addChild(root_0, string_literal187_tree);
			}

			pushFollow(FOLLOW_general_derived_path_in_treated_derived_path1969);
			general_derived_path188=general_derived_path();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, general_derived_path188.getTree());

			string_literal189=(Token)match(input,78,FOLLOW_78_in_treated_derived_path1971); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal189_tree = (Object)adaptor.create(string_literal189);
			adaptor.addChild(root_0, string_literal189_tree);
			}

			pushFollow(FOLLOW_subtype_in_treated_derived_path1973);
			subtype190=subtype();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subtype190.getTree());

			char_literal191=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_treated_derived_path1975); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal191_tree = (Object)adaptor.create(char_literal191);
			adaptor.addChild(root_0, char_literal191_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "treated_derived_path"


	public static class derived_collection_member_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "derived_collection_member_declaration"
	// JPA2.g:243:1: derived_collection_member_declaration : 'IN' superquery_identification_variable '.' ( single_valued_object_field '.' )* collection_valued_field ;
	public final JPA2Parser.derived_collection_member_declaration_return derived_collection_member_declaration() throws RecognitionException {
		JPA2Parser.derived_collection_member_declaration_return retval = new JPA2Parser.derived_collection_member_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal192=null;
		Token char_literal194=null;
		Token char_literal196=null;
		ParserRuleReturnScope superquery_identification_variable193 =null;
		ParserRuleReturnScope single_valued_object_field195 =null;
		ParserRuleReturnScope collection_valued_field197 =null;

		Object string_literal192_tree=null;
		Object char_literal194_tree=null;
		Object char_literal196_tree=null;

		try {
			// JPA2.g:244:5: ( 'IN' superquery_identification_variable '.' ( single_valued_object_field '.' )* collection_valued_field )
			// JPA2.g:244:7: 'IN' superquery_identification_variable '.' ( single_valued_object_field '.' )* collection_valued_field
			{
			root_0 = (Object)adaptor.nil();


			string_literal192=(Token)match(input,IN,FOLLOW_IN_in_derived_collection_member_declaration1986); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal192_tree = (Object)adaptor.create(string_literal192);
			adaptor.addChild(root_0, string_literal192_tree);
			}

			pushFollow(FOLLOW_superquery_identification_variable_in_derived_collection_member_declaration1988);
			superquery_identification_variable193=superquery_identification_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, superquery_identification_variable193.getTree());

			char_literal194=(Token)match(input,60,FOLLOW_60_in_derived_collection_member_declaration1989); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal194_tree = (Object)adaptor.create(char_literal194);
			adaptor.addChild(root_0, char_literal194_tree);
			}

			// JPA2.g:244:49: ( single_valued_object_field '.' )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==WORD) ) {
					int LA60_1 = input.LA(2);
					if ( (LA60_1==60) ) {
						alt60=1;
					}

				}

				switch (alt60) {
				case 1 :
					// JPA2.g:244:50: single_valued_object_field '.'
					{
					pushFollow(FOLLOW_single_valued_object_field_in_derived_collection_member_declaration1991);
					single_valued_object_field195=single_valued_object_field();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_valued_object_field195.getTree());

					char_literal196=(Token)match(input,60,FOLLOW_60_in_derived_collection_member_declaration1993); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal196_tree = (Object)adaptor.create(char_literal196);
					adaptor.addChild(root_0, char_literal196_tree);
					}

					}
					break;

				default :
					break loop60;
				}
			}

			pushFollow(FOLLOW_collection_valued_field_in_derived_collection_member_declaration1996);
			collection_valued_field197=collection_valued_field();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, collection_valued_field197.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "derived_collection_member_declaration"


	public static class simple_select_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_select_clause"
	// JPA2.g:246:1: simple_select_clause : ( 'DISTINCT' )? simple_select_expression -> ^( T_SELECTED_ITEMS[] ^( T_SELECTED_ITEM[] ( 'DISTINCT' )? simple_select_expression ) ) ;
	public final JPA2Parser.simple_select_clause_return simple_select_clause() throws RecognitionException {
		JPA2Parser.simple_select_clause_return retval = new JPA2Parser.simple_select_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal198=null;
		ParserRuleReturnScope simple_select_expression199 =null;

		Object string_literal198_tree=null;
		RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
		RewriteRuleSubtreeStream stream_simple_select_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_select_expression");

		try {
			// JPA2.g:247:5: ( ( 'DISTINCT' )? simple_select_expression -> ^( T_SELECTED_ITEMS[] ^( T_SELECTED_ITEM[] ( 'DISTINCT' )? simple_select_expression ) ) )
			// JPA2.g:247:7: ( 'DISTINCT' )? simple_select_expression
			{
			// JPA2.g:247:7: ( 'DISTINCT' )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==DISTINCT) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// JPA2.g:247:8: 'DISTINCT'
					{
					string_literal198=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_simple_select_clause2009); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DISTINCT.add(string_literal198);

					}
					break;

			}

			pushFollow(FOLLOW_simple_select_expression_in_simple_select_clause2013);
			simple_select_expression199=simple_select_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_simple_select_expression.add(simple_select_expression199.getTree());
			// AST REWRITE
			// elements: simple_select_expression, DISTINCT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 248:5: -> ^( T_SELECTED_ITEMS[] ^( T_SELECTED_ITEM[] ( 'DISTINCT' )? simple_select_expression ) )
			{
				// JPA2.g:248:8: ^( T_SELECTED_ITEMS[] ^( T_SELECTED_ITEM[] ( 'DISTINCT' )? simple_select_expression ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new SelectedItemsNode(T_SELECTED_ITEMS), root_1);
				// JPA2.g:248:48: ^( T_SELECTED_ITEM[] ( 'DISTINCT' )? simple_select_expression )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(new SelectedItemNode(T_SELECTED_ITEM), root_2);
				// JPA2.g:248:86: ( 'DISTINCT' )?
				if ( stream_DISTINCT.hasNext() ) {
					adaptor.addChild(root_2, stream_DISTINCT.nextNode());
				}
				stream_DISTINCT.reset();

				adaptor.addChild(root_2, stream_simple_select_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_select_clause"


	public static class simple_select_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_select_expression"
	// JPA2.g:249:1: simple_select_expression : ( path_expression | scalar_expression | aggregate_expression | identification_variable );
	public final JPA2Parser.simple_select_expression_return simple_select_expression() throws RecognitionException {
		JPA2Parser.simple_select_expression_return retval = new JPA2Parser.simple_select_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression200 =null;
		ParserRuleReturnScope scalar_expression201 =null;
		ParserRuleReturnScope aggregate_expression202 =null;
		ParserRuleReturnScope identification_variable203 =null;


		try {
			// JPA2.g:250:5: ( path_expression | scalar_expression | aggregate_expression | identification_variable )
			int alt62=4;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA62_1 = input.LA(2);
				if ( (synpred78_JPA2()) ) {
					alt62=1;
				}
				else if ( (synpred79_JPA2()) ) {
					alt62=2;
				}
				else if ( (true) ) {
					alt62=4;
				}

				}
				break;
			case INT_NUMERAL:
			case LOWER:
			case LPAREN:
			case NAMED_PARAMETER:
			case STRING_LITERAL:
			case 55:
			case 57:
			case 59:
			case 62:
			case 69:
			case 75:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 98:
			case 102:
			case 104:
			case 107:
			case 112:
			case 119:
			case 121:
			case 122:
			case 126:
			case 127:
			case 129:
			case 134:
			case 135:
				{
				alt62=2;
				}
				break;
			case COUNT:
				{
				int LA62_16 = input.LA(2);
				if ( (synpred79_JPA2()) ) {
					alt62=2;
				}
				else if ( (synpred80_JPA2()) ) {
					alt62=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA62_17 = input.LA(2);
				if ( (synpred79_JPA2()) ) {
					alt62=2;
				}
				else if ( (synpred80_JPA2()) ) {
					alt62=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 96:
				{
				int LA62_18 = input.LA(2);
				if ( (synpred79_JPA2()) ) {
					alt62=2;
				}
				else if ( (synpred80_JPA2()) ) {
					alt62=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// JPA2.g:250:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_simple_select_expression2053);
					path_expression200=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression200.getTree());

					}
					break;
				case 2 :
					// JPA2.g:251:7: scalar_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_scalar_expression_in_simple_select_expression2061);
					scalar_expression201=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression201.getTree());

					}
					break;
				case 3 :
					// JPA2.g:252:7: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_simple_select_expression2069);
					aggregate_expression202=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression202.getTree());

					}
					break;
				case 4 :
					// JPA2.g:253:7: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_simple_select_expression2077);
					identification_variable203=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable203.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_select_expression"


	public static class scalar_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "scalar_expression"
	// JPA2.g:254:1: scalar_expression : ( arithmetic_expression | string_expression | enum_expression | datetime_expression | boolean_expression | case_expression | entity_type_expression );
	public final JPA2Parser.scalar_expression_return scalar_expression() throws RecognitionException {
		JPA2Parser.scalar_expression_return retval = new JPA2Parser.scalar_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope arithmetic_expression204 =null;
		ParserRuleReturnScope string_expression205 =null;
		ParserRuleReturnScope enum_expression206 =null;
		ParserRuleReturnScope datetime_expression207 =null;
		ParserRuleReturnScope boolean_expression208 =null;
		ParserRuleReturnScope case_expression209 =null;
		ParserRuleReturnScope entity_type_expression210 =null;


		try {
			// JPA2.g:255:5: ( arithmetic_expression | string_expression | enum_expression | datetime_expression | boolean_expression | case_expression | entity_type_expression )
			int alt63=7;
			switch ( input.LA(1) ) {
			case INT_NUMERAL:
			case 57:
			case 59:
			case 62:
			case 75:
			case 98:
			case 102:
			case 104:
			case 107:
			case 119:
			case 121:
				{
				alt63=1;
				}
				break;
			case WORD:
				{
				int LA63_2 = input.LA(2);
				if ( (synpred81_JPA2()) ) {
					alt63=1;
				}
				else if ( (synpred82_JPA2()) ) {
					alt63=2;
				}
				else if ( (synpred83_JPA2()) ) {
					alt63=3;
				}
				else if ( (synpred84_JPA2()) ) {
					alt63=4;
				}
				else if ( (synpred85_JPA2()) ) {
					alt63=5;
				}
				else if ( (true) ) {
					alt63=7;
				}

				}
				break;
			case LPAREN:
				{
				int LA63_5 = input.LA(2);
				if ( (synpred81_JPA2()) ) {
					alt63=1;
				}
				else if ( (synpred82_JPA2()) ) {
					alt63=2;
				}
				else if ( (synpred83_JPA2()) ) {
					alt63=3;
				}
				else if ( (synpred84_JPA2()) ) {
					alt63=4;
				}
				else if ( (synpred85_JPA2()) ) {
					alt63=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 69:
				{
				int LA63_6 = input.LA(2);
				if ( (synpred81_JPA2()) ) {
					alt63=1;
				}
				else if ( (synpred82_JPA2()) ) {
					alt63=2;
				}
				else if ( (synpred83_JPA2()) ) {
					alt63=3;
				}
				else if ( (synpred84_JPA2()) ) {
					alt63=4;
				}
				else if ( (synpred85_JPA2()) ) {
					alt63=5;
				}
				else if ( (true) ) {
					alt63=7;
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA63_7 = input.LA(2);
				if ( (synpred81_JPA2()) ) {
					alt63=1;
				}
				else if ( (synpred82_JPA2()) ) {
					alt63=2;
				}
				else if ( (synpred83_JPA2()) ) {
					alt63=3;
				}
				else if ( (synpred84_JPA2()) ) {
					alt63=4;
				}
				else if ( (synpred85_JPA2()) ) {
					alt63=5;
				}
				else if ( (true) ) {
					alt63=7;
				}

				}
				break;
			case 55:
				{
				int LA63_8 = input.LA(2);
				if ( (synpred81_JPA2()) ) {
					alt63=1;
				}
				else if ( (synpred82_JPA2()) ) {
					alt63=2;
				}
				else if ( (synpred83_JPA2()) ) {
					alt63=3;
				}
				else if ( (synpred84_JPA2()) ) {
					alt63=4;
				}
				else if ( (synpred85_JPA2()) ) {
					alt63=5;
				}
				else if ( (true) ) {
					alt63=7;
				}

				}
				break;
			case COUNT:
				{
				int LA63_16 = input.LA(2);
				if ( (synpred81_JPA2()) ) {
					alt63=1;
				}
				else if ( (synpred82_JPA2()) ) {
					alt63=2;
				}
				else if ( (synpred84_JPA2()) ) {
					alt63=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA63_17 = input.LA(2);
				if ( (synpred81_JPA2()) ) {
					alt63=1;
				}
				else if ( (synpred82_JPA2()) ) {
					alt63=2;
				}
				else if ( (synpred84_JPA2()) ) {
					alt63=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 96:
				{
				int LA63_18 = input.LA(2);
				if ( (synpred81_JPA2()) ) {
					alt63=1;
				}
				else if ( (synpred82_JPA2()) ) {
					alt63=2;
				}
				else if ( (synpred84_JPA2()) ) {
					alt63=4;
				}
				else if ( (synpred85_JPA2()) ) {
					alt63=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 81:
				{
				int LA63_19 = input.LA(2);
				if ( (synpred81_JPA2()) ) {
					alt63=1;
				}
				else if ( (synpred82_JPA2()) ) {
					alt63=2;
				}
				else if ( (synpred83_JPA2()) ) {
					alt63=3;
				}
				else if ( (synpred84_JPA2()) ) {
					alt63=4;
				}
				else if ( (synpred85_JPA2()) ) {
					alt63=5;
				}
				else if ( (synpred86_JPA2()) ) {
					alt63=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 82:
				{
				int LA63_20 = input.LA(2);
				if ( (synpred81_JPA2()) ) {
					alt63=1;
				}
				else if ( (synpred82_JPA2()) ) {
					alt63=2;
				}
				else if ( (synpred83_JPA2()) ) {
					alt63=3;
				}
				else if ( (synpred84_JPA2()) ) {
					alt63=4;
				}
				else if ( (synpred85_JPA2()) ) {
					alt63=5;
				}
				else if ( (synpred86_JPA2()) ) {
					alt63=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 112:
				{
				int LA63_21 = input.LA(2);
				if ( (synpred81_JPA2()) ) {
					alt63=1;
				}
				else if ( (synpred82_JPA2()) ) {
					alt63=2;
				}
				else if ( (synpred83_JPA2()) ) {
					alt63=3;
				}
				else if ( (synpred84_JPA2()) ) {
					alt63=4;
				}
				else if ( (synpred85_JPA2()) ) {
					alt63=5;
				}
				else if ( (synpred86_JPA2()) ) {
					alt63=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 21, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LOWER:
			case STRING_LITERAL:
			case 83:
			case 122:
			case 126:
			case 129:
				{
				alt63=2;
				}
				break;
			case 84:
			case 85:
			case 86:
				{
				alt63=4;
				}
				break;
			case 134:
			case 135:
				{
				alt63=5;
				}
				break;
			case 127:
				{
				alt63=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// JPA2.g:255:7: arithmetic_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_expression_in_scalar_expression2088);
					arithmetic_expression204=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression204.getTree());

					}
					break;
				case 2 :
					// JPA2.g:256:7: string_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_string_expression_in_scalar_expression2096);
					string_expression205=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression205.getTree());

					}
					break;
				case 3 :
					// JPA2.g:257:7: enum_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_enum_expression_in_scalar_expression2104);
					enum_expression206=enum_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_expression206.getTree());

					}
					break;
				case 4 :
					// JPA2.g:258:7: datetime_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_datetime_expression_in_scalar_expression2112);
					datetime_expression207=datetime_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_expression207.getTree());

					}
					break;
				case 5 :
					// JPA2.g:259:7: boolean_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_boolean_expression_in_scalar_expression2120);
					boolean_expression208=boolean_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression208.getTree());

					}
					break;
				case 6 :
					// JPA2.g:260:7: case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_scalar_expression2128);
					case_expression209=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression209.getTree());

					}
					break;
				case 7 :
					// JPA2.g:261:7: entity_type_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_entity_type_expression_in_scalar_expression2136);
					entity_type_expression210=entity_type_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_type_expression210.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "scalar_expression"


	public static class conditional_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional_expression"
	// JPA2.g:262:1: conditional_expression : ( conditional_term ) ( 'OR' conditional_term )* ;
	public final JPA2Parser.conditional_expression_return conditional_expression() throws RecognitionException {
		JPA2Parser.conditional_expression_return retval = new JPA2Parser.conditional_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal212=null;
		ParserRuleReturnScope conditional_term211 =null;
		ParserRuleReturnScope conditional_term213 =null;

		Object string_literal212_tree=null;

		try {
			// JPA2.g:263:5: ( ( conditional_term ) ( 'OR' conditional_term )* )
			// JPA2.g:263:7: ( conditional_term ) ( 'OR' conditional_term )*
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:263:7: ( conditional_term )
			// JPA2.g:263:8: conditional_term
			{
			pushFollow(FOLLOW_conditional_term_in_conditional_expression2148);
			conditional_term211=conditional_term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_term211.getTree());

			}

			// JPA2.g:263:26: ( 'OR' conditional_term )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==OR) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// JPA2.g:263:27: 'OR' conditional_term
					{
					string_literal212=(Token)match(input,OR,FOLLOW_OR_in_conditional_expression2152); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal212_tree = (Object)adaptor.create(string_literal212);
					adaptor.addChild(root_0, string_literal212_tree);
					}

					pushFollow(FOLLOW_conditional_term_in_conditional_expression2154);
					conditional_term213=conditional_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_term213.getTree());

					}
					break;

				default :
					break loop64;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_expression"


	public static class conditional_term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional_term"
	// JPA2.g:264:1: conditional_term : ( conditional_factor ) ( 'AND' conditional_factor )* ;
	public final JPA2Parser.conditional_term_return conditional_term() throws RecognitionException {
		JPA2Parser.conditional_term_return retval = new JPA2Parser.conditional_term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal215=null;
		ParserRuleReturnScope conditional_factor214 =null;
		ParserRuleReturnScope conditional_factor216 =null;

		Object string_literal215_tree=null;

		try {
			// JPA2.g:265:5: ( ( conditional_factor ) ( 'AND' conditional_factor )* )
			// JPA2.g:265:7: ( conditional_factor ) ( 'AND' conditional_factor )*
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:265:7: ( conditional_factor )
			// JPA2.g:265:8: conditional_factor
			{
			pushFollow(FOLLOW_conditional_factor_in_conditional_term2168);
			conditional_factor214=conditional_factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_factor214.getTree());

			}

			// JPA2.g:265:28: ( 'AND' conditional_factor )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==AND) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// JPA2.g:265:29: 'AND' conditional_factor
					{
					string_literal215=(Token)match(input,AND,FOLLOW_AND_in_conditional_term2172); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal215_tree = (Object)adaptor.create(string_literal215);
					adaptor.addChild(root_0, string_literal215_tree);
					}

					pushFollow(FOLLOW_conditional_factor_in_conditional_term2174);
					conditional_factor216=conditional_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_factor216.getTree());

					}
					break;

				default :
					break loop65;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_term"


	public static class conditional_factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional_factor"
	// JPA2.g:266:1: conditional_factor : ( 'NOT' )? conditional_primary ;
	public final JPA2Parser.conditional_factor_return conditional_factor() throws RecognitionException {
		JPA2Parser.conditional_factor_return retval = new JPA2Parser.conditional_factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal217=null;
		ParserRuleReturnScope conditional_primary218 =null;

		Object string_literal217_tree=null;

		try {
			// JPA2.g:267:5: ( ( 'NOT' )? conditional_primary )
			// JPA2.g:267:7: ( 'NOT' )? conditional_primary
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:267:7: ( 'NOT' )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==NOT) ) {
				int LA66_1 = input.LA(2);
				if ( (synpred89_JPA2()) ) {
					alt66=1;
				}
			}
			switch (alt66) {
				case 1 :
					// JPA2.g:267:8: 'NOT'
					{
					string_literal217=(Token)match(input,NOT,FOLLOW_NOT_in_conditional_factor2188); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal217_tree = (Object)adaptor.create(string_literal217);
					adaptor.addChild(root_0, string_literal217_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_conditional_primary_in_conditional_factor2192);
			conditional_primary218=conditional_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_primary218.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_factor"


	public static class conditional_primary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional_primary"
	// JPA2.g:268:1: conditional_primary : ( simple_cond_expression -> ^( T_SIMPLE_CONDITION[] simple_cond_expression ) | '(' conditional_expression ')' );
	public final JPA2Parser.conditional_primary_return conditional_primary() throws RecognitionException {
		JPA2Parser.conditional_primary_return retval = new JPA2Parser.conditional_primary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal220=null;
		Token char_literal222=null;
		ParserRuleReturnScope simple_cond_expression219 =null;
		ParserRuleReturnScope conditional_expression221 =null;

		Object char_literal220_tree=null;
		Object char_literal222_tree=null;
		RewriteRuleSubtreeStream stream_simple_cond_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_cond_expression");

		try {
			// JPA2.g:269:5: ( simple_cond_expression -> ^( T_SIMPLE_CONDITION[] simple_cond_expression ) | '(' conditional_expression ')' )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==AVG||LA67_0==COUNT||LA67_0==INT_NUMERAL||LA67_0==LOWER||(LA67_0 >= MAX && LA67_0 <= NOT)||(LA67_0 >= STRING_LITERAL && LA67_0 <= SUM)||LA67_0==WORD||LA67_0==55||LA67_0==57||LA67_0==59||LA67_0==62||(LA67_0 >= 69 && LA67_0 <= 75)||(LA67_0 >= 81 && LA67_0 <= 86)||LA67_0==94||LA67_0==96||LA67_0==98||LA67_0==102||LA67_0==104||LA67_0==107||LA67_0==112||LA67_0==119||(LA67_0 >= 121 && LA67_0 <= 122)||(LA67_0 >= 126 && LA67_0 <= 127)||LA67_0==129||(LA67_0 >= 134 && LA67_0 <= 135)) ) {
				alt67=1;
			}
			else if ( (LA67_0==LPAREN) ) {
				int LA67_17 = input.LA(2);
				if ( (synpred90_JPA2()) ) {
					alt67=1;
				}
				else if ( (true) ) {
					alt67=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// JPA2.g:269:7: simple_cond_expression
					{
					pushFollow(FOLLOW_simple_cond_expression_in_conditional_primary2203);
					simple_cond_expression219=simple_cond_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_simple_cond_expression.add(simple_cond_expression219.getTree());
					// AST REWRITE
					// elements: simple_cond_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 270:5: -> ^( T_SIMPLE_CONDITION[] simple_cond_expression )
					{
						// JPA2.g:270:8: ^( T_SIMPLE_CONDITION[] simple_cond_expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new SimpleConditionNode(T_SIMPLE_CONDITION), root_1);
						adaptor.addChild(root_1, stream_simple_cond_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// JPA2.g:271:7: '(' conditional_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal220=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditional_primary2227); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal220_tree = (Object)adaptor.create(char_literal220);
					adaptor.addChild(root_0, char_literal220_tree);
					}

					pushFollow(FOLLOW_conditional_expression_in_conditional_primary2228);
					conditional_expression221=conditional_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression221.getTree());

					char_literal222=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditional_primary2229); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal222_tree = (Object)adaptor.create(char_literal222);
					adaptor.addChild(root_0, char_literal222_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_primary"


	public static class simple_cond_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_cond_expression"
	// JPA2.g:272:1: simple_cond_expression : ( comparison_expression | between_expression | in_expression | like_expression | null_comparison_expression | empty_collection_comparison_expression | collection_member_expression | exists_expression | date_macro_expression );
	public final JPA2Parser.simple_cond_expression_return simple_cond_expression() throws RecognitionException {
		JPA2Parser.simple_cond_expression_return retval = new JPA2Parser.simple_cond_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope comparison_expression223 =null;
		ParserRuleReturnScope between_expression224 =null;
		ParserRuleReturnScope in_expression225 =null;
		ParserRuleReturnScope like_expression226 =null;
		ParserRuleReturnScope null_comparison_expression227 =null;
		ParserRuleReturnScope empty_collection_comparison_expression228 =null;
		ParserRuleReturnScope collection_member_expression229 =null;
		ParserRuleReturnScope exists_expression230 =null;
		ParserRuleReturnScope date_macro_expression231 =null;


		try {
			// JPA2.g:273:5: ( comparison_expression | between_expression | in_expression | like_expression | null_comparison_expression | empty_collection_comparison_expression | collection_member_expression | exists_expression | date_macro_expression )
			int alt68=9;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA68_1 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred93_JPA2()) ) {
					alt68=3;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}
				else if ( (synpred95_JPA2()) ) {
					alt68=5;
				}
				else if ( (synpred96_JPA2()) ) {
					alt68=6;
				}
				else if ( (synpred97_JPA2()) ) {
					alt68=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRING_LITERAL:
				{
				int LA68_2 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 69:
				{
				int LA68_3 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}
				else if ( (synpred95_JPA2()) ) {
					alt68=5;
				}
				else if ( (synpred97_JPA2()) ) {
					alt68=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA68_4 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}
				else if ( (synpred95_JPA2()) ) {
					alt68=5;
				}
				else if ( (synpred97_JPA2()) ) {
					alt68=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 55:
				{
				int LA68_5 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}
				else if ( (synpred95_JPA2()) ) {
					alt68=5;
				}
				else if ( (synpred97_JPA2()) ) {
					alt68=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 83:
				{
				int LA68_6 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 122:
				{
				int LA68_7 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 126:
				{
				int LA68_8 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LOWER:
				{
				int LA68_9 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 129:
				{
				int LA68_10 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COUNT:
				{
				int LA68_11 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA68_12 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 96:
				{
				int LA68_13 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 81:
				{
				int LA68_14 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 82:
				{
				int LA68_15 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 112:
				{
				int LA68_16 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LPAREN:
				{
				int LA68_17 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}
				else if ( (synpred94_JPA2()) ) {
					alt68=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 134:
			case 135:
				{
				alt68=1;
				}
				break;
			case 84:
			case 85:
			case 86:
				{
				int LA68_19 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 127:
				{
				int LA68_20 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred93_JPA2()) ) {
					alt68=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 57:
			case 59:
				{
				int LA68_21 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 21, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 62:
				{
				int LA68_22 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 22, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT_NUMERAL:
				{
				int LA68_23 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 23, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 102:
				{
				int LA68_24 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 24, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 104:
				{
				int LA68_25 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 25, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 75:
				{
				int LA68_26 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 26, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 121:
				{
				int LA68_27 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 27, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 107:
				{
				int LA68_28 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 28, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 119:
				{
				int LA68_29 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 29, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 98:
				{
				int LA68_30 = input.LA(2);
				if ( (synpred91_JPA2()) ) {
					alt68=1;
				}
				else if ( (synpred92_JPA2()) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 30, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NOT:
			case 94:
				{
				alt68=8;
				}
				break;
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
				{
				alt68=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}
			switch (alt68) {
				case 1 :
					// JPA2.g:273:7: comparison_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_comparison_expression_in_simple_cond_expression2240);
					comparison_expression223=comparison_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_expression223.getTree());

					}
					break;
				case 2 :
					// JPA2.g:274:7: between_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_between_expression_in_simple_cond_expression2248);
					between_expression224=between_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, between_expression224.getTree());

					}
					break;
				case 3 :
					// JPA2.g:275:7: in_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_in_expression_in_simple_cond_expression2256);
					in_expression225=in_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, in_expression225.getTree());

					}
					break;
				case 4 :
					// JPA2.g:276:7: like_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_like_expression_in_simple_cond_expression2264);
					like_expression226=like_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, like_expression226.getTree());

					}
					break;
				case 5 :
					// JPA2.g:277:7: null_comparison_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_null_comparison_expression_in_simple_cond_expression2272);
					null_comparison_expression227=null_comparison_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, null_comparison_expression227.getTree());

					}
					break;
				case 6 :
					// JPA2.g:278:7: empty_collection_comparison_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_empty_collection_comparison_expression_in_simple_cond_expression2280);
					empty_collection_comparison_expression228=empty_collection_comparison_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, empty_collection_comparison_expression228.getTree());

					}
					break;
				case 7 :
					// JPA2.g:279:7: collection_member_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_collection_member_expression_in_simple_cond_expression2288);
					collection_member_expression229=collection_member_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, collection_member_expression229.getTree());

					}
					break;
				case 8 :
					// JPA2.g:280:7: exists_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exists_expression_in_simple_cond_expression2296);
					exists_expression230=exists_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exists_expression230.getTree());

					}
					break;
				case 9 :
					// JPA2.g:281:7: date_macro_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_macro_expression_in_simple_cond_expression2304);
					date_macro_expression231=date_macro_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_macro_expression231.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_cond_expression"


	public static class date_macro_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_macro_expression"
	// JPA2.g:284:1: date_macro_expression : ( date_between_macro_expression | date_before_macro_expression | date_after_macro_expression | date_equals_macro_expression | date_today_macro_expression );
	public final JPA2Parser.date_macro_expression_return date_macro_expression() throws RecognitionException {
		JPA2Parser.date_macro_expression_return retval = new JPA2Parser.date_macro_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope date_between_macro_expression232 =null;
		ParserRuleReturnScope date_before_macro_expression233 =null;
		ParserRuleReturnScope date_after_macro_expression234 =null;
		ParserRuleReturnScope date_equals_macro_expression235 =null;
		ParserRuleReturnScope date_today_macro_expression236 =null;


		try {
			// JPA2.g:285:5: ( date_between_macro_expression | date_before_macro_expression | date_after_macro_expression | date_equals_macro_expression | date_today_macro_expression )
			int alt69=5;
			switch ( input.LA(1) ) {
			case 70:
				{
				alt69=1;
				}
				break;
			case 72:
				{
				alt69=2;
				}
				break;
			case 71:
				{
				alt69=3;
				}
				break;
			case 73:
				{
				alt69=4;
				}
				break;
			case 74:
				{
				alt69=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// JPA2.g:285:7: date_between_macro_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_between_macro_expression_in_date_macro_expression2317);
					date_between_macro_expression232=date_between_macro_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_between_macro_expression232.getTree());

					}
					break;
				case 2 :
					// JPA2.g:286:7: date_before_macro_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_before_macro_expression_in_date_macro_expression2325);
					date_before_macro_expression233=date_before_macro_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_before_macro_expression233.getTree());

					}
					break;
				case 3 :
					// JPA2.g:287:7: date_after_macro_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_after_macro_expression_in_date_macro_expression2333);
					date_after_macro_expression234=date_after_macro_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_after_macro_expression234.getTree());

					}
					break;
				case 4 :
					// JPA2.g:288:7: date_equals_macro_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_equals_macro_expression_in_date_macro_expression2341);
					date_equals_macro_expression235=date_equals_macro_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_equals_macro_expression235.getTree());

					}
					break;
				case 5 :
					// JPA2.g:289:7: date_today_macro_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_today_macro_expression_in_date_macro_expression2349);
					date_today_macro_expression236=date_today_macro_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_today_macro_expression236.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_macro_expression"


	public static class date_between_macro_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_between_macro_expression"
	// JPA2.g:291:1: date_between_macro_expression : '@BETWEEN' '(' path_expression ',' 'NOW' ( ( '+' | '-' ) numeric_literal )? ',' 'NOW' ( ( '+' | '-' ) numeric_literal )? ',' ( 'YEAR' | 'MONTH' | 'DAY' | 'HOUR' | 'MINUTE' | 'SECOND' ) ')' ;
	public final JPA2Parser.date_between_macro_expression_return date_between_macro_expression() throws RecognitionException {
		JPA2Parser.date_between_macro_expression_return retval = new JPA2Parser.date_between_macro_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal237=null;
		Token char_literal238=null;
		Token char_literal240=null;
		Token string_literal241=null;
		Token set242=null;
		Token char_literal244=null;
		Token string_literal245=null;
		Token set246=null;
		Token char_literal248=null;
		Token set249=null;
		Token char_literal250=null;
		ParserRuleReturnScope path_expression239 =null;
		ParserRuleReturnScope numeric_literal243 =null;
		ParserRuleReturnScope numeric_literal247 =null;

		Object string_literal237_tree=null;
		Object char_literal238_tree=null;
		Object char_literal240_tree=null;
		Object string_literal241_tree=null;
		Object set242_tree=null;
		Object char_literal244_tree=null;
		Object string_literal245_tree=null;
		Object set246_tree=null;
		Object char_literal248_tree=null;
		Object set249_tree=null;
		Object char_literal250_tree=null;

		try {
			// JPA2.g:292:5: ( '@BETWEEN' '(' path_expression ',' 'NOW' ( ( '+' | '-' ) numeric_literal )? ',' 'NOW' ( ( '+' | '-' ) numeric_literal )? ',' ( 'YEAR' | 'MONTH' | 'DAY' | 'HOUR' | 'MINUTE' | 'SECOND' ) ')' )
			// JPA2.g:292:7: '@BETWEEN' '(' path_expression ',' 'NOW' ( ( '+' | '-' ) numeric_literal )? ',' 'NOW' ( ( '+' | '-' ) numeric_literal )? ',' ( 'YEAR' | 'MONTH' | 'DAY' | 'HOUR' | 'MINUTE' | 'SECOND' ) ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal237=(Token)match(input,70,FOLLOW_70_in_date_between_macro_expression2361); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal237_tree = (Object)adaptor.create(string_literal237);
			adaptor.addChild(root_0, string_literal237_tree);
			}

			char_literal238=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_date_between_macro_expression2363); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal238_tree = (Object)adaptor.create(char_literal238);
			adaptor.addChild(root_0, char_literal238_tree);
			}

			pushFollow(FOLLOW_path_expression_in_date_between_macro_expression2365);
			path_expression239=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression239.getTree());

			char_literal240=(Token)match(input,58,FOLLOW_58_in_date_between_macro_expression2367); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal240_tree = (Object)adaptor.create(char_literal240);
			adaptor.addChild(root_0, char_literal240_tree);
			}

			string_literal241=(Token)match(input,110,FOLLOW_110_in_date_between_macro_expression2369); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal241_tree = (Object)adaptor.create(string_literal241);
			adaptor.addChild(root_0, string_literal241_tree);
			}

			// JPA2.g:292:48: ( ( '+' | '-' ) numeric_literal )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==57||LA70_0==59) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// JPA2.g:292:49: ( '+' | '-' ) numeric_literal
					{
					set242=input.LT(1);
					if ( input.LA(1)==57||input.LA(1)==59 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set242));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_numeric_literal_in_date_between_macro_expression2380);
					numeric_literal243=numeric_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_literal243.getTree());

					}
					break;

			}

			char_literal244=(Token)match(input,58,FOLLOW_58_in_date_between_macro_expression2384); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal244_tree = (Object)adaptor.create(char_literal244);
			adaptor.addChild(root_0, char_literal244_tree);
			}

			string_literal245=(Token)match(input,110,FOLLOW_110_in_date_between_macro_expression2386); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal245_tree = (Object)adaptor.create(string_literal245);
			adaptor.addChild(root_0, string_literal245_tree);
			}

			// JPA2.g:292:89: ( ( '+' | '-' ) numeric_literal )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==57||LA71_0==59) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// JPA2.g:292:90: ( '+' | '-' ) numeric_literal
					{
					set246=input.LT(1);
					if ( input.LA(1)==57||input.LA(1)==59 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set246));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_numeric_literal_in_date_between_macro_expression2397);
					numeric_literal247=numeric_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_literal247.getTree());

					}
					break;

			}

			char_literal248=(Token)match(input,58,FOLLOW_58_in_date_between_macro_expression2401); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal248_tree = (Object)adaptor.create(char_literal248);
			adaptor.addChild(root_0, char_literal248_tree);
			}

			set249=input.LT(1);
			if ( input.LA(1)==87||input.LA(1)==97||input.LA(1)==106||input.LA(1)==108||input.LA(1)==116||input.LA(1)==133 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set249));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			char_literal250=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_date_between_macro_expression2426); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal250_tree = (Object)adaptor.create(char_literal250);
			adaptor.addChild(root_0, char_literal250_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_between_macro_expression"


	public static class date_before_macro_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_before_macro_expression"
	// JPA2.g:294:1: date_before_macro_expression : '@DATEBEFORE' '(' path_expression ',' ( path_expression | input_parameter ) ')' ;
	public final JPA2Parser.date_before_macro_expression_return date_before_macro_expression() throws RecognitionException {
		JPA2Parser.date_before_macro_expression_return retval = new JPA2Parser.date_before_macro_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal251=null;
		Token char_literal252=null;
		Token char_literal254=null;
		Token char_literal257=null;
		ParserRuleReturnScope path_expression253 =null;
		ParserRuleReturnScope path_expression255 =null;
		ParserRuleReturnScope input_parameter256 =null;

		Object string_literal251_tree=null;
		Object char_literal252_tree=null;
		Object char_literal254_tree=null;
		Object char_literal257_tree=null;

		try {
			// JPA2.g:295:5: ( '@DATEBEFORE' '(' path_expression ',' ( path_expression | input_parameter ) ')' )
			// JPA2.g:295:7: '@DATEBEFORE' '(' path_expression ',' ( path_expression | input_parameter ) ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal251=(Token)match(input,72,FOLLOW_72_in_date_before_macro_expression2438); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal251_tree = (Object)adaptor.create(string_literal251);
			adaptor.addChild(root_0, string_literal251_tree);
			}

			char_literal252=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_date_before_macro_expression2440); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal252_tree = (Object)adaptor.create(char_literal252);
			adaptor.addChild(root_0, char_literal252_tree);
			}

			pushFollow(FOLLOW_path_expression_in_date_before_macro_expression2442);
			path_expression253=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression253.getTree());

			char_literal254=(Token)match(input,58,FOLLOW_58_in_date_before_macro_expression2444); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal254_tree = (Object)adaptor.create(char_literal254);
			adaptor.addChild(root_0, char_literal254_tree);
			}

			// JPA2.g:295:45: ( path_expression | input_parameter )
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==WORD) ) {
				alt72=1;
			}
			else if ( (LA72_0==NAMED_PARAMETER||LA72_0==55||LA72_0==69) ) {
				alt72=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}

			switch (alt72) {
				case 1 :
					// JPA2.g:295:46: path_expression
					{
					pushFollow(FOLLOW_path_expression_in_date_before_macro_expression2447);
					path_expression255=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression255.getTree());

					}
					break;
				case 2 :
					// JPA2.g:295:64: input_parameter
					{
					pushFollow(FOLLOW_input_parameter_in_date_before_macro_expression2451);
					input_parameter256=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter256.getTree());

					}
					break;

			}

			char_literal257=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_date_before_macro_expression2454); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal257_tree = (Object)adaptor.create(char_literal257);
			adaptor.addChild(root_0, char_literal257_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_before_macro_expression"


	public static class date_after_macro_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_after_macro_expression"
	// JPA2.g:297:1: date_after_macro_expression : '@DATEAFTER' '(' path_expression ',' ( path_expression | input_parameter ) ')' ;
	public final JPA2Parser.date_after_macro_expression_return date_after_macro_expression() throws RecognitionException {
		JPA2Parser.date_after_macro_expression_return retval = new JPA2Parser.date_after_macro_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal258=null;
		Token char_literal259=null;
		Token char_literal261=null;
		Token char_literal264=null;
		ParserRuleReturnScope path_expression260 =null;
		ParserRuleReturnScope path_expression262 =null;
		ParserRuleReturnScope input_parameter263 =null;

		Object string_literal258_tree=null;
		Object char_literal259_tree=null;
		Object char_literal261_tree=null;
		Object char_literal264_tree=null;

		try {
			// JPA2.g:298:5: ( '@DATEAFTER' '(' path_expression ',' ( path_expression | input_parameter ) ')' )
			// JPA2.g:298:7: '@DATEAFTER' '(' path_expression ',' ( path_expression | input_parameter ) ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal258=(Token)match(input,71,FOLLOW_71_in_date_after_macro_expression2466); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal258_tree = (Object)adaptor.create(string_literal258);
			adaptor.addChild(root_0, string_literal258_tree);
			}

			char_literal259=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_date_after_macro_expression2468); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal259_tree = (Object)adaptor.create(char_literal259);
			adaptor.addChild(root_0, char_literal259_tree);
			}

			pushFollow(FOLLOW_path_expression_in_date_after_macro_expression2470);
			path_expression260=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression260.getTree());

			char_literal261=(Token)match(input,58,FOLLOW_58_in_date_after_macro_expression2472); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal261_tree = (Object)adaptor.create(char_literal261);
			adaptor.addChild(root_0, char_literal261_tree);
			}

			// JPA2.g:298:44: ( path_expression | input_parameter )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==WORD) ) {
				alt73=1;
			}
			else if ( (LA73_0==NAMED_PARAMETER||LA73_0==55||LA73_0==69) ) {
				alt73=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// JPA2.g:298:45: path_expression
					{
					pushFollow(FOLLOW_path_expression_in_date_after_macro_expression2475);
					path_expression262=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression262.getTree());

					}
					break;
				case 2 :
					// JPA2.g:298:63: input_parameter
					{
					pushFollow(FOLLOW_input_parameter_in_date_after_macro_expression2479);
					input_parameter263=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter263.getTree());

					}
					break;

			}

			char_literal264=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_date_after_macro_expression2482); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal264_tree = (Object)adaptor.create(char_literal264);
			adaptor.addChild(root_0, char_literal264_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_after_macro_expression"


	public static class date_equals_macro_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_equals_macro_expression"
	// JPA2.g:300:1: date_equals_macro_expression : '@DATEEQUALS' '(' path_expression ',' ( path_expression | input_parameter ) ')' ;
	public final JPA2Parser.date_equals_macro_expression_return date_equals_macro_expression() throws RecognitionException {
		JPA2Parser.date_equals_macro_expression_return retval = new JPA2Parser.date_equals_macro_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal265=null;
		Token char_literal266=null;
		Token char_literal268=null;
		Token char_literal271=null;
		ParserRuleReturnScope path_expression267 =null;
		ParserRuleReturnScope path_expression269 =null;
		ParserRuleReturnScope input_parameter270 =null;

		Object string_literal265_tree=null;
		Object char_literal266_tree=null;
		Object char_literal268_tree=null;
		Object char_literal271_tree=null;

		try {
			// JPA2.g:301:5: ( '@DATEEQUALS' '(' path_expression ',' ( path_expression | input_parameter ) ')' )
			// JPA2.g:301:7: '@DATEEQUALS' '(' path_expression ',' ( path_expression | input_parameter ) ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal265=(Token)match(input,73,FOLLOW_73_in_date_equals_macro_expression2494); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal265_tree = (Object)adaptor.create(string_literal265);
			adaptor.addChild(root_0, string_literal265_tree);
			}

			char_literal266=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_date_equals_macro_expression2496); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal266_tree = (Object)adaptor.create(char_literal266);
			adaptor.addChild(root_0, char_literal266_tree);
			}

			pushFollow(FOLLOW_path_expression_in_date_equals_macro_expression2498);
			path_expression267=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression267.getTree());

			char_literal268=(Token)match(input,58,FOLLOW_58_in_date_equals_macro_expression2500); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal268_tree = (Object)adaptor.create(char_literal268);
			adaptor.addChild(root_0, char_literal268_tree);
			}

			// JPA2.g:301:45: ( path_expression | input_parameter )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==WORD) ) {
				alt74=1;
			}
			else if ( (LA74_0==NAMED_PARAMETER||LA74_0==55||LA74_0==69) ) {
				alt74=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// JPA2.g:301:46: path_expression
					{
					pushFollow(FOLLOW_path_expression_in_date_equals_macro_expression2503);
					path_expression269=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression269.getTree());

					}
					break;
				case 2 :
					// JPA2.g:301:64: input_parameter
					{
					pushFollow(FOLLOW_input_parameter_in_date_equals_macro_expression2507);
					input_parameter270=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter270.getTree());

					}
					break;

			}

			char_literal271=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_date_equals_macro_expression2510); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal271_tree = (Object)adaptor.create(char_literal271);
			adaptor.addChild(root_0, char_literal271_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_equals_macro_expression"


	public static class date_today_macro_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_today_macro_expression"
	// JPA2.g:303:1: date_today_macro_expression : '@TODAY' '(' path_expression ')' ;
	public final JPA2Parser.date_today_macro_expression_return date_today_macro_expression() throws RecognitionException {
		JPA2Parser.date_today_macro_expression_return retval = new JPA2Parser.date_today_macro_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal272=null;
		Token char_literal273=null;
		Token char_literal275=null;
		ParserRuleReturnScope path_expression274 =null;

		Object string_literal272_tree=null;
		Object char_literal273_tree=null;
		Object char_literal275_tree=null;

		try {
			// JPA2.g:304:5: ( '@TODAY' '(' path_expression ')' )
			// JPA2.g:304:7: '@TODAY' '(' path_expression ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal272=(Token)match(input,74,FOLLOW_74_in_date_today_macro_expression2522); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal272_tree = (Object)adaptor.create(string_literal272);
			adaptor.addChild(root_0, string_literal272_tree);
			}

			char_literal273=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_date_today_macro_expression2524); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal273_tree = (Object)adaptor.create(char_literal273);
			adaptor.addChild(root_0, char_literal273_tree);
			}

			pushFollow(FOLLOW_path_expression_in_date_today_macro_expression2526);
			path_expression274=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression274.getTree());

			char_literal275=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_date_today_macro_expression2528); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal275_tree = (Object)adaptor.create(char_literal275);
			adaptor.addChild(root_0, char_literal275_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_today_macro_expression"


	public static class between_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "between_expression"
	// JPA2.g:307:1: between_expression : ( arithmetic_expression ( 'NOT' )? 'BETWEEN' arithmetic_expression 'AND' arithmetic_expression | string_expression ( 'NOT' )? 'BETWEEN' string_expression 'AND' string_expression | datetime_expression ( 'NOT' )? 'BETWEEN' datetime_expression 'AND' datetime_expression );
	public final JPA2Parser.between_expression_return between_expression() throws RecognitionException {
		JPA2Parser.between_expression_return retval = new JPA2Parser.between_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal277=null;
		Token string_literal278=null;
		Token string_literal280=null;
		Token string_literal283=null;
		Token string_literal284=null;
		Token string_literal286=null;
		Token string_literal289=null;
		Token string_literal290=null;
		Token string_literal292=null;
		ParserRuleReturnScope arithmetic_expression276 =null;
		ParserRuleReturnScope arithmetic_expression279 =null;
		ParserRuleReturnScope arithmetic_expression281 =null;
		ParserRuleReturnScope string_expression282 =null;
		ParserRuleReturnScope string_expression285 =null;
		ParserRuleReturnScope string_expression287 =null;
		ParserRuleReturnScope datetime_expression288 =null;
		ParserRuleReturnScope datetime_expression291 =null;
		ParserRuleReturnScope datetime_expression293 =null;

		Object string_literal277_tree=null;
		Object string_literal278_tree=null;
		Object string_literal280_tree=null;
		Object string_literal283_tree=null;
		Object string_literal284_tree=null;
		Object string_literal286_tree=null;
		Object string_literal289_tree=null;
		Object string_literal290_tree=null;
		Object string_literal292_tree=null;

		try {
			// JPA2.g:308:5: ( arithmetic_expression ( 'NOT' )? 'BETWEEN' arithmetic_expression 'AND' arithmetic_expression | string_expression ( 'NOT' )? 'BETWEEN' string_expression 'AND' string_expression | datetime_expression ( 'NOT' )? 'BETWEEN' datetime_expression 'AND' datetime_expression )
			int alt78=3;
			switch ( input.LA(1) ) {
			case INT_NUMERAL:
			case 57:
			case 59:
			case 62:
			case 75:
			case 98:
			case 102:
			case 104:
			case 107:
			case 119:
			case 121:
				{
				alt78=1;
				}
				break;
			case WORD:
				{
				int LA78_2 = input.LA(2);
				if ( (synpred116_JPA2()) ) {
					alt78=1;
				}
				else if ( (synpred118_JPA2()) ) {
					alt78=2;
				}
				else if ( (true) ) {
					alt78=3;
				}

				}
				break;
			case LPAREN:
				{
				int LA78_5 = input.LA(2);
				if ( (synpred116_JPA2()) ) {
					alt78=1;
				}
				else if ( (synpred118_JPA2()) ) {
					alt78=2;
				}
				else if ( (true) ) {
					alt78=3;
				}

				}
				break;
			case 69:
				{
				int LA78_6 = input.LA(2);
				if ( (synpred116_JPA2()) ) {
					alt78=1;
				}
				else if ( (synpred118_JPA2()) ) {
					alt78=2;
				}
				else if ( (true) ) {
					alt78=3;
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA78_7 = input.LA(2);
				if ( (synpred116_JPA2()) ) {
					alt78=1;
				}
				else if ( (synpred118_JPA2()) ) {
					alt78=2;
				}
				else if ( (true) ) {
					alt78=3;
				}

				}
				break;
			case 55:
				{
				int LA78_8 = input.LA(2);
				if ( (synpred116_JPA2()) ) {
					alt78=1;
				}
				else if ( (synpred118_JPA2()) ) {
					alt78=2;
				}
				else if ( (true) ) {
					alt78=3;
				}

				}
				break;
			case COUNT:
				{
				int LA78_16 = input.LA(2);
				if ( (synpred116_JPA2()) ) {
					alt78=1;
				}
				else if ( (synpred118_JPA2()) ) {
					alt78=2;
				}
				else if ( (true) ) {
					alt78=3;
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA78_17 = input.LA(2);
				if ( (synpred116_JPA2()) ) {
					alt78=1;
				}
				else if ( (synpred118_JPA2()) ) {
					alt78=2;
				}
				else if ( (true) ) {
					alt78=3;
				}

				}
				break;
			case 96:
				{
				int LA78_18 = input.LA(2);
				if ( (synpred116_JPA2()) ) {
					alt78=1;
				}
				else if ( (synpred118_JPA2()) ) {
					alt78=2;
				}
				else if ( (true) ) {
					alt78=3;
				}

				}
				break;
			case 81:
				{
				int LA78_19 = input.LA(2);
				if ( (synpred116_JPA2()) ) {
					alt78=1;
				}
				else if ( (synpred118_JPA2()) ) {
					alt78=2;
				}
				else if ( (true) ) {
					alt78=3;
				}

				}
				break;
			case 82:
				{
				int LA78_20 = input.LA(2);
				if ( (synpred116_JPA2()) ) {
					alt78=1;
				}
				else if ( (synpred118_JPA2()) ) {
					alt78=2;
				}
				else if ( (true) ) {
					alt78=3;
				}

				}
				break;
			case 112:
				{
				int LA78_21 = input.LA(2);
				if ( (synpred116_JPA2()) ) {
					alt78=1;
				}
				else if ( (synpred118_JPA2()) ) {
					alt78=2;
				}
				else if ( (true) ) {
					alt78=3;
				}

				}
				break;
			case LOWER:
			case STRING_LITERAL:
			case 83:
			case 122:
			case 126:
			case 129:
				{
				alt78=2;
				}
				break;
			case 84:
			case 85:
			case 86:
				{
				alt78=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// JPA2.g:308:7: arithmetic_expression ( 'NOT' )? 'BETWEEN' arithmetic_expression 'AND' arithmetic_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_expression_in_between_expression2541);
					arithmetic_expression276=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression276.getTree());

					// JPA2.g:308:29: ( 'NOT' )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==NOT) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// JPA2.g:308:30: 'NOT'
							{
							string_literal277=(Token)match(input,NOT,FOLLOW_NOT_in_between_expression2544); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal277_tree = (Object)adaptor.create(string_literal277);
							adaptor.addChild(root_0, string_literal277_tree);
							}

							}
							break;

					}

					string_literal278=(Token)match(input,79,FOLLOW_79_in_between_expression2548); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal278_tree = (Object)adaptor.create(string_literal278);
					adaptor.addChild(root_0, string_literal278_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_between_expression2550);
					arithmetic_expression279=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression279.getTree());

					string_literal280=(Token)match(input,AND,FOLLOW_AND_in_between_expression2552); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal280_tree = (Object)adaptor.create(string_literal280);
					adaptor.addChild(root_0, string_literal280_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_between_expression2554);
					arithmetic_expression281=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression281.getTree());

					}
					break;
				case 2 :
					// JPA2.g:309:7: string_expression ( 'NOT' )? 'BETWEEN' string_expression 'AND' string_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_string_expression_in_between_expression2562);
					string_expression282=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression282.getTree());

					// JPA2.g:309:25: ( 'NOT' )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==NOT) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// JPA2.g:309:26: 'NOT'
							{
							string_literal283=(Token)match(input,NOT,FOLLOW_NOT_in_between_expression2565); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal283_tree = (Object)adaptor.create(string_literal283);
							adaptor.addChild(root_0, string_literal283_tree);
							}

							}
							break;

					}

					string_literal284=(Token)match(input,79,FOLLOW_79_in_between_expression2569); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal284_tree = (Object)adaptor.create(string_literal284);
					adaptor.addChild(root_0, string_literal284_tree);
					}

					pushFollow(FOLLOW_string_expression_in_between_expression2571);
					string_expression285=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression285.getTree());

					string_literal286=(Token)match(input,AND,FOLLOW_AND_in_between_expression2573); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal286_tree = (Object)adaptor.create(string_literal286);
					adaptor.addChild(root_0, string_literal286_tree);
					}

					pushFollow(FOLLOW_string_expression_in_between_expression2575);
					string_expression287=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression287.getTree());

					}
					break;
				case 3 :
					// JPA2.g:310:7: datetime_expression ( 'NOT' )? 'BETWEEN' datetime_expression 'AND' datetime_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_datetime_expression_in_between_expression2583);
					datetime_expression288=datetime_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_expression288.getTree());

					// JPA2.g:310:27: ( 'NOT' )?
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( (LA77_0==NOT) ) {
						alt77=1;
					}
					switch (alt77) {
						case 1 :
							// JPA2.g:310:28: 'NOT'
							{
							string_literal289=(Token)match(input,NOT,FOLLOW_NOT_in_between_expression2586); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal289_tree = (Object)adaptor.create(string_literal289);
							adaptor.addChild(root_0, string_literal289_tree);
							}

							}
							break;

					}

					string_literal290=(Token)match(input,79,FOLLOW_79_in_between_expression2590); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal290_tree = (Object)adaptor.create(string_literal290);
					adaptor.addChild(root_0, string_literal290_tree);
					}

					pushFollow(FOLLOW_datetime_expression_in_between_expression2592);
					datetime_expression291=datetime_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_expression291.getTree());

					string_literal292=(Token)match(input,AND,FOLLOW_AND_in_between_expression2594); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal292_tree = (Object)adaptor.create(string_literal292);
					adaptor.addChild(root_0, string_literal292_tree);
					}

					pushFollow(FOLLOW_datetime_expression_in_between_expression2596);
					datetime_expression293=datetime_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_expression293.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "between_expression"


	public static class in_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "in_expression"
	// JPA2.g:311:1: in_expression : ( path_expression | type_discriminator | identification_variable ) ( NOT )? IN ( '(' in_item ( ',' in_item )* ')' | subquery | collection_valued_input_parameter | '(' path_expression ')' ) ;
	public final JPA2Parser.in_expression_return in_expression() throws RecognitionException {
		JPA2Parser.in_expression_return retval = new JPA2Parser.in_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT297=null;
		Token IN298=null;
		Token char_literal299=null;
		Token char_literal301=null;
		Token char_literal303=null;
		Token char_literal306=null;
		Token char_literal308=null;
		ParserRuleReturnScope path_expression294 =null;
		ParserRuleReturnScope type_discriminator295 =null;
		ParserRuleReturnScope identification_variable296 =null;
		ParserRuleReturnScope in_item300 =null;
		ParserRuleReturnScope in_item302 =null;
		ParserRuleReturnScope subquery304 =null;
		ParserRuleReturnScope collection_valued_input_parameter305 =null;
		ParserRuleReturnScope path_expression307 =null;

		Object NOT297_tree=null;
		Object IN298_tree=null;
		Object char_literal299_tree=null;
		Object char_literal301_tree=null;
		Object char_literal303_tree=null;
		Object char_literal306_tree=null;
		Object char_literal308_tree=null;

		try {
			// JPA2.g:312:5: ( ( path_expression | type_discriminator | identification_variable ) ( NOT )? IN ( '(' in_item ( ',' in_item )* ')' | subquery | collection_valued_input_parameter | '(' path_expression ')' ) )
			// JPA2.g:312:7: ( path_expression | type_discriminator | identification_variable ) ( NOT )? IN ( '(' in_item ( ',' in_item )* ')' | subquery | collection_valued_input_parameter | '(' path_expression ')' )
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:312:7: ( path_expression | type_discriminator | identification_variable )
			int alt79=3;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==WORD) ) {
				int LA79_1 = input.LA(2);
				if ( (LA79_1==60) ) {
					alt79=1;
				}
				else if ( (LA79_1==IN||LA79_1==NOT) ) {
					alt79=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 79, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA79_0==127) ) {
				alt79=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// JPA2.g:312:8: path_expression
					{
					pushFollow(FOLLOW_path_expression_in_in_expression2608);
					path_expression294=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression294.getTree());

					}
					break;
				case 2 :
					// JPA2.g:312:26: type_discriminator
					{
					pushFollow(FOLLOW_type_discriminator_in_in_expression2612);
					type_discriminator295=type_discriminator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type_discriminator295.getTree());

					}
					break;
				case 3 :
					// JPA2.g:312:47: identification_variable
					{
					pushFollow(FOLLOW_identification_variable_in_in_expression2616);
					identification_variable296=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable296.getTree());

					}
					break;

			}

			// JPA2.g:312:72: ( NOT )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==NOT) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// JPA2.g:312:73: NOT
					{
					NOT297=(Token)match(input,NOT,FOLLOW_NOT_in_in_expression2620); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT297_tree = (Object)adaptor.create(NOT297);
					adaptor.addChild(root_0, NOT297_tree);
					}

					}
					break;

			}

			IN298=(Token)match(input,IN,FOLLOW_IN_in_in_expression2624); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IN298_tree = (Object)adaptor.create(IN298);
			adaptor.addChild(root_0, IN298_tree);
			}

			// JPA2.g:313:13: ( '(' in_item ( ',' in_item )* ')' | subquery | collection_valued_input_parameter | '(' path_expression ')' )
			int alt82=4;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==LPAREN) ) {
				switch ( input.LA(2) ) {
				case 117:
					{
					alt82=2;
					}
					break;
				case WORD:
					{
					int LA82_4 = input.LA(3);
					if ( (LA82_4==RPAREN||LA82_4==58) ) {
						alt82=1;
					}
					else if ( (LA82_4==60) ) {
						alt82=4;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 82, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case NAMED_PARAMETER:
				case 55:
				case 69:
					{
					alt82=1;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 82, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA82_0==NAMED_PARAMETER||LA82_0==55||LA82_0==69) ) {
				alt82=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// JPA2.g:313:15: '(' in_item ( ',' in_item )* ')'
					{
					char_literal299=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_expression2640); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal299_tree = (Object)adaptor.create(char_literal299);
					adaptor.addChild(root_0, char_literal299_tree);
					}

					pushFollow(FOLLOW_in_item_in_in_expression2642);
					in_item300=in_item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, in_item300.getTree());

					// JPA2.g:313:27: ( ',' in_item )*
					loop81:
					while (true) {
						int alt81=2;
						int LA81_0 = input.LA(1);
						if ( (LA81_0==58) ) {
							alt81=1;
						}

						switch (alt81) {
						case 1 :
							// JPA2.g:313:28: ',' in_item
							{
							char_literal301=(Token)match(input,58,FOLLOW_58_in_in_expression2645); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal301_tree = (Object)adaptor.create(char_literal301);
							adaptor.addChild(root_0, char_literal301_tree);
							}

							pushFollow(FOLLOW_in_item_in_in_expression2647);
							in_item302=in_item();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, in_item302.getTree());

							}
							break;

						default :
							break loop81;
						}
					}

					char_literal303=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_expression2651); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal303_tree = (Object)adaptor.create(char_literal303);
					adaptor.addChild(root_0, char_literal303_tree);
					}

					}
					break;
				case 2 :
					// JPA2.g:314:15: subquery
					{
					pushFollow(FOLLOW_subquery_in_in_expression2667);
					subquery304=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery304.getTree());

					}
					break;
				case 3 :
					// JPA2.g:315:15: collection_valued_input_parameter
					{
					pushFollow(FOLLOW_collection_valued_input_parameter_in_in_expression2683);
					collection_valued_input_parameter305=collection_valued_input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, collection_valued_input_parameter305.getTree());

					}
					break;
				case 4 :
					// JPA2.g:316:15: '(' path_expression ')'
					{
					char_literal306=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_expression2699); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal306_tree = (Object)adaptor.create(char_literal306);
					adaptor.addChild(root_0, char_literal306_tree);
					}

					pushFollow(FOLLOW_path_expression_in_in_expression2701);
					path_expression307=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression307.getTree());

					char_literal308=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_expression2703); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal308_tree = (Object)adaptor.create(char_literal308);
					adaptor.addChild(root_0, char_literal308_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "in_expression"


	public static class in_item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "in_item"
	// JPA2.g:322:1: in_item : ( literal | single_valued_input_parameter );
	public final JPA2Parser.in_item_return in_item() throws RecognitionException {
		JPA2Parser.in_item_return retval = new JPA2Parser.in_item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope literal309 =null;
		ParserRuleReturnScope single_valued_input_parameter310 =null;


		try {
			// JPA2.g:323:5: ( literal | single_valued_input_parameter )
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==WORD) ) {
				alt83=1;
			}
			else if ( (LA83_0==NAMED_PARAMETER||LA83_0==55||LA83_0==69) ) {
				alt83=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}

			switch (alt83) {
				case 1 :
					// JPA2.g:323:7: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_in_item2731);
					literal309=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal309.getTree());

					}
					break;
				case 2 :
					// JPA2.g:323:17: single_valued_input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_single_valued_input_parameter_in_in_item2735);
					single_valued_input_parameter310=single_valued_input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, single_valued_input_parameter310.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "in_item"


	public static class like_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "like_expression"
	// JPA2.g:324:1: like_expression : string_expression ( 'NOT' )? 'LIKE' ( pattern_value | input_parameter ) ( 'ESCAPE' escape_character )? ;
	public final JPA2Parser.like_expression_return like_expression() throws RecognitionException {
		JPA2Parser.like_expression_return retval = new JPA2Parser.like_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal312=null;
		Token string_literal313=null;
		Token string_literal316=null;
		ParserRuleReturnScope string_expression311 =null;
		ParserRuleReturnScope pattern_value314 =null;
		ParserRuleReturnScope input_parameter315 =null;
		ParserRuleReturnScope escape_character317 =null;

		Object string_literal312_tree=null;
		Object string_literal313_tree=null;
		Object string_literal316_tree=null;

		try {
			// JPA2.g:325:5: ( string_expression ( 'NOT' )? 'LIKE' ( pattern_value | input_parameter ) ( 'ESCAPE' escape_character )? )
			// JPA2.g:325:7: string_expression ( 'NOT' )? 'LIKE' ( pattern_value | input_parameter ) ( 'ESCAPE' escape_character )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_string_expression_in_like_expression2746);
			string_expression311=string_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression311.getTree());

			// JPA2.g:325:25: ( 'NOT' )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==NOT) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// JPA2.g:325:26: 'NOT'
					{
					string_literal312=(Token)match(input,NOT,FOLLOW_NOT_in_like_expression2749); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal312_tree = (Object)adaptor.create(string_literal312);
					adaptor.addChild(root_0, string_literal312_tree);
					}

					}
					break;

			}

			string_literal313=(Token)match(input,103,FOLLOW_103_in_like_expression2753); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal313_tree = (Object)adaptor.create(string_literal313);
			adaptor.addChild(root_0, string_literal313_tree);
			}

			// JPA2.g:325:41: ( pattern_value | input_parameter )
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==STRING_LITERAL) ) {
				alt85=1;
			}
			else if ( (LA85_0==NAMED_PARAMETER||LA85_0==55||LA85_0==69) ) {
				alt85=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}

			switch (alt85) {
				case 1 :
					// JPA2.g:325:42: pattern_value
					{
					pushFollow(FOLLOW_pattern_value_in_like_expression2756);
					pattern_value314=pattern_value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern_value314.getTree());

					}
					break;
				case 2 :
					// JPA2.g:325:58: input_parameter
					{
					pushFollow(FOLLOW_input_parameter_in_like_expression2760);
					input_parameter315=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter315.getTree());

					}
					break;

			}

			// JPA2.g:325:74: ( 'ESCAPE' escape_character )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==93) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// JPA2.g:325:75: 'ESCAPE' escape_character
					{
					string_literal316=(Token)match(input,93,FOLLOW_93_in_like_expression2763); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal316_tree = (Object)adaptor.create(string_literal316);
					adaptor.addChild(root_0, string_literal316_tree);
					}

					pushFollow(FOLLOW_escape_character_in_like_expression2765);
					escape_character317=escape_character();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, escape_character317.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "like_expression"


	public static class null_comparison_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "null_comparison_expression"
	// JPA2.g:326:1: null_comparison_expression : ( path_expression | input_parameter ) 'IS' ( 'NOT' )? 'NULL' ;
	public final JPA2Parser.null_comparison_expression_return null_comparison_expression() throws RecognitionException {
		JPA2Parser.null_comparison_expression_return retval = new JPA2Parser.null_comparison_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal320=null;
		Token string_literal321=null;
		Token string_literal322=null;
		ParserRuleReturnScope path_expression318 =null;
		ParserRuleReturnScope input_parameter319 =null;

		Object string_literal320_tree=null;
		Object string_literal321_tree=null;
		Object string_literal322_tree=null;

		try {
			// JPA2.g:327:5: ( ( path_expression | input_parameter ) 'IS' ( 'NOT' )? 'NULL' )
			// JPA2.g:327:7: ( path_expression | input_parameter ) 'IS' ( 'NOT' )? 'NULL'
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:327:7: ( path_expression | input_parameter )
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==WORD) ) {
				alt87=1;
			}
			else if ( (LA87_0==NAMED_PARAMETER||LA87_0==55||LA87_0==69) ) {
				alt87=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}

			switch (alt87) {
				case 1 :
					// JPA2.g:327:8: path_expression
					{
					pushFollow(FOLLOW_path_expression_in_null_comparison_expression2779);
					path_expression318=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression318.getTree());

					}
					break;
				case 2 :
					// JPA2.g:327:26: input_parameter
					{
					pushFollow(FOLLOW_input_parameter_in_null_comparison_expression2783);
					input_parameter319=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter319.getTree());

					}
					break;

			}

			string_literal320=(Token)match(input,99,FOLLOW_99_in_null_comparison_expression2786); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal320_tree = (Object)adaptor.create(string_literal320);
			adaptor.addChild(root_0, string_literal320_tree);
			}

			// JPA2.g:327:48: ( 'NOT' )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==NOT) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// JPA2.g:327:49: 'NOT'
					{
					string_literal321=(Token)match(input,NOT,FOLLOW_NOT_in_null_comparison_expression2789); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal321_tree = (Object)adaptor.create(string_literal321);
					adaptor.addChild(root_0, string_literal321_tree);
					}

					}
					break;

			}

			string_literal322=(Token)match(input,111,FOLLOW_111_in_null_comparison_expression2793); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal322_tree = (Object)adaptor.create(string_literal322);
			adaptor.addChild(root_0, string_literal322_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "null_comparison_expression"


	public static class empty_collection_comparison_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "empty_collection_comparison_expression"
	// JPA2.g:328:1: empty_collection_comparison_expression : path_expression 'IS' ( 'NOT' )? 'EMPTY' ;
	public final JPA2Parser.empty_collection_comparison_expression_return empty_collection_comparison_expression() throws RecognitionException {
		JPA2Parser.empty_collection_comparison_expression_return retval = new JPA2Parser.empty_collection_comparison_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal324=null;
		Token string_literal325=null;
		Token string_literal326=null;
		ParserRuleReturnScope path_expression323 =null;

		Object string_literal324_tree=null;
		Object string_literal325_tree=null;
		Object string_literal326_tree=null;

		try {
			// JPA2.g:329:5: ( path_expression 'IS' ( 'NOT' )? 'EMPTY' )
			// JPA2.g:329:7: path_expression 'IS' ( 'NOT' )? 'EMPTY'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_path_expression_in_empty_collection_comparison_expression2804);
			path_expression323=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression323.getTree());

			string_literal324=(Token)match(input,99,FOLLOW_99_in_empty_collection_comparison_expression2806); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal324_tree = (Object)adaptor.create(string_literal324);
			adaptor.addChild(root_0, string_literal324_tree);
			}

			// JPA2.g:329:28: ( 'NOT' )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==NOT) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// JPA2.g:329:29: 'NOT'
					{
					string_literal325=(Token)match(input,NOT,FOLLOW_NOT_in_empty_collection_comparison_expression2809); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal325_tree = (Object)adaptor.create(string_literal325);
					adaptor.addChild(root_0, string_literal325_tree);
					}

					}
					break;

			}

			string_literal326=(Token)match(input,90,FOLLOW_90_in_empty_collection_comparison_expression2813); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal326_tree = (Object)adaptor.create(string_literal326);
			adaptor.addChild(root_0, string_literal326_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "empty_collection_comparison_expression"


	public static class collection_member_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "collection_member_expression"
	// JPA2.g:330:1: collection_member_expression : entity_or_value_expression ( 'NOT' )? 'MEMBER' ( 'OF' )? path_expression ;
	public final JPA2Parser.collection_member_expression_return collection_member_expression() throws RecognitionException {
		JPA2Parser.collection_member_expression_return retval = new JPA2Parser.collection_member_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal328=null;
		Token string_literal329=null;
		Token string_literal330=null;
		ParserRuleReturnScope entity_or_value_expression327 =null;
		ParserRuleReturnScope path_expression331 =null;

		Object string_literal328_tree=null;
		Object string_literal329_tree=null;
		Object string_literal330_tree=null;

		try {
			// JPA2.g:331:5: ( entity_or_value_expression ( 'NOT' )? 'MEMBER' ( 'OF' )? path_expression )
			// JPA2.g:331:7: entity_or_value_expression ( 'NOT' )? 'MEMBER' ( 'OF' )? path_expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_entity_or_value_expression_in_collection_member_expression2824);
			entity_or_value_expression327=entity_or_value_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_or_value_expression327.getTree());

			// JPA2.g:331:35: ( 'NOT' )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==NOT) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// JPA2.g:331:36: 'NOT'
					{
					string_literal328=(Token)match(input,NOT,FOLLOW_NOT_in_collection_member_expression2828); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal328_tree = (Object)adaptor.create(string_literal328);
					adaptor.addChild(root_0, string_literal328_tree);
					}

					}
					break;

			}

			string_literal329=(Token)match(input,105,FOLLOW_105_in_collection_member_expression2832); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal329_tree = (Object)adaptor.create(string_literal329);
			adaptor.addChild(root_0, string_literal329_tree);
			}

			// JPA2.g:331:53: ( 'OF' )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==114) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// JPA2.g:331:54: 'OF'
					{
					string_literal330=(Token)match(input,114,FOLLOW_114_in_collection_member_expression2835); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal330_tree = (Object)adaptor.create(string_literal330);
					adaptor.addChild(root_0, string_literal330_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_path_expression_in_collection_member_expression2839);
			path_expression331=path_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression331.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "collection_member_expression"


	public static class entity_or_value_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entity_or_value_expression"
	// JPA2.g:332:1: entity_or_value_expression : ( path_expression | simple_entity_or_value_expression );
	public final JPA2Parser.entity_or_value_expression_return entity_or_value_expression() throws RecognitionException {
		JPA2Parser.entity_or_value_expression_return retval = new JPA2Parser.entity_or_value_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression332 =null;
		ParserRuleReturnScope simple_entity_or_value_expression333 =null;


		try {
			// JPA2.g:333:5: ( path_expression | simple_entity_or_value_expression )
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==WORD) ) {
				int LA92_1 = input.LA(2);
				if ( (LA92_1==60) ) {
					alt92=1;
				}
				else if ( (LA92_1==NOT||LA92_1==105) ) {
					alt92=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA92_0==NAMED_PARAMETER||LA92_0==55||LA92_0==69) ) {
				alt92=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// JPA2.g:333:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_entity_or_value_expression2850);
					path_expression332=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression332.getTree());

					}
					break;
				case 2 :
					// JPA2.g:334:7: simple_entity_or_value_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_entity_or_value_expression_in_entity_or_value_expression2858);
					simple_entity_or_value_expression333=simple_entity_or_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_entity_or_value_expression333.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "entity_or_value_expression"


	public static class simple_entity_or_value_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_entity_or_value_expression"
	// JPA2.g:335:1: simple_entity_or_value_expression : ( identification_variable | input_parameter | literal );
	public final JPA2Parser.simple_entity_or_value_expression_return simple_entity_or_value_expression() throws RecognitionException {
		JPA2Parser.simple_entity_or_value_expression_return retval = new JPA2Parser.simple_entity_or_value_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identification_variable334 =null;
		ParserRuleReturnScope input_parameter335 =null;
		ParserRuleReturnScope literal336 =null;


		try {
			// JPA2.g:336:5: ( identification_variable | input_parameter | literal )
			int alt93=3;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==WORD) ) {
				int LA93_1 = input.LA(2);
				if ( (synpred137_JPA2()) ) {
					alt93=1;
				}
				else if ( (true) ) {
					alt93=3;
				}

			}
			else if ( (LA93_0==NAMED_PARAMETER||LA93_0==55||LA93_0==69) ) {
				alt93=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				throw nvae;
			}

			switch (alt93) {
				case 1 :
					// JPA2.g:336:7: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_simple_entity_or_value_expression2869);
					identification_variable334=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable334.getTree());

					}
					break;
				case 2 :
					// JPA2.g:337:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_simple_entity_or_value_expression2877);
					input_parameter335=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter335.getTree());

					}
					break;
				case 3 :
					// JPA2.g:338:7: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_simple_entity_or_value_expression2885);
					literal336=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal336.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_entity_or_value_expression"


	public static class exists_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exists_expression"
	// JPA2.g:339:1: exists_expression : ( 'NOT' )? 'EXISTS' subquery ;
	public final JPA2Parser.exists_expression_return exists_expression() throws RecognitionException {
		JPA2Parser.exists_expression_return retval = new JPA2Parser.exists_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal337=null;
		Token string_literal338=null;
		ParserRuleReturnScope subquery339 =null;

		Object string_literal337_tree=null;
		Object string_literal338_tree=null;

		try {
			// JPA2.g:340:5: ( ( 'NOT' )? 'EXISTS' subquery )
			// JPA2.g:340:7: ( 'NOT' )? 'EXISTS' subquery
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:340:7: ( 'NOT' )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==NOT) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// JPA2.g:340:8: 'NOT'
					{
					string_literal337=(Token)match(input,NOT,FOLLOW_NOT_in_exists_expression2897); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal337_tree = (Object)adaptor.create(string_literal337);
					adaptor.addChild(root_0, string_literal337_tree);
					}

					}
					break;

			}

			string_literal338=(Token)match(input,94,FOLLOW_94_in_exists_expression2901); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal338_tree = (Object)adaptor.create(string_literal338);
			adaptor.addChild(root_0, string_literal338_tree);
			}

			pushFollow(FOLLOW_subquery_in_exists_expression2903);
			subquery339=subquery();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery339.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exists_expression"


	public static class all_or_any_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "all_or_any_expression"
	// JPA2.g:341:1: all_or_any_expression : ( 'ALL' | 'ANY' | 'SOME' ) subquery ;
	public final JPA2Parser.all_or_any_expression_return all_or_any_expression() throws RecognitionException {
		JPA2Parser.all_or_any_expression_return retval = new JPA2Parser.all_or_any_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set340=null;
		ParserRuleReturnScope subquery341 =null;

		Object set340_tree=null;

		try {
			// JPA2.g:342:5: ( ( 'ALL' | 'ANY' | 'SOME' ) subquery )
			// JPA2.g:342:7: ( 'ALL' | 'ANY' | 'SOME' ) subquery
			{
			root_0 = (Object)adaptor.nil();


			set340=input.LT(1);
			if ( (input.LA(1) >= 76 && input.LA(1) <= 77)||input.LA(1)==120 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set340));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_subquery_in_all_or_any_expression2927);
			subquery341=subquery();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery341.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "all_or_any_expression"


	public static class comparison_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison_expression"
	// JPA2.g:343:1: comparison_expression : ( string_expression comparison_operator ( string_expression | all_or_any_expression ) | boolean_expression ( '=' | '<>' ) ( boolean_expression | all_or_any_expression ) | enum_expression ( '=' | '<>' ) ( enum_expression | all_or_any_expression ) | datetime_expression comparison_operator ( datetime_expression | all_or_any_expression ) | entity_expression ( '=' | '<>' ) ( entity_expression | all_or_any_expression ) | entity_type_expression ( '=' | '<>' ) entity_type_expression | arithmetic_expression comparison_operator ( arithmetic_expression | all_or_any_expression ) );
	public final JPA2Parser.comparison_expression_return comparison_expression() throws RecognitionException {
		JPA2Parser.comparison_expression_return retval = new JPA2Parser.comparison_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set347=null;
		Token set351=null;
		Token set359=null;
		Token set363=null;
		ParserRuleReturnScope string_expression342 =null;
		ParserRuleReturnScope comparison_operator343 =null;
		ParserRuleReturnScope string_expression344 =null;
		ParserRuleReturnScope all_or_any_expression345 =null;
		ParserRuleReturnScope boolean_expression346 =null;
		ParserRuleReturnScope boolean_expression348 =null;
		ParserRuleReturnScope all_or_any_expression349 =null;
		ParserRuleReturnScope enum_expression350 =null;
		ParserRuleReturnScope enum_expression352 =null;
		ParserRuleReturnScope all_or_any_expression353 =null;
		ParserRuleReturnScope datetime_expression354 =null;
		ParserRuleReturnScope comparison_operator355 =null;
		ParserRuleReturnScope datetime_expression356 =null;
		ParserRuleReturnScope all_or_any_expression357 =null;
		ParserRuleReturnScope entity_expression358 =null;
		ParserRuleReturnScope entity_expression360 =null;
		ParserRuleReturnScope all_or_any_expression361 =null;
		ParserRuleReturnScope entity_type_expression362 =null;
		ParserRuleReturnScope entity_type_expression364 =null;
		ParserRuleReturnScope arithmetic_expression365 =null;
		ParserRuleReturnScope comparison_operator366 =null;
		ParserRuleReturnScope arithmetic_expression367 =null;
		ParserRuleReturnScope all_or_any_expression368 =null;

		Object set347_tree=null;
		Object set351_tree=null;
		Object set359_tree=null;
		Object set363_tree=null;

		try {
			// JPA2.g:344:5: ( string_expression comparison_operator ( string_expression | all_or_any_expression ) | boolean_expression ( '=' | '<>' ) ( boolean_expression | all_or_any_expression ) | enum_expression ( '=' | '<>' ) ( enum_expression | all_or_any_expression ) | datetime_expression comparison_operator ( datetime_expression | all_or_any_expression ) | entity_expression ( '=' | '<>' ) ( entity_expression | all_or_any_expression ) | entity_type_expression ( '=' | '<>' ) entity_type_expression | arithmetic_expression comparison_operator ( arithmetic_expression | all_or_any_expression ) )
			int alt101=7;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA101_1 = input.LA(2);
				if ( (synpred143_JPA2()) ) {
					alt101=1;
				}
				else if ( (synpred146_JPA2()) ) {
					alt101=2;
				}
				else if ( (synpred149_JPA2()) ) {
					alt101=3;
				}
				else if ( (synpred151_JPA2()) ) {
					alt101=4;
				}
				else if ( (synpred154_JPA2()) ) {
					alt101=5;
				}
				else if ( (synpred156_JPA2()) ) {
					alt101=6;
				}
				else if ( (true) ) {
					alt101=7;
				}

				}
				break;
			case LOWER:
			case STRING_LITERAL:
			case 83:
			case 122:
			case 126:
			case 129:
				{
				alt101=1;
				}
				break;
			case 69:
				{
				int LA101_3 = input.LA(2);
				if ( (synpred143_JPA2()) ) {
					alt101=1;
				}
				else if ( (synpred146_JPA2()) ) {
					alt101=2;
				}
				else if ( (synpred149_JPA2()) ) {
					alt101=3;
				}
				else if ( (synpred151_JPA2()) ) {
					alt101=4;
				}
				else if ( (synpred154_JPA2()) ) {
					alt101=5;
				}
				else if ( (synpred156_JPA2()) ) {
					alt101=6;
				}
				else if ( (true) ) {
					alt101=7;
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA101_4 = input.LA(2);
				if ( (synpred143_JPA2()) ) {
					alt101=1;
				}
				else if ( (synpred146_JPA2()) ) {
					alt101=2;
				}
				else if ( (synpred149_JPA2()) ) {
					alt101=3;
				}
				else if ( (synpred151_JPA2()) ) {
					alt101=4;
				}
				else if ( (synpred154_JPA2()) ) {
					alt101=5;
				}
				else if ( (synpred156_JPA2()) ) {
					alt101=6;
				}
				else if ( (true) ) {
					alt101=7;
				}

				}
				break;
			case 55:
				{
				int LA101_5 = input.LA(2);
				if ( (synpred143_JPA2()) ) {
					alt101=1;
				}
				else if ( (synpred146_JPA2()) ) {
					alt101=2;
				}
				else if ( (synpred149_JPA2()) ) {
					alt101=3;
				}
				else if ( (synpred151_JPA2()) ) {
					alt101=4;
				}
				else if ( (synpred154_JPA2()) ) {
					alt101=5;
				}
				else if ( (synpred156_JPA2()) ) {
					alt101=6;
				}
				else if ( (true) ) {
					alt101=7;
				}

				}
				break;
			case COUNT:
				{
				int LA101_11 = input.LA(2);
				if ( (synpred143_JPA2()) ) {
					alt101=1;
				}
				else if ( (synpred151_JPA2()) ) {
					alt101=4;
				}
				else if ( (true) ) {
					alt101=7;
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA101_12 = input.LA(2);
				if ( (synpred143_JPA2()) ) {
					alt101=1;
				}
				else if ( (synpred151_JPA2()) ) {
					alt101=4;
				}
				else if ( (true) ) {
					alt101=7;
				}

				}
				break;
			case 96:
				{
				int LA101_13 = input.LA(2);
				if ( (synpred143_JPA2()) ) {
					alt101=1;
				}
				else if ( (synpred146_JPA2()) ) {
					alt101=2;
				}
				else if ( (synpred151_JPA2()) ) {
					alt101=4;
				}
				else if ( (true) ) {
					alt101=7;
				}

				}
				break;
			case 81:
				{
				int LA101_14 = input.LA(2);
				if ( (synpred143_JPA2()) ) {
					alt101=1;
				}
				else if ( (synpred146_JPA2()) ) {
					alt101=2;
				}
				else if ( (synpred149_JPA2()) ) {
					alt101=3;
				}
				else if ( (synpred151_JPA2()) ) {
					alt101=4;
				}
				else if ( (true) ) {
					alt101=7;
				}

				}
				break;
			case 82:
				{
				int LA101_15 = input.LA(2);
				if ( (synpred143_JPA2()) ) {
					alt101=1;
				}
				else if ( (synpred146_JPA2()) ) {
					alt101=2;
				}
				else if ( (synpred149_JPA2()) ) {
					alt101=3;
				}
				else if ( (synpred151_JPA2()) ) {
					alt101=4;
				}
				else if ( (true) ) {
					alt101=7;
				}

				}
				break;
			case 112:
				{
				int LA101_16 = input.LA(2);
				if ( (synpred143_JPA2()) ) {
					alt101=1;
				}
				else if ( (synpred146_JPA2()) ) {
					alt101=2;
				}
				else if ( (synpred149_JPA2()) ) {
					alt101=3;
				}
				else if ( (synpred151_JPA2()) ) {
					alt101=4;
				}
				else if ( (true) ) {
					alt101=7;
				}

				}
				break;
			case LPAREN:
				{
				int LA101_17 = input.LA(2);
				if ( (synpred143_JPA2()) ) {
					alt101=1;
				}
				else if ( (synpred146_JPA2()) ) {
					alt101=2;
				}
				else if ( (synpred149_JPA2()) ) {
					alt101=3;
				}
				else if ( (synpred151_JPA2()) ) {
					alt101=4;
				}
				else if ( (true) ) {
					alt101=7;
				}

				}
				break;
			case 134:
			case 135:
				{
				alt101=2;
				}
				break;
			case 84:
			case 85:
			case 86:
				{
				alt101=4;
				}
				break;
			case 127:
				{
				alt101=6;
				}
				break;
			case INT_NUMERAL:
			case 57:
			case 59:
			case 62:
			case 75:
			case 98:
			case 102:
			case 104:
			case 107:
			case 119:
			case 121:
				{
				alt101=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 101, 0, input);
				throw nvae;
			}
			switch (alt101) {
				case 1 :
					// JPA2.g:344:7: string_expression comparison_operator ( string_expression | all_or_any_expression )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_string_expression_in_comparison_expression2938);
					string_expression342=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression342.getTree());

					pushFollow(FOLLOW_comparison_operator_in_comparison_expression2940);
					comparison_operator343=comparison_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_operator343.getTree());

					// JPA2.g:344:45: ( string_expression | all_or_any_expression )
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==AVG||LA95_0==COUNT||(LA95_0 >= LOWER && LA95_0 <= NAMED_PARAMETER)||(LA95_0 >= STRING_LITERAL && LA95_0 <= SUM)||LA95_0==WORD||LA95_0==55||LA95_0==69||(LA95_0 >= 81 && LA95_0 <= 83)||LA95_0==96||LA95_0==112||LA95_0==122||LA95_0==126||LA95_0==129) ) {
						alt95=1;
					}
					else if ( ((LA95_0 >= 76 && LA95_0 <= 77)||LA95_0==120) ) {
						alt95=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 95, 0, input);
						throw nvae;
					}

					switch (alt95) {
						case 1 :
							// JPA2.g:344:46: string_expression
							{
							pushFollow(FOLLOW_string_expression_in_comparison_expression2943);
							string_expression344=string_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression344.getTree());

							}
							break;
						case 2 :
							// JPA2.g:344:66: all_or_any_expression
							{
							pushFollow(FOLLOW_all_or_any_expression_in_comparison_expression2947);
							all_or_any_expression345=all_or_any_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, all_or_any_expression345.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// JPA2.g:345:7: boolean_expression ( '=' | '<>' ) ( boolean_expression | all_or_any_expression )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_boolean_expression_in_comparison_expression2956);
					boolean_expression346=boolean_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression346.getTree());

					set347=input.LT(1);
					if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set347));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// JPA2.g:345:39: ( boolean_expression | all_or_any_expression )
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==LPAREN||LA96_0==NAMED_PARAMETER||LA96_0==WORD||LA96_0==55||LA96_0==69||(LA96_0 >= 81 && LA96_0 <= 82)||LA96_0==96||LA96_0==112||(LA96_0 >= 134 && LA96_0 <= 135)) ) {
						alt96=1;
					}
					else if ( ((LA96_0 >= 76 && LA96_0 <= 77)||LA96_0==120) ) {
						alt96=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 96, 0, input);
						throw nvae;
					}

					switch (alt96) {
						case 1 :
							// JPA2.g:345:40: boolean_expression
							{
							pushFollow(FOLLOW_boolean_expression_in_comparison_expression2967);
							boolean_expression348=boolean_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_expression348.getTree());

							}
							break;
						case 2 :
							// JPA2.g:345:61: all_or_any_expression
							{
							pushFollow(FOLLOW_all_or_any_expression_in_comparison_expression2971);
							all_or_any_expression349=all_or_any_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, all_or_any_expression349.getTree());

							}
							break;

					}

					}
					break;
				case 3 :
					// JPA2.g:346:7: enum_expression ( '=' | '<>' ) ( enum_expression | all_or_any_expression )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_enum_expression_in_comparison_expression2980);
					enum_expression350=enum_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_expression350.getTree());

					set351=input.LT(1);
					if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set351));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// JPA2.g:346:34: ( enum_expression | all_or_any_expression )
					int alt97=2;
					int LA97_0 = input.LA(1);
					if ( (LA97_0==LPAREN||LA97_0==NAMED_PARAMETER||LA97_0==WORD||LA97_0==55||LA97_0==69||(LA97_0 >= 81 && LA97_0 <= 82)||LA97_0==112) ) {
						alt97=1;
					}
					else if ( ((LA97_0 >= 76 && LA97_0 <= 77)||LA97_0==120) ) {
						alt97=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 97, 0, input);
						throw nvae;
					}

					switch (alt97) {
						case 1 :
							// JPA2.g:346:35: enum_expression
							{
							pushFollow(FOLLOW_enum_expression_in_comparison_expression2989);
							enum_expression352=enum_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_expression352.getTree());

							}
							break;
						case 2 :
							// JPA2.g:346:53: all_or_any_expression
							{
							pushFollow(FOLLOW_all_or_any_expression_in_comparison_expression2993);
							all_or_any_expression353=all_or_any_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, all_or_any_expression353.getTree());

							}
							break;

					}

					}
					break;
				case 4 :
					// JPA2.g:347:7: datetime_expression comparison_operator ( datetime_expression | all_or_any_expression )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_datetime_expression_in_comparison_expression3002);
					datetime_expression354=datetime_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_expression354.getTree());

					pushFollow(FOLLOW_comparison_operator_in_comparison_expression3004);
					comparison_operator355=comparison_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_operator355.getTree());

					// JPA2.g:347:47: ( datetime_expression | all_or_any_expression )
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==AVG||LA98_0==COUNT||(LA98_0 >= LPAREN && LA98_0 <= NAMED_PARAMETER)||LA98_0==SUM||LA98_0==WORD||LA98_0==55||LA98_0==69||(LA98_0 >= 81 && LA98_0 <= 82)||(LA98_0 >= 84 && LA98_0 <= 86)||LA98_0==96||LA98_0==112) ) {
						alt98=1;
					}
					else if ( ((LA98_0 >= 76 && LA98_0 <= 77)||LA98_0==120) ) {
						alt98=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 98, 0, input);
						throw nvae;
					}

					switch (alt98) {
						case 1 :
							// JPA2.g:347:48: datetime_expression
							{
							pushFollow(FOLLOW_datetime_expression_in_comparison_expression3007);
							datetime_expression356=datetime_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime_expression356.getTree());

							}
							break;
						case 2 :
							// JPA2.g:347:70: all_or_any_expression
							{
							pushFollow(FOLLOW_all_or_any_expression_in_comparison_expression3011);
							all_or_any_expression357=all_or_any_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, all_or_any_expression357.getTree());

							}
							break;

					}

					}
					break;
				case 5 :
					// JPA2.g:348:7: entity_expression ( '=' | '<>' ) ( entity_expression | all_or_any_expression )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_entity_expression_in_comparison_expression3020);
					entity_expression358=entity_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_expression358.getTree());

					set359=input.LT(1);
					if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set359));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// JPA2.g:348:38: ( entity_expression | all_or_any_expression )
					int alt99=2;
					int LA99_0 = input.LA(1);
					if ( (LA99_0==NAMED_PARAMETER||LA99_0==WORD||LA99_0==55||LA99_0==69) ) {
						alt99=1;
					}
					else if ( ((LA99_0 >= 76 && LA99_0 <= 77)||LA99_0==120) ) {
						alt99=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 99, 0, input);
						throw nvae;
					}

					switch (alt99) {
						case 1 :
							// JPA2.g:348:39: entity_expression
							{
							pushFollow(FOLLOW_entity_expression_in_comparison_expression3031);
							entity_expression360=entity_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_expression360.getTree());

							}
							break;
						case 2 :
							// JPA2.g:348:59: all_or_any_expression
							{
							pushFollow(FOLLOW_all_or_any_expression_in_comparison_expression3035);
							all_or_any_expression361=all_or_any_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, all_or_any_expression361.getTree());

							}
							break;

					}

					}
					break;
				case 6 :
					// JPA2.g:349:7: entity_type_expression ( '=' | '<>' ) entity_type_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_entity_type_expression_in_comparison_expression3044);
					entity_type_expression362=entity_type_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_type_expression362.getTree());

					set363=input.LT(1);
					if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set363));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_entity_type_expression_in_comparison_expression3054);
					entity_type_expression364=entity_type_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_type_expression364.getTree());

					}
					break;
				case 7 :
					// JPA2.g:350:7: arithmetic_expression comparison_operator ( arithmetic_expression | all_or_any_expression )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_expression_in_comparison_expression3062);
					arithmetic_expression365=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression365.getTree());

					pushFollow(FOLLOW_comparison_operator_in_comparison_expression3064);
					comparison_operator366=comparison_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison_operator366.getTree());

					// JPA2.g:350:49: ( arithmetic_expression | all_or_any_expression )
					int alt100=2;
					int LA100_0 = input.LA(1);
					if ( (LA100_0==AVG||LA100_0==COUNT||LA100_0==INT_NUMERAL||(LA100_0 >= LPAREN && LA100_0 <= NAMED_PARAMETER)||LA100_0==SUM||LA100_0==WORD||LA100_0==55||LA100_0==57||LA100_0==59||LA100_0==62||LA100_0==69||LA100_0==75||(LA100_0 >= 81 && LA100_0 <= 82)||LA100_0==96||LA100_0==98||LA100_0==102||LA100_0==104||LA100_0==107||LA100_0==112||LA100_0==119||LA100_0==121) ) {
						alt100=1;
					}
					else if ( ((LA100_0 >= 76 && LA100_0 <= 77)||LA100_0==120) ) {
						alt100=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 100, 0, input);
						throw nvae;
					}

					switch (alt100) {
						case 1 :
							// JPA2.g:350:50: arithmetic_expression
							{
							pushFollow(FOLLOW_arithmetic_expression_in_comparison_expression3067);
							arithmetic_expression367=arithmetic_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression367.getTree());

							}
							break;
						case 2 :
							// JPA2.g:350:74: all_or_any_expression
							{
							pushFollow(FOLLOW_all_or_any_expression_in_comparison_expression3071);
							all_or_any_expression368=all_or_any_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, all_or_any_expression368.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparison_expression"


	public static class comparison_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison_operator"
	// JPA2.g:352:1: comparison_operator : ( '=' | '>' | '>=' | '<' | '<=' | '<>' );
	public final JPA2Parser.comparison_operator_return comparison_operator() throws RecognitionException {
		JPA2Parser.comparison_operator_return retval = new JPA2Parser.comparison_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set369=null;

		Object set369_tree=null;

		try {
			// JPA2.g:353:5: ( '=' | '>' | '>=' | '<' | '<=' | '<>' )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set369=input.LT(1);
			if ( (input.LA(1) >= 63 && input.LA(1) <= 68) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set369));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparison_operator"


	public static class arithmetic_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_expression"
	// JPA2.g:359:1: arithmetic_expression : ( arithmetic_term | arithmetic_term ( '+' | '-' ) arithmetic_term );
	public final JPA2Parser.arithmetic_expression_return arithmetic_expression() throws RecognitionException {
		JPA2Parser.arithmetic_expression_return retval = new JPA2Parser.arithmetic_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set372=null;
		ParserRuleReturnScope arithmetic_term370 =null;
		ParserRuleReturnScope arithmetic_term371 =null;
		ParserRuleReturnScope arithmetic_term373 =null;

		Object set372_tree=null;

		try {
			// JPA2.g:360:5: ( arithmetic_term | arithmetic_term ( '+' | '-' ) arithmetic_term )
			int alt102=2;
			switch ( input.LA(1) ) {
			case 57:
			case 59:
				{
				int LA102_1 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case WORD:
				{
				int LA102_2 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 62:
				{
				int LA102_3 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case INT_NUMERAL:
				{
				int LA102_4 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case LPAREN:
				{
				int LA102_5 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 69:
				{
				int LA102_6 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA102_7 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 55:
				{
				int LA102_8 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 102:
				{
				int LA102_9 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 104:
				{
				int LA102_10 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 75:
				{
				int LA102_11 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 121:
				{
				int LA102_12 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 107:
				{
				int LA102_13 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 119:
				{
				int LA102_14 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 98:
				{
				int LA102_15 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case COUNT:
				{
				int LA102_16 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA102_17 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 96:
				{
				int LA102_18 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 81:
				{
				int LA102_19 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 82:
				{
				int LA102_20 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			case 112:
				{
				int LA102_21 = input.LA(2);
				if ( (synpred163_JPA2()) ) {
					alt102=1;
				}
				else if ( (true) ) {
					alt102=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}
			switch (alt102) {
				case 1 :
					// JPA2.g:360:7: arithmetic_term
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_term_in_arithmetic_expression3135);
					arithmetic_term370=arithmetic_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_term370.getTree());

					}
					break;
				case 2 :
					// JPA2.g:361:7: arithmetic_term ( '+' | '-' ) arithmetic_term
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_term_in_arithmetic_expression3143);
					arithmetic_term371=arithmetic_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_term371.getTree());

					set372=input.LT(1);
					if ( input.LA(1)==57||input.LA(1)==59 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set372));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arithmetic_term_in_arithmetic_expression3153);
					arithmetic_term373=arithmetic_term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_term373.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_expression"


	public static class arithmetic_term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_term"
	// JPA2.g:362:1: arithmetic_term : ( arithmetic_factor | arithmetic_factor ( '*' | '/' ) arithmetic_factor );
	public final JPA2Parser.arithmetic_term_return arithmetic_term() throws RecognitionException {
		JPA2Parser.arithmetic_term_return retval = new JPA2Parser.arithmetic_term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set376=null;
		ParserRuleReturnScope arithmetic_factor374 =null;
		ParserRuleReturnScope arithmetic_factor375 =null;
		ParserRuleReturnScope arithmetic_factor377 =null;

		Object set376_tree=null;

		try {
			// JPA2.g:363:5: ( arithmetic_factor | arithmetic_factor ( '*' | '/' ) arithmetic_factor )
			int alt103=2;
			switch ( input.LA(1) ) {
			case 57:
			case 59:
				{
				int LA103_1 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case WORD:
				{
				int LA103_2 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 62:
				{
				int LA103_3 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case INT_NUMERAL:
				{
				int LA103_4 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case LPAREN:
				{
				int LA103_5 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 69:
				{
				int LA103_6 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA103_7 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 55:
				{
				int LA103_8 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 102:
				{
				int LA103_9 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 104:
				{
				int LA103_10 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 75:
				{
				int LA103_11 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 121:
				{
				int LA103_12 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 107:
				{
				int LA103_13 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 119:
				{
				int LA103_14 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 98:
				{
				int LA103_15 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case COUNT:
				{
				int LA103_16 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				{
				int LA103_17 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 96:
				{
				int LA103_18 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 81:
				{
				int LA103_19 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 82:
				{
				int LA103_20 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			case 112:
				{
				int LA103_21 = input.LA(2);
				if ( (synpred165_JPA2()) ) {
					alt103=1;
				}
				else if ( (true) ) {
					alt103=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}
			switch (alt103) {
				case 1 :
					// JPA2.g:363:7: arithmetic_factor
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_factor_in_arithmetic_term3164);
					arithmetic_factor374=arithmetic_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_factor374.getTree());

					}
					break;
				case 2 :
					// JPA2.g:364:7: arithmetic_factor ( '*' | '/' ) arithmetic_factor
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arithmetic_factor_in_arithmetic_term3172);
					arithmetic_factor375=arithmetic_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_factor375.getTree());

					set376=input.LT(1);
					if ( input.LA(1)==56||input.LA(1)==61 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set376));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arithmetic_factor_in_arithmetic_term3183);
					arithmetic_factor377=arithmetic_factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_factor377.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_term"


	public static class arithmetic_factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_factor"
	// JPA2.g:365:1: arithmetic_factor : ( ( '+' | '-' ) )? arithmetic_primary ;
	public final JPA2Parser.arithmetic_factor_return arithmetic_factor() throws RecognitionException {
		JPA2Parser.arithmetic_factor_return retval = new JPA2Parser.arithmetic_factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set378=null;
		ParserRuleReturnScope arithmetic_primary379 =null;

		Object set378_tree=null;

		try {
			// JPA2.g:366:5: ( ( ( '+' | '-' ) )? arithmetic_primary )
			// JPA2.g:366:7: ( ( '+' | '-' ) )? arithmetic_primary
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:366:7: ( ( '+' | '-' ) )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==57||LA104_0==59) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// JPA2.g:
					{
					set378=input.LT(1);
					if ( input.LA(1)==57||input.LA(1)==59 ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set378));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_arithmetic_primary_in_arithmetic_factor3206);
			arithmetic_primary379=arithmetic_primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_primary379.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_factor"


	public static class arithmetic_primary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmetic_primary"
	// JPA2.g:367:1: arithmetic_primary : ( path_expression | numeric_literal | '(' arithmetic_expression ')' | input_parameter | functions_returning_numerics | aggregate_expression | case_expression | function_invocation | subquery );
	public final JPA2Parser.arithmetic_primary_return arithmetic_primary() throws RecognitionException {
		JPA2Parser.arithmetic_primary_return retval = new JPA2Parser.arithmetic_primary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal382=null;
		Token char_literal384=null;
		ParserRuleReturnScope path_expression380 =null;
		ParserRuleReturnScope numeric_literal381 =null;
		ParserRuleReturnScope arithmetic_expression383 =null;
		ParserRuleReturnScope input_parameter385 =null;
		ParserRuleReturnScope functions_returning_numerics386 =null;
		ParserRuleReturnScope aggregate_expression387 =null;
		ParserRuleReturnScope case_expression388 =null;
		ParserRuleReturnScope function_invocation389 =null;
		ParserRuleReturnScope subquery390 =null;

		Object char_literal382_tree=null;
		Object char_literal384_tree=null;

		try {
			// JPA2.g:368:5: ( path_expression | numeric_literal | '(' arithmetic_expression ')' | input_parameter | functions_returning_numerics | aggregate_expression | case_expression | function_invocation | subquery )
			int alt105=9;
			switch ( input.LA(1) ) {
			case WORD:
				{
				alt105=1;
				}
				break;
			case INT_NUMERAL:
			case 62:
				{
				alt105=2;
				}
				break;
			case LPAREN:
				{
				int LA105_4 = input.LA(2);
				if ( (synpred171_JPA2()) ) {
					alt105=3;
				}
				else if ( (true) ) {
					alt105=9;
				}

				}
				break;
			case NAMED_PARAMETER:
			case 55:
			case 69:
				{
				alt105=4;
				}
				break;
			case 75:
			case 98:
			case 102:
			case 104:
			case 107:
			case 119:
			case 121:
				{
				alt105=5;
				}
				break;
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				{
				alt105=6;
				}
				break;
			case 96:
				{
				int LA105_17 = input.LA(2);
				if ( (synpred174_JPA2()) ) {
					alt105=6;
				}
				else if ( (synpred176_JPA2()) ) {
					alt105=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 81:
			case 82:
			case 112:
				{
				alt105=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}
			switch (alt105) {
				case 1 :
					// JPA2.g:368:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_arithmetic_primary3217);
					path_expression380=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression380.getTree());

					}
					break;
				case 2 :
					// JPA2.g:369:7: numeric_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_numeric_literal_in_arithmetic_primary3225);
					numeric_literal381=numeric_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_literal381.getTree());

					}
					break;
				case 3 :
					// JPA2.g:370:7: '(' arithmetic_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal382=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arithmetic_primary3233); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal382_tree = (Object)adaptor.create(char_literal382);
					adaptor.addChild(root_0, char_literal382_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_arithmetic_primary3234);
					arithmetic_expression383=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression383.getTree());

					char_literal384=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arithmetic_primary3235); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal384_tree = (Object)adaptor.create(char_literal384);
					adaptor.addChild(root_0, char_literal384_tree);
					}

					}
					break;
				case 4 :
					// JPA2.g:371:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_arithmetic_primary3243);
					input_parameter385=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter385.getTree());

					}
					break;
				case 5 :
					// JPA2.g:372:7: functions_returning_numerics
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functions_returning_numerics_in_arithmetic_primary3251);
					functions_returning_numerics386=functions_returning_numerics();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functions_returning_numerics386.getTree());

					}
					break;
				case 6 :
					// JPA2.g:373:7: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_arithmetic_primary3259);
					aggregate_expression387=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression387.getTree());

					}
					break;
				case 7 :
					// JPA2.g:374:7: case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_arithmetic_primary3267);
					case_expression388=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression388.getTree());

					}
					break;
				case 8 :
					// JPA2.g:375:7: function_invocation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_invocation_in_arithmetic_primary3275);
					function_invocation389=function_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_invocation389.getTree());

					}
					break;
				case 9 :
					// JPA2.g:376:7: subquery
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_subquery_in_arithmetic_primary3283);
					subquery390=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery390.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmetic_primary"


	public static class string_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "string_expression"
	// JPA2.g:377:1: string_expression : ( path_expression | string_literal | input_parameter | functions_returning_strings | aggregate_expression | case_expression | function_invocation | subquery );
	public final JPA2Parser.string_expression_return string_expression() throws RecognitionException {
		JPA2Parser.string_expression_return retval = new JPA2Parser.string_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression391 =null;
		ParserRuleReturnScope string_literal392 =null;
		ParserRuleReturnScope input_parameter393 =null;
		ParserRuleReturnScope functions_returning_strings394 =null;
		ParserRuleReturnScope aggregate_expression395 =null;
		ParserRuleReturnScope case_expression396 =null;
		ParserRuleReturnScope function_invocation397 =null;
		ParserRuleReturnScope subquery398 =null;


		try {
			// JPA2.g:378:5: ( path_expression | string_literal | input_parameter | functions_returning_strings | aggregate_expression | case_expression | function_invocation | subquery )
			int alt106=8;
			switch ( input.LA(1) ) {
			case WORD:
				{
				alt106=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt106=2;
				}
				break;
			case NAMED_PARAMETER:
			case 55:
			case 69:
				{
				alt106=3;
				}
				break;
			case LOWER:
			case 83:
			case 122:
			case 126:
			case 129:
				{
				alt106=4;
				}
				break;
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				{
				alt106=5;
				}
				break;
			case 96:
				{
				int LA106_13 = input.LA(2);
				if ( (synpred181_JPA2()) ) {
					alt106=5;
				}
				else if ( (synpred183_JPA2()) ) {
					alt106=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 106, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 81:
			case 82:
			case 112:
				{
				alt106=6;
				}
				break;
			case LPAREN:
				{
				alt106=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}
			switch (alt106) {
				case 1 :
					// JPA2.g:378:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_string_expression3294);
					path_expression391=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression391.getTree());

					}
					break;
				case 2 :
					// JPA2.g:379:7: string_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_string_literal_in_string_expression3302);
					string_literal392=string_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_literal392.getTree());

					}
					break;
				case 3 :
					// JPA2.g:380:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_string_expression3310);
					input_parameter393=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter393.getTree());

					}
					break;
				case 4 :
					// JPA2.g:381:7: functions_returning_strings
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functions_returning_strings_in_string_expression3318);
					functions_returning_strings394=functions_returning_strings();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functions_returning_strings394.getTree());

					}
					break;
				case 5 :
					// JPA2.g:382:7: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_string_expression3326);
					aggregate_expression395=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression395.getTree());

					}
					break;
				case 6 :
					// JPA2.g:383:7: case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_string_expression3334);
					case_expression396=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression396.getTree());

					}
					break;
				case 7 :
					// JPA2.g:384:7: function_invocation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_invocation_in_string_expression3342);
					function_invocation397=function_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_invocation397.getTree());

					}
					break;
				case 8 :
					// JPA2.g:385:7: subquery
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_subquery_in_string_expression3350);
					subquery398=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery398.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string_expression"


	public static class datetime_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "datetime_expression"
	// JPA2.g:386:1: datetime_expression : ( path_expression | input_parameter | functions_returning_datetime | aggregate_expression | case_expression | function_invocation | date_time_timestamp_literal | subquery );
	public final JPA2Parser.datetime_expression_return datetime_expression() throws RecognitionException {
		JPA2Parser.datetime_expression_return retval = new JPA2Parser.datetime_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression399 =null;
		ParserRuleReturnScope input_parameter400 =null;
		ParserRuleReturnScope functions_returning_datetime401 =null;
		ParserRuleReturnScope aggregate_expression402 =null;
		ParserRuleReturnScope case_expression403 =null;
		ParserRuleReturnScope function_invocation404 =null;
		ParserRuleReturnScope date_time_timestamp_literal405 =null;
		ParserRuleReturnScope subquery406 =null;


		try {
			// JPA2.g:387:5: ( path_expression | input_parameter | functions_returning_datetime | aggregate_expression | case_expression | function_invocation | date_time_timestamp_literal | subquery )
			int alt107=8;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA107_1 = input.LA(2);
				if ( (synpred184_JPA2()) ) {
					alt107=1;
				}
				else if ( (synpred190_JPA2()) ) {
					alt107=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 107, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
			case 55:
			case 69:
				{
				alt107=2;
				}
				break;
			case 84:
			case 85:
			case 86:
				{
				alt107=3;
				}
				break;
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				{
				alt107=4;
				}
				break;
			case 96:
				{
				int LA107_8 = input.LA(2);
				if ( (synpred187_JPA2()) ) {
					alt107=4;
				}
				else if ( (synpred189_JPA2()) ) {
					alt107=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 107, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 81:
			case 82:
			case 112:
				{
				alt107=5;
				}
				break;
			case LPAREN:
				{
				alt107=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// JPA2.g:387:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_datetime_expression3361);
					path_expression399=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression399.getTree());

					}
					break;
				case 2 :
					// JPA2.g:388:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_datetime_expression3369);
					input_parameter400=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter400.getTree());

					}
					break;
				case 3 :
					// JPA2.g:389:7: functions_returning_datetime
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functions_returning_datetime_in_datetime_expression3377);
					functions_returning_datetime401=functions_returning_datetime();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functions_returning_datetime401.getTree());

					}
					break;
				case 4 :
					// JPA2.g:390:7: aggregate_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_aggregate_expression_in_datetime_expression3385);
					aggregate_expression402=aggregate_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate_expression402.getTree());

					}
					break;
				case 5 :
					// JPA2.g:391:7: case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_datetime_expression3393);
					case_expression403=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression403.getTree());

					}
					break;
				case 6 :
					// JPA2.g:392:7: function_invocation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_invocation_in_datetime_expression3401);
					function_invocation404=function_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_invocation404.getTree());

					}
					break;
				case 7 :
					// JPA2.g:393:7: date_time_timestamp_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_time_timestamp_literal_in_datetime_expression3409);
					date_time_timestamp_literal405=date_time_timestamp_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date_time_timestamp_literal405.getTree());

					}
					break;
				case 8 :
					// JPA2.g:394:7: subquery
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_subquery_in_datetime_expression3417);
					subquery406=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery406.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "datetime_expression"


	public static class boolean_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_expression"
	// JPA2.g:395:1: boolean_expression : ( path_expression | boolean_literal | input_parameter | case_expression | function_invocation | subquery );
	public final JPA2Parser.boolean_expression_return boolean_expression() throws RecognitionException {
		JPA2Parser.boolean_expression_return retval = new JPA2Parser.boolean_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression407 =null;
		ParserRuleReturnScope boolean_literal408 =null;
		ParserRuleReturnScope input_parameter409 =null;
		ParserRuleReturnScope case_expression410 =null;
		ParserRuleReturnScope function_invocation411 =null;
		ParserRuleReturnScope subquery412 =null;


		try {
			// JPA2.g:396:5: ( path_expression | boolean_literal | input_parameter | case_expression | function_invocation | subquery )
			int alt108=6;
			switch ( input.LA(1) ) {
			case WORD:
				{
				alt108=1;
				}
				break;
			case 134:
			case 135:
				{
				alt108=2;
				}
				break;
			case NAMED_PARAMETER:
			case 55:
			case 69:
				{
				alt108=3;
				}
				break;
			case 81:
			case 82:
			case 112:
				{
				alt108=4;
				}
				break;
			case 96:
				{
				alt108=5;
				}
				break;
			case LPAREN:
				{
				alt108=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 108, 0, input);
				throw nvae;
			}
			switch (alt108) {
				case 1 :
					// JPA2.g:396:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_boolean_expression3428);
					path_expression407=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression407.getTree());

					}
					break;
				case 2 :
					// JPA2.g:397:7: boolean_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_boolean_literal_in_boolean_expression3436);
					boolean_literal408=boolean_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_literal408.getTree());

					}
					break;
				case 3 :
					// JPA2.g:398:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_boolean_expression3444);
					input_parameter409=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter409.getTree());

					}
					break;
				case 4 :
					// JPA2.g:399:7: case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_boolean_expression3452);
					case_expression410=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression410.getTree());

					}
					break;
				case 5 :
					// JPA2.g:400:7: function_invocation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_invocation_in_boolean_expression3460);
					function_invocation411=function_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_invocation411.getTree());

					}
					break;
				case 6 :
					// JPA2.g:401:7: subquery
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_subquery_in_boolean_expression3468);
					subquery412=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery412.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolean_expression"


	public static class enum_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enum_expression"
	// JPA2.g:402:1: enum_expression : ( path_expression | enum_literal | input_parameter | case_expression | subquery );
	public final JPA2Parser.enum_expression_return enum_expression() throws RecognitionException {
		JPA2Parser.enum_expression_return retval = new JPA2Parser.enum_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression413 =null;
		ParserRuleReturnScope enum_literal414 =null;
		ParserRuleReturnScope input_parameter415 =null;
		ParserRuleReturnScope case_expression416 =null;
		ParserRuleReturnScope subquery417 =null;


		try {
			// JPA2.g:403:5: ( path_expression | enum_literal | input_parameter | case_expression | subquery )
			int alt109=5;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA109_1 = input.LA(2);
				if ( (LA109_1==60) ) {
					alt109=1;
				}
				else if ( (LA109_1==EOF||LA109_1==AND||(LA109_1 >= GROUP && LA109_1 <= HAVING)||LA109_1==INNER||(LA109_1 >= JOIN && LA109_1 <= LEFT)||(LA109_1 >= OR && LA109_1 <= ORDER)||LA109_1==RPAREN||LA109_1==WORD||LA109_1==58||(LA109_1 >= 65 && LA109_1 <= 66)||LA109_1==78||LA109_1==89||LA109_1==91||LA109_1==95||LA109_1==123||(LA109_1 >= 131 && LA109_1 <= 132)) ) {
					alt109=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 109, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
			case 55:
			case 69:
				{
				alt109=3;
				}
				break;
			case 81:
			case 82:
			case 112:
				{
				alt109=4;
				}
				break;
			case LPAREN:
				{
				alt109=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}
			switch (alt109) {
				case 1 :
					// JPA2.g:403:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_enum_expression3479);
					path_expression413=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression413.getTree());

					}
					break;
				case 2 :
					// JPA2.g:404:7: enum_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_enum_literal_in_enum_expression3487);
					enum_literal414=enum_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enum_literal414.getTree());

					}
					break;
				case 3 :
					// JPA2.g:405:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_enum_expression3495);
					input_parameter415=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter415.getTree());

					}
					break;
				case 4 :
					// JPA2.g:406:7: case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_case_expression_in_enum_expression3503);
					case_expression416=case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, case_expression416.getTree());

					}
					break;
				case 5 :
					// JPA2.g:407:7: subquery
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_subquery_in_enum_expression3511);
					subquery417=subquery();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery417.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_expression"


	public static class entity_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entity_expression"
	// JPA2.g:408:1: entity_expression : ( path_expression | simple_entity_expression );
	public final JPA2Parser.entity_expression_return entity_expression() throws RecognitionException {
		JPA2Parser.entity_expression_return retval = new JPA2Parser.entity_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression418 =null;
		ParserRuleReturnScope simple_entity_expression419 =null;


		try {
			// JPA2.g:409:5: ( path_expression | simple_entity_expression )
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==WORD) ) {
				int LA110_1 = input.LA(2);
				if ( (LA110_1==60) ) {
					alt110=1;
				}
				else if ( (LA110_1==EOF||LA110_1==AND||(LA110_1 >= GROUP && LA110_1 <= HAVING)||LA110_1==INNER||(LA110_1 >= JOIN && LA110_1 <= LEFT)||(LA110_1 >= OR && LA110_1 <= ORDER)||LA110_1==RPAREN||LA110_1==58||(LA110_1 >= 65 && LA110_1 <= 66)||LA110_1==123||LA110_1==132) ) {
					alt110=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 110, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA110_0==NAMED_PARAMETER||LA110_0==55||LA110_0==69) ) {
				alt110=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}

			switch (alt110) {
				case 1 :
					// JPA2.g:409:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_entity_expression3522);
					path_expression418=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression418.getTree());

					}
					break;
				case 2 :
					// JPA2.g:410:7: simple_entity_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_entity_expression_in_entity_expression3530);
					simple_entity_expression419=simple_entity_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_entity_expression419.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "entity_expression"


	public static class simple_entity_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_entity_expression"
	// JPA2.g:411:1: simple_entity_expression : ( identification_variable | input_parameter );
	public final JPA2Parser.simple_entity_expression_return simple_entity_expression() throws RecognitionException {
		JPA2Parser.simple_entity_expression_return retval = new JPA2Parser.simple_entity_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope identification_variable420 =null;
		ParserRuleReturnScope input_parameter421 =null;


		try {
			// JPA2.g:412:5: ( identification_variable | input_parameter )
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==WORD) ) {
				alt111=1;
			}
			else if ( (LA111_0==NAMED_PARAMETER||LA111_0==55||LA111_0==69) ) {
				alt111=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}

			switch (alt111) {
				case 1 :
					// JPA2.g:412:7: identification_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identification_variable_in_simple_entity_expression3541);
					identification_variable420=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable420.getTree());

					}
					break;
				case 2 :
					// JPA2.g:413:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_simple_entity_expression3549);
					input_parameter421=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter421.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_entity_expression"


	public static class entity_type_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entity_type_expression"
	// JPA2.g:414:1: entity_type_expression : ( type_discriminator | entity_type_literal | input_parameter );
	public final JPA2Parser.entity_type_expression_return entity_type_expression() throws RecognitionException {
		JPA2Parser.entity_type_expression_return retval = new JPA2Parser.entity_type_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_discriminator422 =null;
		ParserRuleReturnScope entity_type_literal423 =null;
		ParserRuleReturnScope input_parameter424 =null;


		try {
			// JPA2.g:415:5: ( type_discriminator | entity_type_literal | input_parameter )
			int alt112=3;
			switch ( input.LA(1) ) {
			case 127:
				{
				alt112=1;
				}
				break;
			case WORD:
				{
				alt112=2;
				}
				break;
			case NAMED_PARAMETER:
			case 55:
			case 69:
				{
				alt112=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 112, 0, input);
				throw nvae;
			}
			switch (alt112) {
				case 1 :
					// JPA2.g:415:7: type_discriminator
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_discriminator_in_entity_type_expression3560);
					type_discriminator422=type_discriminator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type_discriminator422.getTree());

					}
					break;
				case 2 :
					// JPA2.g:416:7: entity_type_literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_entity_type_literal_in_entity_type_expression3568);
					entity_type_literal423=entity_type_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, entity_type_literal423.getTree());

					}
					break;
				case 3 :
					// JPA2.g:417:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_entity_type_expression3576);
					input_parameter424=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter424.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "entity_type_expression"


	public static class type_discriminator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_discriminator"
	// JPA2.g:418:1: type_discriminator : 'TYPE' ( general_identification_variable | path_expression | input_parameter ) ;
	public final JPA2Parser.type_discriminator_return type_discriminator() throws RecognitionException {
		JPA2Parser.type_discriminator_return retval = new JPA2Parser.type_discriminator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal425=null;
		ParserRuleReturnScope general_identification_variable426 =null;
		ParserRuleReturnScope path_expression427 =null;
		ParserRuleReturnScope input_parameter428 =null;

		Object string_literal425_tree=null;

		try {
			// JPA2.g:419:5: ( 'TYPE' ( general_identification_variable | path_expression | input_parameter ) )
			// JPA2.g:419:7: 'TYPE' ( general_identification_variable | path_expression | input_parameter )
			{
			root_0 = (Object)adaptor.nil();


			string_literal425=(Token)match(input,127,FOLLOW_127_in_type_discriminator3587); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal425_tree = (Object)adaptor.create(string_literal425);
			adaptor.addChild(root_0, string_literal425_tree);
			}

			// JPA2.g:419:13: ( general_identification_variable | path_expression | input_parameter )
			int alt113=3;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA113_1 = input.LA(2);
				if ( (LA113_1==EOF||LA113_1==AND||(LA113_1 >= GROUP && LA113_1 <= INNER)||(LA113_1 >= JOIN && LA113_1 <= LEFT)||(LA113_1 >= NOT && LA113_1 <= ORDER)||LA113_1==RPAREN||LA113_1==WORD||LA113_1==58||(LA113_1 >= 65 && LA113_1 <= 66)||LA113_1==78||LA113_1==89||LA113_1==91||LA113_1==95||LA113_1==123||(LA113_1 >= 131 && LA113_1 <= 132)) ) {
					alt113=1;
				}
				else if ( (LA113_1==60) ) {
					alt113=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 113, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 100:
			case 130:
				{
				alt113=1;
				}
				break;
			case NAMED_PARAMETER:
			case 55:
			case 69:
				{
				alt113=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 113, 0, input);
				throw nvae;
			}
			switch (alt113) {
				case 1 :
					// JPA2.g:419:14: general_identification_variable
					{
					pushFollow(FOLLOW_general_identification_variable_in_type_discriminator3589);
					general_identification_variable426=general_identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, general_identification_variable426.getTree());

					}
					break;
				case 2 :
					// JPA2.g:419:48: path_expression
					{
					pushFollow(FOLLOW_path_expression_in_type_discriminator3593);
					path_expression427=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression427.getTree());

					}
					break;
				case 3 :
					// JPA2.g:419:66: input_parameter
					{
					pushFollow(FOLLOW_input_parameter_in_type_discriminator3597);
					input_parameter428=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter428.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_discriminator"


	public static class functions_returning_numerics_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functions_returning_numerics"
	// JPA2.g:420:1: functions_returning_numerics : ( 'LENGTH(' string_expression ')' | 'LOCATE(' string_expression ',' string_expression ( ',' arithmetic_expression )? ')' | 'ABS(' arithmetic_expression ')' | 'SQRT(' arithmetic_expression ')' | 'MOD(' arithmetic_expression ',' arithmetic_expression ')' | 'SIZE(' path_expression ')' | 'INDEX(' identification_variable ')' );
	public final JPA2Parser.functions_returning_numerics_return functions_returning_numerics() throws RecognitionException {
		JPA2Parser.functions_returning_numerics_return retval = new JPA2Parser.functions_returning_numerics_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal429=null;
		Token char_literal431=null;
		Token string_literal432=null;
		Token char_literal434=null;
		Token char_literal436=null;
		Token char_literal438=null;
		Token string_literal439=null;
		Token char_literal441=null;
		Token string_literal442=null;
		Token char_literal444=null;
		Token string_literal445=null;
		Token char_literal447=null;
		Token char_literal449=null;
		Token string_literal450=null;
		Token char_literal452=null;
		Token string_literal453=null;
		Token char_literal455=null;
		ParserRuleReturnScope string_expression430 =null;
		ParserRuleReturnScope string_expression433 =null;
		ParserRuleReturnScope string_expression435 =null;
		ParserRuleReturnScope arithmetic_expression437 =null;
		ParserRuleReturnScope arithmetic_expression440 =null;
		ParserRuleReturnScope arithmetic_expression443 =null;
		ParserRuleReturnScope arithmetic_expression446 =null;
		ParserRuleReturnScope arithmetic_expression448 =null;
		ParserRuleReturnScope path_expression451 =null;
		ParserRuleReturnScope identification_variable454 =null;

		Object string_literal429_tree=null;
		Object char_literal431_tree=null;
		Object string_literal432_tree=null;
		Object char_literal434_tree=null;
		Object char_literal436_tree=null;
		Object char_literal438_tree=null;
		Object string_literal439_tree=null;
		Object char_literal441_tree=null;
		Object string_literal442_tree=null;
		Object char_literal444_tree=null;
		Object string_literal445_tree=null;
		Object char_literal447_tree=null;
		Object char_literal449_tree=null;
		Object string_literal450_tree=null;
		Object char_literal452_tree=null;
		Object string_literal453_tree=null;
		Object char_literal455_tree=null;

		try {
			// JPA2.g:421:5: ( 'LENGTH(' string_expression ')' | 'LOCATE(' string_expression ',' string_expression ( ',' arithmetic_expression )? ')' | 'ABS(' arithmetic_expression ')' | 'SQRT(' arithmetic_expression ')' | 'MOD(' arithmetic_expression ',' arithmetic_expression ')' | 'SIZE(' path_expression ')' | 'INDEX(' identification_variable ')' )
			int alt115=7;
			switch ( input.LA(1) ) {
			case 102:
				{
				alt115=1;
				}
				break;
			case 104:
				{
				alt115=2;
				}
				break;
			case 75:
				{
				alt115=3;
				}
				break;
			case 121:
				{
				alt115=4;
				}
				break;
			case 107:
				{
				alt115=5;
				}
				break;
			case 119:
				{
				alt115=6;
				}
				break;
			case 98:
				{
				alt115=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 115, 0, input);
				throw nvae;
			}
			switch (alt115) {
				case 1 :
					// JPA2.g:421:7: 'LENGTH(' string_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal429=(Token)match(input,102,FOLLOW_102_in_functions_returning_numerics3609); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal429_tree = (Object)adaptor.create(string_literal429);
					adaptor.addChild(root_0, string_literal429_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_numerics3610);
					string_expression430=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression430.getTree());

					char_literal431=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3611); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal431_tree = (Object)adaptor.create(char_literal431);
					adaptor.addChild(root_0, char_literal431_tree);
					}

					}
					break;
				case 2 :
					// JPA2.g:422:7: 'LOCATE(' string_expression ',' string_expression ( ',' arithmetic_expression )? ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal432=(Token)match(input,104,FOLLOW_104_in_functions_returning_numerics3619); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal432_tree = (Object)adaptor.create(string_literal432);
					adaptor.addChild(root_0, string_literal432_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_numerics3621);
					string_expression433=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression433.getTree());

					char_literal434=(Token)match(input,58,FOLLOW_58_in_functions_returning_numerics3622); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal434_tree = (Object)adaptor.create(char_literal434);
					adaptor.addChild(root_0, char_literal434_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_numerics3624);
					string_expression435=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression435.getTree());

					// JPA2.g:422:55: ( ',' arithmetic_expression )?
					int alt114=2;
					int LA114_0 = input.LA(1);
					if ( (LA114_0==58) ) {
						alt114=1;
					}
					switch (alt114) {
						case 1 :
							// JPA2.g:422:56: ',' arithmetic_expression
							{
							char_literal436=(Token)match(input,58,FOLLOW_58_in_functions_returning_numerics3626); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal436_tree = (Object)adaptor.create(char_literal436);
							adaptor.addChild(root_0, char_literal436_tree);
							}

							pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_numerics3627);
							arithmetic_expression437=arithmetic_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression437.getTree());

							}
							break;

					}

					char_literal438=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3630); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal438_tree = (Object)adaptor.create(char_literal438);
					adaptor.addChild(root_0, char_literal438_tree);
					}

					}
					break;
				case 3 :
					// JPA2.g:423:7: 'ABS(' arithmetic_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal439=(Token)match(input,75,FOLLOW_75_in_functions_returning_numerics3638); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal439_tree = (Object)adaptor.create(string_literal439);
					adaptor.addChild(root_0, string_literal439_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_numerics3639);
					arithmetic_expression440=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression440.getTree());

					char_literal441=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3640); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal441_tree = (Object)adaptor.create(char_literal441);
					adaptor.addChild(root_0, char_literal441_tree);
					}

					}
					break;
				case 4 :
					// JPA2.g:424:7: 'SQRT(' arithmetic_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal442=(Token)match(input,121,FOLLOW_121_in_functions_returning_numerics3648); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal442_tree = (Object)adaptor.create(string_literal442);
					adaptor.addChild(root_0, string_literal442_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_numerics3649);
					arithmetic_expression443=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression443.getTree());

					char_literal444=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3650); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal444_tree = (Object)adaptor.create(char_literal444);
					adaptor.addChild(root_0, char_literal444_tree);
					}

					}
					break;
				case 5 :
					// JPA2.g:425:7: 'MOD(' arithmetic_expression ',' arithmetic_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal445=(Token)match(input,107,FOLLOW_107_in_functions_returning_numerics3658); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal445_tree = (Object)adaptor.create(string_literal445);
					adaptor.addChild(root_0, string_literal445_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_numerics3659);
					arithmetic_expression446=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression446.getTree());

					char_literal447=(Token)match(input,58,FOLLOW_58_in_functions_returning_numerics3660); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal447_tree = (Object)adaptor.create(char_literal447);
					adaptor.addChild(root_0, char_literal447_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_numerics3662);
					arithmetic_expression448=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression448.getTree());

					char_literal449=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3663); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal449_tree = (Object)adaptor.create(char_literal449);
					adaptor.addChild(root_0, char_literal449_tree);
					}

					}
					break;
				case 6 :
					// JPA2.g:426:7: 'SIZE(' path_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal450=(Token)match(input,119,FOLLOW_119_in_functions_returning_numerics3671); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal450_tree = (Object)adaptor.create(string_literal450);
					adaptor.addChild(root_0, string_literal450_tree);
					}

					pushFollow(FOLLOW_path_expression_in_functions_returning_numerics3672);
					path_expression451=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression451.getTree());

					char_literal452=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3673); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal452_tree = (Object)adaptor.create(char_literal452);
					adaptor.addChild(root_0, char_literal452_tree);
					}

					}
					break;
				case 7 :
					// JPA2.g:427:7: 'INDEX(' identification_variable ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal453=(Token)match(input,98,FOLLOW_98_in_functions_returning_numerics3681); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal453_tree = (Object)adaptor.create(string_literal453);
					adaptor.addChild(root_0, string_literal453_tree);
					}

					pushFollow(FOLLOW_identification_variable_in_functions_returning_numerics3682);
					identification_variable454=identification_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identification_variable454.getTree());

					char_literal455=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_numerics3683); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal455_tree = (Object)adaptor.create(char_literal455);
					adaptor.addChild(root_0, char_literal455_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functions_returning_numerics"


	public static class functions_returning_datetime_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functions_returning_datetime"
	// JPA2.g:428:1: functions_returning_datetime : ( 'CURRENT_DATE' | 'CURRENT_TIME' | 'CURRENT_TIMESTAMP' );
	public final JPA2Parser.functions_returning_datetime_return functions_returning_datetime() throws RecognitionException {
		JPA2Parser.functions_returning_datetime_return retval = new JPA2Parser.functions_returning_datetime_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set456=null;

		Object set456_tree=null;

		try {
			// JPA2.g:429:5: ( 'CURRENT_DATE' | 'CURRENT_TIME' | 'CURRENT_TIMESTAMP' )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set456=input.LT(1);
			if ( (input.LA(1) >= 84 && input.LA(1) <= 86) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set456));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functions_returning_datetime"


	public static class functions_returning_strings_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functions_returning_strings"
	// JPA2.g:432:1: functions_returning_strings : ( 'CONCAT(' string_expression ',' string_expression ( ',' string_expression )* ')' | 'SUBSTRING(' string_expression ',' arithmetic_expression ( ',' arithmetic_expression )? ')' | 'TRIM(' ( ( trim_specification )? ( trim_character )? 'FROM' )? string_expression ')' | 'LOWER' '(' string_expression ')' | 'UPPER(' string_expression ')' );
	public final JPA2Parser.functions_returning_strings_return functions_returning_strings() throws RecognitionException {
		JPA2Parser.functions_returning_strings_return retval = new JPA2Parser.functions_returning_strings_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal457=null;
		Token char_literal459=null;
		Token char_literal461=null;
		Token char_literal463=null;
		Token string_literal464=null;
		Token char_literal466=null;
		Token char_literal468=null;
		Token char_literal470=null;
		Token string_literal471=null;
		Token string_literal474=null;
		Token char_literal476=null;
		Token string_literal477=null;
		Token char_literal478=null;
		Token char_literal480=null;
		Token string_literal481=null;
		Token char_literal483=null;
		ParserRuleReturnScope string_expression458 =null;
		ParserRuleReturnScope string_expression460 =null;
		ParserRuleReturnScope string_expression462 =null;
		ParserRuleReturnScope string_expression465 =null;
		ParserRuleReturnScope arithmetic_expression467 =null;
		ParserRuleReturnScope arithmetic_expression469 =null;
		ParserRuleReturnScope trim_specification472 =null;
		ParserRuleReturnScope trim_character473 =null;
		ParserRuleReturnScope string_expression475 =null;
		ParserRuleReturnScope string_expression479 =null;
		ParserRuleReturnScope string_expression482 =null;

		Object string_literal457_tree=null;
		Object char_literal459_tree=null;
		Object char_literal461_tree=null;
		Object char_literal463_tree=null;
		Object string_literal464_tree=null;
		Object char_literal466_tree=null;
		Object char_literal468_tree=null;
		Object char_literal470_tree=null;
		Object string_literal471_tree=null;
		Object string_literal474_tree=null;
		Object char_literal476_tree=null;
		Object string_literal477_tree=null;
		Object char_literal478_tree=null;
		Object char_literal480_tree=null;
		Object string_literal481_tree=null;
		Object char_literal483_tree=null;

		try {
			// JPA2.g:433:5: ( 'CONCAT(' string_expression ',' string_expression ( ',' string_expression )* ')' | 'SUBSTRING(' string_expression ',' arithmetic_expression ( ',' arithmetic_expression )? ')' | 'TRIM(' ( ( trim_specification )? ( trim_character )? 'FROM' )? string_expression ')' | 'LOWER' '(' string_expression ')' | 'UPPER(' string_expression ')' )
			int alt121=5;
			switch ( input.LA(1) ) {
			case 83:
				{
				alt121=1;
				}
				break;
			case 122:
				{
				alt121=2;
				}
				break;
			case 126:
				{
				alt121=3;
				}
				break;
			case LOWER:
				{
				alt121=4;
				}
				break;
			case 129:
				{
				alt121=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 121, 0, input);
				throw nvae;
			}
			switch (alt121) {
				case 1 :
					// JPA2.g:433:7: 'CONCAT(' string_expression ',' string_expression ( ',' string_expression )* ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal457=(Token)match(input,83,FOLLOW_83_in_functions_returning_strings3721); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal457_tree = (Object)adaptor.create(string_literal457);
					adaptor.addChild(root_0, string_literal457_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_strings3722);
					string_expression458=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression458.getTree());

					char_literal459=(Token)match(input,58,FOLLOW_58_in_functions_returning_strings3723); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal459_tree = (Object)adaptor.create(char_literal459);
					adaptor.addChild(root_0, char_literal459_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_strings3725);
					string_expression460=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression460.getTree());

					// JPA2.g:433:55: ( ',' string_expression )*
					loop116:
					while (true) {
						int alt116=2;
						int LA116_0 = input.LA(1);
						if ( (LA116_0==58) ) {
							alt116=1;
						}

						switch (alt116) {
						case 1 :
							// JPA2.g:433:56: ',' string_expression
							{
							char_literal461=(Token)match(input,58,FOLLOW_58_in_functions_returning_strings3728); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal461_tree = (Object)adaptor.create(char_literal461);
							adaptor.addChild(root_0, char_literal461_tree);
							}

							pushFollow(FOLLOW_string_expression_in_functions_returning_strings3730);
							string_expression462=string_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression462.getTree());

							}
							break;

						default :
							break loop116;
						}
					}

					char_literal463=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_strings3733); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal463_tree = (Object)adaptor.create(char_literal463);
					adaptor.addChild(root_0, char_literal463_tree);
					}

					}
					break;
				case 2 :
					// JPA2.g:434:7: 'SUBSTRING(' string_expression ',' arithmetic_expression ( ',' arithmetic_expression )? ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal464=(Token)match(input,122,FOLLOW_122_in_functions_returning_strings3741); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal464_tree = (Object)adaptor.create(string_literal464);
					adaptor.addChild(root_0, string_literal464_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_strings3743);
					string_expression465=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression465.getTree());

					char_literal466=(Token)match(input,58,FOLLOW_58_in_functions_returning_strings3744); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal466_tree = (Object)adaptor.create(char_literal466);
					adaptor.addChild(root_0, char_literal466_tree);
					}

					pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_strings3746);
					arithmetic_expression467=arithmetic_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression467.getTree());

					// JPA2.g:434:63: ( ',' arithmetic_expression )?
					int alt117=2;
					int LA117_0 = input.LA(1);
					if ( (LA117_0==58) ) {
						alt117=1;
					}
					switch (alt117) {
						case 1 :
							// JPA2.g:434:64: ',' arithmetic_expression
							{
							char_literal468=(Token)match(input,58,FOLLOW_58_in_functions_returning_strings3749); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal468_tree = (Object)adaptor.create(char_literal468);
							adaptor.addChild(root_0, char_literal468_tree);
							}

							pushFollow(FOLLOW_arithmetic_expression_in_functions_returning_strings3751);
							arithmetic_expression469=arithmetic_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic_expression469.getTree());

							}
							break;

					}

					char_literal470=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_strings3754); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal470_tree = (Object)adaptor.create(char_literal470);
					adaptor.addChild(root_0, char_literal470_tree);
					}

					}
					break;
				case 3 :
					// JPA2.g:435:7: 'TRIM(' ( ( trim_specification )? ( trim_character )? 'FROM' )? string_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal471=(Token)match(input,126,FOLLOW_126_in_functions_returning_strings3762); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal471_tree = (Object)adaptor.create(string_literal471);
					adaptor.addChild(root_0, string_literal471_tree);
					}

					// JPA2.g:435:14: ( ( trim_specification )? ( trim_character )? 'FROM' )?
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( (LA120_0==TRIM_CHARACTER||LA120_0==80||LA120_0==95||LA120_0==101||LA120_0==124) ) {
						alt120=1;
					}
					switch (alt120) {
						case 1 :
							// JPA2.g:435:15: ( trim_specification )? ( trim_character )? 'FROM'
							{
							// JPA2.g:435:15: ( trim_specification )?
							int alt118=2;
							int LA118_0 = input.LA(1);
							if ( (LA118_0==80||LA118_0==101||LA118_0==124) ) {
								alt118=1;
							}
							switch (alt118) {
								case 1 :
									// JPA2.g:435:16: trim_specification
									{
									pushFollow(FOLLOW_trim_specification_in_functions_returning_strings3765);
									trim_specification472=trim_specification();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, trim_specification472.getTree());

									}
									break;

							}

							// JPA2.g:435:37: ( trim_character )?
							int alt119=2;
							int LA119_0 = input.LA(1);
							if ( (LA119_0==TRIM_CHARACTER) ) {
								alt119=1;
							}
							switch (alt119) {
								case 1 :
									// JPA2.g:435:38: trim_character
									{
									pushFollow(FOLLOW_trim_character_in_functions_returning_strings3770);
									trim_character473=trim_character();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, trim_character473.getTree());

									}
									break;

							}

							string_literal474=(Token)match(input,95,FOLLOW_95_in_functions_returning_strings3774); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal474_tree = (Object)adaptor.create(string_literal474);
							adaptor.addChild(root_0, string_literal474_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_strings3778);
					string_expression475=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression475.getTree());

					char_literal476=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_strings3780); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal476_tree = (Object)adaptor.create(char_literal476);
					adaptor.addChild(root_0, char_literal476_tree);
					}

					}
					break;
				case 4 :
					// JPA2.g:436:7: 'LOWER' '(' string_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal477=(Token)match(input,LOWER,FOLLOW_LOWER_in_functions_returning_strings3788); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal477_tree = (Object)adaptor.create(string_literal477);
					adaptor.addChild(root_0, string_literal477_tree);
					}

					char_literal478=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functions_returning_strings3790); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal478_tree = (Object)adaptor.create(char_literal478);
					adaptor.addChild(root_0, char_literal478_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_strings3791);
					string_expression479=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression479.getTree());

					char_literal480=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_strings3792); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal480_tree = (Object)adaptor.create(char_literal480);
					adaptor.addChild(root_0, char_literal480_tree);
					}

					}
					break;
				case 5 :
					// JPA2.g:437:7: 'UPPER(' string_expression ')'
					{
					root_0 = (Object)adaptor.nil();


					string_literal481=(Token)match(input,129,FOLLOW_129_in_functions_returning_strings3800); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal481_tree = (Object)adaptor.create(string_literal481);
					adaptor.addChild(root_0, string_literal481_tree);
					}

					pushFollow(FOLLOW_string_expression_in_functions_returning_strings3801);
					string_expression482=string_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string_expression482.getTree());

					char_literal483=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functions_returning_strings3802); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal483_tree = (Object)adaptor.create(char_literal483);
					adaptor.addChild(root_0, char_literal483_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functions_returning_strings"


	public static class trim_specification_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "trim_specification"
	// JPA2.g:438:1: trim_specification : ( 'LEADING' | 'TRAILING' | 'BOTH' );
	public final JPA2Parser.trim_specification_return trim_specification() throws RecognitionException {
		JPA2Parser.trim_specification_return retval = new JPA2Parser.trim_specification_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set484=null;

		Object set484_tree=null;

		try {
			// JPA2.g:439:5: ( 'LEADING' | 'TRAILING' | 'BOTH' )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set484=input.LT(1);
			if ( input.LA(1)==80||input.LA(1)==101||input.LA(1)==124 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set484));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trim_specification"


	public static class function_invocation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_invocation"
	// JPA2.g:440:1: function_invocation : 'FUNCTION(' function_name ( ',' function_arg )* ')' ;
	public final JPA2Parser.function_invocation_return function_invocation() throws RecognitionException {
		JPA2Parser.function_invocation_return retval = new JPA2Parser.function_invocation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal485=null;
		Token char_literal487=null;
		Token char_literal489=null;
		ParserRuleReturnScope function_name486 =null;
		ParserRuleReturnScope function_arg488 =null;

		Object string_literal485_tree=null;
		Object char_literal487_tree=null;
		Object char_literal489_tree=null;

		try {
			// JPA2.g:441:5: ( 'FUNCTION(' function_name ( ',' function_arg )* ')' )
			// JPA2.g:441:7: 'FUNCTION(' function_name ( ',' function_arg )* ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal485=(Token)match(input,96,FOLLOW_96_in_function_invocation3832); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal485_tree = (Object)adaptor.create(string_literal485);
			adaptor.addChild(root_0, string_literal485_tree);
			}

			pushFollow(FOLLOW_function_name_in_function_invocation3833);
			function_name486=function_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name486.getTree());

			// JPA2.g:441:32: ( ',' function_arg )*
			loop122:
			while (true) {
				int alt122=2;
				int LA122_0 = input.LA(1);
				if ( (LA122_0==58) ) {
					alt122=1;
				}

				switch (alt122) {
				case 1 :
					// JPA2.g:441:33: ',' function_arg
					{
					char_literal487=(Token)match(input,58,FOLLOW_58_in_function_invocation3836); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal487_tree = (Object)adaptor.create(char_literal487);
					adaptor.addChild(root_0, char_literal487_tree);
					}

					pushFollow(FOLLOW_function_arg_in_function_invocation3838);
					function_arg488=function_arg();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_arg488.getTree());

					}
					break;

				default :
					break loop122;
				}
			}

			char_literal489=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function_invocation3842); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal489_tree = (Object)adaptor.create(char_literal489);
			adaptor.addChild(root_0, char_literal489_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_invocation"


	public static class function_arg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_arg"
	// JPA2.g:442:1: function_arg : ( literal | path_expression | input_parameter | scalar_expression );
	public final JPA2Parser.function_arg_return function_arg() throws RecognitionException {
		JPA2Parser.function_arg_return retval = new JPA2Parser.function_arg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope literal490 =null;
		ParserRuleReturnScope path_expression491 =null;
		ParserRuleReturnScope input_parameter492 =null;
		ParserRuleReturnScope scalar_expression493 =null;


		try {
			// JPA2.g:443:5: ( literal | path_expression | input_parameter | scalar_expression )
			int alt123=4;
			switch ( input.LA(1) ) {
			case WORD:
				{
				int LA123_1 = input.LA(2);
				if ( (LA123_1==60) ) {
					alt123=2;
				}
				else if ( (synpred227_JPA2()) ) {
					alt123=1;
				}
				else if ( (true) ) {
					alt123=4;
				}

				}
				break;
			case 69:
				{
				int LA123_2 = input.LA(2);
				if ( (LA123_2==62) ) {
					int LA123_8 = input.LA(3);
					if ( (LA123_8==INT_NUMERAL) ) {
						int LA123_12 = input.LA(4);
						if ( (synpred229_JPA2()) ) {
							alt123=3;
						}
						else if ( (true) ) {
							alt123=4;
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
								new NoViableAltException("", 123, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA123_2==INT_NUMERAL) ) {
					int LA123_9 = input.LA(3);
					if ( (synpred229_JPA2()) ) {
						alt123=3;
					}
					else if ( (true) ) {
						alt123=4;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 123, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NAMED_PARAMETER:
				{
				int LA123_3 = input.LA(2);
				if ( (synpred229_JPA2()) ) {
					alt123=3;
				}
				else if ( (true) ) {
					alt123=4;
				}

				}
				break;
			case 55:
				{
				int LA123_4 = input.LA(2);
				if ( (LA123_4==WORD) ) {
					int LA123_11 = input.LA(3);
					if ( (LA123_11==136) ) {
						int LA123_13 = input.LA(4);
						if ( (synpred229_JPA2()) ) {
							alt123=3;
						}
						else if ( (true) ) {
							alt123=4;
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
								new NoViableAltException("", 123, 11, input);
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
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 123, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case COUNT:
			case INT_NUMERAL:
			case LOWER:
			case LPAREN:
			case MAX:
			case MIN:
			case STRING_LITERAL:
			case SUM:
			case 57:
			case 59:
			case 62:
			case 75:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 96:
			case 98:
			case 102:
			case 104:
			case 107:
			case 112:
			case 119:
			case 121:
			case 122:
			case 126:
			case 127:
			case 129:
			case 134:
			case 135:
				{
				alt123=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}
			switch (alt123) {
				case 1 :
					// JPA2.g:443:7: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_function_arg3853);
					literal490=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal490.getTree());

					}
					break;
				case 2 :
					// JPA2.g:444:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_function_arg3861);
					path_expression491=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression491.getTree());

					}
					break;
				case 3 :
					// JPA2.g:445:7: input_parameter
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_input_parameter_in_function_arg3869);
					input_parameter492=input_parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter492.getTree());

					}
					break;
				case 4 :
					// JPA2.g:446:7: scalar_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_scalar_expression_in_function_arg3877);
					scalar_expression493=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression493.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_arg"


	public static class case_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "case_expression"
	// JPA2.g:447:1: case_expression : ( general_case_expression | simple_case_expression | coalesce_expression | nullif_expression );
	public final JPA2Parser.case_expression_return case_expression() throws RecognitionException {
		JPA2Parser.case_expression_return retval = new JPA2Parser.case_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope general_case_expression494 =null;
		ParserRuleReturnScope simple_case_expression495 =null;
		ParserRuleReturnScope coalesce_expression496 =null;
		ParserRuleReturnScope nullif_expression497 =null;


		try {
			// JPA2.g:448:5: ( general_case_expression | simple_case_expression | coalesce_expression | nullif_expression )
			int alt124=4;
			switch ( input.LA(1) ) {
			case 81:
				{
				int LA124_1 = input.LA(2);
				if ( (LA124_1==131) ) {
					alt124=1;
				}
				else if ( (LA124_1==WORD||LA124_1==127) ) {
					alt124=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 124, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 82:
				{
				alt124=3;
				}
				break;
			case 112:
				{
				alt124=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}
			switch (alt124) {
				case 1 :
					// JPA2.g:448:7: general_case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_general_case_expression_in_case_expression3888);
					general_case_expression494=general_case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, general_case_expression494.getTree());

					}
					break;
				case 2 :
					// JPA2.g:449:7: simple_case_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_case_expression_in_case_expression3896);
					simple_case_expression495=simple_case_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_case_expression495.getTree());

					}
					break;
				case 3 :
					// JPA2.g:450:7: coalesce_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_coalesce_expression_in_case_expression3904);
					coalesce_expression496=coalesce_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, coalesce_expression496.getTree());

					}
					break;
				case 4 :
					// JPA2.g:451:7: nullif_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nullif_expression_in_case_expression3912);
					nullif_expression497=nullif_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nullif_expression497.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "case_expression"


	public static class general_case_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "general_case_expression"
	// JPA2.g:452:1: general_case_expression : 'CASE' when_clause ( when_clause )* 'ELSE' scalar_expression 'END' ;
	public final JPA2Parser.general_case_expression_return general_case_expression() throws RecognitionException {
		JPA2Parser.general_case_expression_return retval = new JPA2Parser.general_case_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal498=null;
		Token string_literal501=null;
		Token string_literal503=null;
		ParserRuleReturnScope when_clause499 =null;
		ParserRuleReturnScope when_clause500 =null;
		ParserRuleReturnScope scalar_expression502 =null;

		Object string_literal498_tree=null;
		Object string_literal501_tree=null;
		Object string_literal503_tree=null;

		try {
			// JPA2.g:453:5: ( 'CASE' when_clause ( when_clause )* 'ELSE' scalar_expression 'END' )
			// JPA2.g:453:7: 'CASE' when_clause ( when_clause )* 'ELSE' scalar_expression 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal498=(Token)match(input,81,FOLLOW_81_in_general_case_expression3923); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal498_tree = (Object)adaptor.create(string_literal498);
			adaptor.addChild(root_0, string_literal498_tree);
			}

			pushFollow(FOLLOW_when_clause_in_general_case_expression3925);
			when_clause499=when_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, when_clause499.getTree());

			// JPA2.g:453:26: ( when_clause )*
			loop125:
			while (true) {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==131) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// JPA2.g:453:27: when_clause
					{
					pushFollow(FOLLOW_when_clause_in_general_case_expression3928);
					when_clause500=when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, when_clause500.getTree());

					}
					break;

				default :
					break loop125;
				}
			}

			string_literal501=(Token)match(input,89,FOLLOW_89_in_general_case_expression3932); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal501_tree = (Object)adaptor.create(string_literal501);
			adaptor.addChild(root_0, string_literal501_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_general_case_expression3934);
			scalar_expression502=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression502.getTree());

			string_literal503=(Token)match(input,91,FOLLOW_91_in_general_case_expression3936); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal503_tree = (Object)adaptor.create(string_literal503);
			adaptor.addChild(root_0, string_literal503_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "general_case_expression"


	public static class when_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "when_clause"
	// JPA2.g:454:1: when_clause : 'WHEN' conditional_expression 'THEN' scalar_expression ;
	public final JPA2Parser.when_clause_return when_clause() throws RecognitionException {
		JPA2Parser.when_clause_return retval = new JPA2Parser.when_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal504=null;
		Token string_literal506=null;
		ParserRuleReturnScope conditional_expression505 =null;
		ParserRuleReturnScope scalar_expression507 =null;

		Object string_literal504_tree=null;
		Object string_literal506_tree=null;

		try {
			// JPA2.g:455:5: ( 'WHEN' conditional_expression 'THEN' scalar_expression )
			// JPA2.g:455:7: 'WHEN' conditional_expression 'THEN' scalar_expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal504=(Token)match(input,131,FOLLOW_131_in_when_clause3947); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal504_tree = (Object)adaptor.create(string_literal504);
			adaptor.addChild(root_0, string_literal504_tree);
			}

			pushFollow(FOLLOW_conditional_expression_in_when_clause3949);
			conditional_expression505=conditional_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression505.getTree());

			string_literal506=(Token)match(input,123,FOLLOW_123_in_when_clause3951); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal506_tree = (Object)adaptor.create(string_literal506);
			adaptor.addChild(root_0, string_literal506_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_when_clause3953);
			scalar_expression507=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression507.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "when_clause"


	public static class simple_case_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_case_expression"
	// JPA2.g:456:1: simple_case_expression : 'CASE' case_operand simple_when_clause ( simple_when_clause )* 'ELSE' scalar_expression 'END' ;
	public final JPA2Parser.simple_case_expression_return simple_case_expression() throws RecognitionException {
		JPA2Parser.simple_case_expression_return retval = new JPA2Parser.simple_case_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal508=null;
		Token string_literal512=null;
		Token string_literal514=null;
		ParserRuleReturnScope case_operand509 =null;
		ParserRuleReturnScope simple_when_clause510 =null;
		ParserRuleReturnScope simple_when_clause511 =null;
		ParserRuleReturnScope scalar_expression513 =null;

		Object string_literal508_tree=null;
		Object string_literal512_tree=null;
		Object string_literal514_tree=null;

		try {
			// JPA2.g:457:5: ( 'CASE' case_operand simple_when_clause ( simple_when_clause )* 'ELSE' scalar_expression 'END' )
			// JPA2.g:457:7: 'CASE' case_operand simple_when_clause ( simple_when_clause )* 'ELSE' scalar_expression 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal508=(Token)match(input,81,FOLLOW_81_in_simple_case_expression3964); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal508_tree = (Object)adaptor.create(string_literal508);
			adaptor.addChild(root_0, string_literal508_tree);
			}

			pushFollow(FOLLOW_case_operand_in_simple_case_expression3966);
			case_operand509=case_operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, case_operand509.getTree());

			pushFollow(FOLLOW_simple_when_clause_in_simple_case_expression3968);
			simple_when_clause510=simple_when_clause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_when_clause510.getTree());

			// JPA2.g:457:46: ( simple_when_clause )*
			loop126:
			while (true) {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==131) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// JPA2.g:457:47: simple_when_clause
					{
					pushFollow(FOLLOW_simple_when_clause_in_simple_case_expression3971);
					simple_when_clause511=simple_when_clause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_when_clause511.getTree());

					}
					break;

				default :
					break loop126;
				}
			}

			string_literal512=(Token)match(input,89,FOLLOW_89_in_simple_case_expression3975); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal512_tree = (Object)adaptor.create(string_literal512);
			adaptor.addChild(root_0, string_literal512_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_simple_case_expression3977);
			scalar_expression513=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression513.getTree());

			string_literal514=(Token)match(input,91,FOLLOW_91_in_simple_case_expression3979); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal514_tree = (Object)adaptor.create(string_literal514);
			adaptor.addChild(root_0, string_literal514_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_case_expression"


	public static class case_operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "case_operand"
	// JPA2.g:458:1: case_operand : ( path_expression | type_discriminator );
	public final JPA2Parser.case_operand_return case_operand() throws RecognitionException {
		JPA2Parser.case_operand_return retval = new JPA2Parser.case_operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path_expression515 =null;
		ParserRuleReturnScope type_discriminator516 =null;


		try {
			// JPA2.g:459:5: ( path_expression | type_discriminator )
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==WORD) ) {
				alt127=1;
			}
			else if ( (LA127_0==127) ) {
				alt127=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}

			switch (alt127) {
				case 1 :
					// JPA2.g:459:7: path_expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_expression_in_case_operand3990);
					path_expression515=path_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, path_expression515.getTree());

					}
					break;
				case 2 :
					// JPA2.g:460:7: type_discriminator
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_discriminator_in_case_operand3998);
					type_discriminator516=type_discriminator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type_discriminator516.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "case_operand"


	public static class simple_when_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_when_clause"
	// JPA2.g:461:1: simple_when_clause : 'WHEN' scalar_expression 'THEN' scalar_expression ;
	public final JPA2Parser.simple_when_clause_return simple_when_clause() throws RecognitionException {
		JPA2Parser.simple_when_clause_return retval = new JPA2Parser.simple_when_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal517=null;
		Token string_literal519=null;
		ParserRuleReturnScope scalar_expression518 =null;
		ParserRuleReturnScope scalar_expression520 =null;

		Object string_literal517_tree=null;
		Object string_literal519_tree=null;

		try {
			// JPA2.g:462:5: ( 'WHEN' scalar_expression 'THEN' scalar_expression )
			// JPA2.g:462:7: 'WHEN' scalar_expression 'THEN' scalar_expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal517=(Token)match(input,131,FOLLOW_131_in_simple_when_clause4009); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal517_tree = (Object)adaptor.create(string_literal517);
			adaptor.addChild(root_0, string_literal517_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_simple_when_clause4011);
			scalar_expression518=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression518.getTree());

			string_literal519=(Token)match(input,123,FOLLOW_123_in_simple_when_clause4013); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal519_tree = (Object)adaptor.create(string_literal519);
			adaptor.addChild(root_0, string_literal519_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_simple_when_clause4015);
			scalar_expression520=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression520.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_when_clause"


	public static class coalesce_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "coalesce_expression"
	// JPA2.g:463:1: coalesce_expression : 'COALESCE(' scalar_expression ( ',' scalar_expression )+ ')' ;
	public final JPA2Parser.coalesce_expression_return coalesce_expression() throws RecognitionException {
		JPA2Parser.coalesce_expression_return retval = new JPA2Parser.coalesce_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal521=null;
		Token char_literal523=null;
		Token char_literal525=null;
		ParserRuleReturnScope scalar_expression522 =null;
		ParserRuleReturnScope scalar_expression524 =null;

		Object string_literal521_tree=null;
		Object char_literal523_tree=null;
		Object char_literal525_tree=null;

		try {
			// JPA2.g:464:5: ( 'COALESCE(' scalar_expression ( ',' scalar_expression )+ ')' )
			// JPA2.g:464:7: 'COALESCE(' scalar_expression ( ',' scalar_expression )+ ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal521=(Token)match(input,82,FOLLOW_82_in_coalesce_expression4026); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal521_tree = (Object)adaptor.create(string_literal521);
			adaptor.addChild(root_0, string_literal521_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_coalesce_expression4027);
			scalar_expression522=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression522.getTree());

			// JPA2.g:464:36: ( ',' scalar_expression )+
			int cnt128=0;
			loop128:
			while (true) {
				int alt128=2;
				int LA128_0 = input.LA(1);
				if ( (LA128_0==58) ) {
					alt128=1;
				}

				switch (alt128) {
				case 1 :
					// JPA2.g:464:37: ',' scalar_expression
					{
					char_literal523=(Token)match(input,58,FOLLOW_58_in_coalesce_expression4030); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal523_tree = (Object)adaptor.create(char_literal523);
					adaptor.addChild(root_0, char_literal523_tree);
					}

					pushFollow(FOLLOW_scalar_expression_in_coalesce_expression4032);
					scalar_expression524=scalar_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression524.getTree());

					}
					break;

				default :
					if ( cnt128 >= 1 ) break loop128;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(128, input);
					throw eee;
				}
				cnt128++;
			}

			char_literal525=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_coalesce_expression4035); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal525_tree = (Object)adaptor.create(char_literal525);
			adaptor.addChild(root_0, char_literal525_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "coalesce_expression"


	public static class nullif_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nullif_expression"
	// JPA2.g:465:1: nullif_expression : 'NULLIF(' scalar_expression ',' scalar_expression ')' ;
	public final JPA2Parser.nullif_expression_return nullif_expression() throws RecognitionException {
		JPA2Parser.nullif_expression_return retval = new JPA2Parser.nullif_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal526=null;
		Token char_literal528=null;
		Token char_literal530=null;
		ParserRuleReturnScope scalar_expression527 =null;
		ParserRuleReturnScope scalar_expression529 =null;

		Object string_literal526_tree=null;
		Object char_literal528_tree=null;
		Object char_literal530_tree=null;

		try {
			// JPA2.g:466:5: ( 'NULLIF(' scalar_expression ',' scalar_expression ')' )
			// JPA2.g:466:7: 'NULLIF(' scalar_expression ',' scalar_expression ')'
			{
			root_0 = (Object)adaptor.nil();


			string_literal526=(Token)match(input,112,FOLLOW_112_in_nullif_expression4046); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal526_tree = (Object)adaptor.create(string_literal526);
			adaptor.addChild(root_0, string_literal526_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_nullif_expression4047);
			scalar_expression527=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression527.getTree());

			char_literal528=(Token)match(input,58,FOLLOW_58_in_nullif_expression4049); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal528_tree = (Object)adaptor.create(char_literal528);
			adaptor.addChild(root_0, char_literal528_tree);
			}

			pushFollow(FOLLOW_scalar_expression_in_nullif_expression4051);
			scalar_expression529=scalar_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar_expression529.getTree());

			char_literal530=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_nullif_expression4052); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal530_tree = (Object)adaptor.create(char_literal530);
			adaptor.addChild(root_0, char_literal530_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nullif_expression"


	public static class input_parameter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input_parameter"
	// JPA2.g:469:1: input_parameter : ( '?' numeric_literal -> ^( T_PARAMETER[] '?' numeric_literal ) | NAMED_PARAMETER -> ^( T_PARAMETER[] NAMED_PARAMETER ) | '${' WORD '}' -> ^( T_PARAMETER[] '${' WORD '}' ) );
	public final JPA2Parser.input_parameter_return input_parameter() throws RecognitionException {
		JPA2Parser.input_parameter_return retval = new JPA2Parser.input_parameter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal531=null;
		Token NAMED_PARAMETER533=null;
		Token string_literal534=null;
		Token WORD535=null;
		Token char_literal536=null;
		ParserRuleReturnScope numeric_literal532 =null;

		Object char_literal531_tree=null;
		Object NAMED_PARAMETER533_tree=null;
		Object string_literal534_tree=null;
		Object WORD535_tree=null;
		Object char_literal536_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
		RewriteRuleTokenStream stream_NAMED_PARAMETER=new RewriteRuleTokenStream(adaptor,"token NAMED_PARAMETER");
		RewriteRuleSubtreeStream stream_numeric_literal=new RewriteRuleSubtreeStream(adaptor,"rule numeric_literal");

		try {
			// JPA2.g:470:5: ( '?' numeric_literal -> ^( T_PARAMETER[] '?' numeric_literal ) | NAMED_PARAMETER -> ^( T_PARAMETER[] NAMED_PARAMETER ) | '${' WORD '}' -> ^( T_PARAMETER[] '${' WORD '}' ) )
			int alt129=3;
			switch ( input.LA(1) ) {
			case 69:
				{
				alt129=1;
				}
				break;
			case NAMED_PARAMETER:
				{
				alt129=2;
				}
				break;
			case 55:
				{
				alt129=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}
			switch (alt129) {
				case 1 :
					// JPA2.g:470:7: '?' numeric_literal
					{
					char_literal531=(Token)match(input,69,FOLLOW_69_in_input_parameter4065); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_69.add(char_literal531);

					pushFollow(FOLLOW_numeric_literal_in_input_parameter4067);
					numeric_literal532=numeric_literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_numeric_literal.add(numeric_literal532.getTree());
					// AST REWRITE
					// elements: 69, numeric_literal
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 470:27: -> ^( T_PARAMETER[] '?' numeric_literal )
					{
						// JPA2.g:470:30: ^( T_PARAMETER[] '?' numeric_literal )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new ParameterNode(T_PARAMETER), root_1);
						adaptor.addChild(root_1, stream_69.nextNode());
						adaptor.addChild(root_1, stream_numeric_literal.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// JPA2.g:471:7: NAMED_PARAMETER
					{
					NAMED_PARAMETER533=(Token)match(input,NAMED_PARAMETER,FOLLOW_NAMED_PARAMETER_in_input_parameter4090); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAMED_PARAMETER.add(NAMED_PARAMETER533);

					// AST REWRITE
					// elements: NAMED_PARAMETER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 471:23: -> ^( T_PARAMETER[] NAMED_PARAMETER )
					{
						// JPA2.g:471:26: ^( T_PARAMETER[] NAMED_PARAMETER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new ParameterNode(T_PARAMETER), root_1);
						adaptor.addChild(root_1, stream_NAMED_PARAMETER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// JPA2.g:472:7: '${' WORD '}'
					{
					string_literal534=(Token)match(input,55,FOLLOW_55_in_input_parameter4111); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_55.add(string_literal534);

					WORD535=(Token)match(input,WORD,FOLLOW_WORD_in_input_parameter4113); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WORD.add(WORD535);

					char_literal536=(Token)match(input,136,FOLLOW_136_in_input_parameter4115); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_136.add(char_literal536);

					// AST REWRITE
					// elements: WORD, 136, 55
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 472:21: -> ^( T_PARAMETER[] '${' WORD '}' )
					{
						// JPA2.g:472:24: ^( T_PARAMETER[] '${' WORD '}' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new ParameterNode(T_PARAMETER), root_1);
						adaptor.addChild(root_1, stream_55.nextNode());
						adaptor.addChild(root_1, stream_WORD.nextNode());
						adaptor.addChild(root_1, stream_136.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "input_parameter"


	public static class literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// JPA2.g:474:1: literal : WORD ;
	public final JPA2Parser.literal_return literal() throws RecognitionException {
		JPA2Parser.literal_return retval = new JPA2Parser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD537=null;

		Object WORD537_tree=null;

		try {
			// JPA2.g:475:5: ( WORD )
			// JPA2.g:475:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD537=(Token)match(input,WORD,FOLLOW_WORD_in_literal4143); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD537_tree = (Object)adaptor.create(WORD537);
			adaptor.addChild(root_0, WORD537_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class constructor_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constructor_name"
	// JPA2.g:477:1: constructor_name : WORD ;
	public final JPA2Parser.constructor_name_return constructor_name() throws RecognitionException {
		JPA2Parser.constructor_name_return retval = new JPA2Parser.constructor_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD538=null;

		Object WORD538_tree=null;

		try {
			// JPA2.g:478:5: ( WORD )
			// JPA2.g:478:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD538=(Token)match(input,WORD,FOLLOW_WORD_in_constructor_name4155); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD538_tree = (Object)adaptor.create(WORD538);
			adaptor.addChild(root_0, WORD538_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructor_name"


	public static class enum_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enum_literal"
	// JPA2.g:480:1: enum_literal : WORD ;
	public final JPA2Parser.enum_literal_return enum_literal() throws RecognitionException {
		JPA2Parser.enum_literal_return retval = new JPA2Parser.enum_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD539=null;

		Object WORD539_tree=null;

		try {
			// JPA2.g:481:5: ( WORD )
			// JPA2.g:481:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD539=(Token)match(input,WORD,FOLLOW_WORD_in_enum_literal4167); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD539_tree = (Object)adaptor.create(WORD539);
			adaptor.addChild(root_0, WORD539_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_literal"


	public static class boolean_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_literal"
	// JPA2.g:483:1: boolean_literal : ( 'true' | 'false' );
	public final JPA2Parser.boolean_literal_return boolean_literal() throws RecognitionException {
		JPA2Parser.boolean_literal_return retval = new JPA2Parser.boolean_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set540=null;

		Object set540_tree=null;

		try {
			// JPA2.g:484:5: ( 'true' | 'false' )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set540=input.LT(1);
			if ( (input.LA(1) >= 134 && input.LA(1) <= 135) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set540));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolean_literal"


	public static class field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "field"
	// JPA2.g:488:1: field : ( WORD | 'GROUP' );
	public final JPA2Parser.field_return field() throws RecognitionException {
		JPA2Parser.field_return retval = new JPA2Parser.field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set541=null;

		Object set541_tree=null;

		try {
			// JPA2.g:489:5: ( WORD | 'GROUP' )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set541=input.LT(1);
			if ( input.LA(1)==GROUP||input.LA(1)==WORD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set541));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field"


	public static class identification_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identification_variable"
	// JPA2.g:491:1: identification_variable : WORD ;
	public final JPA2Parser.identification_variable_return identification_variable() throws RecognitionException {
		JPA2Parser.identification_variable_return retval = new JPA2Parser.identification_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD542=null;

		Object WORD542_tree=null;

		try {
			// JPA2.g:492:5: ( WORD )
			// JPA2.g:492:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD542=(Token)match(input,WORD,FOLLOW_WORD_in_identification_variable4216); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD542_tree = (Object)adaptor.create(WORD542);
			adaptor.addChild(root_0, WORD542_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identification_variable"


	public static class parameter_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parameter_name"
	// JPA2.g:494:1: parameter_name : WORD ( '.' WORD )* ;
	public final JPA2Parser.parameter_name_return parameter_name() throws RecognitionException {
		JPA2Parser.parameter_name_return retval = new JPA2Parser.parameter_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD543=null;
		Token char_literal544=null;
		Token WORD545=null;

		Object WORD543_tree=null;
		Object char_literal544_tree=null;
		Object WORD545_tree=null;

		try {
			// JPA2.g:495:5: ( WORD ( '.' WORD )* )
			// JPA2.g:495:7: WORD ( '.' WORD )*
			{
			root_0 = (Object)adaptor.nil();


			WORD543=(Token)match(input,WORD,FOLLOW_WORD_in_parameter_name4228); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD543_tree = (Object)adaptor.create(WORD543);
			adaptor.addChild(root_0, WORD543_tree);
			}

			// JPA2.g:495:12: ( '.' WORD )*
			loop130:
			while (true) {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==60) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// JPA2.g:495:13: '.' WORD
					{
					char_literal544=(Token)match(input,60,FOLLOW_60_in_parameter_name4231); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal544_tree = (Object)adaptor.create(char_literal544);
					adaptor.addChild(root_0, char_literal544_tree);
					}

					WORD545=(Token)match(input,WORD,FOLLOW_WORD_in_parameter_name4234); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WORD545_tree = (Object)adaptor.create(WORD545);
					adaptor.addChild(root_0, WORD545_tree);
					}

					}
					break;

				default :
					break loop130;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter_name"


	public static class escape_character_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "escape_character"
	// JPA2.g:498:1: escape_character : ( '\\'.\\'' | STRING_LITERAL );
	public final JPA2Parser.escape_character_return escape_character() throws RecognitionException {
		JPA2Parser.escape_character_return retval = new JPA2Parser.escape_character_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set546=null;

		Object set546_tree=null;

		try {
			// JPA2.g:499:5: ( '\\'.\\'' | STRING_LITERAL )
			// JPA2.g:
			{
			root_0 = (Object)adaptor.nil();


			set546=input.LT(1);
			if ( input.LA(1)==STRING_LITERAL||input.LA(1)==TRIM_CHARACTER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set546));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "escape_character"


	public static class trim_character_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "trim_character"
	// JPA2.g:500:1: trim_character : TRIM_CHARACTER ;
	public final JPA2Parser.trim_character_return trim_character() throws RecognitionException {
		JPA2Parser.trim_character_return retval = new JPA2Parser.trim_character_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TRIM_CHARACTER547=null;

		Object TRIM_CHARACTER547_tree=null;

		try {
			// JPA2.g:501:5: ( TRIM_CHARACTER )
			// JPA2.g:501:7: TRIM_CHARACTER
			{
			root_0 = (Object)adaptor.nil();


			TRIM_CHARACTER547=(Token)match(input,TRIM_CHARACTER,FOLLOW_TRIM_CHARACTER_in_trim_character4264); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TRIM_CHARACTER547_tree = (Object)adaptor.create(TRIM_CHARACTER547);
			adaptor.addChild(root_0, TRIM_CHARACTER547_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trim_character"


	public static class string_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "string_literal"
	// JPA2.g:502:1: string_literal : STRING_LITERAL ;
	public final JPA2Parser.string_literal_return string_literal() throws RecognitionException {
		JPA2Parser.string_literal_return retval = new JPA2Parser.string_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING_LITERAL548=null;

		Object STRING_LITERAL548_tree=null;

		try {
			// JPA2.g:503:5: ( STRING_LITERAL )
			// JPA2.g:503:7: STRING_LITERAL
			{
			root_0 = (Object)adaptor.nil();


			STRING_LITERAL548=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal4275); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STRING_LITERAL548_tree = (Object)adaptor.create(STRING_LITERAL548);
			adaptor.addChild(root_0, STRING_LITERAL548_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string_literal"


	public static class numeric_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numeric_literal"
	// JPA2.g:504:1: numeric_literal : ( '0x' )? INT_NUMERAL ;
	public final JPA2Parser.numeric_literal_return numeric_literal() throws RecognitionException {
		JPA2Parser.numeric_literal_return retval = new JPA2Parser.numeric_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal549=null;
		Token INT_NUMERAL550=null;

		Object string_literal549_tree=null;
		Object INT_NUMERAL550_tree=null;

		try {
			// JPA2.g:505:5: ( ( '0x' )? INT_NUMERAL )
			// JPA2.g:505:7: ( '0x' )? INT_NUMERAL
			{
			root_0 = (Object)adaptor.nil();


			// JPA2.g:505:7: ( '0x' )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==62) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// JPA2.g:505:8: '0x'
					{
					string_literal549=(Token)match(input,62,FOLLOW_62_in_numeric_literal4287); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal549_tree = (Object)adaptor.create(string_literal549);
					adaptor.addChild(root_0, string_literal549_tree);
					}

					}
					break;

			}

			INT_NUMERAL550=(Token)match(input,INT_NUMERAL,FOLLOW_INT_NUMERAL_in_numeric_literal4291); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			INT_NUMERAL550_tree = (Object)adaptor.create(INT_NUMERAL550);
			adaptor.addChild(root_0, INT_NUMERAL550_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numeric_literal"


	public static class single_valued_object_field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "single_valued_object_field"
	// JPA2.g:506:1: single_valued_object_field : WORD ;
	public final JPA2Parser.single_valued_object_field_return single_valued_object_field() throws RecognitionException {
		JPA2Parser.single_valued_object_field_return retval = new JPA2Parser.single_valued_object_field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD551=null;

		Object WORD551_tree=null;

		try {
			// JPA2.g:507:5: ( WORD )
			// JPA2.g:507:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD551=(Token)match(input,WORD,FOLLOW_WORD_in_single_valued_object_field4303); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD551_tree = (Object)adaptor.create(WORD551);
			adaptor.addChild(root_0, WORD551_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "single_valued_object_field"


	public static class single_valued_embeddable_object_field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "single_valued_embeddable_object_field"
	// JPA2.g:508:1: single_valued_embeddable_object_field : WORD ;
	public final JPA2Parser.single_valued_embeddable_object_field_return single_valued_embeddable_object_field() throws RecognitionException {
		JPA2Parser.single_valued_embeddable_object_field_return retval = new JPA2Parser.single_valued_embeddable_object_field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD552=null;

		Object WORD552_tree=null;

		try {
			// JPA2.g:509:5: ( WORD )
			// JPA2.g:509:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD552=(Token)match(input,WORD,FOLLOW_WORD_in_single_valued_embeddable_object_field4314); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD552_tree = (Object)adaptor.create(WORD552);
			adaptor.addChild(root_0, WORD552_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "single_valued_embeddable_object_field"


	public static class collection_valued_field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "collection_valued_field"
	// JPA2.g:510:1: collection_valued_field : WORD ;
	public final JPA2Parser.collection_valued_field_return collection_valued_field() throws RecognitionException {
		JPA2Parser.collection_valued_field_return retval = new JPA2Parser.collection_valued_field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD553=null;

		Object WORD553_tree=null;

		try {
			// JPA2.g:511:5: ( WORD )
			// JPA2.g:511:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD553=(Token)match(input,WORD,FOLLOW_WORD_in_collection_valued_field4325); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD553_tree = (Object)adaptor.create(WORD553);
			adaptor.addChild(root_0, WORD553_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "collection_valued_field"


	public static class entity_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entity_name"
	// JPA2.g:512:1: entity_name : WORD ;
	public final JPA2Parser.entity_name_return entity_name() throws RecognitionException {
		JPA2Parser.entity_name_return retval = new JPA2Parser.entity_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD554=null;

		Object WORD554_tree=null;

		try {
			// JPA2.g:513:5: ( WORD )
			// JPA2.g:513:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD554=(Token)match(input,WORD,FOLLOW_WORD_in_entity_name4336); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD554_tree = (Object)adaptor.create(WORD554);
			adaptor.addChild(root_0, WORD554_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "entity_name"


	public static class subtype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subtype"
	// JPA2.g:514:1: subtype : WORD ;
	public final JPA2Parser.subtype_return subtype() throws RecognitionException {
		JPA2Parser.subtype_return retval = new JPA2Parser.subtype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD555=null;

		Object WORD555_tree=null;

		try {
			// JPA2.g:515:5: ( WORD )
			// JPA2.g:515:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD555=(Token)match(input,WORD,FOLLOW_WORD_in_subtype4347); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD555_tree = (Object)adaptor.create(WORD555);
			adaptor.addChild(root_0, WORD555_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subtype"


	public static class entity_type_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "entity_type_literal"
	// JPA2.g:516:1: entity_type_literal : WORD ;
	public final JPA2Parser.entity_type_literal_return entity_type_literal() throws RecognitionException {
		JPA2Parser.entity_type_literal_return retval = new JPA2Parser.entity_type_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD556=null;

		Object WORD556_tree=null;

		try {
			// JPA2.g:517:5: ( WORD )
			// JPA2.g:517:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD556=(Token)match(input,WORD,FOLLOW_WORD_in_entity_type_literal4358); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD556_tree = (Object)adaptor.create(WORD556);
			adaptor.addChild(root_0, WORD556_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "entity_type_literal"


	public static class function_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_name"
	// JPA2.g:518:1: function_name : WORD ;
	public final JPA2Parser.function_name_return function_name() throws RecognitionException {
		JPA2Parser.function_name_return retval = new JPA2Parser.function_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD557=null;

		Object WORD557_tree=null;

		try {
			// JPA2.g:519:5: ( WORD )
			// JPA2.g:519:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD557=(Token)match(input,WORD,FOLLOW_WORD_in_function_name4369); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD557_tree = (Object)adaptor.create(WORD557);
			adaptor.addChild(root_0, WORD557_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_name"


	public static class state_field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "state_field"
	// JPA2.g:520:1: state_field : WORD ;
	public final JPA2Parser.state_field_return state_field() throws RecognitionException {
		JPA2Parser.state_field_return retval = new JPA2Parser.state_field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD558=null;

		Object WORD558_tree=null;

		try {
			// JPA2.g:521:5: ( WORD )
			// JPA2.g:521:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD558=(Token)match(input,WORD,FOLLOW_WORD_in_state_field4380); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD558_tree = (Object)adaptor.create(WORD558);
			adaptor.addChild(root_0, WORD558_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "state_field"


	public static class result_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "result_variable"
	// JPA2.g:522:1: result_variable : WORD ;
	public final JPA2Parser.result_variable_return result_variable() throws RecognitionException {
		JPA2Parser.result_variable_return retval = new JPA2Parser.result_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD559=null;

		Object WORD559_tree=null;

		try {
			// JPA2.g:523:5: ( WORD )
			// JPA2.g:523:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD559=(Token)match(input,WORD,FOLLOW_WORD_in_result_variable4391); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD559_tree = (Object)adaptor.create(WORD559);
			adaptor.addChild(root_0, WORD559_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "result_variable"


	public static class superquery_identification_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "superquery_identification_variable"
	// JPA2.g:524:1: superquery_identification_variable : WORD ;
	public final JPA2Parser.superquery_identification_variable_return superquery_identification_variable() throws RecognitionException {
		JPA2Parser.superquery_identification_variable_return retval = new JPA2Parser.superquery_identification_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD560=null;

		Object WORD560_tree=null;

		try {
			// JPA2.g:525:5: ( WORD )
			// JPA2.g:525:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD560=(Token)match(input,WORD,FOLLOW_WORD_in_superquery_identification_variable4402); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD560_tree = (Object)adaptor.create(WORD560);
			adaptor.addChild(root_0, WORD560_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "superquery_identification_variable"


	public static class date_time_timestamp_literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date_time_timestamp_literal"
	// JPA2.g:526:1: date_time_timestamp_literal : WORD ;
	public final JPA2Parser.date_time_timestamp_literal_return date_time_timestamp_literal() throws RecognitionException {
		JPA2Parser.date_time_timestamp_literal_return retval = new JPA2Parser.date_time_timestamp_literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WORD561=null;

		Object WORD561_tree=null;

		try {
			// JPA2.g:527:5: ( WORD )
			// JPA2.g:527:7: WORD
			{
			root_0 = (Object)adaptor.nil();


			WORD561=(Token)match(input,WORD,FOLLOW_WORD_in_date_time_timestamp_literal4413); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WORD561_tree = (Object)adaptor.create(WORD561);
			adaptor.addChild(root_0, WORD561_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date_time_timestamp_literal"


	public static class pattern_value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pattern_value"
	// JPA2.g:528:1: pattern_value : string_literal ;
	public final JPA2Parser.pattern_value_return pattern_value() throws RecognitionException {
		JPA2Parser.pattern_value_return retval = new JPA2Parser.pattern_value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope string_literal562 =null;


		try {
			// JPA2.g:529:5: ( string_literal )
			// JPA2.g:529:7: string_literal
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_string_literal_in_pattern_value4424);
			string_literal562=string_literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, string_literal562.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pattern_value"


	public static class collection_valued_input_parameter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "collection_valued_input_parameter"
	// JPA2.g:530:1: collection_valued_input_parameter : input_parameter ;
	public final JPA2Parser.collection_valued_input_parameter_return collection_valued_input_parameter() throws RecognitionException {
		JPA2Parser.collection_valued_input_parameter_return retval = new JPA2Parser.collection_valued_input_parameter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope input_parameter563 =null;


		try {
			// JPA2.g:531:5: ( input_parameter )
			// JPA2.g:531:7: input_parameter
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_input_parameter_in_collection_valued_input_parameter4435);
			input_parameter563=input_parameter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter563.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "collection_valued_input_parameter"


	public static class single_valued_input_parameter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "single_valued_input_parameter"
	// JPA2.g:532:1: single_valued_input_parameter : input_parameter ;
	public final JPA2Parser.single_valued_input_parameter_return single_valued_input_parameter() throws RecognitionException {
		JPA2Parser.single_valued_input_parameter_return retval = new JPA2Parser.single_valued_input_parameter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope input_parameter564 =null;


		try {
			// JPA2.g:533:5: ( input_parameter )
			// JPA2.g:533:7: input_parameter
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_input_parameter_in_single_valued_input_parameter4446);
			input_parameter564=input_parameter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, input_parameter564.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "single_valued_input_parameter"

	// $ANTLR start synpred18_JPA2
	public final void synpred18_JPA2_fragment() throws RecognitionException {
		// JPA2.g:134:48: ( field )
		// JPA2.g:134:48: field
		{
		pushFollow(FOLLOW_field_in_synpred18_JPA2822);
		field();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_JPA2

	// $ANTLR start synpred27_JPA2
	public final void synpred27_JPA2_fragment() throws RecognitionException {
		// JPA2.g:152:48: ( field )
		// JPA2.g:152:48: field
		{
		pushFollow(FOLLOW_field_in_synpred27_JPA21012);
		field();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred27_JPA2

	// $ANTLR start synpred33_JPA2
	public final void synpred33_JPA2_fragment() throws RecognitionException {
		// JPA2.g:166:7: ( scalar_expression )
		// JPA2.g:166:7: scalar_expression
		{
		pushFollow(FOLLOW_scalar_expression_in_synpred33_JPA21126);
		scalar_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred33_JPA2

	// $ANTLR start synpred34_JPA2
	public final void synpred34_JPA2_fragment() throws RecognitionException {
		// JPA2.g:167:7: ( simple_entity_expression )
		// JPA2.g:167:7: simple_entity_expression
		{
		pushFollow(FOLLOW_simple_entity_expression_in_synpred34_JPA21134);
		simple_entity_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred34_JPA2

	// $ANTLR start synpred41_JPA2
	public final void synpred41_JPA2_fragment() throws RecognitionException {
		// JPA2.g:177:7: ( path_expression )
		// JPA2.g:177:7: path_expression
		{
		pushFollow(FOLLOW_path_expression_in_synpred41_JPA21248);
		path_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred41_JPA2

	// $ANTLR start synpred42_JPA2
	public final void synpred42_JPA2_fragment() throws RecognitionException {
		// JPA2.g:178:7: ( identification_variable )
		// JPA2.g:178:7: identification_variable
		{
		pushFollow(FOLLOW_identification_variable_in_synpred42_JPA21256);
		identification_variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred42_JPA2

	// $ANTLR start synpred43_JPA2
	public final void synpred43_JPA2_fragment() throws RecognitionException {
		// JPA2.g:179:7: ( scalar_expression )
		// JPA2.g:179:7: scalar_expression
		{
		pushFollow(FOLLOW_scalar_expression_in_synpred43_JPA21274);
		scalar_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred43_JPA2

	// $ANTLR start synpred44_JPA2
	public final void synpred44_JPA2_fragment() throws RecognitionException {
		// JPA2.g:180:7: ( aggregate_expression )
		// JPA2.g:180:7: aggregate_expression
		{
		pushFollow(FOLLOW_aggregate_expression_in_synpred44_JPA21282);
		aggregate_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred44_JPA2

	// $ANTLR start synpred47_JPA2
	public final void synpred47_JPA2_fragment() throws RecognitionException {
		// JPA2.g:186:7: ( path_expression )
		// JPA2.g:186:7: path_expression
		{
		pushFollow(FOLLOW_path_expression_in_synpred47_JPA21339);
		path_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred47_JPA2

	// $ANTLR start synpred48_JPA2
	public final void synpred48_JPA2_fragment() throws RecognitionException {
		// JPA2.g:187:7: ( scalar_expression )
		// JPA2.g:187:7: scalar_expression
		{
		pushFollow(FOLLOW_scalar_expression_in_synpred48_JPA21347);
		scalar_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred48_JPA2

	// $ANTLR start synpred49_JPA2
	public final void synpred49_JPA2_fragment() throws RecognitionException {
		// JPA2.g:188:7: ( aggregate_expression )
		// JPA2.g:188:7: aggregate_expression
		{
		pushFollow(FOLLOW_aggregate_expression_in_synpred49_JPA21355);
		aggregate_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred49_JPA2

	// $ANTLR start synpred51_JPA2
	public final void synpred51_JPA2_fragment() throws RecognitionException {
		// JPA2.g:191:7: ( aggregate_expression_function_name '(' ( DISTINCT )? path_expression ')' )
		// JPA2.g:191:7: aggregate_expression_function_name '(' ( DISTINCT )? path_expression ')'
		{
		pushFollow(FOLLOW_aggregate_expression_function_name_in_synpred51_JPA21374);
		aggregate_expression_function_name();
		state._fsp--;
		if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred51_JPA21376); if (state.failed) return;

		// JPA2.g:191:45: ( DISTINCT )?
		int alt140=2;
		int LA140_0 = input.LA(1);
		if ( (LA140_0==DISTINCT) ) {
			alt140=1;
		}
		switch (alt140) {
			case 1 :
				// JPA2.g:191:46: DISTINCT
				{
				match(input,DISTINCT,FOLLOW_DISTINCT_in_synpred51_JPA21378); if (state.failed) return;

				}
				break;

		}

		pushFollow(FOLLOW_path_expression_in_synpred51_JPA21382);
		path_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred51_JPA21383); if (state.failed) return;

		}

	}
	// $ANTLR end synpred51_JPA2

	// $ANTLR start synpred53_JPA2
	public final void synpred53_JPA2_fragment() throws RecognitionException {
		// JPA2.g:193:7: ( 'COUNT' '(' ( DISTINCT )? count_argument ')' )
		// JPA2.g:193:7: 'COUNT' '(' ( DISTINCT )? count_argument ')'
		{
		match(input,COUNT,FOLLOW_COUNT_in_synpred53_JPA21417); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred53_JPA21419); if (state.failed) return;

		// JPA2.g:193:18: ( DISTINCT )?
		int alt141=2;
		int LA141_0 = input.LA(1);
		if ( (LA141_0==DISTINCT) ) {
			alt141=1;
		}
		switch (alt141) {
			case 1 :
				// JPA2.g:193:19: DISTINCT
				{
				match(input,DISTINCT,FOLLOW_DISTINCT_in_synpred53_JPA21421); if (state.failed) return;

				}
				break;

		}

		pushFollow(FOLLOW_count_argument_in_synpred53_JPA21425);
		count_argument();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred53_JPA21427); if (state.failed) return;

		}

	}
	// $ANTLR end synpred53_JPA2

	// $ANTLR start synpred65_JPA2
	public final void synpred65_JPA2_fragment() throws RecognitionException {
		// JPA2.g:218:25: ( general_identification_variable )
		// JPA2.g:218:25: general_identification_variable
		{
		pushFollow(FOLLOW_general_identification_variable_in_synpred65_JPA21725);
		general_identification_variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred65_JPA2

	// $ANTLR start synpred73_JPA2
	public final void synpred73_JPA2_fragment() throws RecognitionException {
		// JPA2.g:232:7: ( general_derived_path '.' single_valued_object_field )
		// JPA2.g:232:7: general_derived_path '.' single_valued_object_field
		{
		pushFollow(FOLLOW_general_derived_path_in_synpred73_JPA21899);
		general_derived_path();
		state._fsp--;
		if (state.failed) return;

		match(input,60,FOLLOW_60_in_synpred73_JPA21900); if (state.failed) return;

		pushFollow(FOLLOW_single_valued_object_field_in_synpred73_JPA21901);
		single_valued_object_field();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred73_JPA2

	// $ANTLR start synpred78_JPA2
	public final void synpred78_JPA2_fragment() throws RecognitionException {
		// JPA2.g:250:7: ( path_expression )
		// JPA2.g:250:7: path_expression
		{
		pushFollow(FOLLOW_path_expression_in_synpred78_JPA22053);
		path_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred78_JPA2

	// $ANTLR start synpred79_JPA2
	public final void synpred79_JPA2_fragment() throws RecognitionException {
		// JPA2.g:251:7: ( scalar_expression )
		// JPA2.g:251:7: scalar_expression
		{
		pushFollow(FOLLOW_scalar_expression_in_synpred79_JPA22061);
		scalar_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred79_JPA2

	// $ANTLR start synpred80_JPA2
	public final void synpred80_JPA2_fragment() throws RecognitionException {
		// JPA2.g:252:7: ( aggregate_expression )
		// JPA2.g:252:7: aggregate_expression
		{
		pushFollow(FOLLOW_aggregate_expression_in_synpred80_JPA22069);
		aggregate_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred80_JPA2

	// $ANTLR start synpred81_JPA2
	public final void synpred81_JPA2_fragment() throws RecognitionException {
		// JPA2.g:255:7: ( arithmetic_expression )
		// JPA2.g:255:7: arithmetic_expression
		{
		pushFollow(FOLLOW_arithmetic_expression_in_synpred81_JPA22088);
		arithmetic_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred81_JPA2

	// $ANTLR start synpred82_JPA2
	public final void synpred82_JPA2_fragment() throws RecognitionException {
		// JPA2.g:256:7: ( string_expression )
		// JPA2.g:256:7: string_expression
		{
		pushFollow(FOLLOW_string_expression_in_synpred82_JPA22096);
		string_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred82_JPA2

	// $ANTLR start synpred83_JPA2
	public final void synpred83_JPA2_fragment() throws RecognitionException {
		// JPA2.g:257:7: ( enum_expression )
		// JPA2.g:257:7: enum_expression
		{
		pushFollow(FOLLOW_enum_expression_in_synpred83_JPA22104);
		enum_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred83_JPA2

	// $ANTLR start synpred84_JPA2
	public final void synpred84_JPA2_fragment() throws RecognitionException {
		// JPA2.g:258:7: ( datetime_expression )
		// JPA2.g:258:7: datetime_expression
		{
		pushFollow(FOLLOW_datetime_expression_in_synpred84_JPA22112);
		datetime_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred84_JPA2

	// $ANTLR start synpred85_JPA2
	public final void synpred85_JPA2_fragment() throws RecognitionException {
		// JPA2.g:259:7: ( boolean_expression )
		// JPA2.g:259:7: boolean_expression
		{
		pushFollow(FOLLOW_boolean_expression_in_synpred85_JPA22120);
		boolean_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred85_JPA2

	// $ANTLR start synpred86_JPA2
	public final void synpred86_JPA2_fragment() throws RecognitionException {
		// JPA2.g:260:7: ( case_expression )
		// JPA2.g:260:7: case_expression
		{
		pushFollow(FOLLOW_case_expression_in_synpred86_JPA22128);
		case_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred86_JPA2

	// $ANTLR start synpred89_JPA2
	public final void synpred89_JPA2_fragment() throws RecognitionException {
		// JPA2.g:267:8: ( 'NOT' )
		// JPA2.g:267:8: 'NOT'
		{
		match(input,NOT,FOLLOW_NOT_in_synpred89_JPA22188); if (state.failed) return;

		}

	}
	// $ANTLR end synpred89_JPA2

	// $ANTLR start synpred90_JPA2
	public final void synpred90_JPA2_fragment() throws RecognitionException {
		// JPA2.g:269:7: ( simple_cond_expression )
		// JPA2.g:269:7: simple_cond_expression
		{
		pushFollow(FOLLOW_simple_cond_expression_in_synpred90_JPA22203);
		simple_cond_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred90_JPA2

	// $ANTLR start synpred91_JPA2
	public final void synpred91_JPA2_fragment() throws RecognitionException {
		// JPA2.g:273:7: ( comparison_expression )
		// JPA2.g:273:7: comparison_expression
		{
		pushFollow(FOLLOW_comparison_expression_in_synpred91_JPA22240);
		comparison_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred91_JPA2

	// $ANTLR start synpred92_JPA2
	public final void synpred92_JPA2_fragment() throws RecognitionException {
		// JPA2.g:274:7: ( between_expression )
		// JPA2.g:274:7: between_expression
		{
		pushFollow(FOLLOW_between_expression_in_synpred92_JPA22248);
		between_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred92_JPA2

	// $ANTLR start synpred93_JPA2
	public final void synpred93_JPA2_fragment() throws RecognitionException {
		// JPA2.g:275:7: ( in_expression )
		// JPA2.g:275:7: in_expression
		{
		pushFollow(FOLLOW_in_expression_in_synpred93_JPA22256);
		in_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred93_JPA2

	// $ANTLR start synpred94_JPA2
	public final void synpred94_JPA2_fragment() throws RecognitionException {
		// JPA2.g:276:7: ( like_expression )
		// JPA2.g:276:7: like_expression
		{
		pushFollow(FOLLOW_like_expression_in_synpred94_JPA22264);
		like_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred94_JPA2

	// $ANTLR start synpred95_JPA2
	public final void synpred95_JPA2_fragment() throws RecognitionException {
		// JPA2.g:277:7: ( null_comparison_expression )
		// JPA2.g:277:7: null_comparison_expression
		{
		pushFollow(FOLLOW_null_comparison_expression_in_synpred95_JPA22272);
		null_comparison_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred95_JPA2

	// $ANTLR start synpred96_JPA2
	public final void synpred96_JPA2_fragment() throws RecognitionException {
		// JPA2.g:278:7: ( empty_collection_comparison_expression )
		// JPA2.g:278:7: empty_collection_comparison_expression
		{
		pushFollow(FOLLOW_empty_collection_comparison_expression_in_synpred96_JPA22280);
		empty_collection_comparison_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred96_JPA2

	// $ANTLR start synpred97_JPA2
	public final void synpred97_JPA2_fragment() throws RecognitionException {
		// JPA2.g:279:7: ( collection_member_expression )
		// JPA2.g:279:7: collection_member_expression
		{
		pushFollow(FOLLOW_collection_member_expression_in_synpred97_JPA22288);
		collection_member_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred97_JPA2

	// $ANTLR start synpred116_JPA2
	public final void synpred116_JPA2_fragment() throws RecognitionException {
		// JPA2.g:308:7: ( arithmetic_expression ( 'NOT' )? 'BETWEEN' arithmetic_expression 'AND' arithmetic_expression )
		// JPA2.g:308:7: arithmetic_expression ( 'NOT' )? 'BETWEEN' arithmetic_expression 'AND' arithmetic_expression
		{
		pushFollow(FOLLOW_arithmetic_expression_in_synpred116_JPA22541);
		arithmetic_expression();
		state._fsp--;
		if (state.failed) return;

		// JPA2.g:308:29: ( 'NOT' )?
		int alt144=2;
		int LA144_0 = input.LA(1);
		if ( (LA144_0==NOT) ) {
			alt144=1;
		}
		switch (alt144) {
			case 1 :
				// JPA2.g:308:30: 'NOT'
				{
				match(input,NOT,FOLLOW_NOT_in_synpred116_JPA22544); if (state.failed) return;

				}
				break;

		}

		match(input,79,FOLLOW_79_in_synpred116_JPA22548); if (state.failed) return;

		pushFollow(FOLLOW_arithmetic_expression_in_synpred116_JPA22550);
		arithmetic_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,AND,FOLLOW_AND_in_synpred116_JPA22552); if (state.failed) return;

		pushFollow(FOLLOW_arithmetic_expression_in_synpred116_JPA22554);
		arithmetic_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred116_JPA2

	// $ANTLR start synpred118_JPA2
	public final void synpred118_JPA2_fragment() throws RecognitionException {
		// JPA2.g:309:7: ( string_expression ( 'NOT' )? 'BETWEEN' string_expression 'AND' string_expression )
		// JPA2.g:309:7: string_expression ( 'NOT' )? 'BETWEEN' string_expression 'AND' string_expression
		{
		pushFollow(FOLLOW_string_expression_in_synpred118_JPA22562);
		string_expression();
		state._fsp--;
		if (state.failed) return;

		// JPA2.g:309:25: ( 'NOT' )?
		int alt145=2;
		int LA145_0 = input.LA(1);
		if ( (LA145_0==NOT) ) {
			alt145=1;
		}
		switch (alt145) {
			case 1 :
				// JPA2.g:309:26: 'NOT'
				{
				match(input,NOT,FOLLOW_NOT_in_synpred118_JPA22565); if (state.failed) return;

				}
				break;

		}

		match(input,79,FOLLOW_79_in_synpred118_JPA22569); if (state.failed) return;

		pushFollow(FOLLOW_string_expression_in_synpred118_JPA22571);
		string_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,AND,FOLLOW_AND_in_synpred118_JPA22573); if (state.failed) return;

		pushFollow(FOLLOW_string_expression_in_synpred118_JPA22575);
		string_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred118_JPA2

	// $ANTLR start synpred137_JPA2
	public final void synpred137_JPA2_fragment() throws RecognitionException {
		// JPA2.g:336:7: ( identification_variable )
		// JPA2.g:336:7: identification_variable
		{
		pushFollow(FOLLOW_identification_variable_in_synpred137_JPA22869);
		identification_variable();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred137_JPA2

	// $ANTLR start synpred143_JPA2
	public final void synpred143_JPA2_fragment() throws RecognitionException {
		// JPA2.g:344:7: ( string_expression comparison_operator ( string_expression | all_or_any_expression ) )
		// JPA2.g:344:7: string_expression comparison_operator ( string_expression | all_or_any_expression )
		{
		pushFollow(FOLLOW_string_expression_in_synpred143_JPA22938);
		string_expression();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_comparison_operator_in_synpred143_JPA22940);
		comparison_operator();
		state._fsp--;
		if (state.failed) return;

		// JPA2.g:344:45: ( string_expression | all_or_any_expression )
		int alt147=2;
		int LA147_0 = input.LA(1);
		if ( (LA147_0==AVG||LA147_0==COUNT||(LA147_0 >= LOWER && LA147_0 <= NAMED_PARAMETER)||(LA147_0 >= STRING_LITERAL && LA147_0 <= SUM)||LA147_0==WORD||LA147_0==55||LA147_0==69||(LA147_0 >= 81 && LA147_0 <= 83)||LA147_0==96||LA147_0==112||LA147_0==122||LA147_0==126||LA147_0==129) ) {
			alt147=1;
		}
		else if ( ((LA147_0 >= 76 && LA147_0 <= 77)||LA147_0==120) ) {
			alt147=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 147, 0, input);
			throw nvae;
		}

		switch (alt147) {
			case 1 :
				// JPA2.g:344:46: string_expression
				{
				pushFollow(FOLLOW_string_expression_in_synpred143_JPA22943);
				string_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// JPA2.g:344:66: all_or_any_expression
				{
				pushFollow(FOLLOW_all_or_any_expression_in_synpred143_JPA22947);
				all_or_any_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred143_JPA2

	// $ANTLR start synpred146_JPA2
	public final void synpred146_JPA2_fragment() throws RecognitionException {
		// JPA2.g:345:7: ( boolean_expression ( '=' | '<>' ) ( boolean_expression | all_or_any_expression ) )
		// JPA2.g:345:7: boolean_expression ( '=' | '<>' ) ( boolean_expression | all_or_any_expression )
		{
		pushFollow(FOLLOW_boolean_expression_in_synpred146_JPA22956);
		boolean_expression();
		state._fsp--;
		if (state.failed) return;

		if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		// JPA2.g:345:39: ( boolean_expression | all_or_any_expression )
		int alt148=2;
		int LA148_0 = input.LA(1);
		if ( (LA148_0==LPAREN||LA148_0==NAMED_PARAMETER||LA148_0==WORD||LA148_0==55||LA148_0==69||(LA148_0 >= 81 && LA148_0 <= 82)||LA148_0==96||LA148_0==112||(LA148_0 >= 134 && LA148_0 <= 135)) ) {
			alt148=1;
		}
		else if ( ((LA148_0 >= 76 && LA148_0 <= 77)||LA148_0==120) ) {
			alt148=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 148, 0, input);
			throw nvae;
		}

		switch (alt148) {
			case 1 :
				// JPA2.g:345:40: boolean_expression
				{
				pushFollow(FOLLOW_boolean_expression_in_synpred146_JPA22967);
				boolean_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// JPA2.g:345:61: all_or_any_expression
				{
				pushFollow(FOLLOW_all_or_any_expression_in_synpred146_JPA22971);
				all_or_any_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred146_JPA2

	// $ANTLR start synpred149_JPA2
	public final void synpred149_JPA2_fragment() throws RecognitionException {
		// JPA2.g:346:7: ( enum_expression ( '=' | '<>' ) ( enum_expression | all_or_any_expression ) )
		// JPA2.g:346:7: enum_expression ( '=' | '<>' ) ( enum_expression | all_or_any_expression )
		{
		pushFollow(FOLLOW_enum_expression_in_synpred149_JPA22980);
		enum_expression();
		state._fsp--;
		if (state.failed) return;

		if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		// JPA2.g:346:34: ( enum_expression | all_or_any_expression )
		int alt149=2;
		int LA149_0 = input.LA(1);
		if ( (LA149_0==LPAREN||LA149_0==NAMED_PARAMETER||LA149_0==WORD||LA149_0==55||LA149_0==69||(LA149_0 >= 81 && LA149_0 <= 82)||LA149_0==112) ) {
			alt149=1;
		}
		else if ( ((LA149_0 >= 76 && LA149_0 <= 77)||LA149_0==120) ) {
			alt149=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 149, 0, input);
			throw nvae;
		}

		switch (alt149) {
			case 1 :
				// JPA2.g:346:35: enum_expression
				{
				pushFollow(FOLLOW_enum_expression_in_synpred149_JPA22989);
				enum_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// JPA2.g:346:53: all_or_any_expression
				{
				pushFollow(FOLLOW_all_or_any_expression_in_synpred149_JPA22993);
				all_or_any_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred149_JPA2

	// $ANTLR start synpred151_JPA2
	public final void synpred151_JPA2_fragment() throws RecognitionException {
		// JPA2.g:347:7: ( datetime_expression comparison_operator ( datetime_expression | all_or_any_expression ) )
		// JPA2.g:347:7: datetime_expression comparison_operator ( datetime_expression | all_or_any_expression )
		{
		pushFollow(FOLLOW_datetime_expression_in_synpred151_JPA23002);
		datetime_expression();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_comparison_operator_in_synpred151_JPA23004);
		comparison_operator();
		state._fsp--;
		if (state.failed) return;

		// JPA2.g:347:47: ( datetime_expression | all_or_any_expression )
		int alt150=2;
		int LA150_0 = input.LA(1);
		if ( (LA150_0==AVG||LA150_0==COUNT||(LA150_0 >= LPAREN && LA150_0 <= NAMED_PARAMETER)||LA150_0==SUM||LA150_0==WORD||LA150_0==55||LA150_0==69||(LA150_0 >= 81 && LA150_0 <= 82)||(LA150_0 >= 84 && LA150_0 <= 86)||LA150_0==96||LA150_0==112) ) {
			alt150=1;
		}
		else if ( ((LA150_0 >= 76 && LA150_0 <= 77)||LA150_0==120) ) {
			alt150=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 150, 0, input);
			throw nvae;
		}

		switch (alt150) {
			case 1 :
				// JPA2.g:347:48: datetime_expression
				{
				pushFollow(FOLLOW_datetime_expression_in_synpred151_JPA23007);
				datetime_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// JPA2.g:347:70: all_or_any_expression
				{
				pushFollow(FOLLOW_all_or_any_expression_in_synpred151_JPA23011);
				all_or_any_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred151_JPA2

	// $ANTLR start synpred154_JPA2
	public final void synpred154_JPA2_fragment() throws RecognitionException {
		// JPA2.g:348:7: ( entity_expression ( '=' | '<>' ) ( entity_expression | all_or_any_expression ) )
		// JPA2.g:348:7: entity_expression ( '=' | '<>' ) ( entity_expression | all_or_any_expression )
		{
		pushFollow(FOLLOW_entity_expression_in_synpred154_JPA23020);
		entity_expression();
		state._fsp--;
		if (state.failed) return;

		if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		// JPA2.g:348:38: ( entity_expression | all_or_any_expression )
		int alt151=2;
		int LA151_0 = input.LA(1);
		if ( (LA151_0==NAMED_PARAMETER||LA151_0==WORD||LA151_0==55||LA151_0==69) ) {
			alt151=1;
		}
		else if ( ((LA151_0 >= 76 && LA151_0 <= 77)||LA151_0==120) ) {
			alt151=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 151, 0, input);
			throw nvae;
		}

		switch (alt151) {
			case 1 :
				// JPA2.g:348:39: entity_expression
				{
				pushFollow(FOLLOW_entity_expression_in_synpred154_JPA23031);
				entity_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// JPA2.g:348:59: all_or_any_expression
				{
				pushFollow(FOLLOW_all_or_any_expression_in_synpred154_JPA23035);
				all_or_any_expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred154_JPA2

	// $ANTLR start synpred156_JPA2
	public final void synpred156_JPA2_fragment() throws RecognitionException {
		// JPA2.g:349:7: ( entity_type_expression ( '=' | '<>' ) entity_type_expression )
		// JPA2.g:349:7: entity_type_expression ( '=' | '<>' ) entity_type_expression
		{
		pushFollow(FOLLOW_entity_type_expression_in_synpred156_JPA23044);
		entity_type_expression();
		state._fsp--;
		if (state.failed) return;

		if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_entity_type_expression_in_synpred156_JPA23054);
		entity_type_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred156_JPA2

	// $ANTLR start synpred163_JPA2
	public final void synpred163_JPA2_fragment() throws RecognitionException {
		// JPA2.g:360:7: ( arithmetic_term )
		// JPA2.g:360:7: arithmetic_term
		{
		pushFollow(FOLLOW_arithmetic_term_in_synpred163_JPA23135);
		arithmetic_term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred163_JPA2

	// $ANTLR start synpred165_JPA2
	public final void synpred165_JPA2_fragment() throws RecognitionException {
		// JPA2.g:363:7: ( arithmetic_factor )
		// JPA2.g:363:7: arithmetic_factor
		{
		pushFollow(FOLLOW_arithmetic_factor_in_synpred165_JPA23164);
		arithmetic_factor();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred165_JPA2

	// $ANTLR start synpred171_JPA2
	public final void synpred171_JPA2_fragment() throws RecognitionException {
		// JPA2.g:370:7: ( '(' arithmetic_expression ')' )
		// JPA2.g:370:7: '(' arithmetic_expression ')'
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred171_JPA23233); if (state.failed) return;

		pushFollow(FOLLOW_arithmetic_expression_in_synpred171_JPA23234);
		arithmetic_expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred171_JPA23235); if (state.failed) return;

		}

	}
	// $ANTLR end synpred171_JPA2

	// $ANTLR start synpred174_JPA2
	public final void synpred174_JPA2_fragment() throws RecognitionException {
		// JPA2.g:373:7: ( aggregate_expression )
		// JPA2.g:373:7: aggregate_expression
		{
		pushFollow(FOLLOW_aggregate_expression_in_synpred174_JPA23259);
		aggregate_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred174_JPA2

	// $ANTLR start synpred176_JPA2
	public final void synpred176_JPA2_fragment() throws RecognitionException {
		// JPA2.g:375:7: ( function_invocation )
		// JPA2.g:375:7: function_invocation
		{
		pushFollow(FOLLOW_function_invocation_in_synpred176_JPA23275);
		function_invocation();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred176_JPA2

	// $ANTLR start synpred181_JPA2
	public final void synpred181_JPA2_fragment() throws RecognitionException {
		// JPA2.g:382:7: ( aggregate_expression )
		// JPA2.g:382:7: aggregate_expression
		{
		pushFollow(FOLLOW_aggregate_expression_in_synpred181_JPA23326);
		aggregate_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred181_JPA2

	// $ANTLR start synpred183_JPA2
	public final void synpred183_JPA2_fragment() throws RecognitionException {
		// JPA2.g:384:7: ( function_invocation )
		// JPA2.g:384:7: function_invocation
		{
		pushFollow(FOLLOW_function_invocation_in_synpred183_JPA23342);
		function_invocation();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred183_JPA2

	// $ANTLR start synpred184_JPA2
	public final void synpred184_JPA2_fragment() throws RecognitionException {
		// JPA2.g:387:7: ( path_expression )
		// JPA2.g:387:7: path_expression
		{
		pushFollow(FOLLOW_path_expression_in_synpred184_JPA23361);
		path_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred184_JPA2

	// $ANTLR start synpred187_JPA2
	public final void synpred187_JPA2_fragment() throws RecognitionException {
		// JPA2.g:390:7: ( aggregate_expression )
		// JPA2.g:390:7: aggregate_expression
		{
		pushFollow(FOLLOW_aggregate_expression_in_synpred187_JPA23385);
		aggregate_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred187_JPA2

	// $ANTLR start synpred189_JPA2
	public final void synpred189_JPA2_fragment() throws RecognitionException {
		// JPA2.g:392:7: ( function_invocation )
		// JPA2.g:392:7: function_invocation
		{
		pushFollow(FOLLOW_function_invocation_in_synpred189_JPA23401);
		function_invocation();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred189_JPA2

	// $ANTLR start synpred190_JPA2
	public final void synpred190_JPA2_fragment() throws RecognitionException {
		// JPA2.g:393:7: ( date_time_timestamp_literal )
		// JPA2.g:393:7: date_time_timestamp_literal
		{
		pushFollow(FOLLOW_date_time_timestamp_literal_in_synpred190_JPA23409);
		date_time_timestamp_literal();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred190_JPA2

	// $ANTLR start synpred227_JPA2
	public final void synpred227_JPA2_fragment() throws RecognitionException {
		// JPA2.g:443:7: ( literal )
		// JPA2.g:443:7: literal
		{
		pushFollow(FOLLOW_literal_in_synpred227_JPA23853);
		literal();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred227_JPA2

	// $ANTLR start synpred229_JPA2
	public final void synpred229_JPA2_fragment() throws RecognitionException {
		// JPA2.g:445:7: ( input_parameter )
		// JPA2.g:445:7: input_parameter
		{
		pushFollow(FOLLOW_input_parameter_in_synpred229_JPA23869);
		input_parameter();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred229_JPA2

	// Delegated rules

	public final boolean synpred165_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred165_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred151_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred151_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred118_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred118_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred80_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred80_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred187_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred187_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred41_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred41_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred94_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred94_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred190_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred190_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred33_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred33_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred47_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred47_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred86_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred86_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred143_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred143_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred85_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred85_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred93_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred93_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred181_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred181_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred149_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred149_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred81_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred81_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred84_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred84_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred73_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred73_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred227_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred227_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred174_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred174_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred163_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred163_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred65_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred65_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred171_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred171_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred92_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred92_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred79_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred79_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred95_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred95_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred176_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred176_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred49_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred49_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred43_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred43_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred83_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred83_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred137_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred137_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred229_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred229_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred91_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred91_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred51_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred51_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred90_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred90_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred96_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred96_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred184_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred184_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred44_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred44_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred89_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred89_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred97_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred97_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred82_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred82_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred146_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred146_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred154_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred154_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred183_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred183_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred189_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred189_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred48_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred48_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred53_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred78_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred78_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred116_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred116_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred156_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred156_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred34_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred34_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred42_JPA2() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred42_JPA2_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA43 dfa43 = new DFA43(this);
	protected DFA49 dfa49 = new DFA49(this);
	static final String DFA43_eotS =
		"\14\uffff";
	static final String DFA43_eofS =
		"\14\uffff";
	static final String DFA43_minS =
		"\1\6\1\27\2\uffff\1\13\1\65\1\37\1\uffff\1\16\1\37\1\0\1\16";
	static final String DFA43_maxS =
		"\1\140\1\27\2\uffff\2\65\1\74\1\uffff\1\65\1\74\1\0\1\65";
	static final String DFA43_acceptS =
		"\2\uffff\1\1\1\3\3\uffff\1\2\4\uffff";
	static final String DFA43_specialS =
		"\12\uffff\1\0\1\uffff}>";
	static final String[] DFA43_transitionS = {
			"\1\2\2\uffff\1\1\16\uffff\2\2\10\uffff\1\2\75\uffff\1\3",
			"\1\4",
			"",
			"",
			"\1\5\51\uffff\1\6",
			"\1\6",
			"\1\7\34\uffff\1\10",
			"",
			"\1\11\20\uffff\1\12\25\uffff\1\11",
			"\1\12\34\uffff\1\13",
			"\1\uffff",
			"\1\11\20\uffff\1\12\25\uffff\1\11"
	};

	static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
	static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
	static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
	static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
	static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
	static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
	static final short[][] DFA43_transition;

	static {
		int numStates = DFA43_transitionS.length;
		DFA43_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
		}
	}

	protected class DFA43 extends DFA {

		public DFA43(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 43;
			this.eot = DFA43_eot;
			this.eof = DFA43_eof;
			this.min = DFA43_min;
			this.max = DFA43_max;
			this.accept = DFA43_accept;
			this.special = DFA43_special;
			this.transition = DFA43_transition;
		}
		@Override
		public String getDescription() {
			return "190:1: aggregate_expression : ( aggregate_expression_function_name '(' ( DISTINCT )? path_expression ')' -> ^( T_AGGREGATE_EXPR[] aggregate_expression_function_name '(' ( 'DISTINCT' )? path_expression ')' ) | 'COUNT' '(' ( DISTINCT )? count_argument ')' -> ^( T_AGGREGATE_EXPR[] 'COUNT' '(' ( 'DISTINCT' )? count_argument ')' ) | function_invocation );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA43_10 = input.LA(1);
						 
						int index43_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred51_JPA2()) ) {s = 2;}
						else if ( (synpred53_JPA2()) ) {s = 7;}
						 
						input.seek(index43_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 43, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA49_eotS =
		"\15\uffff";
	static final String DFA49_eofS =
		"\1\uffff\1\5\2\uffff\1\5\4\uffff\4\5";
	static final String DFA49_minS =
		"\1\65\1\5\2\65\1\5\2\uffff\2\37\4\5";
	static final String DFA49_maxS =
		"\1\u0082\1\74\2\65\1\72\2\uffff\2\37\1\74\3\72";
	static final String DFA49_acceptS =
		"\5\uffff\1\1\1\2\6\uffff";
	static final String DFA49_specialS =
		"\15\uffff}>";
	static final String[] DFA49_transitionS = {
			"\1\1\56\uffff\1\2\35\uffff\1\3",
			"\1\5\4\uffff\1\6\57\uffff\1\5\1\uffff\1\4",
			"\1\7",
			"\1\10",
			"\1\5\4\uffff\1\6\3\uffff\1\11\46\uffff\1\11\4\uffff\1\5",
			"",
			"",
			"\1\12",
			"\1\13",
			"\1\5\4\uffff\1\6\57\uffff\1\5\1\uffff\1\14",
			"\1\5\4\uffff\1\6\57\uffff\1\5",
			"\1\5\4\uffff\1\6\57\uffff\1\5",
			"\1\5\4\uffff\1\6\3\uffff\1\11\46\uffff\1\11\4\uffff\1\5"
	};

	static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
	static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
	static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
	static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
	static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
	static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
	static final short[][] DFA49_transition;

	static {
		int numStates = DFA49_transitionS.length;
		DFA49_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
		}
	}

	protected class DFA49 extends DFA {

		public DFA49(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 49;
			this.eot = DFA49_eot;
			this.eof = DFA49_eof;
			this.min = DFA49_min;
			this.max = DFA49_max;
			this.accept = DFA49_accept;
			this.special = DFA49_special;
			this.transition = DFA49_transition;
		}
		@Override
		public String getDescription() {
			return "212:1: orderby_item : ( orderby_variable ( 'ASC' )? -> ^( T_ORDER_BY_FIELD[] orderby_variable ( 'ASC' )? ) | orderby_variable 'DESC' -> ^( T_ORDER_BY_FIELD[] orderby_variable 'DESC' ) );";
		}
	}

	public static final BitSet FOLLOW_select_statement_in_ql_statement430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_117_in_select_statement445 = new BitSet(new long[]{0x4AA0000607C40A40L,0xC6832945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_select_clause_in_select_statement447 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_from_clause_in_select_statement449 = new BitSet(new long[]{0x000000002000C002L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_where_clause_in_select_statement452 = new BitSet(new long[]{0x000000002000C002L});
	public static final BitSet FOLLOW_groupby_clause_in_select_statement457 = new BitSet(new long[]{0x0000000020008002L});
	public static final BitSet FOLLOW_having_clause_in_select_statement462 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_orderby_clause_in_select_statement467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_128_in_update_statement523 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_update_clause_in_update_statement525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_where_clause_in_update_statement528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_delete_statement541 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_delete_statement543 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_delete_clause_in_delete_statement545 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_where_clause_in_delete_statement548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_from_clause565 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_declaration_in_from_clause567 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_58_in_from_clause570 = new BitSet(new long[]{0x0020000000010000L});
	public static final BitSet FOLLOW_identification_variable_declaration_or_collection_member_declaration_in_from_clause572 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_identification_variable_declaration_in_identification_variable_declaration_or_collection_member_declaration606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_member_declaration_in_identification_variable_declaration_or_collection_member_declaration615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_variable_declaration_in_identification_variable_declaration639 = new BitSet(new long[]{0x00000000001A0002L});
	public static final BitSet FOLLOW_joined_clause_in_identification_variable_declaration641 = new BitSet(new long[]{0x00000000001A0002L});
	public static final BitSet FOLLOW_join_in_joined_clause668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fetch_join_in_joined_clause672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_name_in_range_variable_declaration684 = new BitSet(new long[]{0x0020000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_range_variable_declaration687 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_range_variable_declaration691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_spec_in_join720 = new BitSet(new long[]{0x0020000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_join_association_path_expression_in_join722 = new BitSet(new long[]{0x0020000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_join725 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_join729 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_join732 = new BitSet(new long[]{0x4AA000060FC40240L,0xC6810945407E0FE0L,0x00000000000000C2L});
	public static final BitSet FOLLOW_conditional_expression_in_join734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_spec_in_fetch_join765 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FETCH_in_fetch_join767 = new BitSet(new long[]{0x0020000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_join_association_path_expression_in_fetch_join769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_join_spec783 = new BitSet(new long[]{0x0000000040080000L});
	public static final BitSet FOLLOW_OUTER_in_join_spec787 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INNER_in_join_spec793 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_JOIN_in_join_spec798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_join_association_path_expression812 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_join_association_path_expression814 = new BitSet(new long[]{0x0020000000004002L});
	public static final BitSet FOLLOW_field_in_join_association_path_expression817 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_join_association_path_expression818 = new BitSet(new long[]{0x0020000000004002L});
	public static final BitSet FOLLOW_field_in_join_association_path_expression822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_125_in_join_association_path_expression857 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_join_association_path_expression859 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_join_association_path_expression861 = new BitSet(new long[]{0x0020000000004000L,0x0000000000004000L});
	public static final BitSet FOLLOW_field_in_join_association_path_expression864 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_join_association_path_expression865 = new BitSet(new long[]{0x0020000000004000L,0x0000000000004000L});
	public static final BitSet FOLLOW_field_in_join_association_path_expression869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_join_association_path_expression872 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_subtype_in_join_association_path_expression874 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_join_association_path_expression876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_name_in_join_association_path_expression909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_collection_member_declaration922 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_collection_member_declaration923 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_path_expression_in_collection_member_declaration925 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_collection_member_declaration927 = new BitSet(new long[]{0x0020000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_collection_member_declaration930 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_collection_member_declaration934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_map_field_identification_variable_in_qualified_identification_variable963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_qualified_identification_variable971 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_qualified_identification_variable972 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_qualified_identification_variable973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_map_field_identification_variable980 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_map_field_identification_variable981 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_map_field_identification_variable982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_130_in_map_field_identification_variable986 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_map_field_identification_variable987 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_map_field_identification_variable988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_path_expression1002 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_path_expression1004 = new BitSet(new long[]{0x0020000000004002L});
	public static final BitSet FOLLOW_field_in_path_expression1007 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_path_expression1008 = new BitSet(new long[]{0x0020000000004002L});
	public static final BitSet FOLLOW_field_in_path_expression1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_general_identification_variable1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_map_field_identification_variable_in_general_identification_variable1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_name_in_update_clause1070 = new BitSet(new long[]{0x0020000000000000L,0x0040000000004000L});
	public static final BitSet FOLLOW_78_in_update_clause1074 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_update_clause1078 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_118_in_update_clause1082 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_update_item_in_update_clause1084 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_58_in_update_clause1087 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_update_item_in_update_clause1089 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_update_item1103 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_update_item1104 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_single_valued_embeddable_object_field_in_update_item1107 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_update_item1108 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_single_valued_object_field_in_update_item1111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_update_item1113 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6818945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_new_value_in_update_item1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_new_value1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_entity_expression_in_new_value1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_111_in_new_value1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_name_in_delete_clause1153 = new BitSet(new long[]{0x0020000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_delete_clause1157 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_delete_clause1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISTINCT_in_select_clause1175 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6832945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_select_item_in_select_clause1179 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_58_in_select_clause1182 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6832945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_select_item_in_select_clause1184 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_select_expression_in_select_item1227 = new BitSet(new long[]{0x0020000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_select_item1231 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_result_variable_in_select_item1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_select_expression1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_select_expression1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_select_expression1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_select_expression1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_select_expression1290 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_select_expression1292 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_select_expression1293 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_select_expression1294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constructor_expression_in_select_expression1302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_constructor_expression1313 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_constructor_name_in_constructor_expression1315 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_constructor_expression1317 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_constructor_item_in_constructor_expression1319 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_58_in_constructor_expression1322 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_constructor_item_in_constructor_expression1324 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_constructor_expression1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_constructor_item1339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_constructor_item1347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_constructor_item1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_constructor_item1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_function_name_in_aggregate_expression1374 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_aggregate_expression1376 = new BitSet(new long[]{0x0020000000000800L});
	public static final BitSet FOLLOW_DISTINCT_in_aggregate_expression1378 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_path_expression_in_aggregate_expression1382 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_aggregate_expression1383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_aggregate_expression1417 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_aggregate_expression1419 = new BitSet(new long[]{0x0020000000000800L});
	public static final BitSet FOLLOW_DISTINCT_in_aggregate_expression1421 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_count_argument_in_aggregate_expression1425 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_aggregate_expression1427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_aggregate_expression1462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_count_argument1499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_count_argument1503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_132_in_where_clause1516 = new BitSet(new long[]{0x4AA000060FC40240L,0xC6810945407E0FE0L,0x00000000000000C2L});
	public static final BitSet FOLLOW_conditional_expression_in_where_clause1518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupby_clause1540 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BY_in_groupby_clause1542 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_groupby_item_in_groupby_clause1544 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_58_in_groupby_clause1547 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_groupby_item_in_groupby_clause1549 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_path_expression_in_groupby_item1583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_groupby_item1587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HAVING_in_having_clause1598 = new BitSet(new long[]{0x4AA000060FC40240L,0xC6810945407E0FE0L,0x00000000000000C2L});
	public static final BitSet FOLLOW_conditional_expression_in_having_clause1600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDER_in_orderby_clause1611 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BY_in_orderby_clause1613 = new BitSet(new long[]{0x0020000000000000L,0x0000001000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_orderby_item_in_orderby_clause1615 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_58_in_orderby_clause1618 = new BitSet(new long[]{0x0020000000000000L,0x0000001000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_orderby_item_in_orderby_clause1620 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_orderby_variable_in_orderby_item1654 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASC_in_orderby_item1657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orderby_variable_in_orderby_item1689 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DESC_in_orderby_item1692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_orderby_variable1721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_identification_variable_in_orderby_variable1725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_result_variable_in_orderby_variable1729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_subquery1743 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_subquery1745 = new BitSet(new long[]{0x4AA0000607C40A40L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_simple_select_clause_in_subquery1747 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_subquery_from_clause_in_subquery1749 = new BitSet(new long[]{0x000000008000C000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_where_clause_in_subquery1752 = new BitSet(new long[]{0x000000008000C000L});
	public static final BitSet FOLLOW_groupby_clause_in_subquery1757 = new BitSet(new long[]{0x0000000080008000L});
	public static final BitSet FOLLOW_having_clause_in_subquery1762 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_subquery1768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_subquery_from_clause1818 = new BitSet(new long[]{0x0020000000010000L,0x2000000000000000L});
	public static final BitSet FOLLOW_subselect_identification_variable_declaration_in_subquery_from_clause1820 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_58_in_subquery_from_clause1823 = new BitSet(new long[]{0x0020000000010000L,0x2000000000000000L});
	public static final BitSet FOLLOW_subselect_identification_variable_declaration_in_subquery_from_clause1825 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_identification_variable_declaration_in_subselect_identification_variable_declaration1863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derived_path_expression_in_subselect_identification_variable_declaration1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_subselect_identification_variable_declaration1873 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_subselect_identification_variable_declaration1875 = new BitSet(new long[]{0x00000000001A0002L});
	public static final BitSet FOLLOW_join_in_subselect_identification_variable_declaration1878 = new BitSet(new long[]{0x00000000001A0002L});
	public static final BitSet FOLLOW_derived_collection_member_declaration_in_subselect_identification_variable_declaration1888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_derived_path_in_derived_path_expression1899 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_derived_path_expression1900 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_single_valued_object_field_in_derived_path_expression1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_derived_path_in_derived_path_expression1909 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_derived_path_expression1910 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_collection_valued_field_in_derived_path_expression1911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_derived_path_in_general_derived_path1922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_treated_derived_path_in_general_derived_path1930 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_60_in_general_derived_path1932 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_single_valued_object_field_in_general_derived_path1933 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_superquery_identification_variable_in_simple_derived_path1951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_125_in_treated_derived_path1968 = new BitSet(new long[]{0x0020000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_general_derived_path_in_treated_derived_path1969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_treated_derived_path1971 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_subtype_in_treated_derived_path1973 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_treated_derived_path1975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_derived_collection_member_declaration1986 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_superquery_identification_variable_in_derived_collection_member_declaration1988 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_derived_collection_member_declaration1989 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_single_valued_object_field_in_derived_collection_member_declaration1991 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_derived_collection_member_declaration1993 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_collection_valued_field_in_derived_collection_member_declaration1996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISTINCT_in_simple_select_clause2009 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_simple_select_expression_in_simple_select_clause2013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_simple_select_expression2053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_simple_select_expression2061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_simple_select_expression2069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_simple_select_expression2077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_scalar_expression2088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_scalar_expression2096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_expression_in_scalar_expression2104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_expression_in_scalar_expression2112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expression_in_scalar_expression2120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_scalar_expression2128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_type_expression_in_scalar_expression2136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_term_in_conditional_expression2148 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_OR_in_conditional_expression2152 = new BitSet(new long[]{0x4AA000060FC40240L,0xC6810945407E0FE0L,0x00000000000000C2L});
	public static final BitSet FOLLOW_conditional_term_in_conditional_expression2154 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_conditional_factor_in_conditional_term2168 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_conditional_term2172 = new BitSet(new long[]{0x4AA000060FC40240L,0xC6810945407E0FE0L,0x00000000000000C2L});
	public static final BitSet FOLLOW_conditional_factor_in_conditional_term2174 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_NOT_in_conditional_factor2188 = new BitSet(new long[]{0x4AA000060FC40240L,0xC6810945407E0FE0L,0x00000000000000C2L});
	public static final BitSet FOLLOW_conditional_primary_in_conditional_factor2192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_cond_expression_in_conditional_primary2203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditional_primary2227 = new BitSet(new long[]{0x4AA000060FC40240L,0xC6810945407E0FE0L,0x00000000000000C2L});
	public static final BitSet FOLLOW_conditional_expression_in_conditional_primary2228 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_conditional_primary2229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_expression_in_simple_cond_expression2240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_between_expression_in_simple_cond_expression2248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_expression_in_simple_cond_expression2256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_expression_in_simple_cond_expression2264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_null_comparison_expression_in_simple_cond_expression2272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_collection_comparison_expression_in_simple_cond_expression2280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_member_expression_in_simple_cond_expression2288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exists_expression_in_simple_cond_expression2296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_macro_expression_in_simple_cond_expression2304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_between_macro_expression_in_date_macro_expression2317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_before_macro_expression_in_date_macro_expression2325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_after_macro_expression_in_date_macro_expression2333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_equals_macro_expression_in_date_macro_expression2341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_today_macro_expression_in_date_macro_expression2349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_date_between_macro_expression2361 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_date_between_macro_expression2363 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_path_expression_in_date_between_macro_expression2365 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_date_between_macro_expression2367 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_110_in_date_between_macro_expression2369 = new BitSet(new long[]{0x0E00000000000000L});
	public static final BitSet FOLLOW_set_in_date_between_macro_expression2372 = new BitSet(new long[]{0x4000000000040000L});
	public static final BitSet FOLLOW_numeric_literal_in_date_between_macro_expression2380 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_date_between_macro_expression2384 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_110_in_date_between_macro_expression2386 = new BitSet(new long[]{0x0E00000000000000L});
	public static final BitSet FOLLOW_set_in_date_between_macro_expression2389 = new BitSet(new long[]{0x4000000000040000L});
	public static final BitSet FOLLOW_numeric_literal_in_date_between_macro_expression2397 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_date_between_macro_expression2401 = new BitSet(new long[]{0x0000000000000000L,0x0010140200800000L,0x0000000000000020L});
	public static final BitSet FOLLOW_set_in_date_between_macro_expression2403 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_date_between_macro_expression2426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_date_before_macro_expression2438 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_date_before_macro_expression2440 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_path_expression_in_date_before_macro_expression2442 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_date_before_macro_expression2444 = new BitSet(new long[]{0x00A0000004000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_path_expression_in_date_before_macro_expression2447 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_input_parameter_in_date_before_macro_expression2451 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_date_before_macro_expression2454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_date_after_macro_expression2466 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_date_after_macro_expression2468 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_path_expression_in_date_after_macro_expression2470 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_date_after_macro_expression2472 = new BitSet(new long[]{0x00A0000004000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_path_expression_in_date_after_macro_expression2475 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_input_parameter_in_date_after_macro_expression2479 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_date_after_macro_expression2482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_date_equals_macro_expression2494 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_date_equals_macro_expression2496 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_path_expression_in_date_equals_macro_expression2498 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_date_equals_macro_expression2500 = new BitSet(new long[]{0x00A0000004000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_path_expression_in_date_equals_macro_expression2503 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_input_parameter_in_date_equals_macro_expression2507 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_date_equals_macro_expression2510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_date_today_macro_expression2522 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_date_today_macro_expression2524 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_path_expression_in_date_today_macro_expression2526 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_date_today_macro_expression2528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_between_expression2541 = new BitSet(new long[]{0x0000000008000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_NOT_in_between_expression2544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_between_expression2548 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_between_expression2550 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_between_expression2552 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_between_expression2554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_between_expression2562 = new BitSet(new long[]{0x0000000008000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_NOT_in_between_expression2565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_between_expression2569 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_between_expression2571 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_between_expression2573 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_between_expression2575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_expression_in_between_expression2583 = new BitSet(new long[]{0x0000000008000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_NOT_in_between_expression2586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_between_expression2590 = new BitSet(new long[]{0x00A0000407800240L,0x0001000100760020L});
	public static final BitSet FOLLOW_datetime_expression_in_between_expression2592 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_between_expression2594 = new BitSet(new long[]{0x00A0000407800240L,0x0001000100760020L});
	public static final BitSet FOLLOW_datetime_expression_in_between_expression2596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_in_expression2608 = new BitSet(new long[]{0x0000000008010000L});
	public static final BitSet FOLLOW_type_discriminator_in_in_expression2612 = new BitSet(new long[]{0x0000000008010000L});
	public static final BitSet FOLLOW_identification_variable_in_in_expression2616 = new BitSet(new long[]{0x0000000008010000L});
	public static final BitSet FOLLOW_NOT_in_in_expression2620 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IN_in_in_expression2624 = new BitSet(new long[]{0x0080000004800000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LPAREN_in_in_expression2640 = new BitSet(new long[]{0x00A0000004000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_in_item_in_in_expression2642 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_58_in_in_expression2645 = new BitSet(new long[]{0x00A0000004000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_in_item_in_in_expression2647 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_in_expression2651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_in_expression2667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_valued_input_parameter_in_in_expression2683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_in_expression2699 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_path_expression_in_in_expression2701 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_in_expression2703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_in_item2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_valued_input_parameter_in_in_item2735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_like_expression2746 = new BitSet(new long[]{0x0000000008000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_NOT_in_like_expression2749 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_103_in_like_expression2753 = new BitSet(new long[]{0x0080000204000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_pattern_value_in_like_expression2756 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_input_parameter_in_like_expression2760 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_like_expression2763 = new BitSet(new long[]{0x0000000A00000000L});
	public static final BitSet FOLLOW_escape_character_in_like_expression2765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_null_comparison_expression2779 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_input_parameter_in_null_comparison_expression2783 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_null_comparison_expression2786 = new BitSet(new long[]{0x0000000008000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_NOT_in_null_comparison_expression2789 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_111_in_null_comparison_expression2793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_empty_collection_comparison_expression2804 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_empty_collection_comparison_expression2806 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_NOT_in_empty_collection_comparison_expression2809 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_empty_collection_comparison_expression2813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_or_value_expression_in_collection_member_expression2824 = new BitSet(new long[]{0x0000000008000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_NOT_in_collection_member_expression2828 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_collection_member_expression2832 = new BitSet(new long[]{0x0020000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_collection_member_expression2835 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_path_expression_in_collection_member_expression2839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_entity_or_value_expression2850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_entity_or_value_expression_in_entity_or_value_expression2858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_simple_entity_or_value_expression2869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_simple_entity_or_value_expression2877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_simple_entity_or_value_expression2885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_exists_expression2897 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_exists_expression2901 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_subquery_in_exists_expression2903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_all_or_any_expression2914 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_subquery_in_all_or_any_expression2927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_comparison_expression2938 = new BitSet(new long[]{0x8000000000000000L,0x000000000000001FL});
	public static final BitSet FOLLOW_comparison_operator_in_comparison_expression2940 = new BitSet(new long[]{0x00A0000607C00240L,0x45010001000E3020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_comparison_expression2943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_comparison_expression2947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expression_in_comparison_expression2956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_comparison_expression2958 = new BitSet(new long[]{0x00A0000004800000L,0x0101000100063020L,0x00000000000000C0L});
	public static final BitSet FOLLOW_boolean_expression_in_comparison_expression2967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_comparison_expression2971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_expression_in_comparison_expression2980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_comparison_expression2982 = new BitSet(new long[]{0x00A0000004800000L,0x0101000000063020L});
	public static final BitSet FOLLOW_enum_expression_in_comparison_expression2989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_comparison_expression2993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_expression_in_comparison_expression3002 = new BitSet(new long[]{0x8000000000000000L,0x000000000000001FL});
	public static final BitSet FOLLOW_comparison_operator_in_comparison_expression3004 = new BitSet(new long[]{0x00A0000407800240L,0x0101000100763020L});
	public static final BitSet FOLLOW_datetime_expression_in_comparison_expression3007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_comparison_expression3011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_expression_in_comparison_expression3020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_comparison_expression3022 = new BitSet(new long[]{0x00A0000004000000L,0x0100000000003020L});
	public static final BitSet FOLLOW_entity_expression_in_comparison_expression3031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_comparison_expression3035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_type_expression_in_comparison_expression3044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_comparison_expression3046 = new BitSet(new long[]{0x00A0000004000000L,0x8000000000000020L});
	public static final BitSet FOLLOW_entity_type_expression_in_comparison_expression3054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_comparison_expression3062 = new BitSet(new long[]{0x8000000000000000L,0x000000000000001FL});
	public static final BitSet FOLLOW_comparison_operator_in_comparison_expression3064 = new BitSet(new long[]{0x4AA0000407840240L,0x0381094500063820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_comparison_expression3067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_comparison_expression3071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_term_in_arithmetic_expression3135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_term_in_arithmetic_expression3143 = new BitSet(new long[]{0x0A00000000000000L});
	public static final BitSet FOLLOW_set_in_arithmetic_expression3145 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_term_in_arithmetic_expression3153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_factor_in_arithmetic_term3164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_factor_in_arithmetic_term3172 = new BitSet(new long[]{0x2100000000000000L});
	public static final BitSet FOLLOW_set_in_arithmetic_term3174 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_factor_in_arithmetic_term3183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_primary_in_arithmetic_factor3206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_arithmetic_primary3217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_literal_in_arithmetic_primary3225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_arithmetic_primary3233 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_arithmetic_primary3234 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_arithmetic_primary3235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_arithmetic_primary3243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functions_returning_numerics_in_arithmetic_primary3251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_arithmetic_primary3259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_arithmetic_primary3267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_arithmetic_primary3275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_arithmetic_primary3283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_string_expression3294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_string_expression3302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_string_expression3310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functions_returning_strings_in_string_expression3318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_string_expression3326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_string_expression3334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_string_expression3342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_string_expression3350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_datetime_expression3361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_datetime_expression3369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functions_returning_datetime_in_datetime_expression3377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_datetime_expression3385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_datetime_expression3393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_datetime_expression3401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_time_timestamp_literal_in_datetime_expression3409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_datetime_expression3417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_boolean_expression3428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_literal_in_boolean_expression3436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_boolean_expression3444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_boolean_expression3452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_boolean_expression3460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_boolean_expression3468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_enum_expression3479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_literal_in_enum_expression3487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_enum_expression3495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_enum_expression3503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subquery_in_enum_expression3511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_entity_expression3522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_entity_expression_in_entity_expression3530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_simple_entity_expression3541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_simple_entity_expression3549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_discriminator_in_entity_type_expression3560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_type_literal_in_entity_type_expression3568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_entity_type_expression3576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_127_in_type_discriminator3587 = new BitSet(new long[]{0x00A0000004000000L,0x0000001000000020L,0x0000000000000004L});
	public static final BitSet FOLLOW_general_identification_variable_in_type_discriminator3589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_type_discriminator3593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_type_discriminator3597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_functions_returning_numerics3609 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_numerics3610 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_functions_returning_numerics3619 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_numerics3621 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_functions_returning_numerics3622 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_numerics3624 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_58_in_functions_returning_numerics3626 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_numerics3627 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_functions_returning_numerics3638 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_numerics3639 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_121_in_functions_returning_numerics3648 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_numerics3649 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_functions_returning_numerics3658 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_numerics3659 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_functions_returning_numerics3660 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_numerics3662 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_119_in_functions_returning_numerics3671 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_path_expression_in_functions_returning_numerics3672 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_functions_returning_numerics3681 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_identification_variable_in_functions_returning_numerics3682 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_numerics3683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_functions_returning_strings3721 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3722 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_functions_returning_strings3723 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3725 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_58_in_functions_returning_strings3728 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3730 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_strings3733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_122_in_functions_returning_strings3741 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3743 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_functions_returning_strings3744 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_strings3746 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_58_in_functions_returning_strings3749 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_functions_returning_strings3751 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_strings3754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_126_in_functions_returning_strings3762 = new BitSet(new long[]{0x00A0000E07C00240L,0x54010021800F0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_trim_specification_in_functions_returning_strings3765 = new BitSet(new long[]{0x0000000800000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_trim_character_in_functions_returning_strings3770 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_functions_returning_strings3774 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3778 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_strings3780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOWER_in_functions_returning_strings3788 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_functions_returning_strings3790 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3791 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_strings3792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_functions_returning_strings3800 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_functions_returning_strings3801 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_functions_returning_strings3802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_function_invocation3832 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_function_name_in_function_invocation3833 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_58_in_function_invocation3836 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_function_arg_in_function_invocation3838 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_function_invocation3842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_function_arg3853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_function_arg3861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_function_arg3869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_function_arg3877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_case_expression_in_case_expression3888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_case_expression_in_case_expression3896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_coalesce_expression_in_case_expression3904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nullif_expression_in_case_expression3912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_general_case_expression3923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_when_clause_in_general_case_expression3925 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_when_clause_in_general_case_expression3928 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_general_case_expression3932 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_scalar_expression_in_general_case_expression3934 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_general_case_expression3936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_131_in_when_clause3947 = new BitSet(new long[]{0x4AA000060FC40240L,0xC6810945407E0FE0L,0x00000000000000C2L});
	public static final BitSet FOLLOW_conditional_expression_in_when_clause3949 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_123_in_when_clause3951 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_scalar_expression_in_when_clause3953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_simple_case_expression3964 = new BitSet(new long[]{0x0020000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_case_operand_in_simple_case_expression3966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_simple_when_clause_in_simple_case_expression3968 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_simple_when_clause_in_simple_case_expression3971 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_simple_case_expression3975 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_scalar_expression_in_simple_case_expression3977 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_simple_case_expression3979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_case_operand3990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_discriminator_in_case_operand3998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_131_in_simple_when_clause4009 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_scalar_expression_in_simple_when_clause4011 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_123_in_simple_when_clause4013 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_scalar_expression_in_simple_when_clause4015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_coalesce_expression4026 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_scalar_expression_in_coalesce_expression4027 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_coalesce_expression4030 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_scalar_expression_in_coalesce_expression4032 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_coalesce_expression4035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_112_in_nullif_expression4046 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_scalar_expression_in_nullif_expression4047 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_nullif_expression4049 = new BitSet(new long[]{0x4AA0000607C40240L,0xC6810945007E0820L,0x00000000000000C2L});
	public static final BitSet FOLLOW_scalar_expression_in_nullif_expression4051 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_nullif_expression4052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_input_parameter4065 = new BitSet(new long[]{0x4000000000040000L});
	public static final BitSet FOLLOW_numeric_literal_in_input_parameter4067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMED_PARAMETER_in_input_parameter4090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_input_parameter4111 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_WORD_in_input_parameter4113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_136_in_input_parameter4115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_literal4143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_constructor_name4155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_enum_literal4167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_identification_variable4216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_parameter_name4228 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_60_in_parameter_name4231 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_WORD_in_parameter_name4234 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_TRIM_CHARACTER_in_trim_character4264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal4275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_numeric_literal4287 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_INT_NUMERAL_in_numeric_literal4291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_single_valued_object_field4303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_single_valued_embeddable_object_field4314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_collection_valued_field4325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_entity_name4336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_subtype4347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_entity_type_literal4358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_function_name4369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_state_field4380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_result_variable4391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_superquery_identification_variable4402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_date_time_timestamp_literal4413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_pattern_value4424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_collection_valued_input_parameter4435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_single_valued_input_parameter4446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_in_synpred18_JPA2822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_in_synpred27_JPA21012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_synpred33_JPA21126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_entity_expression_in_synpred34_JPA21134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_synpred41_JPA21248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_synpred42_JPA21256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_synpred43_JPA21274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_synpred44_JPA21282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_synpred47_JPA21339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_synpred48_JPA21347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_synpred49_JPA21355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_function_name_in_synpred51_JPA21374 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred51_JPA21376 = new BitSet(new long[]{0x0020000000000800L});
	public static final BitSet FOLLOW_DISTINCT_in_synpred51_JPA21378 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_path_expression_in_synpred51_JPA21382 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred51_JPA21383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_synpred53_JPA21417 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred53_JPA21419 = new BitSet(new long[]{0x0020000000000800L});
	public static final BitSet FOLLOW_DISTINCT_in_synpred53_JPA21421 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_count_argument_in_synpred53_JPA21425 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred53_JPA21427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_identification_variable_in_synpred65_JPA21725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_general_derived_path_in_synpred73_JPA21899 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_synpred73_JPA21900 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_single_valued_object_field_in_synpred73_JPA21901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_synpred78_JPA22053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_expression_in_synpred79_JPA22061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_synpred80_JPA22069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_synpred81_JPA22088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_synpred82_JPA22096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_expression_in_synpred83_JPA22104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_expression_in_synpred84_JPA22112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expression_in_synpred85_JPA22120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_case_expression_in_synpred86_JPA22128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_synpred89_JPA22188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_cond_expression_in_synpred90_JPA22203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_expression_in_synpred91_JPA22240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_between_expression_in_synpred92_JPA22248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_expression_in_synpred93_JPA22256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_expression_in_synpred94_JPA22264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_null_comparison_expression_in_synpred95_JPA22272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_collection_comparison_expression_in_synpred96_JPA22280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_member_expression_in_synpred97_JPA22288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_expression_in_synpred116_JPA22541 = new BitSet(new long[]{0x0000000008000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_NOT_in_synpred116_JPA22544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_synpred116_JPA22548 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_synpred116_JPA22550 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_synpred116_JPA22552 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_synpred116_JPA22554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_synpred118_JPA22562 = new BitSet(new long[]{0x0000000008000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_NOT_in_synpred118_JPA22565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_synpred118_JPA22569 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_synpred118_JPA22571 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_synpred118_JPA22573 = new BitSet(new long[]{0x00A0000607C00240L,0x44010001000E0020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_synpred118_JPA22575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identification_variable_in_synpred137_JPA22869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_synpred143_JPA22938 = new BitSet(new long[]{0x8000000000000000L,0x000000000000001FL});
	public static final BitSet FOLLOW_comparison_operator_in_synpred143_JPA22940 = new BitSet(new long[]{0x00A0000607C00240L,0x45010001000E3020L,0x0000000000000002L});
	public static final BitSet FOLLOW_string_expression_in_synpred143_JPA22943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_synpred143_JPA22947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_expression_in_synpred146_JPA22956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_synpred146_JPA22958 = new BitSet(new long[]{0x00A0000004800000L,0x0101000100063020L,0x00000000000000C0L});
	public static final BitSet FOLLOW_boolean_expression_in_synpred146_JPA22967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_synpred146_JPA22971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_expression_in_synpred149_JPA22980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_synpred149_JPA22982 = new BitSet(new long[]{0x00A0000004800000L,0x0101000000063020L});
	public static final BitSet FOLLOW_enum_expression_in_synpred149_JPA22989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_synpred149_JPA22993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datetime_expression_in_synpred151_JPA23002 = new BitSet(new long[]{0x8000000000000000L,0x000000000000001FL});
	public static final BitSet FOLLOW_comparison_operator_in_synpred151_JPA23004 = new BitSet(new long[]{0x00A0000407800240L,0x0101000100763020L});
	public static final BitSet FOLLOW_datetime_expression_in_synpred151_JPA23007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_synpred151_JPA23011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_expression_in_synpred154_JPA23020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_synpred154_JPA23022 = new BitSet(new long[]{0x00A0000004000000L,0x0100000000003020L});
	public static final BitSet FOLLOW_entity_expression_in_synpred154_JPA23031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_all_or_any_expression_in_synpred154_JPA23035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_entity_type_expression_in_synpred156_JPA23044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_synpred156_JPA23046 = new BitSet(new long[]{0x00A0000004000000L,0x8000000000000020L});
	public static final BitSet FOLLOW_entity_type_expression_in_synpred156_JPA23054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_term_in_synpred163_JPA23135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithmetic_factor_in_synpred165_JPA23164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred171_JPA23233 = new BitSet(new long[]{0x4AA0000407840240L,0x0281094500060820L});
	public static final BitSet FOLLOW_arithmetic_expression_in_synpred171_JPA23234 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred171_JPA23235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_synpred174_JPA23259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_synpred176_JPA23275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_synpred181_JPA23326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_synpred183_JPA23342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_expression_in_synpred184_JPA23361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_expression_in_synpred187_JPA23385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_invocation_in_synpred189_JPA23401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_time_timestamp_literal_in_synpred190_JPA23409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_synpred227_JPA23853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_parameter_in_synpred229_JPA23869 = new BitSet(new long[]{0x0000000000000002L});
}
