/*Descripción: Programa que mostrará un mensaje según la hora introducida
 * Fecha: 28/10/25
 * Autor:Cristian González Mateo
 */
package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realiza un programa que pida una hora por teclado y que muestre luego buenos días,
buenas tardes o buenas noches según la hora. 
		 */
		
		Scanner datos = new Scanner (System.in);
		
		String[] mensaje =  {"Buenos días", "Buenas tardes", "Buenas noches"};
		int hora;
		
		System.out.println("Introduce la hora");
		hora = datos.nextInt();
		
		if (hora >= 6 && hora <= 12) {
			System.out.println(mensaje[0]);
		
		}else if (hora > 12 && hora <= 20) {
			System.out.println(mensaje[1]);
			
		}else {
			System.out.println(mensaje[2]);
		}
		
		
	}

}
