//Documentación metodo

/*
 * 
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 14. Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir
 dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.
		 * 
		 */
		String letra;
		int numLin;
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce el caracter");
		letra = datos.next();
		
		System.out.println("Introduce el número de lineas del triangulo");
		numLin = datos.nextInt();
		
		triangulo(letra,numLin);
		
	 }
	public static void triangulo(String letra, int numLin) {
		for (int i = 1; i <= numLin; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("\t" + letra);
			}
			System.out.println();
			System.out.println("\t");
		}
	}
}
