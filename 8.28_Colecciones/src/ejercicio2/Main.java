package ejercicio2;

import java.time.LocalDate;
import java.time.Year;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);

		LinkedList<Contacto> agenda = new LinkedList<>();
		Iterator <Contacto> iterador = agenda.iterator();
		
		Contacto nuevo = null;
		boolean acabar = false;
		boolean existe = false;
		
		do {
			System.out.println("Opción 1 Añadir Contacto: (1)" );
			System.out.println("Opción 2 Consultar Datos De Contacto (2)" );
			System.out.println("Opción 3 Mostrar Datos Ordenados Por Nombre (3)" );
			System.out.println("Opción 4 Contactos Dada Una Fecha De Nacimiento (4)" );
			System.out.println("Introduce \"Acabar\" para terminar la ejecucion");
			
			String eleccion = datos.next();
			
			// Ingresar contacto si el telefono no esta ya en la lista
			
			if(eleccion.equals("1")) {
				nuevo = generarContacto();
				existe = false;
				iterador = agenda.iterator();
				
				while(iterador.hasNext() && !existe) {
					Contacto numExistente =  iterador.next();
					if(nuevo.getTelefono().equals(numExistente.getTelefono())) {
						existe = true;
					}
					
				}
				
				if(!existe) {
					agenda.add(nuevo);
					System.out.println("Se ha añadido el siguiente contacto: " + nuevo);
				}else {
					System.out.println("El contacto ya existe");
				}
				
			// Dado un nombre, recorrer el LinkedList y mostrar todos los datos del contacto
				
			}else if(eleccion.equals("2")) {
				System.out.println("Introduce un nombre:");
				String nombre = datos.next();
				iterador = agenda.iterator();
				existe = false;
				
				if(!iterador.hasNext()) {
					System.out.println("No hay ningun contacto en la agenda");
				}
				
				
				while(iterador.hasNext() && !existe) {
					Contacto existente = iterador.next();
					if(existente.getNombre().equals(nombre)) {
						System.out.println(existente);
						existe = true;
					}
	
				}
				if(!existe) {
					System.out.println("El contacto no existe");
				}
				
			// Mostrar datos de todos los contactos ordenados por nombre	
			}else if(eleccion.equals("3")) {
				System.out.println("Antes de la ordenación por nombre:");
				
				for(Contacto x:agenda) {
					System.out.println(x);
				}
				
				Collections.sort(agenda);
				System.out.println("Tras la ordenación por nombre:");
				
				for(Contacto x:agenda) {
					System.out.println(x);
				}
				
				
			}else if(eleccion.equals("4")) {
				System.out.println("Introduce una fecha con el siguiente formato: \"yyyy-mm-dd\"");
				datos.next();
				String fecha = datos.nextLine();
				
				if(Pattern.matches(fecha, "^\\\\d{4}-\\\\d{2}-\\\\d{2}$")){
					LocalDate fechaIntro = LocalDate.parse(fecha);
					for(Contacto x:agenda) {
					}
					
				}else {
					System.out.println("El formato de la fecha no corresponde.");
				}
				
				
			}else if(eleccion.equals("Acabar")) {
				acabar = true;
			}
		}while(acabar == false);
		
	}

	// Metodo que genera un nombre aleatorio de entre 100 nombres
	
	public static String nombreAleatorio() {
		String[] nombres = {
	            "Alejandro", "María", "Carlos", "Lucía", "Jorge", "Sofía", "Miguel", "Valentina", "Daniel", "Isabella",
	            "David", "Camila", "Juan", "Natalia", "Luis", "Emma", "Fernando", "Martina", "Andrés", "Sara",
	            "Ricardo", "Paula", "Pablo", "Mía", "Roberto", "Daniela", "Diego", "Victoria", "Eduardo", "Jimena",
	            "Antonio", "Juliana", "Manuel", "Gabriela", "Óscar", "Carolina", "Raúl", "Antonella", "Javier", "Renata",
	            "Alberto", "Valeria", "Sergio", "Camila", "Hugo", "Daniela", "Enrique", "Mariana", "Francisco", "Ariana",
	            "Rubén", "Elena", "Felipe", "Bianca", "Adrián", "Florencia", "Tomás", "Catalina", "Gustavo", "Luciana",
	            "Martín", "Paola", "Iván", "Julieta", "Joaquín", "Emilia", "Alfonso", "Amelia", "Simón", "Olivia",
	            "Esteban", "Isabel", "Diego", "Claudia", "Victor", "Camila", "Ramón", "Margarita", "Julián", "Valentina",
	            "Mauricio", "Gabriela", "Santiago", "Renata", "Benjamín", "Victoria", "Leandro", "Daniela", "Emilio", "Marina",
	            "Ignacio", "Lorena", "Rodrigo", "Juliana", "Óliver", "Paula", "Sebastián", "Natalia", "Alejo", "Antonella",
	            "Fabián", "Isabella", "Cristian", "Emma", "Marcos", "Lucía", "Héctor", "Mía", "Germán", "Carolina"
	        };
		
		int num =(int) (Math.random() * 100);
		
		return nombres[num];
		
	}
	// Metodo que genera un numero de telefono de 9 digitos de manera aleatoria
	
	public static String generarTelefono() {
		String cadena = "";
		for(int i = 0; i < 9; i++) {
			int num =(int) (Math.random() * 10);
			 cadena = cadena + num;
		}
		return cadena;
	}
	
	// Metodo que genera un email dado su nombre
	
	public static String generarMail(String nombre) {
		return  nombre + "@gmail.com";
	}
	
	// Metodo para generar una fecha de nacimiento aleatoria tiene en cuenta el mes y si el año es o no bisiesto
	public static LocalDate generarFecha() {
		int anyo =(int) (1950 + Math.random()* (2025 - 1950 + 1));
		int mes = (int) (1 + Math.random() * 12);
		int dia = 0;
		
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			dia = (int) (1 + Math.random() *31);
			
		}else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			dia = (int) (1 + Math.random() * 30);
		
		}else if(mes == 2 && Year.isLeap(anyo)) {
			dia = (int) (1 + Math.random() * 29);
			
		}else {
			dia = (int) (1 + Math.random() * 28);
		}
		
		boolean creado = false;
		LocalDate fecha = null;
		do {
			try {
				 fecha = LocalDate.of(anyo, mes, dia);
				 creado = true;
			}catch(Exception ex1) {
				System.out.println(ex1.getMessage());
			}
			
		}while(creado == false);
		
		return fecha;
	}
	
	
	// Metodo que genera un contacto
	
	public static Contacto generarContacto() {
		
		Contacto nuevo;
		try {
			String nombre = nombreAleatorio();
			String tlf = generarTelefono();
			String email = generarMail(nombre);
			LocalDate fechaNacim = generarFecha();
			
			nuevo = new Contacto(nombre,tlf,email,fechaNacim);
		
		}catch(IllegalArgumentException ex1) {
			 nuevo = new Contacto("Paco","643829348","ejemplo@gmail.com",LocalDate.of(2000, 1, 1));
		}
		
		return nuevo;
		
	}
	
	
	
}
