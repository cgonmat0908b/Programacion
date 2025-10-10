package ejerciciosWhile;

import java.util.Scanner;

public class DoWhileContadorInverso {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
			System.out.println("Introduce el número de inicio");
			int inicio = datos.nextInt();
			
			System.out.println("Introduce el número final");
			int finall = datos.nextInt();
			
			int secuenciaNumeros;
			
			if(inicio <= finall) {
				secuenciaNumeros = inicio;
				do{
					System.out.print(" " + secuenciaNumeros);
					secuenciaNumeros++;
					
				}while (secuenciaNumeros <= finall);
					 
				
			}else {
				secuenciaNumeros = inicio;
				do {
					System.out.print(" " + secuenciaNumeros);
					secuenciaNumeros--;

				}while (secuenciaNumeros >= finall);
			}
			
	}

}
