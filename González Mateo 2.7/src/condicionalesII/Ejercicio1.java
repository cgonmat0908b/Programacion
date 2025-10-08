/* Descripción:
 * Autor:
 * Fecha:
 */
package condicionalesII;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);

		System.out.println("Introduce tu nombre:");
		String nombre = datos.next();
		
		datos.nextLine();
		
		System.out.println("Introduce tus apellidos:");
		String apellidos = datos.nextLine();

		System.out.println("Introduce tu edad:");
		byte edad = datos.nextByte();
		
		System.out.println("Introduce tu salario deseado:");
		int salarioDeseado = datos.nextInt();
		
		if (salarioDeseado > 30000 || edad > 45) {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		}else {
			System.out.println("Cuantos años de experiencia tienes?");
			byte añosDeExperiencia = datos.nextByte();
			
			System.out.println("En cuantos proyectos has trabajado hasta ahora?");
			byte numeroProyectos = datos.nextByte();
			
			if(añosDeExperiencia > 2 && numeroProyectos > 3) {
			System.out.println("Enhorabuena. Ha sido contratado");
			
		} else {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
			}
			
		}
		
	}
}