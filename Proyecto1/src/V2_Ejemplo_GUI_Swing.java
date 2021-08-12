import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V2_Ejemplo_GUI_Swing extends JFrame {
    // Atributos
    private JPanel panel;
    private JLabel titulo;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel tituloPanel1;
    private JLabel tituloPanel2;
    private JTextField textField1;
    private JTextField textField2;
    private JButton BORRARButton;
    private JTextField textField3;
    private JTextField textField4;
    private JButton pesosDolaresButton;
    private JButton dolaresPesosButton;
    private static double $1DolarPeso = 3836.95;

    // Constructor
    public V2_Ejemplo_GUI_Swing(){
        setContentPane(panel);
        pack();
        pesosDolaresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código botón 1
                double pesos = Double.parseDouble(textField1.getText());  // Se usa la clsae Wrapper Double, para convertir
                // el
                // elemento del textField y aplicar la funcion de transformación
                // double $1DolarPeso = 3836.95;
                double dolar = pesos / $1DolarPeso;
                textField3.setText(String.valueOf(dolar));

                textField2.setText("1");
                textField4.setText(String.valueOf($1DolarPeso));
            }
        });

        dolaresPesosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código botón 2
                double dolares = Double.parseDouble(textField2.getText());
                double pesos = dolares * $1DolarPeso;
                textField4.setText(String.valueOf(pesos));

                textField3.setText("1");
                textField1.setText(String.valueOf($1DolarPeso));
            }
        });

        BORRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Código botón borrar
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
            }
        });
    }

    // Métodos - Funciones
    public static void main(String[] args) {
        V2_Ejemplo_GUI_Swing conversorDivisas = new V2_Ejemplo_GUI_Swing();
        conversorDivisas.setVisible(true);
        conversorDivisas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
