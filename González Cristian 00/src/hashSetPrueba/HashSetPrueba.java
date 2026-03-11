package hashSetPrueba;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetPrueba {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);

		int num = numRandom();
		
		HashSet <Integer> set = new HashSet<Integer>(num);
		
		for(int i = 0; i < num; i++) {
			if(!set.add(numRandom2())) {
				System.out.println("El numero ya estaba");
			}
		}
		
		System.out.println(set.toString());

		
		// Pedir al usuario un numero e indicar si esta o no en el HasSet
		System.out.println("Introduce un número y se indica si está en el set o no.");
		Integer numU = Integer.valueOf(datos.nextInt());
		
		
		if(set.contains(numU)) {
			System.out.println("El numero se encuentra en el set");
		}else {
			System.out.println("El numero no se encuentra en el set, quieres añadirlo? s/n");
			String respuesta = datos.next();
			if(respuesta.equals("s")) {
				set.add(numU);
				System.out.println("Numero introducido");
				System.out.println(set.toString());
			}
			
		}
		
		// Pedir al usuario un numero a eliminar del HashSet
		System.out.println("Introduce un número para eliminar del Hash");
		numU = Integer.valueOf(datos.nextInt());
		
		if(set.remove(numU)) {
			System.out.println("Borrado satisfactoriamente");
		}else {
			System.out.println("No se encuentra en la colección con lo cual no se puede borrar");
		}
		
		// Crear otro HashSet de 10 valores aleatorios e intentar introducirlos en el anterior
		
		//HashSet nuevo
		HashSet<Integer> nuevo = new HashSet<Integer>(10);
		
		Integer Nums = Integer.valueOf(numRandom2());
		
		for(int x = 0; x < 10; x++) {
			nuevo.add(Nums);
			Nums = Integer.valueOf(numRandom2());
		}
		
		// HashSet antiguo pre y post introducción de los valores del nuevo HashSet
		System.out.println("El primer set tiene " + set.size() + " objetos");
		
		try {
			set.addAll(nuevo);
			
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			
		}catch(NullPointerException ex2) {
			System.out.println(ex2.getMessage());
			
		}catch(Exception general) {
			System.out.println(general.getMessage());
		}
		
		System.out.println("Tras tratar de añadir los objetos de otra colección, tiene " + set.size() + " objetos");
		
		
		// Calcular los numeros que estan en los 2 conjuntos
		
		System.out.println("El set antes de la interseccion contiene: " + set.toString());
		try {
			set.retainAll(nuevo);
			
		}catch(ClassCastException ex1) {
			System.out.println(ex1.getMessage());
			
		}catch(NullPointerException ex2) {
			System.out.println(ex2.getMessage());
			
		}catch(UnsupportedOperationException ex3) {
			System.out.println(ex3.getMessage());
		}
		
		System.out.println("Tras la interseccion contiene: " + set.toString());
		
		
		
	}
	
	public static int numRandom() {
		int numAleatorio = (int)(Math.random() * 51) + 50;
		return numAleatorio;
	}
	
	public static int numRandom2() {
		int numAleatorio = (int)(Math.random() * 101);
		return numAleatorio;
	}
		

}

