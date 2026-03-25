package botanico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;


/** Ejercicio 4. Clasificación de especies de plantas coincidentes 
 * (con el mismo nombre y en la misma posición)
 * @author Profesor
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------

        // Constantes
        
        // Variables de entrada
        
        // Variables auxiliares
    	ArrayList<String> plantas1 = new ArrayList(20);
    	ArrayList<String> plantas2 = new ArrayList(20);
    	ArrayList<Integer> listaEnteros;
    	
    	Iterator<String> iterador1;
    	Iterator<String> iterador2;
    	
    	String planta1;
    	String planta2;
    	
    	TreeMap<String, ArrayList<Integer>> plantaNumeros = new TreeMap<String, ArrayList<Integer>>();
        
        // Variables de salida

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        
        System.out.println("CLASIFICACIÓN DE COINCIDENTES");
        System.out.println("-----------------------------");

        
        //----------------------------------------------
        //                 Procesamiento
        //----------------------------------------------
        
        // 1 Rellenar las listas
        for(int i = 0; i < 20; i++) {
        	plantas1.add(Utilidades.especiePlantaAleatoria());
        	plantas2.add(Utilidades.especiePlantaAleatoria());
        }
        iterador1 = plantas1.iterator();
        iterador2 = plantas2.iterator();
        
        // 3 Inpeccionar ambas listas
        for(int i = 0; i < 20; i++) {
        	if(plantas1.get(i).equals(plantas2.get(i))) {
        		
        		if(!plantaNumeros.containsKey(plantas1.get(i))) {
        			listaEnteros = new ArrayList<Integer>();
        			plantaNumeros.put(plantas1.get(i), listaEnteros);	
        			
        		}else {
        			listaEnteros = plantaNumeros.get(plantas1.get(i));
        			listaEnteros.add(Integer.valueOf(i));	
        		}
        	}
        }

        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------
        
        // Mostrar las listas
        while(iterador1.hasNext()) {
        	planta1 = iterador1.next();
        	planta2 = iterador2.next();
        	
        	System.out.println("Lista 1 : " + planta1);
        	System.out.println("Lista 2 : " + planta2 + " \n");
        }
        
        // Mostrar el Map
        for(String x : plantaNumeros.keySet()) {
        	System.out.println();
        	System.out.print("En la clave " + x + " del mapa, se encuentra la siguiente lista de enteros: ");
        	for(Integer i : plantaNumeros.get(x)) {
        		System.out.print(i +", " );
        	}
        }

    }
}