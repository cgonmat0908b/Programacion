package herencia;

import java.time.LocalDate;

public class Congelados extends Productos {

	private byte tempCongelacion; // Temperatura de congelacion recomendada
	private short tiempoMaxCongelado; // Cantidad de meses que puede estar congelado un producto
	
	public Congelados(String nombre, LocalDate fechaCaducidad, int numLote, byte tempCongelacion, short tiempoMaxCongelado) {
		super(nombre, fechaCaducidad,numLote);

		this.tempCongelacion = tempCongelacion;
		this.tiempoMaxCongelado = tiempoMaxCongelado;
	}
	
	// Getters
	public byte getTempCongelacion() {
		return this.tempCongelacion;
	}
	
	public short getTiempoMaxCongelado() {
		return this.tiempoMaxCongelado;
	}
	
	// Setters
	public void setTempCongelacion(byte tempCongelacion) {
		this.tempCongelacion = tempCongelacion;
	}
	
	public void setTiempoMaxCongelado(short tiempoMaxCongelado) {
		this.tiempoMaxCongelado = tiempoMaxCongelado;
	}
	
	//toString 
	@Override
	public String toString() {
		String cadena = super.toString();
		return String.format("%s Temperatura de congelacion recomendada: %dº %n Tiempo maximo de congelacion: %d %n", cadena,this.tempCongelacion, this.tiempoMaxCongelado);
	}
	
}
