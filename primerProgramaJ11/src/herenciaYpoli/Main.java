package herenciaYpoli;

public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Hyundai", 200, 5);
        Motocicleta moto1 = new Motocicleta("Yamaha", 500, 500);
        System.out.println(auto1.getMarca());
        System.out.println(auto1.getNumPuertas());
        System.out.println(moto1.getMarca());
    }
}
