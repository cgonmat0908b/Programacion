package herencia;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Productos {

	private static int contadorCod = 1;
	
	protected final String codigo;
	protected String nombre;
	protected LocalDate fechaCaducidad;
	protected int numLote;
	
	protected Productos(String nombre, LocalDate fechaCaducidad, int numLote)throws IllegalArgumentException {
		
		if(nombre.isEmpty() || nombre == null) {
			throw new IllegalArgumentException("Nombre invalido");
		}
		if(fechaCaducidad.isBefore(LocalDate.now()) || fechaCaducidad == null) {
			throw new IllegalArgumentException("Fecha invalida");
		}
		if(numLote < 0) {
			throw new IllegalArgumentException("Numero de lote invalido");
		}
		
		this.codigo = generarCodigo();
		this.nombre = nombre;
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
		
	}
	//Metodo usado para generar el codigo de cada producto de forma incremental
	
	private String generarCodigo() {
		String codigo = String.format("%04d", Productos.contadorCod);
		Productos.contadorCod++;
		return codigo;
	}
	
	//Getters 
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaCaducidad() {
		return this.fechaCaducidad;
	}
	
	public int getNumLote() {
		return this.numLote;
	}
	
	// Setters 
	
	public void setNombre(String nombre) {
		if(nombre.isEmpty() || nombre == null) {
			throw new IllegalArgumentException("Nombre invalido");
		}
		this.nombre = nombre;
		
	}
	
	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		if(fechaCaducidad.isBefore(LocalDate.now()) || fechaCaducidad == null) {
			throw new IllegalArgumentException("Fecha invalida");
		}
		this.fechaCaducidad = fechaCaducidad;
	}
	
	public void setNumLote(int numLote) {
		if(numLote < 0) {
			throw new IllegalArgumentException("Numero de lote invalido");
		}
		this.numLote = numLote;
	}
	
	//toString
	public String toString() {
		return String.format(" codigo: %s %n nombre: %s %n fecha de caducidad: %s %n numero de lote: %d %n", this.codigo,this.nombre,this.fechaCaducidad.toString(),this.numLote);
	}
	
	//Metodo que indica si un producto esta caducado
	
	public boolean isCaducado() {
		boolean caducado;
		if(this.fechaCaducidad.isBefore(LocalDate.now())) {
			caducado = true;
		}else {
			caducado = false;
		}
		return caducado;
	}
	
	// Metodo para calcular cuantos dias quedan para que caduque
	
	public int diasRestantes()throws IllegalStateException {
		int dias = 0;
		
		if(isCaducado() == true) {
			throw new IllegalStateException("El producto ya esta caducado");
		}
		
		if(this.fechaCaducidad.isAfter(LocalDate.now())) {
			dias = (int) ChronoUnit.DAYS.between(LocalDate.now(), this.fechaCaducidad);
;
		}
		return dias;
	}
		
}
