package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		//Crea un programa que pida veinte números reales por teclado, los almacene en un array y
		//luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores. 	
		
		Scanner datos = new Scanner(System.in);
 		
		double [] nums = new double [8];
		double numIntroducido;
		double acumuladorPositivos = 0;
		double acumuladorNegativos = 0;
		double mediaPos;
		double mediaNeg;
		int contadorPos = 0, contadorNeg = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			System.out.println("Introduce un número entero");
			nums[i] = datos.nextDouble();
			
		}
		for (int f = 0; f < nums.length; f++) {
	
			if (nums[f] > 0){
			    acumuladorPositivos = acumuladorPositivos + nums[f];
			    contadorPos++;
			}
			
			if (nums[f] < 0){
				acumuladorNegativos= acumuladorNegativos + nums[f];
				contadorNeg++;
			
			}
		}	
		
		mediaPos = acumuladorPositivos / contadorPos;
		mediaNeg = acumuladorNegativos / contadorNeg;
		
		System.out.println("La media de los numeros positivos es: " + mediaPos);
		System.out.println("La media de los numeros negativos es: " + mediaNeg);
	}

}
