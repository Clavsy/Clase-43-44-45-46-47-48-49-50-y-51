/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosextra4;

import Entidades.Alumno;
import Entidades.Simulador;
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
        sim.asignarAlumnos(alumnos);
        sim.imprimir(alumnos);
        
        
        
    }   
}
