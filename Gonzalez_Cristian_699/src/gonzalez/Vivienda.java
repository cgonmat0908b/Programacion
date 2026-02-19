package gonzalez;

import java.time.LocalDate;
import java.util.regex.Pattern;

public abstract class Vivienda {
	
	//Atributos por defecto
	protected final LocalDate FECHA_CONSTRUCCION_DEFECTO = LocalDate.of(2000, 1, 1);
	protected final String DIRECCION_DEFECTO = "Desconocida";
	protected final float PRECIO_NOCHE_DEFECTO = 50;
	protected final boolean DISPONIBLE_DEFECTO = true;
	
	protected static int ultimoAnyo = 0;
	protected static int contadorAnyos = 0;
	protected static int numViviendas;

	protected final String IDENTIFICADOR;
	protected LocalDate fechaConstruccion;
	protected String direccion;
	protected float precioNoche;
	protected boolean disponible;
	
	
	// Constructor con todos los parametros
	public Vivienda(LocalDate fechaConstruccion, String direccion, float precioNoche, boolean disponible) {
		
		this.fechaConstruccion = fechaConstruccion;
		this.direccion = direccion;
		this.precioNoche = precioNoche;
		this.disponible = disponible;
		this.IDENTIFICADOR = generarId();
	}
	
	
	// Constructor por defecto
	public Vivienda() {

		this.fechaConstruccion = FECHA_CONSTRUCCION_DEFECTO;
		this.direccion = DIRECCION_DEFECTO;
		this.precioNoche = PRECIO_NOCHE_DEFECTO;
		this.disponible = DISPONIBLE_DEFECTO;
		this.IDENTIFICADOR = generarId();
		
	}
	
	
	// Metodo para generar identificador de la vivienda
	protected String generarId() {
		
		if(Vivienda.ultimoAnyo == this.fechaConstruccion.getYear()) {
			Vivienda.contadorAnyos++;
		}
		
		String id = String.format("%d-%d ", this.fechaConstruccion.getYear(), Vivienda.contadorAnyos );
		Vivienda.ultimoAnyo = this.fechaConstruccion.getYear();
		
		return id;
	}
	
	// Metodo que devuelve el numero de viviendas creadas
	
	public int getNumViviendas() {
		return Vivienda.numViviendas;
	}
	
	// Metodo para mostrar todos los datos de una vivienda
	public String toString() {
		String disponibilidad = null;
		if(this.disponible == true) {
			disponibilidad = "Disponible";
		}else {
			disponibilidad = "No disponible";
		}
		return String.format("Identificador: %s Fecha de construccion: %s "
				+ "Direccion: %s Precio por noche: %.2f Disponibilidad:%s %n ", this.IDENTIFICADOR,this.fechaConstruccion.toString(), this.direccion, this.precioNoche, disponibilidad);
	}
	
	// Metodo abstracto que cada clase hija implementa de una manera diferente
	abstract void precioEstancia(int numDias);
	
	
	
}
