/* 
 * Descripción: Realización de la primera practica del módulo de Programación
 * Autor: Cristian González Mateo
 * Fecha: 24/09/25
 */
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
		//y luego muestre la matriz por pantalla.
		int nums;
		int numArray;
		int acumulador = 0;
		int[][] numeros = new int [5][5];
		
		for (int i = 0; i < numeros.length; i++) {
			for(int f = 0; f < numeros[i].length; f++) {
				acumulador++;
				System.out.println("En la posición " + i + " del array, en la posicion " + f + " del bidimensional " + acumulador);
			}
		}
		
	}

}
