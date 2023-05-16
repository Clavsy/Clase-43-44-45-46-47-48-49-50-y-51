/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicioclase2;

import Entities.Equipo;
import Entities.Jugador;
import java.util.ArrayList;

/**
 *
 * @author clavs
 */
public class EjercicioClase2 {

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        Jugador jugador3 = new Jugador();
        Jugador jugador4 = new Jugador();
        Equipo familiaRego = new Equipo();
        ArrayList<Jugador> jugadores = new ArrayList();

        jugador1.setApellido("Rego");
        jugador1.setNombre("Joaquin");
        jugador1.setNumero(5);
        jugador1.setPosicion("Delantero");
        jugadores.add(jugador1);

        jugador2.setApellido("Rego");
        jugador2.setNombre("Juan");
        jugador2.setNumero(6);
        jugador2.setPosicion("Mediocampista");
        jugadores.add(jugador2);

        jugador3.setApellido("Rego");
        jugador3.setNombre("Roberto");
        jugador3.setNumero(8);
        jugador3.setPosicion("Arquero");
        jugadores.add(jugador3);

        jugador4.setApellido("Curatti");
        jugador4.setNombre("Mariela");
        jugador4.setNumero(4);
        jugador4.setPosicion("Defensora");
        jugadores.add(jugador4);
        
        familiaRego.setJugadores(jugadores);
        
        ArrayList<Jugador> equipoNasty = new ArrayList(familiaRego.getJugadores());
        
        for (int i = 0; i < equipoNasty.size(); i++) {
            Jugador integrante = equipoNasty.get(i);
            System.out.println("Jugador #" + (i+1));
            System.out.println("Nombre: " + integrante.getNombre());
            System.out.println("Apellido: " + integrante.getApellido());
            System.out.println("Numero: " + integrante.getNumero());
            System.out.println("Posicion: " + integrante.getPosicion());
            System.out.println(" ");
        }
    }
}
