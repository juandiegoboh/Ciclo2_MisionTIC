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
        this.cont = copia.cont;
    }

    // Métodos funciones

    public int getCont() {
        return this.cont;
    }

    public void setCont(int cont) {
        if(cont < 0){
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    public void incrementar(){
        // Código
        this.cont ++;
    }

    public void incrementar(int cont){
        this.cont += cont;
    }

    public void incrementar(String cont){
        this.cont += Integer.valueOf(cont);
    }

    public void decrementar(){
        // Código
        // Generaria un error ya que se permitirian numeros negativos, no hay una constricción
        this.cont --;
        if (this.cont < 0){
            this.cont = 0;
        }
    }

    public void decrementar(int cont){
        this.cont -= cont;
    }
}

