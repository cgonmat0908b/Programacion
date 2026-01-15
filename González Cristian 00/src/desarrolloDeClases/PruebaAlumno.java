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
		
		// Uso de contructor con 3 parametros
		
		ClaseAlumno tresParametros = null; 
		try {
			
			String dni = "25739063Q";
			String nombre = "Juan";
			String apellidos = "Jimenez Gomez";
			
			tresParametros = new ClaseAlumno(dni,nombre,apellidos);
			
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
		}
		System.out.println(tresParametros.toString());
		
		//Constructor con todos los parametros
		
		ClaseAlumno todosLosParametros = null;
		try {
			
			String dni = "25739063Q";
			String nombre = "Juan";
			String apellidos = "Jimenez Gomez";
			float peso = 80.54f;
			float altura = 165.5f;
			LocalDate fechaNacimiento = LocalDate.of(2008, 1, 1);
			byte numHermanos = 0;
			LocalTime horaMaxAlum = LocalTime.of(21, 30);
			
			todosLosParametros = new ClaseAlumno(dni,nombre,apellidos,peso,altura,fechaNacimiento,numHermanos,horaMaxAlum);
			
		}catch(IllegalArgumentException ex1){
			System.out.println(ex1.getMessage());
		}
		
		
		//Metodo toString
		System.out.println(todosLosParametros.toString());
		
		//Metodo estatico de clase para saber la cantidad de alumnos matriculados
		
		System.out.println(ClaseAlumno.getNumAlumnosMatriculados());
		
	}

}
