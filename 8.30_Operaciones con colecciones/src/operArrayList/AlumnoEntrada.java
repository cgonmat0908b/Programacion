package operArrayList;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AlumnoEntrada {

	private FileInputStream archivoEntrada;
	private ObjectInputStream entrada;
	
	public void abrir(String nomFichero) throws IOException{
		archivoEntrada = new FileInputStream(nomFichero);
		entrada = new ObjectInputStream(archivoEntrada);
	}
	
	public void cerrar()throws IOException {
		if(entrada != null) {
			entrada.close();
		}
	}
	
	public Alumno leer()throws IOException, ClassNotFoundException{
		Alumno alumn = null;
		if(entrada != null) {
			try {
				alumn = (Alumno) entrada.readObject();
			}catch(EOFException eof) {
				System.out.println(eof.getMessage());
			}
		}
		return alumn;
	}
	
}
