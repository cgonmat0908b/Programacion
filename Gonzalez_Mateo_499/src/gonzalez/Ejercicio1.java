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
		
		//Apartado A para cada hora que día en texto se produjo el consumo mínimo
		System.out.println("Apartado A");
		horaDiaConsumoMinimo(diasHoras);

		//Apartado B Que hora tuvo el menor consumo a lo largo de la semana
		System.out.println("Apartado B");
		horaConsumoMinimo(diasHoras);
		
		// Apartado C Consumo total de la semana
		System.out.println("Apartado C");
		consumoTotal(diasHoras);
		
		// Apartado D Para cada hora, encontrar el primer dia con consumi menor que 10
		System.out.println("Apartado D");
		diaConsumoMenor10(diasHoras);
		
	}
	
	//Apartado A para cada hora que día en texto se produjo el consumo mínimo
	
	public static void horaDiaConsumoMinimo (int [][] diasHoras) {
		String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		
		//Recorre primero las columnas (horas)
		
		for(int hora = 0; hora < diasHoras[0].length; hora++) {
			int min = diasHoras[0][hora]; // El minimo de cada hora se lo asignamos al primer dia de cada hora, es decir int min tiene el valor del lunes a la hora del bucle
			int indiceDia = 0;
			
			// Recorre las filas (dias)
			for(int dia = 1; dia < diasHoras.length; dia++) { // empiezo desde el martes
				if(min > diasHoras[dia][hora]) {
					min = diasHoras[dia][hora];
					indiceDia = dia;
				}
			}
			System.out.printf("En la hora %d el dia de consumo mínmo fue %s con un consumo de %d %n", hora, dias[indiceDia], min);
		}
	}
	
	//Apartado B Que hora tuvo el menor consumo a lo largo de la semana
	
	public static void horaConsumoMinimo(int [][] diasHoras) {
		int[] consumoHora = new int [24];
			
		for(int hora = 0; hora < diasHoras[0].length; hora++) {
			
			for(int dia = 0; dia < diasHoras.length; dia++) {
				consumoHora[hora] = consumoHora[hora] + diasHoras[dia][hora];
			}
		}
		
		int horaMin = 0;
		int min = consumoHora[0];
		for(int i = 0; i < consumoHora.length; i++) {
			if(consumoHora[i] < min) {
				min = consumoHora[i];
				horaMin = i;
			}
		}
		
		System.out.printf("La hora con el menor consumo a lo largo de la semana es %d %n", horaMin);
	}
	
	// Apartado C Consumo total de la semana
	//Método que dada una tabla, la recorre y devuelve la suma de todos los valores
	
	public static void consumoTotal(int [][] diasHoras) {
		int total = 0;
		
		for(int dia = 0; dia < diasHoras.length; dia++) {
			for(int hora = 0; hora < diasHoras[dia].length; hora++) {
				total = total + diasHoras[dia][hora];
			}
		}	
		System.out.printf("El consumo total de la semana es %d%n",total);
	}
	
	// Apartado D Para cada hora, encontrar el primer dia con consumo menor que 10
	
	public static void diaConsumoMenor10(int[][] diasHoras) {
		String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		
		for(int hora = 0; hora < diasHoras[0].length; hora++) {
			
			for(int dia = 0; dia < diasHoras.length; dia++) {
				if(diasHoras[dia][hora] < 10 ) {
					System.out.printf("En la hora %d el primer dia con consumo menor que 10 fue: %s %n", hora,dias[dia]);
					break;
				}
			}
		}
	}
} 


