package ejsPracticaMatrices;

public class Temperatura {

	public static void main(String[] args) {
		int[][] temperaturas = {
				 {12,14,15,13,12,11,10,9,8,10,12,15,18,20,21,22,21,19,17,16,15,14,13,12},
				 {11,13,14,12,11,10,9,8,7,9,11,14,17,19,20,21,20,18,16,15,14,13,12,11},
				 {13,15,16,14,13,12,11,10,9,11,13,16,19,21,22,23,22,20,18,17,16,15,14,13},
				 {14,16,17,15,14,13,12,11,10,12,14,17,20,22,23,24,23,21,19,18,17,16,15,14},
				 {10,12,13,11,10,9,8,7,6,8,10,13,16,18,19,20,19,17,15,14,13,12,11,10},
				 {9,11,12,10,9,8,7,6,5,7,9,12,15,17,18,19,18,16,14,13,12,11,10,9},
				 {11,13,14,12,11,10,9,8,7,9,11,14,17,19,20,21,20,18,16,15,14,13,12,11}
				};
		
		// A) Muestre para cada hora qué día tuvo la temperatura más baja.
		horaTempMinima(temperaturas);

	}
	
	public static void horaTempMinima(int[][] temperaturas) {
		String[] dias = {"Lunes","Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"}; 
		int indiceDia = 0;
		int temperatura = 0;
		
		for(int hora = 0; hora < temperaturas[0].length; hora++) {
			temperatura = temperaturas[0][hora];
			indiceDia = 0;
			
			for(int dia = 0; dia < temperaturas.length; dia++) {
				if(temperaturas[dia][hora] < temperatura ) {
					temperatura = temperaturas[dia][hora];
					indiceDia = dia;
				}
			}
			System.out.println("La temperatura más baja de la hora " + hora + " fue el dia " + dias[indiceDia]);
		}
		
	}
	
	

}
