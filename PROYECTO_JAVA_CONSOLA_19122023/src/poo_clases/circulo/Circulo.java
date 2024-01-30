package poo_clases.circulo;

public class Circulo { // ABRIR CLASE
    //(1) VARIABLES DE INSTANCIA

    //ENTRADA
    private int radio;

    //SALIDA (CALCULO)
    private double area;
    private double perimetro;

    //(2) CONSTRUCTORES
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
        this.area = Util.redondear(Math.PI * Math.pow(this.radio, 2));
        return this.area;
    }

    public double perimetro() {
        this.perimetro = Util.redondear(2 * Math.PI * this.radio);
        return this.perimetro;
    }

    //(5) METODOS MOSTRAR VARIABLES DE INSTANCIA DE LA CLASE
    public static void cabecera() { // Método de clase
        System.out.printf("%4s %6s %10s %10s\n", "N", "RADIO", "AREA", "PERIMETRO");
        System.out.printf("%4s %6s %10s %10s\n", "-", "-----", "----", "---------");
    }

    public void cuerpo(int i) { // Método de instancia
        System.out.printf("%4d %6d %10.2f %10.2f\n", i, this.radio, this.area(), this.perimetro());
    }

    @Override
    public String toString() { // Método de instancia
        return "Circulo{" + "radio=" + radio + ", area=" + area() + ", perimetro=" + perimetro() + '}';
    }

} // CERRAR CLASE
