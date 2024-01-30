package poo_clases.rectangulo;

public class Rectangulo { // ABRIR CLASE

    //(1)VARIABLES DE INSTANCIA
    //ENTRADA
    private Punto p1, p2, p3, p4; // Definición de los puntos (vértices) del rectángulo
    private double base;
    private double altura;
    //SALIDA (CALCULO)
    private double superficie;

    //(2) CONSTRUCTORES
    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) { // Constructor para crear un rectángulo a partir de cuatro vértices
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Rectangulo(int base, int altura) { // Constructor para crear un rectángulo a partir de base y altura
        this.p1 = new Punto(0, 0); // El vértice inferior izquierdo está en (0,0)
        this.p2 = new Punto(base, 0);
        this.p3 = new Punto(base, altura);
        this.p4 = new Punto(0, altura);
    }

    //(3)METODOS CALCULO (SALIDA)
    public double superficie() { // Método para calcular la superficie del rectángulo
        double base = p3.distancia(p4); // Calcular la base
        double altura = p2.distancia(p3); // Calcular la altura
        this.superficie = base * altura; // Calcular y devolver la superficie
        return this.superficie;
    }

    public void desplazar(int deltaX, int deltaY) { // Método para desplazar el rectángulo en el plano
        // Desplazar cada vértice por separado
        p1.desplazar(deltaX, deltaY);
        p2.desplazar(deltaX, deltaY);
        p3.desplazar(deltaX, deltaY);
        p4.desplazar(deltaX, deltaY);
    }

    //(5)METODOS MOSTRAR VARIABLES DE INSTANCIA DE LA CLASE
    public static void cabecera() { // Método de clase
        System.out.printf("%4s %10s %10s %10s %10s %12s\n", "N", "P1", "P2", "P3", "P4", "SUPERFICIE");
        System.out.printf("%4s %10s %10s %10s %10s %12s\n", "-", "--", "--", "--", "--", "----------");
    }

    public void cuerpo(int i) { // Método de instancia
        double x = superficie();
        System.out.printf("%4d %10s %10s %10s %10s %12.2f\n", i, this.p1, this.p2, this.p3, this.p4, this.superficie);
    }

} // CERRAR CLASE

