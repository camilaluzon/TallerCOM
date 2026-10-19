package frecuencia;

import javax.swing.JOptionPane;

public class MainFrecuenciaCardiaca {
    static void main() {
        String nombre = new String();
        String apellido = new String();

        int mes = 0;
        int dia = 0;
        int anio = 0;
        int anioActual = 0;

        nombre = JOptionPane.showInputDialog("Ingrese el nombre:");

        while (nombre == null || nombre.trim().isEmpty()) {
            nombre = JOptionPane.showInputDialog(
                    "El nombre no puede estar vacio. Ingrese nuevamente:"
            );
        }

        apellido = JOptionPane.showInputDialog("Ingrese el apellido:");

        while (apellido == null || apellido.trim().isEmpty()) {
            apellido = JOptionPane.showInputDialog(
                    "El apellido no puede estar vacio. Ingrese nuevamente:"
            );
        }

        mes = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el mes de nacimiento:")
        );

        while (mes < 1 || mes > 12) {
            mes = Integer.parseInt(
                    JOptionPane.showInputDialog("Mes invalido. Ingrese un mes entre 1 y 12:")
            );
        }

        dia = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el dia de nacimiento:")
        );

        while (dia < 1 || dia > 31) {
            dia = Integer.parseInt(
                    JOptionPane.showInputDialog("Dia invalido. Ingrese un dia entre 1 y 31:")
            );
        }

        anio = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el anio de nacimiento:")
        );

        while (anio <= 0 || anio > 2026) {
            anio = Integer.parseInt(
                    JOptionPane.showInputDialog("Anio invalido. Ingrese un anio valido:")
            );
        }

        FrecuenciaCardiaca persona = new FrecuenciaCardiaca(nombre, apellido, mes, dia, anio);

        persona.mostrarFrecuencias();
    }
}
