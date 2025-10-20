/* Descripción: Entrada de dos números y comprobar si es mayor, menor o igual
 * Autor: Cristian González Mateo
 * Fecha: 06/10/25
 */
package ejercicio05;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		
		
		System.out.println("Introduce un numero positivo");
		int numIntroducido = datos.nextInt();
		long factorial = 1;
		
		for (int factor = 1; factor < numIntroducido; factor++) {
			factorial = factorial * factor;
		}
		System.out.println("El factorial de " + numIntroducido + " es " + factorial);
		
	
	}

}