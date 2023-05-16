/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopractico2;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import Servicio.JuegoServicio;
import Servicio.JugadorServicio;
import Servicio.RevolverServicio;

/**
 *
 * @author clavs
 */
public class EjercicioPractico2 {

    public static void main(String[] args) {
        
        Revolver rev = new Revolver();
        RevolverServicio revServ = new RevolverServicio();
        JugadorServicio jugServ = new JugadorServicio();
        Juego juego = new Juego();
        JuegoServicio juegServ = new JuegoServicio();
        
        juegServ.ronda(revServ, rev, jugServ, juego);
    }
}
