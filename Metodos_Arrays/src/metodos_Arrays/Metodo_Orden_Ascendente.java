package metodos_Arrays;

import java.util.Arrays;

public class Metodo_Orden_Ascendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {5, 2, 8, 1, 3};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros)); 
        // Salida: [1, 2, 3, 5, 8]
	}

}
