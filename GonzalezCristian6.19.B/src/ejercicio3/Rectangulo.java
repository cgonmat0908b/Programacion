package ejercicio3;

/*
 * En nuestro software necesitamos asegurarnos de que la coordenada (x1,y1) represente la esquina
inferior izquierda y la (x2,y2) la superior derecha del rectángulo, como en el dibujo.

Añade a Rectangulo un constructor con los 4 parámetros. El constructor validará los parámetros y
en caso de error lanzará una excepción.

Corrige el main para utilizar dicho constructor. Debería mostrar un mensaje de error.

 */



public class Rectangulo {

	int x1;
	int y1;
	
	int x2;
	int y2;
	
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
	
}


