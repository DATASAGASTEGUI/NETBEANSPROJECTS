package poo_clases.rectangulo1;

public class PrincipalPoo2 {

    public static void main(String[] args) {
        Rectangulo.cabecera();
        for (int i = 0; i < 100; i++) {
            Rectangulo rectangulo = new Rectangulo(Util.numeroDoubleAleatorio(), Util.numeroDoubleAleatorio());
            rectangulo.cuerpo((i + 1));
        }
    }

}
