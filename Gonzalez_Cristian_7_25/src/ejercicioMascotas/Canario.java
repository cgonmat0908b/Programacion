package ejercicioMascotas;

import java.time.LocalDate;

public class Canario extends Ave{

	private String color;
	private boolean canta;
	
	
	
	public Canario(String nombre, byte edad, boolean estado, LocalDate fechaNacim, boolean pico, boolean vuela, String color, boolean canta) {
		super(nombre, edad, estado, fechaNacim, pico, vuela);
		this.color = color;
		this.canta = canta;
	}

	@Override
	public String muestra() {
		String cadena = super.muestra();
		return String.format("%s El color del canario es: %s Puede cantar?%b ", cadena, this.color, this.canta);
		
	}

	

	@Override
	public void hablar()throws IllegalStateException {
		if(this.estado == false) {
			throw new IllegalStateException("Ya esta muerto");
		}
		
		System.out.println("El canario canta");
		
	}

}
