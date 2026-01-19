package ejercicio3;

/*
 * Aplica el encapsulamiento básico a la clase Rectángulo.
Declara todos sus atributos como private y crea todos los getters y setters necesarios (un get y un
set por atributo).

¿Recuerdas la condición explicada en B3? Tendrás que programar los setters de modo que
comprueben el valor pasado como argumento antes de guardarlo en el objeto. Si no fuera correcto
se lanzará una excepción.

Corrige el main para utilizar los getters y setters. Prueba a instanciar varios objetos, mostrar sus
valores, modificarlos, etc. Prueba varios valores erróneos para comprobar si funciona.

 */



public class Rectangulo {

	private int x1;
	private int y1;
	
	private int x2;
	private int y2;
	
	public Rectangulo(int x1, int y1, int x2, int y2) throws IllegalArgumentException {
		
		if (x1 > x2) {
			throw new IllegalArgumentException("El valor x1 no puede ser mayor que x2");
		}
		
		if (y1 > y2) {
			throw new IllegalArgumentException("El valor y1 no puede ser mayor que y2");
		}
		
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		
	}
	
	// Getters
	public int getX1() {
		return x1;
	}
	
	public int getY1() {
		return x1;
	}
	
	public int getX2() {
		return x1;
		
	}
	public int getY2() {
		return x1;
		
	}
	
	// Setters
	public 
	
}


