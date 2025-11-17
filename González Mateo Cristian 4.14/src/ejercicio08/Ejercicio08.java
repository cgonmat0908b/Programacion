package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 8. Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
 productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
 int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
 int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
 double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
		 */
		int num;
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce un numero N");
		num = datos.nextInt();
		
		System.out.println("La suma de 1 a " + num + " es " + suma1aN(num));
		System.out.println("El productorio de 1 a " + num + " es " + producto1aN(num));
		System.out.println("El numero que hay entre 1 y " + num + " es " + intermedio1aN(num));
		
	}

	public static int suma1aN(int n) {
		int suma = 0;
		for(int i = 1; i <= n; i++) {
			suma = suma + i;
		}
		return suma;
	}
	public static int producto1aN(int n) {
		int producto = 1;
		
		for(int i = 1; i <= n; i++) {
			producto = producto * i;
		}
		return producto;
	}
	public static double intermedio1aN(int n) {
		double intermedio = 0;
		intermedio =  (1 + n) / 2.0;
		return intermedio;
	}
}
