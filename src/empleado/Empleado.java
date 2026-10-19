package empleado;

public class Empleado {

    private String nombre;
    private String apellido;
    private double salarioMensual;

    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        setSalarioMensual(salarioMensual);
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }


    public double calcularSalarioAnual() {
        return getSalarioMensual() * 12;
    }

    public void aumentarSalario() {
        setSalarioMensual(getSalarioMensual() * 1.10);
    }

    public void mostrarEmpleado() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Salario mensual: $" + getSalarioMensual());
        System.out.println("Salario anual: $" + calcularSalarioAnual());
    }


}
