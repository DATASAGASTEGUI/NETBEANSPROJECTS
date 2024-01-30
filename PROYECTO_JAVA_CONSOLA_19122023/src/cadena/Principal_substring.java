package cadena;

public class Principal_substring {

    public static void main(String[] args) {
        {
            System.out.println("EJEMPLO SUBSTRING 01");
            System.out.println("====================");
            String cadena = "A1;Luis;32;1.72;true";
            String cadenaResultado1 = cadena.substring(8); //A partir de la posición 8 todo hasta el final de la cadena
            System.out.println("Cadena            : " + cadena);
            System.out.println("Cadena Resultado 1: " + cadenaResultado1);
            String cadenaResutado2 = cadena.substring(11, 15); //A partir de la posición 11 recupero 4 caracteres que da como resultado 1.72
            System.out.println("Cadena            : " + cadena);
            System.out.println("Cadena Resultado 2: " + cadenaResutado2);
        }
    }

}
