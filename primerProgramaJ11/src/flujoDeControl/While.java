package flujoDeControl;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        int contador = 0;
//        while (contador < 10 ){
//            System.out.println("Estoy en la vuelta: " + contador);
//            contador++;
//        }
//        System.out.println(contador);

        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        String salida;
        while (bandera) {
            System.out.println("Quieres pasar el curso? (si/no)");
            salida = entrada.next();
            if (salida.equalsIgnoreCase("si")) {
                System.out.println("¡Genial! Vamos a trabajar duro para lograrlo.");
                bandera = false;
            } else {
                System.out.println("No te preocupes, sigue intentando.");
            }
        }
    }
}
