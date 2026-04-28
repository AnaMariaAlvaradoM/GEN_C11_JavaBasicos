package colecciones.taller1;

import java.util.HashMap;
import java.util.Map;

public class HashMapE {

    Map<String, Double> trabajadores = new HashMap<>();

    //* Agregar trabajador
    public void agregarTrabajador(String nombre, double salario) {
        trabajadores.put(nombre, salario);
    }

    //* Mostrar todos
    public void mostrarTrabajadores() {
        System.out.println("Directorio:");
        for (Map.Entry<String, Double> entry : trabajadores.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }

    //* Actualizar salario
    public void actualizarSalario(String nombre, double nuevoSalario) {
        if (trabajadores.containsKey(nombre)) {
            trabajadores.put(nombre, nuevoSalario);
            System.out.println("Salario actualizado");
        } else {
            System.out.println("Trabajador no encontrado");
        }
    }

    //* Promedio salarial
    public void calcularPromedio() {
        double suma = 0;
        for (double salario : trabajadores.values()) {
            suma += salario;
        }
        double promedio = trabajadores.size() > 0 ? suma / trabajadores.size() : 0;
        System.out.println("Salario promedio: $" + promedio);
    }
}
