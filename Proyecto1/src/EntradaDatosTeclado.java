public class EntradaDatosTeclado {
    public static void main(String[] args) {
        String nombre;
        System.out.println("Por favor dime tu nombre: ");
        nombre = "Juan";
        //nombre = System.console().readLine();  // Entrada de datos, análogo al input de python
        System.out.println("Hola " + nombre + ", Bienvenido a Java desde Cero!");
    }
}
