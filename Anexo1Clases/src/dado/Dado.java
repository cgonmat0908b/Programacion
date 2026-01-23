package dado;

public class Dado {

	// Atributos de objeto
	private byte numCaras; // Numero de caras del dado
	private int numLanzamientos; // Numero de lanzamientos del dado
	
	// Constructor con numCaras como parametro
	public Dado(byte numCaras) throws IllegalArgumentException{
		if(numCaras != 4 && numCaras != 6  && numCaras != 8 && numCaras != 12 && numCaras != 20) {
			throw new IllegalArgumentException("El numero de caras introducido no es valido");
		}
		this.numCaras = numCaras;
		this.numLanzamientos = 0;
	}
	
	// Constructor sin parametros
	public Dado() {
		this((byte)6);
	}
	
	public int getNumCaras() {
		return this.numCaras;
	}
	
	public int getNumLanzamientos() {
		return this.numLanzamientos;
	}
	
	// Metodo que devuelve una cadena de un entero generado de manera aleatoria como máximo con el numero del numero de caras
	public String lanzar() {
		byte randomNum = (byte) ((Math.random() * this.numCaras) + 1);
		numLanzamientos++;
		return(cara(randomNum));
		
	}
	
	// Metodo que asigna la cara en texto dada en numero
	
	private String cara(byte numDado) {

	    String[] caras = {
	        "Uno", "Dos", "Tres", "Cuatro", "Cinco",
	        "Seis", "Siete", "Ocho", "Nueve", "Diez",
	        "Once", "Doce", "Trece", "Catorce", "Quince",
	        "Dieciséis", "Diecisiete", "Dieciocho", "Diecinueve", "Veinte"
	    };

	    return caras[numDado - 1];
	}
	
	// Metodo toString
	
	public String toString() {
		  return String.format ("Número de caras: %d, Número de lanzamientos: %d", this.numCaras, this.numLanzamientos);
		}
}
