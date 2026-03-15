package ejercicioMascotas;

public class Inventario {

	private Mascota[] mascotas;
	
	public Inventario(int numMascotas) {
		this.mascotas = new Mascota[numMascotas];
	}
	
	public void listaMascotas() {
		
		for(int i = 0; i < this.mascotas.length; i++) {
			if(this.mascotas[i] != null) {
				System.out.println("El " + i + " es un " + this.mascotas[i].getClass().getSimpleName() + " y se llama " + this.mascotas[i].getNombre());
			}
		}
	}
	
	public void mostrarAnim(String nombre) {
		for(int i = 0; i < this.mascotas.length; i++) {
			if(this.mascotas[i] != null && this.mascotas[i].getNombre().equals(nombre)) {
				System.out.println(this.mascotas[i].muestra());
			}
		}
	}
	
	public void mostrarTodos() {
		for(int i = 0; i < this.mascotas.length; i++) {
			if(this.mascotas[i] != null) {
				System.out.println(this.mascotas[i].muestra());
			}
		}
	}
	
	public void nuevaMascota(Mascota nueva) {
		boolean insertado = false;
		for(int i = 0; i < this.mascotas.length && !insertado; i++) {
			if(this.mascotas[i] == null) {
				this.mascotas[i] = nueva;
				insertado = true;
			}
		}
	}
	
	public void eliminarMascota(Mascota existente) {
		for(int i = 0; i < this.mascotas.length; i++) {
			if(this.mascotas[i] != null && this.mascotas[i].equals(existente)) {
				this.mascotas[i] = null;
			}
		}
	}
	
	public void vaciarInventario() {
		for (int i = 0; i < this.mascotas.length; i++) {
			if(this.mascotas[i] != null) {
				this.mascotas[i] = null;
			}
		}
	}
	
}
