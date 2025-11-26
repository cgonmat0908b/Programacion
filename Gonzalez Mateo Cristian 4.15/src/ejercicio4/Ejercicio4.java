package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Crea un método llamado accesoBecaUsa. Este método recibe como parámetros los siguientes
 datos:
 
  edad
  nota académica
  renta
  nivel de Idioma (Boolean)
 
 El método analizará los datos recibidos y hará las siguientes comprobaciones:
 
  Si el nivel de idioma no es el requerido, devolverá: "No apto" 

 Si la edad es mayor de 30 devolverá: "No apto"

  Si cumple las condiciones anteriores se comprobará lo siguiente:
 
 o Si la nota es superior a 9:" Apto"
 o Si la nota es inferior a 5:" No Apto"
 o Si la nota es 6, 7 u 8 y la renta menor a 20.000 "Apto", en caso contrario "No 
apto".

		 */
		
		
		Scanner datos = new Scanner (System.in);
		
		int edad;
		double notaAcademica, renta;
		boolean nivelIdioma;
		String respuesta;
		
		System.out.println("Introduce tu edad: ");
		edad = datos.nextInt();
		
		System.out.println("Introduce tu nota academica: ");
		notaAcademica = datos.nextDouble();
		
		System.out.println("Introduce tu renta: ");
		renta = datos.nextDouble();
		
		System.out.println("Tienes un B2 de inglés o superior? (si/no)");
		respuesta = datos.next();
		if(respuesta.equals("si")) {
			nivelIdioma = true;
			
		}else {
			nivelIdioma = false;
		}
		
		accesoBecaUsa(edad,notaAcademica,renta,nivelIdioma);
	}

	public static void accesoBecaUsa(int edad, double notaAcademica, double renta, boolean nivelIdioma) {
			
		if(nivelIdioma == false) {
			System.out.println("No apto");
			
		}else if(edad > 30) {
			System.out.println("No apto");
			
		}else if(notaAcademica > 9) {
			System.out.println("Apto");
			
		}else if(notaAcademica < 5) {
			System.out.println("No apto");
			
		}else if((notaAcademica == 6 || notaAcademica ==  7 || notaAcademica ==  8) && renta < 20000) {
			System.out.println("Apto");
			
		}else {
			System.out.println("No apto");
		}
		
	}
}
