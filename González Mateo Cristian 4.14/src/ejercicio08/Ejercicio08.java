package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
cuántos valores del array son igual o superiores a R.
		 */
		
		Scanner datos = new Scanner(System.in);
		
		double [] nums = new double[100];
		double valorGen = 0;
		double numUser;
		int contadorIguales = 0, contadorMayores = 0;
		
		for (int i = 0; i < nums.length; i++) {
			valorGen = Math.random();
			nums[i] = valorGen;
			
		}
		
		System.out.println("Los valores han sido generados, introduce un valor real R (entre 0-1)");
		numUser = datos.nextDouble();
		
		for (int f = 0; f < nums.length; f++) {
			if (nums[f] > numUser) {
				contadorMayores++;
				
			}else if (nums[f] == numUser) {
				contadorIguales++;
				
			}
		}
		System.out.println("Se han generado " + contadorMayores + " números mayores al que has introducido");
		System.out.println("Se han generado " + contadorIguales + " números iguales al que has introducido");
		
	}

}
