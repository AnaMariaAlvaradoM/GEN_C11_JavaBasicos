package poo;

public class Reserva {
    private String huesped;
    private int numeroHabitaciones;
    private double precioPorNoche;
    private boolean confirmada;

    //! Constructor Vacio
    public Reserva() {
    }

    //! Constructor Parámetros
    public Reserva(String huesped, int numeroHabitaciones, double precioPorNoche) {
        this.huesped = huesped;
        this.numeroHabitaciones = numeroHabitaciones;
        this.precioPorNoche = precioPorNoche;
        this.confirmada = false;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        if(precioPorNoche <= 0){
            System.out.println("El precio debe ser mayor a cero");
            return;
        }
        this.precioPorNoche = precioPorNoche;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getHuesped() {
        return huesped;
    }

    public void setHuesped(String huesped) {
        this.huesped = huesped;
    }
}
