package Modelo;

import Controlador.ConexionBD;

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
    public Producto(){}

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

    // CRUD => Create, Read, Update and Delete
    // Son las funciones básicas que debe tener una aplicación persistente

    // CREATE
    public boolean guardarProducto(){
        ConexionBD conexionBD = new ConexionBD();
        // INSERT INTO productos(nombre, cantidad, categoria, precio) VALUES('Lomo', 3, 'CARNES', 16000);
        String sql =
                "INSERT INTO productos(nombre, cantidad, categoria, precio)" +
                        " VALUES('" + nombre + "'," + cantidad + ", '" + categoria + "', " + precio + ");";
        if (conexionBD.setAutoCommitBD(false)) {
            if (conexionBD.insertarBD(sql)) {
                conexionBD.commitDB();
                conexionBD.cerrarConexion();
                return true;
            } else {
                conexionBD.rollbackDB();
                conexionBD.cerrarConexion();
                return false;
            }
        } else {
                conexionBD.cerrarConexion();
                return false;
        }
    }

    // READ
    public List<Producto> listarProductos(){
        List<Producto> listaProductos = new ArrayList<>();
        ConexionBD conexionBD = new ConexionBD();

        // SELECT * FROM productos;
        String sql = "SELECT * FROM productos;";
        try {
            ResultSet rs = conexionBD.consultarBD(sql);
            Producto p;
            while (rs.next()){
                p = new Producto();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setCategoria(rs.getString("categoria"));
                p.setPrecio(rs.getDouble("precio"));
                listaProductos.add(p);
            }
        } catch (SQLException e){
            System.out.println("Error en la lista de productos: " + e.getMessage());
        } finally {
            conexionBD.cerrarConexion();
        }
        return listaProductos;
    }

    // UPDATE
    public boolean actualizarProducto(){
        ConexionBD conexionBD = new ConexionBD();

        // UPDATE productos SET nombre = 'Gel', cantidad = 100, categoria = 'ASEO', precio = 4000 WHERE id = 5;
        String sql = "UPDATE productos " +
                "SET nombre = '" + nombre + "', " +
                "cantidad = " + cantidad + ", " +
                "categoria = '" + categoria + "', " +
                "precio = " + precio +
                " WHERE id = " + id + ";";
        if (conexionBD.setAutoCommitBD(false)){
            if (conexionBD.actualizarBD(sql)){
                conexionBD.commitDB();
                conexionBD.cerrarConexion();
                return true;
            } else {
                conexionBD.rollbackDB();
                conexionBD.cerrarConexion();
                return false;
            }
        } else {
            conexionBD.cerrarConexion();
            return false;
        }
    }

    // DELETE
    public boolean eliminarProducto(){
        ConexionBD conexionBD = new ConexionBD();

        // DELETE FROM productos WHERE id = 1;
        String sql = "DELETE FROM productos WHERE id =" + id + ";";

        if (conexionBD.setAutoCommitBD(false)){
            if(conexionBD.borrarBD(sql)){
                conexionBD.commitDB();
                conexionBD.cerrarConexion();
                return true;
            } else {
                conexionBD.rollbackDB();
                conexionBD.cerrarConexion();
                return false;
            }
        } else {
            conexionBD.cerrarConexion();
            return false;
        }
    }
}
