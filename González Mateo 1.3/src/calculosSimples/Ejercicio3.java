/*Descripción: Pedida de datos e intercambio de los valores de la variable y mostrado en pantalla
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
		num1 = datos.nextInt();
		
		System.out.println("Introduce otro número");
		num2 = datos.nextInt();
		
		System.out.println("Antes del intercambio:");
	    System.out.println("num1 = " + num1);
	    System.out.println("num2 = " + num2);
	        
	    int temp = num1;
	    num1 = num2;
	    num2 = temp;

	    System.out.println("Después del intercambio:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        
        
	}

}
