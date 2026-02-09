package gonzalez;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Apartado 2 Declaración de un vecto de 10 elementos de la clase CuentaBancaria
		CuentaBancaria[] cuentas = new CuentaBancaria[10];
		
		// Apartado 3 Instanciar elementos de la clase cuenta bancaria
		
		for(int i = 0; i < cuentas.length; i++) {
			try {
				LocalDate fecha = LocalDate.of(anyoAleatorio(), 1, 1);
				cuentas[i] = new CuentaBancaria(0,fecha);
				
			}catch(IllegalArgumentException ex2) {
				System.out.println(ex2.getMessage());
				cuentas[i] = new CuentaBancaria();
			}
			
		}
		
		
	}
	
	
	// Apartado 1 Metodo que genera un numero aleatorio entre 1800 y 2100
	public static int anyoAleatorio() {
		boolean numValido = false;
		int numAleatorio = 0;
		do {
			numAleatorio =(int) (Math.random() * 2100);
			if(numAleatorio < 1800) {
				numValido = false;
			}else {
				numValido = true;
			}
				
		}while(numValido == false);
		return numAleatorio;
		
	}
}