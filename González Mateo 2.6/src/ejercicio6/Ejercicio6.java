/* Descripción: Algoritmo de entrada de datos y muestra en pantalla la nota academica correspondiente junto a la palabra que le corresponde
 * Autor: Cristian González Mateo
 * Fecha: 06/10/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		System.out.println("Introduce tu nombre: "); // Solicita el nombre del alumno
		String nombre = datos.nextLine(); // Guarda el nombre introducido
		
		System.out.println("Introduce tus apellidos: "); // Solicita los apellidos del alumno
		String apellidos = datos.nextLine(); // Guarda los apellidos introducidos
		
		System.out.println("Introduce el ciclo formativo que cursas: "); // Solicita el ciclo formativo
		String ciclo = datos.nextLine(); // Guarda el ciclo formativo introducido
		
		System.out.println("Introduce tu  Nota académica"); // Solicita la nota académica
		byte nota = datos.nextByte(); // Guarda la nota introducida
		
		String notaPalabras = "Nota no válida"; // Variable para almacenar la descripción de la nota

        if (nota < 0 || nota > 10) { // Comprueba si la nota es válida
            notaPalabras = "La nota académica indicada es incorrecta";}
		
        else if (nota < 5) { // Si la nota es menor que 5
			notaPalabras = "Insuficiente";
		}
			else if (nota == 5) { // Si la nota es exactamente 5
				notaPalabras = "Suficiente";}
		
				else if (nota == 6) { // Si la nota es 6
					notaPalabras = "Bien";}
		
				else if (nota == 7 || nota == 8) { // Si la nota es 7 u 8
					notaPalabras = "Notable";}
		
				else if (nota == 9) { // Si la nota es 9
					notaPalabras = "Sobresaliente";}
        
				else if (nota == 10 ) { // Si la nota es 10
					notaPalabras = "Matrícula de Honor";}
	
	        System.out.println("Nombre: " + nombre); // Muestra el nombre
	        System.out.println("Apellidos: " + apellidos); // Muestra los apellidos
	        System.out.println("Ciclo Formativo: " + ciclo); // Muestra el ciclo formativo
	        System.out.println("Nota académica: " + nota + " ("+ notaPalabras + ")"); // Muestra la nota junto con su descripción
	}
}