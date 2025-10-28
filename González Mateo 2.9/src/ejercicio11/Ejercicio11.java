/* Descripción:
 * Programa que calcula y muestra la suma de los números pares y de los impares comprendidos entre 100 y 200.
 * Autor: Cristian González Mateo
 * Fecha: 18/10/25
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		double contador, acumuladorPar = 0, acumuladorImpar = 0, division; // Variables para contar y acumular
		
		// Bucle for que recorre los números del 100 al 200
		for (double i = 100; i <= 200; i++) {
			
			division = i % 2; // Calcula el residuo al dividir entre 2
		
			if (division == 0) {
				acumuladorPar = acumuladorPar + i; // Acumula números pares
			}else {
				acumuladorImpar = acumuladorImpar + i; // Acumula números impares
			}
		}
		
		// Muestra los resultados
		System.out.println("La suma de los pares entre 100 y 200 es " + acumuladorPar);
		System.out.println("La suma de los impares entre 100 y 200 es " + acumuladorImpar);

	}

}
