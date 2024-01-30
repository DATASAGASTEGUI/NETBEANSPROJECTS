package menu_un_nivel;

import java.util.Scanner;

public class MenuPrincipal {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        do {
            Menu.cls();
            System.out.println("MENU");
            System.out.println("----");
            System.out.println("[1] OPCION 1");
            System.out.println("[2] OPCION 2");
            System.out.println("[3] OPCION 3");
            System.out.println("[4] OPCION 4");
            System.out.println("[5] OPCION 5");
            System.out.println("[6] OPCION 6");
            System.out.println("[7] OPCION 7");
            System.out.println("[8] OPCION 8");
            System.out.println("[9] OPCION 9");

            System.out.println("[0] SALIR");

            System.out.print("\nINGRESE OPCION? ");
            String opcion = sc.next();

            switch (opcion) {
                case "1":
                    Menu.cls();
                    Controlador.controlador1();
                    Menu.pause();
                    break;
                case "2":
                    Menu.cls();
                    Controlador.controlador2();
                    Menu.pause();
                    break;
                case "3":
                    Menu.cls();
                    Controlador.controlador3();
                    Menu.pause();
                    break;
                case "4":
                    Menu.cls();
                    Controlador.controlador4();
                    Menu.pause();
                    break;
                case "5":
                    Menu.cls();
                    Controlador.controlador5();
                    Menu.pause();
                    break;
                case "6":
                    Menu.cls();
                    Controlador.controlador6();
                    Menu.pause();
                    break;
                case "7":
                    Menu.cls();
                    Controlador.controlador7();
                    Menu.pause();
                    break;
                case "8":
                    Menu.cls();
                    Controlador.controlador8();
                    Menu.pause();
                    break;
                case "9":
                    Menu.cls();
                    Controlador.controlador9();
                    Menu.pause();
                    break;
                case "0":
                    Menu.cls();
                    System.out.println("GRACIAS POR SU VISITA");
                    Menu.pause();
                    Menu.cls();
                    System.exit(0);
            }
        } while (true);
    }

}
