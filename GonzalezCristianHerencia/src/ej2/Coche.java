package ej2;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Coche {

	protected String matricula;
	protected String nomPropietario;
	protected final LocalDate fechaMatriculacion;
	protected int cilindrada; // Cilindrada en litros
	protected int potencia; // Medido en Caballos de potencia
	
	
	public Coche(String matricula, String nomPropietario, LocalDate fechaMatriculacion ,int cilindrada, int potencia)throws IllegalArgumentException {
		if(matricula == null || matricula.isEmpty() || comprobarMatricula(matricula) == false) {
			throw new IllegalArgumentException("Matricula invalida");
		}
		
		if(nomPropietario == null || nomPropietario.isEmpty()) {
			throw new IllegalArgumentException("Nombre invalido");
		}
		
		if(fechaMatriculacion == null || fechaMatriculacion.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Fecha de matriculación invalida");
		}
		
		if(cilindrada <= 0) {
			throw new IllegalArgumentException("Cilindrada invalida");
		}
		
		if(potencia <= 0) {
			throw new IllegalArgumentException("Potencia invalida");
		}
		
		this.matricula = matricula;
		this.nomPropietario = nomPropietario;
		this.fechaMatriculacion = fechaMatriculacion;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		
	}
	
	// Constructor por defecto
	public Coche() {
		this("1234ABC", "Desconocido", LocalDate.of(2000, 1, 1), 2000, 150);
	}
	
	// Metodo que comprueba el formato de la matricula
	private boolean comprobarMatricula(String matricula) {
		boolean correcta = false;
		
		if(Pattern.matches("[0-9]{4}[A-Z]{3}", matricula)) {
			correcta = true;
			
		}else {
			correcta = false;
		}
		
		return correcta;
		
	}

	// Getters 
	
	public String getMatricula() {
		return matricula;
	}

	public String getNomPropietario() {
		return nomPropietario;
	}

	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	
	// Setters
	
	public void setMatricula(String matricula)throws IllegalArgumentException {
		if(matricula == null || matricula.isEmpty() || comprobarMatricula(matricula) == false) {
			throw new IllegalArgumentException("Matricula invalida");
		}
		this.matricula = matricula;
	}

	public void setNomPropietario(String nomPropietario)throws IllegalArgumentException {
		if(nomPropietario == null || nomPropietario.isEmpty()) {
			throw new IllegalArgumentException("Nombre invalido");
		}
		this.nomPropietario = nomPropietario;
	}

	public void setCilindrada(int cilindrada)throws IllegalArgumentException {
		if(cilindrada <= 0) {
			throw new IllegalArgumentException("Cilindrada invalida");
		}
		this.cilindrada = cilindrada;
	}

	public void setPotencia(int potencia)throws IllegalArgumentException {
		if(potencia <= 0) {
			throw new IllegalArgumentException("Potencia invalida");
		}
		this.potencia = potencia;
	}
	
	
	public String toString(){
		return String.format("Matricula: %s Nombre del propiertario: %s Fecha de matriculacion: %s Cilindrada: %d Potencia: %d ", this.matricula,this.nomPropietario, this.fechaMatriculacion.toString(),this.cilindrada, this.potencia);
	}

}
