public class EntradaDatosConsole {
    public static void main(String[] args) {
        String name;

        System.out.println("Digite su nombre: ");

        name = System.console().readLine();
        System.out.println("Su nombre es: " + name);
    }
}
