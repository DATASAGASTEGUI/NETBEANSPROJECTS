package ejemplo004;

public class OperacionAritmetica {
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

    public static String cabecera() { // Método de clase
        return "<tr><th>N</th><th>NUMERO 1</th><th>NUMERO 2</th><th>OPERACION</th><th>RESULTADO</th></tr>";
    }

    public String cuerpo(int i) { // Método de instancia
        return "<tr><td>" + i + "</td><td>" + this.numero1 + "</td><td>" + this.numero2 + "</td><td>" + this.operacion + "</td><td>" + this.resultado() + "</td></tr>";
    }

}
