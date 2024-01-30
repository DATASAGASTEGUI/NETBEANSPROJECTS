package poo_clases.triangulo;

public class PrincipalPoo1 {

    public static void main(String[] args) {
        System.out.println("EJEMPLO 01");
        System.out.println("==========");
        {
            int base = 5;
            int altura = 7;
            Triangulo triangulo = new Triangulo(base, altura);
            System.out.println(triangulo);
        }

        System.out.println("EJEMPLO 02");
        System.out.println("==========");
        {
            int base = 5;
            int altura = 7;
            Triangulo triangulo = new Triangulo(base, altura);
            Triangulo.cabecera();
            triangulo.cuerpo(1);
        }

        System.out.println("EJEMPLO 03");
        System.out.println("==========");
        {
            int base = 5;
            int altura = 7;
            Triangulo triangulo = new Triangulo();
            triangulo.setBase(base);
            triangulo.setAltura(altura);
            Triangulo.cabecera();
            triangulo.cuerpo(1);
        }
    }

}
