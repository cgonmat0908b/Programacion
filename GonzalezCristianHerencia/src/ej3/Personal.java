package ej3;

import java.time.LocalDate;

abstract class Personal {

	// Constantes estaticas de clase
	public static final String DNI_DEF = "25739063Q";
	public static final String NOMBRE_DEF = "Desconocido";
	public static final String APELLIDOS_DEF = "Desconocido";
	public static final LocalDate FECHA_NACIM_DEF = LocalDate.of(2000, 1, 1);
	public static final String GENERO_DEF = "Desconocido";
	public static final double SALARIO_DEF = 1500.00;
	public static final String TELEFONO_DEF = "123456789";
	public static final String EMAIL_DEF = "abcabc@gmail.com";
	
	
	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNacim;
	protected String genero;
	protected double salario;
	protected String telefono;
	protected String email;
	
	// Constructor de todos los parametros
	public Personal(String dni,String nombre, String apellidos, LocalDate fechaNacim,
			String genero,double salario,String telefono,String email)throws IllegalArgumentException {
		
		// Lanzamiento de excepciones{}
		if(dni == null || dni.isEmpty()) {
			throw new IllegalArgumentException("El parametro es nulo o contiene una cadena vacia");
			
		}else if(DniFormato(dni) == false) {
			throw new IllegalArgumentException("El formato del dni es incorrecto");
			
		}else if(DniCorrecto(dni) == false) {
			throw new IllegalArgumentException("El dni introducido no es correcto");
		}
		
		
		if(nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException("Nombre invalido");
		}
		
		if(apellidos == null || apellidos.isEmpty()) {
			throw new IllegalArgumentException("Nombre invalido");
		}
		
		if(fechaNacim.isAfter(LocalDate.now()) || fechaNacim == null) {
			throw new IllegalArgumentException("Fecha de nacimiento no valida");
		}
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacim = fechaNacim;
		this.genero = genero;
		this.salario = salario;
		this.telefono = telefono;
		this.email = email;
		
	}
	
	// Constructor sin parametros
	
	public Personal() {
		this(Personal.DNI_DEF, Personal.NOMBRE_DEF, Personal.APELLIDOS_DEF, Personal.FECHA_NACIM_DEF, Personal.GENERO_DEF, 1500.00, Personal.TELEFONO_DEF, Personal.EMAIL_DEF);
	}
	
	// toString
	public String toString() {
		return String.format("Dni: %s Nombre: %s, Apellidos: %s Fecha de nacimiento: %s "
				+ "Genero: %s Salario: %.2f Telefono: %s Email: %s %n ", this.dni, this.nombre, this.apellidos,
				this.fechaNacim.toString(), this.genero,  this.salario, this.telefono, this.email);
	}
	
	// Metodo aumentoSalario, aumenta el salario dado un porcentaje
	public void aumentoSalario(double porcentaje)throws IllegalArgumentException {
		if(porcentaje <= 0) {
			throw new IllegalArgumentException("Porcentaje no valido");
		}
		
		this.salario = this.salario * porcentaje;
	}
	
	// Metodo que calcula cuantos años faltan para su jubilacion, poco realista
	public int anyosJubilacion()throws IllegalArgumentException {
		
		int anyos = LocalDate.now().getYear() - this.fechaNacim.getYear();
		
		if(anyos > 70) {
			throw new IllegalArgumentException("Se podria haber jubilado ya");
		}
		
		return 70 - anyos;
	}
	
	
	
	//Metodo que comprueba que el formato del DNI sea 8 numeros y 1 letra dado el Dni como parametro.
	
	protected static boolean DniFormato(String dni) {
		boolean dniValido = false;
			
		if(dni == null || !dni.matches("[0-9]{8}[A-Z]")) {
			dniValido = false;
				
				
		}else {
			dniValido = true;
		}
		return dniValido;
	}
		
	// Método que comprueba que los números del DNI corresponden con la letra dado el DNI como parametro.
		
	protected static boolean DniCorrecto(String dni) {
			
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
		

	

	
	
}
