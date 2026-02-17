package ej2;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Coche {

	protected String matricula;
	protected String nomPropietario;
	protected final LocalDate fechaMatriculacion;
	protected byte cilindrada; // Cilindrada en litros
	protected short potencia; // Medido en Caballos de potencia
	
	
	public Coche(byte cilindrada, short potencia)throws IllegalArgumentException {
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
		
		this.matricula = "1234ABC";
		this.nomPropietario = "Juan";
		this.fechaMatriculacion = LocalDate.of(2019,5,6);
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		
	}
	
	private boolean comprobarMatricula(String matricula) {
		boolean correcta = false;
		
		if(Pattern.matches("[0-9]{4}[A-Z]{3}", matricula)) {
			correcta = true;
			
		}else {
			correcta = false;
		}
		
		return correcta;
		
	}
	
	
	
}
