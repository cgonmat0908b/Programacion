package ejercicio15;

import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  15. Escribe un programa que cree un array de tamaño 50 con los números naturales comprendidos
 entre 50 y 99. Luego muestra la suma total y la media. Implementa una función que calcule la
 suma de un array y otra que calcule la media de un array.
		 */
		
		Scanner datos = new Scanner (System.in);
		
		int[] natur = new int [50];
		int inicio = 50;
		
		for(int i = 0; i < natur.length; i++) {
			natur[i] = i + inicio;
		}
		System.out.println("La suma de los naturales de 50 a 99 es: " + sumaArray(natur));
		System.out.println("La media de la suma de los numeros comprendidos de 50 a 99 es: " + mediaArray(natur));
	}
	
	public static int sumaArray(int[] array) {
		int suma = 0;
		for(int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		return suma;
	}
	public static double mediaArray (int[] array) {
		double media = 0;
		int contador = 0;
		for(int i = 0; i < array.length; i++) {
			media = media + array[i];
			contador++;
		}
		media = media / contador;
		return media;
	}

}
