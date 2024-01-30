package ejemplo014;

public class Alumno {

    private String idAlumno;
    private String nombre;
    private String paterno;
    private String nacimiento;
    private char sexo;

    public Alumno() {
    }

    public Alumno(String idAlumno, String nombre, String paterno, String nacimiento, char sexo) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.paterno = paterno;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", paterno=" + paterno + ", fechaNacimiento=" + nacimiento + ", sexo=" + sexo + '}';
    }

    public String getRegistroCsv() {
        return this.idAlumno + ";"
                + this.nombre + ";"
                + this.paterno + ";"
                + this.nacimiento + ";"
                + this.sexo;
    }

}
