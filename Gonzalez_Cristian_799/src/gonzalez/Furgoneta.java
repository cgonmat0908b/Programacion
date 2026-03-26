/* Fecha: 25/03/2026
 * Autor: Cristian González Mateo
 * Descripción: Clase hija de Vehiculo que los atributos adicionales que podria tener una furgoneta,
 * Incluye un metodo para calcular el coste operativo de una furgoneta
 * 
 */

package gonzalez;

public class Furgoneta extends Vehiculo{

	private float volumen;
	private boolean refrigeracion;
	
	// Constructor con un 2 parametros  y el resto por defecto
	public Furgoneta(float volumen, boolean refrigeracion) {
		super(MATRICULA_DEFECTO, FECHA_MATRIC_DEFECTO, ITV_DEFECTO,PRECIO_POR_DIA_DEFECTO);
		
		this.volumen = volumen;
		this.refrigeracion = refrigeracion;
		
	}
	
	// Metodo para calcular el coste operativo
	public double costeOperativo(int numDias) {
		double coste = 0;
		if(this.itv == true) {
			coste = numDias * this.precioPorDia;
			if(this.refrigeracion) {
				coste = coste + (25 * numDias);
			}
		}
		return coste;
	}
		
	// toString
	@Override
	public String toString() {
		String refrigeracion = "";
		
		if(this.refrigeracion == true) {
			refrigeracion = "disponible";
		}else {
			refrigeracion = "no disponible";
		}
		String cadena = super.toString();
		return cadena + " Capacidad: " + this.volumen + " Refrigeración: " + refrigeracion;
	}

	// getter de refrigeracion
	public boolean isRefrigeracion() {
		return refrigeracion;
	}
	
	
}
