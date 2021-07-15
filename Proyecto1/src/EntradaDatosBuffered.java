import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatosBuffered {
    public static void main(String[] args) throws IOException {
        // Ingresar los datos usando BufferedReader
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        String name;

        System.out.println("Digite su nombre: ");

        // Lee los datos usando readLine
        name = reader.readLine();

        // Imprime la línea de lectura
        System.out.println("Hola " + name + ", bienvenido a java");
    }
}
