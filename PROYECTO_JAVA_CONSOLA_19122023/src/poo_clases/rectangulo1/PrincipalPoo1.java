package poo_clases.rectangulo1;

public class PrincipalPoo1 {

    public static void main(String[] args) {
        System.out.println("EJEMPLO 01");
        System.out.println("==========");
        {
            double largo = 5;
            double ancho = 3;
            Rectangulo rectangulo = new Rectangulo(largo, ancho);
            System.out.println(rectangulo);
        }

        System.out.println("EJEMPLO 02");
        System.out.println("==========");
        {
            double largo = 5;
            double ancho = 3;
            Rectangulo rectangulo = new Rectangulo(largo, ancho);
            Rectangulo.cabecera();
            rectangulo.cuerpo(1);
        }

        System.out.println("EJEMPLO 03");
        System.out.println("==========");
        {
            double largo = 5;
            double ancho = 3;
            Rectangulo rectangulo = new Rectangulo();
            rectangulo.setLargo(largo);
            rectangulo.setAncho(ancho);
            Rectangulo.cabecera();
            rectangulo.cuerpo(1);
        }
    }

}
