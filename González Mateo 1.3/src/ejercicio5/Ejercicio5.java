/*Descripción: Aplicación de la clase Math en datos pedidos en pantalla para realizar potencia, raíz cuadrada y un número aleatorio.
 * Fecha: 1/10/25
 * Autor: Cristian González Mateo
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		double numero1, numero2;
		System.out.println("Introduce un número: ");
		numero1 = datos.nextDouble(); // Lee el primer número introducido por el usuario
		
		System.out.println("Introduce otro número: ");
		numero2 = datos.nextDouble(); // Lee el segundo número introducido por el usuario
		
		double menor = Math.min(numero1, numero2); // Obtiene el menor de los dos números
		System.out.println("El menor es: " + menor);
		
		double potencia = Math.pow(numero1, numero2); // Calcula la potencia del primero elevado al segundo
		System.out.println("La potencia de " + numero1 + " elevado a " + numero2 + " es: " + potencia);
		
		double raizCuadrada = Math.sqrt(numero1); // Calcula la raíz cuadrada del primer número
		System.out.println("El valor de la raiz cuadrada de " + numero1 + " es: " + raizCuadrada);
				
		int random = (int) (Math.random() * numero2); // Genera un número aleatorio entre 0 y numero2
		System.out.println("Un número aleatorio entre 0 y " + numero2 + " es: " + random);
		
	}

}