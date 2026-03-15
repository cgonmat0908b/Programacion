package ejercicioMascotas;

import java.time.LocalDate;

public class Gato extends Mascota{

	private String color;
	private boolean peloLargo;
	
	
	
	public Gato(String nombre, byte edad, boolean estado, LocalDate fechaNacim, String color, boolean peloLargo) {
		
		super(nombre, edad, estado, fechaNacim);
		
		this.color = color;
		this.peloLargo = peloLargo;

	}

	@Override
	public String muestra() {
		String cadena = super.muestra();
		return String.format("%s Color:_%s Tiene el pelo largo?%b", cadena,this.color,this.peloLargo);
	}



	@Override
	public void hablar()throws IllegalStateException {
		if(this.estado == false) {
			throw new  IllegalStateException("Ya esta muerto");
		}
		
		System.out.println("El gato maulla");
		
	}

}
