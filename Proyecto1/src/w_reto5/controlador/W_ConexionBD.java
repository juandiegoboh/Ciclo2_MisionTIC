package w_reto5.controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class W_ConexionBD {
    // Atributos
    private String url = "";
    public Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    // Constructor sin parametros

/*  Si no se quiere usar el constructor para conectar a la base de datos se puede dejar el constructor por defecto y
crear un metodo de conexión que deba ser llamado cada vez que se quiera generar la conexión a partir de objeto creado
 de la clase.

    public X_ConexionBD (){}

    public Connection getCon(){
        url = "jdbc:sqlite:reto5.db";
        try{
            con = DriverManager.getConnection(url);
            if (con != null){
                DatabaseMetaData metaData = con.getMetaData();
                System.out.println("Conexión exitosa! Metadata:");
                System.out.println(metaData.getDriverName());
            }
        } catch (SQLException ex){
            System.out.println("Conexión errónea... e:" + ex.getMessage());
        }
        return con;
    }*/

    // Constructor (se conecta directamente a la base de datos)
    public W_ConexionBD(){
        url = "jdbc:sqlite:reto5db.db";
        try{
            con = DriverManager.getConnection(url);
            if (con != null){
                DatabaseMetaData metaData = con.getMetaData();
                System.out.println("Conexión exitosa! Metadata:");
                System.out.println(metaData.getDriverName());
            }
        } catch (SQLException ex){
            System.out.println("Conexión errónea... e:" + ex.getMessage());
        }
    }

    // Cerrar la conexión
    public void closeConnection(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(W_ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No se pudo cerrar la conexión...");
            }
        }
    }

    // Consultar la base de datos => SELECT
    public ResultSet consultarBD(String sentencia){
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sentencia);
        } catch (SQLException sqlex) {
            System.out.println(sqlex.getMessage());
        } catch (RuntimeException rex) {
            System.out.println(rex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }

    // Insertar valores a BD
    public boolean insertarBD(String sentencia){
        try{
            stmt = con.createStatement();
            stmt.execute(sentencia);
        } catch (SQLException | RuntimeException sqlex) {
            System.out.println("Error rutina: " + sqlex.getMessage());
            return false;
        }
        return true;
    }

    // Borrar valores a BD
    public boolean borrarBD(String sentencia){
        try{
            stmt = con.createStatement();
            stmt.execute(sentencia);
        } catch (SQLException | RuntimeException sqlex) {
            System.out.println("Error rutina: " + sqlex.getMessage());
            return false;
        }
        return true;
    }

    // Modificar valores en la BD => UPPDATE
    public boolean actualizarBD(String sentencia){
        try{
            stmt = con.createStatement();
            stmt.executeUpdate(sentencia);
        } catch (SQLException | RuntimeException sqlex) {
            System.out.println("Error rutina: " + sqlex.getMessage());
            return false;
        }
        return true;
    }

    // Guardado Automático
    public boolean setAutoCommitBD(boolean b){
        try{
            con.setAutoCommit(b);
        } catch (SQLException sqlex) {
            System.out.println("Error al configurar el autocommit : " + sqlex.getMessage());
            return false;
        }
        return true;
    }

    // Cerrar conexión teniendo en cuenta el atributo con
    public void cerrarConexion(){
        closeConnection(con);
    }

    // Validar cambio en la bd => commit
    public boolean commitBD(){
        try {
            con.commit();
            return true;
        } catch (SQLException e){
            System.out.println("Error de commit " + e.getMessage());
            return false;
        }
    }

    // Cancelar cambio en la base de datos => rollback
    public boolean rollbackBD(){
        try {
            con.rollback();
            return true;
        } catch (SQLException e){
            System.out.println("Error de rollback " + e.getMessage());
            return false;
        }
    }

}
