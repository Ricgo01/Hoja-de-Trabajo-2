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
 * Clase main que muestra resultado y lee txt
 *  
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
	

    	File file = new File("data.txt");
    	Scanner lector = new Scanner(file);
    	
    	
    	String expression = " ";
    	
    	while (lector.hasNextLine()) {
    		expression += lector.nextLine();
    	}
    	
    	lector.close();
    	
        
    	int result = PostfixCalc.evaluarExpresion(expression);
    	
    	System.out.println("Resultado: " + result);

	}

}
