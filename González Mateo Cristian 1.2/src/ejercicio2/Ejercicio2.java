/*
 *Descripción: En este ejercicio uso el metodo Scanner para almacenar una serie de datos y posteriormente mostrarlos
 *en pantalla con una frase.
 *Autor: Cristian González Mateo
 *Fecha: 25/09/25
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); //Defino la variable para el método Scanner
		
		String nombreEquipo;
		System.out.println("Introduce el nombre del equipo: ");
		nombreEquipo = datos.next();
		//Defino una variable String, pido el dato en pantalla y lo guardo en la variable
	
		short añoFundacion;
		System.out.println("Introduce el año de fundación: ");
		añoFundacion = datos.nextShort();
		//Defino una variable Short, pido el dato en pantalla y lo guardo en la variable
		
		datos.nextLine();//Salto de linea por fallo en el metodo Scanner
		
		String estadio;
		System.out.println("Introduce el estadio del equipo: "); 
		estadio = datos.next();
		//Defino una variable String, pido el dato en pantalla y lo guardo en la variable
		
		String nombreCapitan;
		System.out.println("Introduce el nombre del capitan del equipo: ");
		nombreCapitan = datos.next();
		//Defino una variable String, pido el dato en pantalla y lo guardo en la variable
		
		System.out.println();
		
		System.out.println("**********************************************************************************************");
		System.out.println("******* " + "Nombre del Equipo: " + nombreEquipo + " ***********************************************");		
		System.out.println("******* " + "Fundado: " + añoFundacion + " ****************************************************************");
		System.out.println("******* " + "Estadio: " + estadio + " ******************************************************************");
		System.out.println("****** " + "Capitán: " + nombreCapitan + " *************************************************************");
		//Muestro en pantalla los datos de las variables junto a una frase 
	}

}
