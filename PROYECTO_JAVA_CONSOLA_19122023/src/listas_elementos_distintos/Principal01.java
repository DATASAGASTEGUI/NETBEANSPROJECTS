package listas_elementos_distintos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Principal01 {

    public static void main(String[] args) {
        ejemplo02();
    }

    public static void ejemplo01() {
        Set<Integer> numeros = new TreeSet<>(); //Sin duplicados y ordenados alfabeticamente

        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random() * 20 + 1));
        }

        System.out.println("Lista: " + numeros);

        for (Integer x : numeros) {
            System.out.print(x + "   ");
        }
        /*
       for(int i=0; i<numeros.size(); i++) {
           int y = numeros.get(i); //No existe esta forma de iterar
       }
         */
    }

    public static void ejemplo02() {
        Set<Integer> numeros = new HashSet<>(); //Sin duplicados y sin ordenar

        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random() * 20 + 1));
        }

        System.out.println("Lista: " + numeros);

        for (Integer x : numeros) {
            System.out.print(x + "   ");
        }
        /* 
       for(int i=0; i<numeros.size(); i++) {
           int y = numeros.get(i); //No existe esta forma de iterar
       }
         */
    }

    public static void ejemplo03() {
        List<Integer> numeros = new ArrayList<>(); //Con duplicados y sin ordenar

        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random() * 20 + 1));
        }

        System.out.println("Lista: " + numeros);

        for (Integer x : numeros) {
            System.out.print(x + "   ");
        }

        System.out.println();
        
        for (int i = 0; i < numeros.size(); i++) {
            int y = numeros.get(i);
            System.out.print(y + "   ");
        }

    }

}
