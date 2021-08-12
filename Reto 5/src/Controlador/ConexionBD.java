package Controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {
    // Atributos de la clase inicializados
    private String url = "";
    public Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    // Constructor (empieza directamente conectandose a la base de datos)
    public ConexionBD(){
        url = "jdbc:sqlite:reto5db.db";
        try {
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
        if (con != null){
            try{
                con.close();
            } catch (SQLException ex){
                Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("No se puedo cerrar la sesión");
            }
        }
    }

    // Consultar la base de datos => SELECT
    public ResultSet consultarBD(String sentencia){
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sentencia);
        } catch (SQLException sqlex){
            System.out.println(sqlex.getMessage());
        } catch (RuntimeException rex){
            System.out.println(rex.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return rs;
    }

    // Insertar valores a la base de datos
    public boolean insertarBD(String sentencia){
        try {
            stmt = con.createStatement();
            stmt.execute(sentencia);
        } catch (SQLException | RuntimeException sqlex){
            System.out.println("Error rutina: " + sqlex.getMessage());
            return false;
        } return true;
    }

    // Borrar valores a BD
    public boolean borrarBD(String sentencia){
        try {
            stmt = con.createStatement();
            stmt.execute(sentencia);
        } catch (SQLException | RuntimeException sqlex){
            System.out.println("Error rutina: " + sqlex.getMessage());
            return false;
        } return true;
    }

    // Modificar valores en la BD => UPDATE
    public boolean actualizarBD(String sentencia){
        try {
            stmt = con.createStatement();
            stmt.execute(sentencia);
        } catch (SQLException | RuntimeException sqlex){
            System.out.println("Error rutina: " + sqlex.getMessage());
            return false;
        } return true;
    }

    // Guardado automático
    public boolean setAutoCommitBD(boolean b){
        try {
            con.setAutoCommit(b);
        } catch (SQLException sqlex){
            System.out.println("Error al configurar el autocomit: " + sqlex.getMessage());
            return false;
        } return true;
    }

    // Cerrar conexión teniendo en cuenta el atributo con, es una función intermedia
    public void cerrarConexion(){closeConnection(con);}

    // Validar un cambio en la base de datos => commit
    public boolean commitDB(){
        try {
            con.commit();
            return true;
        } catch (SQLException ex){
            System.out.println("Error de comit " + ex.getMessage());
            return false;
        }
    }

    // Cancelar cambio en la base de datos => rollback
    public boolean rollbackDB(){
        try {
            con.rollback();
            return true;
        } catch (SQLException ex){
            System.out.println("Error de rollback " + ex.getMessage());
            return false;
        }
    }

}
