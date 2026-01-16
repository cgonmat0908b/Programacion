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
		
		System.out.printf("Las coordenadas del punto1 son: x = %d y = %d %n", punto1.x,punto1.y);
		System.out.printf("Las coordenadas del punto2 son: x = %d y = %d %n", punto2.x,punto2.y);
		System.out.printf("Las coordenadas del punto3 son: x = %d y = %d %n", punto3.x,punto3.y);
		
		//Modificación de coordenadas
		punto1.x = punto1.y + 54;
		punto1.y = punto1.x + 10;
		
		punto2.x = punto2.x - 7000;
		punto2.y = punto1.y;
		
		punto3.x = punto3.x - 14 + 8;
		punto3.y = punto3.y * 54;
		
		System.out.printf("Las coordenadas del punto1 tras modificar son: x = %d y = %d %n", punto1.x,punto1.y);
		System.out.printf("Las coordenadas del punto2 tras modificar son: x = %d y = %d %n", punto2.x,punto2.y);
		System.out.printf("Las coordenadas del punto3 tras modificar son: x = %d y = %d %n", punto3.x,punto3.y);
		
		
	}

}
