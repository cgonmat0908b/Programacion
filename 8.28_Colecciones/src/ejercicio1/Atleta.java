package ejercicio1;

public class Atleta {

	private String nombre;
	private byte edad;
	private short altura; // en cm
	
	public Atleta(String nombre, byte edad, short altura)throws IllegalArgumentException  {
		
		if(nombre.isEmpty() || nombre == null) {
			throw new IllegalArgumentException("Nombre no valido");
		}
		if(edad > 100 || edad < 0) {
			throw new IllegalArgumentException("Edad no valida");
		}
		
		if(altura < 0 || altura > 250) {
			throw new IllegalArgumentException("Altura no valida");
		}
		
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		
		
	}

	
	// Getters
	
	public String getNombre() {
		return nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public short getAltura() {
		return altura;
	}

	// Setters 
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public void setAltura(short altura) {
		this.altura = altura;
	}

	// toString
	
	public String toString() {
		return "Atleta [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]";
	}
	
}
