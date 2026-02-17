package herencia;

import java.time.LocalDate;

public class Frescos extends Productos{

	private LocalDate fechaEnvasado;
	private String paisOrigen;
	
	//Constructor con 5 parametros 3 tres de ellos llamando a la clase padre
	public Frescos(String nombre, LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado, String paisOrigen)throws IllegalArgumentException {
		super(nombre,fechaCaducidad,numLote);
		
		if(fechaEnvasado == null || fechaEnvasado.isAfter(LocalDate.now())){
			throw new IllegalArgumentException("La fecha de envasado no es valida");
		}
		
		if(paisOrigen.isEmpty() || paisOrigen == null) {
			throw new IllegalArgumentException("Pais invalido");
		}
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	//Getters 
	public LocalDate getFechaEnvasado() {
		return this.fechaEnvasado;
	}
	
	public String paisOrigen() {
		return this.paisOrigen;
	}
	
	//Setters
	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		if(fechaEnvasado == null || fechaEnvasado.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de envasado no es valida");
		}
		this.fechaEnvasado = fechaEnvasado;
	}
	
	public void setPaisOrigen(String paisOrigen) {
		if(paisOrigen.isEmpty() || paisOrigen == null) {
			throw new IllegalArgumentException("Pais invalido");
		}
		this.paisOrigen = paisOrigen;
		
	}
	
	//toString
	@Override
	public String toString() {
		String cadena = super.toString();
		return String.format("%s fecha de envasado: %s %n Pais de origen: %s %n", cadena,this.fechaEnvasado.toString(),this.paisOrigen);
		
	}
}
