package flujoDeControl;

public class Switch {
    public static void main(String[] args) {
        int codigo = 403;

        switch (codigo) {
            case 200:
                System.out.println("Autenticado ✓");
                break;
            case 401:
                System.out.println(
                        "Credenciales inválidas");
                break;
            case 403:
                System.out.println(
                        "Sin permisos");
                break;
            case 500:
                System.out.println(
                        "Error interno");
                break;
            default:
                System.out.println(
                        "Código desconocido");
        }
    }
}
