package poo_clases.operacion_vector;

import java.util.Arrays;

public class OperacionVector {

    //(1)VARIABLES DE INSTANCIA
    //ENTRADA
    private int[] vector;
    //SALIDA (CALCULO)
    private int longitudVector;
    private double promedioVector;
    private int sumaVector;
    private int maximoVector;
    private int[] paresVector;

    //(2)CONSTRUCTORES
    public OperacionVector(int[] vector) {
        this.vector = vector;
    }

    public OperacionVector() {
    }

    //(3)METODOS SET Y GET (ENTRADA)
    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    //(4)METODOS CALCULO (SALIDA)
    public int logitudVector() {
        this.longitudVector = this.vector.length;
        return longitudVector;
    }

    public double promedioVector() {
        double s = 0;
        for (int i = 0; i < this.vector.length; i++) {
            s = s + this.vector[i];
        }
        this.promedioVector = s / vector.length;
        return this.promedioVector;
    }

    public int sumaVector() {
        int s = 0;
        for (int i = 0; i < this.vector.length; i++) {
            s = s + this.vector[i];
        }
        this.sumaVector = s;
        return this.sumaVector;
    }

    public int maximoVector() {
        int maximo = -99999;
        for (int i = 0; i < this.vector.length; i++) {
            if (this.vector[i] > maximo) {
                maximo = this.vector[i];
            }
        }
        this.maximoVector = maximo;
        return this.maximoVector;
    }

    public int[] paresVector1() {
        int c = 0;
        for (int i = 0; i < this.vector.length; i++) {
            if (this.vector[i] % 2 == 0) {
                c++;
            }
        }
        int[] aux = new int[c];
        int k = 0;
        for (int i = 0; i < this.vector.length; i++) {
            if (this.vector[i] % 2 == 0) {
                aux[k] = this.vector[i];
                k++;
            }
        }
        this.paresVector = aux;
        return this.paresVector;
    }

    public int[] paresVector2() {
        String x = "";
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                x = x + vector[i] + ","; // ACUMULADOR CONCATENA(JUNTA)
            }
        }
        x = x.substring(0, x.length() - 1);
        String[] y = x.split(",");
        int[] pares = new int[y.length];
        for (int i = 0; i < y.length; i++) {
            pares[i] = Integer.parseInt(y[i]);
        }
        this.paresVector = pares;
        return this.paresVector;
    }

    //(5)METODOS MOSTRAR LAS VARIABLES DE INSTANCIA

    @Override
    public String toString() {
        return "OperacionVector{" + "vector=" + Arrays.toString(vector) 
                                  + ", longitudVector=" + longitudVector 
                                  + ", promedioVector=" + promedioVector 
                                  + ", sumaVector=" + sumaVector 
                                  + ", maximoVector=" + maximoVector
                                  + ", paresVector=" + Arrays.toString(paresVector) + '}';
    }
    
    
}
