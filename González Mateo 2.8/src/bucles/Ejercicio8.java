/* Descripción:En primer lugar, se solicitarán al usuario una serie de datos:
 Nombre
 Apellidos
 Edad (se controlará que la edad introducida sea superior a 17 y menor a 45,
mientras no introduzca un valor correcto mostraremos el mensaje “Esa edad no es
correcta” y volveremos a preguntar.
 Número rutas realizadas
 Distancia última ruta
A partir de estos datos el sistema solicitará que introduzca los datos de una serie de 5
caminatas. Se pedirá de cada caminata:
 Distancia
 Número de participantes
 Ciudad
Tras los 5 registros tendremos que ser capaces de mostrar por pantalla los siguientes
resultados en la siguiente ficha:
Página 2 de 3
Programación: Estructuras básicas de control
---------------------------------------------------------
Nombre:
Edad:
Número de rutas realizadas:
Distancia media (5 últimas rutas):
Distancia más larga de las últimas 5 rutas:
Ciudad de la ruta más larga:
---------------------------------------------------------
 * Autor:
 * Fecha:
 */

package bucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		String nombre, apellidos, ciudadRuta, ciudadRutaMax = "Desconocido";
		byte edad, numRutas, caminatasCinco, numParticipantes;
		float distUltRuta, distCaminata, maxDistCaminata = 0, acumuladorCaminatas = 0;
		
		
		
		System.out.println("Introduce tu nombre");
		nombre = datos.nextLine();
		
		System.out.println("Introduce tus apellidos");
		apellidos = datos.nextLine();
		
		System.out.println("Introduce tu edad");
		edad = datos.nextByte();
		
		while (edad < 17 || edad > 45) {
			System.out.println("La edad introducida no es correcta, solo puedes participar si tienes entre 17 y 45 años, intentalo de nuevo");
			edad = datos.nextByte();
		}
		
		System.out.println("Introduce el numero de rutas realizadas");
		numRutas = datos.nextByte();
		
		System.out.println("Introduce la distancia de la ultima ruta realizada en Km");
		distUltRuta = datos.nextFloat();
		
		System.out.println("Introduce los siguientes datos de tus ultima 5 caminatas:");
		
		for (caminatasCinco = 0; caminatasCinco < 5; caminatasCinco++) {
			
			System.out.println("Distancia de la caminata en km:");
			distCaminata = datos.nextFloat();
			acumuladorCaminatas = acumuladorCaminatas + distCaminata;
			
			System.out.println("Numero de participantes de la caminata:");
			numParticipantes = datos.nextByte();
			
			datos.nextLine();
			
			System.out.println("Ciudad en la que se realizó la caminata:");
			ciudadRuta = datos.nextLine();
			
			if (maxDistCaminata < distCaminata) {
				maxDistCaminata = distCaminata;
				ciudadRutaMax = ciudadRuta;
			}
		}
		acumuladorCaminatas = acumuladorCaminatas / 5;
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Número de rutas realizadas: " + numRutas);
		System.out.println("Distancia media (5 últimas rutas): " + acumuladorCaminatas);
		System.out.println("Distancia más larga de las últimas 5 rutas: " + maxDistCaminata);
		System.out.println("Ciudad de la ruta más larga: " + ciudadRutaMax);
		System.out.println("---------------------------------------------------------");
	}
}