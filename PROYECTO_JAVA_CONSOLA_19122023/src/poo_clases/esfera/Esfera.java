package poo_clases.esfera;

public class Esfera { // ABRIR CLASE

    //(1) VARIABLES DE INSTANCIA
    //ENTRADA
    private double radio;

    //SALIDA (CALCULO)
    private double area;
    private double volumen;

    //(2) CONSTRUCTORES
    public Esfera(double radio) {
        this.radio = radio;
    }

    public Esfera() {
    }

    //(3) METODOS SET Y GET (ENTRADA)
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //(4) METODOS CALCULO (SALIDA)
    public double area() {
        this.area = 4 * Math.PI * Math.pow(radio, 2);
        return Util.redondear(this.area);
    }

    public double volumen() {
        this.volumen = 4 * Math.PI * Math.pow(radio, 3) / 3.0;
        return Util.redondear(this.volumen);
    }

    //(5) METODOS MOSTRAR VARIABLES DE INSTANCIA DE LA CLASE
    public static void cabecera() { // Método de clase
        System.out.printf("%4s %10s %10s %10s\n", "N", "RADIO", "AREA", "VOLUMEN");
        System.out.printf("%4s %10s %10s %10s\n", "-", "-----", "----", "-------");
    }

    public void cuerpo(int i) { // Método de instancia
        System.out.printf("%4d %10.2f %10.2f %10.2f\n", i, this.radio, this.area(), this.volumen());
    }

    @Override
    public String toString() {
        return "Esfera{" + "radio=" + radio + ", area=" + area() + ", volumen=" + volumen() + '}';
    }

} // CERRAR CLASE
