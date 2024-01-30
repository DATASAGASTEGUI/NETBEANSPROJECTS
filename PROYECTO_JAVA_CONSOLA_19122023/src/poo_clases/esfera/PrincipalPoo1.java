package poo_clases.esfera;

public class PrincipalPoo1 {

    public static void main(String[] args) {
        System.out.println("EJEMPLO 01");
        System.out.println("==========");
        {
            int radio = 5;
            Esfera esfera = new Esfera(radio);
            System.out.println(esfera);
        }

        System.out.println("EJEMPLO 02");
        System.out.println("==========");
        {
            int radio = 5;
            Esfera esfera = new Esfera(radio);
            Esfera.cabecera();
            esfera.cuerpo(1);
        }

        System.out.println("EJEMPLO 03");
        System.out.println("==========");
        {
            int radio = 5;
            Esfera esfera = new Esfera();
            esfera.setRadio(radio);
            Esfera.cabecera();
            esfera.cuerpo(1);
        }
    }

}
