package expresion_regular;

import java.util.Scanner;

public class Ejercicio2 { // INICIA CLASE
    public static void main(String[] args) { // INICIA MAIN
       Scanner sc = new Scanner(System.in);
       String entrada;
       String er = "[1-9][0-9]" ; //10 - 99
       boolean correcto;
       do { // INICIA DO-WHILE
           System.out.print("Ingrese número entero 2 dígitos? ");
           entrada = sc.next();
           correcto = entrada.matches(er);
           /*
           if(correcto == false) {
              System.out.println("FALSO"); 
           }*/
       }while(correcto == false); // TERMINA DO-WHILE
       System.out.println("PROCESAR");
    } //TERMINA MAIN
} // TERMINAR CLASE
