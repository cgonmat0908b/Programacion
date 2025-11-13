/*
 * 
 */
package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
 valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
 muestre por pantalla.
		 * 
		 */
		int [] secuencia = new int [10];
		int contador = 0;
		
		for (int i = 0; i < secuencia.length; i++) {
			
			if (i == 0) {
				System.out.print((i + 1));
			}
			else if (i == 1) {
				do {
					System.out.print( ", " + (i + 1));
					contador++;
				}while (contador != 2);
				
				contador = 0;
				
			}else if (i == 2) {
				do {
					System.out.print( ", " + (i + 1));
					contador++;
				}while (contador != 3);
		    
				contador = 0;
				
			}else if (i == 3) {
				do {
					System.out.print( ", " + (i + 1));
					contador++;
				}while (contador != 4);
		    
				contador = 0;
				
			}else if (i == 4) {
				do {
					System.out.print( ", " + (i + 1));
					contador++;
				}while (contador != 5);
				
				contador = 0;
				
		    }else if (i == 5) {
				do {
					System.out.print( ", " + (i + 1));
					contador++;
				}while (contador != 6);
				
				contador = 0;
				
		    }else if (i == 6) {
				do {
					System.out.print( ", " + (i + 1));
					contador++;
				}while (contador != 7);
				
				contador = 0;
				
		    }else if (i == 7) {
				do {
					System.out.print( ", " + (i + 1));
					contador++;
				}while (contador != 8);
				
				contador = 0;
				
		    }else if (i == 8) {
				do {
					System.out.print( ", " + (i + 1));
					contador++;
				}while (contador != 9);
				
				contador = 0;
				
		    }else if (i == 9) {
				do {
					System.out.print( ", " + (i + 1));
					contador++;
				}while (contador != 10);
		    }
	    }
	 }		
}
