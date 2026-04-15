package ejercicio1Repetir;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// ArrayList
		ArrayList<Atleta> lista = new ArrayList<>();
		
		// Llenar la lista con 30 atletas
		for(int i = 0; i < 30; i++) {
			lista.add(generarAtleta());
		}
		
		// Mostar los objetos del arrayList
		System.out.println(lista);
		
		// Apartado A
		
		System.out.println("La media de edad es: " + mediaEdad(lista));
		
		System.out.println("La media de altura es: " + mediaAltura(lista));
		
		
		// Apartado B
		System.out.println("El número de atletas menores de edad es: " + numMenores(lista));
		
		System.out.println("El número de atletas mayores de edad es: " + numMayores(lista));
		
		// Apartado C
		System.out.println("La lista de nombres de atletas más altas que el promedio es la siguiente:" + nomAtletas(lista));
		
		
	}

	public static Atleta generarAtleta() {
		Atleta random = new Atleta();
		return random;
	}
	
	public static double mediaEdad(ArrayList<Atleta> x ) {
		int sumEdad = 0;
		int contador = 0;
		
		for(Atleta e : x) {
			 sumEdad = sumEdad + e.getEdad();
			 contador++;	
		}
		 
		return sumEdad / contador;

	}
	
	public static double mediaAltura(ArrayList<Atleta> x) {
		double sumAltura = 0;
		int contador = 0;
		
		for(Atleta e : x) {
			sumAltura = sumAltura + e.getAltura();
			 contador++;
		}
		
		return sumAltura / contador;

	}
	
	public static int numMayores(ArrayList<Atleta> x) {
		int contador = 0;
		
		for(Atleta e : x) {
			if(e.getEdad() >= 18) {
				contador++;
			}
		}
		return contador;
	}
	
	public static int numMenores(ArrayList<Atleta> x) {
		int contador = 0;
			
		for(Atleta e : x) {
			if(e.getEdad() < 18) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public static ArrayList<String> nomAtletas(ArrayList<Atleta> x) {
		double promedia = mediaAltura(x);
		ArrayList<String> nombres = new ArrayList<String>();
		
		for(Atleta e : x) {
			if(e.getAltura() > promedia) {
				nombres.add(e.getNombre());		
			}
		}
		return nombres;
	}
	
}
