/* Descripción:
 * Autor:
 * Fecha:
 */
package condicionalesII;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		int num1 = datos.nextInt();
		
		System.out.println("Introduce otro numero");
		int num2 = datos.nextInt();
		
		System.out.println("Indique la operación que quiere realizar(Inserte un número): ");
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multipliación");
		System.out.println("(4) División");
		int eleccion = datos.nextInt();
		
		if (eleccion < 1 || eleccion > 4) {
			System.out.println("Elección incorrecta");
		}else if (eleccion == 1 ) {
			int suma = num1 + num2;
			System.out.println("Resultado: " + suma );
		}else if (eleccion == 2) {
			int resta = num1 - num2;
			System.out.println("Resultado; " + resta);
		}else if (eleccion == 3 ) {
			int multiplicacion = num1 * num2;
			System.out.println("Resultado: " + multiplicacion);
		}else {
			int division = num1 / num2;
			System.out.println("Resultado: " + division);
		}

	}
}