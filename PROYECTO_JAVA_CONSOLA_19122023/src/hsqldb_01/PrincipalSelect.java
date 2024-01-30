package hsqldb_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrincipalSelect {

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
            PreparedStatement ps = null;

            String query = "SELECT * FROM Trabajador";

            try {
                ps = conexion.prepareStatement(query); // SELECT 
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String idTrabajador = rs.getString(1);
                    String nombre = rs.getString(2);
                    String apaterno = rs.getString(3);
                    int tipoTrabajador = rs.getInt(4);
                    String parametrosSueldo = rs.getString(5);
                    System.out.println(idTrabajador + ";" + nombre + ";" + apaterno + ";" + tipoTrabajador + ";" + parametrosSueldo);
                }
                System.out.println("OK: SELECT");

                Statement st = conexion.createStatement();
                st.executeUpdate("SHUTDOWN");
                st.close();
                conexion.close();
                conexion = null;
            } catch (SQLException ex) {
                System.out.println("ERROR: SELECT");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

}
