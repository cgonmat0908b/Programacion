/*Descripción: Programa que genera un número del 1 al 6 100 veces y calcula del numero de veces por número y porcentaje
 * Fecha: 28/10/25
 * Autor: Cristian González Mateo
 */
package ejercicio13;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que tire un dado de 6 caras 100 veces y luego muestre el nº y % de
veces que ha salido cada número.
		 */
		int aleatorio;
		int[] contador = new int [6];
		
		for (int i = 0; i < 100; i++) {
			aleatorio = (int) (Math.random() * 6) + 1 ;
			switch (aleatorio) {
			case 1:
				contador[0]++;
				break;
			case 2:
				contador[1]++;
				break;
			case 3:
				contador[2]++;
				break;
			case 4:
				contador[3]++;
				break;
			case 5:
				contador[4]++;
				break;
			case 6:
				contador[5]++;
				break;
			}
		}
		System.out.println("Se han generado");
		System.out.println(contador[0] + " 1s " + "(" + contador[0] + "%)");
		System.out.println(contador[1] + " 2s " + "(" + contador[1] + "%)");
		System.out.println(contador[2] + " 3s " + "(" + contador[2] + "%)");
		System.out.println(contador[3] + " 4s " + "(" + contador[3] + "%)");
		System.out.println(contador[4] + " 5s " + "(" + contador[4] + "%)");
		System.out.println(contador[5] + " 6s " + "(" + contador[5] + "%)");
		
	}

}
