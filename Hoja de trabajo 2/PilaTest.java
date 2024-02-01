/*
 * Algoritmos y Estructura de Datos
 * 3 Semestre
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Fecha inicio: 28/01/2024
 * Fecha final: 31/01/2024
 *
 * @author Vianka Castro 23201
 * 		   Ricardo Godinez 23247
 *  
 * Clase Pila que posee todos los metodos necesarios para calcular el valor
 *  
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PilaTest {

    /**
     * Prueba los métodos push y top de la clase Pila.
     * Verifica si los elementos se agregan correctamente y si el método top
     * devuelve el valor esperado después de cada inserción.
     */

    @Test
    void testPushyTop() {
        UVGStack stack = new Pila();

        stack.push(2);
        assertEquals(2, stack.top());

        stack.push(9);
        assertEquals(9, stack.top());
    }

    /**
     * Prueba el método pop de la clase Pila.
     * Verifica el comportamiento al intentar eliminar un elemento de una pila vacía
     * y si elimina correctamente el último elemento agregado.
     */

    @Test
    void testPop() {
        UVGStack stack = new Pila();

        assertThrows(IndexOutOfBoundsException.class, () -> ((Pila) stack).pop());

        stack.push(2);
        stack.push(6);
        ((Pila) stack).pop();
        assertEquals(2, stack.top());
        
        
    }

    /**
     * Prueba el método isEmpty de la clase Pila.
     * Verifica si detecta correctamente cuando la pila está vacía o no.
     */

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

/**
 * Clase de prueba para la clase PostfixCalc, utilizando JUnit.
 * Verifica el correcto funcionamiento del método evaluarExpresion.
 */

class PostfixCalcTest {

    /**
     * Prueba el método evaluarExpresion de la clase PostfixCalc.
     * Verifica el cálculo correcto de expresiones en notación postfija y el manejo
     * adecuado de la división por cero.
     */

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
