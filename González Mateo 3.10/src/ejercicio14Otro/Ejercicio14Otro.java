package ejercicio14Otro;

public class Ejercicio14Otro {

	public static void main(String[] args) {
		int[] numeros = new int [55];
        int posicion = 0;
        
        for(int i = 0; i < 11; i++)
        {
            for(int j = 0; j < i; j++)
            {
                numeros[posicion] = i;
                posicion++;
            }
        }
        
        for(int i = 0; i < (numeros.length); i++)
        {
            System.out.println("El valor en la posición " + i + " es " + numeros[i]);
        }
    }
}