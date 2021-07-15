import java.text.MessageFormat;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        // Declarar variables
        double porcentajeBono;
        int anios;
        float bono;

        // Entrada
        Scanner leerEdad = new Scanner(System.in);
        System.out.println("Ingrese los años que lleva en la empresa: ");
        anios = leerEdad.nextInt();
        bono = 500000;

        // Transformación
        porcentajeBono = calcularPorcentajeBono(anios,bono);

        // Salida
        System.out.println(MessageFormat.format("{0} es el monto extra que le corresponde.", porcentajeBono));
    }

    private static double calcularPorcentajeBono(int anios, float bono) {
        // Declarar variables
        double porcentaje;

        // Transformación
        if (anios >= 10) {
            porcentaje = 0.3;
        } else if (anios >= 5){
            porcentaje = 0.2;
        } else if (anios >= 3) {
            porcentaje = 0.1;
        } else{
            porcentaje = 0.05;
        }
        // Salida
        return  porcentaje * bono;
    }
}
