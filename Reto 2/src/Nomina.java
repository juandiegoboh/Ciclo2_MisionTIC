public class Nomina {
    public static void main(String[] args) {

        // Declarar el objeto
        Usuario empleado = new Usuario("Juan", 1095834454, "juandiego@hotmail.com",
                23, "Desarrollo", false);

        // Salidas
        empleado.info();

        Usuario obj = new Usuario("Lucia Gomez", 1097000000, "lucia.gomez@correo.com", 25, "desarrollo", true);
        obj.info();
    }
}
