/* Descripción:
 * Fecha: 27/10/25
 * Autor: Cristian González Mateo
 * 
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
menores que cero y cuántos son igual a cero.
		 */
		Scanner datos = new Scanner (System.in);
		int num1, num2, longitudArray, numArray, contador0s = 0,contadorMenor0 = 0,contadorMayor0 = 0;
		int[][] matrizNM;
		
		
		System.out.println("Introduce el primer número de la matriz");
		num1 = datos.nextInt();
		
		System.out.println("Introduce el segundo número de la matriz");
		num2 = datos.nextInt();
		
		matrizNM = new int[num1][num2];
		longitudArray = num1 * num2;
		
		
		for (int i = 0; i < matrizNM.length; i++) {
			for (int f = 0; f < matrizNM[i].length; f++) {
				
				System.out.println("Introduce valores hasta rellenar la longitud del array " + "(" + longitudArray + ")");
				matrizNM[i][f] = datos.nextInt();
				
				if(matrizNM[i][f] > 0) {
					contadorMayor0++;
					
				}else if (matrizNM[i][f] < 0) {
					contadorMenor0++;
					
				}else {
					contador0s++;
				}
				
			}
		}
		if (contadorMayor0 > 0) {
		System.out.println("Has introducido " + contadorMayor0 + " números mayores que 0");
		}else System.out.println("No has introducido ninguno número mayor a 0");
		
		if(contadorMenor0 > 0) {
		System.out.println("Has introducido " + contadorMenor0 + " numeros mayores que 0");
		}else System.out.println("No has introducido ningun número menor que 0");
		
		if (contador0s > 0) {
		System.out.println("Has introducido " + contador0s + " ceros");
		}else System.out.println("No has introducido ningun 0");
	}

}
