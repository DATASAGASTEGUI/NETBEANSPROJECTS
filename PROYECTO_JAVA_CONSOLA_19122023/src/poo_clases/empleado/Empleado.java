package poo_clases.empleado;

public class Empleado { // ABRIR CLASE

    //(1) VARIABLES DE INSTANCIA
    //ENTRADA
    private String nombre;
    private int horasTrabajadas;

    //SALIDA (CALCULO)
    private double sueldo;

    //(2) CONSTRUCTORES
    public Empleado(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    //(3) METODOS SET Y GET
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    //(4) METODOS CALCULO
    public double sueldo() {
        this.sueldo = Util.SUELDOBASE + this.horasTrabajadas * Util.PRECIOXHORATRABAJADA;
        return this.sueldo;
    }

    //(5) METODOS MOSTRAR ATRIBUTOS
    public static void cabecera() { // Método de clase
        System.out.printf("%4s  %10s  %6s  %10s\n", "N", "NOMBRE", "HT", "SUELDO");
        System.out.printf("%4s  %10s  %6s  %10s\n", "-", "------", "--", "------");
    }

    public void cuerpo(int i) { // Método de instancia
        System.out.printf("%4d  %10s  %6d  %10.2f\n", i, this.nombre, this.horasTrabajadas, this.sueldo());
    }

    @Override
    public String toString() { // Método de instancia
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", sueldo=" + sueldo() + '}';
    }

}// CERRAR CLASE
