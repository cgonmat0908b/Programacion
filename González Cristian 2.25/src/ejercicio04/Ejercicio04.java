package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta
que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A
partir de la hora 41, se pagan a 16 euros la hora.
		 */

		Scanner datos = new Scanner (System.in);
		//Creación de las variables
		int horas,pagoNormal,pagaExtra,pagaTotal;
		
		//Recogida de datos
		System.out.println("Cuantas horas has trabajado esta semana?");
		horas = datos.nextInt();
		
		//Analiza las horas realizadas y devuelve el cobro
		if (horas > 40) {
			pagoNormal = 40 * 12;
			horas = horas - 40;
			pagaExtra = horas * 16;
			pagaTotal = pagoNormal + pagaExtra;
			System.out.println("Esta semana cobras " + pagaTotal);
			
		}else {
			pagoNormal = horas * 12;
			System.out.println("Esta semana cobras " + pagoNormal);
		}
		
		
	}

}
