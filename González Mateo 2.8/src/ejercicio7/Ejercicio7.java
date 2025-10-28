/* Descripción:
 * Programa que genera un número aleatorio entre 0 y 50 y solicita al usuario adivinarlo,
 * indicando si cada intento es mayor o menor hasta acertar.
 * Autor: Cristian González Mateo
 * Fecha: 10/10/25
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int numeroIntroducido; // Número ingresado por el usuario
		double numeroAleatorio = Math.random() * 50; // Genera número aleatorio entre 0 y 50
		numeroAleatorio = Math.round(numeroAleatorio); // Redondea el número aleatorio
		
		System.out.println(numeroAleatorio); // Muestra el número generado (probablemente para pruebas)
		System.out.println("Se ha generado un número del 0 al 50, introduce un número hasta que aciertes el número generado");
		numeroIntroducido = datos.nextInt(); // Primer intento del usuario
		
		// Bucle que continúa hasta que el usuario acierte el número
		do {
			if (numeroIntroducido > numeroAleatorio) {
				System.out.println("El numero introducido es mayor al número generado, Introduce otro numero");
				numeroIntroducido = datos.nextInt(); // Nuevo intento
			}else if (numeroIntroducido < numeroAleatorio) {
				System.out.println("El numero introducido es menor al número generado, Introduce otro numero");
				numeroIntroducido = datos.nextInt(); // Nuevo intento
			}
        }while (numeroIntroducido != numeroAleatorio); // Condición para seguir intentando		
		
		System.out.println(numeroIntroducido + " era el numero generado"); // Mensaje de acierto
	}
}
