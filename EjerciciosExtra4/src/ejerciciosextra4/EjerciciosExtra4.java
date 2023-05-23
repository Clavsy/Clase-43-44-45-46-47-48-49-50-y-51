/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosextra4;

import Entidades.Alumno;
import Entidades.Simulador;
import Entidades.Voto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author clavs
 */
public class EjerciciosExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Simulador sim = new Simulador();
        List<Alumno> alumnos = sim.generarAlumnos();
        List<Voto> votos = new ArrayList();
        sim.asignarAlumnos(alumnos);
        sim.imprimirDatos(alumnos);
        System.out.println(" ");
        System.out.println(" ");
        sim.votacion(alumnos, votos);
        sim.mostrarVotos(votos);
        System.out.println(" ");
        System.out.println(" ");
        sim.recuentoVotos(alumnos);
        System.out.println(" ");
        System.out.println(" ");
        sim.mostrarFacilitadores(alumnos);
    }
}
