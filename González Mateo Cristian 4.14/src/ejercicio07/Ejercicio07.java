package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
 su perímetro. Implementa y utiliza las funciones:
 double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
 double areaRectangulo(double ancho, double alto) // Devuelve el área
		 */
		
		double ancho,alto;
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce el ancho de un rectángulo");
		ancho = datos.nextDouble();
		
		System.out.println("Introduce el alto de un rectángulo");
		alto = datos.nextDouble();
		
		System.out.println("El perimetro del rectangulo es " + perimetroRectangulo(ancho, alto));
		System.out.println("El area del rectangulo es " + areaRectangulo(ancho, alto));
		
	}

	public static double perimetroRectangulo (double ancho, double alto) {
		double perimetro;
		
		perimetro = (ancho * 2) + (alto * 2);
		return perimetro;
		
	}
	public static double areaRectangulo (double ancho, double alto) {
		double area;
		area = ancho * alto;
		return area;
	}
}
