package ejercicio17;

import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un
 array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario
 si son iguales o no.
		 */
		
		Scanner datos = new Scanner(System.in);
		
		int [] array1 = new int[10];
		int [] array2 = new int[10];
		boolean arrayVerdadero;
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce 10 dígitos para el primer array");
			array1[i] = datos.nextInt();
			
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Introduce 10 dígitos para el segundo array");
			array2[i] = datos.nextInt();
			
		}
		
		if(Arrays.equals(array1, array2) == true) {
			System.out.println("Los arrays son identicos");
		}else {
			System.out.println("Los arrays no son identicos");
		}
	}

}
