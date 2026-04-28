package colecciones.taller1;

import java.util.HashSet;
import java.util.Set;

public class HashsetE {

    Set<String> libros = new HashSet<>();

    //? Agregar libro
    public void agregarLibro(String libro) {
        libros.add(libro);
    }

    //? Mostrar libros
    public void mostrarLibros() {
        System.out.println("Libros disponibles:");
        for (String libro : libros) {
            System.out.println("- " + libro);
        }
    }

    //? Verificar existencia
    public void buscarLibro(String libro) {
        if (libros.contains(libro)) {
            System.out.println("El libro sí está disponible");
        } else {
            System.out.println("El libro NO está disponible");
        }
    }

    //? Total libros únicos
    public void totalLibros() {
        System.out.println("Total libros únicos: " + libros.size());
    }

}
