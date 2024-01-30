package poo_clases.operacion_aritmetica;

public class PrincipalPoo2 { // ABRIR CLASE

    public static void main(String[] args) {
        OperacionAritmetica.cabecera();
        for (int i = 0; i < 100; i++) {
            OperacionAritmetica oa = new OperacionAritmetica(Util.numeroAleatorio(), Util.numeroAleatorio(), Util.operacionAleatoria());
            oa.cuerpo((i + 1));
        }
    }

} // CERRAR CLASE
