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
 *  
 * Clase calculadora que evalua cada valor dentro del txt y da el resultado 
 *  
*/

public class PostfixCalc {

    /**
     * Evalúa una expresión aritmética en notación postfija.
     * 
     * La función descompone la expresión en tokens y utiliza una pila para
     * evaluar las operaciones aritméticas. Soporta las operaciones básicas:
     * suma, resta, multiplicación y división.
     * 
     * @param expression La expresión en notación postfija a evaluar.
     * @return El resultado de la evaluación de la expresión.
     * @throws ArithmeticException Si se intenta realizar una división por cero.
     */
    
    static int evaluarExpresion(String expression){

    	UVGStack stack = new Pila();
    	 for (String token : expression.split(" ")) {
             if (isNumeric(token)) {
                 stack.push(Integer.parseInt(token)); //
             } else {
                 int a = stack.top();
                 stack.pop();
                 int b = stack.top();
                 stack.pop();
                 switch (token) {
                     case "+":
                         stack.push(b + a);
                         break;
                     case "-":
                         stack.push(b - a);
                         break;
                     case "*":
 						stack.push(b * a);
 						break;
 					case "/":
 						if (a == 0) {
                            throw new ArithmeticException("División por cero");
                        }
 						stack.push(b / a);
 						break;
                 }
             }
         }

         return stack.top();
       }

    /**
     * Verifica si una cadena de texto representa un número entero.
     * 
     * @param str La cadena de texto a verificar.
     * @return true si str es un número entero, false en caso contrario.
     */   

    static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}