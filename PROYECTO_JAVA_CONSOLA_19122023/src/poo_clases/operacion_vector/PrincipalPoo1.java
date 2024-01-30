package poo_clases.operacion_vector;

import java.util.Arrays;

public class PrincipalPoo1 {

    public static void main(String[] args) {
        int[] vector = {4, 5, 1, 3, 4, 10, 11};

        OperacionVector ov = new OperacionVector(vector);

        System.out.println("Longitud Vector: " + ov.logitudVector());

        System.out.println("Promedio Vector: " + ov.promedioVector());

        System.out.println("Suma Vector: " + ov.sumaVector());

        System.out.println("Maximo Vector: " + ov.maximoVector());

        System.out.println("Pares Vector: " + Arrays.toString(ov.paresVector1()));

        System.out.println("Pares Vector: " + Arrays.toString(ov.paresVector2()));
        
       // System.out.println("Entrada y Salida: " + ov);
    } // CERRAR MAIN
} // CERRAR CLASE
