package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		//Crea un programa que pida diez números reales por teclado, los almacene en un array, y
		//luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
		
        Scanner datos = new Scanner (System.in);
 		
		double [] nums = new double [10];
		double numIntroducido;
		double valorMin = 0;
		double valorMax = 0;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce un número real");
			nums[i] = datos.nextDouble();
			
			
		}
		for (int f = 0; f < nums.length; f++) {
			
			if (valorMin > nums[f]){
			valorMin = nums[f];
			}
			
			if(valorMax < nums[f]){
				valorMax = nums[f];
			
			}
		}	
		
		System.out.println("El numero más alto introducido es: " + valorMax);
		System.out.println("El numero más bajo introducido es: " + valorMin);
		
	}
   
}