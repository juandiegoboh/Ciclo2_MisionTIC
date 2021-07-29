public class Animal {
    protected double peso, altura;
    protected Alimento alimsIngeridos[];

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Alimento[] getAlimsIngeridos() {
        return this.alimsIngeridos;
    }

    public void setAlimsIngeridos(Alimento[] alimsIngeridos) {
        this.alimsIngeridos = alimsIngeridos;
    }

    public double getIMC(){
        double imc;

        imc = this.peso / Math.pow((this.altura),2);

        return imc;
    }
}
