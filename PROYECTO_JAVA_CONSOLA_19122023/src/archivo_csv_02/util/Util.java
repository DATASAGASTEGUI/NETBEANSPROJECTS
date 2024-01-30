package archivo_csv_02.util;

public class Util {

    public static double redondear2(double numero) {
        return Math.round(numero * 100.0) / 100.0;
    }

    public static boolean existeCiudad(String ciudad, String[] ciudades_v) {
        boolean bandera = false;
        for (int i = 0; i < ciudades_v.length; i++) {
            if (ciudad.equalsIgnoreCase(ciudades_v[i])) {
                bandera = true;
                break;
            }
        }
        return bandera;
    }
}
