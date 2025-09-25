package interacciónOperadoresConUsuario;

import java.util.Scanner;

public class InteracciónOperadoresConUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);
		int digito1;
		System.out.println("Introduce un dígito: ");
		digito1 = datos.nextInt();
		
		int digito2;
		System.out.println("Introduce otro dígito: ");
		digito2 = datos.nextInt();
		
		int sumaDigitos = digito1+digito2;
		System.out.println("La sumda de los digitos que has dado es: " + sumaDigitos);
		


	}

}
