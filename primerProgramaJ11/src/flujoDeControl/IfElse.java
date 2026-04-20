package flujoDeControl;

public class IfElse {
    public static void main(String[] args) {
        String rol = "empleado";

        if (rol.equals("admin"))  {
            System.out.println("Acceso total");
        } else if (rol.equals("empleado")) {
            System.out.println("Acceso parcial");
        } else if (rol.equals("invitado")) {
            System.out.println(
                    "Solo lectura");
        } else {
            System.out.println(
                    "Acceso denegado");
        }
    }
}
