package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Atleta> listaAtletas = new ArrayList<>();
		
		// Instanciación e inicializacion de objetos y añadirlos al ArrayList
		try{
			for(int i = 0; i < 30; i++) {
				String nombre = "atleta " + i;
				byte edad = randomEdad();
				short altura = randomAltura();
				
				listaAtletas.add(new Atleta(nombre,edad,altura));
			}
				
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
		}
		
		// Uso del metodo para las medias
		
		int[] medias = medias(listaAtletas);
		System.out.println("La media de edad es: " + medias[0]);
		System.out.println("La media de altura es: " + medias[1]);
			
		// Uso del metodo para calcular cuantos atletas son mayores que la edad media y cuantos menores que la edad media
		
		int[] mayorMenor = mayoria(listaAtletas);
		System.out.println("El numero de atletas mayores de edad es: " + mayorMenor[0]);	
		System.out.println("El numero de atletas menores de edad es: " + mayorMenor[1]);
		
		
		// Uso del metodo que devuelve los nombres de los atletas que son más altos que la media
		
		String[] nombres = nomMayorPromedio(listaAtletas);
		System.out.println("Los nombres de los atletas más altos que la media son:");
		for(int f = 0; f < nombres.length; f++) {
			if(nombres[f] != null) {
				System.out.println(nombres[f]);
			}
			
		}
		
		// Ordenación de la lista, implementando la interfaz Comparable <> para comparar con un campo
		System.out.println("Antes de la ordenación:");
		
		for(Atleta f: listaAtletas) {
			System.out.println(f);
		}
		
		System.out.println("Tras la ordenación:");
		
		Collections.sort(listaAtletas);
		
		for(Atleta f: listaAtletas) {
			System.out.println(f);
		}
		
	}
	
	// edad aleatoria 10-80
	public static byte randomEdad() {
		
		return (byte) (10 + Math.random() * (80-10+1));
		
	}
	// altura aleatoria 150-210
	public static short randomAltura() {
		return (short)(150 + Math.random() * (210-150+1));
	}
	
	// Metodo que dado una lista de objetos, calcula la media de edad y altura posición 0 edad, posición 1 altura
	
	public static int[] medias(ArrayList<Atleta> lista) {
		int numAtletas = 0;
		int[] medias = new int[2];
		
		for(Atleta x : lista) {
			byte edad = x.getEdad();
			short altura = x.getAltura();
			numAtletas++;
			
			medias[0] = (int) (medias[0] + edad);
			medias[1] = (int) (medias[1] + altura);
			
		}
		
		medias[0] = medias[0] / numAtletas;
		medias[1] = medias[1] / numAtletas;
		
		return medias;
		
	}
	
	// Metodo que dado una lista de objetos, calcula cuantos atletas son mayores de edad posicion 0, menores de edad posicion 1
	
	public static int[]  mayoria(ArrayList<Atleta> lista) {
		int numAtletas = 0;
		int[] mayorMenor = new int[2];
		
		for(Atleta x : lista) {
			byte edad = x.getEdad();
			
			if(edad > 18) {
				mayorMenor[0]++;
			}else {
				mayorMenor[1]++;
			}	
			
		}
		
		return mayorMenor;
	}
	
	// Metodo que devuelve una lista de los nombres de los atletas que son más altos que la media
	
	public static String[] nomMayorPromedio(ArrayList<Atleta> lista) {
		int[] edadAlturaProm = medias(lista);
		
		ArrayList<String> ListaNombres = new ArrayList<>();
		
		for(Atleta x: lista) {
			String nombre = x.getNombre();
			if(x.getAltura() > edadAlturaProm[1]) {
				ListaNombres.add(nombre);
			}
			
		}
		
		String[] nombres = ListaNombres.toArray(new String[lista.size()]);
		
		return nombres;
	}
	
}
