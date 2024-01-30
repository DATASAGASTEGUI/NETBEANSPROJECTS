package matriz;

public class Matriz10 { // ABRIR CLASE

    public static void main(String[] args) { // ABRIR MAIN
        // DECLARAR MATRIZ DIMENSION 2X3
        int[][] matriz = {
            {6, 3, 2},
            {3, 4, 5}
        };
        // DECLARAR VECTOR FILAS
        int[] sf = new int[matriz.length];
        // DECLARAR VECTOR COLUMNAS
        int[] sc = new int[matriz[0].length];
        // MOSTRAR MATRIZ
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) {//COLUMNAS
                System.out.print(matriz[i][j] + "    ");
            }
            System.out.println();
        }
        // RECORRER MATRIZ POR COLUMNA PARA SUMAR LAS COLUMNAS
        for (int j = 0; j < matriz[0].length; j++) { //COLUMNAS
            for (int i = 0; i < matriz.length; i++) {//FILAS
                sc[j] = sc[j] + matriz[i][j];
            }
        }
        for (int i = 0; i < sc.length; i++) {
            System.out.println("Suma Columna " + i + " : " + sc[i]);
        }
        // RECORRER MATRIZ POR FILA PARA SUMAR LAS FILAS
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sf[i] = sf[i] + matriz[i][j];
            }
        }
        for (int i = 0; i < sf.length; i++) {
            System.out.println("Suma Fila " + i + " : " + sf[i]);
        }
    } // CERRAR MAIN
}// CERRAR CLASE
