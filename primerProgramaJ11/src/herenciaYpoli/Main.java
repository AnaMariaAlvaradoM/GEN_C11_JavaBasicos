package herenciaYpoli;

public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Hyundai", 200, 5);
        Motocicleta moto1 = new Motocicleta("Yamaha", 500, 500);
        System.out.println(auto1.getMarca());
        System.out.println(auto1.getNumPuertas());
        System.out.println(moto1.getMarca());
        auto1.calcularCosto(5, false);
        System.out.println(auto1.calcularCosto());
        System.out.println(auto1.calcularCosto(5));
        System.out.println(auto1.calcularCosto(20000, true));
        System.out.println(auto1.describir());
        System.out.println(moto1.describir());

        Vehiculo v1 = new Automovil("Toyota", 180, 4);
        Vehiculo v2 = new Motocicleta("Honda", 140, 600);
        Vehiculo v3 = new Vehiculo("Genérico", 120);
        System.out.println("___ V1");
        System.out.println(v1.describir());
        v1.describir();
        System.out.println("___ V2");
        // → versión Automovil
        System.out.println(v2.describir());
        v2.describir();
        // → versión Motocicleta
        System.out.println(v3.describir());
        v3.describir();

    }
}
