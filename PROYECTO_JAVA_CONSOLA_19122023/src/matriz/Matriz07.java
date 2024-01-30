package matriz;

public class Matriz07 {

    public static void main(String[] args) {
        // DECLARAR MATRIZ DE TAMAÑO 3X2 (6 ELEMENTOS)
        int nf = 3, nc = 2;
        int[][] a = new int[nf][nc];
        int[][] b = new int[nf][nc];
        int[][] c = new int[nf][nc];

        // LLENAR Y SUMAR MATRIZ
        for (int i = 0; i < a.length; i++) { //FILAS
            for (int j = 0; j < a[0].length; j++) { //COLUMNAS
                a[i][j] = (int) (Math.random() * 6 + 1);
                b[i][j] = (int) (Math.random() * 6 + 1);
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // MOSTRAR MATRIZ A
        System.out.println("MATRIZ A");
        for (int i = 0; i < a.length; i++) { //FILAS
            for (int j = 0; j < a[0].length; j++) { //COLUMNAS
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }

        // MOSTRAR MATRIZ B
        System.out.println("MATRIZ B");
        for (int i = 0; i < b.length; i++) { //FILAS
            for (int j = 0; j < b[0].length; j++) { //COLUMNAS
                System.out.print(b[i][j] + "   ");
            }
            System.out.println();
        }

        // MOSTRAR MATRIZ C
        System.out.println("MATRIZ B");
        for (int i = 0; i < c.length; i++) { //FILAS
            for (int j = 0; j < c[0].length; j++) { //COLUMNAS
                System.out.print(c[i][j] + "   ");
            }
            System.out.println();
        }

    } // CERRAR MAIN
}// CERRAR CLASE
