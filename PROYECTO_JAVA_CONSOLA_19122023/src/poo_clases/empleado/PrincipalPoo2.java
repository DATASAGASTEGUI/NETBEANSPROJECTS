package poo_clases.empleado;

public class PrincipalPoo2 {

    public static void main(String[] args) {
        String[] nombre = {"Miguel","Carmen","Silvia","Lurdes","Arturo","Lucho","Vanessa","Melissa"};
        Empleado.cabecera();
        for (int i = 0; i < nombre.length; i++) {
            Empleado empleado = new Empleado(nombre[i],(int)(Math.random()*81+20));//[20,100]
            empleado.cuerpo((i + 1));
        }
    }

}
