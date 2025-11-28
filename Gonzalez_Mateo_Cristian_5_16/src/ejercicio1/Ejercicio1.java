package ejercicio1;

import libtarea3.CuentaBancaria;
import java.time.LocalDate;
import java.lang.Exception;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cuando ponemos el nombre de la clase.(metodo) es un metodo estatico
		//USAR PRINTF EN TODOS LOS CASOS POSIBLES 
		
		
		//1.1
		
		//java.lang.IllegalArgumentException
		
		
		//Apartado 1
		CuentaBancaria cuentaPrivada;
		CuentaBancaria cuentaConjunta;
		CuentaBancaria cuentaFamiliar;
		
		
		
		//Apartado 2 
		
		cuentaPrivada = new CuentaBancaria();
		cuentaConjunta = new CuentaBancaria();
		cuentaFamiliar = new CuentaBancaria();
		
		
		//Apartado 2.1, Creación de cuenta con fecha erronea resto de valores validos
		
		try {
			LocalDate fechaMal = LocalDate.of(2027,9,1);
			CuentaBancaria cuenta = new CuentaBancaria (0.00, fechaMal);
			
		}catch(IllegalArgumentException exFecha){
			System.out.println(exFecha.getMessage());
		}
		
		
		//Apartado 2.2 Creación de fecha con cantidad de dinero invalida resto de valores validos
		
		try {
			CuentaBancaria saldoErroneo = new CuentaBancaria(-200.00);
			
		}catch(IllegalArgumentException exSaldo){
			System.out.println(exSaldo.getMessage());
		}
		
		
		//Apartado 2.3
		LocalDate fechaBien = LocalDate.of(2021, 7, 1);
		CuentaBancaria descubiertoNegativo = new CuentaBancaria(1000.00, fechaBien, -200.00);
		
		cuentaPrivada = descubiertoNegativo;
		
		CuentaBancaria sinDescubierto = new CuentaBancaria(200, fechaBien);
		cuentaConjunta = sinDescubierto;
		
		CuentaBancaria cuenta = new CuentaBancaria();
		
		
		//Apartado 1.2
		
		//Apartado 1.3
	}

}
