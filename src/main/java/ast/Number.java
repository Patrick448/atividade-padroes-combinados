package ast;

public class Number extends Node{

    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
