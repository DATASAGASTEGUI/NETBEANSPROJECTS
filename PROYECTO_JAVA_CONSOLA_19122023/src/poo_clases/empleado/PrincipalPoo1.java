package poo_clases.empleado;

public class PrincipalPoo1 {

    public static void main(String[] args) {
        System.out.println("EJEMPLO 01");
        System.out.println("==========");
        {
            String nombre = "Carmen";
            int horasTrabajadas = 23;
            Empleado empleado = new Empleado(nombre, horasTrabajadas);
            System.out.println(empleado);
        }

        System.out.println("EJEMPLO 02");
        System.out.println("==========");
        {
            String nombre = "Carmen";
            int horasTrabajadas = 23;
            Empleado empleado = new Empleado(nombre, horasTrabajadas);
            Empleado.cabecera();
            empleado.cuerpo(1);
        }

        System.out.println("EJEMPLO 03");
        System.out.println("==========");
        {
            String nombre = "Carmen";
            int horasTrabajadas = 23;
            Empleado empleado = new Empleado();
            empleado.setNombre(nombre);
            empleado.setHorasTrabajadas(horasTrabajadas);
            Empleado.cabecera();
            empleado.cuerpo(1);
        }
    }

}
