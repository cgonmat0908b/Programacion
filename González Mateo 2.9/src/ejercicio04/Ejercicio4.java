/* Descripción:
 * Programa que muestra los números del 1 hasta el número introducido por el usuario.
 * Autor: Cristian González Mateo
 * Fecha: 18/10/25
 */
package ejercicio04;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		System.out.println("Introduce un numero a partir del 1 en el quieres que acabe");
		int numIntroducido = datos.nextInt(); // Número límite introducido por el usuario
	
		// Bucle for que recorre del 1 hasta el número introducido
		for (int numero = 1; numero <= numIntroducido; numero++) {
			System.out.println(numero); // Muestra el número actual
		}
		
	}

}
