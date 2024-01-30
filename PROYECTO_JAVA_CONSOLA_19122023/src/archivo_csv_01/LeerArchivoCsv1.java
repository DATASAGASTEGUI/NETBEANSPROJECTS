package archivo_csv_01;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class LeerArchivoCsv1 {

    public static void main(String[] args) {
        System.out.println("FORMA 1");
        System.out.println("=======");
        {
            String archivoCSV = "data/Trabajador.csv"; // Ruta del archivo CSV
            try (CSVReader reader = new CSVReader(new FileReader(archivoCSV))) {
                List<String[]> filas = reader.readAll();  // Lee todas las filas del archivo CSV
                for (String[] fila : filas) {  // Itera sobre las filas e imprime cada elemento
                    for (String elemento : fila) {
                        System.out.print(elemento);
                    }
                    System.out.println();  // Nueva línea después de cada fila
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR DE LECTURA");
            }
        }

        System.out.println("FORMA 2");
        System.out.println("=======");
        {
            String[] parte;
            String idTrabajador = "", nombre = "", apellido = "", antiguedad = "", horasTrabajadas = "", tipoTrabajador = "";
            String archivoCSV = "data/Trabajador.csv"; // Ruta del archivo CSV
            int i = 0;
            try (CSVReader reader = new CSVReader(new FileReader(archivoCSV))) {
                List<String[]> filas = reader.readAll();  // Lee todas las filas del archivo CSV
                for (String[] fila : filas) {  // Itera sobre las filas e imprime cada elemento
                    for (String elemento : fila) {
                        parte = elemento.split(";");
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
                }
            } catch (IOException e) {
                e.printStackTrace();
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
