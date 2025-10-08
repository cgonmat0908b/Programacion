/*
 * Descripción: Funcionamiento ejmplifiicado de los operadores condicionales
 * Autor: Cristian
 * Fecha:26/09/2025
 */
package practicaOperadores;

import java.util.Scanner;

public class OperadoresCondicionales {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String nombre;
		System.out.println("Dime tu nombre: ");
		nombre = datos.next();
		
		nombre = nombre.toUpperCase();
		System.out.println(nombre);
		
		System.out.println(nombre.toLowerCase());
		
		boolean Cristian;
		Cristian = nombre.equals("Cristian");
		System.out.println(Cristian);
	
		
		int longitud = nombre.length();
		System.out.println("El numero de caracteres es: " + longitud);
		
	
		int edad;
		System.out.println("Introduce tu edad: ");
		edad = datos.nextInt();
		
		String mayorEdad;
		mayorEdad = (edad >= 18) ? "Eres mayor de edad": "Eres menor de edad";
		System.out.println(mayorEdad);
		

		

	}

}
