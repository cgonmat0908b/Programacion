package ejercicio3;

import java.time.DateTimeException;
import java.lang.Exception;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int hora = -1, minutos = -1;
		boolean horaValida = false, minutosValidos = false;
		long faltante = 0, pasado = 0;
		String prog = "desconocido", si = "desconocido", edd = "desconocido";
		
		//Apartado 1 Creación de un objeto dado la hora de inicio de las clases
		LocalTime inicio;
		
		try{
			inicio = LocalTime.of(8, 0);
			
		}catch(DateTimeException ex1) {
			System.out.println(ex1.getMessage());
			inicio = LocalTime.of(8, 0);
		}
		
		//Apartado 2 Lectura de datos
		
		//Apartado 2.1 Introducción de hora
		do {
			try {
				System.out.println("Introduce una hora:");
				hora = datos.nextInt();
				
				if(hora >= 0 && hora <= 23) {
					horaValida = true;
					
				}else {
					while(hora < 0 || hora > 23) {
						System.out.println("Hora introducida incorrecta intentalo de nuevo");
						hora = datos.nextInt();
						
						if(hora >= 0 && hora <= 23) {
							horaValida = true;
							
						}
					}
				}
				
			}catch(InputMismatchException exNoInt){
				System.out.println("Lo introducido no es un entero");
				datos.next();
				
			}catch(NoSuchElementException ex){
				System.out.println(ex.getMessage());
				datos.next();
				
			}catch(IllegalStateException exCerrado){
				System.out.println("El scanner esta cerrado");
			}
			
		}while(horaValida == false);
		
		//Apartado 2.2 Introducción de minutos validos
		
		do {
			try {
				System.out.println("Introduce los minutos:");
				minutos = datos.nextInt();
				
				if(minutos >= 0 && minutos <= 59) {
					minutosValidos = true;
					
				}else {
					while(minutos < 0 || minutos > 59) {
						System.out.println("Minutos introducidos incorrectos intentalo de nuevo");
						minutos = datos.nextInt();
						
						if(minutos >= 0 && minutos <= 59) {
							minutosValidos = true;
							
						}
					}
				}
				
			}catch(InputMismatchException exNoInt){
				System.out.println("Lo introducido no es un entero");
				datos.next();
				
			}catch(NoSuchElementException ex){
				System.out.println(ex.getMessage());
				datos.next();
				
			}catch(IllegalStateException exCerrado){
				System.out.println("El scanner esta cerrado");
			}
			
		}while(minutosValidos == false);
		
		//Apartado 3 Creación de objeto LocalTime con los valores introducidos en los anteriores apartados
		
		LocalTime valido = LocalTime.of(hora, minutos);
		
		//Apartado 4 Obtención del rango de la hora introducida
		
		//Apartado 4.1 Aún no han comenzado las clases
		try {
			
			if(valido.isBefore(inicio) == true ) {
				faltante = valido.until(inicio, ChronoUnit.MINUTES);
				
			//Apartado 4.2 Estamos en Programación 
				
			}else if(valido.isBefore(inicio.plusHours(2))){
				prog = "Programación";
				
			//Apartado 4.3 Estamos en Sistemas Informaticos
					
			}else if(valido.isBefore(inicio.plusHours(4))){
				si = "Sistemas Informaticos";
					
			//Apartado 4.4 Estamos en Entornos de Desarrollo
					
			}else if(valido.isBefore(inicio.plusHours(6))){
				edd = "Entornos de Desarrollo";
					
			}else{
				pasado = inicio.plusHours(6).until(valido, ChronoUnit.MINUTES);
			}
			
		}catch(NullPointerException exPuntero) {
			System.out.println(exPuntero);
		}
		//Apartado 5 Muestra de datos
		
		//Apartado 5.1 Muestra del objeto
		System.out.println(valido);
		
		//Apartado 5.2 Estado en el que estamos
		
		if(valido.isBefore(inicio) == true ) {
			System.out.printf("Quedan %d minutos para que comienzen las clases", faltante);
			
		}else if(valido.isBefore(inicio.plus(2, ChronoUnit.HOURS))) {
			System.out.printf("Estamos en %s", prog);
			
		}else if(valido.isBefore(inicio.plus(4, ChronoUnit.HOURS))) {
			System.out.printf("Estamos en %s", si);
			
		}else if(valido.isBefore(inicio.plus(6, ChronoUnit.HOURS))) {
			System.out.printf("Estamos en %s", edd);
			
		}else {
			System.out.printf("Han acabado las clases hace %d minutos", pasado);
		}
		
		
	}
	
}
