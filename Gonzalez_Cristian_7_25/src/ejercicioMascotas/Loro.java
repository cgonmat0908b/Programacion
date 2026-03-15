package ejercicioMascotas;

import java.time.LocalDate;

public class Loro extends Ave{

	private String origen;
	private boolean habla;
	
	
	
	public Loro(String nombre, byte edad, boolean estado, LocalDate fechaNacim, boolean pico, boolean vuela, String origen, boolean habla) {
		
		super(nombre, edad, estado, fechaNacim, pico, vuela);
		
		this.origen = origen;
		this.habla = habla;
	}



	@Override
	public String muestra() {
		String cadena = super.muestra();
		return String.format("%s Lugar de origen: %s Habla? %b", cadena,this.origen, this.habla);
	}


	@Override
	public void hablar()throws IllegalStateException {
		if(this.estado == false) {
			throw new IllegalStateException("Ya esta muerto");
		}
		
		System.out.println("El loro repite lo que dices");
		
	}

}
