package matriz;

public class Matriz02 { // ABRIR CLASE

    public static void main(String[] args) { // ABRIR MAIN
        // DECLAR Y LLENAR MATRIZ DE TAMAÑO 3X2 (6 ELEMENTOS)
        int[][] matriz = {{5, 1}, {3, 2}, {0, 4}};
        // MOSTRAR MATRIZ
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) { //COLUMNAS
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
    } // CERRAR MAIN
}// CERRAR CLASE
