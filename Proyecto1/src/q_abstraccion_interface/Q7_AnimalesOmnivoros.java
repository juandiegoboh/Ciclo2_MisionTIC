package q_abstraccion_interface;

public class Q7_AnimalesOmnivoros extends Q4_Animales {
    // Atributos

    // Constructor

    // Métodos - Funciones
    @Override
    public void seAlimenta(){
        System.out.println("Los animales omnívoros se alimentan de plantas y animales");
    }

    @Override
    public void otraFuncionAbstracta(){
        System.out.println("Contenido de otraFuncionAbstracta en la clase animales omnívoros");
    }
}
