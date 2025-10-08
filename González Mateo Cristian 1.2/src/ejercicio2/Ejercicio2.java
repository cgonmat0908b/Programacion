/*
 *Descripción: Esta es la segunda práctica, en la que se estará
 *poniendo a prueba el uso de la entrada y guardado de datos,
 *interactuando con la máquina para que guarde la información 
 *dada en las variables correspondientes
 *
 *Autor: Cristian González Mateo
 *
 *Fecha: 25/09/25
 *
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner datos = new Scanner(System.in);
		String nombre;
		System.out.println("Introduce tu nombre: ");
		nombre = datos.nextLine();
	
		String apellidos;
		System.out.println("Introduce tus apellidos: ");
		apellidos = datos.nextLine();
		
		byte edad;
		System.out.println("Introduce tu edad: ");
		edad = datos.nextByte();
		
		datos.nextLine();
		
		String direccion;
		System.out.println("Introduce tu direccion: ");
		direccion = datos.nextLine();
		
		float altura;
		System.out.println("Introduce tu altura en metros: ");
		altura = datos.nextFloat();
		
		float peso;
		System.out.println("Introduce tu peso en kilogramos: ");
		peso = datos.nextFloat();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Dirección: " + direccion);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
	

	}

}
