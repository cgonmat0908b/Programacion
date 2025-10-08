package condicionales;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		/*System.out.println("Introduce un número:");
		int numero = datos.nextInt();
		
		if (numero > 0){
			System.out.println("El numero es positivo");
		}
		{if (numero > 50) {
			System.out.println("Mayor que 50");
		}else {
			if (numero == 0) {
			System.out.println("Cero");
		}
			else System.out.println("El numero es negativo");
			}
		

	     }*/

		
		System.out.println("Que nota tienes?");
		int nota = datos.nextInt();
		
		if (nota >= 0 && nota <=10) 
			
		if (nota >= 5 ) {
			System.out.println("Estas aprobado");
		}else {
			System.out.println("Estas suspendido");
		}
	     else {
	System.out.println("La nota es erronea");
       }
    }
}	