package colecciones;

import java.util.HashSet;
import java.util.Set;

public class HashSetT {
    public static void main(String[] args) {

        Set<String> alergias = new HashSet<>();

        alergias.add("Gluten");
        alergias.add("Mani");
        alergias.add("Pescado");
        alergias.add("Pescado");
        alergias.add("Pescado");
        System.out.println(alergias);

        alergias.remove("Gluten");

        System.out.println(alergias);

        for(String producto : alergias){
            System.out.println("- " + producto);
        }

    }
}
