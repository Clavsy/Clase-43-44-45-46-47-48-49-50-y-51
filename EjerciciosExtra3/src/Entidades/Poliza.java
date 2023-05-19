package Entidades;

import java.util.List;

public class Poliza {

    private int numero;

    private String fechaInicio;

    private String fechaFinal;

    private List<Cuota> cantidadCuotas;

    private String formaPago;

    private int montoTotal;

    private boolean granizo;

    private int granizoMax;

    private String cobertura;

    public Poliza() {
    }

    public Poliza(List<Cuota> cantidadCuotas) {
        this.numero = (int) (Math.random() * 899 + 100);
        this.fechaInicio = "19/05/2023";
        this.fechaFinal = "19/05/2025";
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = "Transferencia";
        this.montoTotal = 240000;
        this.granizo = true;
        this.granizoMax = 70000;
        this.cobertura = "total";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public List<Cuota> getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(List<Cuota> cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getGranizoMax() {
        return granizoMax;
    }

    public void setGranizoMax(int granizoMax) {
        this.granizoMax = granizoMax;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "Numero = " + numero + ", Fecha de Inicio = " + fechaInicio + ", Fecha Final = " + fechaFinal + ", Cantidad de cuotas = " + cantidadCuotas + ", Forma de pago = " + formaPago + ", Monto Total = " + montoTotal + ", Tiene granizo? = " + granizo + ", Monto maximo de granizo = " + granizoMax + ", Tipo de cobertura = " + cobertura;
    }
    
    
}
