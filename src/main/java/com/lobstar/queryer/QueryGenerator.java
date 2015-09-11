package com.lobstar.queryer;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.elasticsearch.index.query.FilterBuilder;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.QueryBuilder;

import com.lobstar.queryer.queryCmdParser.queryCmd_return;

public class QueryGenerator {
	 public static String formatCmd(String cmd) {
	        return "(" + cmd + ")";
	    }

	    public static QueryBuilder generateQuery(String cmd) throws RecognitionException {
	        cmd = formatCmd(cmd);
	        ANTLRStringStream antlrStringStream = new ANTLRStringStream(cmd);
	        queryCmdLexer lex = new queryCmdLexer(antlrStringStream);
	        CommonTokenStream tokens = new CommonTokenStream(lex);

	        queryCmdParser g = new queryCmdParser(tokens);
	        queryCmd_return queryCmd = g.queryCmd();
	        CommonTree tree = (CommonTree) queryCmd.getTree();
	        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
	        nodes.setTokenStream(tokens);
	        cmdParser e_walker = new cmdParser(nodes);
	        QueryBuilder query = e_walker.atom();

	        return query;

	    }

	    public static FilterBuilder generateFilter(String cmd) throws RecognitionException {
	        return FilterBuilders.queryFilter(generateQuery(cmd));
	    }

	    public static void main(String[] args) throws Exception {
	        System.out.println(generateQuery("admin=d的"));
	    }
}
