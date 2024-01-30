package poo_clases.nif;

public class PrincipalPoo2 {

    public static void main(String[] args) {
        Nif.cabecera();
        for (int i = 0; i < 20; i++) {
            Nif nif = new Nif((int) (Math.random() * 90000000 + 10000000));
            nif.cuerpo((i + 1));
        }
    }

}
