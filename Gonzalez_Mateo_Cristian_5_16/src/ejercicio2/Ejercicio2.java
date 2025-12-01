package ejercicio2;

import libtarea3.Dado;

import java.lang.IllegalArgumentException;

public class Ejercicio2 {

	public static void main(String[] args) {

		//Apartado 1 Consulta Inicial valores clase dado
		
		//Apartado 1.1 Cantidad dados creados
		System.out.printf("Numero de dados %d", Dado.getNumeroDadosCreados());
		System.out.println();
		
		//Apartado 1.2 Numero de lanzamientos
		System.out.printf("Numero de lanzamientos %d", Dado.getNumeroLanzamientosGlobal());
		System.out.println();
		
		//Apartado 1.3 Veces que ha salido 1,2,3 y 4 en total
		int numTotal = Dado.getNumeroVecesCaraGlobal(1) + Dado.getNumeroVecesCaraGlobal(2) + Dado.getNumeroVecesCaraGlobal(3) + Dado.getNumeroVecesCaraGlobal(4) ;
		System.out.printf("Veces totales que han salido 1,2,3 y 4 es: %d", numTotal);
		System.out.println();
		
		//Apartado 2 Creación y lanzamiento de dado
		
		//Apartado 2.1 Creacion
		try {
			for(int i = 0; i < 10; i++) {
				Dado dadoCreado = new Dado((int)(Math.random() * 8));
			}
			
			
			
		}catch(IllegalArgumentException exDado) {
			System.out.printf("Numero de caras invalido %s", exDado.toString());
		}
		
	}

}
