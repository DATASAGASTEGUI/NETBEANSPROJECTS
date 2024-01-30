package hsqldb_01;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalCreateTable {

    public static void main(String[] args) {
        //PARAMETROS CONEXION
        //1. ENTRADA
        String protocolo = "jdbc:hsqldb:file";
        String driver = "org.hsqldb.jdbc.JDBCDriver";
        String dataBase = "C:\\hsqldb-2.7.2\\hsqldb\\data\\TIENDA\\tienda.hsqldb";
        String user = "SA";
        String password = "12345678";
        //2. SALIDA
        String url = protocolo + ":" + dataBase;
        Connection conexion = null;

        boolean bandera = true;

        try {
            Class.forName(driver); //Cargar driver
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("OK: CONEXION");
        } catch (ClassNotFoundException | SQLException e) {
            bandera = false;
        }
        if (bandera == true) {
            PreparedStatement ps;

            String query = "CREATE TABLE Trabajador (\n"
                    + "   id_trabajador     VARCHAR(6)  NOT NULL PRIMARY KEY,\n"
                    + "   nombre            VARCHAR(20) NOT NULL,\n"
                    + "   apaterno          VARCHAR(30) NOT NULL,\n"
                    + "   tipo_trabajador   INT         NOT NULL,\n"
                    + "   parametros_sueldo VARCHAR(15) NOT NULL\n"
                    + ") ";

            try {
                ps = conexion.prepareStatement(query);//CREATE TABLE
                ps.execute();
                System.out.println("OK: CREATE TABLE");

                Statement st = conexion.createStatement();
                st.executeUpdate("SHUTDOWN");
                st.close();
                conexion.close();
                conexion = null;
            } catch (SQLException ex) {
                System.out.println("ERROR: CREATE TABLE");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }
}
