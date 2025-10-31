package expresionesRegulares;

import java.util.regex.*;

import java.util.Scanner;


public class ExpresionesRegulares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner datos = new Scanner (System.in);
		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
		String dni;

		System.out.println("Introduce tu DNI");
		dni = datos.next();
		Matcher textoEj = patron.matcher(dni);
		
		
		if (textoEj.matches()) {
			System.out.println("Dni posible");
		}else {
			System.out.println("Incorrecto");
		}
	}

}
