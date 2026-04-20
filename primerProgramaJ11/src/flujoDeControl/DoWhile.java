package flujoDeControl;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
//        int num = 11;
//        do {
//            System.out.println(num);
//            num++;
//            System.out.println(num);
//        }while (num<=10);
//    }
//        Scanner scanner = new Scanner(System.in);
//        String contraseña;
//        int intentos = 0;
//        do {
//            System.out.print("Ingrese la contraseña: ");
//            contraseña = scanner.nextLine();
//            intentos++;
//        } while (!contraseña.equals("secreto") && intentos < 3);
//        if (contraseña.equals("secreto")) {
//            System.out.println("¡Contraseña correcta!");
//        } else {
//            System.out.println("Has agotado tus intentos. Acceso denegado.");
//        }
//        scanner.close();
//    }

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú del restaurante:");
            System.out.println("1. Pizza");
            System.out.println("2. Hamburguesa");
            System.out.println("3. Ensalada");
            System.out.println("4. Salir");
            System.out.print("Elija su opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¡Has elegido Pizza!");
                    break;
                case 2:
                    System.out.println("¡Has elegido Hamburguesa!");
                    break;
                case 3:
                    System.out.println("¡Has elegido Ensalada!");
                    break;
                case 4:
                    System.out.println("¡Gracias por visitar nuestro restaurante!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige nuevamente.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}
