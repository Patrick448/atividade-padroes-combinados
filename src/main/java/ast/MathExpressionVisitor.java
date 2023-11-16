package ast;

import java.util.Stack;

public class MathExpressionVisitor implements Visitor{

    String result = "";
    Stack<String> stack = new Stack<>();

    public void visit(AbstractSyntaxTree tree) {
        tree.getRoot().accept(this);
    }

    @Override
    public void visit(Addition node) {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        String right = stack.pop();
        String left = stack.pop();
        stack.push("(" + left + " + " + right + ")");
    }

    @Override
    public void visit(Division node) {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        String right = stack.pop();
        String left = stack.pop();
        stack.push("(" + left + " / " + right + ")");
    }

    @Override
    public void visit(Multiplication node) {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        String right = stack.pop();
        String left = stack.pop();
        stack.push("(" + left + " * " + right + ")");
    }

    @Override
    public void visit(Number node) {
        stack.push(String.valueOf(node.getValue()));
    }

    @Override
    public void visit(Subtraction node) {
        node.getLeft().accept(this);
        node.getRight().accept(this);
        String right = stack.pop();
        String left = stack.pop();
        stack.push("(" + left + " - " + right + ")");
    }

    @Override
    public String getResult() {

        if(!stack.isEmpty())
            result = stack.pop();

        return result;
    }
}
