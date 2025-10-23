package practicasForArraysUniBi;

import java.util.Scanner;

public class PracticasForArraysUniBi {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		// for (int i = 0;) //inicializacion del la variable en la que se guardará el bucle
		
		//for (int i = 0; i < 100; //El bucle se ejecutara mientras que al evaluar esa condicion sea verdadera, es decir, en este caso
		//mientras que la variable sea menor que 100 se ejecutará todo el contenido del bucle.
		
		//for (int i = 0; i < 100; i++){Se añade un la función que hara que el bucle acabe en algún momento y no genere un bucle infinito
		//Todo lo que haya dentro de {} se ejecutara el número de veces que el bucle se ejecute
		//}
		
		/*int [] numeros = new int [10];
		numeros [5] = 3;
		numeros [8] = 34;

		for (int recorrido = 0; recorrido < numeros.length; recorrido++) {
			
			System.out.println(numeros[recorrido]);*/
			/*El bucle se realiza si se cumple la condición, si el valor de la variable recorrido es 0
			                                        /muestra el valor que haya en la posicion 0 del array, ya que la posición es como si existiera
			                                         * una variable inicializada en ese valor con un número dentro.
			                                         */
			
			/*Uso de array junto al bucle for:
			 * El bucle for va a guardar el numero de veces que ha realizado el bucle, en la variable que se inizializa para el bucle,
			 * 
			 * 
			 */
			
			//array bidimensional
			
			int [][] i = new int [2][3];
			
			i[0][0] = 2;
			i[0][1] = 3;
			i[0][2] = 2;
			
			i[1][0] = 2;
			i[1][1] = 3;
			i[1][2] = 2;
			
			for (int f = 0;f < i.length; f++) {
				for (int w = 0; w < i[f].length; w++) { 
					System.out.println("La posicion del array es  " + f + " la posicion del array bidimensional es  " + w + " y guarda el valor " + i[f][w] );
				}
				
			}
		
			
			
		}

	}


