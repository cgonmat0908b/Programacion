/*Descripción: Programa que mostrara la secuencia de fibonacci partiendo desde el número introducido por el usuario
 * Fecha: 28/10/25
 * Autor: Cristian González Mateo
 */

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que muestre los N primeros números de la secuencia de fibonacci.
La secuencia de fibonacci comienza por 1, 1, y a continuación cada valor es la suma de
los dos valores anteriores: 1, 1, 2, 3, 5, 8, 13… El valor N lo introduce el usuario.

		 */
		
		Scanner datos = new Scanner(System.in);
		long a = 1; // primer número de Fibonacci
        long b = 1; // segundo número de Fibonacci
        long siguiente;

        System.out.println("Introduce un número");
        int num = datos.nextInt();

        if (num <= 0) {
            System.out.println("Introduce un número mayor que 0");
        }

        System.out.println("La secuencia es:");

        for (int i = 1; i <= num; i++) {
            if (i == num) {
                System.out.print(a); // último número sin coma
            } else {
                System.out.print(a + ",");
            }

            siguiente = a + b; // calculamos el siguiente número
            a = b;                 // desplazamos a
            b = siguiente;          // desplazamos b
        }

    }
}
