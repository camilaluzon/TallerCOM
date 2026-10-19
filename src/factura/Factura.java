package factura;

public class Factura {

    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(String numeroPieza, String descripcion, int cantidad, double precio) {

        this.numeroPieza = numeroPieza;
        this.descripcion = descripcion;
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Verifica que la cantidad sea positiva; si no, asigna cero.
    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    public double getPrecio() {
        return precio;
    }

    // Calcula y devuelve el monto total de la factura.
    // Multiplica la cantidad de artículos por el precio de cada uno.
    public double obtenerMontoFactura() {
        return cantidad * precio;
    }

    public void mostrarFactura() {
        System.out.println(" FACTURA ");
        System.out.println("Numero de pieza: " + getNumeroPieza());
        System.out.println("Descripcion: " + getDescripcion());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Precio por articulo: $" + getPrecio());
        System.out.println("Monto total: $" + obtenerMontoFactura());
    }

}
