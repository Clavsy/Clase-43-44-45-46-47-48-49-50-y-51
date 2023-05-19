package Entidades;

public class Cuota {

    private int numero;

    private int monto;

    private boolean pagada;

    private String vencimiento;

    private String formaPago;

    public Cuota() {
        this.numero = (int) (Math.random() * 23 + 1);
        this.monto = 10000;
        this.pagada = true;
        this.vencimiento = "19/06/2023";
        this.formaPago = "Transferencia";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Numero = " + numero + ", Monto = " + monto + ", Cuota pagada? = " + pagada + ", Fecha de vencimiento = " + vencimiento + ", Forma de pago = " + formaPago;
    }
    
    
}
