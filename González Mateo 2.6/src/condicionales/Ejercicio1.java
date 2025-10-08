/* Descripción:
 * Autor:
 * Fecha:
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num1 = datos.nextInt();
		
		System.out.println("Introduce otro número");
		int num2 = datos.nextInt();
		
		if (num1 > num2 ) {
			System.out.println("El primer número es mayor que el segundo número");
		} 
		else {
		if (num1 < num2 ){
			System.out.println("El primer número es menor que el segundo número");
			}
		else {
			System.out.println("El número es igual");
		 }
	 }
			

	}

}
