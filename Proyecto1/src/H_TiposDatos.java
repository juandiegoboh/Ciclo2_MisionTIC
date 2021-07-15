public class H_TiposDatos {
    public static void main(String[] args) {

        System.out.println("Tamaño en bits del tipo byte " + Byte.SIZE);
        System.out.println("Tamaño en bytes del tipo byte " + Byte.BYTES);
        System.out.println("Minimo valor numérico del tipo byte " + Byte.MIN_VALUE);
        System.out.println("Máximo valor numérico del tipo byte " + Byte.MAX_VALUE);

        System.out.println("*************************");
        System.out.println("Tamaño en bytes del tipo short " + Short.BYTES);
        System.out.println("Minimo valor numérico del tipo short " + Short.MIN_VALUE);
        System.out.println("Tamaño en bits del tipo short " + Short.SIZE);
        System.out.println("Máximo valor numérico del tipo short " + Short.MAX_VALUE);

        char a = '1';
        System.out.println("Char a = " + a);
        short b = (short) a;
        System.out.println("Short b = (short) a = " + b);
        int c = a;
        System.out.println("int c = a = " + c);
    }
    }
