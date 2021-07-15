import java.util.Scanner;
public class ConvertidorPesosDolares
{

    // private
    // protected
    public static void main(String[] args) {
        // Programa para convertir de pesos a dólares
        // Declaración de variables
        double cantPesosTengo, $1DolarPesos, cantDolarObt;

        // Entrada(s)
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de pesos que tiene: ");

        cantPesosTengo = leerDatos.nextDouble();
        $1DolarPesos = 3748.5;   // Tasa de cambio a 1 de Julio 2021

        // Transformación
        // cantDolarObt = 1 * cantPesosTengo / $1DolarPesos;
        //cantDolarObt = convertirPesosDolares(cantPesosTengo, $1DolarPesos);
        cantDolarObt = convPesoDolar(cantPesosTengo, $1DolarPesos);

        // Salida(s)
        System.out.println("Usted tiene USD $" + cantDolarObt);
        }

    private static double convPesoDolar(double cantPesosTengo, double $1DolarPesos) {
        return 1 * cantPesosTengo / $1DolarPesos;
    }

    public static double convertirPesosDolares(double cPT, double $1DP){
        // Declarar variables
        double cantDO;

        cantDO = 1 * cPT / $1DP;
        return cantDO;

    }
}

