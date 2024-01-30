package poo_clases.nif;

public class Nif {
    //(1) VARIABLES DE INSTANCIA

    //ENTRADA
    private int dni;

    //SALIDA (CALCULO)
    private char letra;

    //(2) CONSTRUCTORES
    public Nif(int dni) {
        this.dni = dni;
    }

    public Nif() {
    }

    //(3) METODOS SET Y GET (ENTRADA)
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    //(4) METODOS CALCULO (SALIDA)
    public char letra() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        this.letra = letras[this.dni % 23];
        return letra;
    }

    //(5) METODOS MOSTRAR VARIABLES DE INSTANCIA DE LA CLASE
    public static void cabecera() { // Método de clase
        System.out.printf("%4s %10s %10s\n", "N","DNI", "LETRA");
        System.out.printf("%4s %10s %10s\n", "-","---", "-----");
    }

    public void cuerpo(int i) { // Método de instancia
        System.out.printf("%4d %10d %10c\n", i,this.dni, this.letra());
    }

    @Override
    public String toString() { // Método de instancia
        return "Nif{" + "dni=" + dni + ", letra=" + this.letra() + '}';
    }

}
