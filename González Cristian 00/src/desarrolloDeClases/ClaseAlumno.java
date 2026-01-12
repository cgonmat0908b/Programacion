/* Descripción: Creación de la clase Alumno con los atributos indicados, como atributos para el constructor, se usará
 * los atributos que considere relevantes. 
 * Autor: Cristian González Mateo
 * Fecha: 12/01/2025
 */

package desarrolloDeClases;

import java.time.LocalDate;
import java.lang.IllegalArgumentException;
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
	
	// Si tuvieramos un tipo Enum se pondria por encima de los atributos de clase constantes
	
	// Atributos de clase constantes
	
	public static final byte MAX_ALUMNOS_GRUPO = 30;
	
	public static final LocalTime HORA_CENTRO = LocalTime.of(21,30);
	
	public static final short NUM_ALUM_CENTRO_MAX = 1500;
	
	public static final byte NUM_MIN_ALUM_GRUPO = 1;
	
	// Atributos de clase variables
	
	private static int numAlumnosMatriculados;
	
	// Atributos de objeto variables
	
	private String dni;
	
	private String nombre;
	
	private String apellidos;
	
	private float peso;
	
	private float altura;
	
	private LocalDate fechaNacimiento;
	
	private byte numHermanos;
	
	private boolean mayorEdad;	
	
	private LocalTime horaMaxAlum;
	
	/*
	 * Creación del constructor de la clase ClaseAlumno
	 */
	
	public ClaseAlumno(String dni,String nombre,String apellidos,float peso,float altura,LocalDate fechaNacimiento,byte numHermanos,boolean mayorEdad, LocalTime horaMaxAlum) throws IllegalArgumentException{
		
		if(dni == null || dni.isEmpty()) {
			throw new IllegalArgumentException("El parametro es nulo o contiene una cadena vacia");
			
		}else if(DniFormato(dni) == false) {
			throw new IllegalArgumentException("El formato del dni es incorrecto");
			
		}else if(DniCorrecto(dni) == false) {
			throw new IllegalArgumentException("El dni introducido no es correcto");
		}
		
		if(nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException("El parametro es nulo o contiene una cadena vacia");
		}
		
		if(apellidos == null || apellidos.isEmpty()) {
			throw new IllegalArgumentException("El parametro es nulo o contiene una cadena vacia");
		}
		
		if(peso <= 0) {
			throw new IllegalArgumentException("El peso no puede ser menor o igual a 0");
		}
		if(altura <= 0) {
			throw new IllegalArgumentException("La altura no puede ser menor o igual a 0");
		}
		if(FechaNacimCorrecta(fechaNacimiento) == false) {
			throw new IllegalArgumentException("La fecha introducida no es correcta");
		}
		if(numHermanos < 0) {
			throw new IllegalArgumentException("No puedes tener hermanos negativos");
		}
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.peso = peso;
		this.altura = altura;
		this.fechaNacimiento = fechaNacimiento;
		this.numHermanos = numHermanos;
		this.mayorEdad = MayorEdad(fechaNacimiento);
		
		numAlumnosMatriculados++;
		
	}
	
	//Metodo que comprueba que el formato del DNI sea 8 numeros y 1 letra dado el Dni como parametro.
	
	public static boolean DniFormato(String dni) {
		boolean dniValido = false;
		
		if(dni == null || !dni.matches("[0-9]{8}[A-Z]")) {
			dniValido = false;
			return dniValido;
			
		}else {
			dniValido = true;
		}
		return dniValido;
	}
	
	// Método que comprueba que los números del DNI corresponden con la letra dado el DNI como parametro.
	
	public static boolean DniCorrecto(String dni) {
		
		boolean dniCorrecto = false;
		char[] letras = {
		        'T','R','W','A','G','M','Y','F','P','D','X',
		        'B','N','J','Z','S','Q','V','H','L','C','K','E'
		    };
		
		char letraDni = dni.charAt(dni.length()-1);
		int numero = Integer.parseInt(dni.substring(0, dni.length() - 1));
		int modulo = numero % 23;
		
		if(letraDni == letras[modulo]) {
			dniCorrecto = true;
		}
		
		return dniCorrecto;
	}
	
	// Método que comprueba que la fecha de nacimiento se encuentra entre unos valores determinados. 
	
	public static boolean FechaNacimCorrecta(LocalDate fechaNacimiento) {
		boolean fechaCorrecta = false;
		
		if(fechaNacimiento.isAfter(LocalDate.now()) == true || fechaNacimiento.isBefore(LocalDate.of(1900, 01, 01 ))) { 
			fechaCorrecta = false;
			
		}else {
			fechaCorrecta = true;
		}
		
		return fechaCorrecta;
	}
	
	//Método que comprueba si el alumno es mayor de edad dada su fecha de nacimiento.
	
	public static boolean MayorEdad(LocalDate fechaNacimiento) {
		boolean mayor = false;
		int edad = (LocalDate.now().getYear()) - fechaNacimiento.getYear();
		
		if(edad >= 18) {
			mayor = true;
		}
		
		return mayor;
		
	}
	
	/*Dudas: 
	 * 
	 * MayoriaEdad: La mayoria de edad he realizado un método para calcularla, no estoy seguro de si en el constructor se ha de introducir como parametro/atributo.
	 * 
	 * LocalTime horaMaxAlum, no he echo con el atributo nada aún porque pienso en añadir como atributo turnoAlumno y asignar la horaMaxAlum según el turno que tenga como parámetro.
	 * 
	 * 
	 */
}


