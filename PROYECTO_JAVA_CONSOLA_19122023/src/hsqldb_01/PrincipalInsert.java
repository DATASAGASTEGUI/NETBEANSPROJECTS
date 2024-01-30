package hsqldb_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalInsert {

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

            String query = "INSERT INTO Trabajador (id_trabajador,nombre,apaterno,tipo_trabajador,parametros_sueldo) VALUES (?,?,?,?,?)";

            try {
                ps = conexion.prepareStatement(query);//INSERT
                ps.setString(1, "T05");
                ps.setString(2, "Artguro");
                ps.setString(3, "Ruiz");
                ps.setInt(4, 1);
                ps.setString(5, "343");
                ps.executeUpdate();
                System.out.println("OK: INSERT");

                Statement st = conexion.createStatement();
                st.executeUpdate("SHUTDOWN");
                st.close();
                conexion.close();
                conexion = null;
            } catch (SQLException ex) {
                System.out.println("ERROR: INSERT");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

}
