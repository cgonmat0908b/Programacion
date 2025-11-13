package ejercicio16;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * . Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
 valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
 muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().
		 */
		int inicio = 0, fin;
		int [] array10 = new int [55];
		
		for (int i = 1; i <= 10; i++) {
			fin = inicio + i;
			Arrays.fill(array10, inicio, fin, i);  // Llena array10 desde la posición (inicio) hasta la posición (fin - 1) con el valor (i)
			inicio = fin;
		}
		System.out.println(Arrays.toString(array10));
		
	}

}
