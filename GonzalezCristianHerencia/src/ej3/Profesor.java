package ej3;

import java.time.LocalDate;

public class Profesor extends Personal {

	private String titulacion;
	private String asig1;
	private String asig2;
	private boolean tutor;
	private byte anyosExperiencia;
	
	
	public Profesor(String dni,String nombre,String apellidos,LocalDate fechaNacim,String genero,
			double salario,String telefono,String email,String titulacion,String asig1,String asig2,
			boolean tutor,byte anyosExperiencia) {
		
		super(dni,nombre,apellidos,fechaNacim,genero,salario,telefono,email);
		
		this.titulacion = titulacion;
		this.asig1 = asig1;
		this.tutor = tutor;
		this.anyosExperiencia = anyosExperiencia;
		
	}
	
	@Override
	public String toString(){
		String cadena = super.toString();
		return String.format("%s Titulacion: %s Asignatura1: %s, Asignatura2: %s, Es tutor?: %b Años de experiencia: %s", cadena, this.titulacion, this.asig1, this.asig2,this.tutor,this.anyosExperiencia);
	}
	
	// Aumento de salario segun los años de experiencia
	public void aumentoSalario() {
		double porcentaje = 1;
		
		if(this.anyosExperiencia >= 1) {
			porcentaje = 1.01;
		}
		if(this.anyosExperiencia >= 3) {
			porcentaje = 1.03;
		}
		
		if(this.anyosExperiencia >= 5){
			porcentaje = 1.05;
		}

		this.salario = this.salario * porcentaje;
		
	}
	
}
