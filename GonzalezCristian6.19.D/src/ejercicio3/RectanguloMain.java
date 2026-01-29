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
		Rectangulo rectangulo2;
		try{
			rectangulo2 = new Rectangulo(7,9,2,3);
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			rectangulo2 = new Rectangulo(1,1,1,1);
		}
		
		// Muestra de coordenadas perímetros y áreas
		
		System.out.printf("Las coordenadas del Rectangulo1 son: (%d,%d),(%d,%d) %n", rectangulo1.getX1(), rectangulo1.getY1(), rectangulo1.getX2() ,rectangulo1.getY2());
		System.out.printf("El perimetro del Rectangulo1 es: %d %n", Perimetro(Lado(rectangulo1.getX2(), rectangulo1.getX1() ),Lado(rectangulo1.getY2(), rectangulo1.getY1())));
		System.out.printf("El area del Rectangulo1 es: %d %n", Area(Lado(rectangulo1.getX2(), rectangulo1.getX1()),Lado(rectangulo1.getY2(), rectangulo1.getY1())));
		
		System.out.printf("Las coordenadas del Rectangulo2 son: (%d,%d),(%d,%d) %n", rectangulo2.getX1(), rectangulo2.getY1(), rectangulo2.getX2() ,rectangulo2.getY2());
		System.out.printf("El perimetro del Rectangulo2 es: %d %n", Perimetro(Lado(rectangulo2.getX2(), rectangulo2.getX1() ),Lado(rectangulo2.getY2(), rectangulo2.getY1())));
		System.out.printf("El area del Rectangulo2 es: %d %n", Area(Lado(rectangulo2.getX2(), rectangulo2.getX1()),Lado(rectangulo2.getY2(), rectangulo2.getY1())));
		
		// Modificación de coordenadas
		
		rectangulo1.setX2(rectangulo1.getX2() + 20);
		rectangulo1.setY2(rectangulo1.getY2() + 7);
		
		rectangulo1.setX1(rectangulo1.getX1() + 5);
		rectangulo1.setY1(rectangulo1.getY1() + 5);
			
		
		System.out.printf("Las coordenadas del Rectangulo1 son: (%d,%d),(%d,%d) %n", rectangulo1.getX1(), rectangulo1.getY1(), rectangulo1.getX2() ,rectangulo1.getY2());
		System.out.printf("El perimetro del Rectangulo1 es: %d %n", Perimetro(Lado(rectangulo1.getX2(), rectangulo1.getX1() ),Lado(rectangulo1.getY2(), rectangulo1.getY1())));
		System.out.printf("El area del Rectangulo1 es: %d %n", Area(Lado(rectangulo1.getX2(), rectangulo1.getX1()),Lado(rectangulo1.getY2(), rectangulo1.getY1())));
		
		
		rectangulo2.setX2(rectangulo2.getX2() * 3);
		rectangulo2.setY2(rectangulo2.getX2() + 5);
		
		rectangulo2.setX1(rectangulo2.getX1() / 7);
		rectangulo2.setY1(rectangulo2.getY1() * 4);
		
		System.out.printf("Las coordenadas del Rectangulo2 son: (%d,%d),(%d,%d) %n", rectangulo2.getX1(), rectangulo2.getY1(), rectangulo2.getX2() ,rectangulo2.getY2());
		System.out.printf("El perimetro del Rectangulo2 es: %d %n", Perimetro(Lado(rectangulo2.getX2(), rectangulo2.getX1() ),Lado(rectangulo2.getY2(), rectangulo2.getY1())));
		System.out.printf("El area del Rectangulo2 es: %d %n", Area(Lado(rectangulo2.getX2(), rectangulo2.getX1()),Lado(rectangulo2.getY2(), rectangulo2.getY1())));
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
