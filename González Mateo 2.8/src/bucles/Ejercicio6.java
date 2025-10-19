/* Descripción:
 * Autor:
 * Fecha:
 */

package bucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int numeroIntroducido, acumulador = 0;
		System.out.println("Introduce un numero, cuando quieras parar, introduce un numero negativo ");
		numeroIntroducido = datos.nextInt();
		
		if (numeroIntroducido != 0) {	
			do {
				numeroIntroducido = numeroIntroducido * numeroIntroducido;
				System.out.println("El cuadrado del numero introducido es: " + numeroIntroducido);
				
				System.out.println("Introduce un numero, cuando quieras parar, introduce un numero negativo ");
				numeroIntroducido = datos.nextInt();
				
		        }while(numeroIntroducido > 0);
		
  	    }		
	}
}