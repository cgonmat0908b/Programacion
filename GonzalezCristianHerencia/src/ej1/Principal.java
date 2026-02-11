package ej1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		// Instanciación de 3 objetos, 1 humano 2 ciudadanos
		Humano paco = null;
		Ciudadano espanyol = null;
		Ciudadano americano = null;
		
		//Inicialización Objeto Humano
		try {
			String nombre = "Paco";
			String apellido = "Rodriguez";
			paco = new Humano(nombre,apellido);
			
		}catch(IllegalArgumentException ex1){
			System.out.println(ex1.getMessage());
		}
		
		//Inicialización Objeto Ciudadano
		
		try {
			String nombre = "Alberto";
			String apellido = "Rodriguez";
			String documento = "DNI";
			espanyol = new Ciudadano(nombre,apellido,documento);
			
		}catch(IllegalArgumentException ex1){
			System.out.println(ex1.getMessage());
		}
		
		//Inicialización Objeto Ciudadano
		
		try {
			String nombre = "Michael";
			String apellido = "Jordan";
			String documento = "REAL ID";
			americano = new Ciudadano(nombre,apellido,documento);
					
		}catch(IllegalArgumentException ex1){
					System.out.println(ex1.getMessage());
		}
		
		// Uso del metodo getNombreCompleto e identificacion
		System.out.println(paco.getNombreCompleto());
		System.out.println(espanyol.identificacion());
		System.out.println(americano.identificacion());
		
		// Creacion de objeto humano por omision y muestra de estado
		
		Humano defecto = new Humano();
		System.out.println("Por defecto: " + defecto.getNombreCompleto());
		
		// Toma de datos
		
		System.out.println("Introduce el nombre:");
		String nom = datos.nextLine();
		
		System.out.println("Introduce el apellido:");
		String apell = datos.nextLine();
		
		//Modificación de objeto humano
		
		defecto.setNombre(nom);
		defecto.setApellido(apell);
		
		// Muestra tras modificacion
		System.out.println(defecto.getNombreCompleto());
		
	}

}
