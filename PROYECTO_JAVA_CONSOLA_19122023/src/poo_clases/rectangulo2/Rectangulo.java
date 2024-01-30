package poo_clases.rectangulo2;

public class Rectangulo {

    //(1)VARIABLES DE INSTANCIA
    //ENTRADA
    private Punto p1, p2, p3, p4; // Definición de los puntos (vértices) del rectángulo
    //SALIDA (CALCULO)
    private double superficie;
    private double base;
    private double altura;

    //(2) CONSTRUCTORES
    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) { // Constructor para crear un rectángulo a partir de cuatro vértices
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    //(3)METODOS CALCULO (SALIDA)
    public double superficie() { // Método para calcular la superficie del rectángulo
        this.base = p3.distancia(p4); // Calcular la base
        this.altura = p2.distancia(p3); // Calcular la altura
        this.superficie = base * altura; // Calcular y devolver la superficie
        return Util.redondear(this.superficie);
    }

    //(5)METODOS MOSTRAR VARIABLES DE INSTANCIA DE LA CLASE
    public static void cabecera() { // Método de clase
        System.out.printf("%4s %10s %10s %10s %10s %10s %10s %12s\n", "N", "P1", "P2", "P3", "P4", "BASE", "ALTURA", "SUPERFICIE");
        System.out.printf("%4s %10s %10s %10s %10s %10s %10s %12s\n", "-", "--", "--", "--", "--", "----", "------", "----------");
    }

    public void cuerpo(int i) { // Método de instancia
        double x = superficie();
        System.out.printf("%4d %10s %10s %10s %10s %10.2f %10.2f %12.2f\n", i, this.p1, this.p2,this.p3,this.p4, this.base, this.altura, this.superficie);
    }
}

class Punto {

    //(1)VARIABLES DE INSTANCIA
    //ENTRADA
    private int x, y;
    //SALIDA (CALCULO)
    private double distancia;

    //(2)CONSTRUCTORES
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //(3)METODOS SET Y GET (ENTRADA)

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //(4)METODOS CALCULO (SALIDA)
    public double distancia(Punto otroPunto) { // Método para calcular la distancia entre dos puntos
        double deltaX = this.x - otroPunto.x;
        double deltaY = this.y - otroPunto.y;
        this.distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return Util.redondear(this.distancia);
    }

    //(5)METODOS MOSTRAR VARIABLES DE INSTANCIA DE LA CLASE
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
