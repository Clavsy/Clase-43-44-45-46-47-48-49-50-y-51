package Entidades;


import java.util.HashSet;

public class Voto {

    private Alumno alumno;

    private HashSet<Alumno> votantes;

    public Voto() {
    }

    public Voto(Alumno alumno, HashSet<Alumno> votantes) {
        this.alumno = alumno;
        this.votantes = votantes;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumno> getVotantes() {
        return votantes;
    }

    public void setVotantes(HashSet<Alumno> votantes) {
        this.votantes = votantes;
    }

   
}
