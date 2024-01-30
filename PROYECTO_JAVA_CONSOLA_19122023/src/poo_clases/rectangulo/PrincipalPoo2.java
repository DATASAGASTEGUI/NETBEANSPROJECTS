package poo_clases.rectangulo;

public class PrincipalPoo2 {

    public static void main(String[] args) {

        System.out.println("FORMA 1");
        System.out.println("-------");
        {
            Rectangulo.cabecera();
            for (int i = 0; i < 100; i++) {
                int x1 = Util.x1();
                int x2 = Util.x2();
                int y1 = Util.y1();
                int y2 = Util.y2();
                Punto p1 = new Punto(x1, y1);
                Punto p2 = new Punto(x2, y1);
                Punto p3 = new Punto(x2, y2);
                Punto p4 = new Punto(x1, y2);
                Rectangulo rectangulo = new Rectangulo(p1, p2, p3, p4);
                rectangulo.cuerpo((i + 1));
            }
        }

        System.out.println("FORMA 2");
        System.out.println("-------");
        {
            Rectangulo.cabecera();
            for (int i = 0; i < 100; i++) {
                int base = Util.longitud();
                int altura = Util.longitud();
                Rectangulo rectangulo = new Rectangulo(base, altura);
                rectangulo.cuerpo((i + 1));
            }
        }

    }
}
