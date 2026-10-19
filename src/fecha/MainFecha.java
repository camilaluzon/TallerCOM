package fecha;

import java.util.Scanner;

public class MainFecha {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        int mes = 0;
        int dia = 0;
        int anio = 0;

        System.out.print("Ingrese el mes: ");
        mes = entrada.nextInt();

        System.out.print("Ingrese el dia: ");
        dia = entrada.nextInt();

        System.out.print("Ingrese el anio: ");
        anio = entrada.nextInt();

        Fecha fecha = new Fecha(mes, dia, anio);

        fecha.mostrarFecha();

        entrada.close();
    }
}
