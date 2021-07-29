package s_collection;

public class S2_ClienteBanco {
    // Atributos
    private String nombre;
    private int numCuenta;
    private static int num = 1045601000;
    private double saldoCuenta;

    // Constructor
    public S2_ClienteBanco(){}

    public S2_ClienteBanco(String nombre, double saldoCuenta){
        this.nombre = nombre;
        this.numCuenta = ++num;     // Primero se hace el incremento y luego se asigna (++ antes)
        this.saldoCuenta = saldoCuenta;
    }

    // Metodos - Funciones

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
}
