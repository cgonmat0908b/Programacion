package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 *  Ejercicio 2
 Crea un método llamado productosDescuento que devolverá un valor double. 
Recibirá como parámetros tres valores (double precio, int cantidad, int descuento).

 El método calculará el precio a pagar, multiplicando la cantidad de productos por el precio, y 
aplicando el descuento (en porcentaje) correspondiente.

 El programa mostrará un mensaje por pantalla como aparece a continuación:
 
  Usted ha adquirido cantidad de productos nombreProducto, a un precio de precio euros la 
unidad.
 El precio a pagar es (precio sin descuento), pero al aplicarle el descuento del descuento% el 
precio final a pagar es: (precio con descuento).
		 */
		
		
		double precio, precioSinDescuento; 
		int cantidad, descuento;
		String nombreProducto;
	
		Scanner datos = new Scanner (System.in);
		
		System.out.println("Introduce el nombre del producto");
		nombreProducto = datos.nextLine();
		
		System.out.println("Introduce el precio");
		precio = datos.nextDouble();
		
		System.out.println("Introduce la cantidad");
		cantidad = datos.nextInt();
		
		System.out.println("Introduce el descuento");
		descuento = datos.nextInt();
		
		precioSinDescuento = (double) (precio * cantidad);
		
		System.out.println("Usted ha adquirido " + cantidad  + " productos "  + nombreProducto +  " a un precio de " + precio + " euros la unidad");
		
		System.out.println(" El precio a pagar es " + precioSinDescuento + ", pero al aplicarle el descuento del "  + descuento + "% precio final a pagar es: " + productosDescuento(precio,cantidad,descuento)); 
		
	}

	public static double productosDescuento(double precio, int cantidad, int descuento) {
		double precioFinal;
		
		precioFinal = (double)((precio * cantidad) * (1 -(descuento / 100.0)));
		
		return precioFinal;
	}
}
