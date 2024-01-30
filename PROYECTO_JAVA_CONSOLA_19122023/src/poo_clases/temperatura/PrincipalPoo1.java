package poo_clases.temperatura;

public class PrincipalPoo1 {

    public static void main(String[] args) {
        System.out.println("EJEMPLO 01");
        System.out.println("==========");
        {
            double temperaturaEntrada = 5;
            String opcion = "FC";
            Temperatura temperatura = new Temperatura(temperaturaEntrada, opcion);
            System.out.println(temperatura);
        }

        System.out.println("EJEMPLO 02");
        System.out.println("==========");
        {
            double temperaturaEntrada = 5;
            String opcion = "FC";
            Temperatura temperatura = new Temperatura(temperaturaEntrada, opcion);
            Temperatura.cabecera();
            temperatura.cuerpo(1);
        }

        System.out.println("EJEMPLO 03");
        System.out.println("==========");
        {
            double temperaturaEntrada = 5;
            String opcion = "FC";
            Temperatura temperatura = new Temperatura();
            temperatura.setTemperaturaEntrada(temperaturaEntrada);
            temperatura.setOpcion(opcion);
            Temperatura.cabecera();
            temperatura.cuerpo(1);
        }
    }

}
