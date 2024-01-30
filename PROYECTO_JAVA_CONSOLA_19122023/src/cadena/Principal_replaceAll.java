package cadena;

public class Principal_replaceAll {

    public static void main(String[] args) {
        {
            System.out.println("EJEMPLO REPLACEALL 01");
            System.out.println("=====================");
            String cadena = "Hola Mundo";
            String er = "o";
            String cadenaResultado1 = cadena.replaceAll(er, "x");
            System.out.println("Cadena         : " + cadena);
            System.out.println("Cadena Resulado: " + cadenaResultado1);
        }

        {
            System.out.println("EJEMPLO REPLACEALL 02");
            System.out.println("=====================");
            String cadena = "Walter     Ismael          Sagástegui Lescano";
            String er = "\\s+";
            String cadenaResultado = cadena.replaceAll(er, " ");
            System.out.println("Cadena          : " + cadena);
            System.out.println("Cadena Resultado: " + cadenaResultado);
        }

        {
            System.out.println("EJEMPLO REPLACEALL 03");
            System.out.println("=====================");
            String cadena = "https://www.ejemplo.com/página?query=valor#fragmento";
            String cadenaResultado = cadena.replaceAll("[^a-zA-Z0-9á]", "");
            System.out.println("Cadena          : " + cadena);
            System.out.println("Cadena Resultado: " + cadenaResultado);
        }
    }

}
