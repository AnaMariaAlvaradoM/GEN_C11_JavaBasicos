package herenciaYpoli;

public class Automovil extends Vehiculo implements Asegurable, Lavable{
    private int numPuertas;

    public Automovil(String marca, int velocidadMax, int numPuertas) {
        super(marca, velocidadMax);
        //this.marca = marca;
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public double calcularCosto() {
        return 50000.0;
    }

    public double calcularCosto(int kilometros) {
        return 50000.0 + (kilometros * 120.0);
    }
//    public double calcularCosto(int kilometros, int numPuertas) {
//        return 50000.0 + (kilometros * 120.0);
//    }

    public double calcularCosto(int kilometros, boolean incluyeSeguro) {
        double base = calcularCosto(kilometros);
        return incluyeSeguro ? base + 15000.0 : base;
    }
//    @Override
//    public String describir() {
//        return " | Puertas: " + numPuertas ;
//    }


    @Override
    public String describir() {
        String base = super.describir();
        return base + " | Puertas: " + numPuertas ;
    }

    @Override
    public double calcularCostoKM(){
        return 16000 / 12.5;
    }

    @Override
    public double calcularSeguro() {
        return 0;
    }

    @Override
    public String obtenerNumPoliza() {
        return "";
    }

    @Override
    public String lavando() {
        return "";
    }
}
