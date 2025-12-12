package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		int dia = 0, mes = 0, anyo = 0, contador = 0;
		
		LocalDate actual = LocalDate.now();
		
		// Apartado 1 Solicitar año valido
		
		do {
			
			try {
				System.out.println("Introduce un año entre 1900 y el actual");
				anyo = datos.nextInt();
				
				if(anyo > actual.getYear() || anyo < 1900) {
					System.out.println("La fecha no esta en el rango, intentalo de nuevo");
				}
				
			}catch(InputMismatchException exNoInt) {
				datos.next();
				System.out.println("No has introducido un Int");
			}
				
		}while(anyo > actual.getYear() || anyo < 1900);
		
		//Apartado 2 Solicitar mes valido
		
		do {
			
			try {
				System.out.println("Introduce un mes entre 1 y 12");
				mes = datos.nextInt();
				
				if(mes > 12 || mes < 1) {
					System.out.println("La fecha no esta en el rango, intentalo de nuevo");
				}
				
			}catch(InputMismatchException exNoInt) {
				datos.next();
				System.out.println("No has introducido un Int");
			}
				
		}while(mes > 12 || mes < 1);
		
		
		// Apartado 3 Solicitar dia valido
		
		LocalDate fechaValida = LocalDate.of(anyo, mes, 1);
		
		do {
			
			try {
				
				System.out.println("Introduce un dia entre 1 y " +  fechaValida.lengthOfMonth());
				dia = datos.nextInt();
				
				if(dia > fechaValida.lengthOfMonth() || dia < 1) {
					System.out.println("La fecha no esta en el rango, intentalo de nuevo");
				}
				
				
			}catch(InputMismatchException exNoInt) {
				datos.next();
				System.out.println("No has introducido un Int");
			}
				
		}while(dia > fechaValida.lengthOfMonth() || dia < 1);
		
		// Apartado 4 
		fechaValida = LocalDate.of(anyo, mes, dia);
		DayOfWeek diaSemana = fechaValida.getDayOfWeek();
		
		for(int i = (anyo + 1); i < actual.getYear(); i++) {
			LocalDate fechas = LocalDate.of(i, mes, dia);
			DayOfWeek diaAnyos = fechas.getDayOfWeek();
			
			if(diaSemana.equals(diaAnyos)) {
				contador++;
				System.out.println("En la fecha " + fechas + " también cumpliste años el mismo día de la semana");
			}
			
		}
		
		System.out.printf("Has cumplido años el mismo dia de la semana %d numero de veces", contador);
	}
	
}
