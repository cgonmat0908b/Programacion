package ejercicio15;

import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa que pida la usuario dos valores N y M y luego cree un array de tamaño N
 que contenga M en todas sus posiciones. Luego muestra el array por pantalla.
		 */
		
		Scanner datos = new Scanner (System.in);
		int numIntro;
		
		System.out.println("Introduce el tamaño del array");
		int [] arrayIntro = new int [datos.nextInt()];
		
		System.out.println("Introduce el número que habrá en cada posción del array");
		numIntro = datos.nextInt();
		
		Arrays.fill(arrayIntro,numIntro );
		
		for (int i = 0; i < arrayIntro.length; i++) {
			System.out.println("En la posición " + i + " hay guardado " + arrayIntro[i]);
		}

	}

}
