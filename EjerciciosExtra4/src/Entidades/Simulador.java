package Entidades;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Simulador {

    public List<Alumno> generarAlumnos() {
        //String[] nombres = {"Lucas", "Joaquin", "Tobias", " Paula", "Caro", "Nahuel", "Gabriela", "Yazmin", "Gaston", "Victor"};
        List<String> nombres = new ArrayList();
        nombres = Arrays.asList("Lucas", "Joaquin", "Tobias", " Paula", "Caro", "Nahuel", "Gabriela", "Yazmin", "Gaston", "Victor");
        List<String> apellidos = new ArrayList();
        apellidos = Arrays.asList("R", "E", "C", "P", "M", "B", "F", "S", "M", "PP");

        List<Alumno> alumnos = new ArrayList();

        for (int i = 0; i < 6; i++) {
            Alumno alumno = new Alumno();
            alumno.setNombre(nombres.get(generarNum(0, 9)) + " " + apellidos.get(generarNum(0, 9)));
            alumnos.add(alumno);
        }

        return alumnos;
    }

    public String generarDNI() {

        long num = generarNum(10000000, 50000000);
        
        String dni = "" + num;
        
        return dni;
    }

    public List<Alumno> asignarAlumnos(List<Alumno> alumnos) {
        
        for (int i = 0; i < alumnos.size(); i++) {
            alumnos.get(i).setDni(generarDNI());
        }
        
        return alumnos;
    }

    public void imprimir(List<Alumno> alumnos) {
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("Alumno #" + (i+1));
            System.out.println("Nombre: " + alumnos.get(i).getNombre());
            System.out.println("DNI: " + alumnos.get(i).getDni());
        }
    }

    public void votacion(List<Alumno> alumnos, List<Voto> votos) {
        for (int i = 0; i < alumnos.size(); i++) {
            Voto voto = new Voto();
            HashSet<Alumno> votados = new HashSet();
            for (int j = 0; j < 3; j++) {
                int num = generarNum(0, alumnos.size());
                while(num == i){
                    num = (generarNum(0, alumnos.size()));
                }
                votados.add(alumnos.get(num));
            }
            voto.setAlumno(alumnos.get(i));
            voto.setVotantes(votados);
        }
    }

    public void mostrarAlumno(List<Alumno> alumnos, List<Voto> votos) {
    }

    public void recuentoVotos(List<Alumno> alumnos) {
    }

    public void mostrarFacilitadores(List<Alumno> alumnos) {
    }

    public static int generarNum(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }
}
