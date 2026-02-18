package ej3;

import java.time.LocalDate;

abstract class Personal {

	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNacim;
	protected String genero;
	protected double salario;
	protected String telefono;
	protected String email;
	
	// Constructor de todos los parametros
	public Personal(String dni,String nombre, String apellidos, LocalDate fechaNacim,String genero,double salario,String telefono,String email) {
		
		// Lanzamiento de excepciones{}
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacim = fechaNacim;
		this.genero = genero;
		this.salario = salario;
		this.telefono = telefono;
		this.email = email;
		
	}
	
	
	
	// toString
	public String toString() {
		return String.format("Dni: %s Nombre: %s, Apellidos: %s Fecha de nacimiento: %s"
				+ "Genero: %s Salario: %.2f Telefono: %s Email: %s ", this.dni, this.nombre, this.apellidos,
				this.fechaNacim.toString(), this.genero,  this.salario, this.telefono, this.email);
	}
	
	// Metodo aumentoSalario Abstracto para ajustarlo a cada clase hija
	abstract void aumentoSalario();
	
	// Metodo que calcula cuantos años faltan para su jubilacion, poco realista
	public int anyosJubilacion() {
		int anyos = LocalDate.now().getYear() - this.fechaNacim.getYear();
		return 70 - anyos;
	}
	
	
}
