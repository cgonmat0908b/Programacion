/* Descripción: Clase que simula posibles atributos que podria tener un Vehiculo en la vida real
 * Autor: Cristian González Mateo
 * Fecha: 15/04/2026
 * */

package gonzalez1;

import java.time.LocalDate;

public abstract class Vehiculo {

	protected static final LocalDate FECHA_FABRICACION_DEFECTO = LocalDate.of(2020, 1, 1);
	protected static final String MATRICULA_DEFECTO = "0000 AAA";
	protected static final float PRECIO_POR_DIA_DEFECTO = 100;
	protected static final boolean ESTADO_DEFECTO = false;
	
	
	protected String id;
	protected String matricula;
	protected LocalDate fechaFabricacion;
	protected float precioPorDia;
	protected boolean estado; // Indica si esta alquilado o no
	
	// Constructor con todos los parametros
	
	public Vehiculo(String matricula, LocalDate fechaFabricacion, float precioPorDia, boolean estado)throws IllegalArgumentException {

		if(fechaFabricacion == null ||fechaFabricacion.isBefore(LocalDate.of(2000, 1, 1))) {
			throw new IllegalArgumentException("Fecha de fabricación invalida");
		}
		
		this.fechaFabricacion = fechaFabricacion;
		this.matricula = matricula;
		this.id =  generarId();
		this.precioPorDia = precioPorDia;
		this.estado = estado;
		
	}
	
	public Vehiculo(String matricula) {
		this(matricula,Vehiculo.FECHA_FABRICACION_DEFECTO,  Vehiculo.PRECIO_POR_DIA_DEFECTO, Vehiculo.ESTADO_DEFECTO);
		
	}
	// Constructor con parametros por defecto
	
	public Vehiculo() {
		this(Vehiculo.MATRICULA_DEFECTO, Vehiculo.FECHA_FABRICACION_DEFECTO,  Vehiculo.PRECIO_POR_DIA_DEFECTO, Vehiculo.ESTADO_DEFECTO);
		this.id = generarId();
	}
	
	public String toString() {
		return String.format("Id: %s, Matricula: %s, Fecha de fabricación: %s, Precio por dia: %.2f Estado: %b",this.id,this.matricula, this.fechaFabricacion.toString(), this.precioPorDia, this.estado );
	}
	
	// Metodo para generar el Id dependiendo del tipo de vehiculo que sea
	public abstract String generarId();

	// Metodo para calcular el precio del alquiler segun el tipo de vehiculo que sea
	public abstract float calcularPrecioAlquiler(int numDias);
}

