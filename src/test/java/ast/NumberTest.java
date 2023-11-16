package ast;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberTest {

    @Test
    void deveRetornarResultado(){
        Node expr = new Number(10);
        assertEquals(10, expr.evaluate());
    }

    @Test
    void deveRetornarExpressaoSoma(){
        Node expr = new Number(10);
        MathExpressionVisitor visitor = new MathExpressionVisitor();
        expr.accept(visitor);
        assertEquals("10", visitor.getResult());
    }

}