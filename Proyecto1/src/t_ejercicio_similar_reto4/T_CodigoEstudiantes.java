package t_ejercicio_similar_reto4;

import java.net.PortUnreachableException;
import java.util.*;

public class T_CodigoEstudiantes {
    // Atributos
    // private TreeSet<String> codigos; // Entre <> va el tipo de dato que tendrá la colección
    private Set<String> codigos;
    // private List<String> codigos;

    // Contructor
    public T_CodigoEstudiantes(){
        this.codigos = new TreeSet<>();
        // this.codigos = new HashSet<>();
        // this.codigos = new ArrayList<>();
        // this.codigos = new LinkedList<>();
    }

    // Métodos
    public void agregarCodigo(String codigo){
        this.codigos.add(codigo);
    }

    public void mostrarCodigos(){
        System.out.println(this.codigos);
    }

}
