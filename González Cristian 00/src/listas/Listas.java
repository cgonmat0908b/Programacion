package listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Listas {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		Integer entero = Integer.valueOf(numRandom());
		
		LinkedList<Integer> listaEnlazada = new LinkedList<Integer>();
		ArrayList<Integer>  listaArray = new ArrayList<Integer>();
		
		
		for(int i = 0; i < entero.intValue(); i++) {
			entero = Integer.valueOf(numRandom());
			System.out.println("Se introduce el siguiente entero:" + entero);
			listaEnlazada.add(entero);
			listaArray.add(entero);
		}
		
		System.out.println("Lista Enlazada:");
		for(Integer e:listaEnlazada) {
			System.out.println("En la posición: " +listaEnlazada.indexOf(e) + " se encuentra: " + e);
		}
		
		System.out.println("Lista Array:");
		for(Integer f:listaArray) {
			System.out.println("En la posición: " +listaArray.indexOf(f) + " se encuentra: " + f);
		}
		
		System.out.println("Indica una posición en la que meter el numero aleatorio");
		int pos = datos.nextInt();

		try {
			listaArray.add(pos, entero = Integer.valueOf(numRandom()));
		}catch(IndexOutOfBoundsException  ex1){
			System.out.println(ex1.getMessage());
		}
	}
	
	public static int numRandom() {
		int numAleatorio = (int)(Math.random() * 101);
		return numAleatorio;
	}

}
