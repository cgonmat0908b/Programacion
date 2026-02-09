package herencia;

import java.time.LocalDate;

public class Refrigerados extends Productos{

	private String codSupervision; // codigo organismo supervisor
	private byte tempMinConservacion; 
	private LocalDate fechaConsumo; // Fecha de consumo recomendada
	
	
	// Constructor con 6 parametros, tres de ellos llamando a la clase padre
	public Refrigerados(String nombre, LocalDate fechaCaducidad, int numLote,String codSupervision, byte tempMinConservacion, LocalDate fechaConsumo)throws IllegalArgumentException {
		super(nombre,fechaCaducidad,numLote);
		
		if(codSupervision.isEmpty() || codSupervision == null) {
			throw new IllegalArgumentException("Codigo de supervision invalido");
		}
		
		if(fechaConsumo == null || fechaConsumo.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("Fecha de consumo no valida");
		}
		
		this.codigo = generarCodigo();
		this.codSupervision = codSupervision;
		this.tempMinConservacion = tempMinConservacion;
		this.fechaConsumo = fechaConsumo;
		
	}
	
}
