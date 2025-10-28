/* Descripción:
 * Programa que solicita números al usuario y muestra su cuadrado,
 * deteniéndose cuando se introduce un número negativo.
 * Autor: Cristian González Mateo
 * Fecha: 10/10/25
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int numeroIntroducido, acumulador = 0;
		System.out.println("Introduce un numero, cuando quieras parar, introduce un numero negativo ");
		numeroIntroducido = datos.nextInt(); // Primer número introducido por el usuario
		
		if (numeroIntroducido != 0) {	
			// Bucle do-while que calcula y muestra el cuadrado de los números positivos
			do {
				numeroIntroducido = numeroIntroducido * numeroIntroducido; // Calcula el cuadrado
				System.out.println("El cuadrado del numero introducido es: " + numeroIntroducido); // Muestra el cuadrado
				
				System.out.println("Introduce un numero, cuando quieras parar, introduce un numero negativo ");
				numeroIntroducido = datos.nextInt(); // Nuevo número introducido
				
		    }while(numeroIntroducido > 0); // Continúa mientras el número sea positivo
		
  	    }		
	}
}
