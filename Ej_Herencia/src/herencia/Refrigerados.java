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
		
		this.codSupervision = codSupervision;
		this.tempMinConservacion = tempMinConservacion;
		this.fechaConsumo = fechaConsumo;
		
	}
	
	
	// getters
	public String getCodSupervision() {
		return this.codSupervision;
	}
	
	public byte getTempMinConservacion() {
		return this.tempMinConservacion;
	}
	
	public LocalDate getFechaConsumo() {
		return this.fechaConsumo;
	}
	
	// setters
	
	public void setCodSupervision(String codSupervision) throws IllegalArgumentException{
		if(codSupervision.isEmpty() || codSupervision == null) {
			throw new IllegalArgumentException("Codigo de supervision invalido");
		}
		this.codSupervision = codSupervision;
	}
	
	public void setTempMinConservacion(byte tempMinConservacion) {
		this.tempMinConservacion = tempMinConservacion;
	}
	
	public void setFechaConsumo(LocalDate fechaConsumo) {
		if(fechaConsumo == null || fechaConsumo.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("Fecha de consumo no valida");
		}
		this.fechaConsumo = fechaConsumo;
	}
	
	//toString
	@Override
	public String toString() {
		String cadena = super.toString();
		return String.format("%s Codigo De Entidad Supervisora: %s %n Temperatura Minima De Conservacion: %dº %n Fecha de consumo Recomendada: %s %n", cadena,this.codSupervision,this.tempMinConservacion,this.fechaConsumo.toString());
	}
	
	
	
}
