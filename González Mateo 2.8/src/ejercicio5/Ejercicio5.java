/* Descripción:
 * Programa que solicita 10 números al usuario, calcula la media de los positivos y negativos,
 * y cuenta la cantidad de ceros, mostrando todos los resultados.
 * Autor: Cristian González Mateo
 * Fecha: 10/10/25
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int numeroIntroducido, contador, sumaPositivos, sumaNegativos, contadorCeros, contadorPositivos, contadorNegativos;
		contadorPositivos = 0; // Contador de números positivos
		contadorNegativos = 0; // Contador de números negativos
		contadorCeros = 0; // Contador de ceros
		sumaPositivos = 0; // Suma de los números positivos
		sumaNegativos = 0; // Suma de los números negativos
		
		double mediaPositivos, mediaNegativos; // Variables para almacenar la media de positivos y negativos
		
		// Bucle que solicita 10 números al usuario
		for (contador = 0; contador < 10; contador++ ) {
			System.out.println("Introduce un número");
			numeroIntroducido = datos.nextInt(); // Número introducido por el usuario
			
			// Clasifica el número y actualiza contadores y sumas
			if(numeroIntroducido > 0) {
				sumaPositivos = sumaPositivos + numeroIntroducido;
				contadorPositivos++;
			
			}else if (numeroIntroducido < 0) {
				sumaNegativos = sumaNegativos + numeroIntroducido;
				contadorNegativos++;
				
			}else {
				contadorCeros++;
			}	
		}
		
		// Calcula la media de números positivos si hay alguno
		if (contadorPositivos > 0) {
			mediaPositivos = (double) sumaPositivos / contadorPositivos;
		}else {
			mediaPositivos = 0;
		}
		
		// Calcula la media de números negativos si hay alguno
		if (contadorNegativos > 0) {
			mediaNegativos = (double) sumaNegativos/ contadorNegativos;
		}else {
			mediaNegativos = 0;
		}
		
		// Muestra resultados de números positivos
		if (contadorPositivos == 0) {
			System.out.println("No has introducido ningun número positivo por lo tanto la media es 0");
		}else {
			System.out.println("Has introducido " + contadorPositivos  + " numeros positivos y la media es " + mediaPositivos);
		}
		
		// Muestra resultados de números negativos
		if (contadorNegativos == 0) {
			System.out.println("No has introducido ningun número negativo por lo tanto la media es 0");
		}else {
			System.out.println("Has introducido " + contadorNegativos  + " numeros negativos y la media es " + mediaNegativos);
		}
		
		// Muestra la cantidad de ceros introducidos
		if (contadorCeros == 0) {
			System.out.println("No has introducido ningun 0");
		}else {
			System.out.println("Has introducido  " + contadorCeros + " ceros");
		}
		
	}
}
