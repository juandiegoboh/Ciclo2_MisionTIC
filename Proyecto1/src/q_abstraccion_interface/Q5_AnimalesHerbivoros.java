package q_abstraccion_interface;

public class Q5_AnimalesHerbivoros extends Q4_Animales {
    // Atributos

    // Constructor

    // Métodos - Funciones
    @Override
    public void seAlimenta(){
        System.out.println("Los animales herbívoros se alimentan de plantas");
    }

    @Override
    public void otraFuncionAbstracta(){
        System.out.println("Contenido de otraFuncionAbstracta en la clase animales herbivoros");
    }
}
