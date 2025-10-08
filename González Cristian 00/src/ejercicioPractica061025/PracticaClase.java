package ejercicioPractica061025;

import java.util.Scanner;

public class PracticaClase {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Número de preguntas acertadas:");
		int preguntasAcertadas = datos.nextInt();
		
		System.out.println("Número de preguntas falladas:");
		int preguntasFalladas = datos.nextInt();
		
		int preguntasTotales = preguntasAcertadas + preguntasFalladas;
		
		if (preguntasTotales < 0 || preguntasTotales > 20) {
			System.out.println("Alguna nota ha sido introducida de manera incorrecta");
		} else {
		
		double sumaAciertos = preguntasAcertadas * 0.5;
		double restaAciertos = preguntasFalladas * 0.25;
		double notaFinal = sumaAciertos - restaAciertos;
		
		 if (notaFinal <5) {
			System.out.println(notaFinal + " (Insuficiente)"); 
			
		} else if (notaFinal >= 5 && notaFinal < 6 ) {
			System.out.println(notaFinal + " (Suficiente)");
			
		} else if (notaFinal >= 6 && notaFinal < 7) {
			System.out.println(notaFinal + " (Bien)");
			
		} else if (notaFinal >= 7 && notaFinal < 9) {
			System.out.println(notaFinal + " (Notable)");
			
		} else if (notaFinal >= 9 && notaFinal == 10) {
			System.out.println(notaFinal + " (Sobresaliete)");
		}
	  }
	}

}
