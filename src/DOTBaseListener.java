// Generated from C:\Users\legol\Documents\Platteville\Senior Year\PLS\ANTLRParser\DOT.g4 by ANTLR 4.9

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class will handle the printing of when a token
 * is recognized and when it is finished.
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
		System.out.println("Finish recognizing a cluster");
	}

	@Override public void enterA_list_prop(DOTParser.A_list_propContext ctx)
	{
		System.out.println("Start recognizing a property");
	}

	@Override public void exitA_list_prop(DOTParser.A_list_propContext ctx)
	{
		System.out.println("Finish recognizing a property");
	}

	@Override public void enterProperty(DOTParser.PropertyContext ctx)
	{
		System.out.println("Start recognizing a property");
	}

	@Override public void exitProperty(DOTParser.PropertyContext ctx)
	{
		System.out.println("Finish recognizing a property");
	}

	@Override public void enterEdge_stmt(DOTParser.Edge_stmtContext ctx)
	{
		System.out.println("Start recognizing an edge statement");
	}

	@Override public void exitEdge_stmt(DOTParser.Edge_stmtContext ctx)
	{
		System.out.println("Finish recognizing an edge statement");
	}

	@Override public void enterSubgraph(DOTParser.SubgraphContext ctx)
	{
		System.out.println("Start recognizing a subgraph");
	}

	@Override public void exitSubgraph(DOTParser.SubgraphContext ctx)
	{
		System.out.println("Finish recognizing a subgraph");
	}

	@Override public void enterStmt(DOTParser.StmtContext ctx) { }

	@Override public void exitStmt(DOTParser.StmtContext ctx) { }

	@Override public void enterAttr_stmt(DOTParser.Attr_stmtContext ctx) { }

	@Override public void exitAttr_stmt(DOTParser.Attr_stmtContext ctx) { }

	@Override public void enterAttr_list(DOTParser.Attr_listContext ctx) { }

	@Override public void exitAttr_list(DOTParser.Attr_listContext ctx) { }

	@Override
	public void enterEnd_line(DOTParser.End_lineContext ctx) {

	}

	@Override
	public void exitEnd_line(DOTParser.End_lineContext ctx) {

	}

	@Override
	public void enterComma(DOTParser.CommaContext ctx) {

	}

	@Override
	public void exitComma(DOTParser.CommaContext ctx) {

	}

	@Override
	public void enterAssign(DOTParser.AssignContext ctx) {

	}

	@Override
	public void exitAssign(DOTParser.AssignContext ctx) {

	}

	@Override public void enterA_list(DOTParser.A_listContext ctx) { }

	@Override public void exitA_list(DOTParser.A_listContext ctx) { }

	@Override public void enterEdgeRHS(DOTParser.EdgeRHSContext ctx) { }

	@Override public void exitEdgeRHS(DOTParser.EdgeRHSContext ctx) { }

	@Override public void enterEdgeop(DOTParser.EdgeopContext ctx) { }

	@Override public void exitEdgeop(DOTParser.EdgeopContext ctx) { }

	@Override public void enterNode_stmt(DOTParser.Node_stmtContext ctx) { }

	@Override public void exitNode_stmt(DOTParser.Node_stmtContext ctx) { }

	@Override public void enterNode_id(DOTParser.Node_idContext ctx) { }

	@Override public void exitNode_id(DOTParser.Node_idContext ctx) { }

	@Override public void enterPort(DOTParser.PortContext ctx) { }

	@Override public void exitPort(DOTParser.PortContext ctx) { }

	@Override public void enterId(DOTParser.IdContext ctx) { }

	@Override public void exitId(DOTParser.IdContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) { }

	@Override public void visitTerminal(TerminalNode node) { }

	@Override public void visitErrorNode(ErrorNode node) { }
}