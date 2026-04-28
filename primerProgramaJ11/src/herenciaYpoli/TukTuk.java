package herenciaYpoli;

public class TukTuk extends Motocicleta implements Asegurable{


    public TukTuk(String marca, int velocidadMax, int cilindraje) {
        super(marca, velocidadMax, cilindraje);
    }

    @Override
    public double calcularSeguro() {
        return 0;
    }

    @Override
    public String obtenerNumPoliza() {
        return "";
    }
}
