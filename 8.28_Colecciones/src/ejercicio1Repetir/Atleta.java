package ejercicio1Repetir;

public class Atleta {
	private String nombre;
	private int edad;
	private double altura;
	
	// Constructor con parametros aleatorios entre unos rangos definidos
	
	public Atleta() {
		this.nombre = randomNom();
		this.edad = (int) ( 12 + (Math.random() * 53));
		this.altura = 150 + Math.random() * 50;
	}
	
	private String randomNom() {
		
		String[] aleatorio = {
				"Paco", "Juan", "Francisco", "Maria", "Cristian", "Hola"
		};
		
		return aleatorio[(int) (Math.random() * 6)];
	}

	// Getters
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getAltura() {
		return altura;
	}

	// Setters
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]";
	}
	
	
	
}
