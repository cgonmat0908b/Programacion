/* Descripción:
 * Programa que muestra los números pares del 2 al 198 utilizando un bucle for.
 * Autor: Cristian González Mateo
 * Fecha: 18/10/25
 */
package ejercicio02;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Bucle for que recorre los números pares del 2 al 198
		for (int numero = 2; numero <200; numero = numero + 2) {
			System.out.println(numero); // Muestra el número par actual
		}
	}

}
