package ejercicio2;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En el main de la clase principal instancia dos objetos de la clase Persona.

Luego, pide por teclado los datos de ambas personas (guárdalos en los objetos). 

Por último, imprime dos mensajes por pantalla (uno por objeto) con un mensaje del estilo “Azucena Luján García con
DNI … es / no es mayor de edad”.
		 */
		Scanner datos = new Scanner(System.in);
		
		// Instanciación
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		// Datos por teclado
		
		//P1
		System.out.println("Introduce el dni de la persona 1");
		String dni1 = datos.next();
		
		System.out.println("Introduce el nombre de la persona 1");
		String nombre1 = datos.next();
		
		System.out.println("Introduce el primer apellido de la persona 1");
		String apellidoP1 = datos.next();
		
		System.out.println("Introduce la edad de la persona 1");
		byte edad1 = datos.nextByte();
		
		persona1.dni = dni1;
		persona1.nombre = nombre1;
		persona1.apellidos = apellidoP1;
		persona1.edad = edad1;
		
		//P2
		System.out.println("Introduce el dni de la persona 2");
		String dni2 = datos.next();
		
		System.out.println("Introduce el nombre de la persona 2");
		String nombre2 = datos.next();
		
		System.out.println("Introduce el primer apellido de la persona 2");
		String apellidoP2 = datos.next();
		
		System.out.println("Introduce la edad de la persona 2");
		byte edad2 = datos.nextByte();
		
		persona1.dni = dni2;
		persona1.nombre = nombre2;
		persona1.apellidos = apellidoP2;
		persona1.edad = edad2;
		
		// Muestra de datos
		
		System.out.printf("La persona1 se llama %s", persona1.dni, persona1.nombre, persona1.apellidos,MayorEdad(edad1));
	}
	
	public static boolean MayorEdad (byte edad) {
		boolean mayor = false;
		if(edad >= 18) {
			mayor = true;
		}
		return mayor;
		
	}

}
