import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PilaTest {

    @Test
    void testPushyTop() {
        UVGStack stack = new Pila();

        stack.push(2);
        assertEquals(2, stack.top());

        stack.push(9);
        assertEquals(9, stack.top());
    }

    @Test
    void testPop() {
        UVGStack stack = new Pila();

        assertThrows(IndexOutOfBoundsException.class, () -> ((Pila) stack).pop());

        stack.push(2);
        stack.push(6);
        ((Pila) stack).pop();
        assertEquals(2, stack.top());
        
        
    }

    @Test
    void testIsEmpty() {
        UVGStack stack = new Pila();

        assertTrue(stack.isEmpty());

        //agregar nuevo elemento y verificar si esta vacio 
        stack.push(8);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }
}

class PostfixCalcTest {

    @Test
    void testEvaluarExpresion() {

    	// suma
    	String expression1 = "2 3 +";
        int result1 = PostfixCalc.evaluarExpresion(expression1);
        assertEquals(5, result1);

        // producto  
        String expression2 = "2 6 *";
        int result2 = PostfixCalc.evaluarExpresion(expression2);
        assertEquals(12, result2);

        // division
        String expression3 = "10 2 /";
        int result3 = PostfixCalc.evaluarExpresion(expression3);
        assertEquals(5, result3);

        // completa
        String expression4 = "3 2 + 8 * 6 -";
        int result4 = PostfixCalc.evaluarExpresion(expression4);
        assertEquals(34, result4);

        //division por 0 
        String expression5 = "5 0 /";
        assertThrows(ArithmeticException.class, () -> PostfixCalc.evaluarExpresion(expression5));
    }
    
   
}
