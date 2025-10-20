/* Descripción: Entrada de dos números y comprobar si es mayor, menor o igual
 * Autor: Cristian González Mateo
 * Fecha: 06/10/25
 */
package ejercicio04;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		System.out.println("Introduce un numero a partir del 1 en el quieres que acabe");
		int numIntroducido = datos.nextInt();
	
		for (int numero = 1; numero <= numIntroducido; numero++) {
			System.out.println(numero);
		}
		
		
	}

}