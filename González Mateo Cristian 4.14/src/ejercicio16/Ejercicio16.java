package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * .  16. Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
 valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con
 valores aleatorios.
		 */
	
		Scanner datos = new Scanner(System.in);
		
		
		System.out.println("Introduce la longitud del array: ");
		double [] tamanio = new double [datos.nextInt()];
	
		aleatorio(tamanio);
		
		for (int i = 0; i < tamanio.length; i++) {
			System.out.println(tamanio[i]);
		}
	}
	
	public static double[] aleatorio(double [] nums) {
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Math.random();
		}
		return nums;
	}

}
