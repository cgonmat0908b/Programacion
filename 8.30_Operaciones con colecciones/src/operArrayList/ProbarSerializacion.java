package operArrayList;

import java.io.IOException;

public class ProbarSerializacion {

	public static void main(String[] args) {

		String rutaFichero = "Notas/Notas1.txt";
		
		// Entrada
		// Uso de metodo abrir
		AlumnoEntrada entrada = new AlumnoEntrada();
		try{
			entrada.abrir(rutaFichero);
		}catch(IOException ioex) {
			System.out.println(ioex.getMessage());
		}
		
		// Leer y mostrar
		Alumno alumnEntrada = null;
		try{
			 alumnEntrada = entrada.leer();
		}catch(IOException ioex) {
			System.out.println(ioex.getMessage());
		}catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe.getMessage());
		}
		
		System.out.println(alumnEntrada);
		// Cerrar
		try {
			entrada.cerrar();
		}catch(IOException ioex) {
			System.out.println(ioex.getMessage());
		}
	}

}
