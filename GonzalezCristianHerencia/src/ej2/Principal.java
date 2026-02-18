package ej2;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Principal {

	public static void main(String[] args) {
		// Por omision
		Coche c1 = new Coche();
		
		// Valores validos
		Coche c2 = new Coche("4523AGV", "Juan", LocalDate.of(2005, 9, 12), 2500, 50);
		
		// Valores no validos
		Coche c3 = null;
		
		try {
			 c3 = new Coche("453AGV", "Juan", LocalDate.of(2005, 9, 12), 2500, 50);
		}catch(IllegalArgumentException ex1){
			System.out.println(ex1.getMessage());
			c3 = new Coche();
		}
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		// Creacion de deportivo con metodo
		
		Deportivo prueba = obtenerDeportivo();
		
		System.out.println(prueba.toString());
		
		
	}
	
	public static Deportivo obtenerDeportivo() {
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce matricula:");
		String matricula = datos.nextLine();
		
		System.out.println("Introduce nombre del propietario:");
		String nom = datos.nextLine();
		
		String fechaCadena = null;
		do{
			System.out.println("Introduce  fecha de matriculacion: (AAAA-MM-DD)");
			fechaCadena = datos.nextLine();
		}while(!Pattern.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}",fechaCadena));
			
		LocalDate fecha = LocalDate.parse(fechaCadena);
		
		System.out.println("Introduce cilindrada:");
		int cilindrada = datos.nextInt();
		
		System.out.println("Introduce potencia:");
		int potencia = datos.nextInt();
		
		datos.nextLine();
		
		System.out.println("Introduce tipo de traccion:");
		String traccion = datos.nextLine();
		
		Deportivo depor = null;
		try {
			depor = new Deportivo(matricula,nom,fecha,cilindrada,potencia,traccion);
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			
		}
		
		return depor;
	}

}
