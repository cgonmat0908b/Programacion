package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner datos = new Scanner(System.in);
		
		double salarioJefe, salarioEncargado, salarioOficinista, presupuestoEmpresa, sueldoTotal;
		int numeroOficinistas;
		boolean proyectoTerminado, resultadoMetodo;
		String proyecto;
		
		System.out.println("Introduce el salario del jefe:");
		salarioJefe = datos.nextDouble();
		
		System.out.println("Introduce el salario del encargado:");
		salarioEncargado = datos.nextDouble();
		
		System.out.println("Introduce el salario de los oficinistas:");
		salarioOficinista = datos.nextDouble();
		
		System.out.println("Introduce el numero de oficinistas:");
		numeroOficinistas = datos.nextInt();
		
		System.out.println("Introduce el presupuesto de el proyecto:");
		presupuestoEmpresa = datos.nextDouble();
		
		System.out.println("Se ha acabado el proyecto? (si/no)");
		proyecto = datos.next();
		
		if(proyecto.equals("si")) {
			proyectoTerminado = true;
			
		}else {
			proyectoTerminado = false;
			
		}
		
		auditoriaEmpresa(salarioJefe, salarioEncargado, salarioOficinista, numeroOficinistas, proyectoTerminado, presupuestoEmpresa);
		
	}

	public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinista,int numeroOficinistas,boolean proyectoTerminado,double presupuestoEmpresa) {
		
		boolean respuesta = false;
		double sueldoTotal;
		
		if(proyectoTerminado == false) {
			respuesta = false;
			System.out.println(" No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
			
		}else {
			sueldoTotal = salarioJefe +  salarioEncargado + (salarioOficinista * numeroOficinistas);
			
			if(sueldoTotal > 20000) {
				respuesta = false;
				System.out.println(" No ha pasado la auditoría ya que el gasto en personal es de " + sueldoTotal + " y excede el límite mensual de 20.000 euros");
				
			}else if(presupuestoEmpresa > 100000) {
				respuesta = false;
				System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de " + presupuestoEmpresa + " excede el límite establecido de 100.000 euros");
				
			}else {
				respuesta = true;
				System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
			}
		}
		
		return respuesta;
	}
}
