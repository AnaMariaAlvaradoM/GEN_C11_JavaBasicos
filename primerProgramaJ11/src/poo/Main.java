package poo;

public class Main {
    public static void main(String[] args) {
//        Reserva reserva = new Reserva();
//        reserva.huesped = "Zully Tamayo";
//        reserva.precioPorNoche = -80;

        Reserva reserva1 = new Reserva("Juan Da", 5, 100);
//        System.out.println(papitas);
        reserva1.setPrecioPorNoche(1000);
        System.out.println(reserva1.getPrecioPorNoche());
        System.out.println(reserva1.getHuesped());
        System.out.println(reserva1.getNumeroHabitaciones());

        Reserva reserva2 = new Reserva("Juan Da", 5, 100);
    }
}
