package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysList {
    public static void main(String[] args) {

//        List<String> pedidos = new ArrayList<>();
//
//        pedidos.add("Papitas");
//        pedidos.add(1, "Papitas con pollo");
//
//        System.out.println(pedidos.get(0));
//        System.out.println(pedidos.size());
//        System.out.println(pedidos.contains("Ajiaco"));
//        pedidos.remove("Papitas");
//        System.out.println(pedidos);


        List<String> menu = new ArrayList<>();

        menu.add("Bandeja paisa");
        menu.add("Ajiaco");
        menu.add("Mojarra");
        menu.add("Hamburguesa");
        menu.add("Hamburguesa");
        menu.add("Hamburguesa");
        menu.add("Hamburguesa");
        menu.add("Hamburguesa");
        menu.add("Hamburguesa");
        menu.add("Hamburguesa");
        menu.add("Hamburguesa");
        menu.add("Hamburguesa");
        menu.add("Hamburguesa");
        menu.add("Hamburguesa");
        menu.add("Hamburguesa");
        System.out.println(menu);

        System.out.println("Menú: " + menu);

        System.out.println("Platos en nuestro menu: " + menu.size());




    }
}
