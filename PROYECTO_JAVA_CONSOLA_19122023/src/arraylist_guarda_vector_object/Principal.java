package arraylist_guarda_vector_object;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Object[]> registros_al = new ArrayList<>();
        Object[] registro1 = {"T01", "Miguel", "Ruiz", 1, "343"};
        Object[] registro2 = {"T02", "Morgan", "Beobide", 4, "121#15"};
        Object[] registro3 = {"T03", "Harper", "Etxeita", 2, "404#2632"};
        Object[] registro4 = {"T04", "Jerónimo", "Anghel", 2, "435#2651"};
        Object[] registro5 = {"T05", "Chris", "Elizalde", 3, "238659"};
        Object[] registro6 = {"T06", "Isabelle", "Gamarra", 4, "128#10"};

        registros_al.add(registro1);
        registros_al.add(registro2);
        registros_al.add(registro3);
        registros_al.add(registro4);
        registros_al.add(registro5);
        registros_al.add(registro6);

        cabecera();
        for (Object[] objeto : registros_al) {
            String idTrabajador = (String) objeto[0];
            String nombre = (String) objeto[1];
            String apaterno = (String) objeto[2];
            int tipoTrabajador = (int) objeto[3];
            String patronesSueldo = (String) objeto[4];
            cuerpo(idTrabajador, nombre, apaterno, tipoTrabajador, patronesSueldo);
        }
    }

    public static void cabecera() {
        System.out.printf("%-10s %-10s %-10s %6s %20s\n", "IDALUMNO", "NOMBRE", "APATERNO", "TIPO", "PARAMETROS SUELDO");
        System.out.printf("%-10s %-10s %-10s %6s %20s\n", "--------", "------", "--------", "----", "-----------------");
    }

    public static void cuerpo(String idTrabajador, String nombre, String apaterno, int tipoTrabajador, String parametrosSueldo) {
        System.out.printf("%-10s %-10s %-10s %6d %20s\n", idTrabajador, nombre, apaterno, tipoTrabajador, parametrosSueldo);
    }

}
