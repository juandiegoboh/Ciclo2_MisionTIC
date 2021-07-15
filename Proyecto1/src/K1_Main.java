import java.util.Scanner;

public class K1_Main {
    public static void main(String[] args) {
        K2_Personas persona = new K2_Personas();

        // persona.id = 1095834454;
        persona.nombre = "Juan Diego";
        persona.apellido = "Bohórquez López";

        persona.imprimirId();
        persona.imprimirNombre();
        persona.imprimirApellido();

        K2_Personas persona2 = new K2_Personas();

        // persona2.id = 1098545863;
        persona2.nombre = "Sthefany";
        persona2.apellido = "Durán Tolosa";

        persona2.imprimirId();
        persona2.imprimirNombre();
        persona2.imprimirApellido();

        K2_Personas persona3 = new K2_Personas();

        // persona2.id = 1098545863;
        persona3.nombre = "Joan";
        persona3.apellido = "Martinez Redondo";

        persona3.imprimirId();
        persona3.imprimirNombre();
        persona3.imprimirApellido();

        // Constructor con parámetros

        K2_Personas persona4 = new K2_Personas("Leidy Sthefany", "Suarez");
        persona4.imprimirId();
        persona4.imprimirNombre();
        persona4.imprimirApellido();

        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leerDatos.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = leerDatos.nextLine();

        K2_Personas persona5 = new K2_Personas(nombre, apellido);
        persona5.imprimirId();
        persona5.imprimirNombre();
        persona5.imprimirApellido();
    }
}
