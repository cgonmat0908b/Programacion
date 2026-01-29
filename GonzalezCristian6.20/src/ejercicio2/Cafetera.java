package ejercicio2;

public class Cafetera {
	
	private float capacidadMaxima;
	private float cantidadActual;
	
	
	// Constructor con parametros por defecto
	public Cafetera() {
		this(0f,1000f);
	}
	
	//Constructor con un parametro, la cantidad actual se inicializa a la capacidad maxima
	public Cafetera(float capacidadMaxima) {
		this(capacidadMaxima,cantidadActual = capacidadMaxima);
	}
	
	
	// Constructor con 2 parametros, realiza la comprobación de que la cantidadActual no sea mayor que la maxima
	public Cafetera(float cantidadActual, float capacidadMaxima)throws IllegalStateException {
		if(cantidadActual > capacidadMaxima) {
			double sobrante = cantidadActual - capacidadMaxima;
			this.cantidadActual = this.capacidadMaxima;
			this.capacidadMaxima = capacidadMaxima;
			throw new IllegalStateException("No puede vertir más cafe del que cabe, ha sobrado:" + sobrante);
		}
		else {
			this.cantidadActual = cantidadActual;
			this.capacidadMaxima = capacidadMaxima;
		}
		
	}
	// Metodo que llena la cafetera, comprueba que el numero no sea negativo y que no supere la capacidadMaxima
	public void llenarCafetera(float cantidad) throws IllegalArgumentException, IllegalStateException{
		if(cantidad + this.capacidadMaxima > this.capacidadMaxima) {
			double sobrante = cantidad - capacidadMaxima;
			this.cantidadActual = this.capacidadMaxima;
			throw new IllegalStateException("No puede vertir más cafe del que cabe, ha sobrado:" + sobrante);
		}
		if(cantidad <= 0) {
			throw new IllegalArgumentException("No puedes llenar la cafetera con vacio");
		}
		
		this.cantidadActual = this.cantidadActual + cantidad;
	}
	// Metodo para servir una taza de cafe, comprueba si la cantidad a servir es mayor que la actual y y rellena la taza en la medida de lo posible 
	public void servirTaza(int cantidad) throws IllegalArgumentException{
		if(cantidad > this.cantidadActual) {
			this.cantidadActual = 0;
			throw new IllegalArgumentException("La cantidad no alcanza se servirá la cantidad que queda");
		}else {
			this.cantidadActual = this.cantidadActual - cantidad;
		}
	}
	// Cambia el valor de cantidad actual a 0
	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}
	
	
	// Getters
	public float getCapacidadMaxima() {
		return this.capacidadMaxima;
	}
	
	public float getCantidadActual() {
		return this.cantidadActual;
	}
	
	// Setters
	public void setCapacidadMaxima(float capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	
	public void setCantidadActual(float cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	// toString
	public String toString() {
		return String.format("La capacidad de la cafetera es: %.2f La cantidad actual es: %.2f %n",this.capacidadMaxima, this.cantidadActual );
	}
	
	
}
