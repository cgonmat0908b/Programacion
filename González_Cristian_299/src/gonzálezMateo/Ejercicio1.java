/* Descripción: Programa que pide un valor de inicio y de fin, pasa por todo el rango y comprueba si es divisible entre 3 y 5, si no lo es, muestra un mensaje.
 * Fecha: 12/11/2025
 * Autor: Cristian González Mateo
 */
package gonzálezMateo;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Inicialización de variables
		
		int inicio, fin, contador = 0;
		Scanner datos = new Scanner(System.in);
		
		//Toma de datos
		
		System.out.println("Introduce el primer número");
		inicio = datos.nextInt();
		
		System.out.println("Introduce el segundo número");
		fin = datos.nextInt();

		
		//Condición de validación, si inicio es mayor que fin, pide los datos de nuevo hasta que no sea así
		
		if(inicio > fin) {
			while (inicio > fin) {
				System.out.println("Número introducidos de manera erronea, intentelo de nuevo");
				
				System.out.println("Introduce el primer número");
				inicio = datos.nextInt();
				
				System.out.println("Introduce el segundo número");
				fin = datos.nextInt();
				
			}
			
			//Condición válida, inicio es menor que fin. Calculo si el número es divisible entre 3 y 5.
			
		}else {
			for(int i = inicio; i <= fin; i++) {
				if((i % 3 == 0) && (i % 5 == 0)) {
					contador++;
				}
			}
			//Si no existe un número divisible, muestro el mensaje.
		}if(contador == 0) {
			System.out.println("Ningun número en el rango introducido es divisible entre 3 y 5");
		}
		
	}

}
