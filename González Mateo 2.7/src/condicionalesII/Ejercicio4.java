package condicionalesII;

import java.util.Scanner;

public class Ejercicio4{

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce tu nota de programacaión");
		double notaProg = datos.nextDouble();
		
		System.out.println("Introduce tu nota de base de datos");
		double notaBD= datos.nextDouble();
		
		System.out.println("Introduce tu nota de lenguaje de marcas");
		double notaLM= datos.nextDouble();
		
		System.out.println("Introduce tu nota de sistemas informaticos");
		double notaSI= datos.nextDouble();
		
		double notaMedia = (notaProg + notaBD + notaLM + notaSI) / 4;
		
		if (notaMedia > 10 || notaMedia < 0) {
			System.out.println("Alguna nota ha sido introducida incorrectamente");
		}else {
			
		double redondeoAlza = Math.ceil(notaMedia);
		System.out.println("Tu nota media redondeada a la alza es: " + redondeoAlza);
		double redondeoBaja = Math.floor(notaMedia);
		System.out.println("Tu nota media redondeada a la baja es: " + redondeoBaja);
		
		if (redondeoAlza > 8 || redondeoBaja > 8) {
			System.out.println("Enhorabuena, tiene acceso a estudios superiores");
		}else {
			System.out.println("Lo lamentamos, no tiene acceso a estuidos superiores");
		}		
	  }	
	} 
}