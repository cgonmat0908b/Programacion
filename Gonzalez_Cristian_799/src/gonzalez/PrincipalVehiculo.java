/* Fecha: 25/03/2026
 * Autor: Cristian González Mateo
 * Descripción: Programa que usara las clases Camión y Furgoneta, hisja de Vehiculo,
 * para inicializar e instanciar objetos de estas clases y usar los metodos correspondientes
 * 
 */


package gonzalez;

import java.time.LocalDate;

public class PrincipalVehiculo {
    public static void main(String[] args) {

       

        // 1. Crear camión 20tn
    	System.out.println("Apartado 1");
    	float toneladas = 20;
        Camion toneladas20 = new Camion(toneladas);
        
        System.out.println(toneladas20);
        System.out.println();

        // 2. Calcular precio 3 días
        
        System.out.println("Apartado 2");
       	double coste = toneladas20.costeOperativo(3);
       	System.out.println("El coste operativo de 3 dias para un camión es de: " + coste );

       	System.out.println();
       	
        // 3. Crear furgoneta con volumen máx. y refrigerado
       	
       	System.out.println("Apartado 3:");
       	Entrada datos = new Entrada();
       
       	System.out.println("Introduce el volumen maximo");
       	float volumen =(float) (datos.real());
       
       	System.out.println("Introduce si tiene o no refrigeracion(Si, No):");
       	String refri = datos.cadena();
       	boolean refrigeracion = false;
       
       	if(refri.equals("Si")) {
    	   refrigeracion = true;
       	}else {
    	   	refrigeracion = false;
       	}
       
       	Furgoneta volumenRefri = new Furgoneta(volumen, refrigeracion);
       
       	System.out.println(volumenRefri);

       	System.out.println();
        // 4. Calcular precio 5 días
       	System.out.println("Apartado 4:");
       	
       	double costeFurgo = volumenRefri.costeOperativo(5);
       	System.out.println("El coste operativo del la furgoneta es: " + costeFurgo);
        

       	System.out.println();
       	
        // 5. Modificar ITV camión
       	
    	System.out.println("Apartado 5:");
    	String itv = "";
    	
    	if(volumenRefri.isItv()) {
    		itv = "Si";
    	}else {
    		itv = "No";
    	}
    	
    	System.out.println("Antes de la modificación de la ITV: " + itv);
    	
    	volumenRefri.setItv(true);
    	
    	if(volumenRefri.isItv()) {
    		itv = "Si";
    	}else {
    		itv = "No";
    	}
    	
    	System.out.println("Tras la modificación de la ITV: " + itv);
        

    	System.out.println();
    	
        // 6. Calcular precio 3 días
    	System.out.println("Apartado 6:");
    	
    	costeFurgo = volumenRefri.costeOperativo(3);
    	System.out.println("El coste operativo del la furgoneta es: " + costeFurgo);

    	System.out.println();
    	
        // 7. Indica si la furgoneta tiene refrigeración
    	System.out.println("Apartado 7:");
    	
    	boolean refrigeracionFurgo = volumenRefri.isRefrigeracion();
    	String refriFurgo = "";
    	
    	if(refrigeracionFurgo) {
    		refriFurgo = "Tiene refrigeracion";
    	}else {
    		refriFurgo = "No tiene refrigeracion";
    	}
    	
    	System.out.println(refriFurgo);
        

    	System.out.println();
    	
        // 8. Modifica el valor del precio por día de la furgoneta
    	System.out.println("Apartado 8:");
    	
    	System.out.println("Previo a modificar el precio por dia: " + volumenRefri.getPrecioPorDia());
    	volumenRefri.setPrecioPorDia(30);
    	System.out.println("Tras modificar el precio por dia: " + volumenRefri.getPrecioPorDia());
    	
    	System.out.println();
    	
        // 9. Camión por método (el objeto debe ser creado por un método
    	
    	// Incompleto
    	
       /* System.out.println("Introduce los siguientes valores: Matricula, FechaMatriculación(yyyy-mm-dd), Itv(Si,No), Precio por dia, Capacidad del camión");
    	String matricula = datos.cadena();
    	
    	String fecha = datos.cadena();
    	LocalDate fechaMatriculacion = LocalDate.parse(fecha);
    	
    	String itvCamionS = datos.cadena();
    	boolean itvCamion = false;
    	
    	if(itvCamionS.equals("Si")) {
    		itvCamion = true;
    	}else {
    		itvCamion = false;
    	}
    	float precioDia =(float) (datos.real());
    	
    	float capacidad = (float) (datos.real());
        
    	System.out.println();
    	*/
        // 10. Número total vehículos
    	System.out.println("Apartado 10:");
        System.out.println("El numero de vehiculos creados es: " +  Vehiculo.numVehiculos);
    }

  // Incompleto
  /*  public static Camion generarCamion(String matricula, LocalDate fechaMatriculacion, boolean itv, float precioPorDia, float capacidad) {
    	try {
    		
    	}catch()
    } */
}