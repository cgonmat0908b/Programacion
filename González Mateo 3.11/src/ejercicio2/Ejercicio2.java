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
				System.out.println("La tabla del " + numTabla + " es" ); 
				
				for(int f = 1; f < numeros[i].length; f++) {
					
				   numeros[i][f] = numTabla * f;
				   
				   System.out.println (numTabla + " * " + f + " = " + numeros[i][f]);
				}
			}
		}
	
	}
