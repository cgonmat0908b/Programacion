package ejercicio1;

import libtarea3.CuentaBancaria;
import java.time.LocalDate;
import java.time.DateTimeException;
import java.lang.IllegalArgumentException;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cuando ponemos el nombre de la clase.(metodo) es un metodo estatico
		//USAR PRINTF EN TODOS LOS CASOS POSIBLES 
		
		
		//Ejercicio 1
		
		//java.lang.IllegalArgumentException
		
		
		//Apartado 1 Declaración de 3 cuentas
		CuentaBancaria cuentaPrivada;
		CuentaBancaria cuentaConjunta;
		CuentaBancaria cuentaFamiliar;
		
		
		
		//Apartado 2 
		
		//Apartado 2.1, Creación de cuenta con fecha erronea resto de valores validos
		
		try {
			LocalDate fechaMal = LocalDate.of(2027,9,1);
			CuentaBancaria cuenta = new CuentaBancaria (0.00, fechaMal);
			
		}catch(DateTimeException exfechaNoValida) {
			System.out.println(exfechaNoValida.getMessage());
			
		}catch(IllegalArgumentException exFecha){
			System.out.println(exFecha.getMessage());
		}
		
		
		//Apartado 2.2 Creación de fecha con cantidad de dinero invalida resto de valores validos
		
		try {
			
			CuentaBancaria saldoErroneo = new CuentaBancaria(-200.00);
			
		}catch(IllegalArgumentException exSaldo){
			System.out.println(exSaldo.getMessage());
		}
		
		
		//Apartado 2.3 Creacion de 3 cuentas válidas, Las cuales apuntan a cuentas declaradas  en el apartado 1
		
		LocalDate fechaBien = LocalDate.of(2021, 7, 1);
		cuentaPrivada = new CuentaBancaria(1000.00, fechaBien, -200.00);
		
		cuentaConjunta = new CuentaBancaria(200, fechaBien);
		
		cuentaFamiliar = new CuentaBancaria();
		
		//Apartado 3 Mostrar información de cuentaPrivada.
		
		//Apartado 3.1 Identificador de la cuenta
		System.out.println();
		System.out.printf("El identificador de la cuenta bancaria es %d ", cuentaPrivada.getId());
		System.out.println();
		
		//Apartado 3.2 Fecha de creación de la cuenta
		String fechaCuenta = fechaBien.toString();
		System.out.printf("La fecha de creación de la cuenta es %s", fechaCuenta);
		System.out.println();
		
		//Apartado 3.3 Limite de descubierto con 2 decimales
		System.out.printf("El limite de descubierto es: %.2f",cuentaPrivada.getLimiteDescubierto());
		System.out.println();
		
		//Apartado 3.4 Cuenta embargada?
		System.out.printf("Esta embargada? %b", cuentaPrivada.isEmbargada());
		System.out.println();
		
		//Apartado 3.5 Cuenta descubierta?
		System.out.printf("Esta descubierta? %b", cuentaPrivada.isDescubierta());
		System.out.println();
		
		//Apartado 3.6 Longevidad de la cuenta
		System.out.printf("La cuenta lleva abierta %d dias", cuentaPrivada.getDiasCuenta());
		System.out.println();
		//Apartado 4 Operaciones con la cuenta
		
		//Apartado 4.1 Ingreso en cuentaFamiliar
		cuentaFamiliar.ingresar(100.00);
		
		//Apartado 4.2 Extracción en cuentaConjunta
		cuentaConjunta.extraer(100.00);
		
		//Apartado 4.3 Transferencia de privada a familiar
		cuentaPrivada.transferir(1100.00, cuentaFamiliar);
		
		//Apartado 5 Estado de las cuentas
		
		//Apartado 5.1 Estado CuentaPrivada
		System.out.println();
		System.out.printf("Datos de la cuenta privada: %s", cuentaPrivada.toString());
		System.out.println();
		
		//Apartado 5.2 Estado CuentaConjunta
		System.out.printf("Datos de la cuenta conjunta: %s", cuentaConjunta.toString());
		System.out.println();
		
		//Apartado 5.3 Estado CuentaFamiliar
		System.out.printf("Datos de la cuenta familiar: %s", cuentaFamiliar.toString());
		
	}

}
