package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int num = datos.nextInt();

        int divisores = 0; // contador de divisores encontrados

        if (num < 2) {
            divisores = 1; // marcamos como no primo
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }
        }

        if (divisores == 0) {
            System.out.println("Es un número primo");
        } else {
            System.out.println("No es número primo");
        }

    }
}
