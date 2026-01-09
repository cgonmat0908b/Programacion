/* Descripción: Programa que dado una tabla con valores, ha de realizar 4 tareas.
 * Fecha: 17/12/2025
 * Autor: Cristian González Mateo
 * 
 */

package gonzalez;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] diasHoras = {
				
			{21,26,40,32,32,15,27,15,31,3,20,32,2,18,27,2,40,31,24,37,15,24,10,36},
			{5,25,28,5,10,30,14,6,35,33,29,9,32,15,8,37,15,39,19,30,40,14,18,2},
			{39,7,17,14,2,12,34,21,3,40,29,31,1,18,14,9,31,1,6,37,11,5,37,30},
			{1,12,37,6,7,30,31,3,15,35,2,38,6,30,32,31,2,32,6,14,14,21,21,38},
			{8,23,37,16,0,28,5,13,35,10,22,18,28,6,12,21,12,38,26,15,39,24,37,4},
			{28,7,27,5,21,27,37,17,39,8,29,30,22,10,6,32,39,18,34,0,25,35,4,29},
			{2,16,16,36,33,9,34,23,4,26,14,26,10,11,12,31,27,17,20,12,24,32,11,33}
		};
		
		//Apartado A para cada hora día de consumo mínimo
		

		//Apartado B hora con menor consumo
		System.out.println("La hora con el menor consumo a lo largo de toda la semana ha sido: " + horaConsumoMinimo(diasHoras));
		
		// Apartado C Consumo total de la semana
		System.out.println("El consumo total de la semana es: " + consumoTotal(diasHoras));
		
	}

	public static int[] diaConsumoMinimo (int [][] diasHoras) {
		
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		
		int [] hora = new int[24];
		
		for(int i = 0; i < diasHoras.length; i++) {
			
			for(int f = 0; i < diasHoras[i].length; f++) {
				
			}
		}
		return hora;
	}
	
	public static int horaConsumoMinimo(int [][] diasHoras) {
		
		int hora = diasHoras[0][0];
		
		for(int i = 0; i < diasHoras.length; i++) {
			for(int f = 0; f < diasHoras.length; f++) {
				
				if(hora < diasHoras[i][f]) {
					hora = diasHoras[i][f];
				}
			}
		}
		return hora;
	}
	
	//Método que dada una tabla, la recorre y devuelve la suma de todos los valores
	
	public static int consumoTotal(int [][] diasHoras) {
		
		int total = diasHoras[0][0];
		
		for(int i = 0; i < diasHoras.length; i++) {
			for(int f = 0; f < diasHoras[i].length; f++) {
				total = total + diasHoras[i][f];
			}
		}
		return total;
	}
	public static int[] consumoInferior10(int[][] diasHoras) {
		
		int[] primerDia = new int[7];
		
			for(int i = 0; i < diasHoras.length; i++) {
				for(int f = 0; f < diasHoras[i].length; f++) {
					
					if(diasHoras[i][f] < 10) {
						primerDia[i] = diasHoras[i][f];
					}
					
				}
			
			}
		return primerDia;
	}
} 


