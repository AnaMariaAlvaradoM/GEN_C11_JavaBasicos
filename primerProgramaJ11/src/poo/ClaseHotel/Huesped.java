package poo.ClaseHotel;

public class Huesped {
    private String nombre;
    private String apellido;
    private int numeroDeHabitacion;
    private int diasReserva;

    public Huesped() {

    }

    public Huesped(String nombre, String apellido, int numeroDeHabitacion, int diasReserva) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.diasReserva = diasReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroDeHabitacion() {
        return numeroDeHabitacion;
    }

    public void setNumeroDeHabitacion(int numeroDeHabitacion) {
        this.numeroDeHabitacion = numeroDeHabitacion;
    }

    public int getDiasReserva() {
        return diasReserva;
    }

    public void setDiasReserva(int diasReserva) {
        this.diasReserva = diasReserva;
    }

//    public static void imprimirReserva(Huesped huesped){
//        System.out.println("Cliente: " + huesped.getHuesped());
//        System.out.println("Precio por noche: $" + huesped.getPrecioPorNoche());
//        System.out.println("Num habitaciónes: " + huesped.getNumeroHabitaciones());
//    }

}
