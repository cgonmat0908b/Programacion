package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  17. Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
 para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
 divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
 pasándole un número entero devuelva si es primo o no.
		 */
		
		Scanner datos = new Scanner(System.in);
		int numIntr;
		boolean esPrimo;
		
		System.out.println("Introduce el número:");
		numIntr = datos.nextInt();
		esPrimo = primo(numIntr);
		
		while(numIntr != 0) {
			if(esPrimo == true) {
				System.out.println("El numero introducido es primo");
				
			}else {
				System.out.println("El número introducido no es primo");
				
			}
			System.out.println("Introduce el número:");
			numIntr = datos.nextInt();
			esPrimo = primo(numIntr);
			
		}
		
		
	}

	public static boolean primo (int a) {
		boolean esPrimo = false;
		int contadorDiv = 0;
		
		if( a == 1) {
			esPrimo = false;
		}
		
		for(int i = 1; i <= a; i++) {
			if((a % i) == 0) {
				contadorDiv++;
			}
		}
		if (contadorDiv == 2) {
			esPrimo = true;
			
		}else {
			esPrimo = false;
		}
		return esPrimo;
	}
}
