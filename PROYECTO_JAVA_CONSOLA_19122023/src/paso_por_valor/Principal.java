package paso_por_valor;

public class Principal {

    public static void main(String[] args) {
       
        int x = 10;
        System.out.println("Valor 1: " + x);
        modificarValor(x);
        System.out.println("Valor 3: " + x);
        
    }
    
    public static void modificarValor(int x) {
        x = x + 1;
        System.out.println("Valor 2: " + x);
    }

}
