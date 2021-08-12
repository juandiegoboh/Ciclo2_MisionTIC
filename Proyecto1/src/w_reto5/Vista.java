package w_reto5;

import w_reto5.modelo.Producto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Vista extends JFrame {
    // Atributos
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField idReg;
    private JTextField nomReg;
    private JTextField cantReg;
    private JComboBox cateReg;
    private JTextField precioReg;
    private JButton guardarButtonReg;
    private JTextField idCAE;
    private JTextField nomCAE;
    private JTextField cantCAE;
    private JComboBox cateCAE;
    private JTextField precioCAE;
    private JTable TablaCAE;
    private JButton consultarButtonCAE;
    private JButton actualizarButtonCAE;
    private JButton eliminarButtonCAE;

    // Constructor
    public Vista(){
        setContentPane(panel1);
        pack();

        guardarButtonReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Botón Guardar
                // int id = Integer.parseInt(idReg.getText());      El id no se debe ingresar, por lo que está inactivo
                String nombre = nomReg.getText();
                int cantidad = Integer.parseInt(cantReg.getText());     // Convierte a entero un dato de texto
                String categoria = cateReg.getSelectedItem().toString();
                double precio = Double.parseDouble(precioReg.getText());

                Producto p = new Producto(nombre, cantidad, categoria, precio);         // Se crea un producto con la
                // información para guardar

                if (p.guardarProducto()){
                    System.out.println("Producto guardado con éxito.");
                } else {
                    System.out.println("Error guardando producto.");
                }
            }
        });

        consultarButtonCAE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Botón Consultar
                Object[][] filaDatos = new Object[1][5];
                Object[] nombreColumnas = {"Id", "Nombre", "Cantidad", "Categoria", "Precio"};
                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(nombreColumnas);
                TablaCAE.setModel(model);

                Producto p = new Producto();
                List<Producto> lista = p.listarProductos();

                for (Producto i: lista) {
                    filaDatos[0][0] = i.getId();
                    filaDatos[0][1] = i.getNombre();
                    filaDatos[0][2] = i.getCantidad();
                    filaDatos[0][3] = i.getCategoria();
                    filaDatos[0][4] = i.getPrecio();
                    model.addRow(filaDatos[0]);
                }
            }
        });
        actualizarButtonCAE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Botón actualizar
                int id = Integer.parseInt(idCAE.getText());
                String nombre = nomCAE.getText();
                int cantidad = Integer.parseInt(cantCAE.getText());
                String categoria = cateCAE.getSelectedItem().toString();
                double precio = Double.parseDouble(precioCAE.getText());

                Producto p = new Producto();
                p.setId(id);
                p.setNombre(nombre);
                p.setCantidad(cantidad);
                p.setCategoria(categoria);
                p.setPrecio(precio);

                if(p.actualizarProducto()){
                    System.out.println("Producto Actualizado.");
                } else {
                    System.out.println("Error al actualizar el producto.");
                }
            }
        });
        eliminarButtonCAE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Botón Eliminar Registro
                int id = Integer.parseInt(idCAE.getText());

                Producto p = new Producto();
                p.setId(id);

                if (p.eliminarProducto()){
                    System.out.println("Producto Eliminado.");
                } else {
                    System.out.println("Error eliminando producto.");
                }
            }
        });
    }

    // Métodos - Funciones
    public static void main(String[] args) {
        Vista obj = new Vista();        // Se debe crear un objeto de la clase
        obj.setSize(600,500);
        obj.setVisible(true);
        obj.setTitle("Reto 5 - Java");
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // Se define la operación cuando se cierre la ventana
    }

}

