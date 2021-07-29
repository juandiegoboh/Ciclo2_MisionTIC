package o_contador;

public class Main {
    public static void main(String[] args) {
        // Declarar Variables

        Contador cont1 = new Contador();

        System.out.println("Contador 1 = " + cont1.getCont());
        cont1.setCont(60);
        System.out.println("Contador 1 = " + cont1.getCont());
        // 5 ventas
        cont1.decrementar();
        cont1.decrementar();
        cont1.decrementar();
        cont1.decrementar();
        cont1.decrementar();
        System.out.println("Después de la venta Contador 1 = " + cont1.getCont());
        // Devolvieron 1 unidad
        cont1.incrementar();
        System.out.println("Después de la devolución Contador 1 = " + cont1.getCont());

        // Pasó 1 mes, copia cont para el siguiente mes
        Contador cont2 = new Contador(cont1);   // Se crea el objeto, y al constructor se le pasa el objeto que se va
        // a copiar
        System.out.println("Copia de Contador 1 = Contador 2 = " + cont2.getCont());

        // Nuevo producto, el stock es de 100 unidades
        Contador cont3 = new Contador(100);
        System.out.println("Contador 3 = " + cont3.getCont());

        /*
        Suponiendo que los contadores hacen referencia al stock de productos en el almacen
        con ventas mayoristas y minoristas
        Qué modificaciones debo realizar para actualizar el contador en la venta de una determinada cantidado que
        llegue más inventario de un determinado producto
         */

        // Llegan 30 unidades del producto cont3

        System.out.println("Había en cont3: " + cont3.getCont());
        cont3.incrementar(30);

        System.out.println("Actualiza cont3: " + cont3.getCont());

        // Venta mayorista de 20 unidades
        cont3.decrementar(20);
        System.out.println("Venta 20 unidades => cont3: " + cont3.getCont());

        // Incrementa desde un string
        cont3.incrementar("66");
        System.out.println("Actualiza con el string \"66\" => cont3: " + cont3.getCont());

    }

}

