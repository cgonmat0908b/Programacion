/*Descripción: Aplicación de la clase Math en datos pedidos en pantalla
 * Fecha: 1/10/25
 * Autor: Cristian González Mateo
 */
package calculosSimples;

import java.util.Scanner;


public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		double numeroDecimal;
		System.out.println("Introuduce un número decimal:");
		numeroDecimal = datos.nextDouble();
		
		double claseCeil = Math.ceil(numeroDecimal);
		double claseFloor = Math.floor(numeroDecimal);
		long claseRound = Math.round(numeroDecimal);
		
		 System.out.println("Valor ingresado es: " + numeroDecimal);
	        System.out.println("Math.ceil = " + claseCeil + " -> Redondea hacia arriba al entero más cercano.");
	        System.out.println("Math.floor = " + claseFloor + " -> Redondea hacia abajo al entero más cercano.");
	        System.out.println("Math.round = " + claseRound + " -> Redondea al entero más cercano (0.5 hacia arriba).");
	
	}

}
