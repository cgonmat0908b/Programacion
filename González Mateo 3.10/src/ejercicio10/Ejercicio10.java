package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		/*
		 * Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
por debajo de la media.
		 */
	
		Scanner datos = new Scanner(System.in);
		double altMedia,altMin = 0,altMax = 0, acum = 0;
		int vector, contadorMayor = 0, contadorMenor = 0;
		
		System.out.println("Introduce un número natural");
		vector = datos.nextInt();
		
		double [] altura = new double [vector];
				
		for (int i = 0; i < altura.length; i++) {
			System.out.println("Introduce una altura en metros");
			altura[i] = datos.nextDouble();
			acum = acum + altura[i];
			
			
		}
		
		altMin = altura[0];
		altMax= altura[0];
		for (int w = 0; w < altura.length;w++) {
			
			if (altura[w] < altMin) {
				altMin = altura[w];
				
			}
			if (altMax < altura[w]) {
				altMax = altura[w];
				
			}
			
		}
		altMedia = acum / vector;
		for (int f = 0; f < altura.length; f++) {
			if (altura[f] > altMedia) {
				contadorMayor++;
				
			}else if (altura[f] < altMedia) {
				contadorMenor++;
			}
			
		}
		
		System.out.println("La altura máxima es " + altMax);
		System.out.println("La altura mínima es " + altMin);
		System.out.println("La altura media es " + altMedia );
		System.out.println("Hay " + contadorMayor + " alturas mayores que la media");
		System.out.println("Hay " + contadorMenor + " alturas menores que la media");
		
		
	}

}
