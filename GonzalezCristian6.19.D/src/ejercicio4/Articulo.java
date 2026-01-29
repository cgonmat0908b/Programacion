package ejercicio4;

public class Articulo {


/*
 * Aplica el encapsulamiento básico a la clase Articulo: Declara todos sus atributos como private
y crea todos los getters y setters necesarios (un get y un set por atributo).

Programa los setters para que comprueben los valores y los guarden en el objeto solo si son
correctos. 

En caso contrario se lanzará una excepción particular para cada uno de los atributos
especificando el error.

 */
	
	public static final int IVA = 21;
	
	private String nombre;
	private float precioSinIva;
	private float pvp;
	private int cuantosQuedan;
	
	
	public Articulo(String nombre, float precioSinIva, float pvp, int cuantosQuedan)throws IllegalArgumentException {
		
		if(nombre.isEmpty()||nombre == null) {
			throw new IllegalArgumentException("El nombre no puede ser nulo o estar vacio.");
		}
		if(precioSinIva <= 0) {
			throw new IllegalArgumentException("El precio no puede ser menor o igual que 0.");
		}
		if(pvp <= 0) {
			throw new IllegalArgumentException("El precio no puede ser menor o igual que 0.");
		}
		if(cuantosQuedan < 0) {
			throw new IllegalArgumentException("No pueden haber articulos negativos.");
		}
		
		
		this.nombre = nombre;
		this.precioSinIva = precioSinIva;
		this.pvp = pvp;
		this.cuantosQuedan = cuantosQuedan;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public float getPrecioSinIva() {
		return this.precioSinIva;
	}
	
	public float getPVP() {
		return this.pvp;
	}
	
	public int getCuantosQuedan() {
		return this.cuantosQuedan;
	}
	
	public void setNombre(String nombre)throws IllegalArgumentException {
		if(nombre.isEmpty()||nombre == null) {
			throw new IllegalArgumentException("El nombre no puede ser nulo o estar vacio.");
		}
		this.nombre = nombre;
	}
	
	public void setPrecioSinIva(float precioSinIva) {
		if(precioSinIva <= 0) {
			throw new IllegalArgumentException("El precio no puede ser menor o igual que 0.");
		}
		this.precioSinIva = precioSinIva;
		
	}
	
	public void setPVP(float pvp) {
		if(pvp <= 0) {
			throw new IllegalArgumentException("El precio no puede ser menor o igual que 0.");
		}
		this.pvp = pvp;
	}
	
	public void setCuantosQuedan(int cuantosQuedan) {
		if(cuantosQuedan < 0) {
			throw new IllegalArgumentException("No pueden haber articulos negativos.");
		}
		this.cuantosQuedan = cuantosQuedan;
	}
}
