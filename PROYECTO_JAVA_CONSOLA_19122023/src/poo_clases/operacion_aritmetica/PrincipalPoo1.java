package poo_clases.operacion_aritmetica;

public class PrincipalPoo1 {
    
    public static void main(String[] args) {
        System.out.println("EJEMPLO 01");
        System.out.println("==========");
        {
            double numero1 = Util.numeroAleatorio();
            double numero2 = Util.numeroAleatorio();
            String operacion = "SUMA";
            OperacionAritmetica oa = new OperacionAritmetica(numero1, numero2, operacion);
            System.out.println(oa);
        }
        
        System.out.println("EJEMPLO 02");
        System.out.println("==========");
        {
            double numero1 = Util.numeroAleatorio();
            double numero2 = Util.numeroAleatorio();
            String operacion = "SUMA";
            OperacionAritmetica oa = new OperacionAritmetica(numero1, numero2, operacion);
            OperacionAritmetica.cabecera();
            oa.cuerpo(1);
        }
        
        System.out.println("EJEMPLO 03");
        System.out.println("==========");
        {
            double numero1 = Util.numeroAleatorio();
            double numero2 = Util.numeroAleatorio();
            String operacion = "SUMA";
            OperacionAritmetica oa = new OperacionAritmetica();
            oa.setNumero1(numero1);
            oa.setNumero2(numero2);
            oa.setOperacion(operacion);
            OperacionAritmetica.cabecera();
            oa.cuerpo(1);
        }
    }
    
}
