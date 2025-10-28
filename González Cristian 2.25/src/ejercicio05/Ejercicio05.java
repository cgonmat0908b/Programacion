/*Descripción: Programa que resuelve ecuación sencilla
 *Fecha:28/10/25
 * Autor:Cristian González Mateo
 */
package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		//Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+ b = 0).
		
		Scanner datos = new Scanner(System.in);
		int a,b;
		double resultado;
		
		System.out.println("Para resolver la ecuación introduce datos con este formato: ax+ b = 0");
		
		System.out.println("Introduce a");
		a = datos.nextInt();
		
		
		System.out.println("Introduce b");
		b = datos.nextInt();
		
		if (a == 0) {
			if (b == 0) {
				System.out.println("La ecuación tiene infinitas soluciones (0x + 0 = 0).");
				
			}else {
				System.out.println("La ecuación no tiene solución (0x + b = 0 con b ≠ 0).");
				
			}
		}else {
			resultado = (double) -b / a;
			System.out.println("El resultado es: " + resultado);
			
		}
		
	}

}
