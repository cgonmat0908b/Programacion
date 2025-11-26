package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * Crea un método posicionJugador.
		 * 
		 *  Este método recibe como parámetro un número entero y devuelve una cadena de texto.
		 *  
 Comprobaremos que el número se encuentra entre 1 y 16, en caso contrario devolveremos un 
mensaje: 
Número introducido incorrecto.

 El programa asigna una posición en un hipotético campo de juego en función del número 
recibido:

 1-Portero, 
 
del 2 al 5 defensas, 

6 al 8 centrocampistas, 

del 9 al 11 delanteros, 

del 12 al 16 suplentes.

 El programa pedirá el nombre al usuario de forma que el mensaje sea:
 
 Luis, con el dorsal 8 juega el próximo partido como centrocampista
		 */
		
		Scanner datos = new Scanner(System.in);
		String nombre;
		int num;
		
		System.out.println("Introduce tu nombre:");
		nombre = datos.next();
		
		System.out.println("Introduce tu numero de dorsal:");
		num = datos.nextInt();
		
		if(posicionJugador(num).equals("Número introducido incorrecto")){
			System.out.println(posicionJugador(num));
			
		} else {
			System.out.println(nombre + " con el dorsal " + num + " juega el próximo partido como " + posicionJugador(num));
			
		}
	}

	public static String posicionJugador(int posi) {
		String posicion = "desconocida";
		
		if(posi > 16 || posi < 1) {
			posicion = "Número introducido incorrecto";
			
		}else if(posi == 1) {
			posicion = "portero";
			
		}else if (posi > 1 && posi < 6) {
			posicion = "defensa";
			
		}else if (posi > 5 && posi < 9) {
			posicion = "centrocampista";
			
		}else if (posi > 8 && posi < 12) {
			posicion = "delantero";
			
		}else if (posi > 11 && posi < 17) {
			posicion = "suplente";
			
		}
		
		return posicion;
		
	}
}
