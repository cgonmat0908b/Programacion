package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1TrataExcepciones {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int entero;
		boolean correcto = false;
		
		do{
			System.out.println("Introduce un entero");
			
			try {
				datos.close();
				entero = datos.nextInt();
				correcto = false;
				
			}catch (InputMismatchException exTipoDiferente) {
				correcto = true;
				System.err.println("Valor no entero, intentelo de nuevo:");
				datos.next();
				entero = 0;

			}catch(RuntimeException ex1){
				correcto = true;
				System.out.println("No se puede acceder a la consola");
				entero = 0;
				datos.next();
			}

		}while(correcto == true);
		
		System.out.println("El numero itroducido es " + entero);
	}

}
