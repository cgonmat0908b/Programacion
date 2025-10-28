/* Descripción:
 * Programa que muestra los números pares del 1 al 199 utilizando un bucle for y el operador módulo.
 * Autor: Cristian González Mateo
 * Fecha: 18/10/25
 */
package ejercicio03;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		final int DIVISOR = 2; // Constante para verificar paridad
		int resto = 0; // Variable para almacenar el resto de la división
		
		// Bucle for que recorre los números del 1 al 199
		for (int numero = 1; numero < 200; numero++) {
			resto = numero % DIVISOR; // Calcula el resto al dividir entre 2
			if (resto == 0) {
				System.out.println(numero); // Muestra el número si es par
			}
		}	
	}
}
