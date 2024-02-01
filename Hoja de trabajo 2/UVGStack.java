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
 * Interfaz para el Stack
 *  
*/


public interface UVGStack {

	/**
     * Verifica si la pila está vacía.
     * 
     * @return true si la pila no contiene elementos, false en caso contrario.
     */
	boolean isEmpty();
	/**
     * Elimina el último elemento agregado a la pila. 
     * El comportamiento específico de este método cuando la pila está vacía
     * depende de la implementación concreta de la interfaz.
     */
	void pop();
	/**
     * Agrega un nuevo elemento al final de la pila.
     * 
     * @param element El elemento entero a agregar a la pila.
     */
	void push(int element);
	/**
     * Devuelve el último elemento agregado a la pila sin eliminarlo.
     * El valor retornado cuando la pila está vacía depende de la implementación
     * concreta de la interfaz.
     * 
     * @return El último elemento de la pila.
     */
	int top();
	
	
	
		
	
}