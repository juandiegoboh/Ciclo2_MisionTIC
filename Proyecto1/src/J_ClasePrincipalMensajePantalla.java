public class J_ClasePrincipalMensajePantalla {
    public static void main(String[] args) {
        String mensaje;

        mensaje = J2_ClaseSecunMensajePantalla.funcionMensaje();
        System.out.println(mensaje);

        // Declarar el objeto
        J2_ClaseSecunMensajePantalla objetoMensaje;

        // Instanciar el objeto, crearlo, reservar en memoria un espacio para el objeto
        objetoMensaje =  new J2_ClaseSecunMensajePantalla();

        String mens = objetoMensaje.funcion2Mensaje();

        System.out.println(mens);
        System.out.println(objetoMensaje.funcion2Mensaje());

    }
}
