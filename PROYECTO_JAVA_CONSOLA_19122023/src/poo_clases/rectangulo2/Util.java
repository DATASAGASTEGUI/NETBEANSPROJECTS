package poo_clases.rectangulo2;

public class Util {

    public static int x1() {
        int x1 = (int) (Math.random() * 10 + 1); //[1,10]
        return x1;
    }

    public static int x2() {
        int x2 = (int) (Math.random() * 11 + 20); //[20,30]
        return x2;
    }

    public static int y1() {
        int y1 = (int) (Math.random() * 10 + 1); //[1,10]
        return y1;
    }

    public static int y2() {
        int y2 = (int) (Math.random() * 11 + 20); //[20,30]
        return y2;
    }

    public static double redondear(double x) {
        return Math.round(x * 100.0) / 100.0;
    }
}
