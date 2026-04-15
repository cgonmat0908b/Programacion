package ejercicio2Repetir;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		LinkedList<Contacto> lista = new LinkedList<Contacto>();
		
		// Llenar Lista
		lista = llenarLista(lista);
		
		System.out.println("La lista de contactos es la siguiente: " + lista);
		
		// Apartado A
		System.out.println("Añade un contacto, indica nombre, telefono, email y fecha de nacimieto(yyyy-mm-dd):");
		
		Scanner datos = new Scanner(System.in);
		String nom = datos.next();
		String tlf = datos.next();
		String email = datos.next();
		LocalDate fechaNacim = LocalDate.parse(datos.next());
		
		Contacto usuario = new Contacto(nom,tlf,email,fechaNacim);
		
		if(añadir(lista, usuario)) {
			lista.add(usuario);
		}else {
			System.out.println("El telefono ya se encuentra en la lista");
		}
		
		// Apartado B
		
		System.out.println("Que nombre quieres consultar?");
		String nombre = datos.next();
		
		if(!buscarPorNombre(lista, nombre)) {
			System.out.println("Datos del contacto: " + datos(lista,nombre));
		}else {
			System.out.println("Ese nombre no existe en la lista de contactos");
		}
		
		// Apartado C
		// c) mostrar todos los datos de los contactos ordenados por nombre.
		Collections.sort(lista);
		
		System.out.println("Tras ordenar la lista por nombre se queda así :" + lista);
		
		
	}

	// Metodo que dado una lista de objetos Contacto, la rellena con objetos cuyo numero no exista ya en la lista
	
	public static LinkedList<Contacto> llenarLista(LinkedList<Contacto> lista){
		boolean existe = true;
		Contacto creado = new Contacto();
		
		for(int i = 0; i < 30; i++) {
			existe = true;
			while(existe) {
				creado = new Contacto();
				existe = false;
				for(Contacto x : lista) {
					if(x.getTelefono().equals(creado.getTelefono())) {
							existe = true;
					}
				}
			}
			if(!existe) {
				lista.add(creado);
			}
		}
		
		return lista;
		
	}
	// Metodo que dado una lista y un contacto comprueba si el numero de telefono ya existe y devuelve un boolean
	
	public static boolean añadir(LinkedList<Contacto> lista, Contacto ususario){
		boolean noExiste = true;
		for(Contacto x : lista) {
			if(x.getTelefono().equals(ususario.getTelefono())) {
				noExiste = false;
			}
		}
		return noExiste;
	}
	
	// Metodo que dado una lista y un contacto comprueba si el nombre ya existe y devuelve un boolean
	
	public static boolean buscarPorNombre(LinkedList<Contacto> lista, String nombre){
		boolean noExiste = true;
		for(Contacto x : lista) {
			if(x.getNombre().equals(nombre)) {
				noExiste = false;
			}
		}
		return noExiste;
	}
	
	public static Contacto datos(LinkedList<Contacto> lista, String nombre) {
		Contacto contacto = null;
		
		for(Contacto x : lista) {
			if(x.getNombre().equals(nombre)) {
				contacto = new Contacto(x.getNombre(), x.getEmail(), x.getTelefono(), x.getFechaNacim());
			}
		}
		return contacto;
	}
	
	
	
}
