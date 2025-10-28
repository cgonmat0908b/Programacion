/* Descripción:
 * Programa que solicita números al usuario hasta que introduzca un 0,
 * calcula la media de los números introducidos y muestra la cantidad total.
 * Autor: Cristian González Mateo
 * Fecha: 10/10/25
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4{

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce un numero, cuando introduzcas 0 no podras introducir más");
		int numero = datos.nextInt(); // Primer número introducido por el usuario
		
		int contador = 0; // Contador de números introducidos
		int acumulador = 0; // Acumulador de la suma de los números
		acumulador = numero; // Se inicia el acumulador con el primer valor
		
		// Bucle que se repite hasta que el usuario introduzca un 0
		while (numero != 0) {
			System.out.println("Introduce otro número o 0 si quieres parar");
			numero = datos.nextInt(); // Nuevo número ingresado
			contador = contador + 1; // Incrementa el contador
			acumulador = numero + acumulador; // Suma el número al acumulador
			
		}
		
		int media = acumulador / contador; // Cálculo de la media
		System.out.println("La media de los número sumados: " + media ); // Muestra la media
		System.out.println("Has introducido " + contador + " numeros"); // Muestra la cantidad de números
		
	} 
}
