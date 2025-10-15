/* Descripción: Algoritmo para premiar a un cliente con un vale de descuento si cumple los requisitos
 * Autor: Cristian González Mateo
 * Fecha: 06/10/25
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		System.out.println("Indica tu nombre"); // Solicita el nombre del cliente
		String nombre = datos.next(); // Guarda el nombre introducido
		
		datos.nextLine(); // Limpia el buffer para leer correctamente los apellidos
		
		System.out.println("Indica tus apellidos"); // Solicita los apellidos del cliente
		String apellidos = datos.nextLine(); // Guarda los apellidos introducidos
		
		System.out.println("Que cantidad gastó en su primer importe?"); // Solicita primer importe
		double importe1 = datos.nextShort(); // Guarda el primer importe (como double a partir de short)
		
		System.out.println("Que cantidad gastó en su segundo importe?"); // Solicita segundo importe
		double importe2 = datos.nextShort(); // Guarda el segundo importe
		
		System.out.println("Que cantidad gastó en su tercer importe?"); // Solicita tercer importe
		double importe3 = datos.nextShort(); // Guarda el tercer importe
		
		System.out.println("Que cantidad gastó en su cuarto importe?"); // Solicita cuarto importe
		double importe4 = datos.nextShort(); // Guarda el cuarto importe
		
		double sumaImportes = importe1 + importe2 + importe3 + importe4; // Calcula la suma de todos los importes
		double mediaImportes = sumaImportes / 4; // Calcula la media de los importes
		
		if (sumaImportes > 300) { // Comprueba si la suma supera los 300€
			System.out.println("Enhorabuena señ@r " + nombre + " " + apellidos + ", tiene un vale de descuento de 50€ ya que,"
					+ " sus importes suman más de 300€"); // Mensaje de premio
		}
		else { // Si la suma no supera los 300€
			System.out.println("Nombre: " + nombre); // Muestra el nombre
			System.out.println("Apellidos: " + apellidos); // Muestra los apellidos
			System.out.println("Importe Gastado1: " + importe1); // Muestra el primer importe
			System.out.println("Importe Gastado2: " + importe2); // Muestra el segundo importe
			System.out.println("Importe Gastado3: " + importe3); // Muestra el tercer importe
			System.out.println("Importe Gastado4: " + importe4); // Muestra el cuarto importe
			
			System.out.println(); // Línea en blanco para mejor presentación
			
			System.out.println("Importe medio: " + mediaImportes); // Muestra la media de los importes
			
			System.out.println(); // Línea en blanco para separar mensajes
			
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento."); // Mensaje de no premio
			
			}
		
	}

}