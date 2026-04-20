/*Descripción: Clase que implemente algunos atributos que podrian tener un coche concretamente
 * Autor: Cristian González Mateo
 * Fecha: 15/04/2026
 * */

package gonzalez1;

public class Coche extends Vehiculo{

	
	private static final String TIPO_COMBUSTIBLE_DEFECTO = "gasolina";
	
	private static int contadorCoches = 0;
	
	private String tipoCombustible;
	
	public Coche() {
		super(Vehiculo.MATRICULA_DEFECTO,Vehiculo.FECHA_FABRICACION_DEFECTO,Vehiculo.PRECIO_POR_DIA_DEFECTO,Vehiculo.ESTADO_DEFECTO);
		
		this.id = generarId();
		this.tipoCombustible = Coche.TIPO_COMBUSTIBLE_DEFECTO;

		contadorCoches++;
	}
	
	@Override
	public String generarId() {
		int anyo = this.fechaFabricacion.getYear() % 100;
	    String id = String.format("%02d-%s-%d", anyo, "C",Coche.contadorCoches);
		
		return id;
	}
	
	@Override
	public String toString() {
		String cadena = super.toString();
		return String.format("%s Tipo de combustible: %s", cadena, this.tipoCombustible);
	}

	@Override
	// Metodo que calcula el precio de un alquiler de un coche dado el numero de dias
	// si el combustible es electrico le incremente un 5% el precio
	public float calcularPrecioAlquiler(int numDias) {
		float precio = this.precioPorDia * numDias;
		
		if(this.tipoCombustible.equals("electrico")) {
			precio = (float) (precio * 1.05);
		}
		return precio;
	}

}
