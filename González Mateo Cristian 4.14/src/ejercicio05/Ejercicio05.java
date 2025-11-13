package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		/*
		 * Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
 Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
 double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
		 */
		
		Scanner datos = new Scanner(System.in);
 		int millas;
 		
 		System.out.println("Introduce las millas que quieres pasar a KM");
 		millas = datos.nextInt();
 		
 		System.out.println("El resultado es " + millas_a_kilometros(millas));
 		
	}

	public static double millas_a_kilometros(int millas) {
		double kMS = 0;
		kMS = millas * 1.60934;
		return kMS;
	}
}
