package ejerciciosWhile;

import java.util.Scanner;

public class ContadorDe100A0 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		System.out.println("Introduce el número de inicio");
		int inicio = datos.nextInt();
		
		System.out.println("Introduce el número final");
		int finall = datos.nextInt();
		
		int secuenciaNumeros;
		
		if(inicio <= finall) {
			System.out.println("Los multiplos en la cadena son: ");
			secuenciaNumeros = inicio;
			do{
				secuenciaNumeros++;
				if(secuenciaNumeros % 3 == 0) {
					System.out.println(secuenciaNumeros);
				}
				
			}while (secuenciaNumeros <= finall);
	}
		if(inicio >= finall) {
			System.out.println("Los multiplos en la cadena son: ");
			secuenciaNumeros = inicio;
			do{
				secuenciaNumeros--;
				if(secuenciaNumeros % 3 == 0) {
					System.out.println(secuenciaNumeros);
				}
				
			}while (secuenciaNumeros >= finall);
		
		}
}
}