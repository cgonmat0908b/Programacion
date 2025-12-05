package ejercicio2;

import libtarea3.Dado;

import java.lang.IllegalArgumentException;

public class Ejercicio2 {

	public static void main(String[] args) {

		//Apartado 1 Consulta Inicial valores clase dado
		
		//Apartado 1.1 Cantidad dados creados
		System.out.printf("Numero de dados %d %n", Dado.getNumeroDadosCreados());
		
		//Apartado 1.2 Numero de lanzamientos
		System.out.printf("Numero de lanzamientos %d %n", Dado.getNumeroLanzamientosGlobal());
		
		//Apartado 1.3 Veces que ha salido 1,2,3 y 4 en total
		System.out.printf("Veces totales que han salido 1: %d %n", Dado.getNumeroVecesCaraGlobal(1));
		System.out.printf("Veces totales que han salido 2: %d %n", Dado.getNumeroVecesCaraGlobal(2));
		System.out.printf("Veces totales que han salido 3: %d %n", Dado.getNumeroVecesCaraGlobal(3));
		System.out.printf("Veces totales que han salido 4: %d %n", Dado.getNumeroVecesCaraGlobal(4));
		
		//Apartado 2 Creación y lanzamiento de dados
		
		//Apartado 2.1 Creacion, 2.2 Lanzamiento de los dados creados
		for(int i = 0; i < 10; i++) {
			try {
				Dado dadoCreado = new Dado((int)(Math.random() * 9));
				for(int f = 0; f <= dadoCreado.getNumeroCaras(); f++) {
					dadoCreado.lanzar();
				}
				System.out.printf("Del dado %d la serie historica es: %s %n", (i+1),dadoCreado.getSerieHistoricaLanzamientos());
				System.out.printf("Del dado %d la suma de los lanzamientos es %d %n", (i+1),dadoCreado.getSumaPuntuacionHistorica());
				
			}catch(IllegalArgumentException exDado) {
				System.out.println(exDado.getMessage());
				
			}
		}
		
		//Apartado 3 Consulta Final de los dados
		
		//Aparatado 3.1 Consulta dados creados final
		System.out.printf("Numero de dados %d %n", Dado.getNumeroDadosCreados());
		
		//Apartado 3.2 Numero de lanzamientos final
		System.out.printf("Numero de lanzamientos %d %n", Dado.getNumeroLanzamientosGlobal());
		
		//Apartado 3.3 Veces que ha salido 1,2,3 y 4 en total, final
		System.out.printf("Veces totales que han salido 1: %d %n", Dado.getNumeroVecesCaraGlobal(1));
		System.out.printf("Veces totales que han salido 2: %d %n", Dado.getNumeroVecesCaraGlobal(2));
		System.out.printf("Veces totales que han salido 3: %d %n", Dado.getNumeroVecesCaraGlobal(3));
		System.out.printf("Veces totales que han salido 4: %d %n", Dado.getNumeroVecesCaraGlobal(4));
		
	}

}
