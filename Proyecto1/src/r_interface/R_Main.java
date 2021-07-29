package r_interface;

public class R_Main {
    public static void main(String[] args) {

        R2_Ingles obj1 = new R2_Ingles();
        obj1.decirHola();
        obj1.buenosDias();
        System.out.println("----------------------------");

        R3_Frances obj2 = new R3_Frances();
        obj2.decirHola();
        obj2.buenosDias();
        obj2.otraFuncion();
        System.out.println("----------------------------");

        R1_Lenguaje obj3 = new R3_Frances();
        obj3.decirHola();
        obj3.buenosDias();
        System.out.println("----------------------------");
    }
}
