package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
 primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
 primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
		 */
		Scanner datos = new Scanner (System.in);
		
		int [] array1 = new int [100];
		int [] array2 = new int [100];
		int valorInverso = 0, contadorArray1 = 99, contadorArray2 = 0;
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (i + 1);
		}
		
		do {
			array2[contadorArray2] = array1[contadorArray1];
			contadorArray1--;
			contadorArray2++;
		}while(contadorArray1 != 0);
			
		
		for (int z = 0; z < array1.length; z++) {
			System.out.println("En la posición " + z + " hay guardado en el primer array:" + array1[z]);
			System.out.println("En la posición " + z + " hay guardado en el segundo array: " + array2[z]);
		}
	}

}
