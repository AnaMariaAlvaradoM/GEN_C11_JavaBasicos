package herenciaYpoli;

public class Automovil extends Vehiculo{
    private int numPuertas;


    public Automovil(String marca, int velocidadMax, int numPuertas) {
        super(marca, velocidadMax);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
