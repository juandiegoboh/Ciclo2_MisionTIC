package v_gui_swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V_GUI_Swing extends JFrame {   // Ventana Inicial

    // Atributos
    private JLabel label1, label2, label3, label4;
    private JPanel panel1, panel2;
    private JTextField campoTexto1, campoTexto2;
    private JButton button1;

    // Constructor
    public V_GUI_Swing(){
/*      JLabel label1 = new JLabel("Digite los datos del usuario:");
        label1.setBounds(5,50,200,15);
        add(label1);
        JLabel label2 = new JLabel("Versión 0.0.1");
        label2.setBounds(5,150,150,15);
        add(label2);*/

        this.panel1 = new JPanel();
        this.panel1.setBounds(10,10,300,200);

        this.label1 = new JLabel("Digite los datos del usuario:");
        this.label1.setBounds(5,50,200,15);
        panel1.add(label1);
        this.label2 = new JLabel("Versión 0.0.1");
        this.label2.setBounds(5,150,150,15);
        panel1.add(label2);
        add(panel1);

        this.panel2 = new JPanel();
        this.panel2.setBounds(400,10,300,200);

        this.label3 = new JLabel("Hola Tripulantes");
        this.label3.setBounds(5,200,150,15);

        panel2.add(label3);
        add(panel2);

        label4 = new JLabel("Caja de Texto");
        label4.setBounds(30,300,200,20);
        add(label4);
        campoTexto1 = new JTextField();
        campoTexto1.setBounds(50,380,300,20);
        add(campoTexto1);

        campoTexto2 = new JTextField();
        campoTexto2.setBounds(50,440,300,20);
        add(campoTexto2);

        button1 = new JButton("Click aquí");
        button1.setBounds(50,500,100,30);
        panel2.add(button1);
        button1.addActionListener(this::actionPerformed);

/*        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Mensaje Oculto");
                String x = campoTexto1.getText();
                campoTexto1.setText("Magia Tripulantes");
                campoTexto2.setText("Cambio a: " + x);
            }
        });*/
    }

    // Métodos - Funciones
    public void actionPerformed(ActionEvent e){
        System.out.println("Mensaje Oculto");
        String x = campoTexto1.getText();
        campoTexto1.setText("Magia Tripulantes");
        campoTexto2.setText("Cambio a: " + x);
        setTitle("Mision TIC 2022");
    }

    // Métodos - Funciones
    public static void main(String[] args) {
        V_GUI_Swing formulario1 = new V_GUI_Swing();
        formulario1.setBounds(5,10,800,600);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
