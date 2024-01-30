package expresion_regular;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String entrada;
       String er = "[012]\\.[0-9]{1,2}";//1=MINIMO 2=MAXIMO  \d  [0-9]
       boolean correcto;
       do {
           System.out.print("Ingrese su estatura? ");
           entrada = sc.next();
           correcto = entrada.matches(er);
       }while(correcto == false);
       System.out.println("TERMINAR - PROCESAR");
    } // TERMINA MAIN
} // TERMINA CLASE
