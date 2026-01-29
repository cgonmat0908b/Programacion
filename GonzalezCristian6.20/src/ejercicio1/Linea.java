package ejercicio1;

public class Linea {	
	
	private Punto a;
	private Punto b;
	
	// Constructor con 2 parametros tipo Punto
	public Linea(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	
	// Constructor con Parametros por defecto
	public Linea(){
		this.a = new Punto(0,0);
		this.b = new Punto(0,0);
	}
	
	// Metodo que mueve la linea a la derecha moviendo los valores de x de un puntos
	public void mueveDerecha(double d) {
		int x = (int) d;
		this.a.setX(this.a.getX() + x);
		this.b.setX(this.b.getX() + x);
		
	}
	
	// Metodo que mueve la linea a la izquierda moviendo los valores de x de un puntos
	public void mueveIzquierda(double d) {
		int x = (int) d;
		this.a.setX(this.a.getX() - x);
		this.b.setX(this.b.getX() - x);
		
	}
	
	// Metodo que mueve la linea verticalmente moviendo los valores de x de un puntos
	public void mueveArriba(double d) {
		int y = (int) d;
		this.a.setY(this.a.getY() + y);
		this.b.setY(this.b.getY() + y);
	}
	
	// Metodo que mueve la linea verticalmente moviendo los valores de x de un puntos
	public void mueveAbajo(double d) {
		int y = (int) d;
		this.a.setY(this.a.getY() - y);
		this.b.setY(this.b.getY() - y);
	}
	
	//Metodo toString
	
	public String escribirLinea() {
		String texto = String.format("Posición del punto a: %s Posición del punto b: %s",this.a.toString(),this.b.toString());
		return texto;
	}
	
	// Getters 
	public String getPunto1() {
		return this.a.toString();
	}
	
	public String getPunto2() {
		return this.b.toString();
	}
		
	// Setter
	public void setPunto(int x, int y) {
		this.a.setX(x);
		this.b.setY(y);
	}
	
}
