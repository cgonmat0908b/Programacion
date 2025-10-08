/*Descripción: Aplicación de la clase Math en datos pedidos en pantalla
 * Fecha: 1/10/25
 * Autor: Cristian González Mateo
 */
package calculosSimples;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		double numero1, numero2;
		System.out.println("Introduce un número: ");
		numero1 = datos.nextDouble();
		
		System.out.println("Introduce otro número: ");
		numero2 = datos.nextDouble();
		
		double menor = Math.min(numero1, numero2);
		System.out.println("El menor es: " + menor);
		
		double potencia = Math.pow(numero1, numero2);
		System.out.println("La potencia de " + numero1 + "elevado a " + numero2 + "es: " + potencia);
		
		double raizCuadrada = Math.sqrt(numero1);
		System.out.println("El valor de la raiz cuadrada de " + numero1 + "es:" + raizCuadrada);
				
		double random = Math.random() * numero2;
		System.out.println("Un número aleatorio entre 0 y " + numero2 + "es: " + random);
		
	}

}
