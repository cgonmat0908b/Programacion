package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
 pequeño. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
 tres) y nos devuelva el mínimo de los dos valores.
		 */
		
		int num1,num2,num3, min1;
        Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor");
		num1 = datos.nextInt();
		
		System.out.println("Introduce el segundo valor");
		num2 = datos.nextInt();
		
		System.out.println("Introduce el tercer valor");
		num3 = datos.nextInt();
		
		min1 = minimo(num1,num2);
		System.out.println("El menor entre los 3 numeros es: " + minimo(min1,num3));
			

	}
	public static int minimo(int a, int b) {
		   int menor = 0;
		   if(a < b) {
			   menor = a;
			   
		   }else {
			   menor = b;
		   }
		   return menor;
	   }
	
}
