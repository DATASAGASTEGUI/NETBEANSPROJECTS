package sqlite_hsqldb_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatosHsqldb {

    // ATRIBUTOS
    // 1. ENTRADA
    private static String driver = "org.hsqldb.jdbc.JDBCDriver";
    private static String protocolo = "jdbc:hsqldb:file";
    private static String nombreBaseDatos;
    private static String usuario = "SA";
    private static String clave = "12345678";
    // 2. SALIDA
    private static Connection conexion;

    public BaseDatosHsqldb(boolean flag, String nombreBaseDatos) {
        setConexion(flag, nombreBaseDatos);
    }

    public static void setConexion(boolean flag, String nombreBaseDatos) {
        try {
            if (flag) {
                String url = protocolo + ":" + nombreBaseDatos;
                Class.forName(driver);
                conexion = DriverManager.getConnection(url, usuario, clave);
            } else {
                //Statement st;
                //st = conexion.createStatement();
                //st.executeUpdate("SHUTDOWN");
                //st.close();
                conexion.close();
                conexion = null;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            conexion = null;
        }
    }

    public static Connection getConexion() {
        return conexion;
    }
}
