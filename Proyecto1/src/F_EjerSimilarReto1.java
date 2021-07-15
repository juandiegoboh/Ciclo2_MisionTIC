import java.util.Scanner;

public class F_EjerSimilarReto1 {
    public static void main(String[] args) {
        // Precio de la boleta es $50.000
        // niños con edad menor o igual a 10, descuento del 80%
        // niños con edad entre 11 y 17, descuento del 65%
        // adulto mayor (mayor o igual a 60) descuento de 45%
        // Realizar una función que retorne el valor a pagar

        // Declarar variables
        int edad;
        float precioBoleta;
        double descuento, totalPagar;
        Scanner leerEdad = new Scanner(System.in);

        // Entrada(s) => edad, precio de la boleta
        System.out.println("Registre la edad del visitante: ");
        edad = leerEdad.nextInt();
        precioBoleta = 50000;

        // Transformacion => operacionDescuento, operacionTotal
        descuento = descuentoEntrada(edad, precioBoleta);
        totalPagar = precioBoleta - descuento;

        // Salida(s) => Valor a pagar
        System.out.println("El descuento es de COP$" + descuento);
        System.out.println("El total a pagar es COP$" + totalPagar);
    }

    private static double descuentoEntrada(int edad, float precioBoleta) {
        // Declarar variables de la función
        double porcentaje;

        if(edad <= 10){
            porcentaje = (double) 80/100;   // Casteo
        } else if(edad <= 17){
            porcentaje = 0.65;
        } else if(edad >= 60){
            porcentaje = 0.45;
        } else {
            porcentaje = 0;
        }

        return precioBoleta * porcentaje;
    }
}
