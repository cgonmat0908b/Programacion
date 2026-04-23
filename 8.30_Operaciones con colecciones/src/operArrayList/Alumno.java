package operArrayList;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class Alumno implements Comparable<Alumno>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String grupo;
	private String apellidos;
	private String nombre;
	private byte notaMat;
	private byte notaLengua;
	private byte notaFisica;
	private byte notaQuimica;
	private byte notaIngles;
	
	
	
	
	// Constructor con todos los parametros
	
	public Alumno(String grupo, String apellidos,String nombre, byte notaMat, byte notaLengua, byte notaFisica, byte notaQuimica,
			byte notaIngles) {
		this.grupo = grupo;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.notaMat = notaMat;
		this.notaLengua = notaLengua;
		this.notaFisica = notaFisica;
		this.notaQuimica = notaQuimica;
		this.notaIngles = notaIngles;
	}
	
	// Getters
	public String getGrupo() {
		return grupo;
	}
	public String getNombre() {
		return nombre;
	}
	public byte getNotaMat() {
		return notaMat;
	}
	public byte getNotaLengua() {
		return notaLengua;
	}
	public byte getNotaFisica() {
		return notaFisica;
	}
	public byte getNotaQuimica() {
		return notaQuimica;
	}
	public byte getNotaIngles() {
		return notaIngles;
	}
	public String getApellidos() {
		return apellidos;
	}

	// Setters
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNotaMat(byte notaMat) {
		this.notaMat = notaMat;
	}
	public void setNotaLengua(byte notaLengua) {
		this.notaLengua = notaLengua;
	}
	public void setNotaFisica(byte notaFisica) {
		this.notaFisica = notaFisica;
	}
	public void setNotaQuimica(byte notaQuimica) {
		this.notaQuimica = notaQuimica;
	}
	public void setNotaIngles(byte notaIngles) {
		this.notaIngles = notaIngles;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	// CompareTo
	public int compareTo(Alumno o) {
		
		int comparacion = 0;
		
		if(this.getGrupo().compareTo(o.getGrupo()) == 0) {
			comparacion = 0;
			if(this.getNombre().compareTo(o.getNombre()) == 0) {
				comparacion = 0;
			}else if(this.getNombre().compareTo(o.getNombre()) > 0){
				comparacion = 1;
			}else {
				comparacion = -1;
			}
			
		}else if(this.getGrupo().compareTo(o.getGrupo()) > 0){
			comparacion = 1;
		}else {
			comparacion = -1;
		}
		
		return comparacion;
	}
	
	@Override
	public String toString() {
	    return this.grupo + ";" 
	         + this.apellidos + ", " + this.nombre + ";" 
	         + this.notaMat + ";" 
	         + this.notaLengua + ";" 
	         + this.notaFisica + ";" 
	         + this.notaQuimica + ";" 
	         + this.notaIngles;
	}
	
}
