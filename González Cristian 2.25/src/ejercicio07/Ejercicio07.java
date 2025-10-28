/*Descripción: Programa que
 * Fecha: 28/10/25
 * Nombre: Cristian González Mateo
 */
package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		//Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
		 
		int dia,mes;
		
		System.out.println("Introduce tu día de nacimiento");
		dia = datos.nextInt();
		
		System.out.println("Introduce tu mes de nacimiento(numero)");
		mes = datos.nextInt();
		
		if (dia >= 21 && mes == 3 || dia <= 19 && mes == 4 ) { //Aries	21 de marzo – 19 de abril
			System.out.println("Aries");
			
		}else if (dia >= 20 && mes == 4 || dia <= 20 && mes == 5) {//Tauro	20 de abril – 20 de mayo
			System.out.println("Tauro");
			
		}else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {//Géminis	21 de mayo – 20 de junio
			System.out.println("Géminis");
			
		}else if (dia >= 21 && mes == 6 || dia <= 22 && mes == 7) {//Cáncer	21 de junio – 22 de julio
			System.out.println("Cáncer");
			
		}else if (dia >= 23 && mes == 7 || dia <= 22 && mes == 8) {//Leo	23 de julio – 22 de agosto
			System.out.println("Leo");
			
		}else if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {//Virgo	23 de agosto – 22 de septiembre
			System.out.println("Virgo");
			
		}else if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {//Libra	23 de septiembre – 22 de octubre
			System.out.println("Libra");
			
		}else if (dia >= 23 && mes == 10 || dia <= 21 && mes == 11) {//Escorpio	23 de octubre – 21 de noviembre
			System.out.println("Escorpio");
			
		}else if (dia >= 22 && mes == 11 || dia <= 21 && mes == 12) {//Sagitario	22 de noviembre – 21 de diciembre
			System.out.println("Sagitario");
			
		}else if (dia >= 22 && mes == 12 || dia <= 19 && mes == 1) {//Capricornio	22 de diciembre – 19 de enero
			System.out.println("Capricornio");
			
		}else if (dia >= 20 && mes == 1 || dia <= 18 && mes == 2) {//Acuario	20 de enero – 18 de febrero
			System.out.println("Acuario");
			
		}else if (dia >= 19 && mes == 2 || dia <= 20 && mes == 3) {//Piscis	19 de febrero – 20 de marzo
			System.out.println("Piscis");
			
		}
	
	}

}
