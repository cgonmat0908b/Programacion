package gonzalez;

import java.time.LocalDate;

public class Apartamento extends Vivienda{
	
	private final short NUM_HAB_DEFECTO = 10;
	private final byte DIST_CENTRO_CIUDAD_DEFCTO = 5;
	private final LocalDate FECHA_ULTIMA_REFORMA = LocalDate.of(2001, 1, 1);
	
	private short numHabitaciones;
	private byte distCentroCiudad; // En kms, asumiendo que la distancia no sera mayor que 127km
	private LocalDate fechaUltimaReforma;
	
	
	
	// Constructor con dos parametros
	public Apartamento(float precioNoche, byte distCentroCiudad) {
		
		
		this.direccion = DIRECCION_DEFECTO;
		this.fechaConstruccion = FECHA_CONSTRUCCION_DEFECTO;
		this.precioNoche = precioNoche;
		this.disponible = DISPONIBLE_DEFECTO;
		this.numHabitaciones = NUM_HAB_DEFECTO;
		this.distCentroCiudad = distCentroCiudad;
		this.fechaUltimaReforma = FECHA_ULTIMA_REFORMA;
		
	}
	
	
	// Constructor por defecto
	public Apartamento() {
		
		super(FECHA_CONSTRUCCION_DEFECTO,DIRECCION_DEFECTO,PRECIO_NOCHE_DEFECTO,DISPONIBLE_DEFECTO);
		
		this.direccion = DIRECCION_DEFECTO;
		this.fechaConstruccion = FECHA_CONSTRUCCION_DEFECTO;
		this.precioNoche = PRECIO_NOCHE_DEFECTO;
		this.disponible = DISPONIBLE_DEFECTO;
		this.numHabitaciones = NUM_HAB_DEFECTO;
		this.distCentroCiudad = DIST_CENTRO_CIUDAD_DEFCTO;
		this.fechaUltimaReforma = FECHA_ULTIMA_REFORMA;
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
	
	
}
