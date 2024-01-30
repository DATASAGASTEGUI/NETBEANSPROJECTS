package poo_clases.triangulo;

public class PrincipalPoo2 { // ABRIR CLASE

    public static void main(String[] args) {
        Triangulo.cabecera();
        for (int i = 0; i < 100; i++) {
            Triangulo triangulo = new Triangulo((int) (Math.random() * 6 + 1), (int) (Math.random() * 6 + 1));
            triangulo.cuerpo((i + 1));
        }
    }

} // CERRAR CLASE
