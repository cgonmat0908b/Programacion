package pruevasLocalDate;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDatePruevas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fecha de nacimiento
		//Programa que pide la fecha de nacimiento del usuario y le indica cuanto tiempo a pasado hasta ahora
		String fecha;
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduzca la fecha con este formato: xxxx-xx-xx");
		fecha = datos.nextLine();
		
		LocalDate fechaNacimiento = LocalDate.parse(fecha);
		LocalDate fechaHoy = LocalDate.now();
		
		Period transcurrido = Period.between(fechaNacimiento, fechaHoy);
		System.out.println(transcurrido.toString());
		
		System.out.printf("Han pasado %d años, %d meses y %d dias ", transcurrido.getYears(), transcurrido.getMonths(), transcurrido.getDays());
		
	}

}
