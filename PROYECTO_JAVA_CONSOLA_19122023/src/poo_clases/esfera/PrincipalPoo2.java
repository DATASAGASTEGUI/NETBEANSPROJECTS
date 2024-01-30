package poo_clases.esfera;

public class PrincipalPoo2 {

    public static void main(String[] args) {
        Esfera.cabecera();
        for (int i = 0; i < 100; i++) {
            Esfera esfera = new Esfera(Util.numeroDoubleAleatorio());
            esfera.cuerpo((i + 1));
        }
    }

}
