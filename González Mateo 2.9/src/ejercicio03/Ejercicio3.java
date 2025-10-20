/* Descripción: Entrada de dos números y comprobar si es mayor, menor o igual
 * Autor: Cristian González Mateo
 * Fecha: 06/10/25
 */
package ejercicio03;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		final int DIVISOR = 2;
		int resto = 0;
		
		for (int numero = 1; numero < 200; numero++) {
			resto = numero % DIVISOR;
			if (resto == 0) {
				System.out.println(numero);
			}
		  }	
	}
}