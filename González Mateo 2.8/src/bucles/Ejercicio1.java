/* Descripción:
 * Autor:
 * Fecha:
 */

package bucles;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int inicio = 1;
		int fin = 100;
		int acumulador = 0;
		while (acumulador < fin) {
			acumulador = inicio++;
			System.out.println(acumulador );
		}
		
	}
}