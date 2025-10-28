/* Descripción:
 * Programa que imprime los números del 100 al 1 utilizando un bucle do-while.
 * Autor: Cristian González Mateo
 * Fecha: 10/10/25
 */

package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int inicio = 100; // Valor inicial del contador (comienza desde 100)
		int fin = 1; // Valor final (termina en 1)
		int acumulador = 0; // Variable que almacena el número actual
		
		// Bucle do-while que muestra los números del 100 al 1 en orden descendente
		do {
			acumulador = inicio--; // Asigna el número actual y luego lo decrementa
			System.out.println(acumulador); // Muestra el número en pantalla
		}while (acumulador > fin); // Continúa mientras el número sea mayor que 1
	
	}
}
