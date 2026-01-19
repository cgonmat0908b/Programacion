package ejercicio1;

public class Main_Punto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En el main de la clase principal instancia 3 objetos Punto con las coordenadas (5,0), (10,10) y (-3, 7).
		 */
		
		// Objeto 1
		Punto punto1 = new Punto(0,5);
		
		// Objeto 2
		Punto punto2 = new Punto(10,10);

		// Objeto 3
		Punto punto3 = new Punto(-3,7);
		
		
		// Mostrar por pantalla las coordenadas
		
		System.out.printf("Las coordenadas del punto1 son: x = %d y = %d %n", punto1.getX(),punto1.getY());
		System.out.printf("Las coordenadas del punto2 son: x = %d y = %d %n", punto2.getX(),punto2.getY());
		System.out.printf("Las coordenadas del punto3 son: x = %d y = %d %n", punto3.getX(),punto3.getY());
		
		//Modificación de coordenadas
		punto1.setX(punto1.getX() + 54);
		punto1.setY(punto1.getY() + 10);
		
		punto2.setX(punto2.getX() - 7000);
		punto2.setY(punto1.getY());
		
		punto3.setX(punto3.getX() - 14 + 8);
		punto3.setY(punto3.getY() * 54);
		
		System.out.printf("Las coordenadas del punto1 tras modificar son: x = %d y = %d %n", punto1.getX(),punto1.getY());
		System.out.printf("Las coordenadas del punto2 tras modificar son: x = %d y = %d %n", punto2.getX(),punto2.getY());
		System.out.printf("Las coordenadas del punto3 tras modificar son: x = %d y = %d %n", punto3.getX(),punto3.getY());
		
		
	}

}
