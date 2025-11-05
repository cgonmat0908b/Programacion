package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		/*
		 * Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
empresa y detectar si existe brecha salarial entre ambos. 

El programa pedirá por teclado la información de N personas distintas (valor también introducido por teclado).

 Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. 
 
Esta información debe guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
género.

		 */
		int personas, contadorMasc = 0, contadorFem = 0;
		double acumMasc = 0, acumFem = 0;
		double mediaMasc, mediaFem;
		
		System.out.println("Introduce el número de personas que deseas registrar el sueldo:");
		personas = datos.nextInt();
		
		double[][] generoSueldo = new double [personas][2];
		
		for (int i = 0; i < generoSueldo.length; i++) {
			
				System.out.println("Introduce tu género (0, masculino, 1, femenino.");
				generoSueldo[i][0] = datos.nextDouble();
				
				System.out.println("Introduce tu salario:");
				generoSueldo[i][1] = datos.nextDouble();
				
				if(generoSueldo[i][0] == 0) {
					contadorMasc++;
					acumMasc = acumMasc + generoSueldo[i][1];
					
				}else if (generoSueldo[i][0] == 1) {
					contadorFem++;
					acumFem = acumFem + generoSueldo[i][1];
				}
			
		}
		
		mediaMasc = acumMasc / contadorMasc;
		mediaFem = acumFem / contadorFem;
		
		System.out.println("El sueldo medio del genero masculino es: " + mediaMasc);
		System.out.println("El sueldo medio del genero femenino es: " + mediaFem);

	}

}
