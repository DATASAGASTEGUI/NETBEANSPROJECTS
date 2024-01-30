package expresion_regular;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        String er = "[a-zA-Z]+";
        boolean correcto;
        do {
            System.out.print("Ingrese su nombre? ");
            entrada = sc.nextLine();
            correcto = entrada.matches(er);
        }while(correcto == false);
        System.out.println("TERMINA - PROCESA");
    }
}
