package practicaClaseArrayMultidimensional;

import java.util.Scanner;

public class PracticaClaseArrayMultidimensional {

	public static void main(String[] args) {
		
		final int TOTAL_MESES = 12;
		final int TOTAL_DIAS = 30;
		
		
		Scanner datos = new Scanner(System.in);
		
		int [][] temperatura = new int [TOTAL_MESES][TOTAL_DIAS]; //Declaración e inicialización de array bidimensional
		int diaMasCalor, tempMax = 0, diaTemp10;
		diaMasCalor = 0;
		int tempMenor10 = 0;
	
		
		for (int contadorMeses = 0; contadorMeses < temperatura.length; contadorMeses++) {        //Inicializacion
			for(int contadorDias = 0; contadorDias < temperatura[contadorMeses].length ; contadorDias++) {
				temperatura[contadorMeses][contadorDias] = (int) (Math.random() * 40);
            
                	
				}
				 
			}
	
		
		for (int contadorMeses = 0; contadorMeses < temperatura.length; contadorMeses++) {        //Inicializacion
			for(int contadorDias = 0; contadorDias < temperatura[contadorMeses].length ; contadorDias++) {
				System.out.print(temperatura[contadorMeses][contadorDias] + "\t");
				 
			}
			System.out.println();
		}
		for (int contadorMeses = 0; contadorMeses < temperatura.length; contadorMeses++) {        //Inicializacion
			for(int contadorDias = 0; contadorDias < temperatura[contadorMeses].length  ; contadorDias++) {
				
				
			}
		}

		for (int contadorMeses = 0; contadorMeses < temperatura.length ; contadorMeses++) {
			tempMax = temperatura[0][0] ; //cada mes inicializo la temperatura más alta a la temperatura del primer dia del primer mes
			for(int contadorDias = 1; contadorDias < temperatura[contadorMeses].length ; contadorDias++) { //Comienzo de comparación de temperaturas a partir del segundo dia
			if(tempMax < temperatura[contadorMeses][contadorDias]) {
				tempMax = temperatura[contadorMeses][contadorDias];
				diaMasCalor = contadorDias;
			}	
		 }
			System.out.println("El día " + diaMasCalor + " hubo " + tempMax);
	   }
		
		for (int contadorMeses = 0; contadorMeses < temperatura.length ; contadorMeses++) {
			diaTemp10 = 0;
			
	    	do {
	    		diaTemp10++;
	    	}while (temperatura[contadorMeses][diaTemp10] > 10);
	    	System.out.println("El mes " + contadorMeses  + " el primer dia con menos de 10 grados es " + diaTemp10);
		} 
			
			
			
			
			//Para cada mes, mostrar el primer dia con temperatura inferior a 10 grados
	}

}
