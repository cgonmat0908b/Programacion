/* Descripción: Entrada de dos números y comprobar si es mayor, menor o igual
 * Autor: Cristian González Mateo
 * Fecha: 06/10/25
 */
package ejercicio06;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); // Se crea un objeto Scanner para leer datos del usuario
		
		int contadorNegativos = 0;
		int numIntroducido;
		int contador = 0;
		
			do {
				System.out.println("Introduce hasta 100 numeros no nulos ");
			    numIntroducido = datos.nextInt();
			    
				if (numIntroducido > 0) {
				contador++;
			
			}else if (numIntroducido < 0){
				contador++;
				contadorNegativos++;
				
			}else {
				System.out.println("El numero introducido es 0, no cuenta, introduce otro");
				
			}
		}while (contador < 100);	
			
		if (contadorNegativos == 0) {
			System.out.println("No has introducido ningun número negativo");
			
		}else {
			System.out.println("Has introducido " + contadorNegativos + " numeros negativos");

		}
			
	}

}