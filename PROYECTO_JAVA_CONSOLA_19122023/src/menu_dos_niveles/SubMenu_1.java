package menu_dos_niveles;

import java.util.Scanner;

public class SubMenu_1 {
    public static void submenu_1() {
        Scanner sc = new Scanner(System.in);
        boolean bandera = false;
        do {
            Menu.cls();
            System.out.println("SUBMENU: [1] OPCION 1");
            System.out.println("---------------------");
            System.out.println("[1] OPCION 1.1");
            System.out.println("[2] OPCION 1.2");
            System.out.println("[3] OPCION 1.3");
            System.out.println("[4] OPCION 1.4");
            System.out.println("[5] OPCION 1.5");
            System.out.println("[6] OPCION 1.6");
            System.out.println("[7] OPCION 1.7");
            System.out.println("[8] OPCION 1.8");
            System.out.println("[9] OPCION 1.9");
            System.out.println("[0] SALIR SUBMENU");

            System.out.print("\nINGRESE OPCION? ");
            String opcion = sc.next();

            switch (opcion) {
                case "1":
                    Menu.cls();
                    ControladorSubMenu_1.controlador1_1();
                    Menu.pause();
                    break;
                case "2":
                    Menu.cls();
                    ControladorSubMenu_1.controlador1_2();
                    Menu.pause();
                    break;
                case "3":
                    Menu.cls();
                    ControladorSubMenu_1.controlador1_3();
                    Menu.pause();
                    break;
                case "4":
                    Menu.cls();
                    ControladorSubMenu_1.controlador1_4();
                    Menu.pause();
                    break;
                case "5":
                    Menu.cls();
                    ControladorSubMenu_1.controlador1_5();
                    Menu.pause();
                    break;
                case "6":
                    Menu.cls();
                    ControladorSubMenu_1.controlador1_6();
                    Menu.pause();
                    break;
                case "7":
                    Menu.cls();
                    ControladorSubMenu_1.controlador1_7();
                    Menu.pause();
                    break;
                case "8":
                    Menu.cls();
                    ControladorSubMenu_1.controlador1_8();
                    Menu.pause();
                    break;
                case "9":
                    Menu.cls();
                    ControladorSubMenu_1.controlador1_9();
                    Menu.pause();
                    break;
                case "0":
                    Menu.cls();
                    bandera = true;
            }
        } while (bandera != true);

    }
}
