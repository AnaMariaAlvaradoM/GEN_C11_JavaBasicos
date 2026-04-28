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

    @Override
    public String describir(){
        String base = super.describir();
        return base + " Cilindrjae: " + getCilindraje();
    }

    @Override
    public double calcularCostoKM() {
        return 0;
    }


}
