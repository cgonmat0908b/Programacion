package playamarBank;

import java.time.LocalDate;

public class PlayamarBank {

	
	//Constantes de clase
	 public static final double DEFAULT_MAX_DESCUBIERTO = 0.0;
	 public static final double DEFAULT_SALDO = 0.0;
	 public static final double MAX_DESCUBIERTO = -2000.0;
	 public static final double MAX_SALDO = 5.0E7;
	 public static final double MIN_EMBARGO = 0.0;
	 public static final int MIN_YEAR = 1900;
	 
	
	// Atributos de clase
	private static double saldoGlobal;
	private static int numCuentasEmbargadas;
	private static LocalDate cuentaMasReciente; //Guarda la fecha de creación de la cuenta con la fecha más reciente
	
	
	// Atributos de objeto
	private final String IDENTIFICADOR;
	private final LocalDate fechaCreacion;
	private double embargo;
	private double saldoActual;
	private double saldoMaximo;
	private double ingresosTotales;
	
	// Constructor con 3 parametros, saldoInicial, fechaCreacion y limiteDescubierto
	
	public PlayamarBank(double saldoInicial, LocalDate fechaCreacion,double limiteDescubierto)throws IllegalArgumentException{
		if(saldoInicial < -2000) {
			throw new IllegalArgumentException("El limite de descubierto es -2000, el saldo inicial no"
					+ "puede ser inferior a -2000");
		}
		
		if(fechaCreacion.getYear() < MIN_YEAR) {
			throw new IllegalArgumentException("El año de creación no pueder ser inferior a 1900");
		}
		
		if(fechaCreacion.equals(null)) {
			throw new IllegalArgumentException("La fecha no puede ser nula");
		}
		
		if(limiteDescubierto < PlayamarBank.MAX_DESCUBIERTO) {
			throw new IllegalArgumentException("El limite de descubierto es -2000");
		}
		
		this.IDENTIFICADOR = ;
		
	}
	
	private static String crearID(LocalDate fechaCreacion) {
		
		// Guardo en una variable la cantidad de años posibles para una cuenta bancaria
		int numAnyos = LocalDate.now().getYear() - MIN_YEAR;
			
		// Creo un array con las posiciones máximas que pueden haber
		int anyos[] = new int[numAnyos];
		
		// La siguiente idea es a la hora de generar un ID, compruebo si en alguna posición del array
		// existe el mismo año de esa cuenta, si existe, le sumo 1 al contador del ID, si no existe,
		// inicializo el contador a 0
		
		int anyoCuenta = fechaCreacion.getYear();
		
		String numeroSerie;
		
		
		return String.format("%d-", anyoCuenta);
	}
	
}
