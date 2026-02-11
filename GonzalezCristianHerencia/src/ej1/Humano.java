package ej1;

public class Humano {

	protected String nombre;
	protected String apellido;
	
	// Constructor con 2 parametros
	public Humano(String nombre, String apellido)throws IllegalArgumentException {
		
		if(nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException("Nombre no valido");
		}
		
		if(apellido == null || apellido.isEmpty()) {
			throw new IllegalArgumentException("Apellido no valido");
		}
		
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	// Constructor por defecto
	public Humano() {
		this("Juan", "Garcia");
	}
	
	// Metodo toString
	public String getNombreCompleto() {
		return String.format("%s, %s", this.nombre, this.apellido);
	}
	
	// Setters
	public void setNombre(String nombre)throws IllegalArgumentException {
		if(nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException("Nombre no valido");
		}
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido)throws IllegalArgumentException {
		if(apellido == null || apellido.isEmpty()) {
			throw new IllegalArgumentException("Apellido no valido");
		}
		this.apellido = apellido;
	}
	
	
	
}
