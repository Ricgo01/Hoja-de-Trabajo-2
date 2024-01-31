/*
 * Algoritmos y Estructura de Datos
 * 3 Semestre
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Fecha inicio: 28/01/2024
 * Fecha final: 30/01/2024
 *
 * @author Vianka Castro 23201
 * 		   Ricardo Godinez 23247
 * 
 *  
 * Clase radio para identificar funcionamiento y partes de una radio 
 *  
*/

public class PostfixCalc {
    public static void main(String[] args) {
        String expression = "4 5 3 + -"; // Ejemplo de expresión Postfix
        Pila stack = new Pila();

        for (String token : expression.split(" ")) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
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
						stack.push(b / a);
						break;
                }
            }
        }

        System.out.println("Resultado: " + stack.top());
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}