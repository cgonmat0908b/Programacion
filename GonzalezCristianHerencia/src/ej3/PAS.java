package ej3;

import java.time.LocalDate;

public class PAS extends Personal {

	// Cambio los idiomas a boolean ya que considero que es el tipo de dato que más conviente
	
	private boolean aleman;
	private boolean chino;
	private boolean ingles;
	private String areaAtencion;
	
	
	
	
	public PAS(String dni, String nombre, String apellidos, LocalDate fechaNacim, String genero, double salario,
			String telefono, String email, boolean aleman, boolean chino, boolean ingles, String areaAtencion) {
		
		super(dni, nombre, apellidos, fechaNacim, genero, salario, telefono, email);
		
		this.aleman = aleman;
		this.chino = chino;
		this.ingles = ingles;
		this.areaAtencion = areaAtencion;
	}



	// toString
	@Override
	public String toString() {
		String cadena = super.toString();
		return String.format("%s Sabe aleman? %b, Sabe chino? %b, Sabe ingles? %b Area a la que se dedica: %s", cadena, this.aleman, this.chino, this.ingles , this.areaAtencion);
	}
	
	// Metodo que indica el numero de idiomas que habla
	
	public int numIdiomas() {
		int contador = 0;
		
		if(this.aleman == true) {
			contador++;
		}
		
		if(this.chino == true) {
			contador++;
		}
		
		if(this.ingles == true) {
			contador++;
		}
		
		return contador;
	}
	
	// Metodo que cambia el estado de un idioma dado el idioma
	
	public void cambioIdioma(String idioma) {
		
		if(idioma.equals("aleman")) {
			if(this.aleman == true) {
				this.aleman = false;
			}else {
				this.aleman = true;
			}
		}
		
		if(idioma.equals("chino")) {
			if(this.chino == true) {
				this.chino = false;
			}else {
				this.chino = true;
			}
		}
		
		if(idioma.equals("ingles")) {
			if(this.ingles == true) {
				this.ingles = false;
			}else {
				this.ingles = true;
			}
		}
	}
	
}
