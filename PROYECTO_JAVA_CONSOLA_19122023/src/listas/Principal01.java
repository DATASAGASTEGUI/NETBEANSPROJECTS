package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal01 {

    public static void main(String[] args) {
        // CREAR UNA LISTA PARA ALMACENAR VECTORES DE CADENA
        List<String[]> listavectores_al = new ArrayList<>();

        // CREAR ALGUNOS VECTORES DE CADENA Y AGREGARLOS A LA LISTA
        String[] vector1 = {"A", "B", "C", "D"};
        String[] vector2 = {"X", "Y", "Z"};
        String[] vector3 = {"1", "2", "3", "4", "5", "6"};

        listavectores_al.add(vector1);
        listavectores_al.add(vector2);
        listavectores_al.add(vector3);

        // MOSTRAR EL CONTENIDO DE LA LISTA
        System.out.println("FORMA 1");
        for (String[] vector : listavectores_al) {
            for (String elemento : vector) {
                System.out.print(elemento + " ");
            }
            System.out.println();  // Cambio de línea después de cada vector
        }
        System.out.println("FORMA 2");
        for (String[] vector : listavectores_al) {
            System.out.println(Arrays.asList(vector));
        }
        System.out.println("FORMA 3");
        for (String[] vector : listavectores_al) {
            System.out.println(Arrays.toString(vector));
        }
        System.out.println("FORMA 4");
    }
}
