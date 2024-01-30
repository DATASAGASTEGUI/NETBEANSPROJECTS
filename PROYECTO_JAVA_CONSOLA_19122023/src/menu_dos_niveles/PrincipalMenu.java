package menu_dos_niveles;

import java.util.Scanner;

public class PrincipalMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
                    SubMenu_1.submenu_1();
                    break;
                case "2":
                    Menu.cls();
                    ControladorMenu.controlador2();
                    Menu.pause();
                    break;
                case "3":
                    Menu.cls();
                    ControladorMenu.controlador3();
                    Menu.pause();
                    break;
                case "4":
                    Menu.cls();
                    ControladorMenu.controlador4();
                    Menu.pause();
                    break;
                case "5":
                    Menu.cls();
                    ControladorMenu.controlador5();
                    Menu.pause();
                    break;
                case "6":
                    Menu.cls();
                    ControladorMenu.controlador6();
                    Menu.pause();
                    break;
                case "7":
                    Menu.cls();
                    ControladorMenu.controlador7();
                    Menu.pause();
                    break;
                case "8":
                    Menu.cls();
                    ControladorMenu.controlador8();
                    Menu.pause();
                    break;
                case "9":
                    Menu.cls();
                    ControladorMenu.controlador9();
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
