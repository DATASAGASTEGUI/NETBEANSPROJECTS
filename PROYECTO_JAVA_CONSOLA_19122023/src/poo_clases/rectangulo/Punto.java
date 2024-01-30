package poo_clases.rectangulo;

class Punto { // Clase interna para representar un punto en el plano

    //(1)VARIABLES DE INSTANCIA
    //ENTRADA
    private int x, y;
    //SALIDA
    private double distancia;

    //(2)CONSTRUCTORES
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //(3)METODOS SET Y GET (ENTRADA)
    //(4)METODOS CALCULO (SALIDA)
    public void desplazar(int deltaX, int deltaY) { // Método para desplazar el punto en el plano
        this.x += deltaX;
        this.y += deltaY;
    }

    public double distancia(Punto otroPunto) { // Método para calcular la distancia entre dos puntos
        int deltaX = this.x - otroPunto.x;
        int deltaY = this.y - otroPunto.y;
        this.distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return Util.redondear(this.distancia);
    }

    //(5)METODOS MOSTRAR VARIABLES DE INSTANCIA DE LA CLASE
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
