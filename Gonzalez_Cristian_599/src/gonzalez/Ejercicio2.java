package gonzalez;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Apartado 2 Declaración de un vector de 10 elementos de la clase CuentaBancaria
		CuentaBancaria[] cuentas = new CuentaBancaria[10];
		
		// Apartado 3 Instanciar elementos de la clase cuenta bancaria
		
		for(int i = 0; i < cuentas.length; i++) {
			try {
				
				LocalDate fecha = LocalDate.of(anyoAleatorio(), 1, 1);
				System.out.println(fecha);
				cuentas[i] = new CuentaBancaria((Math.random() * 5001) ,fecha, CuentaBancaria.MAX_DESCUBIERTO);
				
			}catch(IllegalArgumentException ex2) {
				System.out.println(ex2.getMessage());
				cuentas[i] = new CuentaBancaria();
			}
			
		}
		
		// Apartado 3 Mostrar datos de cada cuenta
		
		for(int f = 0; f < cuentas.length; f++) {
			System.out.println("Cuenta numero " + f);
			System.out.println();
			System.out.println(cuentas[f].toString());
			System.out.println(cuentas[f].getFechaCreacion());
		}
		
		
		// Apartado 4 Indicar que cuenta tiene mayor saldo
		double saldoMax = cuentas[0].getSaldo();
		int numCuenta = 0;
		for(int f = 0; f < cuentas.length; f++) {
			if(cuentas[f].getSaldo() > saldoMax) {
				saldoMax = cuentas[f].getSaldo();
				numCuenta = f;
			}
		}
		
		System.out.println("La cuenta con más saldo es la cuenta con el id: " + numCuenta );
		
		
		// Apartado 5 Ingreso de 1000 en la cuenta que ocupa la posición 1 Mostrar saldo antes y después
		
		// PRE INGRESO
		System.out.println(cuentas[1].getSaldo());
		
		// INGRESO
		try {
			
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			
		}catch(IllegalStateException ex2) {
			System.out.println(ex2.getMessage());
		}
		
		// POST INGRESO
		System.out.println(cuentas[1].getSaldo());
		
		
		// Apartado 6 Operaciones multiples
		int numOperaciones = 0;
		
		
		/*
		 * En bucle se realizan las siguientes operaciones
			En el caso de que la cuenta fuera creada con valores predeterminados,
			la condición para salir del bucle seran 10 operaciones ya que el metodo
			extraer, no permitira superar el descubierto que sería 0
		 * 
		 */
		do {
			// Ingreso de 100€
			try {
				System.out.println("Previo al ingreso: " + cuentas[5].getSaldo());
				System.out.printf("Se trata de ingresar %f€ %n ", 100.00);
				cuentas[5].ingresar(100);
				numOperaciones++;
				System.out.printf("Tras el intento de ingreso la cuenta se queda en %f€ de saldo %n", cuentas[5].getSaldo());
				
			}catch(IllegalArgumentException ex3) {
				System.out.println(ex3.getMessage());
			}catch(IllegalStateException ex4) {
				System.out.println(ex4.getMessage());
			}
			// Extracción de 500€
			try {
				System.out.println("Previo a la extraccion: " + cuentas[5].getSaldo());
				System.out.printf("Se trata de extraer %f€ %n ", 500.00);
				cuentas[5].extraer(500);
				
				System.out.println("Saldo después de extraer: " + cuentas[5].getSaldo());
				numOperaciones++;
				
			}catch(IllegalArgumentException ex5) {
				System.out.println(ex5.getMessage());
			}catch(IllegalStateException ex6) {
				System.out.println(ex6.getMessage());
			}
			
		}while(!cuentas[5].isDescubierta() && numOperaciones < 10);
		
	}
	
	
	// Apartado 1 Metodo que genera un numero aleatorio entre 1800 y 2100 cuya unidad contiene un 0, Ej: 1950
	public static int anyoAleatorio() {
		int numAleatorio = 0;
		
		int paso = 10; 
		int indiceMin = 1800 / paso;
		int indiceMax = 2100 / paso;
		int cantidad = indiceMax - indiceMin + 1;
		
		return numAleatorio = paso * (indiceMin + (int)(Math.random() * cantidad));

		
	}
	/*
	 * Para implementar una interfaz en un clase seria así: public class Patata implements nombreInterfaz
	 */
}





