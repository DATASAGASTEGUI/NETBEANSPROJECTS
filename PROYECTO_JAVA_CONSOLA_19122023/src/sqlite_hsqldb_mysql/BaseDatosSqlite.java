package sqlite_hsqldb_mysql;

import java.sql.*;

public class BaseDatosSqlite {

    // ATRIBUTOS
    // 1. ENTRADA
    private static String driver = "org.sqlite.JDBC";
    private static String protocolo = "jdbc:sqlite";
    private static String nombreBaseDatos;
    private static String usuario = "";
    private static String clave = "";
    // 2. SALIDA
    private static Connection conexion;

    public BaseDatosSqlite(boolean flag, String nombreBaseDatos) {
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
