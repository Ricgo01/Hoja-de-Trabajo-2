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
		File file = new File("data.txt");
		Scanner lector = new Scanner(file);
		StringBuilder expression = new StringBuilder();
		
		while (lector.hasNextLine()) {
			expression.append(lector.nextLine()).append(" ");
		}
		
		lector.close();
		
		try {
			int result = PostfixCalc.evaluarExpresion(expression.toString().trim());
			System.out.println("Resultado: " + result);
		} catch (IllegalArgumentException | ArithmeticException e) {
			System.err.println("Error al evaluar la expresión: " + e.getMessage());
		}
	}
}
