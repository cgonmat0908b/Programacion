package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		/*
		 * Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
 uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
 double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
		 */

		
		
		Scanner datos = new Scanner (System.in);
		
		double[] precio = new double[5];
		double[] precioIva;
		
		for (int i = 0; i < precio.length; i++) {
			System.out.println("Introduce el precio (" + i + ")");
			precio[i] = datos.nextDouble();
		}
		System.out.println("Los precios modificados con IVA ya calculado son:");
		precioIva = precioConIVA(precio);
		
		for(int i = 0; i < precio.length; i++) {
			System.out.println(precioIva[i]);
		}
	}

	public static double[] precioConIVA(double[] precio) {
		double[] precioMod = new double[5] ;
		for(int i = 0; i < precio.length; i++) {
			precioMod[i] = (precio[i] * 1.21) ;
		}
		return precioMod;
	}
}


 
				//Hecho con array porque queria dificultarlo más.