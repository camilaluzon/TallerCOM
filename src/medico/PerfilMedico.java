package medico;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double altura;
    private double peso;


    public PerfilMedico(String nombre, String apellido, String sexo, int diaNacimiento, int mesNacimiento,
                        int anioNacimiento, double altura, double peso) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        setAltura(altura);
        setPeso(peso);
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

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public double getPeso() {
        return peso;
    }

    public int calcularEdad(int diaActual, int mesActual, int anioActual) {

        int edad = anioActual - getAnioNacimiento();

        if (mesActual < getMesNacimiento()
                || (mesActual == getMesNacimiento()
                && diaActual < getDiaNacimiento())) {
            edad--;
        }

        return edad;
    }

    public int calcularFrecuenciaMaxima(int edad) {
        return 220 - edad;
    }

    public double calcularFrecuenciaMinimaEsperada(int edad) {
        return calcularFrecuenciaMaxima(edad) * 0.50;
    }

    public double calcularFrecuenciaMaximaEsperada(int edad) {
        return calcularFrecuenciaMaxima(edad) * 0.85;
    }

    public double calcularIMC() {
        double alturaMetros = getAltura() / 100;
        return getPeso() / (alturaMetros * alturaMetros);
    }

    public String obtenerClasificacionIMC() {

        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    public void mostrarPerfilMedico(int diaActual, int mesActual, int anioActual) {

        int edad = calcularEdad(diaActual, mesActual, anioActual);

        System.out.println("\nPERFIL MEDICO");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Sexo: " + getSexo());

        System.out.println("Fecha de nacimiento: " + getDiaNacimiento() + "/" + getMesNacimiento() + "/" + getAnioNacimiento());
        System.out.println("Altura: " + getAltura() + " cm");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Edad: " + edad + " anios");

        System.out.println("\nVALORES DEL IMC");
        System.out.println("IMC: " + (Math.round(calcularIMC() * 100.0) / 100.0));
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obesidad: 30 o mas");
        System.out.println("Clasificacion: " + obtenerClasificacionIMC());

        System.out.println("Frecuencia cardiaca maxima: " + calcularFrecuenciaMaxima(edad) + " ppm");
        System.out.println("Frecuencia minima esperada: " + (Math.round(calcularFrecuenciaMinimaEsperada(edad) * 100.0) / 100.0) + " ppm");
        System.out.println("Frecuencia maxima esperada: " + (Math.round(calcularFrecuenciaMaximaEsperada(edad) * 100.0) / 100.0) + " ppm");
    }

}
