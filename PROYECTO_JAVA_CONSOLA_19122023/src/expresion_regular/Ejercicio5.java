package expresion_regular;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String entrada;
       String er = "(true|false|TRUE|FALSE|verdadero|falso)";
       boolean correcto;
       do {
            System.out.print("Es usted casado (true/false)?");
            entrada = sc.next();
            correcto = entrada.matches(er);
       }while(correcto == false);
       System.out.println("TERMINAR - PROCESAR");
    } // TERMINAR MAIN
} // TERMINAR CLASE
