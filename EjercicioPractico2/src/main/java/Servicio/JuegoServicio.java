/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class JuegoServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver rev){
        Juego juego = new Juego();
        juego.setJugadores(jugadores);
        juego.setRev(rev);
    }
    
    public void ronda(RevolverServicio revServ, Revolver rev, JugadorServicio jugServ, Juego juego){
        
        Jugador j1 = new Jugador(1, "Kurt", true);
        Jugador j2 = new Jugador(2, "Joaquin", true);
        Jugador j3 = new Jugador(3, "Juan", true);
        Jugador j4 = new Jugador(4, "Carlos", true);
        Jugador j5 = new Jugador(5, "Brenda", true);
        Jugador j6 = new Jugador(6, "Lucas", true);
        Juego entrada = new Juego();
        ArrayList<Jugador> j = entrada.getJugadores();
        j.add(j1);
        j.add(j2);
        j.add(j3);
        j.add(j4);
        j.add(j5);
        j.add(j6);
        entrada.setJugadores(juego.getJugadores());
        
        llenarJuego(juego.getJugadores(), rev);
        
        revServ.llenarRevolver(rev); 
        int contador = 0;
        Jugador player;
        System.out.println("Comienza el juego O_o !!!");
        do{
            System.out.println("Juega el Jugador " + j.get(contador).getNombre() + " #" + j.get(contador).getId());
            player = j.get(contador);
            contador++;
            revServ.info(rev);
            leer.nextLine();
        }while(!jugServ.disparo(rev, revServ, player));
        
        
    }
}
