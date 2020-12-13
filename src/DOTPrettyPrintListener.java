import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class DOTPrettyPrintListener implements DOTListener
{
    int indentLevel = 0;
    String tab = " ";

    private void printIndent()
    {
        if (indentLevel == 0)
            return;

        for (int i = 0; i < indentLevel; i++)
        {
            System.out.print(tab);
        }
    }

    @Override
    public void enterGraph(DOTParser.GraphContext ctx)
    {
        System.out.print(ctx.children.get(0) + " ");
    }

    @Override
    public void exitGraph(DOTParser.GraphContext ctx)
    {
    }

    @Override
    public void enterStmt_list(DOTParser.Stmt_listContext ctx)
    {
        printIndent();
        System.out.println("{");
        indentLevel++;
    }

    @Override
    public void exitStmt_list(DOTParser.Stmt_listContext ctx)
    {
        indentLevel--;
        printIndent();
        System.out.println("}");
    }

    @Override
    public void enterStmt(DOTParser.StmtContext ctx)
    {

    }

    @Override
    public void exitStmt(DOTParser.StmtContext ctx)
    {

    }

    @Override
    public void enterAttr_stmt(DOTParser.Attr_stmtContext ctx) {

    }

    @Override
    public void exitAttr_stmt(DOTParser.Attr_stmtContext ctx) {

    }

    @Override
    public void enterAttr_list(DOTParser.Attr_listContext ctx) {
        System.out.print(" [");
    }

    @Override
    public void exitAttr_list(DOTParser.Attr_listContext ctx) {
        System.out.print("]");
    }

    @Override
    public void enterEnd_line(DOTParser.End_lineContext ctx) {
        System.out.println(";");
    }

    @Override
    public void exitEnd_line(DOTParser.End_lineContext ctx) {

    }

    @Override
    public void enterComma(DOTParser.CommaContext ctx) {
        System.out.print(", ");
    }

    @Override
    public void exitComma(DOTParser.CommaContext ctx) {

    }

    @Override
    public void enterAssign(DOTParser.AssignContext ctx) {
        System.out.print(" = ");
    }

    @Override
    public void exitAssign(DOTParser.AssignContext ctx) {

    }

    @Override
    public void enterA_list(DOTParser.A_listContext ctx) {

    }

    @Override
    public void exitA_list(DOTParser.A_listContext ctx) {

    }

    @Override
    public void enterA_list_prop(DOTParser.A_list_propContext ctx) {

    }

    @Override
    public void exitA_list_prop(DOTParser.A_list_propContext ctx) {

    }

    @Override
    public void enterProperty(DOTParser.PropertyContext ctx)
    {
        printIndent();
        //System.out.println(ctx.children.get(0).getText() + " = " + ctx.children.get(2).getText() + ";");
    }

    @Override
    public void exitProperty(DOTParser.PropertyContext ctx)
    {

    }

    @Override
    public void enterEdge_stmt(DOTParser.Edge_stmtContext ctx) {
        printIndent();
    }

    @Override
    public void exitEdge_stmt(DOTParser.Edge_stmtContext ctx) {

    }

    @Override
    public void enterEdgeRHS(DOTParser.EdgeRHSContext ctx) {

    }

    @Override
    public void exitEdgeRHS(DOTParser.EdgeRHSContext ctx) {

    }

    @Override
    public void enterEdgeop(DOTParser.EdgeopContext ctx)
    {
        System.out.print(" -> ");
    }

    @Override
    public void exitEdgeop(DOTParser.EdgeopContext ctx) {

    }

    @Override
    public void enterNode_stmt(DOTParser.Node_stmtContext ctx) {

    }

    @Override
    public void exitNode_stmt(DOTParser.Node_stmtContext ctx) {

    }

    @Override
    public void enterNode_id(DOTParser.Node_idContext ctx) {

    }

    @Override
    public void exitNode_id(DOTParser.Node_idContext ctx) {

    }

    @Override
    public void enterPort(DOTParser.PortContext ctx) {

    }

    @Override
    public void exitPort(DOTParser.PortContext ctx) {

    }

    @Override
    public void enterSubgraph(DOTParser.SubgraphContext ctx)
    {
        printIndent();
        System.out.print(ctx.children.get(0) + " " );
    }

    @Override
    public void exitSubgraph(DOTParser.SubgraphContext ctx)
    {

    }

    @Override
    public void enterId(DOTParser.IdContext ctx)
    {
        System.out.print(ctx.children.get(0).getText());
    }

    @Override
    public void exitId(DOTParser.IdContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
