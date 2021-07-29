public class Main {
    public static void main(String[] args) {
        Alimento banana = new Alimento(120);
        Alimento raices = new Alimento(60);
        Alimento platano = new Alimento(78.5);
        Gorila gorila = new Gorila(150.5, 1.67);

        Alimento alimentos[] = new Alimento[3];
        alimentos[0] = banana;
        alimentos[1] = raices;
        alimentos[2] = platano;
        gorila.setAlimsIngeridos(alimentos);

        System.out.println(gorila.getPeso());
        System.out.println(gorila.getPesoAlims());
        System.out.println(Math.round(gorila.getIMC()));

    }
}
