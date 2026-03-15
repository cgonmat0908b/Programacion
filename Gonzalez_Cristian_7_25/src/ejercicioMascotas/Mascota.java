package ejercicioMascotas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Mascota {

	protected String nombre;
	protected byte edad;
	protected boolean estado;
	protected LocalDate fechaNacim;
	
	protected Mascota(String nombre, byte edad, boolean estado, LocalDate fechaNacim) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacim = fechaNacim;
		
	}
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	// toString
	public String muestra() {
		return String.format("Nombre:%s Edad:%d Estado:%b Fecha Nacimiento: %s", this.nombre, this.edad, this.estado, this.fechaNacim.toString());
	}
	
	
	// Calcula cuantos dias faltan para el proximo cumpleaños
	public int cumpleanyos()throws IllegalStateException {
		
		if(this.estado == false) {
			throw new IllegalStateException("No puede cumplir años si esta muerto");
		}
			
		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaNacim = this.fechaNacim;
		
		LocalDate proximoCumple = fechaNacim.withYear(fechaActual.getYear());
		
		if(proximoCumple.isBefore(fechaActual) || proximoCumple.equals(fechaActual)) {
			proximoCumple = proximoCumple.plusYears(1);
		}
		
		int dias =(int) (ChronoUnit.DAYS.between(fechaActual, proximoCumple));
		return dias;
		
	}
	
	// Elimina un objeto de la clase Mascota
	public void morir()throws IllegalStateException {
		
		if(this.estado == true) {
			this.estado = false;
		}else {
			throw new IllegalStateException("El animal ya esta muerto");
		}
	}

	public abstract void hablar();
	
}
