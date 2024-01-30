package matriz;

public class Matriz09 { // ABRIR CLASE

    public static void main(String[] args) { // ABRIR MAIN
        // DECLARAR MATRIZ DIMENSION 2X3
        int[][] matriz = {
            {6, 3, 2},
            {3, 4, 5}
        };
        // MOSTRAR MATRIZ
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) {//COLUMNAS
                System.out.print(matriz[i][j] + "    ");
            }
            System.out.println();
        }
        // RECORRER MATRIZ POR FILA PARA SUMAR LAS COLUMNAS
        int sc0 = 0, sc1 = 0, sc2 = 0;
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) {//COLUMNAS
                if (j == 0) {
                    sc0 = sc0 + matriz[i][j];
                }
                if (j == 1) {
                    sc1 = sc1 + matriz[i][j];
                }
                if (j == 2) {
                    sc2 = sc2 + matriz[i][j];
                }
            }
        }
        System.out.println("Suma Columna 0: " + sc0);
        System.out.println("Suma Columna 1: " + sc1);
        System.out.println("Suma Columna 2: " + sc2);
        // RECORRER MATRIZ POR FILA PARA SUMAR LAS FILAS
        int sf0 = 0, sf1 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 0) {
                    sf0 = sf0 + matriz[i][j];
                }
                if (i == 1) {
                    sf1 = sf1 + matriz[i][j];
                }
            }
        }
        System.out.println("Suma Fila 0: " + sf0);
        System.out.println("Suma Fila 1: " + sf1);
    } // CERRAR MAIN
}// CERRAR CLASE
