/* Descripción:
 * Fecha: 3/11/25
 * Autor: Cristian González Mateo
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner datos = new Scanner(System.in);
		int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
		String frase;
		/*Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
Nº de A's: 3
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0
		 * 
		 */
		
		
		
		System.out.println("Introduce una cadena de palabras");
		frase = datos.nextLine();
		char letra;
		
		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			letra = Character.toLowerCase(letra);
			
			switch (letra) {
			case 'a':
				contadorA++;
				break;
			case 'e':
				contadorE++;
				break;
			case 'i':
				contadorI++;
				break;
			case 'o':
				contadorO++;
				break;
			case 'u':
				contadorU++;
				break;
			}
		}
		System.out.println("Has introducido " + contadorA + " A's");
		System.out.println("Has introducido " + contadorE + " E's");
		System.out.println("Has introducido " + contadorI + " I's");
		System.out.println("Has introducido " + contadorO + " O's");
		System.out.println("Has introducido " + contadorU + " U's");
		
		
	}

}
