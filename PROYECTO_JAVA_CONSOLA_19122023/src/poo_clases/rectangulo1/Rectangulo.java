package poo_clases.rectangulo1;

public class Rectangulo { // ABRIR CLASE

    //(1)VARIABLES DE INSTANCIA
    //ENTRADA
    private double largo;
    private double ancho;
    //SALIDA
    private double area;

    //(2)CONSTRUCTORES
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public Rectangulo() {
    }

    //(3) METODOS SET Y GET (ENTRADA)
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //(4) METODOS CALCULO (SALIDA)
    public double area() {
        this.area = this.largo * this.ancho;
        return this.area;
    }

    //(5) METODOS MOSTRAR VARIABLES DE INSTANCIA DE LA CLASE
    public static void cabecera() { // Método de clase
        System.out.printf("%4s %8s %8s %8s\n", "N", "LARGO", "ANCHO", "AREA");
        System.out.printf("%4s %8s %8s %8s\n", "-", "-----", "-----", "----");
    }

    public void cuerpo(int i) { // Método de instancia
        System.out.printf("%4d %8.2f %8.2f %8.2f\n", i, this.largo, this.ancho, this.area());
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "largo=" + largo + ", ancho=" + ancho + ", area=" + area() + '}';
    }
    
    

} // CERRAR CLASE
