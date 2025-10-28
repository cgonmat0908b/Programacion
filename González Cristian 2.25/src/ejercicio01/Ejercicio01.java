/* Descripción: Programa que indica que asignatura toca a primera hora el dia escrito por el usuario
 * Fecha: 28/10/25
 * Autor:Cristian González Mateo
 * 
 */


package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
toca a primera hora ese día.

		 */
		
		Scanner datos = new Scanner(System.in);
		
		String diaIntro;
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
		
		
		System.out.println("Introduce el día de la semana");
		diaIntro = datos.next();
		
		if (diaIntro.equals(dias[0])) {
			System.out.println("El " + dias[0] + " a primera hora tienes Base de Datos");
			
		}else if (diaIntro.equals(dias[1])) {
			System.out.println("El " + dias[1] + " a primera hora tienes IPE");
			
		}else if (diaIntro.equals(dias[2])) {
			System.out.println("El " + dias[2] + " a primera hora tienes Digitalización");
			
		}else if (diaIntro.equals(dias[3])) {
			System.out.println("El " + dias[3] + " a primera hora tienes Base de Datos");
			
		}else 
			System.out.println("El " + dias[4] + " a primera hora tienes Sistema Informáticos");
			
		

	}

}
