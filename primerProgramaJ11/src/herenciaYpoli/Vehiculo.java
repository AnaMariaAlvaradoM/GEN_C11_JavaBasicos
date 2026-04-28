package herenciaYpoli;

public abstract class Vehiculo {
    private String marca;
    private int velocidadMax;

    public Vehiculo() {
    }

    public Vehiculo(String marca, int velocidadMax) {
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String describir(){
        return "Marca:  " + getMarca() + " VelMax: " + getVelocidadMax();
    }

    public void encender(){
        System.out.println(marca + "encendido");
    }

    public abstract double calcularCostoKM();

//    public abstract  String asegurable();
}
