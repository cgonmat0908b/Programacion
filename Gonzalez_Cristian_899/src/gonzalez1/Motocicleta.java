/*Descripción: Clase que implemente algunos atributos que podrian tener una motocicleta
 * Autor: Cristian González Mateo
 * Fecha: 15/04/2026
 * */

package gonzalez1;

import java.time.LocalDate;

public class Motocicleta extends Vehiculo{
	
	private static int contadorMotos = 0;

	// Constructor con matricula como parametro
	public Motocicleta(String matricula) {
		super(matricula,Vehiculo.FECHA_FABRICACION_DEFECTO,  Vehiculo.PRECIO_POR_DIA_DEFECTO, Vehiculo.ESTADO_DEFECTO);
		contadorMotos++;
	}
	
	// Constructor por defecto
	public Motocicleta() {
		super("1234 ABC", Vehiculo.FECHA_FABRICACION_DEFECTO,  Vehiculo.PRECIO_POR_DIA_DEFECTO, Vehiculo.ESTADO_DEFECTO);
		contadorMotos++;
	}
	
	@Override
	public String generarId() {
		int anyo = this.fechaFabricacion.getYear() % 100;
	    String id = String.format("%02d-%s-%d", anyo, "M",Motocicleta.contadorMotos);
		
	    
		
		return id;
	}
	
	// Metodo que calcula el precio de alquiler de una motocicleta segun los dias introducidos
	// Si la fecha de fabrición es mayor a 5 años desde el actual, se le reduce un 10% el precio
	
	@Override
	public float calcularPrecioAlquiler(int numDias) {
		float precio = 25 * numDias;
		
		if(this.fechaFabricacion.isBefore(LocalDate.now().minusYears(5))) {
			precio =(float) (precio * 0.9);
		}
		return precio;
	}

}
