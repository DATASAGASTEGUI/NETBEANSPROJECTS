package cadena;

import java.util.Arrays;

public class Principal_split {

    public static void main(String[] args) {
        {
            System.out.println("EJEMPLO SPLIT 01");
            System.out.println("================");
            String cadena = "A1;Luis;32;1.72;true";
            String[] vectorCadena = cadena.split(";");
            System.out.println("Cadena       : " + cadena);
            System.out.println("Vector Cadena: " + Arrays.toString(vectorCadena));
        }

        {
            System.out.println("EJEMPLO SPLIT 02");
            System.out.println("================");
            String cadena = "datasagamadrid@gmail.com";
            String[] vectorCadena1 = cadena.split("@");
            System.out.println("Cadena         : " + cadena);
            System.out.println("Vector Cadena 1: " + Arrays.toString(vectorCadena1));
            String[] vectorCadena2 = vectorCadena1[1].split("\\.");
            System.out.println("Cadena         : " + vectorCadena1[1]);
            System.out.println("Vector Cadena 2: " + Arrays.toString(vectorCadena2));
        }

        {
            System.out.println("EJEMPLO SPLIT 03");
            System.out.println("================");
            String cadena = "Walter12341Ismael12Sagastegui904Lescano";
            String[] vectorCadena = cadena.split("[0-9]+");
            System.out.println("Cadena       : " + cadena);
            System.out.println("Vector Cadena: " + Arrays.toString(vectorCadena));
        }

        {
            System.out.println("EJEMPLO SPLIT 04");
            System.out.println("================");
            String cadena = "Walter     Ismael Sagastegui   Lesano";
            String[] vectorCadena = cadena.split("\\s+");
            System.out.println("Cadena       : " + cadena);
            System.out.println("Vector Cadena: " + Arrays.toString(vectorCadena));
        }
    } // CERRAR MAIN
} // CERRAR CLASE
