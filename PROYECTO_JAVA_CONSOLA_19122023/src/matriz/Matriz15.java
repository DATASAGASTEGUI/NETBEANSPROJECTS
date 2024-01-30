package matriz;

public class Matriz15 { // ABRIR CLASE

    public static void main(String[] args) { // ABRIR MAIN
        // DECLARAR MATRIZ DIMENSION 3X2
        char[][] matriz = {
            {'A', 'J'},
            {'X', 'I'},
            {'B', 'Z'}
        };
        // MOSTRAR MATRIZ POR FILA
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) { //COLUMNAS
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        // MOMSTRAR MATRIZ POR COLUMNA FORMA 1
        for (int i = 0; i < matriz[0].length; i++) { //COLUMNAS
            for (int j = 0; j < matriz.length; j++) { //FILAS
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        // MOMSTRAR MATRIZ POR COLUMNA FORMA 2
        for (int j = 0; j < matriz[0].length; j++) { //COLUMNAS
            for (int i = 0; i < matriz.length; i++) { //FILAS
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    } // CERRAR MAIN
}// CERRAR CLASE
