package frecuencia;

public class FrecuenciaCardiaca {
    private String nombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;
    private int anioActual;

    public FrecuenciaCardiaca(String nombre, String apellido, int mesNacimiento, int diaNacimiento, int anioNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.anioActual = anioActual;
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

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int calcularEdad() {
        int anioActual = 2026;
        return anioActual - getAnioNacimiento();
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public double calcularFrecuenciaMinimaEsperada() {
        return calcularFrecuenciaMaxima() * 0.50;
    }

    public double calcularFrecuenciaMaximaEsperada() {
        return calcularFrecuenciaMaxima() * 0.85;
    }

    public void mostrarFrecuencias() {
        System.out.println("\nFRECUENCIAS CARDIACAS");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Fecha de nacimiento: " + getMesNacimiento() + "/" + getDiaNacimiento() + "/" + getAnioNacimiento());
        System.out.println("Edad: " + calcularEdad() + " anios");
        System.out.println("Frecuencia cardiaca maxima: " + calcularFrecuenciaMaxima() + " ppm");
        System.out.println("Frecuencia minima esperada: " + calcularFrecuenciaMinimaEsperada() + " ppm");
        System.out.println("Frecuencia maxima esperada: " + calcularFrecuenciaMaximaEsperada() + " ppm");
    }

}
