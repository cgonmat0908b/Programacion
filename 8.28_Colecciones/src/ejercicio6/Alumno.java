package ejercicio6;

import java.time.LocalDate;
import java.util.Objects;

public class Alumno {
	
	private String codAlum;
	private String apellidos;
	private String nombre;
	private String direccion;
	private String tlf;
	private String codCiclo;
	private byte numCursosAprovados;
	private LocalDate fechaIngreso;
	
	
	public Alumno(String codAlum, String apellidos, String nombre, String direccion, String tlf, String codCiclo,
			byte numCursosAprovados, LocalDate fechaIngreso) {
		this.codAlum = codAlum;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tlf = tlf;
		this.codCiclo = codCiclo;
		this.numCursosAprovados = numCursosAprovados;
		this.fechaIngreso = fechaIngreso;
	}

	// Getters y setters
	
	public String getCodAlum() {
		return codAlum;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTlf() {
		return tlf;
	}

	public String getCodCiclo() {
		return codCiclo;
	}

	public byte getNumCursosAprovados() {
		return numCursosAprovados;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setCodAlum(String codAlum) {
		this.codAlum = codAlum;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public void setCodCiclo(String codCiclo) {
		this.codCiclo = codCiclo;
	}

	public void setNumCursosAprovados(byte numCursosAprovados) {
		this.numCursosAprovados = numCursosAprovados;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codAlum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(codAlum, other.codAlum);
	}

	@Override
	public String toString() {
		return "Alumno [codAlum=" + codAlum + ", apellidos=" + apellidos + ", nombre=" + nombre + ", direccion="
				+ direccion + ", tlf=" + tlf + ", codCiclo=" + codCiclo + ", numCursosAprovados=" + numCursosAprovados
				+ ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
	
	
	
}
