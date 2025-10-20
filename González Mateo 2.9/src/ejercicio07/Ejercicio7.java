/* Descripción: Entrada de dos números y comprobar si es mayor, menor o igual
 * Autor: Cristian González Mateo
 * Fecha: 06/10/25
 */
package ejercicio07;

import java.util.Scanner;

public class Ejercicio7{

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		
		int contadorNegativos = 0;
		int numIntroducido;
		
		System.out.println("Introduce un número");
		numIntroducido = datos.nextInt();
		
		if (numIntroducido == 0) {
			System.out.println("0 no puede ser leido, intentalo de nuevo");
			
		}else {
			for (int contador = 1; contador <= 100; contador++) {
				System.out.println("Introduce un numero");
				numIntroducido = datos.nextInt();
				
				
				if (numIntroducido < 0 ) {
					contadorNegativos++;
				}
			}
		}
		System.out.println("Has introducido " + contadorNegativos + " numeros negativos ");
	
	}

}