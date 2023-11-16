package ast;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionTest {

    @Test
    void deveRetornarResultadoSoma(){
        Node expr = new Subtraction(new Number(3), new Number(3));
        assertEquals(0, expr.evaluate());
    }

    @Test
    void deveRetornarExpressaoSoma(){
        Node expr = new Subtraction(new Number(6), new Number(3));
        MathExpressionVisitor visitor = new MathExpressionVisitor();
        expr.accept(visitor);
        assertEquals("(6 - 3)", visitor.getResult());
    }

}