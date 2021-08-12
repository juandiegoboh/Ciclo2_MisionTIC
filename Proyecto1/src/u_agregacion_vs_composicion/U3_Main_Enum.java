package u_agregacion_vs_composicion;

public class U3_Main_Enum {

    enum Continente{
        AFRICA(54),
        EUROPA(50),
        ASIA(49),
        AMERICA(35),
        OCEANIA(15);
        // Atributos
        private int numeroDePaises;
        // Constructor
        Continente(int numeroDePaises){
            this.numeroDePaises = numeroDePaises;
        }
        // Método - Función
        public int getNumeroDePaises() {
            return numeroDePaises;
        }
    }

    public static void main(String[] args) {
        Continente myVar = Continente.AFRICA;
        System.out.print(myVar);
        System.out.print(" tiene: " + myVar.getNumeroDePaises() + " paises.\n");

        Continente otro = Continente.EUROPA;
        System.out.println("Otro continente: " + otro + " tiene: " + otro.getNumeroDePaises() + " países.");

        System.out.print("Continente de: " + myVar + " y " + otro);
        System.out.print(" tienen: " + (myVar.getNumeroDePaises() + otro.getNumeroDePaises()) + " países.");
    }
}
