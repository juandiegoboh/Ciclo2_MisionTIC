import java.util.Scanner;

public class I_DoWhileSwitchWhileFor {
    public static void main(String[] args) {

        // Declarar variables
        byte opcion, contador;
        int i;

        Scanner leerOpcion = new Scanner(System.in);

        do {
            System.out.println("----Seleccione una opción: ----");
            System.out.println("1 Para ejercutar un While");
            System.out.println("2 Para ejercutar un Do While");
            System.out.println("3 Para ejercutar un For");
            System.out.println("0 Para salir o terminar");

            opcion = leerOpcion.nextByte();

            switch (opcion){
                case 1:
                    // Ejecutar un while
                    System.out.println("Ejecuta while");
                    contador = 1;
                    while (contador <= 5){
                        System.out.println("Contador = " + contador);
                        contador ++;
                    }
                    System.out.println("Variable termina contador = " + contador);
                    break;
                case 2:
                    // Ejecutar un do while
                    System.out.println("Ejecuta do while");
                    contador = 1;
                    do {
                        System.out.println("Contador = " + contador);
                        contador ++;
                    } while (contador <= 5);
                    System.out.println("Variable termina contador = " + contador);
                    break;
                case 3:
                    // Ejecutar un for
                    System.out.println("Ejecuta for");
                    for (i = 1; i <= 5; i++) {
                        System.out.println("i = " + i);
                    }
                    System.out.println("Variable termina i = " + i);
                    break;
                case 0:
                    // Salir o terminar
                    System.out.println("Ha decidido salir del programa. Vuelva pronto.");
                default:
                    // Otra opción del menú
                    System.out.println("Seleccione una opción correcta");
            }

        } while (opcion != 0);
        System.out.println("\nSalió del do-while");
    }
}
