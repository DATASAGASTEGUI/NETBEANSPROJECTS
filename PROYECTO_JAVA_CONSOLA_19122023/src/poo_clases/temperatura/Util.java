package poo_clases.temperatura;

public class Util {

    public static double numeroDoubleAleatorio() {
        int parteDecimal = (int) (Math.random() * 90 + 10); //[10,99]
        int parteEntera = (int) (Math.random() * 90 + 10); //[10,99]
        String numero_s = String.valueOf(parteEntera) + "." + String.valueOf(parteDecimal);
        double numero_d = Double.parseDouble(numero_s);
        return numero_d;
    }

    public static String opcionAleatoria() {
        String[] operacion = {"FC","CF"};
        int aleatorio = (int) (Math.random() * 2);
        return operacion[aleatorio];
    }
}
