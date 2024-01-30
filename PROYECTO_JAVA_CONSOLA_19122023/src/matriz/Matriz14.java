package matriz;

public class Matriz14 { // ABRIR CLASE

    public static void main(String[] args) { // ABRIR MAIN
        // DECLARAR MATRIZ DIMENSION 2X3
        String[][] nombre = {
            {"Luis", "Miguel", "Carlos"},
            {"María", "Silvia", "Lucho"}
        };
        // MOSTRARLO POR COLUMNA
        for (int i = 0; i < nombre[0].length; i++) {
            for (int j = 0; j < nombre.length; j++) {
                System.out.print(nombre[j][i] + "\t");
            }
            System.out.println();
        }

        // FOREACH: QUIERO MOSTRAR SOLO LOS NOMBRES DE LA FILA 1
        System.out.println("FOREACH: FILA 1");
        for (String elemento : nombre[1]) {
            System.out.println(elemento);
        }
    } // CERRAR MAIN
}// CERRAR CLASE
