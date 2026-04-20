/* Descripción: Clase main en la que se prueban objetos de la clase Vehiculo e hijas y los metodos implementado
 * Autor: Cristian González Mateo
 * Fecha: 15/04/2026
 * */
package gonzalez1;

public class Main {

	public static void main(String[] args) {
		// Apartado 1
		// Creacion de un objeto de tipo Coche con parametros por defecto
		
		System.out.println("Apartado 1");
		Coche defecto = null;
		try {
			defecto = new Coche();
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			
		}
		System.out.println("Los valores del coche creado son los siguientes:" + defecto);

		
		// Apartado 2
		// Uso de metodo para cacular el precio de alquiler de 10 dias
		System.out.println("Apartado 2");
		
		System.out.println("El precio de alquiler del coche por defecto es de: " + 	defecto.calcularPrecioAlquiler(10));
		
		// Apartado 3
		// Creacion de un objeto de tipo Motocicleta con Matricula como parametro
		System.out.println("Apartado 3");
		Motocicleta matricula = null;
		try {
			matricula = new Motocicleta("1234 ABC");
		}catch(IllegalArgumentException ex) {
			matricula = new Motocicleta();
		}
		System.out.println("Los valores de la motocicleta creada son los siguientes: " + matricula);
		
		// Apartado 4
		// Uso de metodo para calcular el precio de alquiler de 10 dias
		System.out.println("Apartado 4");
		System.out.println("El precio de alquiler la motocicleta es: " + matricula.calcularPrecioAlquiler(5));
	}

}
