package operArrayList;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AlumnoSalida {
	
	private FileOutputStream ficheroSalida;
	private ObjectOutputStream salida;
	
	public void abrir(String nomFichero)throws IOException {
		ficheroSalida = new FileOutputStream(nomFichero);
		salida = new ObjectOutputStream(ficheroSalida);
	}
	
	public void cerrar()throws IOException {
		if(salida != null) {
			salida.close();
		}
	}
	
	public void escribir (Alumno alumn) throws IOException{
		if(salida != null) {
			salida.writeObject(alumn);
		}
	}
	
}
