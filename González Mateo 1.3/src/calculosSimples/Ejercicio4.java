/*Descripción: Aplicación de la clase Math en datos pedidos en pantalla para redondear
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
		numeroDecimal = datos.nextDouble(); // Lee el número decimal introducido por el usuario
		
		double claseCeil = Math.ceil(numeroDecimal); // Redondea hacia arriba al entero más próximo
		double claseFloor = Math.floor(numeroDecimal); // Redondea hacia abajo al entero más próximo
		long claseRound = Math.round(numeroDecimal); // Redondea al entero más cercano (0.5 hacia arriba)
		
		System.out.println("Valor ingresado es: " + numeroDecimal);
	    System.out.println("Math.ceil = " + claseCeil + " -> Redondea hacia arriba al entero más cercano.");
	    System.out.println("Math.floor = " + claseFloor + " -> Redondea hacia abajo al entero más cercano.");
	    System.out.println("Math.round = " + claseRound + " -> Redondea al entero más cercano (0.5 hacia arriba).");
	
	}

}