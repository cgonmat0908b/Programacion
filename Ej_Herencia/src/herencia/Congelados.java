package herencia;

import java.time.LocalDate;

public class Congelados extends Productos {

	private byte tempCongelacion; // Temperatura de congelacion recomendada
	private byte tiempoMaxCongelado; // Cantidad de meses que puede estar congelado un producto
	
	public Congelados(String nombre, LocalDate fechaCaducidad, int numLote, byte tempCongelacion, byte tiempoMaxCongelado) {
		super(nombre, fechaCaducidad,numLote);
		this.codigo = generarCodigo();
		this.tempCongelacion = tempCongelacion;
		this.tiempoMaxCongelado = tiempoMaxCongelado;
	}
}
