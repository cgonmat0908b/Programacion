package ej2;

import java.time.LocalDate;

public class Deportivo extends Coche {
	
	private String traccion;
	
	public Deportivo(String matricula, String nomPropietario, LocalDate fechaMatriculacion ,int cilindrada, int potencia,String traccion )throws IllegalArgumentException {
		super(matricula,nomPropietario,fechaMatriculacion,cilindrada,potencia);
		
		if(!traccion.equals("delantera") && !traccion.equals("total") ) {
			throw new IllegalArgumentException("Solo se permite delantera o total");
		}
		
		this.traccion = traccion;
		
	}
	
	public String toString() {
		String cadena = super.toString();
		return String.format("%s, Tipo de traccion: %s %n", cadena, this.traccion);
	}
}
