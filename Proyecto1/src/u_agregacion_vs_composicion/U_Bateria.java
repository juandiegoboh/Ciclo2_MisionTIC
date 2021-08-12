package u_agregacion_vs_composicion;

public class U_Bateria {
    // Atributos
    private String refBat;
    private double ampBat;

    // Constructor
    public U_Bateria(){}

    public U_Bateria(String refBat, double ampBat) {
        this.refBat = refBat;
        this.ampBat = ampBat;
    }

    // Métodos
    public void informacionBateria(){
        System.out.println("Referencia Batería: " + this.refBat);
        System.out.println("Amperaje Batería: " + this.ampBat + " mAmp");
    }
}
