package ej3;

import java.time.LocalDate;

public class Colegio {

	public static void main(String[] args) {
		
		
		// Constructor por defecto de Profesor
		Profesor defecto;
		
		try {
			defecto = new Profesor();
			
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			defecto = new Profesor();
			System.out.println("Se ha creado un profesor por defecto");
		}
		
		// Previo al aumento de sueldo
		System.out.println("Previo al aumento de sueldo:");
		System.out.println();
		
		System.out.println(defecto.toString());

		
		// Aumento de salario dado un porcentaje
		System.out.println("Tras el aumento de sueldo:");
		System.out.println();
		
		defecto.aumentoSalario(10);
		System.out.println(defecto.toString());
		System.out.println();
		
		// Constructor con todos los parametros de Profesor
		
		Profesor parametros;
		
		try {
			parametros = new Profesor("25739063Q","Paco", "Sanchez Gomez", LocalDate.of(1980, 5, 30), "Masculino",
					1700.00,"632182373","PacSanG@gmail.com","Profesorado de Educación Superior en Matemática",
					"Matematicas", "Lengua", true, (byte)5);
			
		}catch(IllegalArgumentException ex2) {
			System.out.println(ex2.getMessage());
			parametros = new Profesor();
			System.out.println("Se ha creado un profesor por defecto");
		}
		
		System.out.println(parametros.toString());
		
		// Aumento de salario segun los años de experiencia del profesor, 
		parametros.aumentoSalario();
		
		//Constructor por defecto de PAS
		
		// Constructor con todos los parametros de PAS
	}
	
}
