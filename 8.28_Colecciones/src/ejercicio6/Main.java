package ejercicio6;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashMap<String,Alumno> listaCodAlumn = new HashMap<String,Alumno>(); 
		Scanner datos = new Scanner(System.in);
		
		// Apartado A Incorporara un nuevo Alumno
		System.out.println("Introduce los siguientes datos del Alumno:");
		
		System.out.println("Codigo de alumno");
		String codAlum = datos.nextLine();
		
		System.out.println("Apellidos");
		String apellidos = datos.nextLine();
		
		System.out.println("Nombre");
		String nom = datos.nextLine();
		
		System.out.println("Dirección");
		String direccion = datos.nextLine();
		
		System.out.println("Tlf");
		String tlf = datos.nextLine();
		
		System.out.println("Código del ciclo");
		String codCiclo = datos.nextLine();
		
		System.out.println("Cantidad de cursos aprobados");
		byte numCursos = datos.nextByte();
		
		datos.nextLine();
		
		System.out.println("Fecha de ingreso(yyyy-mm-dd)");
		LocalDate fecha = LocalDate.parse(datos.next());
		
		Alumno nuevo = new Alumno(codAlum,apellidos,nom,direccion,tlf,codCiclo,numCursos,fecha);
		
		
		System.out.println("Añadiendo alumno...");
		listaCodAlumn.put(nuevo.getCodAlum(), nuevo);
		
		System.out.println("Datos del alumno añadido: " + listaCodAlumn.get(nuevo.getCodAlum()));
	
		// Apartado B
		// Mostrar en pantalla la información sobre un alumno a partir de su código de alumno solicitado
		// al usuario.
		
		System.out.println("Introduce un codigo por el que buscar un alumno");
		String codUser = datos.next();
		
		if(listaCodAlumn.containsKey(codUser)) {
			System.out.println("Datos del Alumno: " + listaCodAlumn.get(codUser));
		}else {
			System.out.println("El codigo no existe");
		}
		
		// Apartado C
		// Dar de baja a un alumno a partir de su nombre
		// y apellidos solicitados al usuario
		datos.nextLine();
		
		System.out.println("Introduce un nombre:");
		String nomUser = datos.nextLine();
		
		System.out.println("Introduce los apellidos:");
		String apellidosUser = datos.nextLine();
		
		boolean eliminar = false;
		String clave = null;
		
			for(Alumno alum : listaCodAlumn.values()) {
				if(alum.getNombre().equals(nomUser) && alum.getApellidos().equals(apellidosUser)) {
					eliminar = true;
					clave = alum.getCodAlum();
			}
		}
		
		if(eliminar) {
			listaCodAlumn.remove(clave);
			System.out.println("Usuario Eliminado");
		}else {
			System.out.println("Usuario no encontrado");
		}
		
		// Apartado D
		//d. Modificar ladirección y/o teléfono
		// de un alumno, dado su código de alumno
		
		System.out.println("Introduce el código de alumno");
		String codUsuario = datos.nextLine();
		
		System.out.println("Introduce la dirección");
		String direc = datos.nextLine();
		
		System.out.println("Introduce el tlf");
		String telef = datos.nextLine();
		
		boolean modificar = false;
		Alumno reemplazo = null;
		
			for(Alumno alumno : listaCodAlumn.values()) {
				if(alumno.getCodAlum().equals(codUsuario)) {
					modificar = true;	
			}
		}
			
		if(modificar) {
			reemplazo = listaCodAlumn.get(codUsuario);
			reemplazo.setTlf(telef);
			reemplazo.setDireccion(direc);
			
			listaCodAlumn.replace(codUsuario, listaCodAlumn.get(codUsuario),reemplazo);
			System.out.println("Datos modificados");
		}else {
			System.out.println("Usuario no encontrado");
		}
		
				
	}

}
