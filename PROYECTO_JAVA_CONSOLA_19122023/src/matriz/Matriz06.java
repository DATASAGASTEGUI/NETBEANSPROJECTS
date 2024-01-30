package matriz;

public class Matriz06 {

    public static void main(String[] args) {
        // DECLARAR MATRIZ DE TAMAÑO 3X2 (6 ELEMENTOS)
        int[][] matriz = new int[3][2];

        int sumaTotalFila = 0, sumaTotalColumna = 0;
        int sumaTotalF = 0, sumaTotalC = 0;

        // LLENAR Y MOSTRAR MATRIZ
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) { //COLUMNAS
                matriz[i][j] = (int) (Math.random() * 6 + 1);
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

        // SUMAR FILAS DE LA MATRIZ
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaTotalFila = sumaTotalFila + matriz[i][j];
            }
            System.out.println("Suma Total Fila " + i + " : " + sumaTotalFila);
            sumaTotalF = sumaTotalF + sumaTotalFila;
            sumaTotalFila = 0;
        }
        System.out.println("Suma Total Filas Matriz: " + sumaTotalF);

        // SUMAR COLUMNAS DE LA MATRIZ
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumaTotalColumna = sumaTotalColumna + matriz[i][j];
            }
            System.out.println("Suma Total Columna " + j + " : " + sumaTotalColumna);
            sumaTotalC = sumaTotalC + sumaTotalColumna;
            sumaTotalColumna = 0;
        }
        System.out.println("Suma Total Columnas Matriz: " + sumaTotalC);
    } // CERRAR MAIN
}// CERRAR CLASE
