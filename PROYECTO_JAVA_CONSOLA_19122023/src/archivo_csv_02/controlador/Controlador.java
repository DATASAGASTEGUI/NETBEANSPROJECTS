package archivo_csv_02.controlador;

import archivo_csv_02.archivocsv.ArchivoCsv;
import archivo_csv_02.model.Transaccion;
import archivo_csv_02.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Controlador {

    List<Transaccion> transacciones_al;

    public Controlador(List<Transaccion> transacciones_al) {
        this.transacciones_al = transacciones_al;
    }

    public void controlador01() {
        if (transacciones_al != null) {
            Transaccion.cabecer();
            for (Transaccion t : this.transacciones_al) {
                t.cuerpo();
            }
        } else {
            System.out.println("ERROR: LECTURA ARCHIVO CSV");
        }
    }

    public void controlador02() {
        String[] categorias_v = ArchivoCsv.obtenerVectorCategoriasDistintas();
        double[] c = new double[categorias_v.length];
        for (int i = 0; i < categorias_v.length; i++) {
            for (Transaccion t : transacciones_al) {
                if (categorias_v[i].equalsIgnoreCase(t.getCategoria())) {
                    c[i] = c[i] + t.getVentas();
                }
            }
            System.out.printf("%12s %-18s %3s %8.2f\n", "Venta Total ", categorias_v[i], " : ", c[i]);
        }
    }

    public void controlador03() {
        String[] ciudades_v = ArchivoCsv.obtenerVectorCiudadesDistintas();
        double[] c = new double[ciudades_v.length];
        for (int i = 0; i < ciudades_v.length; i++) {
            for (Transaccion t : transacciones_al) {
                if (ciudades_v[i].equalsIgnoreCase(t.getCiudad())) {
                    c[i] = c[i] + t.getVentas();
                }
            }
            System.out.printf("%12s %-10s %3s %8.2f\n", "Venta Total ", ciudades_v[i], " : ", c[i]);
        }
    }

    public void controlador04() {
        String[] ciudades_v = ArchivoCsv.obtenerVectorCiudadesDistintas();
        double[] c = new double[ciudades_v.length];
        int posicion = 0;
        for (int i = 0; i < ciudades_v.length; i++) {
            for (Transaccion t : transacciones_al) {
                if (ciudades_v[i].equalsIgnoreCase(t.getCiudad()) && t.getCategoria().equalsIgnoreCase("Informática")) {
                    c[i] = c[i] + t.getVentas();
                }
            }
            System.out.printf("%12s %-10s %3s %8.2f\n", "Venta Total Informática", ciudades_v[i], " : ", c[i]);
        }
        double maximo = c[0];
        for (int i = 0; i < c.length; i++) {
            if (c[i] > maximo) {
                maximo = c[i];
                posicion = i;
            }
        }
        System.out.println("\nMayor Venta en Informática con " + Util.redondear2(c[posicion]) + " euros, es " + ciudades_v[posicion]);
    }

    public void controlador05() {
        double at = 0;
        double ac = 0;
        for (Transaccion t : transacciones_al) {
            if (t.getFormaPago().equalsIgnoreCase("Tarjeta")) {
                at = at + t.getVentas();
            } else {
                ac = ac + t.getVentas();
            }
        }
        System.out.printf("%20s %8.2f\n", "Total Venta Tarjeta: ", at);
        System.out.printf("%20s %8.2f\n", "Total Venta Contado: ", ac);
        if (at > ac) {
            System.out.println("\nLa mayor venta fue con " + "Tarjeta");
        } else {
            System.out.println("\nLa mayor venta fue con " + "Contado");
        }
    }

    public void controlador06() {
        Set<String> ciudades = new TreeSet<>();
        for (Transaccion t : transacciones_al) {
            ciudades.add(t.getCiudad());
        }
        System.out.println(ciudades);
    }

    public void controlador07() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre ciudad? ");
        String ciudad = sc.next();
        String[] ciudades_v = ArchivoCsv.obtenerVectorCiudadesDistintas();
        List<Transaccion> transaccionesciudad_al = new ArrayList<>();

        if (Util.existeCiudad(ciudad, ciudades_v)) {
            for (Transaccion t : transacciones_al) {
                if (t.getCiudad().equalsIgnoreCase(ciudad)) {
                    transaccionesciudad_al.add(t);
                }
            }

            String[] categorias_v = ArchivoCsv.obtenerVectorCategoriasDistintas();
            double[] c = new double[categorias_v.length];
            for (int i = 0; i < categorias_v.length; i++) {
                for (Transaccion t : transaccionesciudad_al) {
                    if (categorias_v[i].equalsIgnoreCase(t.getCategoria())) {
                        c[i] = c[i] + t.getVentas();
                    }
                }
                System.out.printf("%12s %-18s %3s %8.2f\n", "Venta Total ", categorias_v[i], " : ", c[i]);
            }
        } else {
            System.out.println("La ciudad " + ciudad + " no existe");
        }

    }

}
