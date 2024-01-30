package paradigma_programacion.poo;

public class PrincipalPoo2 {

    public static void main(String[] args) {
        int radio;
        Circulo.cabecera();//Método de clase
        for (int i = 0; i < 100; i++) {
            Circulo c = new Circulo();
            radio = (int) (Math.random() * 6 + 1);
            c.setRadio(radio);
            c.cuerpo();//Método de instancia o de objeto
        }
    } // CERRAR MAIN
} // CERRAR CLASE
