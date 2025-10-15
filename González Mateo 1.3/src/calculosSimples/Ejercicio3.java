/*Descripción: Intercambio del valor de las variables
 * Fecha: 1/10/25
 * Autor: Cristian González Mateo
 */
package calculosSimples;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Introduce un número");
		num1 = datos.nextInt(); // Lee el primer número introducido por el usuario
		
		System.out.println("Introduce otro número");
		num2 = datos.nextInt(); // Lee el segundo número introducido por el usuario
		
		System.out.println("Antes del intercambio:");
	    System.out.println("num1 = " + num1);
	    System.out.println("num2 = " + num2);
	        
	    int temp = num1; // Guarda el valor de num1 temporalmente
	    num1 = num2; // Asigna el valor de num2 a num1
	    num2 = temp; // Asigna el valor temporal (original de num1) a num2

	    System.out.println("Después del intercambio:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        
        
	}

}