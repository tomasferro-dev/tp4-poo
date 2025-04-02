public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = (int) (Math.random() * 900000) + 100000;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100;
        totalEmpleados++;
    }

    public void actualizarSalario(double porcentaje){
        this.salario = this.salario*(1+porcentaje);
    }

    public void actualizarSalario(int monto) {
        this.salario+=monto;
    }

    @Override
    public String toString() {
        return "Empleado [ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario + "]";
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}