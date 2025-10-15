/*Descripción: Transformación de unidades de euros a pesetas y viceversa.
 * Fecha: 1/10/25
 * Autor: Cristian González Mateo
 */
package calculosSimples;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);
		System.out.println("Cuantos euros tienes?");
		double euros = datos.nextDouble(); // Lee la cantidad de euros introducida por el usuario
		
		double pesetaUna = 166.386; // Valor de conversión de 1 euro a pesetas
		double eurosAPesetas = euros * pesetaUna; // Convierte euros a pesetas
		
		System.out.println("Tienes " + eurosAPesetas + " pesetas");
		
		System.out.println("Cuantas pesetas tienes?");
		double pesetas = datos.nextDouble(); // Lee la cantidad de pesetas introducida por el usuario
		double pesetasAEuros = pesetas / pesetaUna; // Convierte pesetas a euros
		
		System.out.println("Tienes " + pesetasAEuros + " euros");
		
	}

}