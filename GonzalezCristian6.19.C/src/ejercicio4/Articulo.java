package ejercicio4;

public class Articulo {


	/*
	 * Añade un constructor con 4 parámetros que asigne valores a nombre, precio, iva  y
cuantosQuedan.

 Dicho constructor deberá mostrar un mensaje de error si alguno de los
valores nombre, precio, iva o cuantosQuedan no son válidos.

¿Qué condiciones crees quepodrían determinar si son válidos o no? Razónalo e implementa el código mediante el uso de
excepciones.

Corrige el main y prueba a crear varios artículos. Introduce algunos con valores incorrectos
para comprobar si avisa del error.
	 */
	
	public static final int IVA = 21;
	
	String nombre;
	float precioSinIva;
	float pvp;
	int cuantosQuedan;
	
	
	public Articulo(String nombre, float precioSinIva, float pvp, int cuantosQuedan)throws IllegalArgumentException {
		
		if(nombre.isEmpty()||nombre == null) {
			throw new IllegalArgumentException("El nombre no puede ser nulo o estar vacio.");
		}
		if(precioSinIva <= 0) {
			throw new IllegalArgumentException("El precio no puede ser menor o igual que 0.");
		}
		if(pvp <= 0) {
			throw new IllegalArgumentException("El precio no puede ser menor o igual que 0.");
		}
		if(cuantosQuedan < 0) {
			throw new IllegalArgumentException("No pueden haber articulos negativos.");
		}
		
		
		this.nombre = nombre;
		this.precioSinIva = precioSinIva;
		this.pvp = pvp;
		this.cuantosQuedan = cuantosQuedan;
	}
	
}
