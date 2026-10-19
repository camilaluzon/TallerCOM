package factura;

import java.util.Scanner;

public class PruebaFactura {
    static void main() {

        // Permite leer los datos ingresados por el usuario desde el teclado.
        Scanner entrada = new Scanner(System.in);

        String numeroPieza = new String();
        String descripcion = new String();
        int cantidad = 0;
        double precio = 0.0;

        System.out.print("Ingrese el numero de pieza: ");
        numeroPieza = entrada.nextLine();

        while (numeroPieza.trim().isEmpty()) {
            System.out.print("No puede estar vacio. Ingrese el numero de pieza: ");
            numeroPieza = entrada.nextLine();
        }

        System.out.print("Ingrese la descripcion: ");
        descripcion = entrada.nextLine();

        // Repite la solicitud mientras el texto esté vacío o contenga solo espacios.
        while (descripcion.trim().isEmpty()) {
            System.out.print("La descripcion no puede estar vacia. Ingrese nuevamente: ");
            descripcion = entrada.nextLine();
        }

        System.out.print("Ingrese la cantidad: ");

        // Lee una cantidad entera ingresada por el usuario.
        cantidad = entrada.nextInt();

        while (cantidad <= 0) {
            System.out.print("Cantidad invalida. Ingrese una cantidad positiva: ");
            cantidad = entrada.nextInt();
        }

        System.out.print("Ingrese el precio por articulo: ");
        precio = entrada.nextDouble();

        while (precio <= 0) {
            System.out.print("Precio invalido. Ingrese un precio positivo: ");
            precio = entrada.nextDouble();
        }

        // Crea un objeto Factura y le envía los datos ingresados.
        Factura factura = new Factura(
                numeroPieza, descripcion, cantidad, precio
        );

        factura.mostrarFactura();

        // Cierra el objeto Scanner cuando ya no se necesitan más entradas.
        entrada.close();
    }
}
