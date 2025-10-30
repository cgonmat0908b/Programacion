package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
todos los valores desde P hasta Q, y lo muestre por pantalla.

		 * 
		 */
		Scanner datos = new Scanner(System.in);
		int num1, num2;
		int numsArray;
		
		System.out.println("Introduce un número");
		num1 = datos.nextInt();
		
		System.out.println("Introduce un número");
		num2 = datos.nextInt();
		
		numsArray = num1 + num2;
		
		int [] nums = new int [numsArray];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
			System.out.println(nums[i]);
		}
	
	}

}
