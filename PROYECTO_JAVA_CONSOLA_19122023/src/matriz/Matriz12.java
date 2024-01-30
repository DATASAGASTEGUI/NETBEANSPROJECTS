package matriz;

public class Matriz12 { // ABRIR CLASE

    public static void main(String[] args) { // ABRIR MAIN
        //DECLAR MATRIZ DIMENSION 4X3
        char[][] matriz = new char[4][3];
        // MOSTRAR MATRIZ
        for (int i = 0; i < matriz.length; i++) { // FILAS
            for (int j = 0; j < matriz[0].length; j++) { // COLUMNAS
                matriz[i][j] = (char) (int) (Math.random() * 26 + 65); // [65,90]
                System.out.print(matriz[i][j] + "    ");
            }
            System.out.println();
        }
        //RECORRER MATRIZ POR FILA
        int c = 0;
        for (int i = 0; i < matriz.length; i++) { // FILAS
            for (int j = 0; j < matriz[0].length; j++) { // COLUMNAS
                if (matriz[i][j] == 'A' || matriz[i][j] == 'E' || matriz[i][j] == 'I' || matriz[i][j] == 'O' || matriz[i][j] == 'U') {
                    c = c + 1;
                }
            }
        }
        System.out.println("Cantidad Vocales: " + c);
    } // CERRAR MAIN
}// CERRAR CLASE
