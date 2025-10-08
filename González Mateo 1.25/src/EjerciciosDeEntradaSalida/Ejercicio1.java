/*Descripción: Uso de código para petiones de datos de entrada y salida
 * Autor: Cristian González Mateo
 * Fecha: 1/10/25
 */
package EjerciciosDeEntradaSalida;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);
		
		String nombre;
		System.out.println("¿Cómo te llamas?");
		nombre = datos.next();
		System.out.println("Hola " + nombre);
		
	}

}