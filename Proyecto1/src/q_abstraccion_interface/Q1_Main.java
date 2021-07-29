package q_abstraccion_interface;

public class Q1_Main {
    public static void main(String[] args) {
        // Declaración de objetos => No se pueden crear objetos de las clases abstractas

        // Q2_SeresVivos serVivo = new Q2_SeresVivos() {};
        // Q4_Animales animal = new Q4_Animales() {};
        Q3_Plantas arbol = new Q3_Plantas();
        arbol.seAlimenta();
        System.out.println("--------------------------------------");

        Q5_AnimalesHerbivoros vaca = new Q5_AnimalesHerbivoros();
        vaca.seAlimenta();
        vaca.otraFuncionAbstracta();
        vaca.otraFuncionNormal();
        System.out.println("--------------------------------------");

        Q6_AnimalesCarnivoros leon = new Q6_AnimalesCarnivoros();
        leon.seAlimenta();
        leon.otraFuncionAbstracta();
        leon.otraFuncionNormal();
        System.out.println("--------------------------------------");

        Q7_AnimalesOmnivoros condor = new Q7_AnimalesOmnivoros();
        condor.seAlimenta();
        condor.otraFuncionAbstracta();
        condor.otraFuncionNormal();
        System.out.println("--------------------------------------");
    }
}
