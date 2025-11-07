package ejerciciosAdsMatrices;

public class MatricesAds6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 6. Crear y cargar una tabla de tamaño 10x10, mostrar la suma de cada fila y de cada columna.

		 */
		
		int [][] nums = new int [10][10];
		
		for (int i = 0; i < nums.length; i++) {
			for (int f = 0; f < nums.length; f++) {
				nums[i][f] = (int) Math.random() * 5;
			}
		}
	}

}
