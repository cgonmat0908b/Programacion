package ejercicio1;

import libtarea3.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean encendida = true, apagada = false;
		
		//Apartado 1 Declaración de 3 bombillas

		Bombilla bombilla1, bombilla2, bombilla3;
		
		//Apartado 2 Consulta Inicial
		
		//2.1 Número de bombillas creadas
		
		System.out.printf("Se han creado %d bombillas %n", Bombilla.getBombillasCreadas());
		
		
		//2.2 Número de bombillas encendidas
		
		System.out.printf("Hay %d bombillas encendidas %n", Bombilla.getBombillasEncendidas());
		
		//Apartado 3 Instanciación
		
		//3.1 Bombilla potencia invalida
		
		try {
			double potencia = 250;
			Bombilla potencia250 = new Bombilla(encendida, potencia);
			
		}catch(IllegalArgumentException exPot) {
			System.out.println(exPot.getMessage());
			Bombilla potencia250 = new Bombilla();
		}
		
		//3.2 Bombilla No estado incial 5 vatios
		
		try {
			double potencia = 5;
			Bombilla potencia5 = new Bombilla(potencia);
			
		}catch(IllegalArgumentException  exPot5) {
			System.out.println(exPot5.getMessage());
			Bombilla potencia5 = new Bombilla();
		}
		
		//3.3 Creación de bombilla con 2 parametros
		
		try {
			double potencia = 100;
			 bombilla1 = new Bombilla(encendida,potencia);
			
		}catch(IllegalArgumentException exPot) {
			System.out.println(exPot.getMessage());
			bombilla1 = new Bombilla();
		}
		
		//3.4 Instanciar segunda bombilla encendida, potencia por omision
		
		bombilla2 = new Bombilla(encendida);
		
		//3.5 Creación de bombilla por omisión
		
		bombilla3 = new Bombilla();
		
		//Apartado 4 Operaciones en bombillas
		
		//4.1 Encender bombilla ya encendida
		
		try {
			bombilla1.encender();
			
		}catch(IllegalStateException exYaEncendida) {
			System.out.println(exYaEncendida.getMessage());
		}
		
		//Apartado 4.2 Conmutación de bombilla
		
		for(int i = 0; i < 6; i++) {
			bombilla1.conmutar();
			Utilidades.esperar(1);
			
		}
		
		//Apartado 4.3 Apagar bombilla2
		
		try {
			bombilla2.apagar();
			
		}catch(IllegalStateException ex) {
			System.out.println(ex.getMessage());
		}
		
		//Apartado 4.4 Encender bombilla3
		
		try {
			bombilla3.encender();
			
		}catch(IllegalStateException ex) {
			System.out.println(ex.getMessage());
		}
		
		//Apartado 5 Información primera bombilla
		
		//5.1 Datos potencia
		System.out.printf("La primera bombilla tiene %.2f %n", bombilla1.getPotencia());
		
		//5.2 Datos estado
		System.out.printf("El estado de la bombilla es %b %n", bombilla1.getEstado());
		
		//5.3 Ultima vez que se encendió
		LocalDateTime fecha = bombilla1.getUltimaVezEncendida();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		String ultimaVez = fecha.format(formato);
		
		System.out.printf("La ultima vez que la bombilla se encendió fue %s %n", ultimaVez);
		
		//5.4 Veces encendida
		System.out.printf("La bombilla se ha encendido %d %n", bombilla1.getVecesEncendida());
		
		//5.5 Tiempo que lleva encendida
		System.out.printf("Lleva encendida %.2f %n", bombilla1.getTiempoEncendida());
		
		//5.6 Potencia Consumida
		System.out.printf("Ha consumido %.2f %n", bombilla1.getPotenciaConsumida());
		
		//Apartado 6 Consulta valores globales finales
		
		//6.1 Bombillas creadas cantidad
		System.out.printf("Se han creado %d bombillas %n", Bombilla.getBombillasCreadas());
		
		//6.2 Numero de bombillas encendidas
		System.out.printf("Hay %d bombillas encendidas %n", Bombilla.getBombillasEncendidas());
		
		
		
	}

}
