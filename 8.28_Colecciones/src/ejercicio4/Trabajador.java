package ejercicio4;

import java.util.Objects;

public class Trabajador implements Comparable<Trabajador> {

	private String nombre;
	private byte edad;
	private boolean sexo;
	private String estadoCivil;
	private double salarioBase;
	
	
	
	
	// Constructor todos parametros
	
	public Trabajador(String nombre, byte edad, boolean sexo, String estadoCivil, double salarioBase) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.salarioBase = salarioBase;
	}
	
	// toString
	
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil
				+ ", salarioBase=" + salarioBase + "]";
	}


	// Getters
	public String getNombre() {
		return nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public boolean isSexo() {
		return sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	
	// Setters 
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public int compareTo(Trabajador o) {
		int resultado = 0;
		
		// Comparación por sexo hombres--mujeres
		if(!this.sexo && !o.sexo) {
			resultado = 0;
		}else if(this.sexo && o.sexo) {
			resultado = 0;
		}else if(!this.sexo && o.sexo) {
			resultado = -1;
		}else if(this.sexo && !o.sexo) {
			resultado = 1;
		}
		// Comparación por estado civil, String
		if(resultado == 0) {
			resultado = this.estadoCivil.compareTo(o.estadoCivil);
		}
		
		return resultado;
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
		Trabajador other = (Trabajador) obj;
		return edad == other.edad && Objects.equals(estadoCivil, other.estadoCivil)
				&& Objects.equals(nombre, other.nombre) && sexo == other.sexo;
	}
	
	
	
}
