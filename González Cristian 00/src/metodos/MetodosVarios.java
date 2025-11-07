package metodos;

public class MetodosVarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean par;
		par = esPar(7);
		System.out.println(par);
		
		System.out.println(esPar(9));
		
		System.out.println(esImpar(6));
		
		
		
	}

	//Método que comprobará si numero es par devolviendo un boolean.
	public static boolean esPar(int numero) {
		boolean par;
		if (numero%2 == 0) {
			par = true;
			
		}else {
			par = false;
		}
		return par;
	}
	
	public static boolean esImpar(int num) {
		return !esPar (num);
	}
}
