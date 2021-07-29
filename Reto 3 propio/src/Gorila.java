public class Gorila extends Animal{
    // Constructor
    public Gorila(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Gorila(){}

    public double getPesoAlims(){
        double suma = 0;
        int tam;

        tam = this.alimsIngeridos.length;

        for (int i = 0; i < tam; i++) {
            suma += this.alimsIngeridos[i].getGramos();
        }

        return suma;
    }

    @Override
    public double getIMC(){
        double imc, pesoTotal;
        // Tiene en cuenta el peso del gorila y el de los alimentos
        pesoTotal = this.peso + (this.getPesoAlims()/1000);
        imc = pesoTotal / Math.pow((this.altura),2);

        return imc;
    }
}
