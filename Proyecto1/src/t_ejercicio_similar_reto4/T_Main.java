package t_ejercicio_similar_reto4;

public class T_Main {
    public static void main(String[] args) {

        T_CodigoEstudiantes codEst = new T_CodigoEstudiantes();
        codEst.agregarCodigo("1611");
        codEst.agregarCodigo("1111");
        codEst.agregarCodigo("1111");
        codEst.agregarCodigo("1211");
        codEst.agregarCodigo("1211");
        codEst.agregarCodigo("1311");
        codEst.agregarCodigo("1311");

        codEst.mostrarCodigos();
    }
}
