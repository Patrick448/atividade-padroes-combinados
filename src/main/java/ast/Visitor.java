package ast;

public interface Visitor {



    public void visit(AbstractSyntaxTree tree);
    public void visit(Addition node);
    public void visit(Division node);
    public void visit(Multiplication node);
    public void visit(Number node);
    public void visit(Subtraction node);
    public String getResult();

}
