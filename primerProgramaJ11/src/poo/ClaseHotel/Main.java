package poo.ClaseHotel;

public class Main {
    public static void main(String[] args) {
//        Reserva reserva = new Reserva();
//        reserva.huesped = "Zully Tamayo";
//        reserva.precioPorNoche = -80;
//
//        Reserva reserva1 = new Reserva("Juan Da", 5, 100);
////        System.out.println(papitas);
//        reserva1.setPrecioPorNoche(1000);
//        System.out.println(reserva1.getPrecioPorNoche());
//        System.out.println(reserva1.getHuesped());
//        System.out.println(reserva1.getNumeroHabitaciones());
//
//        Reserva reserva2 = new Reserva("Juan Da", 5, 100);


        //!!!!!!!!!!!!!!
//
//        Huesped huesped1 = new Huesped();
//        Huesped huesped2 = new Huesped("Ana", "Alvarado", 806, 5);
//
//        huesped1.setNombre("Pepito");
//        huesped1.setApellido("Perez");
//        huesped1.setNumeroDeHabitacion(805);
//        huesped1.setDiasReserva(8);
//
//        System.out.println("== Info Huesped 1");
//        huesped1.getApellido();
//        System.out.println(huesped1.getNombre());
//        System.out.println(huesped1.getApellido());
//        System.out.println(huesped1.getNumeroDeHabitacion());
//
//        System.out.println("== Info Huesped 2");
//        huesped2.getApellido();
//        System.out.println(huesped2.getNombre());
//        System.out.println(huesped2.getApellido());
//        System.out.println(huesped2.getNumeroDeHabitacion());


//        Huesped huesped3 = new Huesped("Ana", "Alvarado", 806, 5);
//        //imprimirReserva();
//        huesped3.
//    }
        Reserva reserva3 = new Reserva("Octavio", 5, 100);
        Reserva reserva4 = new Reserva("Pepito", 5, 100);
        //reserva3.imprimirReservas();
        Reserva.imprimirReserva(reserva3);
        System.out.println("===================");
        Reserva.imprimirReserva(reserva4);


        reserva3.confirmar();
    }
}
