package ex3;


import java.util.Scanner;

public class Ejercicio1_GestionProductos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombreProducto;
        int unidades;
        double precio;
        int totalProductos = 0;

        while (true) {
            System.out.print("Introduce el nombre del producto (o 'Terminar'): ");
            nombreProducto = sc.nextLine();

            if (nombreProducto.equalsIgnoreCase("Terminar")) {
                break;
            }

            // Validar unidades
            do {
                System.out.print("Introduce número de unidades (1-100): ");
                unidades = sc.nextInt();
            } while (unidades < 1 || unidades > 100);

            System.out.print("Introduce el precio del producto: ");
            precio = sc.nextDouble();
            sc.nextLine(); // limpiar buffer

            int descuento;

            if (unidades <= 10) {
                descuento = 5;
            } else if (unidades <= 50) {
                descuento = 10;
            } else {
                descuento = 15;
            }

            double totalSinDescuento = precio * unidades;
            double totalConDescuento = totalSinDescuento - (totalSinDescuento * descuento / 100);

            System.out.println("\n--- RESULTADO ---");
            System.out.println("Producto: " + nombreProducto);
            System.out.println("Unidades: " + unidades);
            System.out.println("Descuento aplicado: " + descuento + "%");
            System.out.println("Total final: " + totalConDescuento + " €\n");

            totalProductos++;
        }

        System.out.println("Cantidad total de productos procesados: " + totalProductos);   
    }
}
