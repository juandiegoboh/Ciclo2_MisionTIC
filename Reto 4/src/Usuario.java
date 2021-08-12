import java.util.Set;
import java.util.TreeSet;

public class Usuario {
    // Atributos
    private Set<String> listaTelefonos;

    // Constructor
    public Usuario(){
        this.listaTelefonos = new TreeSet<>();
    }

    // Metodos
    public void addTelefono(String telefono){
        this.listaTelefonos.add(telefono);
    }

    public void mostrarTelefonos(){
        System.out.println(this.listaTelefonos);
    }
}
