import java.util.Locale;

public class Usuario {
    // Atributos
    String nombre, email, areaEmpresa;
    int edad;
    long cedula;
    double nomina;
    boolean jefeArea;

    // Constructor

    Usuario(String nombre, long cedula, String email, int edad, String areaEmpresa, boolean jefeArea){
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.edad = edad;
        this.areaEmpresa = areaEmpresa;
        this.jefeArea = jefeArea;
        this.nomina = this.nomina();
    }

    // Metodos / funciones

    private double nomina() {
        double nomina, totalDevengado, descuentos;

        // Logica
        switch (this.areaEmpresa.toLowerCase()){
            case "desarrollo":
                totalDevengado = 4500000;
                if (this.jefeArea == true){
                    totalDevengado += 2500000;
                }
                break;
            case "administrativa":
                totalDevengado = 3500000;
                if (this.jefeArea == true){
                    totalDevengado += 3000000;
                }
                break;
            default:
                totalDevengado = 0;
                break;
        }

        // Si el total es superior a 4 SMLV
        if (totalDevengado >= (4*908526)){
            descuentos = 0.09;
        } else {
            descuentos = 0.08;
        }

        nomina = totalDevengado*(1-descuentos);

        return nomina;
    }

    public void info(){
        System.out.println("[Usuario]:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Identificacion: " + this.cedula);
        System.out.println("Email: " + this.email);
        System.out.println("Edad: " + this.edad);
        System.out.println("Area: " + this.areaEmpresa);
        System.out.println("Salario: " + this.nomina);
    }
}
