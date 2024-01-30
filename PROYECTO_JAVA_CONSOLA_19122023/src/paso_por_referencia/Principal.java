package paso_por_referencia;

public class Principal {

    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Luis");
        System.out.println("Objeto 1: " + p);
        modificarObjeto(p);
        System.out.println("Objeto 3: " + p);
    }

    public static void modificarObjeto(Persona p) {
        p.setNombre("Miguel");
        System.out.println("Objeto 2: " + p);
    }

}

class Persona {

    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }

}
