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
		Persona persona1;
		Persona persona2;
		
		// Datos por teclado
		
		//P1
		System.out.println("Introduce el dni de la persona 1");
		String dni1 = datos.nextLine();
		
		System.out.println("Introduce el nombre de la persona 1");
		String nombre1 = datos.nextLine();

		System.out.println("Introduce los apellidos de la persona 1");
		String apellidoP1 = datos.nextLine();
		
		System.out.println("Introduce la edad de la persona 1");
		byte edad1 = datos.nextByte();
		
		datos.nextLine();
		
		persona1 = new Persona(dni1,nombre1,apellidoP1,edad1);
		
		//P2
		System.out.println("Introduce el dni de la persona 2");
		String dni2 = datos.nextLine();
		
		
		System.out.println("Introduce el nombre de la persona 2");
		String nombre2 = datos.nextLine();
		
		System.out.println("Introduce los apellidos de la persona 2");
		String apellidoP2 = datos.nextLine();
		
		System.out.println("Introduce la edad de la persona 2");
		byte edad2 = datos.nextByte();
		
		datos.nextLine();
		
		persona2 = new Persona(dni2,nombre2,apellidoP2,edad2);
		
		// Muestra de datos
		
		System.out.printf("La persona1 con dni %s, se llama %s  %s y es ", persona1.dni, persona1.nombre, persona1.apellidos);
		Mayor(MayorEdad(persona1.edad));
		
		System.out.printf("La persona2 con dni %s, se llama %s %s y es ", persona2.dni, persona2.nombre, persona2.apellidos);
		Mayor(MayorEdad(persona2.edad));
		
	}
	
	public static boolean MayorEdad (byte edad) {
		boolean mayor = false;
		if(edad >= 18) {
			mayor = true;
		}
		return mayor;
		
	}
	
	public static void Mayor(boolean comprobacion) {
		boolean comp = comprobacion;
		
		if(comp == true) {
			System.out.println("es mayor de edad");
		}else {
			System.out.println("es menor de edad");
		}
		
	}
	
}
