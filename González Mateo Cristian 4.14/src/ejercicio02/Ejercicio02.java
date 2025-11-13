package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		/*
		 * Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
 o no. Implementa y utiliza la función:
 boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
		 */
		
        Scanner datos = new Scanner (System.in);
        int edad;
        boolean mayorMenor;
        
        System.out.println("¿Qué edad tienes?");
        edad = datos.nextInt();
        
        if(esMayorEdad(edad) == true) {
        	System.out.println("Eres mayor de edad");
        	
        }else {
        	System.out.println("No eres mayor de edad");
        }  
  }

	public static boolean esMayorEdad (int edad) {
		boolean mayorMenor;
		
		if(edad >= 18) {
			mayorMenor = true;
		}else {
			mayorMenor = false ;
		}
		return mayorMenor;
	}
}
