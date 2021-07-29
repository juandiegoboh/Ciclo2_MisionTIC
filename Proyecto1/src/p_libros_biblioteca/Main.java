package p_libros_biblioteca;

import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declarar variables

        Scanner leerDatoTeclado = new Scanner(System.in);
        String titulo, autor;
        int numeroEjemp, numeroPrestados;

        Libro libro1 = new Libro();

        System.out.println("Titulo del libro: ");
        titulo = leerDatoTeclado.nextLine();
        libro1.setTitulo(titulo);

        System.out.println("Autor del libro: ");
        autor = leerDatoTeclado.nextLine();
        libro1.setAutor(autor);

        do {
            System.out.println("Digite el número de ejemplares: ");
            System.out.println("Debe ser un número mayor a 0.");
            numeroEjemp = leerDatoTeclado.nextInt();
            leerDatoTeclado.nextLine();     // Linea que se salta debido al error de nextInt()
        } while (numeroEjemp <= 0);
        libro1.setEjemplares(numeroEjemp);

        do {
            System.out.println("Digite la cantidad de libros prestados: ");
            System.out.println("La cantidad debe ser menor a la cantidad de ejemplares disponibles.");
            System.out.println("Cantidad de ejemplares disponibles: " + libro1.getEjemplares());
            numeroPrestados = leerDatoTeclado.nextInt();
            leerDatoTeclado.nextLine();
        } while (numeroPrestados < 0 || numeroPrestados > numeroEjemp);
        libro1.setPrestados(numeroPrestados);

        System.out.println("----------------------------------------------");

        Libro libro2 = new Libro("El Ingenioso Higaldo Don Quijote de la Mancha", "Miguel de Cervantes", 15, 0);

        System.out.println("----------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("Información de los libros");
        System.out.println("----------------------------------------------");
        System.out.println(libro1.informacion());
        System.out.println(libro2.informacion());
    }
}
