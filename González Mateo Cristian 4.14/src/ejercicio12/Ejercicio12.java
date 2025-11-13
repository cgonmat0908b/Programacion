package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
 distintas opciones:
 a. Mostrar valores.
 b. Introducir valor.
 c. Salir.
 La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
 posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
 hasta que el usuario elija la opción ‘c’ que terminará el programa.
		 */
		
		   Scanner datos = new Scanner (System.in);
		   int [] enteros = new int [10];
		   char opcion;
		   int num,pos = 0;
		   
		   do{
			   System.out.println("a. Mostrar valores.");
			   System.out.println("b. Introducir valor.");
			   System.out.println("c. Salir.");
			   opcion = datos.next().charAt(0);
			   
			   if (opcion == 'a') {
				   for (int i = 0; i < enteros.length; i++) {
					   System.out.println("En la posción " + i + " hay guardado " + enteros[i]);
				   }
			   }
			   if (opcion == 'b') {
				   System.out.println("Introduce el valor que quieres guardar");
				   num = datos.nextInt();
				   System.out.println("En que posición quieres guardarlo?(0-9)");
				   pos = datos.nextInt();
				   enteros [pos] = num;
			   }
			   
			   
		   }while (opcion != 'c');
	}

}
