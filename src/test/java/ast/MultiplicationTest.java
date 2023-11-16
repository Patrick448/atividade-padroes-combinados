package ast;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTest {

    @Test
    void deveRetornarResultadoSoma(){
        Node expr = new Multiplication(new Number(3), new Number(3));
        assertEquals(9, expr.evaluate());
    }

    @Test
    void deveRetornarExpressaoSoma(){
        Node expr = new Multiplication(new Number(6), new Number(3));
        MathExpressionVisitor visitor = new MathExpressionVisitor();
        expr.accept(visitor);
        assertEquals("(6 * 3)",visitor.getResult());
    }

}