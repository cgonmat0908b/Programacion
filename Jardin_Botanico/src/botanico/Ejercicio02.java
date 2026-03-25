package botanico;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/** Ejercicio 2. Búsqueda de especies de plantas populares
 * @author Profesor
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        
        // Variables de entrada
        
        // Variables auxiliares
    	Iterator<String> iterador1;
    	Iterator<String> iterador2;
    	
    	int indicePos = 0;
    	
    	String planta1;
    	String planta2;
    	
    	
        // Variables de salida
    	LinkedList<String> lista1 = new LinkedList<String>();
    	LinkedList<String> lista2 = new LinkedList<String>();

    	ArrayList<String> popularesLista = new ArrayList<String>();
    	
    	HashSet<String> popularesSet = new HashSet<>();
    	
    	HashSet<Integer> posicionesPopulares = new HashSet<Integer>();
        
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        System.out.println("BÚSQUEDA DE ESPECIES DE PLANTAS POPULARES");
        System.out.println("-----------------------------------------");
        
        
        // No hay, pues se usa un número fijo de elementos aleatorios

        // Rellenamos la lista con aleatorios hasta que haya CANTIDAD_ESPECIES_PLANTAS
        for(int i = 0; i < 10; i++) {
        	lista1.add(Utilidades.especiePlantaAleatoria());
        	lista2.add(Utilidades.especiePlantaAleatoria());
        }
        
        //----------------------------------------------
        //               Procesamiento
        //----------------------------------------------

        // Recorremos a la vez las dos listas

        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------
        
        // Apartado 3.1 Contenido inicial de ambas listas:
        System.out.println("Listas sin modificar:");
        System.out.println();
        
        System.out.println("Lista 1:");
        for(String x : lista1) {
        	System.out.println(x);
        }
        System.out.println();
        
        System.out.println("Lista 2:");
        for(String x : lista2) {
        	System.out.println(x);
        }
        System.out.println();
        
     // Apartado 2.1, 2.2, 2.3, 2.4
        
        // Sin iteradores
        
      /*  for(int i = 0; i < lista1.size(); i++) {
        	if(lista1.get(i).equals(lista2.get(i))) {
        		// 2.1 
        		popularesLista.add(lista1.get(i));
        		
        		// 2.2
        		popularesSet.add(lista1.get(i));
        		
        		// 2.3
        		posicionesPopulares.add(Integer.valueOf(i));
        		
        		
        		// 2.4
        		String popular ="*" + lista1.get(i) + "*";
        		
        		lista1.remove(i);
        		lista2.remove(i);
        		
        		lista1.add(i, popular);
        		lista2.add(i, popular);
        	}
        } */
        
        // Con iteradores
        
        iterador1 = lista1.iterator();
        iterador2 = lista2.iterator();
        
        while(iterador1.hasNext() && iterador2.hasNext()) {
        	
        	planta1 = iterador1.next();
        	planta2 = iterador2.next();
        	
        	if(planta1.equals(planta2)) {
        		// 2.1 
        		popularesLista.add(planta1);
        		
        		// 2.2
        		popularesSet.add(planta1);
        		
        		// 2.3
        		posicionesPopulares.add(indicePos);
        		
        		// 2.4 Marcar las populares en cada lista con * xxxx *
        		lista1.set(indicePos, "* " + lista1.get(indicePos) + " *");
        		lista2.set(indicePos, "* " + lista2.get(indicePos) + " *");
        		
        		indicePos++;
        		
        	}
        }
        
        

        // Apartado 3.2 Contenido final de la primera lista
        System.out.println("Tras modificar las listas:");
        System.out.println();
        
        System.out.println("Lista 1:");
        System.out.println();
        
        for(String x : lista1) {
        	System.out.println(x);
        }
        System.out.println();
        
        // Apartado 3.3 Contenido final de la segunda lista
        
        System.out.println("Lista 2:");
        
        for(String x : lista2) {
        	System.out.println(x);
        }
        System.out.println();
        
        // Apartado 3.4 Lista de especies de plantas populares
        System.out.println("Lista de especies populares: ");
        System.out.println();
        
        for(String x : popularesLista) {
        	System.out.println(x);
        }
        System.out.println();
        
        // Apartado 3.5 Lista de posiciones populares 
        System.out.println("Lista de posiciones populares: ");
        System.out.println();
        
        for(Integer x : posicionesPopulares) {
        	System.out.println(x);
        }
        System.out.println();
        
        // Apartado 3.6 Conjunto de especies de plantas populares
        System.out.println("Conjunto de plantas populares: ");
        System.out.println();
        
        for(String x : popularesSet) {
        	System.out.println(x);
        }
    }
}