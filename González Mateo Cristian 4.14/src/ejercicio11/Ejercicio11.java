package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *   11. Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
 Para ello implementa una función que reciba como parámetro un número entero y muestre por
 pantalla la tabla de multiplicar de dicho número.
		 */
		Scanner datos = new Scanner (System.in);
		int num;
		
		System.out.println("Introduce un número entero");
		num = datos.nextInt();
		
		tabla(num);
	}

	public static void tabla(int num) {
		System.out.println("La tabla de multiplicar de " + num + " es: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}
