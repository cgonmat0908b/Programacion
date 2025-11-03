package formatedoDeCadenas;

import java.util.Scanner;

public class FormateoDeCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner datos = new Scanner (System.in);
		
		String nombre = "Juan";
		int edad = 34;
		double altura = 1.87;
		double peso = 75.4;
		
		double imc = peso / Math.pow(altura, 2);
		
		String cadena = String.format("Nombre: %s ** Edad: %d ** Altura: %.2f ** Peso: %.2f ** IMC: %.4f", nombre, edad, altura, peso, imc);
		System.out.println(cadena);
		
		System.out.printf("Nombre: %s ** Edad: %d ** Altura: %.2f ** Peso: %.2f ** IMC: %.4f", nombre, edad, altura, peso, imc);

	}

}
