/* Descripción:
 * Autor:
 * Fecha:
 */

package bucles;

import java.util.Scanner;

public class Ejercicio4{

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce un numero, cuando introduzcas 0 no podras introducir más");
		int numero = datos.nextInt();
		int contador = 0;
		int acumulador = 0;
		acumulador = numero;
		
		while (numero != 0) {
			System.out.println("Introduce otro número o 0 si quieres parar");
			numero = datos.nextInt();
			contador = contador + 1;
			acumulador = numero + acumulador;
			
		}
		int media = acumulador / contador;
		System.out.println("La media de los número sumados: " + media );
		System.out.println("Has introducido " + contador + " numeros");
		
	} 
}