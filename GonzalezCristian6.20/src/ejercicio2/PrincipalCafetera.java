package ejercicio2;

public class PrincipalCafetera {

	public static void main(String[] args) {

		
		// Una cafetera vacía que se llene con 250cc y que sirva tazas de café hasta que se agote.
		
		Cafetera cafe250 = new Cafetera();
		cafe250.llenarCafetera(250f);
		boolean vacio = false;
		int contador = 0;
		do {
			try {
				cafe250.servirTaza(10);
				contador++;
			}catch(IllegalArgumentException ex1) {
				System.out.println(ex1.getMessage());
				System.out.println("Ya no queda más cafe, se ha servido " + contador + " tazas");
				vacio = true;
			}
		}while(vacio == false);
		
		contador = 0;
		vacio = false;
		
		// Una cafetera llena y que sirva 50 cafés de  50 cc cada uno. Llenar la cafetera cada vez que haga falta informando al usuario.
		
		Cafetera cafe50 = new Cafetera();
		int vecesRellenada = 0;
		do {
			try {
				cafe50.servirTaza(50);
				contador++;
			}catch(IllegalArgumentException ex1) {
				System.out.println(ex1.getMessage());
				System.out.println("Ya no queda más cafe, se ha servido " + contador + " tazas, se procederá a rellenar la cafetera");
				if(cafe50.getCantidadActual() == 0) {
					cafe50.llenarCafetera(500);
					vecesRellenada++;
					System.out.printf("Se ha rellenado %d veces %n", vecesRellenada );
				} 
				
				if(contador == 50) {
					vacio = true;
				}
			}
		}while(vacio == false);
			
	}

}
