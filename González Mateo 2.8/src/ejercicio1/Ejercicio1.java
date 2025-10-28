/* Descripción:
 * Programa que muestra en pantalla los números del 1 al 100 utilizando un bucle while.
 * Autor: Cristian González Mateo
 * Fecha: 10/10/25
 */

package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int inicio = 1; // Valor inicial del contador
		int fin = 100; // Valor final hasta donde se repetirá el bucle
		int acumulador = 0; // Variable que acumula y controla la condición del bucle
		
		// Bucle que imprime los números del 1 al 100
		while (acumulador < fin) {
			acumulador = inicio++; // Incrementa y asigna el siguiente número
			System.out.println(acumulador ); // Muestra el número actual
		}
		
	}
}
