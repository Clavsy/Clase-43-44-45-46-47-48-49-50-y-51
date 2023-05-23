package Entidades;

import java.util.Comparator;

public class Alumno {

    private String nombre;

    private String dni;

    private int votos;

    public Alumno() {
    }

    public Alumno(String nombre, String dni, int votos) {
        this.nombre = nombre;
        this.dni = dni;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public static Comparator<Alumno> compararVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno a1, Alumno a2) {
            return Integer.compare(a2.getVotos(), a1.getVotos());
        }
    };
}
