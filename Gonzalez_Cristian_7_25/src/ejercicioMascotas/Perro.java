package ejercicioMascotas;

import java.time.LocalDate;

public class Perro extends Mascota{

	private String raza;
	private boolean pulgas;
	
	
	
	public Perro(String nombre, byte edad, boolean estado, LocalDate fechaNacim, String raza, boolean pulgas) {
		super(nombre, edad, estado, fechaNacim);
		this.raza = raza;
		this.pulgas = pulgas;
		
	}
	
	

	@Override
	public String muestra() {
		String cadena = super.muestra();
		return String.format("%s Raza:%s Tiene pulgas?%b", cadena, this.raza, this.pulgas);
	}

	@Override
	public void hablar()throws IllegalStateException {
		
		if(this.estado == false) {
			throw new IllegalStateException("No puede hablar si esta muerto");
		}
		
		System.out.println("El perro ladra");
	}
	

}
