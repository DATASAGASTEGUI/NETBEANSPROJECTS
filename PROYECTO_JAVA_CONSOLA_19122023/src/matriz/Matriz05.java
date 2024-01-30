package matriz;

public class Matriz05 {

    public static void main(String[] args) {
        // DECLARAR MATRIZ DE TAMAÑO 3X2 (6 ELEMENTOS)
        int[][] matriz = new int[3][2];

        // LLENAR Y MOSTRAR MATRIZ
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[0].length; j++) { //COLUMNAS
                matriz[i][j] = (int) (Math.random() * 6 + 1);
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

        // SUMAR TODOS NUMEROS DE LA MATRIZ
        int sumaTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaTotal = sumaTotal + matriz[i][j];
            }
        }
        System.out.println("Suma Total Números Matriz: " + sumaTotal);
    } // CERRAR MAIN
}// CERRAR CLASE
