/*Descripción:
 *Fecha:
 *Autor:
 */
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {


		Scanner datos = new Scanner (System.in);
		
		/*
		 * Escribe un programa que pida un número entero al usuario (int) y luego muestre la suma 
de sus cifras. Por ejemplo, dado el número 35 su suma es 8, dado el número 719 su suma 
es 17, y dado el 1002 su suma es 3.
		 */
		
		int numIntro, suma = 0,num;
		
		System.out.println("Introduce un número entero");
		numIntro = datos.nextInt();
		
		num = Math.abs(numIntro); //Solo para poder trabajar tambien con negativos.
		
		while (num > 0) {
			suma =  suma + (num % 10);
			num = num / 10;
			
		}
		System.out.println("La suma de los dígitos del número introducido es " + suma);
	}

}
