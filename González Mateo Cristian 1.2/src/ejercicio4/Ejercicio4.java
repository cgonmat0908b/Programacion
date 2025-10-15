/*
 *Descripción: En este ejercicio creo una constante tipo Enum para definir las tallas de las ropas,
 *posteriormente muestro en pantalla un texto que explica el valor de las variables.
 *Autor: Cristian González Mateo
 *Fecha: 29/09/25
 */
package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		enum TallaRopa {Pequeña, Mediana, Grande, Extragrande}
		TallaRopa tallaS = TallaRopa.Pequeña;
		TallaRopa tallaM = TallaRopa.Mediana;
		TallaRopa tallaL = TallaRopa.Grande;
		TallaRopa tallaXL = TallaRopa.Extragrande;
		//Defino e inicializo las constantes de tipo enum.
		
		System.out.println("La talla S equivale a la talla: " + tallaS);
		System.out.println("La talla M equivale a la talla: " + tallaM);
		System.out.println("La talla L equivale a la talla: " + tallaL);
		System.out.println("La talla XL equivale a la talla: " + tallaXL);
		//Muestro en pantalla los valores de tipo enum junto a una frase
	}

}
