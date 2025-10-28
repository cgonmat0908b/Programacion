/* Descripción:
 * Programa que calcula A elevado a B (A^B) sin usar el operador de potencia, 
 * mediante multiplicaciones sucesivas, con A y B introducidos por el usuario.
 * Autor: Cristian González Mateo
 * Fecha: 18/10/25
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		int a, b; // Variables para almacenar los números introducidos
		long acumulador = 1; // Acumulador para el resultado
		
		System.out.println("Introduce un número");
		a = datos.nextInt(); // Número base
		
		System.out.println("Introduce otro número");
		b = datos.nextInt(); // Exponente
		
		// Bucle for que multiplica a por sí mismo b veces
		for (int i = 0; i < b; i++){
			acumulador *= a; // Multiplicación sucesiva
		}
		
		System.out.println("El valor de " + a + " elevado a " + b + " es " + acumulador ); // Muestra el resultado
		
	}

}
