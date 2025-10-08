/* Descripción:
 * Autor:
 * Fecha:
 */
package condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		String nombre = datos.next();
		
		System.out.println("Introduce tu edad");
		byte edad = datos.nextByte();
		
		System.out.println("Introduce tu nota");
		byte nota = datos.nextByte();
		
		if (edad > 18 && nota > 7) {
			System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas");
		}else {
			System.out.println (nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");
			
		}
	}

}
