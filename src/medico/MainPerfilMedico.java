package medico;

import java.util.Scanner;

public class MainPerfilMedico {
    static void main() {

        Scanner entrada = new Scanner(System.in);

        String nombre = new String();
        String apellido = new String();
        String sexo = new String();

        int dia = 0;
        int mes = 0;
        int anio = 0;
        int diaActual = 18;
        int mesActual = 10;
        int anioActual = 2026;

        double altura = 0.0;
        double peso = 0.0;

        System.out.print("Ingrese el nombre: ");
        nombre = entrada.nextLine();

        while (nombre.trim().isEmpty()) {
            System.out.print("El nombre no puede estar vacio. Ingrese nuevamente: ");
            nombre = entrada.nextLine();
        }

        System.out.print("Ingrese el apellido: ");
        apellido = entrada.nextLine();

        while (apellido.trim().isEmpty()) {
            System.out.print("El apellido no puede estar vacio. Ingrese nuevamente: ");
            apellido = entrada.nextLine();
        }

        System.out.print("Ingrese el sexo: ");
        sexo = entrada.nextLine();

        while (sexo.trim().isEmpty()) {
            System.out.print("El sexo no puede estar vacio. Ingrese nuevamente: ");
            sexo = entrada.nextLine();
        }

        System.out.print("Ingrese el dia de nacimiento: ");
        dia = entrada.nextInt();

        while (dia < 1 || dia > 31) {
            System.out.print("Dia invalido. Ingrese un dia entre 1 y 31: ");
            dia = entrada.nextInt();
        }

        System.out.print("Ingrese el mes de nacimiento: ");
        mes = entrada.nextInt();

        while (mes < 1 || mes > 12) {
            System.out.print("Mes invalido. Ingrese un mes entre 1 y 12: ");
            mes = entrada.nextInt();
        }

        System.out.print("Ingrese el anio de nacimiento: ");
        anio = entrada.nextInt();

        while (anio <= 0 || anio > anioActual) {
            System.out.print("Anio invalido. Ingrese nuevamente: ");
            anio = entrada.nextInt();
        }

        System.out.print("Ingrese la altura en centimetros: ");
        altura = entrada.nextDouble();

        while (altura <= 0) {
            System.out.print("Altura invalida. Ingrese una altura positiva: ");
            altura = entrada.nextDouble();
        }

        System.out.print("Ingrese el peso en kilogramos: ");
        peso = entrada.nextDouble();

        while (peso <= 0) {
            System.out.print("Peso invalido. Ingrese un peso positivo: ");
            peso = entrada.nextDouble();
        }

        // Crea el perfil médico con los datos personales y físicos ingresados.
        PerfilMedico persona = new PerfilMedico(
                nombre, apellido, sexo, dia, mes, anio, altura, peso
        );

        // Muestra el perfil médico y los cálculos realizados.
        persona.mostrarPerfilMedico(diaActual, mesActual, anioActual);

        entrada.close();
    }
}
