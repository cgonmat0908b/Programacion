package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		/*
		 * Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
 positivo, negativo o cero. Implementa y utiliza la función:
 int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
		 */
		
        Scanner datos = new Scanner (System.in);
        int num;
        
        System.out.println("Introduce un número");
        num = datos.nextInt();
        
        System.out.println("El número introducido es " + dimeSigno(num));
 		
	}

	public static int dimeSigno(int a) {
		int positivo = 1, negativo = -1, cero = 0;
		if(a == 0) {
			return cero;
		}else if(a < 0) {
			return negativo;
		}else {
			return positivo;
		}
	}
}
