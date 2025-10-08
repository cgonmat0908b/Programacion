package ejercicioEjemplo;

import java.util.Scanner;

public class EjercicioEjemplo {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		float medidaEnMetros;
		System.out.println("Introduce una medida en metros: ");
		medidaEnMetros = datos.nextFloat();
		
		System.out.println("RESULTADO");
		System.out.println("---------------");
		System.out.println("La medida " + medidaEnMetros + " " + "en metros son: ");
		
		System.out.println(medidaEnMetros*10 + " decimetros");
		System.out.println(medidaEnMetros*100 + " centimetros");
		System.out.println(medidaEnMetros*1000 + " milimetros");
		
	
		
	

	}

}
