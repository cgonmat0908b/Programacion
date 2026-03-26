package botanico;

import java.util.ArrayList;
import java.util.Collections;

import comparators.ComparadorEspeciePlantaPorLongitud;
import comparators.ComparadorEspeciePlantaPorNombre;

/** Ejercicio 5. Ordenación de especies de plantas (por nombre y longitud)
 * @author Profesor
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        
        // Constantes
        
        // Variables de entrada
        
        // Variables auxiliares
    	String plantaRandom;
    	int contador = 0;
    	
        // Variables de salida
    	ArrayList<String> especies5 = new ArrayList<String>();

        
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        
        System.out.println("ORDENACIÓN DE ESPECIES DE PLANTAS");
        System.out.println("---------------------------------");

        
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------

        // Rellenar la lista con 5 especies aleatoria
        
        while(contador < 5) {
        	plantaRandom = Utilidades.especiePlantaAleatoria();
        	if(!especies5.contains(plantaRandom)) {
        		especies5.add(plantaRandom);
        		contador++;
        	}
        }
        
        // Mostrar la lista nada más creada
        
        System.out.println("Contenido inicial:");
        System.out.println();
        
        for(String x : especies5) {
        	System.out.println(x);
        }
        System.out.println();
        
        // Ordenacion por nombre
        Collections.sort(especies5, new ComparadorEspeciePlantaPorNombre());
         
        // Tras la ordenacion por nombre:
        System.out.println("Tras la ordenación por nombre: ");
        System.out.println();

        for(String x : especies5) {
        	System.out.println(x);
        }
        System.out.println();
        
        // Ordenación por longitud:
        Collections.sort(especies5, new ComparadorEspeciePlantaPorLongitud());
        
        // Tras la ordenación por longitud
        System.out.println("Tras la ordenación por longitud: ");
        System.out.println();
        
        for(String x : especies5) {
        	System.out.println(x);
        }
        
    }
}