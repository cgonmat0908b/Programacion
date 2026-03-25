package botanico;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/** Ejercicio 3. Calendario de especies de plantas
 * @author Profesor
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        
        // Constantes
        
        // Variables de entrada
        
        // Variables auxiliares
    	int contador = 0;
        LocalDate fecha = LocalDate.now();
        String planta;
        
        
        
        // Variables de salida
    	TreeMap<LocalDate, String> diaPlanta = new TreeMap<LocalDate, String>();
    	String plantaMapa = "";
        

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        
        System.out.println("CALENDARIO DE ESPECIES DE PLANTAS");
        System.out.println("---------------------------------");
        
        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------<
        
        // Apartado  2 rellenar el map 
        try{
        	while(contador < 7) {
        		planta = Utilidades.especiePlantaAleatoria();
        		
        		if(!diaPlanta.containsValue(planta)){
        			diaPlanta.put(fecha, planta);
        			fecha = fecha.plusDays(1);
        			contador++;
        		}
        	}
        	
        }catch(ClassCastException ex1) {
        	System.out.println(ex1.getMessage());
        	
        }catch(NullPointerException ex1) {
        	System.out.println(ex1.getMessage());
        	
        }catch(Exception ex1) {
        	System.out.println(ex1.getMessage());
        	
        }
        
        
        
   
        //----------------------------------------------
        //           Salida de resultados
        //----------------------------------------------
        
        // 3.3
        for(LocalDate f : diaPlanta.keySet()) {
        	plantaMapa = diaPlanta.get(f);
        	System.out.println("En la fecha: " + f + " se vende la planta; " + plantaMapa);
        	
        }
 
    }
}