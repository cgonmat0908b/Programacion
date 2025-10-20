/* Descripción: Entrada de dos números y comprobar si es mayor, menor o igual
 * Autor: Cristian González Mateo
 * Fecha: 06/10/25
 */
package ejercicio08;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		System.out.println("Introduce un número"); // Solicita el primer número
		int num1 = datos.nextInt(); // Lee el primer número introducido
		
		System.out.println("Introduce otro número"); // Solicita el segundo número
		int num2 = datos.nextInt(); // Lee el segundo número introducido
		
		if (num1 > num2 ) { // Compara si el primer número es mayor que el segundo
			System.out.println("El primer número es mayor que el segundo número");
		} 
		else {
		if (num1 < num2 ){ // Compara si el primer número es menor que el segundo
			System.out.println("El primer número es menor que el segundo número");
			}
		else { // Si no es mayor ni menor, entonces son iguales
			System.out.println("El número es igual");
		 }
	 }
	}

}