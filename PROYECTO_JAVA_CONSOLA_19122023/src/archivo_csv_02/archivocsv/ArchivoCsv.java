package archivo_csv_02.archivocsv;

import archivo_csv_02.model.Transaccion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ArchivoCsv {

    public static List<Transaccion> obtenerListaObjetosTransaccion() {
        List<Transaccion> transacciones_al = new ArrayList<>();
        File f;
        FileReader fr;
        BufferedReader bf;
        String registroCsv = "";
        try {
            f = new File("data/Transaccion.csv");
            fr = new FileReader(f);
            bf = new BufferedReader(fr);
            int i = 0;
            while ((registroCsv = bf.readLine()) != null) {
                if (i != 0) {
                    Transaccion t = new Transaccion(registroCsv); //Inicializa los atributos del objeto
                    transacciones_al.add(t);
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println("ERROR LECTURA");
            return null;
        }
        return transacciones_al;
    }

    public static List<String> obtenerListaCategoriasDistintas() {
        List<Transaccion> transacciones_al = ArchivoCsv.obtenerListaObjetosTransaccion();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Transaccion t : transacciones_al) {
            treeSet.add(t.getCategoria());
        }
        List<String> categorias_al = new ArrayList<>(treeSet);
        return categorias_al;
    }

    public static String[] obtenerVectorCategoriasDistintas() {
        List<Transaccion> transacciones_al = ArchivoCsv.obtenerListaObjetosTransaccion();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Transaccion t : transacciones_al) {
            treeSet.add(t.getCategoria());
        }
        String[] categorias_v = treeSet.toArray(new String[treeSet.size()]);
        return categorias_v;
    }

    public static String[] obtenerVectorCiudadesDistintas() {
        List<Transaccion> transacciones_al = ArchivoCsv.obtenerListaObjetosTransaccion();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Transaccion t : transacciones_al) {
            treeSet.add(t.getCiudad());
        }
        String[] ciudades_v = treeSet.toArray(new String[treeSet.size()]);
        return ciudades_v;
    }
    
}
