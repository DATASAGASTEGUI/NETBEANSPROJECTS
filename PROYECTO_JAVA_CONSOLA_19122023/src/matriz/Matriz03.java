package matriz;

import java.util.Scanner;

public class Matriz03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // DECLAR MATRIZ DE TAMAÑO 3X2 (6 ELEMENTOS)
        int[][] matriz = new int[3][2];

        // LLENAR MATRIZ. FORMA 1
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) { //COLUMNAS
                System.out.print("Ingrese número posición [" + i + "][" + j + "]? ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // MOSTRAR MATRIZ
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) { //COLUMNAS
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }

        // LLENAR MATRIZ. FORMA 2
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) { //COLUMNAS
                matriz[i][j] = (int) (Math.random() * 6 + 1);
            }
        }

        // MOSTRAR MATRIZ
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) { //COLUMNAS
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
    } // CERRAR MAIN
}// CERRAR CLASE
