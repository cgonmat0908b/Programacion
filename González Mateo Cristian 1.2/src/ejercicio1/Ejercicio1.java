/*
 *Descripción: En este ejercicio hago uso del metodo Scanner para pedir datos y almacenarlos
 *Autor: Cristian González Mateo
 *Fecha: 25/09/25 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
        Scanner datos = new Scanner(System.in); //Defino la variable para el método Scanner
		
		
		String nombre; //Defino una variable String para poder guardar el nombre
		System.out.println("Introduce tu nombre: "); //Pido en pantalla el nombre
		nombre = datos.nextLine();//Guardo lo escrito en la variable nombre
	
		String apellidos; //Defino una variable String para poder guardar los apellidos
		System.out.println("Introduce tus apellidos: ");//Pido en pantalla los apellidos
		apellidos = datos.nextLine();//Guardo lo escrito en la variable apellidos
		
		byte edad;//Defino una variable byte para poder guardar la edad
		System.out.println("Introduce tu edad: ");//Pido en pantalla la edad
		edad = datos.nextByte();//Guardo lo escrito en la variable edad
		
		datos.nextLine();
		
		String direccion; //Defino la una variable String para poder guardar la dirección
		System.out.println("Introduce tu direccion: ");//Pido en pantalla la direccion
		direccion = datos.nextLine();//Guardo lo escrito en la variable direccion
		
		float altura;//Defino una variable float para poder guardar la altura
		System.out.println("Introduce tu altura en metros: ");//Pido en pantalla la altura
		altura = datos.nextFloat();//Guardo lo escrito en la variable altura
		
		float peso;//Defino una variable float para poder guardar el peso
		System.out.println("Introduce tu peso en kilogramos: ");//Pido en pantalla el peso
		peso = datos.nextFloat();//Guardo lo escrito en la variable peso
	}

}
