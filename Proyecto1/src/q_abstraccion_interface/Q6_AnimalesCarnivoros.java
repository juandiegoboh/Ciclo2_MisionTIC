package q_abstraccion_interface;

public class Q6_AnimalesCarnivoros extends Q4_Animales {
    // Atributos

    // Constructor

    // Métodos - Funciones
    @Override
    public void seAlimenta(){
        System.out.println("Los animales carnívoros se alimentan de carne");
    }

    @Override
    public void otraFuncionAbstracta(){
        System.out.println("Contenido de otraFuncionAbstracta en la clase animales carnívoros");
    }
}
