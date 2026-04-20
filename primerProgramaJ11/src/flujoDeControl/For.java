package flujoDeControl;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        // Contar hacia atrás
        for (int i = 10; i >= 1; i--) {
            System.out.println("Cuenta regresiva: " + i);
        }

        // De 2 en 2
        for (int i = 0; i <= 20; i += 2) {
            System.out.println("Número par: " + i);
        }

        // Con diferentes tipos de datos
        for (double precio = 10.0; precio <= 50.0; precio += 5.5) {
            System.out.println("Precio: $" + precio);
        }

        // Usar otra variable
        for (int edad = 18; edad <= 65; edad += 5) {
            System.out.println("Edad: " + edad + " años");
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = entrada.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        double total = 0.0;
        int cantidadProductos = 5;

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingrese el precio del producto " + i + ": ");
            double precio = new Scanner(System.in).nextDouble();
            total += precio; // Sumamos cada precio al total
        }
        System.out.println("Total a pagar: $" + total);
    }
}
