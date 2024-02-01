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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	/**
     * El método principal (main) de la clase Main.
     * 
     * Este método lee una expresión desde un archivo de texto, la procesa
     * utilizando una calculadora de expresiones en notación postfija y 
     * muestra el resultado en la consola.
     * 
     * @param args Argumentos de la línea de comandos. No se utilizan en este método.
     * @throws FileNotFoundException Si el archivo especificado no se encuentra.
     */

	public static void main(String[] args) throws FileNotFoundException {
	
		 // Creación de un objeto File para representar el archivo de datos.
    	File file = new File("data.txt");
		// Creación de un objeto Scanner para leer el archivo.
    	Scanner lector = new Scanner(file);
    	
    	// Inicialización de la variable para almacenar la expresión leída.
    	String expression = " ";
    	
		// Lectura de cada línea del archivo y concatenación en la variable expression.
    	while (lector.hasNextLine()) {
    		expression += lector.nextLine();
    	}
    	// Cierre del objeto Scanner.
    	lector.close();
    	
        // Evaluación de la expresión usando un método estático de la clase PostfixCalc.
    	int result = PostfixCalc.evaluarExpresion(expression);
    	// Impresión del resultado en la consola.
    	System.out.println("Resultado: " + result);

	}

}
