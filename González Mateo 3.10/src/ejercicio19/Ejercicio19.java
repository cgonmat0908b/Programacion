package ejercicio19;

import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de
 ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los
 jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las
 puntuaciones en orden descendente (de la más alta a la más baja).
		 */
		Scanner datos = new Scanner(System.in);
		
		int[] jugadores  = new int [8];
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println("Jugador " + (i + 1) + " introduzca su elo (1000-2800):");
			jugadores[i] = datos.nextInt();
		}
		
		Arrays.sort(jugadores);
		
		for (int i = (jugadores.length - 1); i >= 0	; i--) {
			System.out.println("El jugador " + (i + 1) + " tiene " + jugadores[i] + " elo");
		}
		
	}

}
