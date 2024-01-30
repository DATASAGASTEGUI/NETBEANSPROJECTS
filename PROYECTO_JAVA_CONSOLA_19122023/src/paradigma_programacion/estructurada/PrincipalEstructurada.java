package paradigma_programacion.estructurada;

public class PrincipalEstructurada {

    public static void main(String[] args) {
        // DEFINIR TIPOS DATOS
        int radio; //Variable de entrada
        double area, perimetro;//Variable de salida
        // ENTRADA
        radio = (int) (Math.random() * 6 + 1);//[1,6]
        // PROCESO
        area = area(radio);
        perimetro = perimetro(radio);
        // SALIDA
        cabecera();
        cuerpo(radio,area,perimetro);
    }

    public static double area(int radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double perimetro(int radio) {
        return 2 * Math.PI * radio;
    }

    public static void cabecera() {
        System.out.printf("%6s %5s %10s\n", "RADIO", "AREA", "PERIMETRO");
        System.out.printf("%6s %5s %10s\n", "-----", "----", "---------");
    }
    
    public static void cuerpo(int radio,double area,double perimetro) {
      System.out.printf("%6d %5.2f %10.2f", radio, area, perimetro);
    }
    
}


