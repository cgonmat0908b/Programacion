package tiposEnumerados;

public class TiposEnumerados {

	public static void main(String[] args) {
		
		 enum Estaciones {PRIMAVERA, VERANO, OTOÑO, INVIERNO};
		
		Estaciones primeraEstacion = Estaciones.PRIMAVERA;
		Estaciones segundaEstacion = Estaciones.VERANO;
		Estaciones tereceraEstacion = Estaciones.OTOÑO;
		Estaciones cuartaEstacion = Estaciones.INVIERNO;
		
		System.out.println("La primera estacion del año es: " + Estaciones.PRIMAVERA);
		System.out.println("La segunda estacion del año es: " + Estaciones.VERANO);
		System.out.println("La segunda estacion del año es: " + Estaciones.OTOÑO);
		System.out.println("La segunda estacion del año es: " + Estaciones.INVIERNO);
		
		

	}

}
