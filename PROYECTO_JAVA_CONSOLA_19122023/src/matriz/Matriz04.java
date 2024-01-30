package matriz;

public class Matriz04 {

    public static void main(String[] args) {
        // DECLARAR MATRIZ DE TAMAÑO 3X2 (6 ELEMENTOS)
        int[][] matriz = new int[3][2];

        // LLENAR MATRIZ
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) { //COLUMNAS
                matriz[i][j] = (int) (Math.random() * 6 + 1);
            }
        }
        // RECORRER POR FILA
        System.out.println("RECORRER POR FILA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
        // RECORRER POR COLUMNA
        System.out.println("RECORRER POR COLUMNA");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    } // CERRAR MAIN
}// CERRAR CLASE
