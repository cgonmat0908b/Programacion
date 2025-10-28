/* Descripción:
 * Programa que calcula el factorial de un número positivo introducido por el usuario.
 * Autor: Cristian González Mateo
 * Fecha: 18/10/25
 */
package ejercicio05;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		System.out.println("Introduce un numero positivo");
		int numIntroducido = datos.nextInt(); // Número introducido por el usuario
		long factorial = 1; // Variable para almacenar el factorial
		
		// Bucle for que calcula el factorial del número introducido
		for (int factor = 1; factor < numIntroducido; factor++) {
			factorial = factorial * factor; // Multiplica los números sucesivos
		}
		System.out.println("El factorial de " + numIntroducido + " es " + factorial); // Muestra el resultado
		
	}

}
