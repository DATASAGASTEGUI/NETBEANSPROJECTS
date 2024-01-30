package ejemplo004;

public class Util {

    public static double redondear(double x) {
        return Math.round(x * 100.0) / 100.0;
    }

    public static double numeroAleatorio() {
        int parteDecimal = (int) (Math.random() * 90 + 10); //[10,99]
        int parteEntera = (int) (Math.random() * 90 + 10); //[10,99]
        String numero_s = String.valueOf(parteEntera) + "." + String.valueOf(parteDecimal);
        double numero_d = Double.parseDouble(numero_s);
        return numero_d;
    }

    public static String operacionAleatoria() {
        String[] operacion = {"SUMA", "RESTA", "MULTIPLICACION", "DIVISION"};
        int aleatorio = (int) (Math.random() * 4);
        return operacion[aleatorio];
    }
}
