/* Descripción:
 * Autor:
 * Fecha:
 */

package bucles;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int inicio = 100;
		int fin = 1;
		int acumulador = 0;
		do {
			acumulador = inicio--;
			System.out.println(acumulador);
		}while (acumulador > fin);
	

	}
}
