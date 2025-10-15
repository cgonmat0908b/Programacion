/* Descripción: Entrada de datos y comprobación si cumple los requerimientos para realizar los estudios
 * Autor: Cristian González Mateo
 * Fecha: 06/10/25
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		System.out.println("Introduce tu edad:"); // Solicita la edad del usuario
		byte edad = datos.nextByte(); // Guarda la edad introducida
		
		datos.nextLine(); // Limpiar el buffer del scanner para leer correctamente cadenas después de números
		
		if (edad < 18) { // Comprueba si el usuario es menor de 18 años
			System.out.println("No tiene la edad requerida para realizar estos estudios"); // Mensaje si no cumple la edad mínima
		}
		
		else { // Si tiene 18 años o más
		System.out.println("Introduce tu nombre:"); // Solicita el nombre
		String nombre = datos.next();	// Guarda el nombre introducido
		
		datos.nextLine(); // Limpiar el buffer del scanner nuevamente antes de leer apellidos
		
		System.out.println("Introduce tus apellidos"); // Solicita los apellidos
		String apellidos = datos.nextLine(); // Guarda los apellidos introducidos
		
		System.out.println("Nombre: " + nombre); // Muestra el nombre
		System.out.println("Apellidos: " + apellidos); // Muestra los apellidos
		System.out.println("Edad: " + edad); // Muestra la edad
		System.out.println(); // Línea en blanco para mejor presentación
		System.out.println("Usted ha sido admitido"); // Mensaje de admisión
		
		}

	}

}