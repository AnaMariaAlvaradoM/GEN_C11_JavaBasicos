package herenciaYpoli;

public class Motocicleta extends Vehiculo{
    private int cilindraje;


    public Motocicleta(String marca, int velocidadMax, int cilindraje) {
        super(marca, velocidadMax);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}
