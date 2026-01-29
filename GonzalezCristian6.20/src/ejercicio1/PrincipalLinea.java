package ejercicio1;

public class PrincipalLinea {

	public static void main(String[] args) {

		Punto a = new Punto(4,7);
		Punto b = new Punto(8,14);
		
		// Constructor con 2 parametros
		Linea ab = new Linea(a,b);
		System.out.println(ab.escribirLinea());
		
		
		// Constructor con parametros por defecto
		Linea defecto = new Linea();
		System.out.println(defecto.escribirLinea());
		
		//Desplazamientos
		
		//Derecha
		ab.mueveDerecha(6);
		System.out.println(ab.escribirLinea());
		
		//Abajo
		ab.mueveAbajo(8);
		System.out.println(ab.escribirLinea());
		
		
		//Arriba
		ab.mueveArriba(20);
		System.out.println(ab.escribirLinea());
		
		
		//Izquierda
		ab.mueveIzquierda(18);
		System.out.println(ab.escribirLinea());
		
		
		
	}

}
