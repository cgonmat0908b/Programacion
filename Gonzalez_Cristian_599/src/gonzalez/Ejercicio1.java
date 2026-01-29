/* Autor: Cristian González Mateo
 * Fecha: 28/01/2025 
 * Descripción: Programa que dado una matriz de 3x12 posiciones, la rellena con valores aleatorios,
 * y a través de métodos calcula los valores que se requieren
 */

package gonzalez;

public class Ejercicio1 {

	public static void main(String[] args) {

		int[][] sucursalesMeses = {
				{2500,4500,1500,7500,8000,9000,10000,11500,12500,9500,8500,4500},
				{7500,4500,2500,7500,9000,9000,12500,11500,7500,9500,6500,4500},
				{3500,9500,12500,17500,19000,5000,1500,15000,7500,9500,6500,4500}
		};
		boolean numValido = false;

		// Apartado 1 
		System.out.printf("El total de las ventas de este año es: %d %n",totalAnual(sucursalesMeses));
		
		//Apartado 2
		System.out.printf("El mejor mes fue %s %n", mejorMes(sucursalesMeses));
		
		//Apartado 3
		System.out.printf("La sucursal con más ventas es %s %n", sucursalMaxVenta(sucursalesMeses));
		
	}

	//Metodo que calcula el total de las ventas de las sucursales y los meses
	
	public static int totalAnual(int[][] sucursalesMeses) {
		int[] total = new int[3];
		int totalCompleto = 0;
		
		for(int sucursal = 0; sucursal < sucursalesMeses.length; sucursal++) {
			for(int meses = 0; meses < sucursalesMeses[sucursal].length; meses++) {
				total[sucursal] = sucursalesMeses[sucursal][meses] + total[sucursal];
			}
			
		}
		
		for(int i = 0; i < total.length; i++) {
			totalCompleto = total[i] + totalCompleto;
		}
		return totalCompleto;
	}
	
	//Método que calcula cual fue el mejor mes de las ventas acumuladas de las 3 sucursales
	
	public static String mejorMes(int[][] sucursalesMeses) {
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		int[] mesesVentas = new int[12];
		int acum = 0;
		int mejorMes = 0;
		
		for(int mes = 0; mes < sucursalesMeses[0].length; mes++) {
			for(int sucursal = 0; sucursal < sucursalesMeses.length; sucursal++) {
				mesesVentas[mes] = sucursalesMeses[sucursal][mes] + mesesVentas[mes];
			}
		}
		for(int i = 0; i < mesesVentas.length; i++) {
			if(mesesVentas[i] > acum) {
				acum = mesesVentas[i];
				mejorMes = i;
			}
			
		}
		return meses[mejorMes];
	}
	
	// Metodo que dada una matriz calcula la sucursal que más vendió durante el año
	
	public static String sucursalMaxVenta(int[][] sucursalesMeses) {
		int[] totalSucursal = new int[3];
		int sucursalMax = 0;
		int acum;
		String[] sucursales = {"Málaga", "Sevilla", "Granada"};
		
		for(int sucursal = 0; sucursal < sucursalesMeses.length; sucursal++) {
			for(int mes = 0; mes < sucursalesMeses[sucursal].length; mes++) {
				totalSucursal[sucursal] = sucursalesMeses[sucursal][mes] + totalSucursal[sucursal];
			}
		}
		acum = totalSucursal[0];
		for(int i = 0; i < totalSucursal.length; i++) {
			if(totalSucursal[i] > acum) {
				acum = totalSucursal[i];
				sucursalMax = i;
			}
		}
		return sucursales[sucursalMax];
	}
}
