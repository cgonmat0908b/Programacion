package ejercicio01;

import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un programa que pida diez números reales por teclado, los almacene en un array, y
		//luego muestre todos sus valores.
		
		Scanner datos = new Scanner (System.in);
		
		double [] nums = new double [10];
		double numIntroducido;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce un número real");
			nums[i] = datos.nextInt();
		}
		for (int f = 0; f < nums.length; f++) {
			System.out.println("Los numeros introducidos son : " + nums[f]);
		}

	}

}
