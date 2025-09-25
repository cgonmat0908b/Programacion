/*
 * Descripción: Ejemplo para petición de datos al programa
 * Autor: Cristian González Mateo
 * Fecha: 24/09/25
 */
package entradadatos;

import java.util.Scanner;

public class PeticiónDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);
		
		int edadAlumno;
		System.out.print("INTRODUCE TU EDAD: ");
		edadAlumno = datos.nextInt();
		
		System.out.println("La edad del alumno es: " + edadAlumno);
		
		datos.nextLine(); //Después de pedir valor númerio y antes de pedir cadena de caracteres
		String nombreAlumno;
		System.out.print("INTRODUCE TU NOMBRE: ");
		nombreAlumno = datos.nextLine();
		System.out.println("El nombre del alumno es: " + nombreAlumno);
		
		double pesoAlumnos;
		System.out.print("INTRODUCE TU PESO: ");
		pesoAlumnos = datos.nextDouble();
		System.out.println("El peso del alumno es: " + pesoAlumnos);
	}

}
