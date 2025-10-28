/* Descripción:
 * Programa que solicita las notas de varias asignaturas, calcula la media,
 * la redondea hacia arriba y hacia abajo, y determina si el alumno puede acceder a estudios superiores.
 * Autor: Cristian González Mateo
 * Fecha: 12/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4{

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce tu nota de programacaión");
		double notaProg = datos.nextDouble(); // Nota de Programación
		
		System.out.println("Introduce tu nota de base de datos");
		double notaBD= datos.nextDouble(); // Nota de Bases de Datos
		
		System.out.println("Introduce tu nota de lenguaje de marcas");
		double notaLM= datos.nextDouble(); // Nota de Lenguaje de Marcas
		
		System.out.println("Introduce tu nota de sistemas informaticos");
		double notaSI= datos.nextDouble(); // Nota de Sistemas Informáticos
		
		double notaMedia = (notaProg + notaBD + notaLM + notaSI) / 4; // Cálculo de la nota media
		
		// Comprueba si alguna nota es inválida
		if (notaMedia > 10 || notaMedia < 0) {
			System.out.println("Alguna nota ha sido introducida incorrectamente");
		}else {
			
			double redondeoAlza = Math.ceil(notaMedia); // Redondeo hacia arriba
			System.out.println("Tu nota media redondeada a la alza es: " + redondeoAlza);
			
			double redondeoBaja = Math.floor(notaMedia); // Redondeo hacia abajo
			System.out.println("Tu nota media redondeada a la baja es: " + redondeoBaja);
		
			// Determina si el estudiante tiene acceso a estudios superiores
			if (redondeoAlza > 8 || redondeoBaja > 8) {
				System.out.println("Enhorabuena, tiene acceso a estudios superiores");
			}else {
				System.out.println("Lo lamentamos, no tiene acceso a estuidos superiores");
			}		
	  }	
	} 
}
