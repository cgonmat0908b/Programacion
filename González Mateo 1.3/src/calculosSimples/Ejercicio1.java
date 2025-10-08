/*Descripción: En este ejercicio se solicita una serie de datos 
 * hará un calculo simple y mostrará en pantalla el resultado.
 * Fecha: 1/10/25
 * Autor: Cristian González Mateo
 */
package calculosSimples;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String nombre;
		System.out.println("Introduce tu nombre");
		nombre = datos.next();
		
		String apellidos;
		System.out.println("Introduce tus apellidos");
		apellidos = datos.next();
		
		String fechaNacimiento;
		System.out.println("Introduce tu fecha de nacimiento con palabras");
		fechaNacimiento = datos.next();
		
		short salarioBruto;
		System.out.println("Introduce tu salario bruto");
		salarioBruto = datos.nextShort();
		
		byte anyosTrabajados;
		System.out.println("Introduce los años trabajados");
		anyosTrabajados = datos.nextByte();
		
		double salarioNeto = salarioBruto * 0.85;
	    int aumentoPorcentual = anyosTrabajados * 2;
		double salarioTotal = salarioNeto * (1 +(aumentoPorcentual / 100) ) ;
		
		System.out.println("Estimad@ " + nombre + " " + apellidos + ", su salario bruto es " + salarioBruto + ", teniendo en cuenta un IRPF del 15% su salario neto es " + salarioNeto);
		System.out.println();
		System.out.println("Debido a sus " + anyosTrabajados + " años trabajando en la empresa su salario se incrementará en un 2% por cada año. El aumento es de " + aumentoPorcentual + "%" + " y el salario total es " + salarioTotal);
		

		
	}

}
