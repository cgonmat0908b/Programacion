package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
mostrará en qué posiciones del array aparece N. 	
		 */
		
        Scanner datos = new Scanner(System.in);
		
		int [] nums = new int [100];
		int numUser;
		int contadorIguales = 0, contadorMayores = 0;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] =  (int) (1 + (Math.random() * 10));
			
		}
		
		System.out.println("Los valores han sido generados, introduce un valor entero entre 1 y 10");
		numUser = datos.nextInt();
		
		for (int f = 0; f < nums.length; f++) {
			if (nums[f] == numUser) {
				System.out.println("El numero " + numUser + " se encuentra en la posición " + f);
				
			}
		}
	}

}
