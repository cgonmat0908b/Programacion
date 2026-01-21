package ticket;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {

	// Atributos de clase contantes
	public static final int NUM_MAX_TICKET = 99999999; // Numero máximo por el que se identifica un ticket
	
	// Atributos de clase variables
	
	private static int ultimoAnyoTicket = LocalDate.now().getYear();; // Año del último ticket creado
	private static int ultimoNumTicket = 0; // Número de identificación del ultimo ticket creado
	
	// Constantes de objeto (Sin constructores)
	private static final LocalDate FECHA_USO_DEFECTO = LocalDate.of(LocalDate.now().getYear(), 12, 31);
	
	// Atributos de objeto variables
	
	private LocalDate fechaCreacion; // Fecha de creación del ticket
	private String numTicket; // Número de identificación de cada ticket
	private LocalDate fecha; // Fecha de uso del ticket
	private LocalTime usoTicket; // Indica si el ticket se ha usado o no
	
	
	
	// Constructor con 1 parametro
	
	public Ticket(LocalDate fecha)throws IllegalArgumentException{
		
		LocalDate hoy = LocalDate.now();
		  if (fecha == null) {
		    throw new IllegalArgumentException("fecha inválida (null)");
		  }
		  if (fecha.isBefore(hoy)) {
		    throw new IllegalArgumentException("fecha de uso anterior a la actual");
		  }
		  if (fecha.getYear() > hoy.getYear()) {
		    throw new IllegalArgumentException("fecha de uso posterior al año actual");
		  }
		  if (Ticket.ultimoNumTicket == Ticket.NUM_MAX_TICKET) {
		    throw new IllegalArgumentException("Limite de tickets imprimidos este año alcanzado");
		  }

		  this.fechaCreacion = hoy; // Registramos la fecha en que podrá ser usado
		  this.fecha = fecha;
		  this.usoTicket = null;  // El ticket aún no ha sido usado

		  // Comprobamos si se ha cambiado de año desde la generación del último ticket
		  if (Ticket.ultimoAnyoTicket != hoy.getYear()) {
		    Ticket.ultimoNumTicket = 0;  // Se reinicia la secuencia
		    Ticket.ultimoAnyoTicket = hoy.getYear();  // Se registra el nuevo año
		  }
		  // Generamos el id del ticket e incrementamos el número de secuencia
		  this.numTicket = String.format("%04d-%08d", hoy.getYear(), ++Ticket.ultimoNumTicket);
		}
	
	
	// Constructor sin parametros
	
	public Ticket() {
		this(FECHA_USO_DEFECTO);
	}
	
	// Getters
	
	public  String getNumTicket() {
		return this.numTicket;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	// Metodo que comprueba si el ticket ha sido usado
	public boolean isUsado() {
		boolean uso = false;
		
		if(this.usoTicket != null) {
			uso = true;
		}
		
		return uso;
	}
	
	// Metodo que comprueba si la fecha de uso del ticket es un dia de fin de semana
	public boolean isFindeSemana() {
		boolean finde = false;
		
		if(this.fechaCreacion.getDayOfWeek() == DayOfWeek.SATURDAY || this.fechaCreacion.getDayOfWeek() == DayOfWeek.SUNDAY) {
			finde = true;
		}
		return finde;
	}
	
	// Metodo que usa el ticket si es posible
	public void usarTicket()throws IllegalStateException {
		
		if(isUsado() == true) {
			throw new IllegalStateException("El ticket ya ha sido usado previamente");
		}
		
		if(!this.fecha.equals(LocalDate.now())) {
			throw new IllegalStateException("La fecha de hoy no corresponde con la fecha de uso");
		}
		
		this.usoTicket = LocalTime.now();
		
	}
	
	public String toString () {
		String fechaUso;
		
		if(this.usoTicket == null) {
	    	fechaUso = "No";
	    }else {
	    	fechaUso = String.format ("%02d:%02d", usoTicket.getHour(), usoTicket.getMinute());
	    }
		
		  return String.format ("{ID: %s, Fecha:%02d/%02d/%02d, Usado: %s}",
		    this.numTicket,
		    this.fecha.getDayOfMonth(), this.fecha.getMonthValue(), this.fecha.getYear(),
		    fechaUso);
		}
	
}
