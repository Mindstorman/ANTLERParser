import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class DOTPrettyPrintListener implements ParseTreeListener
{
    public DOTPrettyPrintListener()
    {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode)
    {
        //System.out.println("This is a terminal");
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode)
    {
        //System.out.println("This is an Error");
    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext)
    {
        //System.out.println("Entering a rule");
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext)
    {
        //System.out.println("Exiting a rule");
    }
}
