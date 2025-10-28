/* Descripción:
 * Programa que actúa como una calculadora básica: solicita dos números y una operación,
 * realiza la operación seleccionada y muestra el resultado.
 * Autor: Cristian González Mateo
 * Fecha: 12/10/25
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		int num1 = datos.nextInt(); // Se guarda el primer número
		
		System.out.println("Introduce otro numero");
		int num2 = datos.nextInt(); // Se guarda el segundo número
		
		System.out.println("Indique la operación que quiere realizar(Inserte un número): ");
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multipliación");
		System.out.println("(4) División");
		int eleccion = datos.nextInt(); // Se guarda la elección del usuario
		
		// Verifica que la elección esté dentro del rango válido
		if (eleccion < 1 || eleccion > 4) {
			System.out.println("Elección incorrecta");
		}else if (eleccion == 1 ) {
			int suma = num1 + num2; // Operación de suma
			System.out.println("Resultado: " + suma );
		}else if (eleccion == 2) {
			int resta = num1 - num2; // Operación de resta
			System.out.println("Resultado; " + resta);
		}else if (eleccion == 3 ) {
			int multiplicacion = num1 * num2; // Operación de multiplicación
			System.out.println("Resultado: " + multiplicacion);
		}else {
			int division = num1 / num2; // Operación de división entera
			System.out.println("Resultado: " + division);
		}

	}
}
