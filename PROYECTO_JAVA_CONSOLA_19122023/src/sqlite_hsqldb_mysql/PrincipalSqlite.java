package sqlite_hsqldb_mysql;

import java.io.File;
import java.sql.*;

public class PrincipalSqlite {

    public static void main(String[] args) {
        String nombreBaseDatos = "data/sqlite_hsqldb_mysql/empresa.sqlite"; //Ruta Relativa
        File file = new File(nombreBaseDatos);
        String nra = file.getAbsolutePath();//Ruta Absoluta 

        int numeroQuery = 3;

        if (numeroQuery == 1) {
            System.out.println("CREATE TABLE");
            System.out.println("------------");
            BaseDatosSqlite.setConexion(true, nra);
            Connection conexion = BaseDatosSqlite.getConexion();
            if (conexion != null) {
                System.out.println("OK CONEXION");
                createTable(conexion);
                BaseDatosSqlite.setConexion(false, nra);
            } else {
                System.out.println("ERROR: CONEXION");
            }
        }

        if (numeroQuery == 2) {
            System.out.println("INSERT");
            System.out.println("------");
            Object[][] matriz = {
                {"T01", "Miguel", "Ruiz", 1, "343"},
                {"T02", "Morgan", "Beobide", 4, "121#15"},
                {"T03", "Harper", "Etxeita", 2, "404#2632"},
                {"T04", "Jerónimo", "Anghel", 2, "435#2651"},
                {"T05", "Chris", "Elizalde", 3, "238659"},
                {"T06", "Isabelle", "Gamarra", 4, "128#10"}
            };
            BaseDatosSqlite.setConexion(true, nra);
            Connection conexion = BaseDatosSqlite.getConexion();
            if (conexion != null) {
                System.out.println("OK CONEXION");
                insert(conexion, matriz);
                BaseDatosSqlite.setConexion(false, nra);
            } else {
                System.out.println("ERROR: CONEXION");
            }
        }

        if (numeroQuery == 3) {
            System.out.println("SELECT");
            System.out.println("------");
            BaseDatosSqlite.setConexion(true, nra);
            Connection conexion = BaseDatosSqlite.getConexion();
            if (conexion != null) {
                System.out.println("OK CONEXION");
                select(conexion);
                BaseDatosSqlite.setConexion(false, nra);
            } else {
                System.out.println("ERROR: CONEXION");
            }
        }

    }

    public static void createTable(Connection conexion) {
        String querey = "CREATE TABLE Trabajador (\n"
                + "id_trabajador     VARCHAR(6)  NOT NULL PRIMARY KEY,\n"
                + "nombre            VARCHAR(20) NOT NULL,\n"
                + "apaterno          VARCHAR(30) NOT NULL,\n"
                + "tipo_trabajador   INT         NOT NULL,\n"
                + "parametros_sueldo VARCHAR(15) NOT NULL \n"
                + ")";
        try {
            PreparedStatement ps = conexion.prepareStatement(querey);
            ps.execute();
            System.out.println("OK: CREATE TABLE");
        } catch (SQLException ex) {
            System.out.println("ERROR: CREATE TABLE");
        }
    }

    public static void insert(Connection conexion, Object[][] matriz) {
        try {
            for (int i = 0; i < matriz.length; i++) {
                String idTrabajador = (String) matriz[i][0];
                String nombre = (String) matriz[i][1];
                String apaterno = (String) matriz[i][2];
                int tipoTrabajador = (int) matriz[i][3];
                String parametrosSueldo = (String) matriz[i][4];

                String query = "INSERT INTO Trabajador (id_trabajador,nombre,apaterno,tipo_trabajador,parametros_sueldo) VALUES (?,?,?,?,?)";
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setString(1, idTrabajador);
                ps.setString(2, nombre);
                ps.setString(3, apaterno);
                ps.setInt(4, tipoTrabajador);
                ps.setString(5, parametrosSueldo);
                ps.executeUpdate();
                System.out.println("OK: INSERT");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: INSERT");
        }
    }

    public static void select(Connection conexion) {
        String query = "SELECT * FROM Trabajador";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            cabecera();
            while (rs.next()) {
                String idTrabajador = rs.getString(1);//rs.getInt("id_trabajador");
                String nombre = rs.getString(2);
                String apaterno = rs.getString(3);
                int tipoTrabajador = rs.getInt(4);
                String patronesSueldo = rs.getString(5);
                cuerpo(idTrabajador, nombre, apaterno, tipoTrabajador, patronesSueldo);
            }
            System.out.println("OK: SELECT");
        } catch (SQLException e) {
            System.out.println("ERROR: SELECT");
        }
    }

    public static void cabecera() {
        System.out.printf("%-10s %-10s %-10s %6s %20s\n", "IDALUMNO", "NOMBRE", "APATERNO", "TIPO", "PARAMETROS SUELDO");
        System.out.printf("%-10s %-10s %-10s %6s %20s\n", "--------", "------", "--------", "----", "-----------------");
    }

    public static void cuerpo(String idTrabajador, String nombre, String apaterno, int tipoTrabajador, String parametrosSueldo) {
        System.out.printf("%-10s %-10s %-10s %6d %20s\n", idTrabajador, nombre, apaterno, tipoTrabajador, parametrosSueldo);
    }

}
