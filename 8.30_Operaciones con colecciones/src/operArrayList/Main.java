package operArrayList;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 1. Importa la información contenida en el documento notas1.txt, donde la información tiene el
			siguiente formato:
			grupo;nombre,matemáticas;lengua;física;química;inglés
		 */
		File fichero = new File("Notas1/Notas1.txt");
		System.out.println("1. Añadiendo registros de notas1.txt a la lista...");
		
		/*2. Muestra el número de registros que contiene.*/
		
		int contadorRegistros = 0;
		try {
			Scanner datos = new Scanner(fichero);
			
			while(datos.hasNextLine()) {
				datos.nextLine();
				contadorRegistros++;
			}
			datos.close();
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("2. Número de registros añadidos a la lista: " + contadorRegistros);
		
		
		/*3. Ordena los registros por grupo y nombre.*/
		ArrayList<String> listaRegistros = new ArrayList<String>();
		
		try {
			Scanner datos = new Scanner(fichero);
			
			while(datos.hasNextLine()) {
				String[] camposRegistro = datos.nextLine().split(";");
				String grupo = camposRegistro[0];
				
				String[] apellidosNombre = new String[2];
				apellidosNombre = camposRegistro[1].split(",");
				String apellidos = apellidosNombre[0];
				String nombre = apellidosNombre[1];
				
				byte mates = Byte.parseByte(camposRegistro[2]);
				byte lengua = Byte.parseByte(camposRegistro[3]);
				byte fisica = Byte.parseByte(camposRegistro[4]);
				byte quimica = Byte.parseByte(camposRegistro[5]);
				byte ingles = Byte.parseByte(camposRegistro[6]);
				
				Alumno alum = new Alumno(grupo,apellidos,nombre,mates,lengua,fisica,quimica,ingles);
				
				listaRegistros.add(nombre)
			}
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
