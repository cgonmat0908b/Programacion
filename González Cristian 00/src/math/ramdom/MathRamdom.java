package math.ramdom;

import java.util.Arrays;
import java.util.Scanner;

public class MathRamdom {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);
		// (int)(Math.random() * (max - min + 1)) + min

		/*
		 * Genera un número aleatorio entre 0 y 9 y muéstralo.

Genera un número aleatorio entre 1 y 6 (simular un dado).

Genera un número entre 1 y 100 y di si es par o impar.

Genera dos números entre 1 y 10 y muestra su suma.
		 */
		
		// 1
		int uno =(int) (Math.random() * 10);
		System.out.println(uno);
		
		// 2
		int dos = (int) ((Math.random() * 6) + 1);
		System.out.println(dos);
		
		// 3
		int tres = (int)((Math.random() * 100) +1);
		if((tres % 2) != 0) {
			System.out.println("Impar");
		}else {
			System.out.println("Par");
		}
		
		// 4
		int cuatro = (int)((Math.random() * 10) + 1);
		int cinco = (int)((Math.random() * 10) + 1);
		int suma = cuatro + cinco;
		
		System.out.println(suma);
		
		/*
		 * Nivel 2 – Lógica

Genera un número entre 1 y 10 y permite al usuario adivinarlo.

Genera 20 números entre 1 y 50 y cuenta cuántos son mayores que 25.

Genera números hasta que salga un 0.

Simula 100 lanzamientos de moneda (0 = cara, 1 = cruz).
		 */
		// 2.1
		
		int ran =(int) ((Math.random() * 10) + 1);
		int us;
		boolean num = false;
		do {
			System.out.println("Adivina el numero");
			us = datos.nextInt();
			if(us == ran) {
				num = true;
			}
		}while(num == false);
		
		
		// 2.2
		int[] nums = new int[20];
		int cont = 0;
		
		for(int i = 0; i < 20; i++) {
			nums[i] =(int) ((Math.random() * 50)+ 1);
			if(nums[i] > 25) {
				cont++;
			}
		}
		
		// 2.3
		int contCero = 0;
		boolean noCero = false;
		int cero;
		do {
			 cero = (int) (Math.random() * 2);
			 contCero++;
			 if(cero == 0) {
				 noCero = true;
			 }
			
		}while(noCero == false);
		System.out.println("Contador de numero antes del cero =" + contCero);
		
		// 2.4
		int[] cienNums = new int[100];
		for(int f = 0; f < 100; f++) {
			cienNums[f] = (int)(Math.random() * 2);
		}
		
		/*
		 * Nivel 3 – Aplicados

Simula un dado de 2 jugadores hasta que uno llegue a 20 puntos.

Genera una contraseña de 8 dígitos numéricos.

Genera 5 números distintos entre 1 y 50 (tipo lotería).

Simula un juego de piedra, papel o tijera.
		 */
		
		// 3.1
		int dado1 = (int) ((Math.random() * 6) + 1);
		int dado2 = (int) ((Math.random() * 6) + 1);
		do {
			dado1 = dado1 + (int) ((Math.random() * 6) + 1);
			dado2 = dado2 + (int) ((Math.random() * 6) + 1);
			
		}while(dado1 < 20 && dado2 < 20);
		
		// 3.2
		int[] digitos = new int[8];
		String contraseña = "";
		for(int x = 0; x <8; x++) {
			digitos[x] = (int) (Math.random() *10);
			contraseña = contraseña + digitos[x];
		}
		System.out.println(contraseña);
		
		// 3.3
		int[] cincoDiff = new int[5];
		int con = 0;
		for(int e = 0; e < 5; e++) {
			con = 0;
			cincoDiff[e] =(int) ((Math.random() * 50) + 1);
			
			while(con < e) {
				if(cincoDiff[e] == cincoDiff[con]) {
					cincoDiff[e] =(int) ((Math.random() * 50) + 1);
					con = 0;
				}else {
					con++;
				}
			}
			
			
		}
		
		for(int j = 0; j < 5; j++) {
			System.out.println(cincoDiff[j]);
		}
		
		// 3.4
		String[] jugada = {"Piedra","Papel","Tijera"};
		
		int[] numeros = new int[3];
		numeros[0] =(int) (Math.random() * 3);
		numeros[1] =(int) (Math.random() * 3);
		numeros[2] =(int) (Math.random() * 3);
		
		String jugador1 = jugada[numeros[0]];
		String jugador2 = jugada[numeros[1]];
		String jugador3 = jugada[numeros[2]];
		
		System.out.println(jugador1);
		System.out.println(jugador2);
		System.out.println(jugador3);
		
		
		
		/*
		 * Nivel 4 – Pensamiento matemático

Calcula el promedio de 1000 números aleatorios entre 1 y 10.

Estima π usando el método de Monte Carlo.

Simula un casino: saldo inicial 100€, apuesta aleatoria hasta perder todo.
		 */
		
		// 4.1 Casino all in
		int[] milNums = new int[1000];
		int prom = 0;
		for(int l = 0; l < milNums.length; l++) {
			milNums[l] = (int) ((Math.random() * 10) + 1);
			prom = prom + milNums[l];
			
		}
		prom = prom / milNums.length;
		System.out.println("El promedio es: " + prom);
		
		
		// 4.2
		double saldoIni = 100;
		int[] premios = new int[10];
		int vecesJugadas = 0;
		premios[0] = 0;
		premios[1] = 0;
		premios[2] = 0;
		premios[3] = 1;
		premios[4] = 1;
		premios[5] = 1;
		premios[6] = 2;
		premios[7] = 2;
		premios[8] = 5;
		premios[9] = 10;
		
		do {
			saldoIni = saldoIni * (premios[(int) (Math.random() * 10)]);
			vecesJugadas++;
			
		}while(saldoIni != 0);
		
		System.out.println("Tras jugar " + vecesJugadas + " veces, te has quedado a cero, ludopata");
		
		
		// Rellenar matriz 3x12 con valores entre 1000 y 20 000 y solo multiplos de 500
		int[][] matrizRandom = new int[3][12];
		for(int i = 0; i < matrizRandom.length; i++) {
			for(int f = 0; f < matrizRandom[i].length; f++) {
				// Esto es a fuerza bruta
				do {
					matrizRandom[i][f] = (int) ((Math.random() * (20000 - 1000 + 1)) + 1000); // Genera un numero del 1000 al 20000
				}while(matrizRandom[i][f] % 500  != 0); // Lo genera continuamente mientras que no sea multiplo de 500
				
			}
		}
		
		// Rellenar matriz 3x12 con valores entre 1000 y 20 000 y solo multiplos de 500
		// De manera lógica, no a fuerza bruta:
		
		// Cuando nos piden generar un numero aleatorio entre un rango y con una condición
		// de ser multiplo de X numero, existen 4 parametros comunes:
		
		// El paso: el paso se refiere al numero multiplo que es la condicion
		// Para conocer el paso, pienso, cuanto he de sumar a un numero valido, para conseguir el siguiente
		// Si me pide un numero entre 1000 y 10000 multiplo de 50, este caso se da cada vez que sumo 50
		// por ejemplo 1050 1100 1150... entonces el paso en este caso es 50
		
		// Indice minimo: Este es dado al dividir el minimo entre el paso, y consiste en el numero de posibilidades
		// de generación de un numero que cumple con las caracteristicas de ser su multiplo
		
		// Indice maximo: Este es dado al dividir el maximo entre el paso y consistes en el numero de posibilidades
		// de un numero que cumple con las caracteristicas de ser su multiplo
		
		// Cantidad: Este es dado al restar indiciMax - indiceMin + 1,consiste en el total de posibilidades 
		// de multiplos entre el numero menor y el numero mayor + 1 para evitar multiplicar por 0
		
		// EJERCICIO AUTODIDACTA:
		// Rellenar un array con valores entre 2000 y 5000 que sean multiplos de 1000
		
		int paso = 1000;
		int indiceMin = 2000 / paso;
		int indiceMax = 5000 / paso;
		int cantidad = indiceMax - indiceMin + 1;
		
		// Para realizar la generacion de esto valores seria así:
		// int a = paso * (indiceMin + (int)(Math.random() * cantidad));
		
		for(int i = 0; i < matrizRandom.length; i++) {
			for(int f = 0; f < matrizRandom[i].length; f++) {
				matrizRandom[i][f] = paso * (indiceMin + (int)(Math.random() * cantidad));
				System.out.println(matrizRandom[i][f]);
			}
		}
		
		
		
	}


}
