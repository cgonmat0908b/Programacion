package metodos;

public class MetodoTipoNoPrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vectorOriginal = {1, 2, 3};
		int [] vectorModificado = new int [2];
		
		for (int i = 0; i< vectorOriginal.length; i++) {
			System.out.println("En la posición " + i + " hay " + vectorOriginal[i]);
		}
		vectorModificado = cambioVector(vectorOriginal);
		
		
			for (int f = 0; f< vectorOriginal.length; f++) {
				System.out.println("En la posición " + f + " hay " + vectorOriginal[f]);
			}
			
			for (int f = 0; f< vectorModificado.length; f++) {
				System.out.println("En la posición " + f + " hay " + vectorModificado[f]);
			}
		
		
	}
	
	

	//Siempre incluir explicación del metodo
	
	public static int [] cambioVector(int [] vectorNoOriginal) {
		int [] vectorMetodo = new int [2];
		
		vectorNoOriginal[0] = 5;
		vectorNoOriginal[1] = 10;

		vectorMetodo [0] = vectorNoOriginal[0]+2;
		vectorMetodo [1] = vectorNoOriginal[1]+10;
		return vectorMetodo;
		}
	}

