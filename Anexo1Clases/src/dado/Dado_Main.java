package dado;

public class Dado_Main {

	public static void main(String[] args) {

	    // Crear un dado válido (6 caras por defecto)
	    Dado dado1 = new Dado();

	    System.out.println("Dado por defecto:");
	    System.out.println(dado1);

	    // Lanzar el dado varias veces
	    System.out.println("Lanzamientos:");
	    for (int i = 0; i < 5; i++) {
	        System.out.println("Resultado: " + dado1.lanzar());
	    }

	    System.out.println("Después de lanzar:");
	    System.out.println(dado1);

	    System.out.println("--------------------------------");

	    // Crear un dado válido con 20 caras
	    Dado dado2 = new Dado((byte) 20);

	    System.out.println("Dado de 20 caras:");
	    System.out.println("Resultado: " + dado2.lanzar());

	    System.out.println("--------------------------------");

	    // Intentar crear un dado con valor inválido
	    try {
	        Dado dadoInvalido = new Dado((byte) 5); // 5 no es válido
	    } catch (IllegalArgumentException e) {
	        System.out.println("Error al crear dado inválido:");
	        System.out.println(e.getMessage());
	    }
	}
}