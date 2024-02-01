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
 * Clase pila que posee todos los metodos necesarios para calcular el valor 
 *  
*/

import java.util.Vector;

public class Pila implements UVGStack {

	/**
     * Vector para almacenar los números enteros de la pila.
     */
    private Vector<Integer> numeros = new Vector<>();

    /**
     * Verifica si la pila está vacía.
     * 
     * @return true si la pila está vacía, false en caso contrario.
     */
    @Override
    public boolean isEmpty() {
        return numeros.isEmpty();
    }
    /**
     * Elimina el último elemento introducido en la pila. Si la pila está vacía,
     * lanza una excepción de tipo IndexOutOfBoundsException.
     * 
     * @throws IndexOutOfBoundsException si la pila está vacía.
     */
    @Override
    public void pop() {
        if (!isEmpty()) {
            numeros.remove(numeros.size() - 1);
        } 
        else {
            throw new IndexOutOfBoundsException("La pila esta vacia");
        }
        
    }

    @Override
    public void push(int element) {
        numeros.add(element);
    }
    /**
     * Devuelve el último elemento introducido en la pila sin eliminarlo.
     * Si la pila está vacía, devuelve -1.
     * 
     * @return El último elemento de la pila o -1 si la pila está vacía.
     */
    @Override
    public int top() {
        if (!isEmpty()) {
            return numeros.get(numeros.size() - 1);
        }
        return -1; // Retornar un valor predeterminado cuando la pila está vacía
    }
}