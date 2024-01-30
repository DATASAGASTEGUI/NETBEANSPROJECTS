package matriz;

public class Matriz13 { // ABRIR CLASE

    public static void main(String[] args) { // ABRIR MAIN
        int sumaTotal = 0;
        // DECLARAR MATRIZ DIMENSION 4X3
        int[][] numero = new int[4][3];
        // LLENAR MATRIZ
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                numero[i][j] = (int) (Math.random() * 6 + 1);
            }
        }
        // MOSTRAR MATRIZ POR FILA
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numero[i][j] + "  ");
            }
            System.out.println();
        }
        //RECORRER LA MATRIZ POR FILA - SUMAR SOLO PARES
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (numero[i][j] % 2 == 0) {
                    sumaTotal = sumaTotal + numero[i][j];
                }
            }
        }
        System.out.println("Suma Total: " + sumaTotal);

        //MOSTRAR MATRIZ POR COLUMNA
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numero[j][i] + "  ");
            }
            System.out.println();
        }
        //RECORRER LA MATRIZ POR COLUMNA - SUMAR SOLO PARES
        sumaTotal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (numero[j][i] % 2 == 0) {
                    sumaTotal = sumaTotal + numero[j][i];
                }
            }
        }
        System.out.println("Suma Total: " + sumaTotal);
    } // CERRAR MAIN
}// CERRAR CLASE
