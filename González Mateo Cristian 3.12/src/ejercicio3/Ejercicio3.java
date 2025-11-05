/* Descripción:
 * Fecha: 3/11/25
 * Autor: Cristian González Mateo
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
		 * Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
		 * las tres primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
		 * “Alcocer” mostrará “LIOTARALC”.
		 */
		
		Scanner datos = new Scanner(System.in);
		
		String nombre, apellido1, apellido2, concatenacion;
		
		char [] caracteresNom = new char [3];
		char [] caracteresApell1 = new char [3];
		char [] caracteresApell2 = new char [3];
		
		System.out.println("Introduce tu nombre: ");
		nombre = datos.nextLine();
		
		System.out.println("Introduce tu primer apellido: ");
		apellido1 = datos.nextLine();
		
		System.out.println("Introduce tu segundo apellido: ");
		apellido2 = datos.nextLine();
		
		for (int i = 0; i < caracteresNom.length; i++) {
			caracteresNom[i] = nombre.charAt(i);
		}
		
		for (int f = 0; f < caracteresApell1.length; f++) {
			caracteresApell1[f] = apellido1.charAt(f);
		}
		
		for (int w = 0; w < caracteresApell2.length; w++) {
			caracteresApell2[w] = apellido2.charAt(w);
		}
		
		String charnom = new String(caracteresNom);
		String charapell1 = new String(caracteresApell1);
		String charapell2 = new String(caracteresApell2);
		
		concatenacion = charnom.concat(charapell1).concat(charapell2); 
		System.out.println("La concatenación de las 3 primeras letras de cada palabra es: " + concatenacion.toUpperCase());
		
	}

}
