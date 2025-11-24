package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de DNI
 entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
 
 0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
 
 Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se
 deberá crear una función a la que se le pase el número y devuelva la letra.
 Ejemplo: para el DNI 56321122 el NIF es ‘X’.
		 */
		
	
		Scanner datos = new Scanner (System.in);
		long dNI;
		
		System.out.println("Introduce tu DNI:");
		dNI = datos.nextLong();
		
		System.out.println("La letra de tu DNI es: " + letraDNI(dNI));
		
	}

	public static char letraDNI(long dNI) {
		int numDiv = (int) (dNI % 23);
		char letra = 0;
		switch (numDiv) {
		
		case 0 :
			letra ='T';
			break;
			
		case 1 :
			letra ='R';
			break;
			
		case 2 :
			letra ='W';
			break;
			
		case 3 :
			letra ='A';
			break;
			
		case 4 :
			letra ='G';
			break;
			
		case 5 :
			letra ='M';
			break;
			
		case 6 :
			letra ='Y';
			break;
			
		case 7 :
			letra ='F';
			break;
			
		case 8 :
			letra ='P';
			break;
			
		case 9 :
			letra ='D';
			break;
			
		case 10 :
			letra ='X';
			break;
			
		case 11 :
			letra ='B';
			break;
			
		case 12 :
			letra ='N';
			break;
			
		case 13 :
			letra ='J';
			break;
			
		case 14 :
			letra ='Z';
			break;
			
		case 15 :
			letra ='S';
			break;
			
		case 16 :
			letra ='Q';
			break;
			
		case 17 :
			letra ='V';
			break;
			
		case 18 :
			letra ='H';
			break;
			
		case 19 :
			letra ='L';
			break;
			
		case 20 :
			letra ='C';
			break;
			
		case 21 :
			letra ='K';
			break;
			
		case 22 :
			letra ='E';
			break;

		}
		return letra;
	}
}
