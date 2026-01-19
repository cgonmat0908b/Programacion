package ejercicio2;

public class Persona {

/*
 * Aplica el encapsulamiento básico a la clase Persona: Declara todos sus atributos como private
y crea todos los getters y setters necesarios (un get y un set por atributo).

El atributo dni debe ser válido.
 En caso contrario, se lanzará una excepción indicando el error.
 
Corrige el main para utilizar los getters y setters. Prueba a instanciar varios objetos, mostrar sus
valores por pantalla, modificarlos, etc

 */
	
	private String dni;
	private String nombre;
	private String apellidos;
	private byte edad;
	
	public Persona(String dni, String nombre, String apellidos, byte edad) throws IllegalArgumentException {
		
		if(dni == null || dni.isEmpty()) {
			throw new IllegalArgumentException("El parametro es nulo o contiene una cadena vacia");
			
		}else if(DniFormato(dni) == false) {
			throw new IllegalArgumentException("El formato del dni es incorrecto");
			
		}else if(DniCorrecto(dni) == false) {
			throw new IllegalArgumentException("El dni introducido no es correcto");
		}
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public static boolean DniFormato(String dni) {
		boolean dniValido = false;
		
		if(dni == null || !dni.matches("[0-9]{8}[A-Z]")) {
			dniValido = false;
			
			
		}else {
			dniValido = true;
		}
		return dniValido;
	}
	public static boolean DniCorrecto(String dni) {
		
		boolean dniCorrecto = false;
		char[] letras = {
		        'T','R','W','A','G','M','Y','F','P','D','X',
		        'B','N','J','Z','S','Q','V','H','L','C','K','E'
		    };
		
		char letraDni = dni.charAt(dni.length()-1);
		int numero = Integer.parseInt(dni.substring(0, dni.length() - 1));
		int modulo = numero % 23;
		
		if(letraDni == letras[modulo]) {
			dniCorrecto = true;
		}
		
		return dniCorrecto;
	}
	
	
	//Setter Y Getters
	
	public String getDni() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public byte getEdad() {
		return edad;
	}
	
	public void setDni(String dni) throws IllegalArgumentException{
		if(dni == null || dni.isEmpty()) {
			throw new IllegalArgumentException("El parametro es nulo o contiene una cadena vacia");
			
		}else if(DniFormato(dni) == false) {
			throw new IllegalArgumentException("El formato del dni es incorrecto");
			
		}else if(DniCorrecto(dni) == false) {
			throw new IllegalArgumentException("El dni introducido no es correcto");
		}
		this.dni = dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(byte edad) {
		this.edad = edad;
	}
}
