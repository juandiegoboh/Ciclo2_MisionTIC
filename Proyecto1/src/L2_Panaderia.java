import java.util.Locale;

public class L2_Panaderia {

    // Atributos
    String nombrePanadero,tipoPan, fecha, hora;
    int idPanadero;
    boolean idTamanioPan;
    double precio;

    // Constructor
    L2_Panaderia(String nombrePanadero, int idPanadero, String tipoPan, String fecha, String hora, boolean idTamanioPan){
        this.nombrePanadero = nombrePanadero;
        this.idPanadero = idPanadero;
        this.tipoPan = tipoPan;
        this.fecha = fecha;
        this.hora = hora;
        this.idTamanioPan = idTamanioPan;
        this.precio = this.precio();
    }

    // Métodos / Funciones

    double precio(){
        double precio, precioBase;

        switch (this.tipoPan.toLowerCase()){
            case "dulce":
                precioBase = 300.0;
                if (this.idTamanioPan){
                    precioBase += 150.0;
                }
                break;
            case "integral":
                precioBase = 250.0;
                if (this.idTamanioPan){
                    precioBase += 100.0;
                }
                break;
            default:
                precioBase = 0.0;
                break;
        }
        precio = (precioBase * 1.19);

        if (precioBase >= 320){
            precio += precioBase * 0.01;
        }

        return precio;
    }

    // Salidas
    public void info(){
        System.out.println("[Panadería]");
        System.out.println("Nombre Panadero: " + this.nombrePanadero);
        System.out.println("Id Panadero: " + this.idPanadero);
        System.out.println("Tipo de pan: " + this.tipoPan);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hora: " + this.hora);
        System.out.println("Precio: " + this.precio);
    }
}

