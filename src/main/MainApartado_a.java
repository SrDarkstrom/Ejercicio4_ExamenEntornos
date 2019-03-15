package main;

import java.util.Scanner;
import clases.Array;

/**
 * La clase principal define un objeto de la clase Array, un Scanner, un número entero y un booleano.
 * Mediente el Scanner se le pasa al entero un número por teclado. Después se llama al método busquedalineal
 * de la clase Array y se dice al usuario si el número introducido está o no en el array.
 * 
 * @author Sergio Millán Fernández
 * @version 1.0
 * @since  15/03/2019
 */
public class MainApartado_a {

	public static void main(String[] args) {
		Array array = new Array(); 
		int num;
		boolean sw;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número por favor: ");
		num = sc.nextInt();
		
		sw = array.busquedaLineal(num);
		
		if(sw == true) {
			System.out.println("El número " + num + " está en el array.");
		}else {
			System.out.println("El número " + num + " no está en el array.");
		}
		
		sc.close();
	}
}
