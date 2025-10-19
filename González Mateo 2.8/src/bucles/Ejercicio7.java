/* Descripción: 
 * Autor:
 * Fecha:
 */

package bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int numeroIntroducido;
		double numeroAleatorio = Math.random() * 50;
		numeroAleatorio = Math.round(numeroAleatorio);
		
		System.out.println(numeroAleatorio);
		System.out.println("Se ha generado un número del 0 al 50, introduce un número hasta que aciertes el número generado");
		numeroIntroducido = datos.nextInt();
		
		do {
			
			if (numeroIntroducido > numeroAleatorio) {
				  System.out.println("El numero introducido es mayor al número generado, Introduce otro numero");
				  numeroIntroducido = datos.nextInt();
			
	      }else if (numeroIntroducido < numeroAleatorio) {
			  System.out.println("El numero introducido es menor al número generado, Introduce otro numero");
			  numeroIntroducido = datos.nextInt();
		    }
			
        }while (numeroIntroducido != numeroAleatorio);		
		System.out.println(numeroIntroducido + " era el numero generado");
	}
}