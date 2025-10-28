/* Descripción:
 * Programa que imprime los números del 1 al 100 utilizando un bucle do-while.
 * Autor: Cristian González Mateo
 * Fecha: 10/10/25
 */

package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int inicio = 1; // Valor inicial del contador
		int fin = 100; // Valor máximo del conteo
		int acumulador = 0; // Variable que almacena el número actual
		
		// Bucle do-while que muestra los números del 1 al 100
		do {
			acumulador = inicio++; // Asigna el número actual y lo incrementa
			System.out.println(acumulador); // Muestra el número en pantalla
		}while (acumulador < fin); // Condición para continuar el bucle
	
	}
}
