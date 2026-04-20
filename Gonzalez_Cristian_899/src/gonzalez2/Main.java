/* Descripción: Programa para probar el uso de las listas y los metodos en la clase empleado
 * Autor: Cristian González Mateo
 * Fecha: 15/04/2026
 * */
package gonzalez2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		// Apartado 1
		System.out.println("Apartado 1");
		
		LinkedList<Empleado> listaEmpleados = new LinkedList<Empleado>();
		// Generar 10 Empleados con valores aleatorios y agregarlos a la lista
		for(int i = 0; i < 10; i++) {
			listaEmpleados.add(Empleado.generarAleatorio());
		}
		
		System.out.println("Datos de cada empleado:");
		
		// Mostrar en pantalla los empleados
		for(Empleado x : listaEmpleados) {
			System.out.println(x);
		}
		
		// Numero de objetos en la coleccion
		System.out.println("Numero de objetos que hay en la colección: " + listaEmpleados.size());
		
		
		// Apartado 2 
		System.out.println("Apartado 2");
		
		// Generar y añadir un empleado aleatorio en mitad de la lista
		Empleado nuevo = Empleado.generarAleatorio();
		listaEmpleados.add((listaEmpleados.size() / 2) - 1, nuevo);
		
		System.out.println("Tras insertar el nuevo empleado en el medio se la lista se queda así: ");
		
		// Mostrar en pantalla los empleados
		for(Empleado x : listaEmpleados) {
			System.out.println(x);
		}
		
		// Numero de objetos en la coleccion
		System.out.println("Numero de objetos que hay en la colección: " + listaEmpleados.size());
		
		// Apartado 3
		System.out.println("Apartado 3");
		
		// Ordenación en orden descendente la lista de empleado por dni
		Collections.sort(listaEmpleados);
		
		System.out.println("Tras la ordenación, la lista se queda así:");
		
		// Mostrar en pantalla los empleados
		for(Empleado x : listaEmpleados) {
			System.out.println(x);
		}
		
		// Numero de objetos en la coleccion
		System.out.println("Numero de objetos que hay en la colección: " + listaEmpleados.size());
		
		// Apartado 4
		System.out.println("Apartado 4");
		Empleado dni = Empleado.generarAleatorio();
		
		dni.setDni("101010101Z");
		
		// Comprobar si existe un objeto con el dni
		
		if(listaEmpleados.contains(dni)) {
			System.out.println("En la lista existe un empleado con el dni 101010101Z");
		}else {
			System.out.println("En la lista no existe un empleado con el dni 101010101Z");
		}
		
		// Apartado 5
		System.out.println("Apartado 5");
		ArrayList<Empleado> anas = new ArrayList<Empleado>();
		
		// Recorrer la lista y guardar los empleados cuyo nombre es ana en otra lista
		for(Empleado x : listaEmpleados) {
			if(x.getNombre().equals("Ana")) {
				anas.add(x);
			}
		}
		
		System.out.println("El numero de empleados que se llaman Ana es: " + anas.size());
		
		System.out.println("Los datos de estos empleados son los siguientes:");
		
		for(Empleado x : anas) {
			System.out.println(x);
		}
		
		
	}

}
