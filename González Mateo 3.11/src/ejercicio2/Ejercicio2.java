/* Descripción:
 * Fecha: 27/10/25
 * Autor: Cristian González Mateo
 * 
 */
package ejercicio2;
	
public class Ejercicio2 {
	
public static void main(String[] args) {
			
			//Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
			//multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
			
			int[][] numeros = new int [10][10];
			int numTabla = 0;
			int multTabla = 0;
			
			for (int i = 0; i < numeros.length; i++) {
				
				numTabla++;
				System.out.println();
				System.out.print("La tabla del " + numTabla + " es: " ); 
				multTabla = 0;
				
				for(int f = 0; f < numeros[i].length; f++) {
					
				   multTabla++;
				   numeros[i][f] = numTabla * multTabla;
				   
				   System.out.print(numTabla + " * " + multTabla + " = " + numeros[i][f] + " ");
				   
				}
			}
		}
	
	}
