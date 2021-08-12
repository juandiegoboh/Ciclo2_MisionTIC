package u_agregacion_vs_composicion;

public class U_Celular {
    // Atributos
    private String imei;
    private String modelo;
    private U_Bateria bateria;
    private int cantSim;
    private U_SimCard simcard[];
    private boolean limiteSim;

    // Constructor
    U_Celular(){}

    U_Celular(String imei, String modelo, String refBat, double ampBat, int n){
        this.imei = imei;
        this.modelo = modelo;
        this.bateria = new U_Bateria(refBat, ampBat);   // Objeto de la clase bateria que recibe los atributos.
        // Composicion. Si se crea un celular se crea directamente una batería (composicion)
        this.cantSim = 0;
        this.simcard = new U_SimCard[n];    // Agregación => defino la cantidad de datos máxima que va a tener ese
        // arreglo

    }

    // Métodos
    public void agregarSimCard(U_SimCard simcard){
        this.limiteSim = false;
        if (this.cantSim < this.simcard.length){    // Menor de el numero de simcards disponibles
            this.simcard[this.cantSim] = simcard;
            this.cantSim++;
        } else {
            System.out.println("No es posible agregar más simcard, máximo para este equipo: " + this.simcard.length);
            limiteSim = true;
        }
    }

    public void mostrarInformacion(){
        if (this.limiteSim){    // Si se ingresa un numero de simcard mayor
            System.out.println("Imei: " + this.imei);
            System.out.println("Modelo: " + this.modelo);
            this.bateria.informacionBateria();
            System.out.println("Cantidad Simcard: " + this.cantSim);
            for (int i = 0; i < this.cantSim; i++) {
                this.simcard[i].informacionSimCard();
            }
            System.out.println("Se intentó ingresar más simcard de las disponibles.");
        } else {
            System.out.println("Imei: " + this.imei);
            System.out.println("Modelo: " + this.modelo);
            this.bateria.informacionBateria();
            System.out.println("Cantidad Simcard: " + this.cantSim);
            for (int i = 0; i < this.cantSim; i++) {
                this.simcard[i].informacionSimCard();
            }
        }
    }


}
