import java.util.Scanner;

public class EntradaDatosScanner {
    public static void main(String[] args) {
        // Scanner para obtener información del usuario
        Scanner leerDatos = new Scanner(System.in);
        String nombre;
        // Números
        int numero;
        float numero_b;

        System.out.println("Digite un número entero: ");
        numero = leerDatos.nextInt();
        leerDatos.nextLine();   // Se repite la entrada para evitar el salto de línea que ocurre posteriormente
        System.out.println("El número ingresado es: " + numero);

        System.out.println("Digite su nombre: ");
        nombre = leerDatos.nextLine();
        System.out.println("Hola " + nombre + " bienvenido a Java.");

        /*
        System.out.println("Digite un número entero: ");

        numero = leerDatos.nextInt();
        System.out.println("El número ingresado es: " + numero);*/

        System.out.println("Digite un número flotante: ");

        numero_b = leerDatos.nextFloat();
        System.out.println("El flotante ingresado es: " + numero_b);

    }
}
