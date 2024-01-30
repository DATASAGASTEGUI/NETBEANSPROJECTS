package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal02 {

    public static void main(String[] args) {
        // CREAR UNA LISTA PARA ALMACENAR VECTORES DE CADENA
        List<int[][]> listamatrices_al = new ArrayList<>();

        // CREAR ALGUNOS VECTORES DE CADENA Y AGREGARLOS A LA LISTA
        int[][] matriz1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matriz2 = {{1, 3}, {5, 7}, {9, 0}};
        int[][] matriz3 = {{2, 4}, {6, 8}, {9, 0}};

        listamatrices_al.add(matriz1);
        listamatrices_al.add(matriz2);
        listamatrices_al.add(matriz3);

        // MOSTRAR EL CONTENIDO DE LA LISTA
        System.out.println("FORMA 1");
        for (int[][] matriz : listamatrices_al) {
            for (int[] fila : matriz) {
                for (int elemento : fila) {
                    System.out.print(elemento + "   ");
                }
                System.out.println();
            }
            System.out.println();  // Cambio de línea después de cada matriz
        }
        System.out.println("FORMA 2");
        for (int[][] matriz : listamatrices_al) {
            for (int[] fila : matriz) {
                System.out.println(Arrays.toString(fila));
            }
            System.out.println();  // Cambio de línea después de cada matriz
        }
    }

}
