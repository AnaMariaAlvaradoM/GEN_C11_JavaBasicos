package colecciones;

public class Array {
    public static void main(String[] args) {

        String[] menu = new String[3];
        String[] turnos = {"Mañana", "Tarde"};

        menu[0] = "Papitas";
        menu[1] = "Papitas con pollo";
        menu[2] = "Papitas con pollo 2";
        //menu[3] = "Papitas con pollo 3";

        for(String producto : menu){
            System.out.println(producto);
        }


        // Crear
        String[] menu3 = new String[4];          // tamaño fijo declarado
        String[] menu2 = {"A", "B", "C"};      // inicialización directa

// Leer y escribir
        menu[0] = "Ajiaco";                      // asignar por índice
        String plato = menu[0];                 // leer por índice
        int total = menu.length;                 // tamaño — propiedad, NO método (sin ())

// Recorrer
        for (int i = 0; i < menu.length; i++) { System.out.println(menu[i]); }
        for (String p : menu) { System.out.println(p); }   // for-each

    }
}
