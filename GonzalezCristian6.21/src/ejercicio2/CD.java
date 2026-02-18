package ejercicio2;

import ejercicio1.Cancion;

public class CD {

	private Cancion[] canciones;
	private int contador; // Siguiente posición libre del array de objetos de la  clase Canción
	
	// Constructor por defecto
	public CD(){
		this.canciones = new Cancion[10];
		this.contador = 0;
	}
	
	//Constructor copia
	public CD(CD copia) {
		this.canciones = copia.canciones;
		this.contador = copia.contador;
	}
	
	// Metodo que devuelve el numero de canciones 
	public int getNumeroCanciones() {
		return this.contador;
	}
	
	// Metodo que devuelve la cancion que del array que haya en la posición indicada
	public Cancion dameCancion(int x)throws IllegalArgumentException {
		if(x > canciones.length || x < 0) {
			throw new IllegalArgumentException("El CD no contiene tantas canciones o negativas");
		}
		
		return this.canciones[x];
	}
	
	public void grabaCancion(int x, Cancion sustituto)throws IllegalArgumentException {
		
		if(x > canciones.length || x < 0) {
			throw new IllegalArgumentException("El CD no contiene tantas canciones o negativas");
		}
		
		this.canciones[x] = sustituto;
	}
	
	public void agrega(Cancion agregada)throws IllegalArgumentException {

		if(this.contador >= this.canciones.length ) {
			throw new IllegalArgumentException("El CD ya esta lleno");
		}

		this.canciones[contador] = agregada;
		this.contador++;
	}
	
	public void elimina(int x)throws IllegalArgumentException {
		if(x > canciones.length || x < 0) {
			throw new IllegalArgumentException("El CD no contiene tantas canciones o negativas");
		}
		
		
	}
	
}
