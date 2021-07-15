package o_contador;

public class Contador {
    // Parametros

    private int cont;

    public Contador(){}

    public Contador(int cont){
        // Código del método
        if (cont < 0){
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    public Contador(final Contador copia){
        // Código del método
    }

    // Métodos funciones

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void incremetar(){
        // Código
    }

    public void decrementar(){
        // Código
    }
}

