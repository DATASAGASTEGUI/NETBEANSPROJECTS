package sqlite_hsqldb_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatosMysql {
    // ATRIBUTOS
    // 1. ENTRADA

    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String protocolo = "jdbc:mysql";
    private static String ip = "localhost";
    private static int puerto = 3307;
    private static String nombreBaseDatos;
    private static String usuario = "root";
    private static String clave = "12345678";
    // 2. SALIDA
    private static Connection conexion;

    public BaseDatosMysql(boolean flag, String nombreBaseDatos) {
        setConexion(flag, nombreBaseDatos);
    }

    public static void setConexion(boolean flag, String nombreBaseDatos) {
        try {
            if (flag) {
                String url = protocolo + "://" + ip + ":" + puerto + "/" + nombreBaseDatos;
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
            System.out.println(ex);
            conexion = null;
        }
    }

    public static Connection getConexion() {
        return conexion;
    }
}
