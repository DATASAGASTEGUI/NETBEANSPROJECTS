package poo_clases.nif;

public class PrincipalPoo1 {

    public static void main(String[] args) {
        System.out.println("EJEMPLO 01");
        System.out.println("==========");
        {
            int dni = 51019578;
            Nif nif = new Nif(dni);
            System.out.println(nif);
        }

        System.out.println("EJEMPLO 02");
        System.out.println("==========");
        {
            int dni = 51019578;
            Nif nif = new Nif(dni);
            Nif.cabecera();
            nif.cuerpo(1);
        }
        
        System.out.println("EJEMPLO 03");
        System.out.println("==========");
        {
            int dni = 51019578;
            Nif nif = new Nif();
            nif.setDni(dni);
            Nif.cabecera();
            nif.cuerpo(1);
        }        
    }

}
