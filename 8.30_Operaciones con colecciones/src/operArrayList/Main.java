package operArrayList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 1. Importa la información contenida en el documento notas1.txt, donde la información tiene el
			siguiente formato:
			grupo;nombre,matemáticas;lengua;física;química;inglés
		 */
		File fichero = new File("Notas/Notas1.txt");
		System.out.println("1. Añadiendo registros de notas1.txt a la lista...");
		
		/*2. Muestra el número de registros que contiene.*/
		
		int numRegistros = contadorRegistros(fichero);
		
		System.out.println("2. Número de registros añadidos a la lista: " + numRegistros);
		
		
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
			datos.close();
			Collections.sort(listaRegistros);
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		// Guardar la lista ordenada en un archivo
		
		File listaOrdenada = new File("Notas/notasPorGrupoYNombre.txt");
		
		escribirFichero(listaOrdenada, listaRegistros);
		
		System.out.println("3. Ordenamos la lista por grupo y nombre...\r\n"
				+ "Guardamos la lista ordenada en: notasPorGrupoYNombre.txt");
		
		/*4. Inserta siguiente registro:
			 1º ESO D;López Muro, Rosario;3;3;4;4;3
		*/
		
		Alumno rosario = new Alumno("1º ESO D","López Muro","Rosario",(byte)3,(byte)3,(byte)4,(byte)4,(byte)3);
		
		
		// Lo añado a la lista
		listaRegistros.add(rosario);
		
		System.out.println("4. Añadimos el registro...");
		System.out.println("Número de registros : " + (listaRegistros.size()));
		
		
		/*5. Insertar el siguiente registro en mitad de la lista:
		1º ESO B;Duarte Durán, Alba;2;3;4;1;3
		 * */
		
		// Creo el alumnos
		Alumno alba = new Alumno("1º ESO B","Duarte Durán","Alba",(byte)2,(byte)3,(byte)4,(byte)1,(byte)3);
		int indice = listaRegistros.size() / 2;
		
		// Añado el alumno en la mitad
		listaRegistros.add(indice, alba);
		
		System.out.println("5. Añadimos un registro en mitad de la lista...");
		
		/*6. Mostrar la posición que ocupa el último registro anterior insertado
		 * */
		System.out.println("6. Posicion del nuevo registro: " + indice);
		
		
		/*7. Importa los registros del documento notas2.txt a un ArraList auxiliar
		 *  e incluye los elementos de este ArrayList auxiliar al primer ArrayList.
		 *  */
		
		File notas2 = new File("Notas/Notas2.txt");
		File registroCompletoDeNotas = new File("Notas/registroCompletoDeNotas.txt");
		
		ArrayList<Alumno> listaAuxiliar = new ArrayList<Alumno>();
		
		int tamanyoAntes = listaRegistros.size();
		
		
		try {
			Scanner datos = new Scanner(notas2);
			
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
					
				
				listaAuxiliar.add(alum);
			}
			datos.close();
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		listaRegistros.addAll(listaAuxiliar);
		int tamanyoAux = listaAuxiliar.size();
		int tamanyoDespues = listaRegistros.size();
		
		System.out.println("7. Añadiendo registros de notas2.txt a la lista mediante una lista auxiliar...");
		System.out.println("Total registros antes de añadir:" + tamanyoAntes);
		System.out.println("Total registros de la lista auxiliar:" + tamanyoAux);
		System.out.println("Total registros despues de añadir:" + tamanyoDespues);
		System.out.println("Guardamos la lista completa y ordenada en: registroCompletoDeNotas.txt");
		
		escribirFichero(registroCompletoDeNotas,listaRegistros);
		
		/*8. Busca el registro con el nombre “Cordero Benítez, Alejandro”
		 *  y muestra toda suinformación.
		 *  */
		System.out.println("8. Busca a Cordero Benítez, Alejandro e imprime toda su información...");
		
		Iterator<Alumno> iterador = listaRegistros.iterator();
		boolean encontrado = false;
		
		while(iterador.hasNext() && !encontrado) {
			Alumno iterado = iterador.next();
			
			if(iterado.getApellidos().equals("Cordero Benítez") && iterado.getNombre().equals(" Alejandro")) {
				System.out.println("Registro encontrado:" + iterado);
				encontrado = true;
			}
		}
		
		/*9. Busca el registro con el nombre “Fernández Villalón, Carlos”
		 *  y muestra toda su información.
		 * */
		System.out.println("9. Busca a Fernández Villalón, Carlos e imprime toda su información...");
		iterador = listaRegistros.iterator();
		encontrado = false;
		
		while(iterador.hasNext() && !encontrado) {
			Alumno iterado = iterador.next();
			
			if(iterado.getApellidos().equals("Fernández Villalón") && iterado.getNombre().equals(" Carlos")) {
				System.out.println("Registro encontrado:" + iterado);
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			System.out.println("Registro no encontrado");
		}
		
		
		
		
	}
	
	
	
	// Metodo que dado un objeto de tipo fichero, cuenta el numero de registros que incluye
	
	public static int contadorRegistros(File fichero){
		int contadorRegistros = 0;
		try {
			Scanner datos = new Scanner(fichero);
			
			while(datos.hasNextLine()) {
				datos.nextLine();
				contadorRegistros++;
			}
			datos.close();
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		return contadorRegistros;
	}

	// Metodo que dado un fichero y un objeto de la clase alumno, lo escribe en el fichero 
	
	public static void escribirAlumno(Alumno x, File fichero){
		
		try{
			FileWriter escribir = new FileWriter(fichero, true);
			escribir.write(x.toString() + "\n" );
			
			escribir.close();
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	// Metodo que dado un fichero y un ArrayList sobreescribe el contenido del fichero por el del arrayList
	public static void escribirFichero(File fichero, ArrayList<Alumno> listaAlums) {
		
		try{
			FileWriter escritura = new FileWriter(fichero);
			
			for(Alumno datos : listaAlums) {
				escritura.write(datos.toString() + "\n");
			}
			escritura.close();
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
