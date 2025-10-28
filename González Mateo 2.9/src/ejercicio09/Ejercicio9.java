/* Descripción:
 * Programa que calcula y muestra la suma y el producto de los 10 primeros números naturales.
 * Autor: Cristian González Mateo
 * Fecha: 18/10/25
 */
package ejercicio09;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		int suma = 0; // Variable temporal para la suma
		int sumaTotal = 1; // Acumulador de la suma iniciando en 1
		int producto = 0; // Variable temporal para el producto
		int productoTotal = 1; // Acumulador del producto iniciando en 1
		
		// Bucle for para calcular la suma de los números del 1 al 10
		for (int i = 2; i <= 10; i++ ) {
			suma = sumaTotal; // Guarda el valor anterior de la suma
			sumaTotal  = suma + i; // Calcula la nueva suma
			System.out.println("La suma de " + suma + " + " + i + " es " + sumaTotal); // Muestra el resultado parcial
		}
		
		// Bucle for para calcular el producto de los números del 1 al 10
		for (int i = 2; i <= 10; i++ ) {
		    producto = productoTotal; // Guarda el valor anterior del producto
		    productoTotal = producto * i; // Calcula el nuevo producto
		    System.out.println("La multiplicacion de " + producto + " por " + i + " es " + productoTotal); // Muestra el resultado parcial
	    }	
	}

}
