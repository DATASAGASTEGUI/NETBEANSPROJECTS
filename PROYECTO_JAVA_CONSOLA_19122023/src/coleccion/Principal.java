package coleccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
        //COLECCION ArrayList       (NO ELIMINA DUPLICADOS Y SIN ORDENAR)
        //COLECCION TreeSet         (ELIMINAR DUPLICADOS Y ORDENA)
        //COLECCION HashSet         (ELIMINAR DUPLICADOS Y NO ORDENA OSEA ORDEN ALEATORIO)
        //COLECCION LinkedHashSet   (ELIMINA DUPLICADOS Y EL ORDEN ES COMO FUERON INGRESADOS)

        //EJEMPLO 01: COLECCION ARRAYLIST DE ENTEROS CON FORMAS DE RECORRER
        //ejemplo01();
        //EJEMPLO 02: COLECCION TREESET DE ENTEROS CON FORMAS DE RECORRER
        //ejemplo02();
        //EJEMPLO 03: COLECCION TREESET DE CIUDADES
        //ejemplo03();
        //EJEMPLO 04: COLECCION HASHSET DE ENTEROS
        //ejemplo04();
        //EJEMPLO 05: COLECCION HASHSET DE CIUDADES
        //ejemplo05();
        //EJEMPLO 06: COLECCION LINKEDHASHSET DE CIUDADES
        //ejemplo06();
    }

    public static void ejemplo01() {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random() * 6 + 1));
        }

        //RECORRER POR INDICE
        for (int i = 0; i < numeros.size(); i++) {
            int x = numeros.get(i);
            System.out.print(x + "  ");
        }
        System.out.println();
        //RECORRER POR ELEMENTO
        for (Integer x : numeros) {
            System.out.print(x + "  ");
        }
        System.out.println();
        System.out.println(numeros);
    }

    public static void ejemplo02() {
        Set<Integer> numeros = new TreeSet<>();
        //ELIMINA DUPLICADOS
        for (int i = 0; i < 20; i++) {
            numeros.add((int) (Math.random() * 100) + 1);
        }
        //RECORRER POR INDICE (NO EXISTE)
        //RECORRER POR ELEMENTO
        for (Integer x : numeros) {
            System.out.print(x + "  ");
        }
        System.out.println();
        System.out.println(numeros);
    }

    public static void ejemplo03() {
        Set<String> ciudades = new TreeSet<>();
        ciudades.add("Madrid");
        ciudades.add("Madrid");
        ciudades.add("Valencia");
        ciudades.add("Madrid");
        ciudades.add("Valencia");
        ciudades.add("Sevilla");
        System.out.println(ciudades);
    }

    public static void ejemplo04() {
        Set<Integer> numeros = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            numeros.add((int) (Math.random() * 100) + 1);//[1-100]
        }
        System.out.print(numeros);
    }

    public static void ejemplo05() {
        Set<String> ciudades = new HashSet<>();
        ciudades.add("Madrid");
        ciudades.add("Madrid");
        ciudades.add("Valencia");
        ciudades.add("Madrid");
        ciudades.add("Valencia");
        ciudades.add("Sevilla");
        System.out.println(ciudades);
    }

    public static void ejemplo06() {
        Set<String> ciudades = new LinkedHashSet<>();
        ciudades.add("Madrid");
        ciudades.add("Madrid");
        ciudades.add("Valencia");
        ciudades.add("Madrid");
        ciudades.add("Valencia");
        ciudades.add("Sevilla");
        System.out.println(ciudades);
    }
} // FIN CLASE
