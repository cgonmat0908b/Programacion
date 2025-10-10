package ejerciciosWhile;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		/* System.out.println("Introduce cuantos números quieras, cuando no quieras más, introduce un cero");
		
		int numero = datos.nextInt();
		int suma = 0;
		int numeroBucles = 1;
		suma = numero;
		
		while (numero != 0 && numeroBucles !=3) {
			System.out.println("Introduce cuantos números quieras, cuando no quieras más, introduce un cero");
			numero = datos.nextInt();
			numeroBucles = numeroBucles + 1;
			suma = suma + numero; // Acumulador
			
			
		}
		System.out.println("La operación da como resultado: " + suma); */
		
		System.out.println("Introduce el número de inicio");
		int inicio = datos.nextInt();
		
		System.out.println("Introduce el número final");
		int finall = datos.nextInt();
		
		int secuenciaNumeros;
		secuenciaNumeros = inicio;
		
		System.out.println("Secuencia desde " + inicio  + " hasta " + finall);
		if (inicio > finall) {
			while (secuenciaNumeros >= finall) {
				System.out.println(" " + secuenciaNumeros + " ");
				secuenciaNumeros--;}
		}else {
		
			
		while (secuenciaNumeros <= finall) {	
			System.out.print(" " + secuenciaNumeros + " ");
			secuenciaNumeros++;
		}
		
	   }
	  
	}
}
