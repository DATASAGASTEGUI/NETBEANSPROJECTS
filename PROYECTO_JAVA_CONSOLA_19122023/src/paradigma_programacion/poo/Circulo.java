package paradigma_programacion.poo;

public class Circulo {
    //(1) VARIABLES DE INSTANCIA
    //ENTRADA
    private int radio;
    //SALIDA (CALCULO)
    private double area;
    private double perimetro;

    //(2) CONSTRUCTORES (ENTRADA)
    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    //(3) METODOS SET Y GET (ENTRADA)
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    //(4) METODOS CALCULO (SALIDA)
    public double area() {
        this.area = Math.PI * Math.pow(this.radio, 2);
        return this.area;
    }

    public double perimetro() {
        this.perimetro = 2 * Math.PI * this.radio;
        return this.perimetro;
    }

    //(5) METODOS MOSTRAR (ENTRADA - SALIDA)
    public static void cabecera() { //Método de clase
        System.out.printf("%6s %10s %10s\n", "RADIO", "AREA", "PERIMETRO");
        System.out.printf("%6s %10s %10s\n", "-----", "----", "---------");
    }

    //METODO DE OBJETO O INSTANCIA
    public void cuerpo() { //Método de instancia o de objeto
        System.out.printf("%6d %10.2f %10.2f\n", this.radio, area(), perimetro());
    }
}
