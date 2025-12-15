package ejercicio2;

import libtarea3.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Apartado 1 Creación y llenado de bombos
		
		//1.1.1 Bombo con -1 capacidad minima
		
		try {
			Bombo menos1 = new Bombo(Bombo.MINIMA_CAPACIDAD - 1);
			
		}catch(IllegalArgumentException exCap) {
			System.out.println(exCap.getMessage());
		}
		
		//1.1.2 Bombo con +1 capacida Maxima
		
		try {
			Bombo mas1 = new Bombo(Bombo.MAXIMA_CAPACIDAD + 1);
			
		}catch(IllegalArgumentException exCap) {
			System.out.println(exCap.getMessage());
		}
		
		//1.2 Creación de bombos validos
		
		//1.2.1 Bombo por omisión
		Bombo omision = new Bombo();
		
		//1.2.2 Bombo con 15 de capacidad
		
		Bombo bolas15 = new Bombo(15);
			
		
		// 1.2.3 Datos de bombo bolas15
		
		//1.2.3.1 capacidad, cantidad bolas extraidas y cantidad bolas restantes
		
		System.out.printf("La capacidad del bombo es %d %n", bolas15.getCapacidad());
		System.out.printf("Se han extraido %d %n",bolas15.getCantidadBolasExtraidas());
		System.out.printf("Quedan %d bolas restantes %n", bolas15.getCantidadBolasRestantes());
		
		//1.2.3.2  Listado de bolas extraidas
		System.out.printf("Las bolas extraidas son: %s %n", bolas15.getBolasExtraidas());
		
		//1.2.3.3 Numero de bolas extraidas
		System.out.printf("Se han extraido %d %n",bolas15.getCantidadBolasExtraidas());
		
		//1.2.3.4 Listado Bolas restantes
		System.out.printf("Las siguientes bolas aún no han sido extraidas: %s %n",bolas15.getBolasRestantes());
		
		//1.2.3.5 Cantidad de bolas que quedan
		System.out.printf("Quedan %d bolas restantes %n", bolas15.getCantidadBolasRestantes());
		
		
		
	}

}
