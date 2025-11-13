/* Descripción: Programa que guarda 40 números aleatorios, los muestra en filas y columnas y calcula la media de las posiciones pares
 * y la muestra, de las posiciones impares menores que la media, muestra el valor.
 * Fecha: 12/11/2025
 * Autor: Cristian González Mateo
 */
package gonzálezMateo;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Inicialización de las variables
		int[][] nums = new int [2][20];
		int contador = 0, acum = 0, media;
		
		//Generación de números aleatorios en la matriz(0-50).
		for (int i = 0; i < nums.length; i++) {
			for (int f = 0; f < nums[i].length; f++) {
				nums[i][f] = (int)(Math.random()* 51);
				if(f % 2 == 0) {
					acum = acum + nums[i][f];
					contador++;
				}
			}	
		}
		//Muestra de los números de la matriz, en formato filas y columnas.
		for (int i = 0; i < nums.length; i++) {
			System.out.println();
			System.out.print("Fila " + (i + 1));
            for (int f = 0; f < nums[i].length; f++) {
				System.out.print("\t " + nums[i][f]);
			}
		}
		
		//Saltos de linea para estilizar, calculo de la media de los valores de las posiciones pares y muestra de la media.
		System.out.println();
		media = acum / contador;
		
		System.out.println();
		
		System.out.println("La media de los numeros pares es: " + media);
		
		System.out.println();
		
		//Muestra de los números que en posciciones impares, son menores que la media de la suma de todos los número de posiciones pares.
		System.out.println("Los siguientes números, son números en posiciones impares menores que la media de los numeros en posiciones pares.");
		for (int i = 0; i < nums.length; i++) {
			for (int f = 0; f < nums[i].length; f++) {
				if((f % 2 != 0) && nums[i][f] < media) {
					System.out.print(  nums[i][f] + "\t");
				}
			}
		} 
	}

}
