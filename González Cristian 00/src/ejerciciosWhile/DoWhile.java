package ejerciciosWhile;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		int numero, suma = 0;
		int buclesEjecutados = 0;
		do {
			System.out.println("Dame un numero: (0 para terminar)");
			numero = datos.nextInt();
			suma = suma + numero;
			if(buclesEjecutados != 0) {
			buclesEjecutados++;}
			
		}while (numero != 0);
		System.out.println("La suma es: " + suma);
		System.out.println("Has introducido " + buclesEjecutados + " digitos");
	   }
	  
	}