package bombilla;

public class Bombilla {

	
	// Constantes para constructores sin parametros
	
	public static final boolean ESTADO = false;
	public static final int NUM_VECES_ENCENDIDADA = 0;
	
	// Atributos de clase variables
	
	private static int numBombillasCreadas = 0;
	private static int numBombillasEncendidas = 0;
	
	// Atributos de objeto variables
	
	private boolean estado;
	private int numVecesEncendida;
	
	// Constructor con 1 parametro
	public Bombilla(boolean estado) {
		
		this.estado = estado;
		this.numVecesEncendida = NUM_VECES_ENCENDIDADA;
		numBombillasCreadas++;
		
		if(estado == true) {
			this.numVecesEncendida++;
			Bombilla.numBombillasEncendidas++;
		}
		
	}
	
	// Constructor sin parametros
	public Bombilla() {
		this(Bombilla.ESTADO);
	}
	
	// Getters
	public boolean getEstado() {
		return this.estado;
	}
	
	public boolean isEncendida() {
		if(this.estado = true) {
			this.estado = true;
		}
		return this.estado;
	}
	
	public boolean isApagada() {
		if(this.estado = false) {
			this.estado = false;
		}
		return this.estado;
	}
	
	public int getNumVecesEncendida() {
		return this.numVecesEncendida;
	}
	
	public static int getNumBombillasCreadas() {
		return Bombilla.numBombillasCreadas;
	}
	
	public static int numBombillasEncendidas() {
		return Bombilla.numBombillasEncendidas;
	}
	
	// toString
	
	public String toString() {
		
		// Inicialización del estado en palabras
		
		String estadoS;
		if(this.estado == true) {
			estadoS = "Encendida";
		}else {
			estadoS = "Apagada";
		}
		
		// Inicialización de un String para diferenciar el numero de veces encendida
		
		String vezs;
		if(this.numVecesEncendida == 1) {
			vezs = "vez";
		}else {
			vezs = "veces";
		}
		
		
		String resultado = String.format("Bombilla %s. Se ha encendido %d %s",
				estadoS,this.numVecesEncendida,vezs);
		
		return resultado;
	}
	
	public void encender()throws IllegalStateException {
		if(this.estado == false) {
			this.estado = true;
			this.numVecesEncendida++;
			Bombilla.numBombillasEncendidas++;
			
		}else {
			throw new IllegalStateException("La bombilla ya esta encendida");
		}
		
	}
	public void apagar()throws IllegalStateException  {
		if(this.estado == true) {
			this.estado = false;
			Bombilla.numBombillasEncendidas--;
		}else {
			throw new IllegalStateException("La bombilla ya esta apagada");
		}
	}
	
	public void conmutar() {
		if(this.estado == true) {
			apagar();
		}else {
			encender();
		}
	}
	
}
