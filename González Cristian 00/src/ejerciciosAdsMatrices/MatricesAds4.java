package ejerciciosAdsMatrices;

public class MatricesAds4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 4. Crear y cargar una tabla de tamaño 3x3, trasponerla y mostrarla.
		 * 
		 * 
		 */
		
		//TRASPONER ES PASAR LO QUE HAY EN tabla [i][f] por ejemplo [0][4,8,9]			pasaria a [0][4,9,56]
		//                                              			[1][9,15,33]		pasaria a[1][8,15,88]
		//															[2][56,88,63]		pasaria a [2][9,33,63]
		
		int [][] tabla = new int [3][3];
		int aux;
		for (int i = 0; i < tabla.length; i++) {
			for (int f = 0; f < tabla[i].length; f++) {
				tabla[i][f] = (int)(Math.random() * 50);
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			for (int f = 0; f < tabla[i].length; f++) {
				System.out.println("La tabla sin modificar es: " + i + " " + " " + f  + " " + tabla[i][f]);
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			for(int f = 0; f < tabla[i].length; f++) {
				aux = tabla[i][f];
				tabla[i][f] = tabla[f][i];
				tabla [f][i] = aux;
			}	
		}
		for (int i = 0; i < tabla.length; i++) {
			for (int f = 0; f < tabla[i].length; f++) {
				System.out.println("El valor en la posición " + i + " en la posicion " + f + " es " + tabla[i][f]);
			}
		}
			
	}

}
