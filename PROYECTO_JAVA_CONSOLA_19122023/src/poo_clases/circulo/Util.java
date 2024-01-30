package poo_clases.circulo;

public class Util { // ABRIR CLASE

    public static double redondear(double x) {
        return Math.round(x * 100.0) / 100.0;
    }

    public static int dado() {
        return (int) (Math.random() * 6 + 1);
    }

} // CERRAR CLASE
