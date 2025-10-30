/*Descripción: Programa que irá pidiendo años hasta que se introduzca -1 o introduzca 3 valores no validos
 * e indicará el siglo perteneciente, si anterior, posterior o igual al actual y la diferencia de años.
 * 
 * Fecha: 29/10/25
 * Autor: Cristian González Mateo
 */
package gonzálezMateo;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final short ANYOACTUAL = 2025;

		Scanner datos = new Scanner (System.in);
		
		String siglo;
		short anyoIntrod, diferenciaAnyos;
		byte contadorAnyosErroneos = 0;
		
		
		do {
			System.out.println("Introduce un año compredido entre 1801 y 2100 (ambos incluidos) cuando quieras parar, introduce -1");
			anyoIntrod = datos.nextShort();
			
			if(anyoIntrod > 2100 || anyoIntrod < 1801) {
				System.out.println("Año no comprendido en el rango descrito, intentelo de nuevo");
				contadorAnyosErroneos++;
					
			} 
			else if (anyoIntrod >= 1801 || anyoIntrod <= 2100) {
				contadorAnyosErroneos = 0;
				if (anyoIntrod > ANYOACTUAL) {
					System.out.println(anyoIntrod + " es mayor que " + ANYOACTUAL);
					diferenciaAnyos = (short) (anyoIntrod - ANYOACTUAL);
					System.out.println(anyoIntrod + " será dentro de " + diferenciaAnyos);
					
					if (anyoIntrod >= 1801 && anyoIntrod < 1900) {
						System.out.println("El año " + anyoIntrod + " entra en el siglo XIX");
						
					}else if (anyoIntrod >= 1900 && anyoIntrod < 2000) {
						System.out.println("El año " + anyoIntrod + " entra en el siglo XX");
						
					}else {
						System.out.println("El año " + anyoIntrod + " entra en el siglo XXI");
						
					}
					
				}else if (anyoIntrod < ANYOACTUAL) {
					System.out.println(anyoIntrod + " es menor que " + ANYOACTUAL);
					diferenciaAnyos = (short) (ANYOACTUAL - anyoIntrod);
					System.out.println(anyoIntrod + " fue hace " + diferenciaAnyos);
					
					if (anyoIntrod >= 1801 && anyoIntrod < 1900) {
						System.out.println("El año " + anyoIntrod + " entra en el siglo XIX");
						
					}else if (anyoIntrod >= 1900 && anyoIntrod < 2000) {
						System.out.println("El año " + anyoIntrod + " entra en el siglo XX");
						
					}else {
						System.out.println("El año " + anyoIntrod + " entra en el siglo XXI");
						
					}
					
				}else {
					System.out.println(anyoIntrod + " es igual que " + ANYOACTUAL);
					
					if (anyoIntrod >= 1801 && anyoIntrod < 1900) {
						System.out.println("El año " + anyoIntrod + " entra en el siglo XIX");
						
					}else if (anyoIntrod >= 1900 && anyoIntrod < 2000) {
						System.out.println("El año " + anyoIntrod + " entra en el siglo XX");
						
					}else {
						System.out.println("El año " + anyoIntrod + " entra en el siglo XXI");
						
					}
			}	
			
			
			}
			
		}while (anyoIntrod != (-1) || contadorAnyosErroneos != 3);
		
		if(contadorAnyosErroneos == 3) {
			System.out.println("El programa paró ya que introduciste 3 fechas no comprendidas en el rango consecutivamente");
			
		}else {
			System.out.println("Programa finalizado por la introducción de -1");
		}
	}

}
