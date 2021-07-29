public class Gorila extends Animal {
    // Atributos

    // Constructor
    public Gorila(double peso, double altura){
        // this.peso = peso;
        super(peso);
        this.altura = altura;
    }

    public double getPesoAlims(){
        // Codigo...
        double suma = 0;
        int tam;

        tam = this.alimsIngeridos.length;

        for (int i = 0; i < tam; i++) {
            suma += this.alimsIngeridos[i].getGramos();
        }

        return suma;
    }

    @Override
    public double getIMC(){     // (pesoAnimal + pesoAlimentos)/altura ^2
        // Código...
        double imc, pesoTotal;
        pesoTotal = this.getPeso() + (this.getPesoAlims()/1000);     // Se pasan los gramos a kg

        imc = pesoTotal/ Math.pow(this.altura,2);
        return imc;
    }
}
