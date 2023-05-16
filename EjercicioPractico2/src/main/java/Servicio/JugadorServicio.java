/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Jugador;
import Entidad.Revolver;

/**
 *
 * @author clavs
 */
public class JugadorServicio {
    
    public boolean disparo(Revolver rev, RevolverServicio revServ, Jugador jugador){
        
        boolean muerto = false;
        if(revServ.disparar(rev)){
            muerto = true;
            jugador.setVivo(false);
        }
        
        revServ.siguienteDisparo(rev);
        
        return muerto;
    }
}
