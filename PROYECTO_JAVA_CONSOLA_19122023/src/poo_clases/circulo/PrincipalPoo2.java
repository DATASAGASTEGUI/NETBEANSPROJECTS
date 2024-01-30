package poo_clases.circulo;

public class PrincipalPoo2 {

    public static void main(String[] args) {
        Circulo.cabecera();
        for (int i = 0; i < 100; i++) {
            Circulo circulo = new Circulo(Util.dado());
            circulo.cuerpo((i+1));
        }
    }
}
