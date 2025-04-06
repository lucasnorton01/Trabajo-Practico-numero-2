public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;

}
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0;

    }
    public void actualizarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);

}
    public void actualizarSalario(double aumentoFijo, boolean esFijo) {
        if (esFijo) {
            salario += aumentoFijo;
}
    }
    public static void mostrarTotalEmpleados() {
        System.out.println("Total de empleados creados: " + totalEmpleados);
    }
    @Override
    public String toString() {
        return "Empleado ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
