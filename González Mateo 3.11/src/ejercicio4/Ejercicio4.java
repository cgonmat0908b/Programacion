package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		/*
		 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
programa mostrará la nota mínima, máxima y media de cada alumno.
		 */
		
		int[][]alumAsig = new int [4][5];
		int [] notaAcum = new int [4];
		int [] notaMin = new int [4];
		int [] notaMax = new int [4];
		int [] notaMedia = new int [4];
		
		
		
		for (int i = 0; i < alumAsig.length; i++) {
			System.out.println("Alumno " + (i + 1) + " introduce 5 notas");
			
			for (int f = 0; f < alumAsig[i].length; f++) {
				System.out.println("Introduce una nota: ");
				alumAsig[i][f] = datos.nextInt();
				notaAcum[i] = alumAsig[i][f] + notaAcum[i];
				
				
				
				if (f == 0) {
					notaMax[i] = alumAsig[i][f];
					notaMin[i] = alumAsig[i][f];
				} else {
				if(alumAsig[i][f] > notaMax[i]) {
					notaMax[i] = alumAsig[i][f];
					
				}
				if(notaMin[i] > alumAsig[i][f]) {
					notaMin[i] = alumAsig[i][f];
					
				}
			  }

			}
			notaMedia[i] = notaAcum[i] / 5;	
	    }
		for (int j = 0; j < notaMedia.length; j++) {
			System.out.println("La nota media del Alumno" + (j + 1) + " es " + notaMedia[j]);
			System.out.println("La mayor nota del Alumno" + (j + 1) + " es " + notaMax[j]);
			System.out.println("La nota menor del Alumno" + (j + 1) + " es " + notaMin[j]);
			System.out.println();
			
			
		}

	}

}
