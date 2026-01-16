package ejercicio4;

public class ArticuloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En el main de la clase principal instancia un objeto de la clase artículo.

Asígnale valores a todos sus atributos (los que quieras) y muestra por pantalla un mensaje del estilo “Pijama 
Precio:10€ - IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es decir, el precio
con IVA). Luego, cambia el precio y vuelve a imprimir el mensaje.
		 */
		Articulo maceta = new Articulo();
		
		maceta.nombre = "maceta";
		maceta.precioSinIva = 15;
		maceta.cuantosQuedan = 4;
		maceta.pvp = CalculoPvp(maceta.precioSinIva, maceta.IVA);
		
		System.out.printf("El producto %s tiene un precio sin IVA de %f, con el IVA de %d%%, su precio es %f y quedan %d articulos %n", maceta.nombre,maceta.precioSinIva,maceta.IVA, maceta.pvp,maceta.cuantosQuedan);
		
		maceta.precioSinIva = 27.54f;
		maceta.pvp = CalculoPvp(maceta.precioSinIva, maceta.IVA);
		System.out.printf("El producto %s tiene un precio sin IVA de %f, con el IVA de %d%%, su precio es %f y quedan %d articulos ", maceta.nombre,maceta.precioSinIva,maceta.IVA, maceta.pvp,maceta.cuantosQuedan);
		
		
	}

	public static float CalculoPvp(float precio, final int IVA) {
		float precioPvp = precio +  ((precio * IVA) / 100);
		return precioPvp;
	}
}
