/* Fecha: 25/03/2026
 * Autor: Cristian González Mateo
 * Descripción: Clase abstracta que simula los atributos que podria tener un vehiculo de manera general
 * 
 */

package gonzalez;

import java.time.LocalDate;

public abstract class Vehiculo {
	
	
	//Atributos por defecto
	public static final String MATRICULA_DEFECTO = "4040-ABC";
	public static final LocalDate FECHA_MATRIC_DEFECTO = LocalDate.of(2011, 1, 1);
	public static final boolean ITV_DEFECTO = true;
	public static final float PRECIO_POR_DIA_DEFECTO = 25.5f;
	
	// Atributos
	
	public static int numVehiculos = 0;
	
	protected final String IDENTIFICADOR;
	protected String matricula;
	protected LocalDate fechaMatriculacion;
	protected boolean itv;
	protected float precioPorDia;
	
	
	protected static int ultimoAnyo = 0;
	protected static int contadorAnyos = 0;
	
	
	
	// Constructor con todos los parametros
	
	public Vehiculo(String matricula,LocalDate fechaMatriculacion,boolean itv, float precioPorDia)throws IllegalArgumentException {
		if(fechaMatriculacion.isBefore(LocalDate.of(2010, 1, 1))) {
			throw new IllegalArgumentException("Fecha invalida");
		}
		
		this.fechaMatriculacion = fechaMatriculacion;
		this.IDENTIFICADOR = generarId();
		this.matricula = matricula;
		this.itv = itv;
		this.precioPorDia = precioPorDia;
		
		numVehiculos++;
	}
	
	// Metodo generar identificador
	protected String generarId() {
	
	    int anyo = this.fechaMatriculacion.getYear();
	    String id = String.format("%02d-%d", anyo, Vehiculo.contadorAnyos);

	    Vehiculo.contadorAnyos++;

	    return id;
	}
	
	// toString 
	public String toString() {
		String itvCadena = "";
		
		if(this.itv == true) {
			itvCadena ="pasada";
			
		}else {
			itvCadena = "No pasada";
		}
		return String.format("Identificador: %s, Matricula: %s, Fecha de Matriculación: %s, Itv: %s, PrecioPorDia: %.2f", this.IDENTIFICADOR, this.matricula, this.fechaMatriculacion, itvCadena, this.precioPorDia );
	}
	
	
	// Getter y Setter de itv
	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {
		this.itv = itv;
	}
	
	// Setter precioPorDia y getter
	public void setPrecioPorDia(float precioPorDia) {
		this.precioPorDia = precioPorDia;
	}
	
	public float getPrecioPorDia() {
		return precioPorDia;
	}

	
	// Metodo para calcular el coster operativo de los vehiculos, abstracto ya que cada tipo lo implementa diferente
	public abstract double costeOperativo(int numDias);
	
}

