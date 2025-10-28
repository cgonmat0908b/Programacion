/* Descripción:
 * Programa que solicita números al usuario hasta que se introduce un 0,
 * y cuenta cuántos son positivos y negativos.
 * Autor: Cristian González Mateo
 * Fecha: 18/10/25
 */
package ejercicio08;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		int numeroIntroducido, contadorPositivos = 0, contadorNegativos = 0; // Contadores de positivos y negativos
		
		System.out.println("Introduce un numero, cuando quieras acabar introduce un 0");
		numeroIntroducido = datos.nextInt(); // Primer número introducido
		
		if (numeroIntroducido == 0) {
			System.out.println("No has introducido ningun número negativo ni positivo, solo un cero"); // Mensaje si el primer número es 0
		}
		
		// Bucle do-while que solicita números hasta que se introduzca un 0
		do {
			if (numeroIntroducido > 0) {
				contadorPositivos++; // Incrementa contador de positivos
				System.out.println("Introduce otro numero");
				numeroIntroducido = datos.nextInt(); // Nuevo número
			}else if (numeroIntroducido < 0) {
				contadorNegativos++; // Incrementa contador de negativos
				System.out.println("Introduce otro numero");
				numeroIntroducido = datos.nextInt(); // Nuevo número
			}
		}while (numeroIntroducido != 0); // Condición de parada
		
		// Muestra los resultados si se introdujeron números distintos de 0
		if (contadorPositivos > 0 || contadorNegativos > 0)
			System.out.println("Has introducido  " + contadorPositivos + " numeros positivos y " + contadorNegativos + " numeros negativos");
	}

}
