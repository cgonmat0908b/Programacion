package ejercicio1;
/*
 * Modifica los atributos de Punto para que sean private.
Fíjate que desde el main ya no te dejará utilizar ni
modificar los atributos x e y de los objetos.

Vamos a añadir los getteres: int getX() e int getY() que
devolverán los valores de x e y respectivamente.

Es unaforma indirecta de leer sus valores.
Añadiremos también los setters: void setX(int x) y void
setY(int y) que copiarán el valor pasado como parámetro a los atributos de la clase.

Tanto getters como setters deben ser public.

Corrige el main para utilizar los getters y setters.

Prueba a instanciar varios objetos, mostrar sus valores por
pantalla, modificarlos, etc.

 * 
 */
public class Punto {

	private int x;
	private int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public String toString() {
		String texto = String.format("%d %d", this.x, this.y);
		return texto;
	}
	
}
