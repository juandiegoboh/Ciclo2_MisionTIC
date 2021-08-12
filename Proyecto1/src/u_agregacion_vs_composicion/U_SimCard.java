package u_agregacion_vs_composicion;

public class U_SimCard {
    // Atributos
    private long numero;
    private String empresa;

    // Constructor
    public U_SimCard(){}

    public U_SimCard(long numero, String empresa){
        this.numero = numero;
        this.empresa = empresa;
    }

    // Métodos
    public void informacionSimCard(){
        System.out.println("Número: " + this.numero);
        System.out.println("Empresa: " + this.empresa);
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
