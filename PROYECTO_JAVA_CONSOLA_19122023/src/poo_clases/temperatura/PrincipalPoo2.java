package poo_clases.temperatura;

public class PrincipalPoo2 {

    public static void main(String[] args) {
        Temperatura.cabecera();
        for (int i = 0; i < 100; i++) {
            Temperatura temperatura = new Temperatura(Util.numeroDoubleAleatorio(),Util.opcionAleatoria());
            temperatura.cuerpo((i + 1));
        }
    }

}
