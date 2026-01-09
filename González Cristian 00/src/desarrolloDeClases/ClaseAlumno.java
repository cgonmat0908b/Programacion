package desarrolloDeClases;

import java.time.LocalDate;

import java.time.LocalTime;

public class ClaseAlumno {

	/* Atributos:
	 * -Dni
	 * Nombre
	 * Fecha-Nacimiento
	 * Numero-Hermanos
	 * Numero de alumnos matriculados
	 * Hora máxima hasta la que puede permanecer en el centro 
	 * Máximo número alumnos por clase
	 * -Apellidos
	 * -peso
	 * -altura
	 * -numero máximo de alumnos: (cantidad máxima de alumnos en el centro)
	 * numero mínimo de alumnos por clase
	 *  es mayor de edad?¿ Se tiene en cuenta si es mayor de edad el 31 de diciembre del año en curso
	 *  Hora máxima jasta la que puede permanecer en el centro (Alumno)
	 * 
	 * Para estos datos hay que:
	 * - Establecer identificador
	 * - Asignar el tipo más adecuado
	 * - Asignar modificador de acceso adecuado
	 * - Asignar si es un atributo de objeto o de clase
	 */
	
	// Atributos de clase constantes
	public static final byte MAX_ALUMNOS_GRUPO = 30;
	
	public static final LocalTime HORA_CENTRO = LocalTime.of(21,30);
	
	public static final short NUM_ALUM_CENTRO_MAX = 1500;
	
	public static final byte NUM_MIN_ALUM_GRUPO = 1;
	
	public static final LocalTime HORA_MAX_ALUM = LocalTime.of(15,00);
	
	
	// Atributos de clase variables
	private static int numAlumnosMatriculados;
	
	// Atributos de objeto variables
	
	private String dni;
	
	private String nombre;
	
	private String apellidos;
	
	private short peso;
	
	private float altura;
	
	private LocalDate fechaNacimiento;
	
	private byte numHermanos;
	
	private boolean mayorEdad;	
	
	/*
	 * Creación del contructor de la clase ClaseAlumno
	 */
	
	public ClaseAlumno(String dni,String nombre,String apellidos,short peso,float altura,LocalDate fechaNacimiento,byte numHermanos,boolean mayorEdad) {
		
		if(DniValido(dni) == false) {
			
		}
		
		
	}
	
	public static boolean DniValido(String dni) {
		boolean dniValido = false;
		
		if(dni == null || !dni.matches("[0-9]{8}[A-Z]")) {
			dniValido = false;
			return dniValido;
			
		}else {
			dniValido = true;
		}
		return dniValido;
	}
}


