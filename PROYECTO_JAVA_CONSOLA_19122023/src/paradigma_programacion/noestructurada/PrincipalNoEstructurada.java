package paradigma_programacion.noestructurada;

public class PrincipalNoEstructurada {

    public static void main(String[] args) {
        // DEFINIR TIPOS DATOS
        int radio; //Variable de entrada
        double area, perimetro;//Variable de salida
        // ENTRADA
        radio = (int) (Math.random() * 6 + 1);//[1,6]
        // PROCESO
        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;
        // SALIDA
        System.out.printf("%6s %5s %10s\n", "RADIO", "AREA", "PERIMETRO"); //Cabecera
        System.out.printf("%6s %5s %10s\n", "-----", "----", "---------");

        System.out.printf("%6d %5.2f %10.2f", radio, area, perimetro); //Cuerpo
    } //CERRAR MAIN
} // CERRAR CLASE
