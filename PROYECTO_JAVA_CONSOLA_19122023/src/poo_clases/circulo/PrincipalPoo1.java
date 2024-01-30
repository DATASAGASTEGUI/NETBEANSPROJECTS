package poo_clases.circulo;

public class PrincipalPoo1 {

    public static void main(String[] args) {
        System.out.println("EJEMPLO 01");
        System.out.println("==========");
        {
            int radio = 5;
            Circulo circulo = new Circulo(radio);
            System.out.println(circulo);
        }

        System.out.println("EJEMPLO 02");
        System.out.println("==========");
        {
            int radio = 5;
            Circulo circulo = new Circulo(radio);
            Circulo.cabecera();
            circulo.cuerpo(1);
        }

        System.out.println("EJEMPLO 03");
        System.out.println("==========");
        {
            int radio = 5;
            Circulo circulo = new Circulo();
            circulo.setRadio(radio);
            Circulo.cabecera();
            circulo.cuerpo(1);
        }
    }
}
