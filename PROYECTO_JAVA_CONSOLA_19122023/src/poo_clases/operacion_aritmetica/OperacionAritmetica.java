package poo_clases.operacion_aritmetica;

import poo_clases.circulo.Util;

public class OperacionAritmetica { // ABRIR CLASE

    //(1) VARIABLES DE INSTANCIA
    //ENTRADA
    private double numero1;
    private double numero2;
    private String operacion;

    //SALIDA (CALCULO)
    private double resultado;

    //(2) CONSTRUCTORES
    public OperacionAritmetica(double numero1, double numero2, String operacion) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacion = operacion;
    }

    public OperacionAritmetica() {
    }

    //(3) METODOS SET Y GET
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    //(4) METODOS CALCULO
    public double resultado() {

        switch (this.operacion) {
            case "SUMA":
                this.resultado = this.numero1 + this.numero2;
                break;
            case "RESTA":
                this.resultado = this.numero1 - this.numero2;
                break;
            case "MULTIPLICACION":
                this.resultado = this.numero1 * this.numero2;
                break;
            case "DIVISION":
                this.resultado = this.numero1 / this.numero2;
                break;
        }
        return Util.redondear(this.resultado);
    }

    //(5) METODOS MOSTRAR ATRIBUTOS
    public static void cabecera() { // Método de clase
        System.out.printf("%4s %10s %10s %15s %10s\n", "N", "NUMERO 1", "NUMERO 2", "OPERACION", "RESULTADO");
        System.out.printf("%4s %10s %10s %15s %10s\n", "-", "--------", "--------", "---------", "---------");
    }

    public void cuerpo(int i) { // Método de instancia
        System.out.printf("%4d %10.2f %10.2f %15s %10.2f\n", i, this.numero1, this.numero2, this.operacion, this.resultado());
    }

    @Override
    public String toString() {
        return "OperacionAritmetica{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", operacion=" + operacion + ", resultado=" + resultado() + '}';
    }

} // CERRAR CLASE
