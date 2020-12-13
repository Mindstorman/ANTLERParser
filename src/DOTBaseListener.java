// Generated from C:\Users\legol\Documents\Platteville\Senior Year\PLS\ANTLRParser\DOT.g4 by ANTLR 4.9

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link DOTListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class DOTBaseListener implements DOTListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterGraph(DOTParser.GraphContext ctx)
	{
		System.out.println("Start recognizing a digraph");
	}

	@Override public void exitGraph(DOTParser.GraphContext ctx)
	{
		System.out.println("Finish recognizing a digraph");
	}
	@Override public void enterStmt_list(DOTParser.Stmt_listContext ctx)
	{
		System.out.println("Start recognizing a cluster");
	}

	@Override public void exitStmt_list(DOTParser.Stmt_listContext ctx)
	{
		System.out.println("Finish recognizing a cluser");
	}

	@Override public void enterStmt(DOTParser.StmtContext ctx)
	{
		//System.out.println("Start recognizing an edge statement");
		//System.out.println("Jenny thinks this a cluster");
	}

	@Override public void exitStmt(DOTParser.StmtContext ctx)
	{
		//System.out.println("Finish recognizing an edge statement");
	}

	@Override public void enterAttr_stmt(DOTParser.Attr_stmtContext ctx)
	{
		//System.out.println("Start recognizing a property");
	}

	@Override public void exitAttr_stmt(DOTParser.Attr_stmtContext ctx)
	{
		//System.out.println("Finish recognizing a property");
	}

	@Override public void enterAttr_list(DOTParser.Attr_listContext ctx)
	{
		//System.out.println("Finish recognizing a ");
	}

	@Override public void exitAttr_list(DOTParser.Attr_listContext ctx)
	{
		//System.out.println("Finish recognizing a ");
	}

	@Override public void enterA_list(DOTParser.A_listContext ctx)
	{
		System.out.println("Start recognizing a property");
	}

	@Override public void exitA_list(DOTParser.A_listContext ctx)
	{
		System.out.println("Finish recognizing a property");
	}

	@Override public void enterEdge_stmt(DOTParser.Edge_stmtContext ctx)
	{
		System.out.println("Start recognizing an edge statement ");
	}

	@Override public void exitEdge_stmt(DOTParser.Edge_stmtContext ctx)
	{
		System.out.println("Finish recognizing an edge statement ");
	}

	@Override public void enterEdgeRHS(DOTParser.EdgeRHSContext ctx)
	{
		//System.out.println("Finish recognizing a ennter EDGE RHS");
	}

	@Override public void exitEdgeRHS(DOTParser.EdgeRHSContext ctx)
	{
		//System.out.println("Finish recognizing a ");
	}

	@Override public void enterEdgeop(DOTParser.EdgeopContext ctx)
	{
		//System.out.println("Finish recognizing a EDGE OP");
	}

	@Override public void exitEdgeop(DOTParser.EdgeopContext ctx)
	{
		//System.out.println("Finish recognizing a ");
	}

	@Override public void enterNode_stmt(DOTParser.Node_stmtContext ctx)
	{
		//System.out.println("Start recognizing a NODE???");
	}

	@Override public void exitNode_stmt(DOTParser.Node_stmtContext ctx)
	{
		//System.out.println("Finish recognizing a NODE???");
	}

	@Override public void enterNode_id(DOTParser.Node_idContext ctx)
	{
		//System.out.println("Finish recognizing a ");
	}

	@Override public void exitNode_id(DOTParser.Node_idContext ctx)
	{
		//System.out.println("Finish recognizing a ");
	}

	@Override public void enterPort(DOTParser.PortContext ctx)
	{
		//System.out.println("Start recognizing a Port");
	}

	@Override public void exitPort(DOTParser.PortContext ctx)
	{
		//System.out.println("Finish recognizing a ");
	}

	@Override public void enterSubgraph(DOTParser.SubgraphContext ctx)
	{
		System.out.println("Start recognizing a subgraph");
	}

	@Override public void exitSubgraph(DOTParser.SubgraphContext ctx)
	{
		System.out.println("Finish recognizing a subgraph");
	}

	@Override public void enterId(DOTParser.IdContext ctx)
	{
		//System.out.println("Finish recognizing a ");
	}

	@Override public void exitId(DOTParser.IdContext ctx)
	{
		//System.out.println("Finish recognizing a ");
	}

	@Override public void enterEveryRule(ParserRuleContext ctx)
	{
		//System.out.println("Finish recognizing a ");
	}

	@Override public void exitEveryRule(ParserRuleContext ctx)
	{
		//System.out.println("Finish recognizing a ");
	}

	@Override public void visitTerminal(TerminalNode node)
	{
		//System.out.println("Finish recognizing a ");
	}

	@Override public void visitErrorNode(ErrorNode node)
	{
		//System.out.println("Finish recognizing a ");
	}
}