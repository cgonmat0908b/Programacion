package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		HashSet<Trabajador> coleccion = new HashSet<Trabajador>();
		
		// Apartado A
		System.out.println("El set previo al orden se ve así:");
		
		for(Trabajador i : coleccion) {
			System.out.println(i);
		}
		
		System.out.println("Tras la ordenación:");
		ordenar(coleccion);
		
		// Apartado B
		System.out.println("El número de hombre en la coleccion es:" + numHombres(coleccion));
		
		// Apartado C
		System.out.println("El numero de trabajadoras casadas es: " + casadas(coleccion));
		
		// Apartado D
		System.out.println("La suma de todos los sueldos es: " + sueldoTotal(coleccion));	
		
		
		}
		
	
	
	// Metodo que ordena un HashSet y lo muestra tras la ordenación
	public static void ordenar(HashSet<Trabajador> x){
		
		ArrayList<Trabajador> ordenador = new ArrayList<Trabajador>();
		
		ordenador.addAll(x);
		Collections.sort(ordenador);
		
		for(Trabajador i : ordenador) {
			System.out.println(i);
		}
		
	}
	
	// Metodo que recorre un HashSet y cuenta cuantos son del sexo masculino
	public static int numHombres(HashSet<Trabajador> x) {
		int contador = 0;
		
		for(Trabajador i : x) {
			if(!i.isSexo()) {
				contador++;
			}
		}
		return contador;
	}
	// Metodo que recorre un HashSet y cuenta cuantas trabajadoras tienen estado civil "casada"
	public static int casadas(HashSet<Trabajador> x) {
		int contador = 0;
		
		for(Trabajador i : x) {
			if(i.isSexo() && i.getEstadoCivil().equals("casada")) {
				contador++;
			}
		}
		return contador;
	}
	
	public static double sueldoTotal(HashSet<Trabajador> x) {
		double sueldos = 0;
		
		for(Trabajador i : x) {
			sueldos = sueldos + i.getSalarioBase();
		}
		
		return sueldos;
	}
	

}
