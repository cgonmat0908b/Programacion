/* Fecha: 25/03/2026
 * Autor: Cristian González Mateo
 * Descripción: Clase hija de Vehiculo que los atributos adicionales que podria tener un camion,
 * Incluye un metodo para calcular el coste operativo de un camión
 * 
 */

package gonzalez;

public class Camion extends Vehiculo {

	private float capacidad;
	
	// Constructor con un parametro y el resto por defecto
	public Camion(float capacidad) {
		super(MATRICULA_DEFECTO, FECHA_MATRIC_DEFECTO, ITV_DEFECTO,PRECIO_POR_DIA_DEFECTO);
		
		if(capacidad < 0.5 || capacidad > 20) {
			throw new IllegalArgumentException("Capacidad invalida");
		}
		this.capacidad = capacidad;
	}
	
	// toString
	@Override
	public String toString() {
		String cadena = super.toString();
		return cadena + " Capacidad: " + this.capacidad;
	}
	
	// Metodo para calcular el coste operativo
	public double costeOperativo(int numDias) {
		double coste = 0;
		if(this.itv == true) {
			coste = numDias * this.precioPorDia;
			
			if(this.capacidad > 10) {
				coste = coste * 1.2;
			}
		}
		return coste;
	}
}
