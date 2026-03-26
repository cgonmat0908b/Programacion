package recorrerFile;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File fichero = new File("Numeros.txt");
		
		try {
			Scanner datos = new Scanner(fichero);
			
			while(datos.hasNext()) {
				int num = datos.nextInt();
				System.out.println("El valor leído es: " + num);
			}
			datos.close();
				
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
