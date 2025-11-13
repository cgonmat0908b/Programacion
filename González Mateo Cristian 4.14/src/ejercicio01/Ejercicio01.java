package ejercicio01;

import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que pida dos números reales por teclado
		 *  y muestre por pantalla elresultado de multiplicarlos. Implementa y utiliza la función:
 double multiplica(double a, double b) // Devuelve la multiplicación de dos números
		 */
		
		double numeroUno, numeroDos; 
		double resultado;
		Scanner datos = new Scanner (System.in);
		
		System.out.println("Introduce 1 numero real");
		numeroUno = datos.nextDouble();
		
		System.out.println("Introduce otro numero real");
		numeroDos = datos.nextDouble();
		
		resultado = multiplica(numeroUno, numeroDos);
		
		System.out.println("El resultado de multiplicar " + numeroUno + " " + numeroDos + " es " + resultado);

	}

	public static double multiplica (double num1, double num2) {
		return num1 * num2;
	}
}
