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
 * Clase pila que posee todos los metodos necesarios para calcular el valor 
 *  
*/

import java.util.Vector;

public class Pila implements UVGStack {
	
    private Vector<Integer> numeros = new Vector<>();

    @Override
    public boolean isEmpty() {
        return numeros.isEmpty();
    }

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

    @Override
    public int top() {
        if (!isEmpty()) {
            return numeros.get(numeros.size() - 1);
        }
        return -1; // Retornar un valor predeterminado cuando la pila está vacía
    }
}