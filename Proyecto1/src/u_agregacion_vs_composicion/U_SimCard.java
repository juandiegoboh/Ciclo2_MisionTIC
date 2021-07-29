package u_agregacion_vs_composicion;

public class U_SimCard {
    // Atributos
    private int numero;
    private String empresa;

    // Constructor
    public U_SimCard(){}

    public U_SimCard(int numero, String empresa){
        this.numero = numero;
        this.empresa = empresa;
    }

    // Métodos
    public void informacionSimCard(){
        System.out.println("Número: " + this.numero);
        System.out.println("Empresa: " + this.empresa);
    }
}
