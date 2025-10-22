package arrayPruebas;

import java.util.Scanner;

public class ArrayPruebas {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String[] años = {"dosmil veinticinco", "dosmil veinticuatro", "dosmill veintitres"};
		String añoIntroducido;
		
		int[] numeros = new int [10];
		System.out.println("Introduce un número");
		numeros [0] = datos.nextInt();
		numeros [1] = 395;
		numeros [3] = 45;
		
		
		if (numeros [0] > numeros [1]) {
			System.out.println(numeros[0] + " es mayor que " + numeros [1]);
			
			datos.nextLine();
			
			System.out.println("Introduce un año entre 2025 y 2023, en letras");
			añoIntroducido = datos.nextLine();
			
			if (añoIntroducido.equals(años[0])) {
				System.out.println("Año actual");
			}
			
			else if (añoIntroducido == años[1]) {
					System.out.println("Año p");
					
			}
			else {
				System.out.println("Hace 2 años");
		    }
	
		}

	}

}
