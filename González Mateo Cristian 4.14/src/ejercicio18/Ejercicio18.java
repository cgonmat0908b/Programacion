package ejercicio18;

import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0
 y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por
 pantalla.
		 */
		
		double [] arrayOrden = new double  [30];
		for (int i = 0; i < arrayOrden.length; i++) {
		}
		
		Arrays.sort(arrayOrden);
		
		for (int i = 0; i < arrayOrden.length; i++) {
			System.out.println("En la posición " + i + " tras el orden, hay guardado: " + arrayOrden[i]);
		}
	}

}
