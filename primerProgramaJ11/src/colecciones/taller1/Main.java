package colecciones.taller1;

public class Main {
    public static void main(String[] args) {

        //! --- ARRAYLIST ---
        ArrayListt lista = new ArrayListt();
        lista.agregarTarea("Estudiar Java");
        lista.agregarTarea("Hacer ejercicio");
        lista.mostrarTareas();
        lista.eliminarTareasPorId(0);
        lista.mostrarTareas();
        lista.eliminarTareasPorNombre("Haer ejercicio");
        lista.mostrarTareas();
        lista.mostrasPendiente();

        System.out.println("-------------");

        //? HASHSET
        HashsetE biblioteca = new HashsetE();
        biblioteca.agregarLibro("Clean Code");
        biblioteca.agregarLibro("Clean Code"); // duplicado
        biblioteca.agregarLibro("Java Basics");
        biblioteca.mostrarLibros();
        biblioteca.buscarLibro("Clean Code");
        biblioteca.totalLibros();

        System.out.println("-------------");

        //* HASHMAP
        HashMapE dir = new HashMapE();
        dir.agregarTrabajador("Pepito", 2000);
        dir.agregarTrabajador("Luis", 3000);
        dir.mostrarTrabajadores();
        dir.actualizarSalario("Ana", 2500);
        dir.calcularPromedio();

    }
}
