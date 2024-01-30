package archivo_csv_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoCsv2 {

    public static void main(String[] args) {
        System.out.println("FORMA 1");
        System.out.println("=======");
        {
            File f;
            FileReader fr;
            BufferedReader br;

            String fila = "";
            try {
                f = new File("data/Trabajador.csv");
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                while ((fila = br.readLine()) != null) {
                    System.out.println(fila);
                }
            } catch (IOException e) {
                System.out.println("ERROR DE LECTURA");
            }
        }

        System.out.println("FORMA 2");
        System.out.println("=======");
        {
            File f;
            FileReader fr;
            BufferedReader br;

            String fila = "";
            String[] parte;
            String idTrabajador = "", nombre = "", apellido = "", antiguedad = "", horasTrabajadas = "", tipoTrabajador = "";
            try {
                f = new File("data/Trabajador.csv");
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                int i = 0;
                while ((fila = br.readLine()) != null) {
                    parte = fila.split(";");
                    idTrabajador = parte[0];
                    nombre = parte[1];
                    apellido = parte[2];
                    antiguedad = parte[3];
                    horasTrabajadas = parte[4];
                    tipoTrabajador = parte[5];
                    if (i != 0) {
                        System.out.printf("%12s %-10s %-10s %12s %15s %-15s\n", idTrabajador, nombre, apellido, antiguedad, horasTrabajadas, tipoTrabajador);
                    } else {
                        i++;
                        System.out.printf("%12s %-10s %-10s %12s %15s %-15s\n", idTrabajador, nombre, apellido, antiguedad, horasTrabajadas, tipoTrabajador);
                        System.out.printf("%12s %-10s %-10s %12s %15s %-15s\n", pintarRaya(idTrabajador), pintarRaya(nombre), pintarRaya(apellido), pintarRaya(antiguedad), pintarRaya(horasTrabajadas), pintarRaya(tipoTrabajador));
                    }
                }
            } catch (IOException e) {
                System.out.println("ERROR DE LECTURA");

            }
        }

    }

    public static String pintarRaya(String columna) {
        int longitud = columna.length();
        String s = "";
        for (int i = 0; i < longitud; i++) {
            s = s + "-";
        }
        return s;
    }
}
