/* Descripción:
 * Programa que solicita al usuario hasta 100 números no nulos y cuenta cuántos son positivos y negativos.
 * Autor: Cristian González Mateo
 * Fecha: 18/10/25
 */
package ejercicio07;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		int contadorPositivos = 0; // Contador de números positivos
		int contadorNegativos = 0; // Contador de números negativos
		int numIntroducido; // Número introducido por el usuario
		int contador = 0; // Contador total de números válidos introducidos
		
		// Bucle do-while que solicita hasta 100 números no nulos
		do {
			System.out.println("Introduce hasta 100 numeros no nulos ");
			numIntroducido = datos.nextInt();
			    
			if (numIntroducido > 0) {
				contador++; // Incrementa contador total
				contadorPositivos++; // Incrementa contador de positivos
			}else if (numIntroducido < 0){
				contador++; // Incrementa contador total
				contadorNegativos++; // Incrementa contador de negativos
			}else {
				System.out.println("El numero introducido es 0, no cuenta, introduce otro"); // Mensaje si es 0
			}
		}while (contador < 100);	
		
		// Muestra resultados sobre los números negativos
		if (contadorNegativos == 0) {
			System.out.println("No has introducido ningun número negativo");
		}else {
			System.out.println("Has introducido " + contadorNegativos + " numeros negativos");
		}
		
		// Muestra resultados sobre los números positivos
		if (contadorPositivos == 0) {
			System.out.println("No has introducido ningun número postivio");
		}else {
			System.out.println("Has introducido " + contadorPositivos + " numeros positivos");
		}
			
	}

}
