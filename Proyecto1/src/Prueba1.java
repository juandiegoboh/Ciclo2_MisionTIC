public class Prueba1 { // Se empieza con una clase con el mismo nombre del archivo.
    public static void main(String[] args) { // Función principal (main)
        byte var;   // Primero declaración de variables y luego su utilización
        int var2;
        double var3;

        var = 127;
        var2 = var + 1;
        final double PI = 3.14159;  // Declaración de una constante

        var3 = var2 + PI;

        System.out.println("Primer código en java");
        // abreviación sout --> System.out.println();

        System.out.println("El valor de var + 1 = " + (var + 1));
        System.out.println("El valor de var2 = " + var2);
    }
}
