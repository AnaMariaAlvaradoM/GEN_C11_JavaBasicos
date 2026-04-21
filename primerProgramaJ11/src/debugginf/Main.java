package debugginf;

public class Main {
    public static void main(String[] args) {
        //int precio = "cinco mil";
//        int[] ventas = {15000, 23000, 8000, 31000, 120000};
//        System.out.println(ventas[4]);
//        System.out.println(ventas[2]);
//        System.out.println(ventas[6]);

//        int[] ventas = {15000, 23000, 8000, 31000, 12000};
//        int total = 0;
//
//        for (int i = 0; i < ventas.length; i++) {
//            total = total + ventas[i];
//        }
//        System.out.println("Total ventas: " + total);

        int totalVentas = 89000;
        int diasSinVentas = 0;

        int promedioPorDia = totalVentas / diasSinVentas;
        System.out.println("Promedio diario: " + promedioPorDia);
    }
}
