package operArrayList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
		ArrayList<Alumno> listaRegistros = new ArrayList<Alumno>();
		
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
				
				
				listaRegistros.add(alum);
			}
			Collections.sort(listaRegistros);
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		// Guardar la lista ordenada en un archivo
		
		File listaOrdenada = new File("Notas1/notasPorGrupoYNombre.txt");
		
		try{
			FileWriter escritura = new FileWriter(listaOrdenada);
			
			for(Alumno datos : listaRegistros) {
				escritura.write(datos.toString() + "\n");
			}
			escritura.close();
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}

		
		System.out.println("3. Ordenamos la lista por grupo y nombre...\r\n"
				+ "Guardamos la lista ordenada en: notasPorGrupoYNombre.txt");
		
		/*4. Inserta siguiente registro:
			 1º ESO D;López Muro, Rosario;3;3;4;4;3
		*/
		
		Alumno rosario = new Alumno("1º ESO D","López Muro","Rosario",(byte)3,(byte)3,(byte)4,(byte)4,(byte)3);
		listaRegistros.add(rosario);
		
		
		
	}

}
