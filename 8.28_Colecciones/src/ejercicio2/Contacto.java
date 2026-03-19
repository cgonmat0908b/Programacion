package ejercicio2;

import java.time.LocalDate;

public class Contacto implements Comparable<Contacto> {

	private String nombre;
	private String telefono;
	private String email;
	private LocalDate FechaNacim;
	
	public Contacto(String nombre, String telefono, String email, LocalDate FechaNacim)throws IllegalArgumentException {
		
		if(nombre.isEmpty()||nombre == null) {
			throw new IllegalArgumentException("Nombre invalido");
		}
		if(telefono.isEmpty()||telefono == null || formatoTlf(telefono) == false ) {
			throw new IllegalArgumentException("Telefono invalido, introduce 9 números");
		}
		if(email.isEmpty()||email == null) {
			throw new IllegalArgumentException("Email invalido");
		}
		if(FechaNacim.isAfter(LocalDate.now()) || FechaNacim == null){
			throw new IllegalArgumentException("Fecha invalida");
		}
		
		
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.FechaNacim = FechaNacim;
		
	}

	// Metodo auxiliar para comprobar el formato del telefono.
	private static boolean formatoTlf(String telefono) {
		boolean correcto = false;
		if(telefono.matches("^\\d{9}$")) {
			correcto = true;
		}
		
		return correcto;
	}


	// Getters
	
	public String getNombre() {
		return nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public String getEmail() {
		return email;
	}


	public LocalDate getFechaNacim() {
		return FechaNacim;
	}


	// Setters
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setFechaNacim(LocalDate fechaNacim) {
		FechaNacim = fechaNacim;
	}

	// toString
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", FechaNacim="
				+ FechaNacim + "]";
	}
	
	// compareTo
	@Override
	public int compareTo(Contacto contacto) {
		return this.nombre.compareTo(contacto.nombre);
	}
	
	
	
}
