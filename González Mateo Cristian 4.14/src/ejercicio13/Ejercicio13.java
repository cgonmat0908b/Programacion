/* Descripción:
 * Fecha:
 * Autor:
*/
package ejercicio13;


import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner datos = new Scanner(System.in);
		
		/*
		 *  13. Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
 Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
 crear una función a la que le pasemos ambos valores y nos devuelva el descuento (en %).
		 */
		double precio, precioDesc;
		
		System.out.println("Introduce el precio del articulo sin descuento");
		precio = datos.nextDouble();
		
		System.out.println("Introduce el precio del articulo con descuento");
		precioDesc = datos.nextDouble();
		
		System.out.println("El porcentaje de descuento es: " + Descuento(precio,precioDesc) + "%");
		
	}

	public static double Descuento(double precio, double precioDesc) {
		double porcentaje;
		porcentaje = (((precio - precioDesc) / precio)* 100);
		return porcentaje;
	
	}
}
