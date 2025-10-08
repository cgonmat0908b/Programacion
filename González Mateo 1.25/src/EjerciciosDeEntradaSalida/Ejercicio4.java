/*Descripción: Uso de código para petiones de datos de entrada y salida
 * Autor: Cristian González Mateo
 * Fecha: 1/10/25
 */
package EjerciciosDeEntradaSalida;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);

		System.out.println("                    LUNES    MARTES    MIÉRCOLES    JUEVES    VIERNES");
		System.out.println("15:15-16:15" + "         BD       IPE       DAS          BD        SI");
		System.out.println("16:15-17:15" + "         BD       IPE       SAS          PROG      SI");
		System.out.println("17:15-18:15" + "         BD       IPE       EDD          PROG      BD");
		System.out.println("18:30-19:30" + "         PROG     SI        EDD          LM        BD");
		System.out.println("19:30-20:30" + "         PROG     SI        PROG         LM        PROG");
		System.out.println("20:30-21:30" + "         EDD      SI        PROG         LM        PROG");

	}

}