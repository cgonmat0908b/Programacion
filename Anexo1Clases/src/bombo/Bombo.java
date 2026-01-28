package bombo;

public class Bombo {

	  // ATRIBUTOS DE CLASE
	  // ------------------

	  // Atributos de clase constantes
	  public static byte MINIMA_CAPACIDAD = 9;
	  public static byte MAXIMA_CAPACIDAD = 90;
	  public static final byte DEFAULT_CAPACIDAD = Bombo.MAXIMA_CAPACIDAD;

	  // ATRIBUTOS DE OBJETO
	  // -------------------

	  // No es necesario un atributo para la capacidad del bombo (es el tamaño del array)
	  private int[] listaBolas;  
	  private int cantidadBolasExtraidas;
	  private int capacidad;
	  
	  //Constructor con 1 parametro
	  public Bombo(int capacidad)throws IllegalArgumentException {
		  if(capacidad > MAXIMA_CAPACIDAD || capacidad < MINIMA_CAPACIDAD) {
			 throw new IllegalArgumentException("La capacidad el bombo no puede ser mayor que 90 o menor que 9");
		  }
		  this.capacidad = capacidad;
		  this.cantidadBolasExtraidas = 0;
		  this.listaBolas = new int[capacidad];
		  rellenar(); 
		  
	  }
	  
	  // Constructor con parametros por omisión
	  public Bombo() {
		  this(DEFAULT_CAPACIDAD);
	  }
	  
	  //Metodo Getter del atributo capacidad 
	  public int getCapacidad() {
		  return this.capacidad;
	  }
	  // Metodo para rellenar el bombo con valores del 1 al numero de capacida del bombo creado
	  
	  private void rellenar() {
		  for(int i = 0; i < this.getCapacidad(); i++) {
			  this.listaBolas[i] = i + 1;
		  }
	  }
	  
	  public int getCantidadBolasRestantes() {
		 return this.getCapacidad() - this.cantidadBolasExtraidas;
	  }
	  
	  public int getCantidadBolasExtraidas() {
		  return this.cantidadBolasExtraidas;
	  }
	  
	  public boolean isCompleto() {
		  boolean completo;
		  if(this.getCantidadBolasRestantes() == this.capacidad) {
			  completo = true;
		  }else {
			  completo = false;
		  }
		  return completo;
	  }
	  
	  public boolean isVacio() {
		  boolean vacio;
		  if(this.getCantidadBolasRestantes() == 0) {
			  vacio = true;
		  }else {
			  vacio = false;
		  }
		  return vacio;
	  }
	  
	  public String toString() {
		  String texto = String.format("Capacidad: %d bolas. Cantidad de bolas extraidas %d ",this.getCapacidad(),this.getCantidadBolasExtraidas());
		  return texto;
	  }
	  
	  // Metodo que extra bolas de un bombo sin la capacidad de repetirse una bola que ya haya salido 
	  
	  public int extraerBola() throws IllegalStateException {
		  if (this.isVacio()) {
		    throw new IllegalStateException("bombo vacío");
		  } else {
		    int aleatoria = this.cantidadBolasExtraidas + (int) (Math.random() * (this.getCapacidad() - this.cantidadBolasExtraidas));
		    int bola = listaBolas[aleatoria];  // bola extraída
		    listaBolas[aleatoria] = listaBolas[this.cantidadBolasExtraidas];
		    listaBolas[this.cantidadBolasExtraidas] = bola;
		    this.cantidadBolasExtraidas++;
		    return bola;
		  }

		}
	  
	  // Metodo que rellena el bombo de manera ordenada de vuelta y muestra cuantas bolas se han introducido
	  
	  public int reset () {
		  int bolasFuera= this.cantidadBolasExtraidas;
		  this.cantidadBolasExtraidas = 0;
		  // Rellenamos la lista de Bolas ordenadamente
		  rellenar ();
		  return bolasFuera;
		}
	  
}
