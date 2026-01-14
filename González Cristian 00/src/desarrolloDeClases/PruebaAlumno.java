package desarrolloDeClases;

import java.time.LocalDate;
import java.time.LocalTime;

import desarrolloDeClases.ClaseAlumno;

public class PruebaAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaseAlumno prueba1 = new ClaseAlumno();
		
		ClaseAlumno prueba2 = new ClaseAlumno();
		
		System.out.println(ClaseAlumno.getNumAlumnosMatriculados());
		
		// Uso de contructor con 3 parametros, Dni mal
		try {
			
			String dni = "45239843W";
			String nombre = "Juan";
			String apellidos = "Jimenez Gomez";
			
			ClaseAlumno tresParametros = new ClaseAlumno(dni,nombre,apellidos);
			
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
		}
		
		
		//Constructor con todos los parametros
		
		ClaseAlumno todosLosParametros = new ClaseAlumno();
		try {
			
			String dni = "25739063Q";
			String nombre = "Juan";
			String apellidos = "Jimenez Gomez";
			float peso = 80.54f;
			float altura = 165.5f;
			LocalDate fechaNacimiento = LocalDate.of(2008, 1, 1);
			byte numHermanos = 0;
			boolean mayorEdad = todosLosParametros.getMayorEdad();
			LocalTime horaMaxAlum = LocalTime.of(21, 30);
			
			todosLosParametros = new ClaseAlumno(dni,nombre,apellidos,peso,altura,fechaNacimiento,numHermanos,mayorEdad,horaMaxAlum);
			
		}catch(IllegalArgumentException ex1){
			System.out.println(ex1.getMessage());
		}
		
		
		//Metodo toString
		System.out.println(todosLosParametros.toString());
		
		//Metodo estatico de clase para saber la cantidad de alumnos matriculados
		
		System.out.println(ClaseAlumno.getNumAlumnosMatriculados());
	}

}
