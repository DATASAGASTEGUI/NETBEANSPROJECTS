package archivo_csv_01;

import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivoCsv1 {

    public static void main(String[] args) {
        System.out.println("FORMA 1");
        System.out.println("=======");
        {
            String csvFilePath = "data/Salida1_1.csv"; // Ruta del archivo CSV
            try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath, true), ';', CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) { // Donde true es a?adir y false crear denuevo
                String[] encabezados = {"IDTRABAJADOR", "NOMBRE", "APELLIDO", "ANTIGUEDAD", "HORASTRABAJADA", "TIPOTRABAJADOR"}; // Encabezados (opcional)

                writer.writeNext(encabezados);

                String[] datos1 = {"1", "Juan", "Ruiz", "25", "150", "Conserje"};           // Datos a escribir
                String[] datos2 = {"2", "Miguel", "Parraga", "22", "160", "Funcionario"};   // Datos a escribir

                writer.writeNext(datos1);            // Escribir datos al archivo CSV
                writer.writeNext(datos2);            // Escribir datos al archivo CSV

                System.out.println("GRABACION CORRECTA");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR ESCRITURA");
            }
        }

        System.out.println("FORMA 2");
        System.out.println("=======");
        {
            String csvFilePath = "data/Salida1_2.csv"; // Ruta del archivo CSV
            try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath, true), CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) { // Donde true es a?adir y false crear denuevo
                String[] encabezados = {"IDTRABAJADOR", "NOMBRE", "APELLIDO", "ANTIGUEDAD", "HORASTRABAJADA", "TIPOTRABAJADOR"}; // Encabezados (opcional)

                writer.writeNext(encabezados);

                String[] datos1 = {"1", "Juan", "Ruiz", "25", "150", "Conserje"};           // Datos a escribir
                String[] datos2 = {"2", "Miguel", "Parraga", "22", "160", "Funcionario"};   // Datos a escribir

                writer.writeNext(datos1);            // Escribir datos al archivo CSV
                writer.writeNext(datos2);            // Escribir datos al archivo CSV

                System.out.println("GRABACION CORRECTA");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("ERROR ESCRITURA");
            }
        }
    }

}
