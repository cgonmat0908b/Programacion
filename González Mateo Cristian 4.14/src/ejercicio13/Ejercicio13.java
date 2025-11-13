/* Descripción:
 * Fecha:
 * Autor:
*/
package ejercicio13;


import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner datos = new Scanner(System.in);
		
		/*
		 * Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
 luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
 valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al
 usuario V, I además de N (nº de valores a crear).
		 */
		
		int num, v, i;
		
		System.out.println("Introduce la longitud de la secuencia");
		num = datos.nextInt();
		
		int [] secuencia = new int[num]; 
		
		System.out.println("Por que número comienza la secuencia?");
		v = datos.nextInt();
		secuencia[0] = v;
		
		System.out.println("Que número realiza el incremento?");
		i = datos.nextInt();
		
		
		for (int f = 1; f < secuencia.length; f++) {
			secuencia[f] = secuencia[(f - 1)] + i;
		}
		System.out.print("La secuencia es " + v );
		
		for (int w = 1; w < secuencia.length; w++) {
			System.out.print(", " + secuencia[w]);
		}
		
	}

}
