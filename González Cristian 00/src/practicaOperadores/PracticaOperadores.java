package practicaOperadores;

public class PracticaOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato1; 
		double dato2;
		dato1 = 3;
		dato2 = 34;
		
		int suma;
	//	suma = dato1+dato2;
		//System.out.println("La suma de 34 + 3 es: " + suma);
		
		double resultadoDivision;
		resultadoDivision = dato2/dato1;
		System.out.println("La división de 34 entre 3 es: " + resultadoDivision);
		
		double moduloDivision;
		moduloDivision = dato2%dato1;
		System.out.println("El resto de 34 entre 3 es: " + moduloDivision);
		
		int dato1mas, dato1menos;
		dato1mas = dato1++; //dato1mas = dato1 + 1
		dato1menos = dato1--; //dato1menos = dato1 - 1
		
		System.out.println("Incremental posterior: " + ++dato1);
		
		System.out.println(dato1 == dato2);

		System.out.println(dato1 != dato2);
		boolean distinto = dato1 != dato2;
		System.out.println(distinto);
		
		System.out.println(dato1 <= dato2);
		
		/*     &&                      ||
		 * 0*0 = 0 = False       0+0 = 0 = False
		 * 0*1 = 0 = False       0+1 = 1 = True
		 * 1*0 = 0 = False       1+0 = 1 = True
		 * 1*1 = 1 = True        1+1 = 1 = True
		 */
		
		
		
		
	}

}
