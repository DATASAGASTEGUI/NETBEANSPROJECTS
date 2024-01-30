package expresion_regular;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        boolean correcto;
        String er = "[0-9]+";
        do {
            System.out.print("Ingrese número entero? ");
            entrada = sc.next();
            correcto = entrada.matches(er);
            if(correcto) {
               System.out.println("VERDADERO");
            }else {
                System.out.println("FALSO");
            }
        }while(correcto == false);
        System.out.println("TERMINA");
    }

}
