package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		/*
		 * Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
 mínimo. Implementa y utiliza la función:
 int minimo(int a, int b) // Devuelve el menor entre a y b
		 */
		
		int num1, num2;
        Scanner datos = new Scanner (System.in);
 		
        System.out.println("Introduce 1 número");
        num1 = datos.nextInt();
        
        System.out.println("Introduce otro número");
		num2 = datos.nextInt();
		
		System.out.println("El menor de los dos es " + minimo(num1,num2));
		
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