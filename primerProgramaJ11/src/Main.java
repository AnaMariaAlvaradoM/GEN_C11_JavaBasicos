import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //! tipos de datos:
        byte edadMinima = 18;
        short dia = 1;
        int edad = 60;

        long distancia = 94342343444L;
        float precio = 9.99f;
        double pi = 3.1453435656546356;

        String nombre = "Ana";

        System.out.print("Tu nombre es: " + nombre);

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("¿Cuál es tu edad?");
        int edadUsuario = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Cuál es tu apellido: ");
        String apellidoUsuario = scanner.nextLine();

    }
}