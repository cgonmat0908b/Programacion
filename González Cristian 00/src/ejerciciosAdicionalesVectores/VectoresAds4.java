package ejerciciosAdicionalesVectores;

import java.util.Scanner;

public class VectoresAds4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner datos = new Scanner(System.in);
		int[] nums = new int [10];
		
		/*
		 * Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el
penúltimo, el tercero, etc.

		 */
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce un numero:");
			nums[i]= datos.nextInt();
		}
		
		for (int f = 0; f < (nums.length / 2); f++) {
			System.out.println(nums[f]);
			System.out.println((nums.length + 1) - nums[f]);
			
		}
	}

}
