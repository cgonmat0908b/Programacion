/*Descripción: En este ejercicio se solicita una serie de datos 
 * hará un calculo simple y mostrará en pantalla el resultado.
 * Fecha: 1/10/25
 * Autor: Cristian González Mateo
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String nombre;
		System.out.println("Introduce tu nombre");
		nombre = datos.next(); // Lee el nombre del usuario
		
		String apellidos;
		System.out.println("Introduce tus apellidos");
		apellidos = datos.nextLine(); // Lee los apellidos del usuario (solo una palabra por next)
		
		datos.nextLine();
		
		String fechaNacimiento;
		System.out.println("Introduce tu fecha de nacimiento con palabras");
		fechaNacimiento = datos.nextLine(); // Lee la fecha de nacimiento (solo la primera palabra)
	
		int salarioBruto;
		System.out.println("Introduce tu salario bruto");
		salarioBruto = datos.nextInt(); // Lee el salario bruto introducido por el usuario
		
		byte anyosTrabajados;
		System.out.println("Introduce los años trabajados");
		anyosTrabajados = datos.nextByte(); // Lee los años trabajados introducidos por el usuario
		
		double salarioNeto = salarioBruto * 0.85; // Calcula el salario neto aplicando un 15% de IRPF
	    double aumentoPorcentual = anyosTrabajados * 2; // Calcula el aumento del salario en base a los años trabajados
		double salarioTotal = salarioNeto * (1 +(aumentoPorcentual / 100) ); // Calcula el salario total tras el aumento
		
		System.out.println("Estimad@ " + nombre + " " + apellidos + ", su salario bruto es " + salarioBruto + ", teniendo en cuenta un IRPF del 15% su salario neto es " + salarioNeto);
		System.out.println();
		System.out.println("Debido a sus " + anyosTrabajados + " años trabajando en la empresa su salario se incrementará en un 2% por cada año. El aumento es de " + aumentoPorcentual + "%" + " y el salario total es " + salarioTotal);
		
	}

}