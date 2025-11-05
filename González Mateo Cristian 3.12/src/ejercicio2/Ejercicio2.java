/* Descripción:
 * Fecha: 3/11/25
 * Autor: Cristian González Mateo
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner datos = new Scanner(System.in);
		/*
		 * Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
		 * además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
		 */
		
		String cadena1, cadena2;
		
		System.out.println("Introduce la primera cadena de texto");
		cadena1 = datos.nextLine();
		
		System.out.println("Introduce la segunda cadena de texto");
		cadena2 = datos.nextLine();
		
		if (cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Las cadenas son identicas");
			
		}else {
			System.out.println("Las cadenas no son identicas");
		}
	}

}
