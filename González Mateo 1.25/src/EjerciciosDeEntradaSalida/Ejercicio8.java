/*Descripción: Uso de código para petiones de datos de entrada y salida
 * Autor: Cristian González Mateo
 * Fecha: 1/10/25
 */
package EjerciciosDeEntradaSalida;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);
		
		String nombreFicha;
		System.out.println("¿Cómo te llamas?");
		nombreFicha = datos.next();
		
		String direccionFicha;
		System.out.println("¿Cúal es tu dirección de residencia?");
		direccionFicha = datos.next();
		
		int numeroTelefono;
		System.out.println("¿Cual es tu número de teléfono?");
		numeroTelefono = datos.nextInt();
		
		System.out.println("*******DATOS PERSONALES*******");
		System.out.println("*******NOMBRE: " + nombreFicha + " *******");
		System.out.println("*******DIRECCIÓN: " + direccionFicha + " *******");
		System.out.println("*******NÚMERO DE TELÉFONO: " + numeroTelefono +  " *******");
		
	}

}