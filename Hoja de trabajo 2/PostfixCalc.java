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
 * Clase calculadora que evalua cada valor dentro del txt y da el resultado 
 *  
*/

public class PostfixCalc {
	
    
	/*public static void main(String[] args) throws FileNotFoundException {
    	
    	
    	File file = new File("data.txt");
    	Scanner lector = new Scanner(file);
    	
    	String expression = " ";
    	
    	while (lector.hasNextLine()) {
    		expression += lector.nextLine();
    	}
    	
    	lector.close();
    	
        
    	int result = evaluarExpresion(expression);
    	
    	System.out.println("Resultado: " + result);
    	
    }
    */
    
    static int evaluarExpresion(String expression){

    	InterfazUVGStack stack = new Pila();
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

       

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}