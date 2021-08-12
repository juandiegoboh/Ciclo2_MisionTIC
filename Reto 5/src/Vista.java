import Modelo.Producto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Vista extends JFrame{
    // Atributos
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField idReg;
    private JButton guardarButtonReg;
    private JTextField nombreReg;
    private JTextField idCAE;
    private JTextField nombreCAE;
    private JComboBox categoReg;
    private JComboBox categCAE;
    private JButton consultarButtonCAE;
    private JTable table1CAE;
    private JTextField cantidadReg;
    private JTextField precioReg;
    private JTextField cantidadCAE;
    private JTextField precioCAE;
    private JButton actualizarButtonCAE;
    private JButton eliminarButtonCAE;

    // Constructor

    public Vista(){
        setContentPane(panel1);
        pack();

        guardarButtonReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Boton guardar
                String nombre = nombreReg.getText();
                int cantidad = Integer.parseInt(cantidadReg.getText());
                String categoria = categoReg.getSelectedItem().toString();
                double precio = Double.parseDouble(precioReg.getText());

                Producto p = new Producto(nombre, cantidad, categoria, precio);

                if(p.guardarProducto()){
                    System.out.println("Producto guardado con éxito.");
                } else {
                    System.out.println("Error guardando producto.");
                }
            }
        });

        consultarButtonCAE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Boton consultar
                Object[][] filaDatos = new Object[1][5];    // Se crea un objeto bidimensional para las filas de la
                // tabla
                Object[] nombreColumnas = {"Id", "Nombre", "Cantidad", "Categoría", "Precio"}; // Objeto 
                // unidimensional para los titulos de las columnas
                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(nombreColumnas);
                table1CAE.setModel(model);
                
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
                // Botón Actualizar
                int id = Integer.parseInt(idCAE.getText());
                String nombre = nombreCAE.getText();
                int cantidad = Integer.parseInt(cantidadCAE.getText());
                String categoria = categCAE.getSelectedItem().toString();
                double precio = Double.parseDouble(precioCAE.getText());

                Producto p = new Producto();
                p.setId(id);
                p.setNombre(nombre);
                p.setCantidad(cantidad);
                p.setCategoria(categoria);
                p.setPrecio(precio);

                if (p.actualizarProducto()){
                    System.out.println("Producto actualizado.");
                } else {
                    System.out.println("Error al actualizar el producto.");
                }
            }
        });

        eliminarButtonCAE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Botón eliminar
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
