package Entidades;


import java.util.List;

public class Cliente {

    private String nombreCompleto;

    private String mail;

    private long dni;

    private String domicilio;

    private long cel;

    private List<Vehiculo> vehiculos;

    public Cliente() {
    }

    public Cliente(String nombreCompleto, String mail, long dni, String domicilio, long cel, List<Vehiculo> vehiculos) {
        this.nombreCompleto = nombreCompleto;
        this.mail = mail;
        this.dni = dni;
        this.domicilio = domicilio;
        this.cel = cel;
        this.vehiculos = vehiculos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getCel() {
        return cel;
    }

    public void setCel(long cel) {
        this.cel = cel;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Nombre completo = " + nombreCompleto + ", Mail = " + mail + ", DNI = " + dni + ", Domicilio = " + domicilio + ", Celular = " + cel + ", Vehiculos = " + vehiculos;
    }
    
    
}
