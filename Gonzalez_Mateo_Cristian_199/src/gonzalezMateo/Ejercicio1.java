/*Descripción: Programa que tras la recolección de unos datos de trabajadores, 
 * realiza calculos de sueldo e indica estos y si es elegible para un bono.
 * 
 *Fecha: 29/10/25
 *Autor: Cristian González Mateo
 */
package gonzalezMateo;

import java.util.Scanner;

public class Ejercicio1 {
 
	public static void main(String[] args) {
		
		//
		Scanner datos = new Scanner(System.in);
		
		//Inicialización de contantes y variables
		
		final float IRPF = 12.0f;
		int numEmpleado;
		byte edad,horasSemanales;
		float salHora,salBruto,salNeto,retencion;
		boolean esJornadaCompleta;
		String jornada,elegibilidadParaBono;
		
		//Toma de datos personales de empleados
		
		System.out.println("Introduce tu número identificador");
		numEmpleado = datos.nextInt();
		
		System.out.println("Introduce tu número edad");
		edad = datos.nextByte();
		
		System.out.println("Introduce tu número salario por hora");
		salHora = datos.nextFloat();
		
		System.out.println("Es jornada completa? (Introduce Si o No)");
		jornada = datos.nextLine();
		
		datos.nextLine();
		
		System.out.println("Introduce cuantas horas has trabajado esta semana");
		horasSemanales = datos.nextByte();
		
		
		salBruto = salHora * horasSemanales;//Calculo salario bruto
		retencion = (salBruto * IRPF) / 100 ;//Cáculo del IRPF
		salNeto = salBruto - retencion;//Cálculo salario Neto
		
		//Comprobación de datos
		
		if (jornada.equals("Si")) {
			esJornadaCompleta = true;
			
		}
        if (jornada.equals("No")) {
			esJornadaCompleta = false;
			
		}
        
		//Resultado de calculos y datos mostrado en pantalla
        
		System.out.println("Empleado " + numEmpleado + " de edad " + edad + " años");
		System.out.println("Su salario por hora es: " + salHora + "€");
		System.out.println("Su salario bruto semanal es: " + salBruto + "€");
		System.out.println("Se le aplica un IRPF de " + IRPF + "%");
		System.out.println("Su salario neto tras el IRPF es de: " + salNeto + "€");
		
		//Comprobación de elegibilidad para bono y muestra en pantalla el resultadoç
		
		if (esJornadaCompleta = true && horasSemanales >= 40) {
			elegibilidadParaBono = "Usted cumple los requisitos para obtener un bono";
			System.out.println(elegibilidadParaBono);
			
		}else {
			elegibilidadParaBono = "Usted no cumple los requisitos para obtener un bono";
			System.out.println(elegibilidadParaBono);
			
		}

	}

}
