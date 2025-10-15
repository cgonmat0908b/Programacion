/* Descripción: Entrada de datos y comprobación de condiciones establecidas para ser admitido o no en el curso
 * Autor: Cristian González Mateo
 * Fecha: 06/10/25
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		System.out.println("Introduce tu nombre"); // Solicita el nombre del usuario
		String nombre = datos.next(); // Guarda el nombre introducido
		
		System.out.println("Introduce tu edad"); // Solicita la edad del usuario
		byte edad = datos.nextByte(); // Guarda la edad introducida
		
		System.out.println("Introduce tu nota"); // Solicita la nota del usuario
		byte nota = datos.nextByte(); // Guarda la nota introducida
		
		if (edad > 18 && nota >= 7) { // Comprueba si cumple ambas condiciones: ser mayor de 18 y tener nota mínima de 7
			System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas");
		}else { // Si no cumple alguna de las condiciones
			System.out.println (nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");
			
		}
	}
	
}