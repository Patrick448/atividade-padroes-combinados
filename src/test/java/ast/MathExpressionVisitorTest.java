package ast;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathExpressionVisitorTest {

    @Test
    void deveRetornarExpressao(){
        Node expr = new Addition(new Number(2), new Number(3));
        Node expr2 = new Multiplication(expr, new Number(10));
        Node expr3 = new Division(expr2, new Number(2));
        Node expr4 = new Subtraction(expr3, new Number(5));
        AbstractSyntaxTree ast = new AbstractSyntaxTree(expr4);
        MathExpressionVisitor visitor = new MathExpressionVisitor();
        ast.accept(visitor);

        assertEquals("((((2 + 3) * 10) / 2) - 5)", visitor.getResult());
    }

}