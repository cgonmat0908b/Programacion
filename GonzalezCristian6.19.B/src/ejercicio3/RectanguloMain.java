package ejercicio3;

import java.math.MathContext;

public class RectanguloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5) y (7,9)(2,3).
Muestra por pantalla sus coordenadas, perímetros (suma de lados) y áreas (ancho x alto).

Modifica todas las coordenadas como consideres y vuelve a imprimir coordenadas, perímetros y
áreas
		 */
		
		//Instanciación de 2 objetos Rectangulo
		
		Rectangulo rectangulo1 = new Rectangulo(0,0,5,5);
		
		try{
			Rectangulo rectangulo2 = new Rectangulo(7,9,2,3);
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			
		}
		Rectangulo rectangulo2 = new Rectangulo(1,1,1,1);
		
		// Muestra de coordenadas perímetros y áreas
		
		System.out.printf("Las coordenadas del Rectangulo1 son: (%d,%d),(%d,%d) %n", rectangulo1.x1, rectangulo1.y1, rectangulo1.x2 ,rectangulo1.y2);
		System.out.printf("El perimetro del Rectangulo1 es: %d %n", Perimetro(Lado(rectangulo1.x2, rectangulo1.x1 ),Lado(rectangulo1.y2, rectangulo1.y1)));
		System.out.printf("El area del Rectangulo1 es: %d %n", Area(Lado(rectangulo1.x2, rectangulo1.x1 ),Lado(rectangulo1.y2, rectangulo1.y1)));
		
		System.out.printf("Las coordenadas del Rectangulo2 son: (%d,%d),(%d,%d) %n", rectangulo2.x1, rectangulo2.y1, rectangulo2.x2 ,rectangulo2.y2);
		System.out.printf("El perimetro del Rectangulo2 es: %d %n", Perimetro(Lado(rectangulo2.x1, rectangulo2.x2), Lado(rectangulo2.y1, rectangulo2.y2)));
		System.out.printf("El area del Rectangulo2 es: %d %n", Area(Lado(rectangulo2.x1,rectangulo2.x2),Lado(rectangulo2.y1, rectangulo2.y2)));
		
		// Modificación de coordenadas
		
		rectangulo1.x1 = rectangulo1.x1 + 5;
		rectangulo1.y1 = rectangulo1.y1 + 5;
		
		rectangulo1.x2 = rectangulo1.x2 - 2;
		rectangulo1.y2 = rectangulo1.y2  + 7;
		
		System.out.printf("Las coordenadas del Rectangulo1 son: (%d,%d),(%d,%d) %n", rectangulo1.x1, rectangulo1.y1, rectangulo1.x2 ,rectangulo1.y2);
		System.out.printf("El perimetro del Rectangulo1 es: %d %n", Perimetro(Lado(rectangulo1.x2, rectangulo1.x1 ),Lado(rectangulo1.y2, rectangulo1.y1)));
		System.out.printf("El area del Rectangulo1 es: %d %n", Area(Lado(rectangulo1.x2, rectangulo1.x1 ),Lado(rectangulo1.y2, rectangulo1.y1)));
		
		
		rectangulo2.x1 = rectangulo2.x1 / 7; 
		rectangulo2.y1 = rectangulo2.y1 * 4;
		
		rectangulo2.x2 = rectangulo2.x2 * 3 ;
		rectangulo2.y2 = rectangulo2.y2 + 5;
		
		System.out.printf("Las coordenadas del Rectangulo2 son: (%d,%d),(%d,%d) %n", rectangulo2.x1, rectangulo2.y1, rectangulo2.x2 ,rectangulo2.y2);
		System.out.printf("El perimetro del Rectangulo2 es: %d %n", Perimetro(Lado(rectangulo2.x1, rectangulo2.x2), Lado(rectangulo2.y1, rectangulo2.y2)));
		System.out.printf("El area del Rectangulo2 es: %d %n", Area(Lado(rectangulo2.x1,rectangulo2.x2),Lado(rectangulo2.y1, rectangulo2.y2)));
	}

	public static int Perimetro(int ancho, int alto) {
		int perim;
		
		perim = (ancho * 2) + alto * 2;
		
		return perim;
		
	}
	public static int Area(int ancho, int alto) {
		int area; 
		
		area = ancho * alto;
		
		return area;
		
	}
	
	public static int Lado(int coordenada1, int coordenada2) {
		int lado;
		lado = Math.abs(coordenada1 - coordenada2);
		return lado;
	}
	
}
