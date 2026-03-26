package Corregir;

import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Pattern;

public abstract class Vivienda {
	
	//Atributos por defecto
	public static final LocalDate FECHA_CONSTRUCCION_DEFECTO = LocalDate.of(2000, 1, 1);
	public static final String DIRECCION_DEFECTO = "Desconocida";
	public static final float PRECIO_NOCHE_DEFECTO = 50;
	public static final boolean DISPONIBLE_DEFECTO = true;
	
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

		this(FECHA_CONSTRUCCION_DEFECTO, DIRECCION_DEFECTO, PRECIO_NOCHE_DEFECTO, DISPONIBLE_DEFECTO);
		
	}
	
	
	// Metodo para generar identificador de la vivienda
	protected String generarId()throws IllegalStateException {
	    
	    if (numViviendas >= 1000) {
	        throw new IllegalStateException("No se pueden crear más de 1000 viviendas");
	    }

	    int anyo = this.fechaConstruccion.getYear() % 100; // AA (dos últimas cifras)

	    if (Vivienda.ultimoAnyo == anyo) {
	        Vivienda.contadorAnyos++;
	    } else {
	        Vivienda.contadorAnyos = 0;
	        Vivienda.ultimoAnyo = anyo;
	    }

	    String id = String.format("%02d-%03d", anyo, Vivienda.contadorAnyos);

	    Vivienda.numViviendas++;

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


	@Override
	public int hashCode() {
		return Objects.hash(IDENTIFICADOR, direccion, disponible, fechaConstruccion, precioNoche);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vivienda other = (Vivienda) obj;
		return Objects.equals(IDENTIFICADOR, other.IDENTIFICADOR) && Objects.equals(direccion, other.direccion)
				&& disponible == other.disponible && Objects.equals(fechaConstruccion, other.fechaConstruccion)
				&& Float.floatToIntBits(precioNoche) == Float.floatToIntBits(other.precioNoche);
	}
	
	
	
}
