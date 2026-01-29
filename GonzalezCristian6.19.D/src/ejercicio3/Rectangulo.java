package ejercicio3;

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
		return this.x1;
	}
	
	public int getY1() {
		return this.y1;
	}
	
	public int getX2() {
		return this.x2;
		
	}
	public int getY2() {
		return this.y2;
		
	}
	
	// Setters
	public void setX1 (int x1) throws IllegalArgumentException{
		if (x1 > this.x2) {
			throw new IllegalArgumentException("El valor x1 no puede ser mayor que x2");
		}
		this.x1 = x1;
		
	}
	
	public void setX2(int x2) {
		if (x2 < this.x1) {
			throw new IllegalArgumentException("El valor x2 no puede ser menor que x1");
		}
		this.x2 = x2;
	}
	
	public void setY1(int y1) {
		if (y1 > this.y2) {
			throw new IllegalArgumentException("El valor y1 no puede ser mayor que y2");
		}
		this.y1 = y1;
	}
	
	public void setY2(int y2) {
		if (y2 < this.y1) {
			throw new IllegalArgumentException("El valor y1 no puede ser mayor que y2");
		}
		this.y2 = y2;
	}
	
}


