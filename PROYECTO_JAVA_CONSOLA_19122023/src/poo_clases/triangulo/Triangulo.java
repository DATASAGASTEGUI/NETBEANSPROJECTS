package poo_clases.triangulo;

public class Triangulo { // ABRIR CLASE

    //(1) VARIABLES DE INSTANCIA
    //ENTRADA
    private int base;
    private int altura;

    //SALIDA (CALCULO)
    private double area;

    //(2) CONSTRUCTORES
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    //(3) METODOS SET Y GET (ENTRADA)
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //(4) METODOS CALCULO (SALIDA)
    public double area() {
        this.area = (this.base * this.altura) / 2.0;
        return this.area;
    }

    //(5) METODOS MOSTRAR VARIABLES DE INSTANCIA DE LA CLASE
    public static void cabecera() {
        System.out.printf("%4s  %6s  %-6s  %8s\n", "N", "BASE", "ALTURA", "AREA");
        System.out.printf("%4s  %6s  %-6s  %8s\n", "-", "----", "------", "----");
    }

    public void cuerpo(int i) {
        System.out.printf("%4d  %6d  %6d  %8.2f\n", i, this.base, this.altura, this.area());
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + this.base + ", altura=" + this.altura + ", area=" + this.area() + '}';
    }

}// CERRAR CLASE
