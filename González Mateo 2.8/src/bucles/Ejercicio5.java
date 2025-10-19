/* Descripción:
 * Autor:
 * Fecha:
 */

package bucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int numeroIntroducido, contador, sumaPositivos, sumaNegativos, contadorCeros, contadorPositivos, contadorNegativos;
		contadorPositivos = 0;
		contadorNegativos = 0;
		contadorCeros = 0;
		sumaPositivos = 0;
		sumaNegativos = 0;
		
		double mediaPositivos, mediaNegativos;
		
		for (contador = 0; contador < 10; contador++ ) {
			System.out.println("Introduce un número");
			numeroIntroducido = datos.nextInt();
			
			
			if(numeroIntroducido > 0) {
				sumaPositivos = sumaPositivos + numeroIntroducido;
				contadorPositivos++;
			
			}else if (numeroIntroducido < 0) {
				sumaNegativos = sumaNegativos + numeroIntroducido;
				contadorNegativos++;
				
			}else {
				contadorCeros++;
			}	
		}
		
		if (contadorPositivos > 0) {
			mediaPositivos = (double) sumaPositivos / contadorPositivos;
			
		}else {
			mediaPositivos = 0;
		}
		
		if (contadorNegativos > 0) {
			mediaNegativos = (double) sumaNegativos/ contadorNegativos;
			
		}else {
			mediaNegativos = 0;
		}
		
		
		if (contadorPositivos == 0) {
			System.out.println("No has introducido ningun número positivo por lo tanto la media es 0");
		}else {
			System.out.println("Has introducido " + contadorPositivos  + " numeros positivos y la media es " + mediaPositivos);
		}
		
		if (contadorNegativos == 0) {
			System.out.println("No has introducido ningun número negativo por lo tanto la media es 0");
		}else {
			System.out.println("Has introducido " + contadorNegativos  + " numeros negativos y la media es " + mediaNegativos);
		}
		if (contadorCeros == 0) {
			System.out.println("No has introducido ningun 0");
		}else {
			System.out.println("Has introducido  " + contadorCeros + " ceros");
		}
		
	}
}