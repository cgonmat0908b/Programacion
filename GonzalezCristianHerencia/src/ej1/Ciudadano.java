package ej1;

public class Ciudadano extends Humano{

	protected String documento;
	
	
	//Constructor con 3 parametros, 2 de ellos usando la clase padre
	public Ciudadano(String nombre, String apellido, String documento)throws IllegalArgumentException {
		super(nombre,apellido);
		
		if(documento == null || documento.isEmpty()) {
			throw new IllegalArgumentException("Documento no valido");
		}
		
		this.documento = documento;
		
	}
	// Metodo toString aprovechando el metodo de la clase padre
	public String identificacion() {
		String cadena = super.getNombreCompleto();
		return String.format("%s, %s", cadena, this.documento);
		
	}
	
	
	
}
