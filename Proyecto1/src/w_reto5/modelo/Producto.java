package w_reto5.modelo;

import w_reto5.controlador.W_ConexionBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Producto {
    // Atributos
    private String nombre, categoria;
    private int id, cantidad;
    private double precio;

    // Constructor
    public Producto() {
    }

    public Producto(String nombre, int cantidad, String categoria, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio = precio;
    }

    // Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // CRUD => Create, Read, Update, Delete

    // Create => Crear, registrar, insertar, guardar
    public boolean guardarProducto() {
        W_ConexionBD conexionBD = new W_ConexionBD();
        // INSERT INTO productos(nombre, cantidad, categoria, precio) VALUES('Lomo', 3, 'CARNES', 16000);
        String sql = "INSERT INTO productos(nombre, cantidad, categoria, precio) " +
                "VALUES('" + nombre + "'," + cantidad + ", '" + categoria + "', " + precio + ");";
        if (conexionBD.setAutoCommitBD(false)) {
            if (conexionBD.insertarBD(sql)) {
                conexionBD.commitBD();
                conexionBD.cerrarConexion();
                return true;
            } else {
                conexionBD.rollbackBD();
                conexionBD.cerrarConexion();
                return false;
            }
        } else {
            conexionBD.cerrarConexion();
            return false;
        }
    }

    // Read => leer, consultar, revisar datos
    public List<Producto> listarProductos() {
        // Esta funcion devuelve una lista (de objetos) con la informacion de la tabla
        List<Producto> listaProductos = new ArrayList<>();
        W_ConexionBD conexionBD = new W_ConexionBD();

        // SELECT * FROM productos;
        String sql = "SELECT * FROM productos;";
        try {
            ResultSet rs = conexionBD.consultarBD(sql);
            Producto p;
            while (rs.next()) {
                p = new Producto();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setCategoria(rs.getString("categoria"));
                p.setPrecio(rs.getInt("precio"));
                listaProductos.add(p);  // Aca se genera la lista de los productos
            }
        } catch (SQLException e) {
            System.out.println("Error en lista de productos: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion();
        }
        return listaProductos;
    }

    // Update => actualizar, modificar
    public boolean actualizarProducto() {
        W_ConexionBD conexionBD = new W_ConexionBD();

        // UPDATE productos SET nombre = 'Gel', cantidad = 100, categoria = 'ASEO', precio = 4000 WHERE id = 5;
        String sql =
                "UPDATE productos" +
                        " SET nombre = '" + nombre +
                        "', cantidad = " + cantidad +
                        ", categoria = '" + categoria +
                        "', precio = " + precio +
                        " WHERE id = " + id + ";";

        if (conexionBD.setAutoCommitBD(false)) {
            if (conexionBD.actualizarBD(sql)) {
                conexionBD.commitBD();
                conexionBD.cerrarConexion();
                return true;
            } else {
                conexionBD.rollbackBD();
                conexionBD.cerrarConexion();
                return false;
            }
        } else {
            conexionBD.cerrarConexion();
            return false;
        }
    }

    // Delete => eliminar, remover datos => DELETE

    public boolean eliminarProducto() {
        W_ConexionBD conexionBD = new W_ConexionBD();

        // DELETE FROM productos WHERE id = 1;
        String sql = "DELETE FROM productos WHERE id =" + id + ";";

        if (conexionBD.setAutoCommitBD(false)) {
            if (conexionBD.borrarBD(sql)){
                conexionBD.commitBD();
                conexionBD.cerrarConexion();
                return true;
            } else{
                conexionBD.rollbackBD();
                conexionBD.cerrarConexion();
                return false;
            }
        } else {
            conexionBD.cerrarConexion();
            return false;
        }
    }
}