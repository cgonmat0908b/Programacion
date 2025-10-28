/*Descripción: Programa que soluciona una ecuación de segundo grado
 * Fecha: 28/10/25
 * Autor: Cristian González Mateo
 */
package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).
		 */
		
		int a,b,c;
		double discriminante,x1,x2,parteReal,parteImaginaria;
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Para resolver la ecuación introduce datos con este formato: ax2+ bx + c = 0");
		
		System.out.println("Introduce a");
		a = datos.nextInt();
		
		
		System.out.println("Introduce b");
		b = datos.nextInt();
		
		System.out.println("Introduce c");
		c = datos.nextInt();
		
		 // Cálculo del discriminante
        discriminante = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado (a = 0).");
            
        } else if (discriminante > 0) {
            // Dos soluciones reales y diferentes
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La ecuación tiene dos soluciones reales:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            
        } else if (discriminante == 0) {
            // Una única solución real
            x1 = -b / (2.0 * a);
            System.out.println("La ecuación tiene una única solución real:");
            System.out.println("x = " + x1);
            
        } else {
            // Soluciones complejas (no reales)
            parteReal = -b / (2.0 * a);
            parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("La ecuación tiene soluciones complejas:");
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }
	}

}
