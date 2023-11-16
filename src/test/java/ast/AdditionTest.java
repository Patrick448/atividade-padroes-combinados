package ast;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {

    @Test
    void deveRetornarResultadoSoma(){
        Node expr = new Addition(new Number(2), new Number(3));
        assertEquals(5, expr.evaluate());
    }

    @Test
    void deveRetornarExpressaoSoma(){
        Node expr = new Addition(new Number(2), new Number(3));
        MathExpressionVisitor visitor = new MathExpressionVisitor();
        expr.accept(visitor);
        assertEquals("(2 + 3)", visitor.getResult());
    }

}