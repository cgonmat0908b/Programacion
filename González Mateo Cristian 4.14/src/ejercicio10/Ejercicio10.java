package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		/*
		 * Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
 si la fecha es correcta o no. Se debe crear una función donde le pasemos los datos y devuelva si
 es correcta o no.
		 */
	
		int dia,mes, anio;
		boolean validacion;
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce el día");
		dia = datos.nextInt();
		
		System.out.println("Introduce el mes");
		mes = datos.nextInt();
		
		System.out.println("Introduce el año");
		anio = datos.nextInt();
		
		validacion = comprobacionFecha(dia, mes);
		
		if(validacion == true) {
			System.out.println("La fecha introducida es correcta");
			
		}else {
			System.out.println("La fecha introducida es incorrecta");
		}
		
		
	}

	public static boolean comprobacionFecha(int dia, int mes) {
		boolean fechaCorrecta = true;
		if(mes < 1 || mes > 12 ) {
			fechaCorrecta = false;
			
		}else {
			if(dia < 1 || dia > 31) {
				fechaCorrecta = false;
			}else {
				if(dia <= 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
					fechaCorrecta = true;
				}
				if(dia <= 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
					fechaCorrecta = true;
				}
				if (dia <= 28 && mes == 2) {
					fechaCorrecta = true;
				}
				else {
					fechaCorrecta = false;
				}
				
			}
		}
		return fechaCorrecta;
	}
}
