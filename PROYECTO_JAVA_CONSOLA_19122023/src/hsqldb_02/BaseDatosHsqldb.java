package hsqldb_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatosHsqldb {

    //ATRIBUTOS 
    //1. ENTRADA
    private String protocolo = "jdbc:hsqldb:file";
    private String driver = "org.hsqldb.jdbc.JDBCDriver";
    private String dataBase;
    private String user = "SA";
    private String password = "12345678";
    //2. SALIDA
    private Connection conexion;

    public BaseDatosHsqldb() {
    }

    public BaseDatosHsqldb(String dataBase) {
        this.dataBase = dataBase;
    }

    public Connection getConexion() {
        String url = protocolo + ":" + dataBase;
        try {
            Class.forName(driver);
            this.conexion = DriverManager.getConnection(url, this.user, this.password);
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
        return this.conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

}
