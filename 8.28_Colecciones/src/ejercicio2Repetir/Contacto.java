package ejercicio2Repetir;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Contacto implements Comparable<Contacto>{

	private String nombre;
	private String telefono;
	private String email;
	private LocalDate fechaNacim;
	
	
	
	
	public Contacto(String nombre, String telefono, String email, LocalDate fechaNacim) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacim = fechaNacim;
	}



	public Contacto() {
		this.nombre = randomNom();
		this.email = this.nombre + "@gmail.com";
		this.telefono = generarNum();
		this.fechaNacim = generarFecha();
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
		return fechaNacim;
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
		this.fechaNacim = fechaNacim;
	}

	
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaNacim="
				+ fechaNacim + "]";
	}



	private String randomNom() {
		
		String[] aleatorio = {
				"Paco", "Juan", "Francisco", "Maria", "Cristian", "Hola"
		};
		
		return aleatorio[(int) (Math.random() * 6)];
	}
	
	private String generarNum() {
		int random = 0;
		String num = "";
		
		for(int i = 0; i < 9; i++) {
			random = (int) (Math.random() * 10);
			num = num + random;
		}
		
		return num;
	}
	
	private LocalDate generarFecha()  {
		LocalDate fecha = null;
		boolean correcta = false;
		
		while(!correcta) {
			try {
				fecha = LocalDate.of((int) ( 1970 + ((Math.random() * 40))), (int) ( 1 + ((Math.random() * 12))),(int) (1 + ((Math.random() * 31))));
				correcta = true;
			}catch(DateTimeException ex) {
				System.out.println("Error al introducir al crear fecha, intentado de nuevo");
				correcta = false;
			}
		}
		return fecha;
	}



	@Override
	public int compareTo(Contacto o) {
		return this.getNombre().compareTo(o.getNombre());
	}
	
	
	
}
