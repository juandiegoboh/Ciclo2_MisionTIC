public class K2_Personas {
    // Atributos => Caracteristicas
    static int id = 1095834454; // Valor inicial
    String nombre, apellido;

    // Constructor

    K2_Personas(){
        id ++;
    }

    // Polimorfismo de sobrecarga

    K2_Personas(String nombre, String apellido){
        id ++;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Metodos - funciones => Comportamiento, funcionalidad

    public void imprimirId(){
        System.out.println("El id es: " + id);
    }

    public void imprimirNombre(){
        System.out.println("El nombre es: " + nombre);
    }

    public void imprimirApellido(){
        System.out.println("El apellido es: " + apellido);
    }
}
