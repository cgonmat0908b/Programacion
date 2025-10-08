package ejerciciosSwitch;

import java.util.Scanner;

public class SwitchPractica {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		System.out.println("Introduce una nota");
		int nota = datos.nextInt();
		
		String notaTexto = null;
       
		switch (nota){
		
		case 0:{
			notaTexto = "Insuficiente";
			break;}
		case 1: case 2: case 3: case 4:{
			notaTexto = "Insuficiente";
			break;
		}case 5:{
			notaTexto = "Suficiente";
			break;
		}case 6:{ 
			notaTexto = "Bien";
			break;
		}case 7: case 8:{ 
			notaTexto = "Notable";
			break;
		}case 9: case 10 :{
			notaTexto = "Sobresaliente";
			break;
		}default:{
		notaTexto = ("Valor no valido");
		}
	  } if (notaTexto.equals("Valor no valido")) {
			System.out.println("La nota no es valida");
			}else {
				System.out.println("La nota es: " + notaTexto);
			}

	}

}
