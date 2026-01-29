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
		
		try{
			persona1 = new Persona(dni1,nombre1,apellidoP1,edad1);
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			persona1 = new Persona("25739063Q", "Cristian", "González Mateo", (byte) 21);
		}
		
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
		
		try{
			persona2 = new Persona(dni2,nombre2,apellidoP2,edad2);
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			persona2 = new Persona("25739063Q", "Cristian", "González Mateo", (byte) 21);
		}
		
		// Muestra de datos con Getters
		
		System.out.printf("La persona1 con dni %s, se llama %s  %s y es ", persona1.getDni(), persona1.getNombre(), persona1.getApellidos());
		Mayor(MayorEdad(persona1.getEdad()));
		
		System.out.printf("La persona2 con dni %s, se llama %s %s y es ", persona2.getDni(), persona2.getNombre(), persona2.getApellidos());
		Mayor(MayorEdad(persona2.getEdad()));
		
		// Uso de setters
		
		persona1.setDni("25739063Q");
		persona1.setNombre("Juan Francisco");
		persona1.setApellidos("Medina Azaar");
		persona1.setEdad((byte)21);
		
		persona2.setDni("25739063Q");
		persona2.setNombre("Cristobl");
		persona2.setApellidos("Colón");
		persona2.setEdad((byte)35);
		
		// Muestra de datos 
		System.out.printf("La persona1 con dni %s, se llama %s  %s y es ", persona1.getDni(), persona1.getNombre(), persona1.getApellidos());
		Mayor(MayorEdad(persona1.getEdad()));
		
		System.out.printf("La persona2 con dni %s, se llama %s %s y es ", persona2.getDni(), persona2.getNombre(), persona2.getApellidos());
		Mayor(MayorEdad(persona2.getEdad()));
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
