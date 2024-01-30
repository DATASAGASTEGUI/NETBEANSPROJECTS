package poo_clases.rectangulo;

public class PrincipalPoo1 {

    public static void main(String[] args) {
        // Crear un rectángulo a partir de cuatro vértices
        Rectangulo rectangulo1 = new Rectangulo(new Punto(1, 2),
                new Punto(4, 2),
                new Punto(4, 5),
                new Punto(1, 5));

        // Imprimir la superficie del primer rectángulo
        System.out.println("Superficie del rectángulo 1: " + rectangulo1.superficie());

        // Crear un rectángulo a partir de base y altura
        Rectangulo rectangulo2 = new Rectangulo(3, 4);

        // Imprimir la superficie del segundo rectángulo
        System.out.println("Superficie del rectángulo 2: " + rectangulo2.superficie());

        // Desplazar el segundo rectángulo
        rectangulo2.desplazar(2, 3);

        // Imprimir la nueva superficie del segundo rectángulo
        System.out.println("Superficie del rectángulo 2 después de desplazar: " + rectangulo2.superficie());

    }

}
