package archivo_csv_02.principal;

import archivo_csv_02.archivocsv.ArchivoCsv;
import archivo_csv_02.controlador.Controlador;
import archivo_csv_02.model.Transaccion;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        List<Transaccion> transacciones_al = ArchivoCsv.obtenerListaObjetosTransaccion();
        Controlador c = new Controlador(transacciones_al);

        do {
            cls();
            System.out.println("MENU");
            System.out.println("====");
            System.out.println("(1) MOSTRAR TODOS LAS TRANSACCIONES EN PANTALLA");
            System.out.println("(2) MOSTRAR LAS VENTAS TOTALES POR CATEGORIA");
            System.out.println("(3) MOSTRAR LAS VENTAS TOTALES POR CIUDAD");
            System.out.println("(4) MOSTRAR LA CIUDAD CON LA MAYOR VENTA EN LA CATEGORIA INFORMATICA");
            System.out.println("(5) MOSTRAR LA FORMA DE PAGO QUE TUBO LA MAYOR VENTA");
            System.out.println("(6) MOSTRAR TODAS LAS CIUDADES DISTINTAS");
            System.out.println("(7) MOSTRAR LAS VENTAS TOTALES DE UNA CIUDAD DADA POR EL USUARIO");
            System.out.println("(0) SALIR");

            System.out.print("\nINGRESE OPCION? ");
            opcion = sc.next();

            switch (opcion) {
                case "1":
                    cls();
                    System.out.println("(1) MOSTRAR TODOS LAS TRANSACCIONES EN PANTALLA");
                    System.out.println("===============================================");
                    c.controlador01();
                    pause();
                    break;
                case "2":
                    cls();
                    System.out.println("(2) MOSTRAR LAS VENTAS TOTALES POR CATEGORIA");
                    System.out.println("============================================");
                    c.controlador02();
                    pause();
                    break;
                case "3":
                    cls();
                    System.out.println("(3) MOSTRAR LAS VENTAS TOTALES POR CIUDAD");
                    System.out.println("=========================================");
                    c.controlador03();
                    pause();
                    break;
                case "4":
                    cls();
                    System.out.println("(4) MOSTRAR LA CIUDAD CON LA MAYOR VENTA EN LA CATEGORIA INFORMATICA");
                    System.out.println("====================================================================");
                    c.controlador04();
                    pause();
                    break;
                case "5":
                    cls();
                    System.out.println("(5) MOSTRAR LA FORMA DE PAGO QUE TUBO LA MAYOR VENTA");
                    System.out.println("====================================================");
                    c.controlador05();
                    pause();
                    break;
                case "6":
                    cls();
                    System.out.println("(6) MOSTRAR TODAS LAS CIUDADES DISTINTAS");
                    System.out.println("========================================");
                    c.controlador06();
                    pause();
                    break;
                case "7":
                    cls();
                    System.out.println("(7) MOSTRAR LAS VENTAS TOTALES POR CATEGORIA DE UNA CIUDAD DADA POR EL USUARIO");
                    System.out.println("==============================================================================");
                    c.controlador07();
                    pause();
                    break;
                case "0":
                    cls();
                    System.out.println("GRACIAS POR SI VISITA");
                    pause();
                    System.exit(0);
                    break;
            }
        } while (true);

    } // FIN MAIN

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }

} // FIN CLASE
