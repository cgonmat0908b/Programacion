package herencia;

import java.time.LocalDate;


public class MainProductos {

	public static void main(String[] args) {
		
		Frescos embutido = null;
		Frescos embutido2 = null;
		
		
		// Inicializacion de objeto de la clase Frescos
		try {
			
			// Parametros
			String nombre = "Mortadela";
			LocalDate fechaCaducidad = LocalDate.of(2026, 02, 15);
			int numLote = 1;
			LocalDate fechaEnvasado = LocalDate.now();
			String paisOrigen = "España";
			embutido = new Frescos(nombre,fechaCaducidad,numLote,fechaEnvasado,paisOrigen);
			
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			
		}
		
		//Muestra de datos
		System.out.println(embutido.toString());
		
		// Inicializacion de objeto de la clase Frescos
		
		try {
			
			// Parametros
			String nombre = "Salchichon";
			LocalDate fechaCaducidad = LocalDate.of(2026, 03, 21);
			int numLote = 2;
			LocalDate fechaEnvasado = LocalDate.of(2026,02,5);
			String paisOrigen = "España";
			embutido2 = new Frescos(nombre,fechaCaducidad,numLote,fechaEnvasado,paisOrigen);
			
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			
		}
		
		//Muestra de datos
		System.out.println(embutido2.toString());
		
		
		
		// Inicialización de objeto de la clase Refrigerados
		Refrigerados lacteo = null;
		try {
			String nombre = "Yogurt";
			LocalDate fechaCaducidad = LocalDate.of(2026, 05, 10);
			int numLote = 3;
			String codSupervision = "AE554-213";
			byte tempMinConservacion = 4; 
			LocalDate fechaConsumo = LocalDate.of(2026, 05, 16);
			
			lacteo = new Refrigerados(nombre,fechaCaducidad,numLote,codSupervision,tempMinConservacion,fechaConsumo);
		}catch(IllegalArgumentException ex1){
			System.out.println(ex1.getMessage());
		}
		
		//Muestra de datos
		System.out.println(lacteo.toString());
		
		
		// Inicialización de objeto de la clase congelados
		
		Congelados sanJacobos = null;
		
		try {
			String nombre = "SanJacobos";
			LocalDate fechaCaducidad = LocalDate.of(2026, 05, 10);
			int numLote = 4;
			byte tempCongelacion = -15;
			short tiempoMaxCongelado = 2;
			
			sanJacobos = new Congelados(nombre,fechaCaducidad,numLote,tempCongelacion,tiempoMaxCongelado);
		}catch(IllegalArgumentException ex1){
			System.out.println(ex1.getMessage());
		}
		
		// Muestra de datos
		
		System.out.println(sanJacobos.toString());
		
		
		// Uso de metodo caducado
		if(sanJacobos.isCaducado() == true) {
			System.out.println("Producto caducado");
		}else {
			System.out.println("Producto no caducado");
		}
		
		// Uso de metodo diasRestantes
		System.out.printf("Quedan %d dias para que caduque",sanJacobos.diasRestantes());
		
	}	
	
}

