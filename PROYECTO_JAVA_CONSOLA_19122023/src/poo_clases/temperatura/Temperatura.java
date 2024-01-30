package poo_clases.temperatura;

public class Temperatura {

    //(1) VARIABLES DE INSTANCIA
    //ENTRADA
    private double temperaturaEntrada;
    private String opcion;

    //SALIDA (CALCULO)
    private double temperaturaSalida;

    //(2) CONSTRUCTORES
    public Temperatura(double temperaturaEntrada, String opcion) {
        this.temperaturaEntrada = temperaturaEntrada;
        this.opcion = opcion;
    }

    public Temperatura() {
    }

    //(3) METODOS SET Y GET (ENTRADA)
    public double getTemperaturaEntrada() {
        return temperaturaEntrada;
    }

    public void setTemperaturaEntrada(double temperaturaEntrada) {
        this.temperaturaEntrada = temperaturaEntrada;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    //(4) METODOS CALCULO (SALIDA)
    public double temperaturaSalida() {
        switch (this.opcion) {
            case "FC":
                this.temperaturaSalida = 5 / 9.0 * (this.temperaturaEntrada - 32);    //CELSIUS
                break;
            case "CF":
                this.temperaturaSalida = 9 / 5.0 * this.temperaturaEntrada + 32;      //FAHRENHEIT
                break;
            default:
                System.out.println("ENTRADA INCORRECTA");
        }
        return this.temperaturaSalida;
    }

    //(5) METODOS MOSTRAR VARIABLES DE INSTANCIA DE LA CLASE
    public static void cabecera() { // Método de clase
        System.out.printf("%4s %20s %8s %20s\n", "N", "TEMPERATURA-ENTRADA", "OPCION", "TEMPERATURA-SALIDA");
        System.out.printf("%4s %20s %8s %20s\n", "-", "-------------------", "------", "------------------");
    }

    public void cuerpo(int i) { // Método de instancia
        System.out.printf("%4d %20.2f %8s %20.2f\n", i, this.temperaturaEntrada, this.opcion, this.temperaturaSalida());
    }

    @Override
    public String toString() { // Método de instancia
        return "Temperatura{" + "temperaturaEntrada=" + this.temperaturaEntrada + ", opcion=" + this.opcion + ", temperaturaSalida=" + this.temperaturaSalida() + '}';
    }

}
