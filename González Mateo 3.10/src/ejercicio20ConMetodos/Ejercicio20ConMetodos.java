package ejercicio20ConMetodos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20ConMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				/*
				 *  Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
		 aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se
		 mostrará por pantalla si N existe en el array, además de cuantas veces
				 */
				Scanner datos = new Scanner(System.in);
				
				int contador = 0, numIntro, posNumIntro;
				int [] array1000 = new int [1000];
				for (int i = 0; i < array1000.length; i++) {
					array1000[i] =(int) (Math.random() * 100);
				}
				System.out.println("Introduce el número que quieres buscar");
				numIntro = datos.nextInt();
				
				Arrays.sort(array1000);
				posNumIntro = Arrays.binarySearch(array1000, numIntro);
				
				if (posNumIntro >= 0) {
					for(int i = 0; i < array1000.length; i++) {
						if(array1000[i] == numIntro) {
							contador++;
						}
					}
					System.out.println("El número introducido existe " + contador + " veces");
					
				}else {
					System.out.println("El número introducido no existe en el array.");
				}
				
				
	}

}
