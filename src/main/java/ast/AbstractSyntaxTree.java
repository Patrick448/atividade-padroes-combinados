package ast;

public class AbstractSyntaxTree implements Visitable{
    private Node root;

    public AbstractSyntaxTree(Node root) {
        this.root = root;
    }

    public int evaluate() {
        return root.evaluate();
    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
