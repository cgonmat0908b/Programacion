/*Descripción: Programa que lee el número introducido y enseña el dia de la semana
 * Fecha:28/10/25
 * Autor:Cristian González Mateo
 */
package ejercicio03;

import java.util.Scanner;

public class Ejercicio03{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner datos = new Scanner (System.in);
		
		//Creación e inizialización de las variables
		String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		int numIntro;
		//Creación e inizialización de las variables
		
		System.out.println("Introduce un número del 1 al 7");
		numIntro = datos.nextInt();
		//Entrada de datos
		
		
		//Inicio del switch/case para comprobar cual es el número introducido y devolver el día correspondiente
		switch (numIntro) {
		case 1:
			System.out.println(dias[0]);
			break;
			
		case 2:
			System.out.println(dias[1]);
			break;
			
		case  3:
			System.out.println(dias[2]);
			break;
			
		case 4:
			System.out.println(dias[3]);
			break;
			
		case 5:
			System.out.println(dias[4]);
			break;
			
		case 6:
			System.out.println(dias[5]);
			break;
			
		case 7:
			System.out.println(dias[6]);
			break;
			//Fin del switch/case
		}
		
	}

}
