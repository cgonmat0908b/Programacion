package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un método llamado indicaMesDias que devolverá una cadena de texto.
		 * 
  El método recibirá un valor entero.
 
  Comprobará que el valor oscile entre 1 y 12 (ambos inclusive)
 
 En caso contrario devolverá un mensaje indicando que el mes es incorrecto.
 
  En caso de ser correcto devolverá un mensaje indicando el mes al que se refiere y el 
número de días del mes: Ejemplo: " Enero, 31 días"
		 */
		int mes;
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce un número de mes:");
		mes = datos.nextInt();
		
		System.out.println(indicaMesDias(mes));
		
	}

	/*
	 * Documentación del metodo:
	 * 
	 * Metodo que devuelve una frase dada un mes(numero),
	 * Realiza comprobación de mes introducido correcto,
	 * Devuelve el mes correspondiente al número y la cantidad de días que tiene ese mes
	 */
	public static String indicaMesDias(int mes) {
		String mesLetras = " Enero "; 
		
		if(mes < 1 || mes >12) {
			mesLetras = "Mes no correcto.";
			
		}else {
			switch(mes) {
			
			case 1:
				mesLetras = "Enero, 31 dias.";
				break;
				
			case 2:
				mesLetras = "Febreo, 28 dias.";
				break;
				
			case 3:
				mesLetras = "Marzo, 31 dias.";
				break;
				
			case 4:
				mesLetras = "Abril, 30 dias.";
				break;
				
			case 5:
				mesLetras = "Mayo, 31 dias.";
				break;
				
			case 6:
				mesLetras = "Junio, 30 dias.";
				break;
				
			case 7:
				mesLetras = "Julio, 31 dias.";
				break;
				
			case 8:
				mesLetras = "Agosto, 31 dias.";
				break;
				
			case 9:
				mesLetras = "Septiembre, 30 dias.";
				break;
				
			case 10:
				mesLetras = "Octubre, 31 dias.";
				break;
				
			case 11:
				mesLetras = "Noviembre, 30 dias.";
				break;
				
			case 12:
				mesLetras = "Diciembre, 31 dias.";
				break;

			}
		}
		
		return mesLetras;
		
	}
}
