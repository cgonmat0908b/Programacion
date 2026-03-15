package ejercicioMascotas;

import java.time.LocalDate;

public abstract class Ave extends Mascota{
 
	protected boolean pico;
	protected boolean vuela;
	
	
	
	protected Ave(String nombre, byte edad, boolean estado, LocalDate fechaNacim, boolean pico, boolean vuela) {
		super(nombre, edad, estado, fechaNacim);
		
		this.pico = pico;
		this.vuela = vuela;

	}



	public void volar() {
		if(vuela == true) {
			System.out.println("El ave puede volar");
		}else {
			System.out.println("El ave no puede volar");
		}
	}
	
	@Override
	public String muestra() {
		String cadena = super.muestra();
		return String.format("%s Tiene pico?%b Puede volar?%b", cadena,this.pico, this.vuela);
	}
}
