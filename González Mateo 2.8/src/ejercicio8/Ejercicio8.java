/* Descripción:
 * Programa que solicita información personal y sobre caminatas de un usuario,
 * calcula la distancia media de las últimas 5 caminatas y determina la caminata más larga y su ciudad.
 * Autor: Cristian González Mateo
 * Fecha: 10/10/25
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		String nombre, apellidos, ciudadRuta, ciudadRutaMax = "Desconocido"; // Datos personales y ciudad de la caminata más larga
		byte edad, numRutas, caminatasCinco, numParticipantes; // Edad, número de rutas y participantes
		float distUltRuta, distCaminata, maxDistCaminata = 0, acumuladorCaminatas = 0; // Distancias
		
		System.out.println("Introduce tu nombre");
		nombre = datos.nextLine(); // Nombre del participante
		
		System.out.println("Introduce tus apellidos");
		apellidos = datos.nextLine(); // Apellidos del participante
		
		System.out.println("Introduce tu edad");
		edad = datos.nextByte(); // Edad del participante
		
		// Comprueba que la edad sea válida para participar
		while (edad < 17 || edad > 45) {
			System.out.println("La edad introducida no es correcta, solo puedes participar si tienes entre 17 y 45 años, intentalo de nuevo");
			edad = datos.nextByte();
		}
		
		System.out.println("Introduce el numero de rutas realizadas");
		numRutas = datos.nextByte(); // Número de rutas realizadas
		
		System.out.println("Introduce la distancia de la ultima ruta realizada en Km");
		distUltRuta = datos.nextFloat(); // Distancia de la última ruta
		
		System.out.println("Introduce los siguientes datos de tus ultima 5 caminatas:");
		
		// Bucle para introducir datos de las últimas 5 caminatas
		for (caminatasCinco = 0; caminatasCinco < 5; caminatasCinco++) {
			
			System.out.println("Distancia de la caminata en km:");
			distCaminata = datos.nextFloat(); // Distancia de la caminata actual
			acumuladorCaminatas = acumuladorCaminatas + distCaminata; // Acumula distancias para calcular la media
			
			System.out.println("Numero de participantes de la caminata:");
			numParticipantes = datos.nextByte(); // Número de participantes
			
			datos.nextLine(); 
			
			System.out.println("Ciudad en la que se realizó la caminata:");
			ciudadRuta = datos.nextLine(); // Ciudad de la caminata actual
			
			// Determina si esta caminata es la más larga
			if (maxDistCaminata < distCaminata) {
				maxDistCaminata = distCaminata;
				ciudadRutaMax = ciudadRuta;
			}
		}
		
		acumuladorCaminatas = acumuladorCaminatas / 5; // Calcula la distancia media
		
		// Muestra los resultados finales
		System.out.println("---------------------------------------------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Número de rutas realizadas: " + numRutas);
		System.out.println("Distancia media (5 últimas rutas): " + acumuladorCaminatas);
		System.out.println("Distancia más larga de las últimas 5 rutas: " + maxDistCaminata);
		System.out.println("Ciudad de la ruta más larga: " + ciudadRutaMax);
		System.out.println("---------------------------------------------------------");
	}
}
