package ejemplo014;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ArchivoCsv {

    public static List<Alumno> getListaObjetosTipoAlumno(String nombreRutaArchivo) throws FileNotFoundException { //01
        List<Alumno> alumnos_al = new ArrayList<Alumno>();

        String registro;

        String idAlumno, nombre, paterno, fechaNacimiento;
        char sexo;

        File f;
        FileInputStream fis = null;
        InputStreamReader isr;
        BufferedReader br;

        try {
            f = new File(nombreRutaArchivo);
            fis = new FileInputStream(f);
            isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            br = new BufferedReader(isr);
            
            int i = 0;
            while ((registro = br.readLine()) != null) {
                if (i != 0) {
                    String p[] = registro.split(";");
                    idAlumno = p[0];
                    nombre = p[1];
                    paterno = p[2];
                    fechaNacimiento = p[3];
                    sexo = p[4].charAt(0);
                    alumnos_al.add(new Alumno(idAlumno, nombre, paterno, fechaNacimiento, sexo));
                }
                i++;
            }
        } catch (Exception e) {
            alumnos_al = null;
        } finally {
            try {
                if (null != fis) {
                    fis.close();
                }
            } catch (IOException e) {
                alumnos_al = null;
            }
        }
        return alumnos_al;
    }

    public static String getRutaAbsolutaFromArchivo(String nra) {
        File f = new File(nra);
        String ra = f.getAbsolutePath();
        return ra;
    }

}
