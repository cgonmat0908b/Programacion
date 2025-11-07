package ejerciciosAdicionalesVectores;

import java.util.Scanner;

public class VectoresAds6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*6. Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la
forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
*/
		int[]tabla1 = new int[12];
		int []tabla2 = new int[12];
		int [] tabla3 = new int [24];
		int contadorNums = 0, contadorInterior = 0;
		
		Scanner datos = new Scanner(System.in);
		
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = (int) (Math.random() * 40);
			tabla2[i] = (int) (Math.random() * 80);
		} 
		
		while(contadorNums < 12) {
			for(int a = 0; a < 3; a++) {
				tabla3[contadorInterior] = tabla1[a + contadorNums];
				contadorInterior++;
			}
		for (int x = 0; x < 3; x++) {
			tabla3[contadorInterior] = tabla2[contadorNums + x];
			contadorInterior++;
		}
		contadorNums += 3;
		}
			
		for (int z = 0; z < tabla3.length; z++ ) {
			System.out.println(tabla3[z]);
		}
	}

}
