package empleado;

import javax.swing.JOptionPane;

public class MainEmpleado {
    static void main() {
        String nombre = new String();
        String apellido = new String();
        double salario = 0.0;

        // Muestra una ventana emergente para solicitar el nombre del empleado.
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del primer empleado:");

        while (nombre == null || nombre.trim().isEmpty()) {
            nombre = JOptionPane.showInputDialog("El nombre no puede estar vacio. Ingrese nuevamente:");
        }

        apellido = JOptionPane.showInputDialog("Ingrese el apellido del primer empleado:");

        while (apellido == null || apellido.trim().isEmpty()) {
            apellido = JOptionPane.showInputDialog("El apellido no puede estar vacio. Ingrese nuevamente:");
        }

        // Convierte el texto ingresado en la ventana a un número decimal.
        salario = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el salario mensual del primer empleado:")
        );

        while (salario <= 0) {
            salario = Double.parseDouble(
                    JOptionPane.showInputDialog("El salario debe ser positivo. Ingrese nuevamente:")
            );
        }

        Empleado empleado1 = new Empleado(nombre, apellido, salario);

        nombre = JOptionPane.showInputDialog("Ingrese el nombre del segundo empleado:");

        while (nombre == null || nombre.trim().isEmpty()) {
            nombre = JOptionPane.showInputDialog("El nombre no puede estar vacio. Ingrese nuevamente:");
        }

        apellido = JOptionPane.showInputDialog("Ingrese el apellido del segundo empleado:");

        while (apellido == null || apellido.trim().isEmpty()) {
            apellido = JOptionPane.showInputDialog("El apellido no puede estar vacio. Ingrese nuevamente:");
        }

        salario = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el salario mensual del segundo empleado:")
        );

        while (salario <= 0) {
            salario = Double.parseDouble(
                    JOptionPane.showInputDialog("El salario debe ser positivo. Ingrese nuevamente:")
            );
        }

        Empleado empleado2 = new Empleado(nombre, apellido, salario);

        String resultado = "SALARIOS ANUALES INICIALES\n";

        resultado += empleado1.getNombre() + " " + empleado1.getApellido() + ": $" + empleado1.calcularSalarioAnual() + "\n";

        resultado += empleado2.getNombre() + " " + empleado2.getApellido() + ": $" + empleado2.calcularSalarioAnual() + "\n";

        empleado1.aumentarSalario();
        empleado2.aumentarSalario();

        resultado += "SALARIOS ANUALES CON AUMENTO DEL 10% \n";

        resultado += empleado1.getNombre() + " " + empleado1.getApellido() + ": $" + empleado1.calcularSalarioAnual() + "\n";

        resultado += empleado2.getNombre() + " " + empleado2.getApellido() + ": $" + empleado2.calcularSalarioAnual() +  "\n";

        // Presenta los resultados finales en una ventana emergente.
        JOptionPane.showMessageDialog(null, resultado);

    }
}
