package operacionesCadenas;

import java.util.Scanner;

public class OperacionesCadenas {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int longitud;
		char caracter;
		char ultChar;
		
		String [] palabras;
		String segundaPal;
		String mayus;
		String minus;
		
		
		
		System.out.println("Introduce una frase");
		
		String cadena = datos.nextLine();
		
		//Mostrar la longitud de la cadena
		
		longitud = cadena.length();
		System.out.println("La longitud es " + longitud);
		
		//Mostrar el primer caracter de la cadena
		
		caracter = cadena.charAt(0);
		System.out.println("La primera letra es " + caracter); 
		
		//Mostrar el ultimo caracter de la cadena
		
		ultChar = cadena.charAt(cadena.length() - 1);
		System.out.println("El ultimo caracter es " + ultChar);
		
		//Mostrar la segunda palabra de la cadena
		
		 palabras = cadena.split(" ");
		 segundaPal = palabras [1];
		 System.out.println("La segunda palabra es " + segundaPal); 
		 
		//Mostrar la cadena con la primera letra y la última en mayuscula
		 
		  char primLetra = cadena.charAt(0);
		  String pLetra = "" + primLetra;
		  pLetra = pLetra.toUpperCase();
		  
		  char ultLetra = cadena.charAt(longitud - 1);
		  String uLetra = "" + ultLetra;
		  uLetra = uLetra.toUpperCase();
		  System.out.println(uLetra);
		  
		 
		  String primeraLetraMayus = cadena.substring(0,1);
		  primeraLetraMayus = primeraLetraMayus.toUpperCase();
		  
		  System.out.println(primeraLetraMayus);
		  
		  String ultimaLetraMinus = cadena.substring(longitud-1 , longitud);
		  ultimaLetraMinus = ultimaLetraMinus.toUpperCase();
		  System.out.println(ultimaLetraMinus);
		  
		  String entreMedio = cadena.substring(1, longitud-1);
		  System.out.println(primeraLetraMayus + entreMedio + ultimaLetraMinus);
		 
		 
		
		

	}

}
