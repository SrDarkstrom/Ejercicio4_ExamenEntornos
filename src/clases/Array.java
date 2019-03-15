package clases;

import java.util.Arrays;

/**
 * En esta clase, llamada Array, tenemos como atributo un array de enteros 
 * y un método para realizar la búsqueda de un número y saber si está o no en el array.
 * 
 * @author Sergio Millán Fernández
 * @version 1.0
 * @since  15/03/2019
 */
public class Array {
	int[] array = {5, 1, 22, 9, 12, 6, 4, 8, 15, 21, 18, 17, 2, 11, 16};
	
	/**
	 * El método busquedaLineal realiza una busqueda ordenada en el array mirando si algun elemento del array coincide con el
	 * número pasado como parámetro.
	 * 
	 * @param x es un número que pasamos como parámetro y es el número el cuál queremos saber si está o no en el array
	 * @return Este método retorna un booleano, si es false significara que el número no está en el array y si devuelve true
	 * 		   significa que si está el número.
	 */
	public boolean busquedaLineal(int x) {
		boolean sw = false;
		
		for (int i = 0; i < array.length; i++) {
			int num2 = array[i];
			if(num2 == x) {
				sw = true;
				break;
			}
		}
		return sw;
	}
	
	public void incrementaValor() {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] + 1;
		}
	}
}
