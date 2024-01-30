package archivo_csv_02.model;

public class Transaccion {

    private int idTransaccion;
    private String ciudad;
    private String zona;
    private double ventas;
    private String formaPago;
    private String categoria;

    public Transaccion() {
    }

    public Transaccion(int idTransaccion, String ciudad, String zona, double ventas, String formaPago, String categoria) {
        this.idTransaccion = idTransaccion;
        this.ciudad = ciudad;
        this.zona = zona;
        this.ventas = ventas;
        this.formaPago = formaPago;
        this.categoria = categoria;
    }

    public Transaccion(String registroCsv) {
        String[] parte = registroCsv.split(";");
        this.idTransaccion = Integer.parseInt(parte[0]);
        this.ciudad = parte[1];
        this.zona = parte[2];
        this.ventas = Double.parseDouble(parte[3]);
        this.formaPago = parte[4];
        this.categoria = parte[5];
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "idTransaccion=" + idTransaccion + ", ciudad=" + ciudad + ", zona=" + zona + ", ventas=" + ventas + ", formaPago=" + formaPago + ", categoria=" + categoria + '}';
    }

    public static void cabecer() {
        System.out.printf("%13s %-10s %-10s %8s   %-10s %-10s\n", "IDTRANSACCION", "CIUDAD", "ZONA", "VENTAS", "FORMA PAGO", "CATEGORIA");
        System.out.printf("%13s %-10s %-10s %8s   %-10s %-10s\n", "-------------", "------", "----", "------", "----------", "---------");
    }

    public void cuerpo() {
        System.out.printf("%13d %-10s %-10s %8.2f   %-10s %-10s\n", this.idTransaccion, this.ciudad, this.zona, this.ventas, this.formaPago, this.categoria);
    }

}
