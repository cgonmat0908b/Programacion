package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
		//escriba M en todas sus posiciones y lo muestre por pantalla.

		Scanner datos = new Scanner (System.in);
		
		int [] array;
		int posArray, numArray;
		
		
		System.out.println("Introduce el primer número, (numero de posiciones que tendrá el array)");
		posArray = datos.nextInt();
		array = new int [posArray];
		
		System.out.println("Introduce el segundo número, (numero que habrá en cada posición del arraya)");
		numArray = datos.nextInt();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = numArray;
			System.out.println("En la posicion " + i + " se encuentra el numero " + numArray);
		}

	}

}
