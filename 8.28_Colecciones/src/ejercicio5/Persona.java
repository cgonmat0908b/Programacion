package ejercicio5;

import java.util.Objects;

public class Persona {

	private String nombre;
	private boolean sexo;
	private String estadoCivil;
	private byte edad;
	
	
	
	// Constructor con todos los parametros
	public Persona(String nombre, boolean sexo, String estadoCivil, byte edad) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.edad = edad;
	}
	
	// Getters
	public String getNombre() {
		return nombre;
	}
	public boolean isSexo() {
		return sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public byte getEdad() {
		return edad;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", edad=" + edad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, estadoCivil, nombre, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && Objects.equals(estadoCivil, other.estadoCivil)
				&& Objects.equals(nombre, other.nombre) && sexo == other.sexo;
	}
	
}
