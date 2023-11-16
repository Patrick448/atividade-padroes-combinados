package ast;

public class Multiplication extends Node{

    private Node left;
    private Node right;

    public Multiplication(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
