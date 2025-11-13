package ejerciciosAdsMatrices;

public class MatricesAds6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 6. Crear y cargar una tabla de tamaño 10x10, mostrar la suma de cada fila y de cada columna.

		 */
		int [] sumaColums = new int [10];
		int [][] nums = new int [10][10];
		int sumaFilas = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sumaFilas = sumaFilas + i;
			
			for (int f = 0; f < nums.length; f++) {
				nums[i][f] = (int) (Math.random() * 50);
				sumaColums[i] = sumaColums[i] + nums[i][f];
			}
		}
		
		for (int w = 0; w < nums.length; w++) {
			System.out.println("En la fila " + w + " la suma de la columna es: " + sumaColums[w]);

		}
		System.out.println("La suma de las filas es: " + sumaFilas);
	}

}
