package colecciones;

import java.util.HashMap;
import java.util.Map;

public class HashMapT {
    public static void main(String[] args) {

        Map<String, Double> precios = new HashMap<>();

        precios.put("Ajiaco", 20.000);
        precios.put("Pollo", 20.000);
        precios.put("Papitas", 20.000);
        precios.put("Arroz", 20.000);
        precios.put("Pescado", 20.000);
        precios.put("Ajiaco", 20.000);

        precios.size();
        precios.keySet();
        precios.values();


        for(String llave : precios.keySet()){
            System.out.println("Plato: " + llave);
        }

        for(Double precio : precios.values()){
            System.out.println("Precios: " + precio);
        }

        for (Map.Entry<String, Double> e : precios.entrySet()) {
            System.out.println(e.getKey() + " → $" + e.getValue());
        }

        precios.forEach((producto, precio) -> {
            System.out.println("Producto: " + producto + " | Costo: " + precio);
        });






    }
}
