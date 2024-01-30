package matriz;

public class Matriz01 { // ABRIR CLASE
    public static void main(String[] args) { // ABRIR MAIN
        // DECLAR MATRIZ DE TAMAÑO 3X2 (6 ELEMENTOS
        int[][] matriz = new int[3][2];
        // LLENAR MATRIZ
        matriz[0][0] = 5;
        matriz[0][1] = 1;
        matriz[1][0] = 3;
        matriz[1][1] = 2;
        matriz[2][0] = 0;
        matriz[2][1] = 4;

        // MOSTRAR MATRIZ
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) { //COLUMNAS
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
    }// CERRAR MAIN
}// CERRAR CLASE
