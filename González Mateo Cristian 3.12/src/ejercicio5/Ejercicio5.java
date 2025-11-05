/* Descripción:
 * Fecha: 3/11/25
 * Autor: Cristian González Mateo
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner datos = new Scanner (System.in);
		String frase;
		int contador = 0;
		int contadorLetras = 0;
		int combinacionLetras;
/*
 * Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
 no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).

 Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
 palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
 Por ejemplo:
 Amigo no gima
 Dabale arroz a la zorra el abad 
Amo la pacífica paloma
 A man a plan a canal Panama
 */
		
		System.out.println("Introduce la frase palíndroma o no:");
		frase = datos.nextLine();
		
		frase = frase.toLowerCase();
		frase = frase.replaceAll("\\s","");
		contador = frase.length();
		
		for (int i = 0; i < frase.length(); i++) { // i * 2 = numero de intercambios de las letras
			if (frase.charAt(i) == frase.charAt(contador - 1)) {
				contador--;
				contadorLetras++;
			}
		}

		combinacionLetras = frase.length();
		if (contadorLetras == combinacionLetras) {
			System.out.println("La frase introducida es un palíndromo");
			
		}else System.out.println("La frase introducida no es un palíndromo");
		
	}

}
