package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Crea un programa que pida veinte números enteros por teclado, los almacene en un array y
		//luego muestre por separado la suma de todos los valores positivos y negativos.
		
        Scanner datos = new Scanner (System.in);
 		
		double [] nums = new double [20];
		double numIntroducido;
		double acumuladorPositivos = 0;
		double acumuladorNegativos = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			System.out.println("Introduce un número entero");
			nums[i] = datos.nextDouble();
			
		}
		for (int f = 0; f < nums.length; f++) {
	
			if (nums[f] > 0){
			acumuladorPositivos = acumuladorPositivos + nums[f];
			}
			
			if (nums[f] < 0){
				acumuladorNegativos= acumuladorNegativos + nums[f];
			
			}
		}	
		System.out.println("El numero más alto introducido es: " + acumuladorPositivos);
		System.out.println("El numero más bajo introducido es: " + acumuladorNegativos);
	}

}
