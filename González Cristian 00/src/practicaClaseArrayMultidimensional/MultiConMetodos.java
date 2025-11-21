package practicaClaseArrayMultidimensional;

public class MultiConMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] temp = new int [12][30];
		int [][] tempModificada = asigTemp(temp);
		
		
		
	}

	public static int[][] asigTemp(int [][] temper) {
		int[][] tempMod = new int [12][30];
		
		for (int i = 0; i < temper.length;i++) {
			for(int f = 0; f < temper[i].length; f++) {
				temper[i][f] = (int) (Math.random() * 40);
				tempMod[i][f] = temper[i][f];
			}
		}
		
		return tempMod;
	}

		
	}

