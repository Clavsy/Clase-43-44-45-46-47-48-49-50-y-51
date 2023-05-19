package Entidades;

public class Vehiculo {

    private String marca;

    private String modelo;

    private int year;

    private int numeroMotor;

    private String chasis;

    private String color;

    private String tipo;

    private Poliza poliza;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int year, int numeroMotor, String chasis, String color, String tipo, Poliza poliza) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.poliza = poliza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    @Override
    public String toString() {
        return "Marca = " + marca + ", Modelo = " + modelo + ", Año = " + year + ", Numero de motor = " + numeroMotor + ", Chasis = " + chasis + ", Color = " + color + ", Tipo = " + tipo + ", Poliza = " + poliza;
    }
    
    
}
