package ejerciciosAdsMatrices;

import java.util.Scanner;

public class MatricesAds11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 11-Se pretende realizar un programa para gestionar la lista de participaciones en una competición de
salto de longitud. El número de plazas disponible es de 10. Sus datos se irán introduciendo en el
mismo orden que vayan inscribiéndose los atletas. Diseñar el programa que muestre las siguientes
opciones:

1- Inscribir un participante.
2- Mostrar listado de datos.
3- Mostrar listado por marcas.
4- Finalizar el programa.

Si se selecciona 1, se introducirán los datos de uno de los participantes: Nombre, mejor marca del
2002, mejor marca del 2001 y mejor marca del 2000.
Si se elige la opción 2, se debe mostrar un listado por número de dorsal.
La opción 3 mostrará un listado ordenado por la marca del 2002, de mayor a menor.
Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se seleccione la
opción 4, que terminará el programa.


		 */
		Scanner datos = new Scanner(System.in);
		
		int [] atletas = new int [10];
		int numIntro = 0;
		
		String [] nombres = new String[10];
		int [] marca2002 = new int [10];
		int [] marca2001 = new int [10];
		int [] marca2000 = new int [10];
		

		do{
			
			System.out.println("1- Inscribir un participante.");
			System.out.println("2- Mostrar listado de datos.");
			System.out.println("3- Mostrar listado por marcas.");
			System.out.println("4- Finalizar el programa.");
			numIntro = datos.nextInt();
			
			if (numIntro == 1) {
				for(int i = 0; i < atletas.length; i++) {
						switch (i) {
						case 0:
							System.out.println("Introduce tu nombre:");
							nombres[i] = datos.nextLine();
							datos.nextLine();
							break;
							
						case 1:
							System.out.println("Introduce tu marca de 2002");
							marca2002[i] = datos.nextInt();
							break;
							
						case 2:
							System.out.println("Introduce tu marca de 2002");
							marca2001[i] = datos.nextInt();
							break;
							
						case 3:
							System.out.println("Introduce tu marca de 2002");
							marca2000[i] = datos.nextInt();
							break;
							
						}
				}
				
			}else if (numIntro == 2) {
				for (int i = 0; i < atletas.length; i++) {
					System.out.println("Los datos del atleta " + i + " son los siguientes:");
					System.out.println(nombres[i]);
					System.out.println(marca2002[i]);
					System.out.println(marca2001[i]);
					System.out.println(marca2000[i]);
					}
			}
			else if(numIntro == 3) {
				
			}
		}while (numIntro != 4);
		
	}

}
