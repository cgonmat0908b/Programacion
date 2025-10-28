/* Descripción:
 * Programa que evalúa los datos personales y laborales del usuario 
 * para determinar si cumple el perfil de contratación y asigna un salario.
 * Autor: Cristian González Mateo
 * Fecha: 12/10/25
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);

		System.out.println("Introduce tu nombre:");
		String nombre = datos.next(); // Se guarda el nombre del usuario
		
		datos.nextLine(); 
		
		System.out.println("Introduce tus apellidos:");
		String apellidos = datos.nextLine(); // Se guardan los apellidos del usuario

		System.out.println("Introduce tu edad:");
		byte edad = datos.nextByte(); // Se guarda la edad del usuario
		
		System.out.println("Introduce tu salario deseado:");
		int salarioDeseado = datos.nextInt(); // Se guarda el salario deseado
		
		// Verifica si el salario deseado o la edad exceden los límites del perfil
		if (salarioDeseado > 30000 || edad > 45) {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		}else {
			System.out.println("Cuantos años de experiencia tienes?");
			byte añosDeExperiencia = datos.nextByte(); // Se guarda la experiencia laboral
			
			System.out.println("En cuantos proyectos has trabajado hasta ahora?");
			byte numeroProyectos = datos.nextByte(); // Se guarda el número de proyectos realizados
			
			// Comprueba si cumple los requisitos mínimos de experiencia y proyectos
			if(añosDeExperiencia > 2 && numeroProyectos > 3) {
				System.out.println("Enhorabuena. Ha sido contratado"); // Mensaje de aceptación
				
				// Asigna el salario según la experiencia y proyectos
				if(añosDeExperiencia > 5 || numeroProyectos > 5) {
					System.out.println("Su salario sera de 30000 euros anuales"); // Salario alto
			 	}else {
					System.out.println("Su salario sera de 25000 euros anuales"); // Salario base
			    }
			}else {
				System.out.println("Lo sentimos pero no cumple nuestro perfil"); // Mensaje de rechazo
		    }
	  }

	}
}

