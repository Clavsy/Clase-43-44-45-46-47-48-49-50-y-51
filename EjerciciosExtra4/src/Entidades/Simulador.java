package Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Simulador {

    public List<Alumno> generarAlumnos() {
        //String[] nombres = {"Lucas", "Joaquin", "Tobias", " Paula", "Caro", "Nahuel", "Gabriela", "Yazmin", "Gaston", "Victor"};
        List<String> nombres = Arrays.asList("Lucas", "Joaquin", "Tobias", " Paula", "Caro", "Nahuel", "Gabriela", "Yazmin", "Gaston", "Victor");
        List<String> apellidos = Arrays.asList("R", "E", "C", "P", "M", "B", "F", "S", "M", "PP");

        List<Alumno> alumnos = new ArrayList();

        for (int i = 0; i < 10; i++) {
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

    public void imprimirDatos(List<Alumno> alumnos) {
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("Alumno #" + (i + 1));
            System.out.println("Nombre: " + alumnos.get(i).getNombre());
            System.out.println("DNI: " + alumnos.get(i).getDni());
            System.out.println(" ");
        }
    }

    public void votacion(List<Alumno> alumnos, List<Voto> votos) {
        for (int i = 0; i < alumnos.size(); i++) {
            Voto voto = new Voto();
            HashSet<Alumno> votados = new HashSet();
            do {
                int num = generarNum(0, alumnos.size());
                while (num == i) {
                    num = (generarNum(0, alumnos.size()));
                }
                votados.add(alumnos.get(num));
                alumnos.get(num).setVotos(alumnos.get(num).getVotos() + 1);
            } while (votados.size() < 3);
            voto.setAlumno(alumnos.get(i));
            voto.setVotantes(votados);
            votos.add(voto);
        }
    }

    public void mostrarVotos(List<Voto> votos) {

        for (int i = 0; i < votos.size(); i++) {
            System.out.println("Alumno #" + (i + 1));
            System.out.println("Nombre: " + votos.get(i).getAlumno().getNombre());
            System.out.println("Votos recibidos: " + votos.get(i).getAlumno().getVotos());
            System.out.println("Alumnos a los que voto:");
            votos.get(i).getVotantes().forEach(aux -> {
                System.out.println(aux.getNombre());
            });
            System.out.println(" ");
        }
    }

    public void recuentoVotos(List<Alumno> alumnos) {
        int votos = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            votos = votos + alumnos.get(i).getVotos();
        }
        System.out.println("Los alumnos en total se votaron " + votos + " veces.");
    }

    public void mostrarFacilitadores(List<Alumno> alumnos){
        alumnos.sort(Alumno.compararVotos);
        System.out.println("Los facilitadores seran: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(alumnos.get(i).getNombre());
        }
        System.out.println("Los facilitadores suplentes seran: ");
        for (int i = 5; i < 10; i++) {
            System.out.println(alumnos.get(i).getNombre());
        }
    }

    public static int generarNum(int minimo, int maximo) {
        int num = (int) (Math.random() * (maximo - (minimo)) + (minimo));
        return num;
    }
}
