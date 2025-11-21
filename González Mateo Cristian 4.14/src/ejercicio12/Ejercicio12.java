package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  12. Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe
 tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en
 millas.
		 */
		
		   Scanner datos = new Scanner (System.in);
		   double km;
		   
		   System.out.println("Introduce un valor en kilómetros");
		   km = datos.nextDouble();
		   
		   System.out.println("El valor en millas es: " + millas(km));
	}

	public static double millas(double km) {
		double milla;
		milla = km * 0.621371;
		return milla;
	}
}
