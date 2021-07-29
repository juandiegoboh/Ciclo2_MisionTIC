package u_agregacion_vs_composicion;

public class U_Celular {
    // Atributos
    private String imei;
    private String modelo;
    private U_Bateria bateria;
    private int cantSim;
    private U_SimCard simcard[];

    // Constructor
    U_Celular(){}

    U_Celular(String imei, String modelo, String refBat, double ampBat){
        this.imei = imei;
        this.modelo = modelo;
        this.bateria = new U_Bateria(refBat, ampBat);   // Objeto de la clase bateria que recibe los atributos.
        // Composicion. Si se crea un celular se crea directamente una batería (composicion)
        this.cantSim = 0;
        this.simcard = new U_SimCard[4];    // Agregación => defino la cantidad de datos máxima que va a tener ese
        // arreglo

    }

    // Métodos
    public void agregarSimCard(U_SimCard simcard){
        if (this.cantSim < this.simcard.length){    // Menor de 4
            this.simcard[this.cantSim] = simcard;
            this.cantSim++;
        } else {
            System.out.println("No es posible agregar más simcard");
        }
    }

    public void mostrarInformacion(){
        System.out.println("Imei: " + this.imei);
        System.out.println("Modelo: " + this.modelo);
        this.bateria.informacionBateria();
        System.out.println("Cantidad Simcard: " + this.cantSim);
        for (int i = 0; i < this.cantSim; i++) {
            this.simcard[i].informacionSimCard();
        }
    }


}
