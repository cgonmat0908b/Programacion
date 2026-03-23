package botanico;

import java.util.HashSet;

/**
 * Ejercicio 1. Creando jardín botánico
 * @author Profesor
 */
public class Ejercicio01 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        
        // Variables de entrada
    	
        // Variables auxiliares
    	int numAnyadidos1 = 0;
    	int numAnyadidos2 = 0;
        
        // Variables de salida
    	HashSet<String> cincoPlantas1 = new HashSet<String>();
    	HashSet<String> cincoPlantas2 = new HashSet<String>();
        
    	HashSet<String> union1y2 = new HashSet<String>();
    	
    	HashSet<String> interseccion = new HashSet<String>();
    	
    	HashSet<String> diferencia = new HashSet<String>();
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        
        // No hay, pues se usa un número fijo de elementos aleatorios
        
        System.out.println("CONJUNTOS DE ESPECIES DE PLANTAS");
        System.out.println("--------------------------------");

        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------
        
        // Rellenamos los conjuntos con especies de plantas aleatorias hasta que haya CANTIDAD_ESPECIES_PLANTAS
        do {
        	if(numAnyadidos1 < 5 && cincoPlantas1.add(Utilidades.especiePlantaAleatoria())) {
        		numAnyadidos1++;
        	}
        	
        	if(numAnyadidos2 < 5 && cincoPlantas2.add(Utilidades.especiePlantaAleatoria())) {
        		numAnyadidos2++;
        	}
        	
        }while(numAnyadidos1 < 5 || numAnyadidos2 < 5);
        
        // Unión de los dos conjuntos
        
        try {
        	union1y2.addAll(cincoPlantas1);
        	union1y2.addAll(cincoPlantas2);
        	
        }catch(Exception ex) {
        	System.out.println(ex.getMessage());
        	
        }
        
        // Intersección de los conjuntos
        try {
        	interseccion.addAll(cincoPlantas1);
        	interseccion.retainAll(cincoPlantas2);
        	
        }catch(NullPointerException ex1) {
        	System.out.println(ex1.getMessage());
        	
        }catch(UnsupportedOperationException ex2) {
        	System.out.println(ex2.getMessage());
        	
        }catch(ClassCastException  ex3) {
        	System.out.println(ex3.getMessage());
        	
        }
        
        
        // Diferencia de los conjuntos
        try {
        	diferencia.addAll(cincoPlantas2);
        	diferencia.removeAll(cincoPlantas1);
        	
        }catch(NullPointerException ex1) {
        	System.out.println(ex1.getMessage());
        	
        }catch(UnsupportedOperationException ex2) {
        	System.out.println(ex2.getMessage());
        	
        }catch(ClassCastException  ex3) {
        	System.out.println(ex3.getMessage());
        	
        }
        
        
        //----------------------------------------------
        //              Salida de Resultados 
        //----------------------------------------------
        
        // Recorremos el conjunto y mostramos su contenido por pantalla
        
        //Contenido del primer apartado
        for(String x : cincoPlantas1){
        	System.out.println("Set 1: " + x);
        }
        System.out.println();
        
        for(String i : cincoPlantas2){
        	System.out.println("Set 2: " + i);
        }
        System.out.println();
        
        // Contenido del segundo apartado
        for(String f : union1y2) {
        	System.out.println("Set 3: " + f);
        }
        System.out.println();
        
        // Contenido del tercer apartado, intersección
        for(String x : interseccion) {
        	System.out.println("Intersección: " + x);
        }
        System.out.println();
        
        // Contenido del cuarto apartado, Diferencia de los conjuntos.
        for(String x : diferencia) {
        	System.out.println("Diferencia: " + x);
        }
    }
}