package dado;

public class Dado {

	// Atributos de objeto
	private int numCaras;
	private int numLanzamientos;
	
	// Constructor con numCaras como parametro
	public Dado(int numCaras) throws IllegalArgumentException{
		if(numCaras != 4 && numCaras != 6  && numCaras != 8 && numCaras != 12 && numCaras != 20) {
			throw new IllegalArgumentException("El numero de caras introducido no es valido");
		}
		this.numCaras = numCaras;
		this.numLanzamientos = 0;
	}
	
	// Constructor sin parametros
	public Dado() {
		this(6);
	}
	
	public int getNumCaras() {
		return this.numCaras;
	}
	
	public int getNumLanzamientos() {
		return this.numLanzamientos;
	}
	
	// Metodo que devuelve una cadena de un entero generado de manera aleatoria como máximo con el numero del numero de caras
	public String lanzar() {
		String resultado;
		
	}
	
	public String cara(int numCaras){
		String[] caras = new String[]{
			"UNO",
			"DOS",
			"TRES",
			"CUATRO",
			"CINCO"
		};
	}
	
}
