package archivo_csv_01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivoCsv2 {

    public static void main(String[] args) {
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
            f = new File("data/salida2.csv");
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);

            String encabezado = "IDTRABAJADOR" + ";" + "NOMBRE" + ";" + "APELLIDO" + ";" + "ANTIGUEDAD" + ";" + "HORASTRABAJADA" + ";" + "TIPOTRABAJADOR";

            bw.write(encabezado + "\n"); // Grabar en el archivo

            String datos1 = "1" + ";" + "Juan" + ";" + "Ruiz" + ";" + "25" + ";" + "150" + ";" + "Conserje";           // Datos a escribir
            String datos2 = "2" + ";" + "Miguel" + ";" + "Parraga" + ";" + "22" + ";" + "160" + ";" + "Funcionario";   // Datos a escribir

            bw.write(datos1 + "\n"); // Grabar en el archivo
            bw.write(datos2 + "\n"); // Grabar en el archivo

            bw.flush();
            System.out.println("GRABACION CORRECTA");
        } catch (IOException e) {
            System.out.println("ERROR ESCRITURA");
        }
    }

}
