/* Descripción:
 * Fecha: 3/11/25
 * Autor: Cristian González Mateo
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
		 * de la cadena en una línea distinta.
		 * 
		 */
		
		Scanner datos = new Scanner(System.in);
		String[] palabras;
		String cadena;
		
		System.out.println("Introduce una cadena de texto");
		cadena = datos.nextLine();
		
		palabras = cadena.split(" ");
		
		System.out.println("Las palabras introducidad son: ");
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
			
		}
	}

}
