/* Descripción:
 * Programa que solicita una nota numérica y muestra su calificación equivalente en texto.
 * Autor: Cristian González Mateo
 * Fecha: 12/10/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3{

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce una nota"); 
		int nota = datos.nextInt(); // Se guarda la nota introducida por el usuario
		
		String notaTexto = null; // Variable para almacenar la calificación en texto
       
		// Estructura switch para determinar la calificación según la nota
		switch (nota){
		
		case 0:{
			notaTexto = "Insuficiente"; // Calificación para 0
			break;}
		case 1: case 2: case 3: case 4:{
			notaTexto = "Insuficiente"; // Calificación para notas entre 1 y 4
			break;
		}case 5:{
			notaTexto = "Suficiente"; // Calificación para 5
			break;
		}case 6:{ 
			notaTexto = "Bien"; // Calificación para 6
			break;
		}case 7: case 8:{ 
			notaTexto = "Notable"; // Calificación para notas 7 y 8
			break;
		}case 9: case 10 :{
			notaTexto = "Sobresaliente"; // Calificación para notas 9 y 10
			break;
		}default:{
			notaTexto = ("Valor no valido"); // Mensaje si la nota no está entre 0 y 10
		}
	  } 
		
		System.out.println("La nota es: " + notaTexto); // Muestra el resultado final
	}

}

