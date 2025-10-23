package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego muestre la suma de todos los valores.
		 */
		
        Scanner datos = new Scanner (System.in);
 		
		double [] nums = new double [10];
		double numIntroducido;
		double suma = 0;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce un número real");
			nums[i] = datos.nextInt();
		}
		for (int f = 0; f < nums.length; f++) {
			suma = suma + nums[f];
		}
		System.out.println("La suma de los numeros introducidos es: " + suma);
	}

}
