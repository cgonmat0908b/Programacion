package ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);
		ArrayList<Persona> lista = new ArrayList();
		
		// Apartado A  cantidad de personas de Un sexo determinado solicitado al usuario.
		System.out.println("Introduce un masculino o femenino:");
		String sex = datos.nextLine();
		
		System.out.println("El número de personas de sexo " + sex + " es:" + numSexo(lista, sex));
		
		// Apartado B
		System.out.println("Introduce un el estado civil (soltero, casado, viudo, divorciado):");
		String estadoCivil = datos.nextLine();
		
		System.out.println("El número de personas con estado civil " + estadoCivil + " es:" + numEstadoCivil(lista, estadoCivil));
		
		// Apartado C
		System.out.println("Introduce el año por el que quieres buscar");
		int anyo = datos.nextInt();
		datos.nextLine();
		
		System.out.println("El número de personas nacidas en la decada del año " + anyo + " es:" + numPersonasRangoEdad(lista, anyo));
		
		// Apartado D cantidad de personas de un Sexo y estado civil determinado solicitado al usuario.
		System.out.println("Introduce un el estado civil (soltero, casado, viudo, divorciado):");
		estadoCivil = datos.nextLine();
		
		System.out.println("Introduce el sexo (masculino, femenino):");
		sex = datos.nextLine();	
		
		System.out.println("El número de personas con estado civil " + estadoCivil + " y sexo" + sex +  " es:" + numPersonasSexoCivil(lista, estadoCivil, sex));
		
	}
	
	// Metodo que recorre un ArrayList<Persona> y devuelve el numero de personas de un sexo determinado
	
	public static int numSexo(ArrayList<Persona> lista,String sexo ) {
		int contador = 0;
		
		if(sexo.equals("masculino")) {
			for(Persona x : lista) {
				if(!x.isSexo()) {
					contador++; 
				}
			}
			
		}else if(sexo.equals("femenino")) {
			for(Persona x : lista) {
				if(x.isSexo()) {
					contador++;
				}
			}
		}
		
		return contador;
		
	}

	// cantidad de personas de Un estado civil determinado solicitado al usuario.
	
	public static int numEstadoCivil(ArrayList<Persona> lista,String estadoCivil){
		int contador = 0;
		
		if(estadoCivil.equals("soltero")) {
			for(Persona x : lista) {
				if(x.getEstadoCivil().equals("soltero")) {
					contador++; 
				}
			}
			
		}else if(estadoCivil.equals("casado")){
			for(Persona x : lista) {
				if(x.getEstadoCivil().equals("casado")) {
					contador++; 
				}
			}
			
		}else if(estadoCivil.equals("viudo")) {
			for(Persona x : lista) {
				if(x.getEstadoCivil().equals("viudo")) {
					contador++; 
				}
			}
			
		}else if(estadoCivil.equals("divorciado")) {
			for(Persona x : lista) {
				if(x.getEstadoCivil().equals("divorciado")) {
					contador++; 
				}
			}
		}
		return contador;
	}
	
	// cantidad de personas Un rango de edad determinado solicitado al usuario (por décadas).
	// Por ejemplo, el usuario introducirá 1995 y mostrará las personas nacidas entre 1990 y 1999
	
	public static int numPersonasRangoEdad(ArrayList<Persona> lista,int rangoEdad) {
		int inicioDecada = 10 * rangoEdad / 10 ;
		int finDecada = inicioDecada + 9;
		int contador = 0;
		
		for(Persona x : lista) {
			int anyoNacimiento = LocalDate.now().getYear() - x.getEdad();
			
			if(anyoNacimiento >= inicioDecada && anyoNacimiento <= finDecada) {
				contador++;
			}
		}
		return contador;
		
	}
	
	// cantidad de personas de un Sexo y estado civil determinado solicitado al usuario.
	
	public static int numPersonasSexoCivil(ArrayList<Persona> lista,String estadoCivil, String sexo ) {
		boolean sex = false;
		int contador = 0;
		
		if(sexo.equals("masculino")) {
			sex = false;
			
		}else if(sexo.equals("femenino")) {
			sex = true;
			
		}
		
		for(Persona x : lista) {
			if(x.getEstadoCivil().equals(estadoCivil) && x.isSexo() == sex) {
				contador++;
			}
		}	
		return contador;
	}
	
}
