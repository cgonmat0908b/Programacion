package Corregir;

import java.time.LocalDate;
import java.util.Objects;

public class Apartamento extends Vivienda{
	
	public static final short NUM_HAB_DEFECTO = 10;
	public static final byte DIST_CENTRO_CIUDAD_DEFCTO = 5;
	public static final LocalDate FECHA_ULTIMA_REFORMA = LocalDate.of(2001, 1, 1);
	
	private short numHabitaciones;
	private byte distCentroCiudad; // En kms, asumiendo que la distancia no sera mayor que 127km
	private LocalDate fechaUltimaReforma;
	
	
	
	// Constructor con dos parametros
	public Apartamento(float precioNoche, byte distCentroCiudad) {
		
		
		super(FECHA_CONSTRUCCION_DEFECTO, DIRECCION_DEFECTO, precioNoche, DISPONIBLE_DEFECTO);

		this.distCentroCiudad = distCentroCiudad;
		this.numHabitaciones = NUM_HAB_DEFECTO;
		this.fechaUltimaReforma = FECHA_ULTIMA_REFORMA;
		
	}
	
	
	// Constructor por defecto
	public Apartamento() {
		
		this(PRECIO_NOCHE_DEFECTO,DIST_CENTRO_CIUDAD_DEFCTO);
		
		this.fechaConstruccion = FECHA_CONSTRUCCION_DEFECTO;
		this.direccion = DIRECCION_DEFECTO;
		this.disponible =  DISPONIBLE_DEFECTO;
		this.numHabitaciones = Apartamento.NUM_HAB_DEFECTO;
		this.distCentroCiudad = Apartamento.DIST_CENTRO_CIUDAD_DEFCTO;
		this.fechaUltimaReforma = Apartamento.FECHA_ULTIMA_REFORMA;
		
		
	}
	
	
	// Metodo para calcula precio de estancia de un Apartamento
	@Override
	public void precioEstancia(int numDias) {
		
		float precioEstancia = this.precioNoche * numDias;
		
		if(this.distCentroCiudad > 2) {
			precioEstancia = (float) (precioEstancia * 1.15);
		}
		
		System.out.printf("El precio de una estancia de %d dias es de %.2f %n", numDias, precioEstancia);
		
	}
	
	@Override 
	public String toString() {
		String cadena = super.toString();
		return String.format("%s Numero de Habitaciones: %d Distancia al centro: %d %n"
				+ "Fecha de la ultima reforma: %s ", cadena, this.numHabitaciones,this.distCentroCiudad,this.fechaUltimaReforma.toString());
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(distCentroCiudad, fechaUltimaReforma, numHabitaciones);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apartamento other = (Apartamento) obj;
		return distCentroCiudad == other.distCentroCiudad
				&& Objects.equals(fechaUltimaReforma, other.fechaUltimaReforma)
				&& numHabitaciones == other.numHabitaciones;
	}
	
	
	
	
}
