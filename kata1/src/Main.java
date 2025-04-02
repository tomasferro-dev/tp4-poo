public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(123456, "Tomas", "TIC", 800000);
        Empleado empleado2 = new Empleado("Erica", "Docente");

        empleado1.actualizarSalario(0.05);
        empleado2.actualizarSalario(800000);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        System.out.println(Empleado.mostrarTotalEmpleados());
    }
}

