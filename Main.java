public class Main {
    public static void main(String[] args){
        Empleado e1 = new Empleado(1, "Juan Pérez", "Desarrollador", 50000);
        Empleado e2 = new Empleado(2, "Ana Gómez", "Gerente", 70000);
        Empleado e3 = new Empleado("Luis Martínez", "Analista");
        Empleado e4 = new Empleado("Carlos López", "Director");
        e1.actualizarSalario(10);
        e2.actualizarSalario(5000.0, true);
        e3.actualizarSalario(15);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        Empleado.mostrarTotalEmpleados();
    }
}