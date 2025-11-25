package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		
		/*Crea un método llamado comparaNombres, el cual devolverá el booleano true en el caso de 
que los dos nombres introducidos como parámetros sean iguales y false en caso contrario.
		 * 
		 */
		
		Scanner datos = new Scanner(System.in);
		
		String nom1, nom2;
		boolean igual;
		
		System.out.println("Introduce un nombre");
		nom1 = datos.nextLine();
		
		System.out.println("Introduce un nombre");
		nom2 = datos.nextLine();
		
		igual = comparaNombres(nom1,nom2);
		
		if(igual == true) {
			System.out.println("Los nombres introducidos son iguales");
			
		}else {
			System.out.println("Los nombres introducidos no son iguales");
		}
	}

	public static boolean comparaNombres(String nomb1, String nomb2) {
		boolean igual = false;
		
		if(nomb1.equals(nomb2)) {
			igual = true;
		}
		return igual;
	}
}
