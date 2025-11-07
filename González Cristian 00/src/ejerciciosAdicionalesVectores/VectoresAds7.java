package ejerciciosAdicionalesVectores;

import java.util.Scanner;

public class VectoresAds7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
		 * 7. Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están
ordenados de forma creciente, decreciente, o si están desordenados.
		 */
		
		Scanner datos = new Scanner (System.in);
		
		int [] nums = new int [10];
		int contadorCreciente = 0, contadorDecreciente = 0, contador = 0;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce un número");
			nums[i] = datos.nextInt();
		}
		for (int f = 0; f < 9; f++) {
			
			if (nums[f] < nums[f + 1]) {
				contadorCreciente++;
			}
			else if (nums[f] > nums[f + 1]) {
				contadorDecreciente++;
			}
		}
	
		if (contadorCreciente == 9) {
			System.out.println("Los números estan introducidos de forma creciente");
		}
		else if (contadorDecreciente == 9) {
			System.out.println("Los números estan introducidos de forma decreciente");
		}
		else {
			System.out.println("Los números has sido introducidos de manera desordenada");
		}
		
		}

}
